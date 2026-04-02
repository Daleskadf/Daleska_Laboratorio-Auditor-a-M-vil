package q4;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class h implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final K1.d f15355b;

    /* renamed from: c  reason: collision with root package name */
    public static final e4.e f15356c;

    /* renamed from: a  reason: collision with root package name */
    public final p f15357a;

    static {
        K1.d dVar = new K1.d(25);
        f15355b = dVar;
        f15356c = new e4.e(Collections.emptyList(), dVar);
    }

    public h(p pVar) {
        m5.d.i("Not a document key path: %s", e(pVar), pVar);
        this.f15357a = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h b() {
        p eVar;
        List emptyList = Collections.emptyList();
        p pVar = p.f15369b;
        if (emptyList.isEmpty()) {
            eVar = p.f15369b;
        } else {
            eVar = new e(emptyList);
        }
        return new h(eVar);
    }

    public static h c(String str) {
        boolean z7;
        p l8 = p.l(str);
        if (l8.f15351a.size() > 4 && l8.g(0).equals("projects") && l8.g(2).equals("databases") && l8.g(4).equals("documents")) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Tried to parse an invalid key: %s", z7, l8);
        return new h((p) l8.j());
    }

    public static boolean e(p pVar) {
        if (pVar.f15351a.size() % 2 == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(h hVar) {
        return this.f15357a.compareTo(hVar.f15357a);
    }

    public final p d() {
        return (p) this.f15357a.k();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            return this.f15357a.equals(((h) obj).f15357a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15357a.hashCode();
    }

    public final String toString() {
        return this.f15357a.c();
    }
}
