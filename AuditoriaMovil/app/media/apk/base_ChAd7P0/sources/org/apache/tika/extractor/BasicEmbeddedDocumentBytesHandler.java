package org.apache.tika.extractor;

import A.j;
import S6.c;
import T6.a;
import T6.d;
import X6.b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;
/* loaded from: classes.dex */
public class BasicEmbeddedDocumentBytesHandler extends AbstractEmbeddedDocumentBytesHandler {
    private final EmbeddedDocumentBytesConfig config;
    Map<Integer, byte[]> docBytes = new HashMap();

    public BasicEmbeddedDocumentBytesHandler(EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig) {
        this.config = embeddedDocumentBytesConfig;
    }

    @Override // org.apache.tika.extractor.AbstractEmbeddedDocumentBytesHandler, org.apache.tika.extractor.EmbeddedDocumentBytesHandler
    public void add(int i7, Metadata metadata, InputStream inputStream) {
        super.add(i7, metadata, inputStream);
        Map<Integer, byte[]> map = this.docBytes;
        Integer valueOf = Integer.valueOf(i7);
        byte[] bArr = c.f5279a;
        int i8 = X6.c.f;
        new d();
        X6.c cVar = new X6.c();
        b bVar = new b(new P0.b(19), new j(cVar, 26));
        try {
            c.b(inputStream, bVar);
            byte[] b5 = cVar.b();
            bVar.close();
            map.put(valueOf, b5);
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.InputStream, W6.f] */
    public InputStream getDocument(int i7) {
        d dVar = new d();
        dVar.f5504b = new a(this.docBytes.get(Integer.valueOf(i7)));
        a aVar = dVar.f5504b;
        if (aVar != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) aVar.f5503b);
            ?? inputStream = new InputStream();
            inputStream.f6224a = byteArrayInputStream;
            inputStream.f6228e = -1;
            inputStream.f6225b = new byte[8192];
            return inputStream;
        }
        throw new IllegalStateException("origin == null");
    }
}
