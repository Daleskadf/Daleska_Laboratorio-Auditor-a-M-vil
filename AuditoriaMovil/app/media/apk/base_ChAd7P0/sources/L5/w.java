package L5;

import java.io.ByteArrayOutputStream;
/* loaded from: classes.dex */
public final class w extends ByteArrayOutputStream {
    public byte[] a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public byte[] b() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        kotlin.jvm.internal.j.d(buf, "buf");
        return buf;
    }
}
