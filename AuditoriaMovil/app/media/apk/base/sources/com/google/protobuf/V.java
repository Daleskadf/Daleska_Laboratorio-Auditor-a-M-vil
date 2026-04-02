package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f10033a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f10034b;

    /* renamed from: c  reason: collision with root package name */
    public static final ByteBuffer f10035c;

    static {
        Charset.forName("US-ASCII");
        f10033a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f10034b = bArr;
        f10035c = ByteBuffer.wrap(bArr);
        J6.b.h(bArr, 0, 0, false);
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
