package K0;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2481a;

    /* renamed from: b  reason: collision with root package name */
    public A.l f2482b = new A.l();

    /* renamed from: c  reason: collision with root package name */
    public boolean f2483c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2484d;

    public j(Object obj) {
        this.f2481a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            return this.f2481a.equals(((j) obj).f2481a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2481a.hashCode();
    }
}
