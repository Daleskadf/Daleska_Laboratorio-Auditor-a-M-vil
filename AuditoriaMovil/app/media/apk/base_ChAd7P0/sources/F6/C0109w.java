package F6;
/* renamed from: F6.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109w {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1318a;

    /* renamed from: b  reason: collision with root package name */
    public final w6.l f1319b;

    public C0109w(Object obj, w6.l lVar) {
        this.f1318a = obj;
        this.f1319b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0109w)) {
            return false;
        }
        C0109w c0109w = (C0109w) obj;
        if (kotlin.jvm.internal.j.a(this.f1318a, c0109w.f1318a) && kotlin.jvm.internal.j.a(this.f1319b, c0109w.f1319b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f1318a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f1319b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f1318a + ", onCancellation=" + this.f1319b + ')';
    }
}
