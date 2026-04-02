package D;
/* renamed from: D.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056f {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC0071v f696a;

    /* renamed from: b  reason: collision with root package name */
    public final C0057g f697b;

    public C0056f(EnumC0071v enumC0071v, C0057g c0057g) {
        if (enumC0071v != null) {
            this.f696a = enumC0071v;
            this.f697b = c0057g;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0056f)) {
            return false;
        }
        C0056f c0056f = (C0056f) obj;
        if (this.f696a.equals(c0056f.f696a)) {
            C0057g c0057g = c0056f.f697b;
            C0057g c0057g2 = this.f697b;
            if (c0057g2 == null) {
                if (c0057g == null) {
                    return true;
                }
            } else if (c0057g2.equals(c0057g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f696a.hashCode() ^ 1000003) * 1000003;
        C0057g c0057g = this.f697b;
        if (c0057g == null) {
            hashCode = 0;
        } else {
            hashCode = c0057g.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return "CameraState{type=" + this.f696a + ", error=" + this.f697b + "}";
    }
}
