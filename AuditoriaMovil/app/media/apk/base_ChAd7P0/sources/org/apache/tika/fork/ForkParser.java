package org.apache.tika.fork;

import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.AbstractRecursiveParserWrapperHandler;
import org.apache.tika.sax.TeeContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
/* loaded from: classes.dex */
public class ForkParser implements Parser, Closeable {
    private static final long serialVersionUID = -4962742892274663950L;
    private int currentlyInUse;

    /* renamed from: java  reason: collision with root package name */
    private List<String> f14608java;
    private final ClassLoader loader;
    @Field
    private int maxFilesProcessedPerClient;
    private final Parser parser;
    private final ParserFactoryFactory parserFactoryFactory;
    private final Queue<ForkClient> pool;
    @Field
    private int poolSize;
    @Field
    private long serverParseTimeoutMillis;
    @Field
    private long serverPulseMillis;
    @Field
    private long serverWaitTimeoutMillis;
    private final Path tikaBin;

    public ForkParser(Path path, ParserFactoryFactory parserFactoryFactory) {
        this.pool = new LinkedList();
        this.f14608java = Arrays.asList("java", "-Xmx32m", "-Djava.awt.headless=true");
        this.poolSize = 5;
        this.currentlyInUse = 0;
        this.serverPulseMillis = 1000L;
        this.serverParseTimeoutMillis = 60000L;
        this.serverWaitTimeoutMillis = 60000L;
        this.maxFilesProcessedPerClient = -1;
        this.loader = null;
        this.parser = null;
        this.tikaBin = path;
        this.parserFactoryFactory = parserFactoryFactory;
    }

