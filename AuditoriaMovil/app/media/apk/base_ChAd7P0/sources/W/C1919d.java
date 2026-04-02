package w;
/* renamed from: w.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1919d {

    /* renamed from: a  reason: collision with root package name */
    public final int f16190a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16191b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f16192c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f16193d;

    public C1919d(int i7, int i8, boolean z7, boolean z8) {
        this.f16190a = i7;
        this.f16191b = i8;
        this.f16192c = z7;
        this.f16193d = z8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1919d)) {
            return false;
        }
        C1919d c1919d = (C1919d) obj;
        if (this.f16190a == c1919d.f16190a && this.f16191b == c1919d.f16191b && this.f16192c == c1919d.f16192c && this.f16193d == c1919d.f16193d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = (((this.f16190a ^ 1000003) * 1000003) ^ this.f16191b) * 1000003;
        int i9 = 1237;
        if (this.f16192c) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i10 = (i8 ^ i7) * 1000003;
        if (this.f16193d) {
            i9 = 1231;
        }
        return i10 ^ i9;
    }

    public final String toString() {
        return "FeatureSettings{cameraMode=" + this.f16190a + ", requiredMaxBitDepth=" + this.f16191b + ", previewStabilizationOn=" + this.f16192c + ", ultraHdrOn=" + this.f16193d + "}";
    }
}
