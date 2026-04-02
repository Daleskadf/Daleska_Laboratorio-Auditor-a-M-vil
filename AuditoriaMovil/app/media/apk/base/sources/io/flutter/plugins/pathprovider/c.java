package io.flutter.plugins.pathprovider;

import L5.x;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class c extends x {

    /* renamed from: d  reason: collision with root package name */
    public static final c f12389d = new Object();

    @Override // L5.x
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        if (b5 != -127) {
            return super.f(b5, byteBuffer);
        }
        Object e7 = e(byteBuffer);
        if (e7 == null) {
            return null;
        }
        return d.values()[((Long) e7).intValue()];
    }

    @Override // L5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Integer valueOf;
        if (obj instanceof d) {
            byteArrayOutputStream.write(129);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(((d) obj).index);
            }
            k(byteArrayOutputStream, valueOf);
            return;
        }
        super.k(byteArrayOutputStream, obj);
    }
}
