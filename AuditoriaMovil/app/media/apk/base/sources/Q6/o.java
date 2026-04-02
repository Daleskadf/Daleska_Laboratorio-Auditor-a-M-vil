package Q6;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class o implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final String f4480b;

    /* renamed from: a  reason: collision with root package name */
    public final g f4481a;

    static {
        String separator = File.separator;
        kotlin.jvm.internal.j.d(separator, "separator");
        f4480b = separator;
    }

    public o(g bytes) {
        kotlin.jvm.internal.j.e(bytes, "bytes");
        this.f4481a = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a7 = R6.c.a(this);
        g gVar = this.f4481a;
        if (a7 == -1) {
            a7 = 0;
        } else if (a7 < gVar.c() && gVar.h(a7) == 92) {
            a7++;
        }
        int c8 = gVar.c();
        int i7 = a7;
        while (a7 < c8) {
            if (gVar.h(a7) == 47 || gVar.h(a7) == 92) {
                arrayList.add(gVar.n(i7, a7));
                i7 = a7 + 1;
            }
            a7++;
        }
        if (i7 < gVar.c()) {
            arrayList.add(gVar.n(i7, gVar.c()));
        }
        return arrayList;
    }

    public final String b() {
        g gVar = R6.c.f4785a;
        g gVar2 = R6.c.f4785a;
        g gVar3 = this.f4481a;
        int j = g.j(gVar3, gVar2);
        if (j == -1) {
            j = g.j(gVar3, R6.c.f4786b);
        }
        if (j != -1) {
            gVar3 = g.o(gVar3, j + 1, 0, 2);
        } else if (g() != null && gVar3.c() == 2) {
            gVar3 = g.f4463d;
        }
        return gVar3.r();
    }

    public final o c() {
        g gVar = R6.c.f4788d;
        g gVar2 = this.f4481a;
        if (kotlin.jvm.internal.j.a(gVar2, gVar)) {
            return null;
        }
        g gVar3 = R6.c.f4785a;
        if (kotlin.jvm.internal.j.a(gVar2, gVar3)) {
            return null;
        }
        g prefix = R6.c.f4786b;
        if (kotlin.jvm.internal.j.a(gVar2, prefix)) {
            return null;
        }
        g suffix = R6.c.f4789e;
        gVar2.getClass();
        kotlin.jvm.internal.j.e(suffix, "suffix");
        int c8 = gVar2.c();
        byte[] bArr = suffix.f4464a;
        if (gVar2.l(c8 - bArr.length, suffix, bArr.length) && (gVar2.c() == 2 || gVar2.l(gVar2.c() - 3, gVar3, 1) || gVar2.l(gVar2.c() - 3, prefix, 1))) {
            return null;
        }
        int j = g.j(gVar2, gVar3);
        if (j == -1) {
            j = g.j(gVar2, prefix);
        }
        if (j == 2 && g() != null) {
            if (gVar2.c() == 3) {
                return null;
            }
            return new o(g.o(gVar2, 0, 3, 1));
        }
        if (j == 1) {
            kotlin.jvm.internal.j.e(prefix, "prefix");
            if (gVar2.l(0, prefix, prefix.f4464a.length)) {
                return null;
            }
        }
        if (j == -1 && g() != null) {
            if (gVar2.c() == 2) {
                return null;
            }
            return new o(g.o(gVar2, 0, 2, 1));
        } else if (j == -1) {
            return new o(gVar);
        } else {
            if (j == 0) {
                return new o(g.o(gVar2, 0, 1, 1));
            }
            return new o(g.o(gVar2, 0, j, 1));
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o other = (o) obj;
        kotlin.jvm.internal.j.e(other, "other");
        return this.f4481a.compareTo(other.f4481a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Q6.e, java.lang.Object] */
    public final o d(String child) {
        kotlin.jvm.internal.j.e(child, "child");
        ?? obj = new Object();
        obj.z(child);
        return R6.c.b(this, R6.c.d(obj, false), false);
    }

    public final File e() {
        return new File(this.f4481a.r());
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && kotlin.jvm.internal.j.a(((o) obj).f4481a, this.f4481a)) {
            return true;
        }
        return false;
    }

    public final Path f() {
        Path path;
        path = Paths.get(this.f4481a.r(), new String[0]);
        kotlin.jvm.internal.j.d(path, "get(toString())");
        return path;
    }

    public final Character g() {
        g gVar = R6.c.f4785a;
        g gVar2 = this.f4481a;
        if (g.f(gVar2, gVar) != -1 || gVar2.c() < 2 || gVar2.h(1) != 58) {
            return null;
        }
        char h8 = (char) gVar2.h(0);
        if (('a' > h8 || h8 >= '{') && ('A' > h8 || h8 >= '[')) {
            return null;
        }
        return Character.valueOf(h8);
    }

    public final int hashCode() {
        return this.f4481a.hashCode();
    }

    public final String toString() {
        return this.f4481a.r();
    }
}
