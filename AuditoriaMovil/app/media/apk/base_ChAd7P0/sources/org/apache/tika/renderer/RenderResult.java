package org.apache.tika.renderer;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.file.Files;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.io.b;
import org.apache.tika.metadata.Metadata;
/* loaded from: classes.dex */
public class RenderResult implements Closeable {
    private final int id;
    private final Metadata metadata;
    private final Object result;
    private final STATUS status;
    TemporaryResources tmp = new TemporaryResources();

    /* loaded from: classes.dex */
    public enum STATUS {
        SUCCESS,
        EXCEPTION,
        TIMEOUT
    }

    public RenderResult(STATUS status, int i7, final Object obj, Metadata metadata) {
        this.status = status;
        this.id = i7;
        this.result = obj;
        this.metadata = metadata;
        if (b.q(obj)) {
            this.tmp.addResource(new Closeable() { // from class: org.apache.tika.renderer.RenderResult.1
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    Files.delete(b.e(obj));
                }
            });
        } else if (obj instanceof Closeable) {
            this.tmp.addResource((Closeable) obj);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.tmp.close();
    }

    public int getId() {
        return this.id;
    }

    public InputStream getInputStream() {
        if (b.q(this.result)) {
            return TikaInputStream.get(b.e(this.result), this.metadata);
        }
        TikaInputStream tikaInputStream = TikaInputStream.get(new byte[0]);
        tikaInputStream.setOpenContainer(this.result);
        return tikaInputStream;
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public STATUS getStatus() {
        return this.status;
    }
}
