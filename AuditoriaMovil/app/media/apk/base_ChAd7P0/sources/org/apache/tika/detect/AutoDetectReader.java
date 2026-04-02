package org.apache.tika.detect;

import j$.io.BufferedReaderRetargetInterface;
import j$.io.DesugarBufferedReader;
import j$.util.stream.Stream;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.stream.Stream;
import org.apache.tika.config.LoadErrorHandler;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.utils.CharsetUtils;
import org.xml.sax.InputSource;
/* loaded from: classes.dex */
public class AutoDetectReader extends BufferedReader implements BufferedReaderRetargetInterface {
    private static final EncodingDetector DEFAULT_DETECTOR;
    private static final ServiceLoader DEFAULT_LOADER;
    private final Charset charset;

    static {
        ServiceLoader serviceLoader = new ServiceLoader(AutoDetectReader.class.getClassLoader());
        DEFAULT_LOADER = serviceLoader;
        DEFAULT_DETECTOR = new CompositeEncodingDetector(serviceLoader.loadServiceProviders(EncodingDetector.class));
    }

    private AutoDetectReader(InputStream inputStream, Charset charset) {
        super(new InputStreamReader(inputStream, charset));
        this.charset = charset;
        mark(1);
        if (read() != 65279) {
            reset();
        }
    }

    private static Charset detect(InputStream inputStream, Metadata metadata, EncodingDetector encodingDetector, LoadErrorHandler loadErrorHandler) {
        String str;
        try {
            Charset detect = encodingDetector.detect(inputStream, metadata);
            if (detect != null) {
                return detect;
            }
        } catch (NoClassDefFoundError e7) {
            loadErrorHandler.handleLoadError(encodingDetector.getClass().getName(), e7);
        }
        MediaType parse = MediaType.parse(metadata.get(HttpHeaders.CONTENT_TYPE));
        if (parse != null && (str = parse.getParameters().get("charset")) != null) {
            try {
                Charset forName = CharsetUtils.forName(str);
                metadata.set(TikaCoreProperties.DETECTED_ENCODING, forName.name());
                metadata.set(TikaCoreProperties.ENCODING_DETECTOR, "AutoDetectReader-charset-metadata-fallback");
                return forName;
            } catch (IllegalArgumentException unused) {
            }
        }
        throw new TikaException("Failed to detect the character encoding of a document");
    }

    private static InputStream getBuffered(InputStream inputStream) {
        if (inputStream.markSupported()) {
            return inputStream;
        }
        return new BufferedInputStream(inputStream);
    }

    public InputSource asInputSource() {
        InputSource inputSource = new InputSource(this);
        inputSource.setEncoding(this.charset.name());
        return inputSource;
    }

    public Charset getCharset() {
        return this.charset;
    }

    @Override // java.io.BufferedReader
    public final /* synthetic */ Stream lines() {
        return Stream.Wrapper.convert(lines());
    }

    @Override // java.io.BufferedReader, j$.io.BufferedReaderRetargetInterface
    public final /* synthetic */ j$.util.stream.Stream lines() {
        return DesugarBufferedReader.lines(this);
    }

    private AutoDetectReader(InputStream inputStream, Metadata metadata, EncodingDetector encodingDetector, LoadErrorHandler loadErrorHandler) {
        this(inputStream, detect(inputStream, metadata, encodingDetector, loadErrorHandler));
    }

    public AutoDetectReader(InputStream inputStream, Metadata metadata, EncodingDetector encodingDetector) {
        this(getBuffered(inputStream), metadata, encodingDetector, DEFAULT_LOADER.getLoadErrorHandler());
    }

    public AutoDetectReader(InputStream inputStream, Metadata metadata, ServiceLoader serviceLoader) {
        this(getBuffered(inputStream), metadata, new CompositeEncodingDetector(serviceLoader.loadServiceProviders(EncodingDetector.class)), serviceLoader.getLoadErrorHandler());
    }

    public AutoDetectReader(InputStream inputStream, Metadata metadata) {
        this(inputStream, metadata, DEFAULT_DETECTOR);
    }

    public AutoDetectReader(InputStream inputStream) {
        this(inputStream, new Metadata());
    }
}