    private synchronized ForkClient acquireClient() {
        ForkClient poll;
        while (true) {
            try {
                poll = this.pool.poll();
                if (poll == null && this.currentlyInUse < this.poolSize) {
                    poll = newClient();
                }
                if (poll != null && !poll.ping()) {
                    poll.close();
                    poll = null;
                }
                if (poll != null) {
                    this.currentlyInUse++;
                } else if (this.currentlyInUse >= this.poolSize) {
                    try {
                        wait();
                    } catch (InterruptedException e7) {
                        throw new TikaException("Interrupted while waiting for a fork parser", e7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return poll;
    }

    private ForkClient newClient() {
        TimeoutLimits timeoutLimits = new TimeoutLimits(this.serverPulseMillis, this.serverParseTimeoutMillis, this.serverWaitTimeoutMillis);
        ClassLoader classLoader = this.loader;
        if (classLoader == null && this.parser == null && this.tikaBin != null && this.parserFactoryFactory != null) {
            return new ForkClient(this.tikaBin, this.parserFactoryFactory, this.f14608java, timeoutLimits);
        }
        if (classLoader != null && this.parser != null && this.tikaBin == null && this.parserFactoryFactory == null) {
            return new ForkClient(this.loader, this.parser, this.f14608java, timeoutLimits);
        }
        if (classLoader != null && this.parser == null && this.tikaBin != null && this.parserFactoryFactory != null) {
            return new ForkClient(this.tikaBin, this.parserFactoryFactory, this.loader, this.f14608java, timeoutLimits);
        }
        throw new IllegalStateException("Unexpected combination of state items");
    }

    private synchronized void releaseClient(ForkClient forkClient, boolean z7) {
        try {
            int i7 = this.currentlyInUse - 1;
            this.currentlyInUse = i7;
            if (i7 + this.pool.size() < this.poolSize && z7) {
                if (this.maxFilesProcessedPerClient > 0 && forkClient.getFilesProcessed() >= this.maxFilesProcessedPerClient) {
                    forkClient.close();
                } else {
                    this.pool.offer(forkClient);
                }
                notifyAll();
            } else {
                forkClient.close();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            for (ForkClient forkClient : this.pool) {
                forkClient.close();
            }
            this.pool.clear();
            this.poolSize = 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    public List<String> getJavaCommandAsList() {
        return DesugarCollections.unmodifiableList(this.f14608java);
    }

    public synchronized int getPoolSize() {
        return this.poolSize;
    }

    @Override // org.apache.tika.parser.Parser
    public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
        return this.parser.getSupportedTypes(parseContext);
    }

    @Override // org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) {
        boolean z7 = false;
        if (inputStream != null) {
            ForkClient acquireClient = acquireClient();
            try {
                try {
                    if (!(contentHandler instanceof AbstractRecursiveParserWrapperHandler)) {
                        contentHandler = new TeeContentHandler(contentHandler, new MetadataContentHandler(metadata));
                    }
                    Throwable call = acquireClient.call("parse", inputStream, contentHandler, metadata, parseContext);
                    releaseClient(acquireClient, true);
                    if (!(call instanceof IOException)) {
                        if (!(call instanceof SAXException)) {
                            if (!(call instanceof TikaException)) {
                                if (call == null) {
                                    return;
                                }
                                throw new TikaException("Unexpected error in forked server process", call);
                            }
                            throw ((TikaException) call);
                        }
                        throw ((SAXException) call);
                    }
                    throw ((IOException) call);
                } catch (IOException e7) {
                    throw new TikaException("Failed to communicate with a forked parser process. The process has most likely crashed due to some error like running out of memory. A new process will be started for the next parsing request.", e7);
                } catch (TikaException e8) {
                    try {
                        throw e8;
                    } catch (Throwable th) {
                        th = th;
                        z7 = true;
                        releaseClient(acquireClient, z7);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                releaseClient(acquireClient, z7);
                throw th;
            }
        }
        throw new NullPointerException("null stream");
    }

    public void setJavaCommand(List<String> list) {
        this.f14608java = new ArrayList(list);
    }

    public void setMaxFilesProcessedPerServer(int i7) {
        this.maxFilesProcessedPerClient = i7;
    }

    public synchronized void setPoolSize(int i7) {
        this.poolSize = i7;
    }

    public void setServerParseTimeoutMillis(long j) {
        this.serverParseTimeoutMillis = j;
    }

    public void setServerPulseMillis(long j) {
        this.serverPulseMillis = j;
    }

    public void setServerWaitTimeoutMillis(long j) {
        this.serverWaitTimeoutMillis = j;
    }

    public ForkParser(Path path, ParserFactoryFactory parserFactoryFactory, ClassLoader classLoader) {
        this.pool = new LinkedList();
        this.f14608java = Arrays.asList("java", "-Xmx32m", "-Djava.awt.headless=true");
        this.poolSize = 5;
        this.currentlyInUse = 0;
        this.serverPulseMillis = 1000L;
        this.serverParseTimeoutMillis = 60000L;
        this.serverWaitTimeoutMillis = 60000L;
        this.maxFilesProcessedPerClient = -1;
        this.parser = null;
        this.loader = classLoader;
        this.tikaBin = path;
        this.parserFactoryFactory = parserFactoryFactory;
    }

    public ForkParser(ClassLoader classLoader, Parser parser) {
        this.pool = new LinkedList();
        this.f14608java = Arrays.asList("java", "-Xmx32m", "-Djava.awt.headless=true");
        this.poolSize = 5;
        this.currentlyInUse = 0;
        this.serverPulseMillis = 1000L;
        this.serverParseTimeoutMillis = 60000L;
        this.serverWaitTimeoutMillis = 60000L;
        this.maxFilesProcessedPerClient = -1;
        if (!(parser instanceof ForkParser)) {
            this.tikaBin = null;
            this.parserFactoryFactory = null;
            this.loader = classLoader;
            this.parser = parser;
            return;
        }
        throw new IllegalArgumentException("The underlying parser of a ForkParser should not be a ForkParser, but a specific implementation.");
    }

    public ForkParser(ClassLoader classLoader) {
        this(classLoader, new AutoDetectParser());
    }

    public ForkParser() {
        this(ForkParser.class.getClassLoader());
    }
}
