package org.apache.tika.parser.external2;

import g7.b;
import g7.d;
import java.io.BufferedReader;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.config.Param;
import org.apache.tika.config.TikaTaskTimeout;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.ExternalProcess;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.EmptyParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.sax.XHTMLContentHandler;
import org.apache.tika.utils.FileProcessResult;
import org.apache.tika.utils.ProcessUtils;
import org.apache.tika.utils.StringUtils;
import org.xml.sax.ContentHandler;
/* loaded from: classes.dex */
public class ExternalParser implements Parser, Initializable {
    public static final long DEFAULT_TIMEOUT_MS = 60000;
    public static final String INPUT_FILE_TOKEN = "${INPUT_FILE}";
    public static final String OUTPUT_FILE_TOKEN = "${OUTPUT_FILE}";
    private static Pattern INPUT_TOKEN_MATCHER = Pattern.compile("\\$\\{INPUT_FILE}");
    private static Pattern OUTPUT_TOKEN_MATCHER = Pattern.compile("\\$\\{OUTPUT_FILE}");
    private static final b LOG = d.b(ExternalParser.class);
    private Set<MediaType> supportedTypes = new HashSet();
    private List<String> commandLine = new ArrayList();
    private Parser outputParser = EmptyParser.INSTANCE;
    private boolean returnStdout = false;
    private boolean returnStderr = true;
    private long timeoutMs = 60000;
    private int maxStdErr = 10000;
    private int maxStdOut = 10000;

