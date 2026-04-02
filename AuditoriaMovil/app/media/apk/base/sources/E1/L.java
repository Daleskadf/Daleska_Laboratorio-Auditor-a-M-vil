package e1;
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a  reason: collision with root package name */
    public final int f10658a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10659b;

    public L(int i7, boolean z7) {
        this.f10658a = i7;
        this.f10659b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L.class != obj.getClass()) {
            return false;
        }
        L l8 = (L) obj;
        if (this.f10658a == l8.f10658a && this.f10659b == l8.f10659b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10658a * 31) + (this.f10659b ? 1 : 0);
    }
}
