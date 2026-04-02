package Q0;
/* renamed from: Q0.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274k {

    /* renamed from: d  reason: collision with root package name */
    public static final C0274k f4289d = new Object().a();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4290a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4291b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4292c;

    public C0274k(A.d dVar) {
        this.f4290a = dVar.f5a;
        this.f4291b = dVar.f6b;
        this.f4292c = dVar.f7c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0274k.class != obj.getClass()) {
            return false;
        }
        C0274k c0274k = (C0274k) obj;
        if (this.f4290a == c0274k.f4290a && this.f4291b == c0274k.f4291b && this.f4292c == c0274k.f4292c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4290a ? 1 : 0) << 2) + ((this.f4291b ? 1 : 0) << 1) + (this.f4292c ? 1 : 0);
    }
}
