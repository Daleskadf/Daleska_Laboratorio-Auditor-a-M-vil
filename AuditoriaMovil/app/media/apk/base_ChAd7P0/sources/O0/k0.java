package O0;
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: c  reason: collision with root package name */
    public static final k0 f3788c = new k0(0, false);

    /* renamed from: a  reason: collision with root package name */
    public final int f3789a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3790b;

    public k0(int i7, boolean z7) {
        this.f3789a = i7;
        this.f3790b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f3789a == k0Var.f3789a && this.f3790b == k0Var.f3790b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3789a << 1) + (this.f3790b ? 1 : 0);
    }
}
