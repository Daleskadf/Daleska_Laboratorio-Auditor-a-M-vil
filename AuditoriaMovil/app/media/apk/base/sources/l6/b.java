package l6;
/* loaded from: classes.dex */
public final class b implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final b f13863b = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f13864a;

    /* JADX WARN: Type inference failed for: r0v0, types: [B6.f, B6.d] */
    /* JADX WARN: Type inference failed for: r0v3, types: [B6.f, B6.d] */
    /* JADX WARN: Type inference failed for: r0v5, types: [B6.f, B6.d] */
    public b() {
        if (new B6.d(0, 255, 1).e(1) && new B6.d(0, 255, 1).e(9) && new B6.d(0, 255, 1).e(24)) {
            this.f13864a = 67864;
            return;
        }
        throw new IllegalArgumentException("Version components are out of range: 1.9.24".toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.j.e(other, "other");
        return this.f13864a - other.f13864a;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            bVar = (b) obj;
        } else {
            bVar = null;
        }
        if (bVar != null && this.f13864a == bVar.f13864a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13864a;
    }

    public final String toString() {
        return "1.9.24";
    }
}
