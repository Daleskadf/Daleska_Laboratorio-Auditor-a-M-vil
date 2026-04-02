package org.apache.tika.parser.digest;

import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.pathprovider.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.BoundedInputStream;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.DigestingParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public class InputStreamDigester implements DigestingParser.Digester {
    private final String algorithm;
    private final String algorithmKeyName;
    private final DigestingParser.Encoder encoder;
    private final int markLimit;

    public InputStreamDigester(int i7, String str, DigestingParser.Encoder encoder) {
        this(i7, str, str, encoder);
    }

    private void digestFile(File file, long j, Metadata metadata) {
        if (StringUtils.isBlank(metadata.get(HttpHeaders.CONTENT_LENGTH))) {
            if (j < 0) {
                j = file.length();
            }
            setContentLength(j, metadata);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            digestStream(fileInputStream, metadata);
            fileInputStream.close();
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private boolean digestStream(InputStream inputStream, Metadata metadata) {
        MessageDigest newMessageDigest = newMessageDigest();
        updateDigest(newMessageDigest, inputStream, metadata);
        byte[] digest = newMessageDigest.digest();
        if ((inputStream instanceof BoundedInputStream) && ((BoundedInputStream) inputStream).hasHitBound()) {
            return false;
        }
        metadata.set(getMetadataKey(), this.encoder.encode(digest));
        return true;
    }

    private String getMetadataKey() {
        return b.h("X-TIKA:digest:", this.algorithmKeyName);
    }

    private MessageDigest newMessageDigest() {
        try {
            Provider provider = getProvider();
            if (provider == null) {
                return MessageDigest.getInstance(this.algorithm);
            }
            return MessageDigest.getInstance(this.algorithm, provider);
        } catch (NoSuchAlgorithmException e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    private static void setContentLength(long j, Metadata metadata) {
        if (StringUtils.isBlank(metadata.get(HttpHeaders.CONTENT_LENGTH))) {
            metadata.set(HttpHeaders.CONTENT_LENGTH, Long.toString(j));
        }
    }

    private static MessageDigest updateDigest(MessageDigest messageDigest, InputStream inputStream, Metadata metadata) {
        byte[] bArr = new byte[RecognitionOptions.UPC_E];
        int read = inputStream.read(bArr, 0, RecognitionOptions.UPC_E);
        long j = 0;
        while (read > -1) {
            messageDigest.update(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr, 0, RecognitionOptions.UPC_E);
        }
        setContentLength(j, metadata);
        return messageDigest;
    }

    @Override // org.apache.tika.parser.DigestingParser.Digester
    public void digest(InputStream inputStream, Metadata metadata, ParseContext parseContext) {
        long j;
        TikaInputStream cast = TikaInputStream.cast(inputStream);
        if (cast != null && cast.hasFile()) {
            if (cast.hasFile()) {
                j = cast.getLength();
            } else {
                j = -1;
            }
            if (j > this.markLimit) {
                digestFile(cast.getFile(), j, metadata);
                return;
            }
        }
        BoundedInputStream boundedInputStream = new BoundedInputStream(this.markLimit, inputStream);
        boundedInputStream.mark(this.markLimit + 1);
        boolean digestStream = digestStream(boundedInputStream, metadata);
        boundedInputStream.reset();
        if (digestStream) {
            return;
        }
        if (cast != null) {
            digestFile(cast.getFile(), -1L, metadata);
            return;
        }
        TemporaryResources temporaryResources = new TemporaryResources();
        try {
            digestFile(TikaInputStream.get(inputStream, temporaryResources, metadata).getFile(), -1L, metadata);
            try {
                temporaryResources.dispose();
            } catch (TikaException e7) {
                throw new IOException(e7);
            }
        } catch (Throwable th) {
            try {
                temporaryResources.dispose();
                throw th;
            } catch (TikaException e8) {
                throw new IOException(e8);
            }
        }
    }

    public Provider getProvider() {
        return null;
    }

    public InputStreamDigester(int i7, String str, String str2, DigestingParser.Encoder encoder) {
        this.algorithm = str;
        this.algorithmKeyName = str2;
        this.encoder = encoder;
        this.markLimit = i7;
        if (i7 < 0) {
            throw new IllegalArgumentException("markLimit must be >= 0");
        }
    }
}
