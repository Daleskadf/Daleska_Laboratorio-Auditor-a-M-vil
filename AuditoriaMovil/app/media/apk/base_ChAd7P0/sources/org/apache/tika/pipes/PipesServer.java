package org.apache.tika.pipes;

import D.AbstractC0059i;
import S6.c;
import W6.h;
import androidx.datastore.preferences.protobuf.Y;
import g7.b;
import g7.d;
import j$.util.Optional;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.detect.Detector;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.extractor.BasicEmbeddedDocumentBytesHandler;
import org.apache.tika.extractor.EmbeddedDocumentByteStoreExtractorFactory;
import org.apache.tika.extractor.EmbeddedDocumentBytesHandler;
import org.apache.tika.extractor.EmbeddedDocumentExtractor;
import org.apache.tika.extractor.EmbeddedDocumentExtractorFactory;
import org.apache.tika.extractor.RUnpackExtractor;
import org.apache.tika.extractor.RUnpackExtractorFactory;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.metadata.filter.MetadataFilter;
import org.apache.tika.metadata.listfilter.MetadataListFilter;
import org.apache.tika.metadata.listfilter.NoOpListFilter;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.DigestingParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.RecursiveParserWrapper;
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.HandlerConfig;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.pipes.emitter.Emitter;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.emitter.StreamEmitter;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;
import org.apache.tika.pipes.extractor.EmittingEmbeddedDocumentBytesHandler;
import org.apache.tika.pipes.fetcher.Fetcher;
import org.apache.tika.pipes.fetcher.FetcherManager;
import org.apache.tika.utils.ExceptionUtils;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public class PipesServer implements Runnable {
    private static final b LOG = d.b(PipesServer.class);
    public static final int TIMEOUT_EXIT_CODE = 17;
    private Parser autoDetectParser;
    private Detector detector;
    private DigestingParser.Digester digester;
    private EmitterManager emitterManager;
    private FetcherManager fetcherManager;
    private final DataInputStream input;
    private final long maxForEmitBatchBytes;
    private final DataOutputStream output;
    private Parser rMetaParser;
    private final long serverParseTimeoutMillis;
    private final long serverWaitTimeoutMillis;
    private TikaConfig tikaConfig;
    private final Path tikaConfigPath;
    private final Object[] lock = new Object[0];
    private long checkForTimeoutMs = 1000;
    private volatile boolean parsing = false;
    private volatile long since = System.currentTimeMillis();

    /* loaded from: classes.dex */
    public static class MetadataListAndEmbeddedBytes {
        final Optional<EmbeddedDocumentBytesHandler> embeddedDocumentBytesHandler;
        List<Metadata> metadataList;

        public MetadataListAndEmbeddedBytes(List<Metadata> list, EmbeddedDocumentBytesHandler embeddedDocumentBytesHandler) {
            this.metadataList = list;
            this.embeddedDocumentBytesHandler = Optional.ofNullable(embeddedDocumentBytesHandler);
        }

        public void filter(MetadataListFilter metadataListFilter) {
            this.metadataList = metadataListFilter.filter(this.metadataList);
        }

        public EmbeddedDocumentBytesHandler getEmbeddedDocumentBytesHandler() {
            return this.embeddedDocumentBytesHandler.get();
        }

        public List<Metadata> getMetadataList() {
            return this.metadataList;
        }

        public boolean hasEmbeddedDocumentByteStore() {
            return this.embeddedDocumentBytesHandler.isPresent();
        }

        public boolean toBePackagedForStreamEmitter() {
            return !(this.embeddedDocumentBytesHandler.get() instanceof EmittingEmbeddedDocumentBytesHandler);
        }
    }

    /* loaded from: classes.dex */
    public enum STATUS {
        READY,
        CALL,
        PING,
        FAILED_TO_START,
        FETCHER_NOT_FOUND,
        EMITTER_NOT_FOUND,
        FETCHER_INITIALIZATION_EXCEPTION,
        FETCH_EXCEPTION,
        PARSE_SUCCESS,
        PARSE_EXCEPTION_NO_EMIT,
        EMIT_SUCCESS,
        EMIT_SUCCESS_PARSE_EXCEPTION,
        EMIT_EXCEPTION,
        OOM,
        TIMEOUT,
        EMPTY_OUTPUT,
        INTERMEDIATE_RESULT;

        public static STATUS lookup(int i7) {
            int i8 = i7 - 1;
            if (i8 >= 0) {
                STATUS[] values = values();
                if (i8 < values.length) {
                    return values[i8];
                }
                throw new IllegalArgumentException(AbstractC0059i.x("byte with index ", i8, values.length, " must be < "));
            }
            throw new IllegalArgumentException("byte must be > 0");
        }

        public byte getByte() {
            return (byte) (ordinal() + 1);
        }
    }

    public PipesServer(Path path, InputStream inputStream, PrintStream printStream, long j, long j8, long j9) {
        this.tikaConfigPath = path;
        this.input = new DataInputStream(inputStream);
        this.output = new DataOutputStream(printStream);
        this.maxForEmitBatchBytes = j;
        this.serverParseTimeoutMillis = j8;
        this.serverWaitTimeoutMillis = j9;
    }

    private void _preParse(FetchEmitTuple fetchEmitTuple, TikaInputStream tikaInputStream, Metadata metadata, ParseContext parseContext) {
        InputStream newInputStream;
        DigestingParser.Digester digester = this.digester;
        if (digester != null) {
            try {
                digester.digest(tikaInputStream, metadata, parseContext);
            } catch (IOException e7) {
                b bVar = LOG;
                String id = fetchEmitTuple.getId();
                bVar.g("problem digesting: " + id, e7);
            }
        }
        try {
            MediaType detect = this.detector.detect(tikaInputStream, metadata);
            metadata.set(HttpHeaders.CONTENT_TYPE, detect.toString());
            metadata.set(TikaCoreProperties.CONTENT_TYPE_PARSER_OVERRIDE, detect.toString());
        } catch (IOException e8) {
            b bVar2 = LOG;
            String id2 = fetchEmitTuple.getId();
            bVar2.g("problem detecting: " + id2, e8);
        }
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) parseContext.get(EmbeddedDocumentBytesConfig.class);
        if (embeddedDocumentBytesConfig != null && embeddedDocumentBytesConfig.isIncludeOriginal()) {
            EmbeddedDocumentBytesHandler embeddedDocumentBytesHandler = (EmbeddedDocumentBytesHandler) parseContext.get(EmbeddedDocumentBytesHandler.class);
            try {
                newInputStream = Files.newInputStream(tikaInputStream.getPath(), new OpenOption[0]);
                embeddedDocumentBytesHandler.add(0, metadata, newInputStream);
                if (newInputStream != null) {
                    newInputStream.close();
                }
            } catch (IOException e9) {
                LOG.g("problem reading source file into embedded document byte store", e9);
            }
        }
    }

    private void actuallyParse(FetchEmitTuple fetchEmitTuple) {
        MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes;
        long currentTimeMillis = System.currentTimeMillis();
        Fetcher fetcher = getFetcher(fetchEmitTuple);
        if (fetcher == null) {
            return;
        }
        b bVar = LOG;
        if (bVar.u()) {
            bVar.y("timer -- got fetcher: {}ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            metadataListAndEmbeddedBytes = parseFromTuple(fetchEmitTuple, fetcher);
            try {
                if (bVar.u()) {
                    bVar.y("timer -- to parse: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                }
                if (metadataListAndEmbeddedBytes != null && !metadataIsEmpty(metadataListAndEmbeddedBytes.getMetadataList())) {
                    emitParseData(fetchEmitTuple, metadataListAndEmbeddedBytes);
                    if (metadataListAndEmbeddedBytes.hasEmbeddedDocumentByteStore() && (metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler() instanceof Closeable)) {
                        try {
                            metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler().close();
                            return;
                        } catch (IOException e7) {
                            LOG.g("problem closing embedded document byte store", e7);
                            return;
                        }
                    }
                    return;
                }
                write(STATUS.EMPTY_OUTPUT);
                if (metadataListAndEmbeddedBytes != null && metadataListAndEmbeddedBytes.hasEmbeddedDocumentByteStore() && (metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler() instanceof Closeable)) {
                    try {
                        metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler().close();
                    } catch (IOException e8) {
                        LOG.g("problem closing embedded document byte store", e8);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (metadataListAndEmbeddedBytes != null && metadataListAndEmbeddedBytes.hasEmbeddedDocumentByteStore() && (metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler() instanceof Closeable)) {
                    try {
                        metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler().close();
                    } catch (IOException e9) {
                        LOG.g("problem closing embedded document byte store", e9);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            metadataListAndEmbeddedBytes = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void emit(java.lang.String r3, org.apache.tika.pipes.emitter.EmitKey r4, boolean r5, org.apache.tika.pipes.PipesServer.MetadataListAndEmbeddedBytes r6, java.lang.String r7, org.apache.tika.parser.ParseContext r8) {
        /*
            r2 = this;
            org.apache.tika.pipes.emitter.EmitterManager r0 = r2.emitterManager     // Catch: java.lang.IllegalArgumentException -> L54
            java.lang.String r1 = r4.getEmitterName()     // Catch: java.lang.IllegalArgumentException -> L54
            org.apache.tika.pipes.emitter.Emitter r3 = r0.getEmitter(r1)     // Catch: java.lang.IllegalArgumentException -> L54
            if (r5 == 0) goto L1a
            boolean r5 = r6.toBePackagedForStreamEmitter()     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
            if (r5 == 0) goto L1a
            r2.emitContentsAndBytes(r3, r4, r6)     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
            goto L25
        L16:
            r3 = move-exception
            goto L3d
        L18:
            r3 = move-exception
            goto L3d
        L1a:
            java.lang.String r4 = r4.getEmitKey()     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
            java.util.List r5 = r6.getMetadataList()     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
            r3.emit(r4, r5, r8)     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
        L25:
            boolean r3 = org.apache.tika.utils.StringUtils.isBlank(r7)
            if (r3 == 0) goto L31
            org.apache.tika.pipes.PipesServer$STATUS r3 = org.apache.tika.pipes.PipesServer.STATUS.EMIT_SUCCESS
            r2.write(r3)
            goto L3c
        L31:
            org.apache.tika.pipes.PipesServer$STATUS r3 = org.apache.tika.pipes.PipesServer.STATUS.EMIT_SUCCESS_PARSE_EXCEPTION
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r7.getBytes(r4)
            r2.write(r3, r4)
        L3c:
            return
        L3d:
            g7.b r4 = org.apache.tika.pipes.PipesServer.LOG
            java.lang.String r5 = "emit exception"
            r4.g(r5, r3)
            java.lang.String r3 = org.apache.tika.utils.ExceptionUtils.getStackTrace(r3)
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r4)
            org.apache.tika.pipes.PipesServer$STATUS r4 = org.apache.tika.pipes.PipesServer.STATUS.EMIT_EXCEPTION
            r2.write(r4, r3)
            return
        L54:
            java.lang.String r3 = r2.getNoEmitterMsg(r3)
            g7.b r4 = org.apache.tika.pipes.PipesServer.LOG
            r4.l(r3)
            org.apache.tika.pipes.PipesServer$STATUS r4 = org.apache.tika.pipes.PipesServer.STATUS.EMITTER_NOT_FOUND
            r2.write(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesServer.emit(java.lang.String, org.apache.tika.pipes.emitter.EmitKey, boolean, org.apache.tika.pipes.PipesServer$MetadataListAndEmbeddedBytes, java.lang.String, org.apache.tika.parser.ParseContext):void");
    }

    private void emitContentsAndBytes(Emitter emitter, EmitKey emitKey, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) {
        if (!(emitter instanceof StreamEmitter)) {
            Class<?> cls = emitter.getClass();
            throw new IllegalArgumentException("The emitter for embedded document byte store must be a StreamEmitter. I see: " + cls);
        }
        throw new UnsupportedOperationException("this is not yet implemented");
    }

    private void emitParseData(FetchEmitTuple fetchEmitTuple, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) {
        EmitKey emitKey;
        long currentTimeMillis = System.currentTimeMillis();
        String containerStacktrace = getContainerStacktrace(fetchEmitTuple, metadataListAndEmbeddedBytes.getMetadataList());
        filterMetadata(fetchEmitTuple, metadataListAndEmbeddedBytes.getMetadataList());
        filterMetadataList(fetchEmitTuple, metadataListAndEmbeddedBytes);
        ParseContext parseContext = fetchEmitTuple.getParseContext();
        FetchEmitTuple.ON_PARSE_EXCEPTION onParseException = fetchEmitTuple.getOnParseException();
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) parseContext.get(EmbeddedDocumentBytesConfig.class);
        if (!StringUtils.isBlank(containerStacktrace) && onParseException != FetchEmitTuple.ON_PARSE_EXCEPTION.EMIT) {
            write(STATUS.PARSE_EXCEPTION_NO_EMIT, containerStacktrace);
            return;
        }
        injectUserMetadata(fetchEmitTuple.getMetadata(), metadataListAndEmbeddedBytes.getMetadataList());
        EmitKey emitKey2 = fetchEmitTuple.getEmitKey();
        if (StringUtils.isBlank(emitKey2.getEmitKey())) {
            EmitKey emitKey3 = new EmitKey(emitKey2.getEmitterName(), fetchEmitTuple.getFetchKey().getFetchKey());
            fetchEmitTuple.setEmitKey(emitKey3);
            emitKey = emitKey3;
        } else {
            emitKey = emitKey2;
        }
        EmitData emitData = new EmitData(fetchEmitTuple.getEmitKey(), metadataListAndEmbeddedBytes.getMetadataList(), containerStacktrace);
        if (embeddedDocumentBytesConfig.isExtractEmbeddedDocumentBytes() && metadataListAndEmbeddedBytes.toBePackagedForStreamEmitter()) {
            emit(fetchEmitTuple.getId(), emitKey, embeddedDocumentBytesConfig.isExtractEmbeddedDocumentBytes(), metadataListAndEmbeddedBytes, containerStacktrace, parseContext);
        } else if (this.maxForEmitBatchBytes >= 0 && emitData.getEstimatedSizeBytes() >= this.maxForEmitBatchBytes) {
            emit(fetchEmitTuple.getId(), emitKey, embeddedDocumentBytesConfig.isExtractEmbeddedDocumentBytes(), metadataListAndEmbeddedBytes, containerStacktrace, parseContext);
        } else {
            write(emitData);
        }
        b bVar = LOG;
        if (bVar.u()) {
            bVar.y("timer -- emitted: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    private void exit(int i7) {
        if (i7 != 0) {
            LOG.a("exiting: {}", Integer.valueOf(i7));
        } else {
            LOG.x(Integer.valueOf(i7), "exiting: {}");
        }
        System.exit(i7);
    }

    private void filterMetadata(FetchEmitTuple fetchEmitTuple, List<Metadata> list) {
        MetadataFilter metadataFilter = (MetadataFilter) fetchEmitTuple.getParseContext().get(MetadataFilter.class);
        if (metadataFilter == null) {
            metadataFilter = this.tikaConfig.getMetadataFilter();
        }
        for (Metadata metadata : list) {
            try {
                metadataFilter.filter(metadata);
            } catch (TikaException e7) {
                LOG.g("failed to filter metadata", e7);
            }
        }
    }

    private void filterMetadataList(FetchEmitTuple fetchEmitTuple, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) {
        MetadataListFilter metadataListFilter = (MetadataListFilter) fetchEmitTuple.getParseContext().get(MetadataListFilter.class);
        if (metadataListFilter == null) {
            metadataListFilter = this.tikaConfig.getMetadataListFilter();
        }
        if (metadataListFilter instanceof NoOpListFilter) {
            return;
        }
        try {
            metadataListAndEmbeddedBytes.filter(metadataListFilter);
        } catch (TikaException e7) {
            LOG.g("failed to filter metadata list", e7);
        }
    }

    private String getContainerStacktrace(FetchEmitTuple fetchEmitTuple, List<Metadata> list) {
        String str;
        if (metadataIsEmpty(list) || (str = list.get(0).get(TikaCoreProperties.CONTAINER_EXCEPTION)) == null) {
            return StringUtils.EMPTY;
        }
        return str;
    }

    private Fetcher getFetcher(FetchEmitTuple fetchEmitTuple) {
        try {
            return this.fetcherManager.getFetcher(fetchEmitTuple.getFetchKey().getFetcherName());
        } catch (IOException e7) {
            e = e7;
            b bVar = LOG;
            String id = fetchEmitTuple.getId();
            bVar.g("Couldn't initialize fetcher for fetch id '" + id + "'", e);
            write(STATUS.FETCHER_INITIALIZATION_EXCEPTION, ExceptionUtils.getStackTrace(e));
            return null;
        } catch (IllegalArgumentException unused) {
            String noFetcherMsg = getNoFetcherMsg(fetchEmitTuple.getFetchKey().getFetcherName());
            LOG.l(noFetcherMsg);
            write(STATUS.FETCHER_NOT_FOUND, noFetcherMsg);
            return null;
        } catch (TikaException e8) {
            e = e8;
            b bVar2 = LOG;
            String id2 = fetchEmitTuple.getId();
            bVar2.g("Couldn't initialize fetcher for fetch id '" + id2 + "'", e);
            write(STATUS.FETCHER_INITIALIZATION_EXCEPTION, ExceptionUtils.getStackTrace(e));
            return null;
        }
    }

    private String getNoEmitterMsg(String str) {
        StringBuilder m7 = Y.m("Emitter '", str, "' not found.\nThe configured emitterManager supports:");
        int i7 = 0;
        for (String str2 : this.emitterManager.getSupported()) {
            int i8 = i7 + 1;
            if (i7 > 0) {
                m7.append(", ");
            }
            m7.append(str2);
            i7 = i8;
        }
        return m7.toString();
    }

    private String getNoFetcherMsg(String str) {
        StringBuilder m7 = Y.m("Fetcher '", str, "' not found.\nThe configured FetcherManager supports:");
        int i7 = 0;
        for (String str2 : this.fetcherManager.getSupported()) {
            int i8 = i7 + 1;
            if (i7 > 0) {
                m7.append(", ");
            }
            m7.append(str2);
            i7 = i8;
        }
        return m7.toString();
    }

    private void handleOOM(String str, OutOfMemoryError outOfMemoryError) {
        write(STATUS.OOM);
        b bVar = LOG;
        bVar.j("oom: " + str, outOfMemoryError);
        exit(1);
    }

    private void injectUserMetadata(Metadata metadata, List<Metadata> list) {
        String[] names;
        for (String str : metadata.names()) {
            list.get(0).set(str, (String) null);
            for (String str2 : metadata.getValues(str)) {
                list.get(0).add(str, str2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [W6.g, T6.d] */
    public static void main(String[] strArr) {
        Path path;
        try {
            path = Paths.get(strArr[0], new String[0]);
            PipesServer pipesServer = new PipesServer(path, System.in, System.out, Long.parseLong(strArr[1]), Long.parseLong(strArr[2]), Long.parseLong(strArr[3]));
            int i7 = h.f6230e;
            ?? dVar = new T6.d();
            dVar.M(new byte[0]);
            System.setIn(dVar.L());
            System.setOut(System.err);
            Thread thread = new Thread(pipesServer, "Tika Watchdog");
            thread.setDaemon(true);
            thread.start();
            pipesServer.processRequests();
        } finally {
            LOG.k("server shutting down");
        }
    }

    private boolean metadataIsEmpty(List<Metadata> list) {
        if (list != null && list.size() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
        if (r14.u() == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
        r14.y("timer -- parse only time: {} ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e1, code lost:
        if (r14.u() == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0111, code lost:
        if (r14.u() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<org.apache.tika.metadata.Metadata> parseConcatenated(org.apache.tika.pipes.FetchEmitTuple r10, org.apache.tika.pipes.HandlerConfig r11, java.io.InputStream r12, org.apache.tika.metadata.Metadata r13, org.apache.tika.parser.ParseContext r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesServer.parseConcatenated(org.apache.tika.pipes.FetchEmitTuple, org.apache.tika.pipes.HandlerConfig, java.io.InputStream, org.apache.tika.metadata.Metadata, org.apache.tika.parser.ParseContext):java.util.List");
    }

    private void parseOne() {
        synchronized (this.lock) {
            this.parsing = true;
            this.since = System.currentTimeMillis();
        }
        FetchEmitTuple fetchEmitTuple = null;
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                fetchEmitTuple = readFetchEmitTuple();
                b bVar = LOG;
                if (bVar.u()) {
                    bVar.y("timer -- read fetchEmitTuple: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                actuallyParse(fetchEmitTuple);
                if (bVar.u()) {
                    bVar.y("timer -- actually parsed: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                }
                synchronized (this.lock) {
                    this.parsing = false;
                    this.since = System.currentTimeMillis();
                }
            } catch (OutOfMemoryError e7) {
                handleOOM(fetchEmitTuple.getId(), e7);
                synchronized (this.lock) {
                    this.parsing = false;
                    this.since = System.currentTimeMillis();
                }
            }
        } catch (Throwable th) {
            synchronized (this.lock) {
                this.parsing = false;
                this.since = System.currentTimeMillis();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r13.u() == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        r13.y("timer -- parse only time: {} ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
        if (r13.u() == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
        if (r13.u() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<org.apache.tika.metadata.Metadata> parseRecursive(org.apache.tika.pipes.FetchEmitTuple r11, org.apache.tika.pipes.HandlerConfig r12, java.io.InputStream r13, org.apache.tika.metadata.Metadata r14, org.apache.tika.parser.ParseContext r15) {
        /*
            r10 = this;
            java.lang.String r0 = "timer -- parse only time: {} ms"
            java.lang.String r1 = "sax problem:"
            java.lang.String r2 = "encrypted document:"
            java.lang.String r3 = "security exception:"
            java.lang.String r4 = "parse exception: "
            org.apache.tika.sax.RecursiveParserWrapperHandler r5 = new org.apache.tika.sax.RecursiveParserWrapperHandler
            org.apache.tika.sax.BasicContentHandlerFactory r6 = new org.apache.tika.sax.BasicContentHandlerFactory
            org.apache.tika.sax.BasicContentHandlerFactory$HANDLER_TYPE r7 = r12.getType()
            int r8 = r12.getWriteLimit()
            boolean r9 = r12.isThrowOnWriteLimitReached()
            r6.<init>(r7, r8, r9, r15)
            int r12 = r12.getMaxEmbeddedResources()
            r5.<init>(r6, r12)
            long r6 = java.lang.System.currentTimeMillis()
            r10.preParse(r11, r13, r14, r15)
            org.apache.tika.parser.Parser r12 = r10.rMetaParser     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49 java.lang.SecurityException -> L4b org.apache.tika.exception.EncryptedDocumentException -> L4d org.xml.sax.SAXException -> L4f
            r12.parse(r13, r5, r14, r15)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49 java.lang.SecurityException -> L4b org.apache.tika.exception.EncryptedDocumentException -> L4d org.xml.sax.SAXException -> L4f
            g7.b r11 = org.apache.tika.pipes.PipesServer.LOG
            boolean r12 = r11.u()
            if (r12 == 0) goto Lc7
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r6
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r11.y(r0, r12)
            goto Lc7
        L46:
            r11 = move-exception
            goto Lcc
        L49:
            r12 = move-exception
            goto L51
        L4b:
            r12 = move-exception
            goto L79
        L4d:
            r12 = move-exception
            goto L8f
        L4f:
            r12 = move-exception
            goto Lab
        L51:
            g7.b r13 = org.apache.tika.pipes.PipesServer.LOG     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r11.getId()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r14.<init>(r4)     // Catch: java.lang.Throwable -> L46
            r14.append(r11)     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r14.toString()     // Catch: java.lang.Throwable -> L46
            r13.g(r11, r12)     // Catch: java.lang.Throwable -> L46
            boolean r11 = r13.u()
            if (r11 == 0) goto Lc7
        L6c:
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r6
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.y(r0, r11)
            goto Lc7
        L79:
            g7.b r13 = org.apache.tika.pipes.PipesServer.LOG     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r11.getId()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r14.<init>(r3)     // Catch: java.lang.Throwable -> L46
            r14.append(r11)     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r14.toString()     // Catch: java.lang.Throwable -> L46
            r13.g(r11, r12)     // Catch: java.lang.Throwable -> L46
            throw r12     // Catch: java.lang.Throwable -> L46
        L8f:
            g7.b r13 = org.apache.tika.pipes.PipesServer.LOG     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r11.getId()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r14.<init>(r2)     // Catch: java.lang.Throwable -> L46
            r14.append(r11)     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r14.toString()     // Catch: java.lang.Throwable -> L46
            r13.g(r11, r12)     // Catch: java.lang.Throwable -> L46
            boolean r11 = r13.u()
            if (r11 == 0) goto Lc7
            goto L6c
        Lab:
            g7.b r13 = org.apache.tika.pipes.PipesServer.LOG     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r11.getId()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r14.<init>(r1)     // Catch: java.lang.Throwable -> L46
            r14.append(r11)     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r14.toString()     // Catch: java.lang.Throwable -> L46
            r13.g(r11, r12)     // Catch: java.lang.Throwable -> L46
            boolean r11 = r13.u()
            if (r11 == 0) goto Lc7
            goto L6c
        Lc7:
            java.util.List r11 = r5.getMetadataList()
            return r11
        Lcc:
            g7.b r12 = org.apache.tika.pipes.PipesServer.LOG
            boolean r13 = r12.u()
            if (r13 == 0) goto Le0
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r6
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12.y(r0, r13)
        Le0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesServer.parseRecursive(org.apache.tika.pipes.FetchEmitTuple, org.apache.tika.pipes.HandlerConfig, java.io.InputStream, org.apache.tika.metadata.Metadata, org.apache.tika.parser.ParseContext):java.util.List");
    }

    private MetadataListAndEmbeddedBytes parseWithStream(FetchEmitTuple fetchEmitTuple, InputStream inputStream, Metadata metadata) {
        List<Metadata> parseConcatenated;
        ParseContext parseContext = setupParseContext(fetchEmitTuple);
        HandlerConfig handlerConfig = (HandlerConfig) parseContext.get(HandlerConfig.class);
        if (handlerConfig.getParseMode() == HandlerConfig.PARSE_MODE.RMETA) {
            parseConcatenated = parseRecursive(fetchEmitTuple, handlerConfig, inputStream, metadata, parseContext);
        } else {
            parseConcatenated = parseConcatenated(fetchEmitTuple, handlerConfig, inputStream, metadata, parseContext);
        }
        return new MetadataListAndEmbeddedBytes(parseConcatenated, (EmbeddedDocumentBytesHandler) parseContext.get(EmbeddedDocumentBytesHandler.class));
    }

    private void preParse(FetchEmitTuple fetchEmitTuple, InputStream inputStream, Metadata metadata, ParseContext parseContext) {
        try {
            TikaInputStream cast = TikaInputStream.cast(inputStream);
            if (cast == null) {
                cast = TikaInputStream.get(inputStream, (TemporaryResources) null, metadata);
            }
            _preParse(fetchEmitTuple, cast, metadata, parseContext);
            byte[] bArr = c.f5279a;
            writeIntermediate(fetchEmitTuple.getEmitKey(), metadata);
        } catch (Throwable th) {
            byte[] bArr2 = c.f5279a;
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [W6.g, T6.d] */
    private FetchEmitTuple readFetchEmitTuple() {
        try {
            byte[] bArr = new byte[this.input.readInt()];
            this.input.readFully(bArr);
            int i7 = h.f6230e;
            ?? dVar = new T6.d();
            dVar.M(bArr);
            ObjectInputStream objectInputStream = new ObjectInputStream(dVar.L());
            try {
                FetchEmitTuple fetchEmitTuple = (FetchEmitTuple) objectInputStream.readObject();
                objectInputStream.close();
                return fetchEmitTuple;
            } catch (Throwable th) {
                try {
                    objectInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e7) {
            LOG.j("problem reading tuple", e7);
            exit(1);
            return null;
        } catch (ClassNotFoundException e8) {
            LOG.j("can't find class?!", e8);
            exit(1);
            return null;
        }
    }

    private ParseContext setupParseContext(FetchEmitTuple fetchEmitTuple) {
        ParseContext parseContext = fetchEmitTuple.getParseContext();
        if (parseContext.get(HandlerConfig.class) == null) {
            parseContext.set(HandlerConfig.class, HandlerConfig.DEFAULT_HANDLER_CONFIG);
        }
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) parseContext.get(EmbeddedDocumentBytesConfig.class);
        if (embeddedDocumentBytesConfig == null) {
            parseContext.set(EmbeddedDocumentBytesConfig.class, EmbeddedDocumentBytesConfig.SKIP);
            return parseContext;
        }
        EmbeddedDocumentExtractorFactory embeddedDocumentExtractorFactory = ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getEmbeddedDocumentExtractorFactory();
        if (embeddedDocumentExtractorFactory == null) {
            parseContext.set(EmbeddedDocumentExtractor.class, new RUnpackExtractor(parseContext, RUnpackExtractorFactory.DEFAULT_MAX_EMBEDDED_BYTES_FOR_EXTRACTION));
        } else if (!(embeddedDocumentExtractorFactory instanceof EmbeddedDocumentByteStoreExtractorFactory)) {
            Class<?> cls = embeddedDocumentExtractorFactory.getClass();
            throw new TikaConfigException("EmbeddedDocumentExtractorFactory must be an instance of EmbeddedDocumentByteStoreExtractorFactory if you wantto extract embedded bytes! I see this embedded doc factory: " + cls + "and a request: " + embeddedDocumentBytesConfig);
        }
        if (!StringUtils.isBlank(embeddedDocumentBytesConfig.getEmitter())) {
            parseContext.set(EmbeddedDocumentBytesHandler.class, new EmittingEmbeddedDocumentBytesHandler(fetchEmitTuple, this.emitterManager));
        } else {
            parseContext.set(EmbeddedDocumentBytesHandler.class, new BasicEmbeddedDocumentBytesHandler(embeddedDocumentBytesConfig));
        }
        return parseContext;
    }

    private void write(EmitData emitData) {
        try {
            int i7 = X6.c.f;
            new T6.d();
            X6.c cVar = new X6.c();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(cVar);
            objectOutputStream.writeObject(emitData);
            objectOutputStream.close();
            write(STATUS.PARSE_SUCCESS, cVar.b());
        } catch (IOException e7) {
            LOG.j("problem writing emit data (forking process shutdown?)", e7);
            exit(1);
        }
    }

    private void writeIntermediate(EmitKey emitKey, Metadata metadata) {
        try {
            int i7 = X6.c.f;
            new T6.d();
            X6.c cVar = new X6.c();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(cVar);
            objectOutputStream.writeObject(metadata);
            objectOutputStream.close();
            write(STATUS.INTERMEDIATE_RESULT, cVar.b());
        } catch (IOException e7) {
            LOG.j("problem writing intermediate data (forking process shutdown?)", e7);
            exit(1);
        }
    }

    public void initializeResources() {
        this.tikaConfig = new TikaConfig(this.tikaConfigPath);
        this.fetcherManager = FetcherManager.load(this.tikaConfigPath);
        if (this.maxForEmitBatchBytes > -1) {
            this.emitterManager = EmitterManager.load(this.tikaConfigPath);
        } else {
            LOG.t("'maxForEmitBatchBytes' < 0. Not initializing emitters in PipesServer");
            this.emitterManager = null;
        }
        AutoDetectParser autoDetectParser = new AutoDetectParser(this.tikaConfig);
        this.autoDetectParser = autoDetectParser;
        if (autoDetectParser.getAutoDetectParserConfig().getDigesterFactory() != null) {
            this.digester = ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getDigesterFactory().build();
            ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getDigesterFactory().setSkipContainerDocument(true);
            if (((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getEmbeddedDocumentExtractorFactory() == null) {
                ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().setEmbeddedDocumentExtractorFactory(new RUnpackExtractorFactory());
            }
        }
        this.detector = ((AutoDetectParser) this.autoDetectParser).getDetector();
        this.rMetaParser = new RecursiveParserWrapper(this.autoDetectParser);
    }

    public MetadataListAndEmbeddedBytes parseFromTuple(FetchEmitTuple fetchEmitTuple, Fetcher fetcher) {
        Metadata metadata = new Metadata();
        try {
            InputStream fetch = fetcher.fetch(fetchEmitTuple.getFetchKey().getFetchKey(), metadata, fetchEmitTuple.getParseContext());
            try {
                MetadataListAndEmbeddedBytes parseWithStream = parseWithStream(fetchEmitTuple, fetch, metadata);
                if (fetch != null) {
                    fetch.close();
                }
                return parseWithStream;
            } catch (Throwable th) {
                if (fetch != null) {
                    try {
                        fetch.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            b bVar = LOG;
            String id = fetchEmitTuple.getId();
            bVar.g("fetch exception " + id, e);
            write(STATUS.FETCH_EXCEPTION, ExceptionUtils.getStackTrace(e));
            return null;
        } catch (SecurityException e8) {
            b bVar2 = LOG;
            String id2 = fetchEmitTuple.getId();
            bVar2.j("security exception " + id2, e8);
            throw e8;
        } catch (TikaException e9) {
            e = e9;
            b bVar3 = LOG;
            String id3 = fetchEmitTuple.getId();
            bVar3.g("fetch exception " + id3, e);
            write(STATUS.FETCH_EXCEPTION, ExceptionUtils.getStackTrace(e));
            return null;
        }
    }

    public void processRequests() {
        b bVar = LOG;
        bVar.t("processing requests");
        try {
            long currentTimeMillis = System.currentTimeMillis();
            initializeResources();
            if (bVar.u()) {
                bVar.y("timer -- initialize parser and other resources: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
            bVar.t("pipes server initialized");
            try {
                write(STATUS.READY);
                long currentTimeMillis2 = System.currentTimeMillis();
                while (true) {
                    int read = this.input.read();
                    if (read == -1) {
                        LOG.l("received -1 from client; shutting down");
                        exit(1);
                    } else {
                        STATUS status = STATUS.PING;
                        if (read == status.getByte()) {
                            b bVar2 = LOG;
                            if (bVar2.u()) {
                                bVar2.y("timer -- ping: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                            }
                            write(status);
                            currentTimeMillis2 = System.currentTimeMillis();
                        } else if (read != STATUS.CALL.getByte()) {
                            break;
                        } else {
                            parseOne();
                            b bVar3 = LOG;
                            if (bVar3.u()) {
                                bVar3.y("timer -- parse one: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                            }
                            currentTimeMillis2 = System.currentTimeMillis();
                        }
                    }
                    this.output.flush();
                }
                throw new IllegalStateException("Unexpected request");
            } catch (Throwable th) {
                LOG.j("main loop error (did the forking process shut down?)", th);
                exit(1);
                System.err.flush();
            }
        } catch (Throwable th2) {
            LOG.j("couldn't initialize parser", th2);
            try {
                this.output.writeByte(STATUS.FAILED_TO_START.getByte());
                this.output.flush();
            } catch (IOException e7) {
                LOG.g("couldn't notify of failure to start", e7);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                synchronized (this.lock) {
                    long currentTimeMillis = System.currentTimeMillis() - this.since;
                    if (this.parsing && currentTimeMillis > this.serverParseTimeoutMillis) {
                        LOG.p(Long.valueOf(currentTimeMillis), Long.valueOf(this.serverParseTimeoutMillis), "timeout server; elapsed {}  with {}");
                        exit(17);
                    } else if (!this.parsing) {
                        long j = this.serverWaitTimeoutMillis;
                        if (j > 0 && currentTimeMillis > j) {
                            LOG.k("closing down from inactivity");
                            exit(0);
                        }
                    }
                }
                Thread.sleep(this.checkForTimeoutMs);
            } catch (InterruptedException unused) {
                LOG.t("interrupted");
                return;
            }
        }
    }

    private void write(STATUS status, String str) {
        write(status, str.getBytes(StandardCharsets.UTF_8));
    }

    private void write(STATUS status, byte[] bArr) {
        try {
            int length = bArr.length;
            this.output.write(status.getByte());
            this.output.writeInt(length);
            this.output.write(bArr);
            this.output.flush();
        } catch (IOException e7) {
            LOG.j("problem writing data (forking process shutdown?)", e7);
            exit(1);
        }
    }

    private void write(STATUS status) {
        try {
            this.output.write(status.getByte());
            this.output.flush();
        } catch (IOException e7) {
            LOG.j("problem writing data (forking process shutdown?)", e7);
            exit(1);
        }
    }
}
