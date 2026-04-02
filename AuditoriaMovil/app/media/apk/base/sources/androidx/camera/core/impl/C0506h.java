package androidx.camera.core.impl;

import D.AbstractC0059i;
import android.util.Size;
/* renamed from: androidx.camera.core.impl.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506h {

    /* renamed from: a  reason: collision with root package name */
    public final t0 f7627a;

    /* renamed from: b  reason: collision with root package name */
    public final s0 f7628b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7629c;

    public C0506h(t0 t0Var, s0 s0Var, long j) {
        if (t0Var != null) {
            this.f7627a = t0Var;
            if (s0Var != null) {
                this.f7628b = s0Var;
                this.f7629c = j;
                return;
            }
            throw new NullPointerException("Null configSize");
        }
        throw new NullPointerException("Null configType");
    }

    public static C0506h a(t0 t0Var, s0 s0Var) {
        return new C0506h(t0Var, s0Var, 0L);
    }

    public static t0 b(int i7) {
        if (i7 == 35) {
            return t0.YUV;
        }
        if (i7 == 256) {
            return t0.JPEG;
        }
        if (i7 == 4101) {
            return t0.JPEG_R;
        }
        if (i7 == 32) {
            return t0.RAW;
        }
        return t0.PRIV;
    }

    public static C0506h c(int i7, int i8, Size size, C0507i c0507i) {
        t0 b5 = b(i8);
        s0 s0Var = s0.NOT_SUPPORT;
        int a7 = L.a.a(size);
        if (i7 == 1) {
            if (a7 <= L.a.a((Size) c0507i.f7633b.get(Integer.valueOf(i8)))) {
                s0Var = s0.s720p;
            } else {
                if (a7 <= L.a.a((Size) c0507i.f7635d.get(Integer.valueOf(i8)))) {
                    s0Var = s0.s1440p;
                }
            }
        } else if (a7 <= L.a.a(c0507i.f7632a)) {
            s0Var = s0.VGA;
        } else if (a7 <= L.a.a(c0507i.f7634c)) {
            s0Var = s0.PREVIEW;
        } else if (a7 <= L.a.a(c0507i.f7636e)) {
            s0Var = s0.RECORD;
        } else {
            if (a7 <= L.a.a((Size) c0507i.f.get(Integer.valueOf(i8)))) {
                s0Var = s0.MAXIMUM;
            } else {
                Size size2 = (Size) c0507i.f7637g.get(Integer.valueOf(i8));
                if (size2 != null) {
                    if (a7 <= size2.getHeight() * size2.getWidth()) {
                        s0Var = s0.ULTRA_MAXIMUM;
                    }
                }
            }
        }
        return a(b5, s0Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0506h)) {
            return false;
        }
        C0506h c0506h = (C0506h) obj;
        if (this.f7627a.equals(c0506h.f7627a) && this.f7628b.equals(c0506h.f7628b) && this.f7629c == c0506h.f7629c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f7629c;
        return ((((this.f7627a.hashCode() ^ 1000003) * 1000003) ^ this.f7628b.hashCode()) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        sb.append(this.f7627a);
        sb.append(", configSize=");
        sb.append(this.f7628b);
        sb.append(", streamUseCase=");
        return AbstractC0059i.C(sb, this.f7629c, "}");
    }
}
