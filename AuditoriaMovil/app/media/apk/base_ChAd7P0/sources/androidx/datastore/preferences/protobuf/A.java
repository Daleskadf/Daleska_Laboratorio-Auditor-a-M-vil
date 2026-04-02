package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f7747a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f7748b;

    static {
        Charset.forName("US-ASCII");
        f7747a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f7748b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0531h(bArr, 0, 0, false).l(0);
        } catch (C e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