    private void handleOutput(FileProcessResult fileProcessResult, Path path, XHTMLContentHandler xHTMLContentHandler, Metadata metadata, ParseContext parseContext) {
        BufferedReader newBufferedReader;
        if (this.outputParser == EmptyParser.INSTANCE) {
            if (path != null) {
                newBufferedReader = Files.newBufferedReader(path);
                try {
                    for (String readLine = newBufferedReader.readLine(); readLine != null; readLine = newBufferedReader.readLine()) {
                        xHTMLContentHandler.characters(readLine);
                        xHTMLContentHandler.newline();
                    }
                    newBufferedReader.close();
                    return;
                } catch (Throwable th) {
                    if (newBufferedReader != null) {
                        try {
                            newBufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            xHTMLContentHandler.characters(fileProcessResult.getStdout());
        } else if (path != null) {
            TikaInputStream tikaInputStream = TikaInputStream.get(path);
            try {
                this.outputParser.parse(tikaInputStream, new BodyContentHandler(xHTMLContentHandler), metadata, parseContext);
                if (tikaInputStream != null) {
                    tikaInputStream.close();
                }
            } catch (Throwable th3) {
                if (tikaInputStream != null) {
                    try {
                        tikaInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } else {
            TikaInputStream tikaInputStream2 = TikaInputStream.get(fileProcessResult.getStdout().getBytes(StandardCharsets.UTF_8));
            try {
                this.outputParser.parse(tikaInputStream2, new BodyContentHandler(xHTMLContentHandler), metadata, parseContext);
                if (tikaInputStream2 != null) {
                    tikaInputStream2.close();
                }
            } catch (Throwable th5) {
                if (tikaInputStream2 != null) {
                    try {
                        tikaInputStream2.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        }
    }

    @Override // org.apache.tika.config.Initializable
    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) {
        if (this.supportedTypes.size() != 0) {
            if (!this.commandLine.isEmpty()) {
                if (this.outputParser == EmptyParser.INSTANCE) {
                    LOG.t("no parser selected for the output; contents will be written to the content handler");
                    return;
                }
                return;
            }
            throw new TikaConfigException("commandLine is empty?!");
        }
        throw new TikaConfigException("supportedTypes size must be > 0");
    }

    public Parser getOutputParser() {
        return this.outputParser;
    }

    @Override // org.apache.tika.parser.Parser
    public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
        return this.supportedTypes;
    }

    @Override // org.apache.tika.config.Initializable
    public void initialize(Map<String, Param> map) {
    }

    @Override // org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) {
        FileProcessResult execute;
        Path absolutePath;
        String path;
        Path absolutePath2;
        String path2;
        Path path3 = null;
        try {
            TemporaryResources temporaryResources = new TemporaryResources();
            Path path4 = TikaInputStream.get(inputStream, temporaryResources, metadata).getPath();
            ArrayList arrayList = new ArrayList();
            Matcher matcher = INPUT_TOKEN_MATCHER.matcher(StringUtils.EMPTY);
            Matcher matcher2 = OUTPUT_TOKEN_MATCHER.matcher(StringUtils.EMPTY);
            boolean z7 = false;
            for (String str : this.commandLine) {
                if (matcher.reset(str).find()) {
                    absolutePath = path4.toAbsolutePath();
                    path = absolutePath.toString();
                    arrayList.add(str.replace(INPUT_FILE_TOKEN, ProcessUtils.escapeCommandLine(path)));
                } else if (matcher2.reset(str).find()) {
                    path3 = Files.createTempFile("tika-external2-", StringUtils.EMPTY, new FileAttribute[0]);
                    absolutePath2 = path3.toAbsolutePath();
                    path2 = absolutePath2.toString();
                    arrayList.add(str.replace(OUTPUT_FILE_TOKEN, ProcessUtils.escapeCommandLine(path2)));
                    z7 = true;
                } else {
                    arrayList.add(str);
                }
            }
            long timeoutMillis = TikaTaskTimeout.getTimeoutMillis(parseContext, this.timeoutMs);
            if (!z7) {
                path3 = Files.createTempFile("tika-external2-", StringUtils.EMPTY, new FileAttribute[0]);
                execute = ProcessUtils.execute(new ProcessBuilder(arrayList), timeoutMillis, path3, this.maxStdErr);
            } else {
                execute = ProcessUtils.execute(new ProcessBuilder(arrayList), timeoutMillis, this.maxStdOut, this.maxStdErr);
            }
            FileProcessResult fileProcessResult = execute;
            metadata.set(ExternalProcess.IS_TIMEOUT, fileProcessResult.isTimeout());
            metadata.set(ExternalProcess.EXIT_VALUE, fileProcessResult.getExitValue());
            metadata.set(ExternalProcess.STD_OUT_LENGTH, fileProcessResult.getStdoutLength());
            metadata.set(ExternalProcess.STD_OUT_IS_TRUNCATED, fileProcessResult.isStdoutTruncated());
            metadata.set(ExternalProcess.STD_ERR_LENGTH, fileProcessResult.getStderrLength());
            metadata.set(ExternalProcess.STD_ERR_IS_TRUNCATED, fileProcessResult.isStderrTruncated());
            if (this.returnStdout) {
                metadata.set(ExternalProcess.STD_OUT, fileProcessResult.getStdout());
            }
            if (this.returnStderr) {
                metadata.set(ExternalProcess.STD_ERR, fileProcessResult.getStderr());
            }
            XHTMLContentHandler xHTMLContentHandler = new XHTMLContentHandler(contentHandler, metadata);
            xHTMLContentHandler.startDocument();
            handleOutput(fileProcessResult, path3, xHTMLContentHandler, metadata, parseContext);
            xHTMLContentHandler.endDocument();
            temporaryResources.close();
        } finally {
            if (path3 != null) {
                Files.delete(path3);
            }
        }
    }

    @Field
    public void setCommandLine(List<String> list) {
        this.commandLine = list;
    }

    @Field
    public void setMaxStdErr(int i7) {
        this.maxStdErr = i7;
    }

    @Field
    public void setMaxStdOut(int i7) {
        this.maxStdOut = i7;
    }

    @Field
    public void setOutputParser(Parser parser) {
        this.outputParser = parser;
    }

    @Field
    public void setReturnStderr(boolean z7) {
        this.returnStderr = z7;
    }

    @Field
    public void setReturnStdout(boolean z7) {
        this.returnStdout = z7;
    }

    @Field
    public void setSupportedTypes(List<String> list) {
        if (this.supportedTypes.size() <= 0) {
            for (String str : list) {
                this.supportedTypes.add(MediaType.parse(str));
            }
            return;
        }
        throw new IllegalStateException("can't set supportedTypes after initialization");
    }

    @Field
    public void setTimeoutMs(long j) {
        this.timeoutMs = j;
    }
}
