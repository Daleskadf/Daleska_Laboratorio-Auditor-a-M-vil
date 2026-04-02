package D;

import android.graphics.Matrix;
/* renamed from: D.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058h implements Y {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.camera.core.impl.u0 f714a;

    /* renamed from: b  reason: collision with root package name */
    public final long f715b;

    /* renamed from: c  reason: collision with root package name */
    public final int f716c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f717d;

    public C0058h(androidx.camera.core.impl.u0 u0Var, long j, int i7, Matrix matrix) {
        if (u0Var != null) {
            this.f714a = u0Var;
            this.f715b = j;
            this.f716c = i7;
            this.f717d = matrix;
            return;
        }
        throw new NullPointerException("Null tagBundle");
    }

    @Override // D.Y
    public final androidx.camera.core.impl.u0 a() {
        return this.f714a;
    }

    @Override // D.Y
    public final long b() {
        return this.f715b;
    }

    @Override // D.Y
    public final int c() {
        return this.f716c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0058h)) {
            return false;
        }
        C0058h c0058h = (C0058h) obj;
        if (this.f714a.equals(c0058h.f714a) && this.f715b == c0058h.f715b && this.f716c == c0058h.f716c && this.f717d.equals(c0058h.f717d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f715b;
        return ((((((this.f714a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f716c) * 1000003) ^ this.f717d.hashCode();
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f714a + ", timestamp=" + this.f715b + ", rotationDegrees=" + this.f716c + ", sensorToBufferTransformMatrix=" + this.f717d + "}";
    }
}
