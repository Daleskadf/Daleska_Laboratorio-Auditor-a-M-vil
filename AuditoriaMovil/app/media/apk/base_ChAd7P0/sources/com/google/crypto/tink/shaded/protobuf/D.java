package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f9598a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f9599b;

    static {
        Charset.forName("US-ASCII");
        f9598a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f9599b = bArr;
        ByteBuffer.wrap(bArr);
        H3.d.h(bArr, 0, 0, false);
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
