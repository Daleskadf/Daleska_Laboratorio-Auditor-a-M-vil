package I;

import D.z0;
/* loaded from: classes.dex */
public final class b implements z0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f2079a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2080b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2081c;

    /* renamed from: d  reason: collision with root package name */
    public final float f2082d;

    public b(float f, float f4, float f8, float f9) {
        this.f2079a = f;
        this.f2080b = f4;
        this.f2081c = f8;
        this.f2082d = f9;
    }

    public static b e(z0 z0Var) {
        return new b(z0Var.b(), z0Var.a(), z0Var.d(), z0Var.c());
    }

    @Override // D.z0
    public final float a() {
        return this.f2080b;
    }

    @Override // D.z0
    public final float b() {
        return this.f2079a;
    }

    @Override // D.z0
    public final float c() {
        return this.f2082d;
    }

    @Override // D.z0
    public final float d() {
        return this.f2081c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Float.floatToIntBits(this.f2079a) == Float.floatToIntBits(bVar.f2079a) && Float.floatToIntBits(this.f2080b) == Float.floatToIntBits(bVar.f2080b) && Float.floatToIntBits(this.f2081c) == Float.floatToIntBits(bVar.f2081c) && Float.floatToIntBits(this.f2082d) == Float.floatToIntBits(bVar.f2082d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f2079a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f2080b)) * 1000003) ^ Float.floatToIntBits(this.f2081c)) * 1000003) ^ Float.floatToIntBits(this.f2082d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f2079a + ", maxZoomRatio=" + this.f2080b + ", minZoomRatio=" + this.f2081c + ", linearZoom=" + this.f2082d + "}";
    }
}
