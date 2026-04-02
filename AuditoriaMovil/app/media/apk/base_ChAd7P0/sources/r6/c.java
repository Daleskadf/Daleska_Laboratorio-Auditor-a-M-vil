package R6;

import Q6.AbstractC0281b;
import Q6.o;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import m6.AbstractC1447h;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Q6.g f4785a;

    /* renamed from: b  reason: collision with root package name */
    public static final Q6.g f4786b;

    /* renamed from: c  reason: collision with root package name */
    public static final Q6.g f4787c;

    /* renamed from: d  reason: collision with root package name */
    public static final Q6.g f4788d;

    /* renamed from: e  reason: collision with root package name */
    public static final Q6.g f4789e;

    static {
        Q6.g gVar = Q6.g.f4463d;
        f4785a = AbstractC0281b.d("/");
        f4786b = AbstractC0281b.d("\\");
        f4787c = AbstractC0281b.d("/\\");
        f4788d = AbstractC0281b.d(".");
        f4789e = AbstractC0281b.d("..");
    }

    public static final int a(o oVar) {
        if (oVar.f4481a.c() == 0) {
            return -1;
        }
        Q6.g gVar = oVar.f4481a;
        if (gVar.h(0) != 47) {
            if (gVar.h(0) == 92) {
                if (gVar.c() > 2 && gVar.h(1) == 92) {
                    Q6.g other = f4786b;
                    j.e(other, "other");
                    int e7 = gVar.e(other.f4464a, 2);
                    if (e7 == -1) {
                        return gVar.c();
                    }
                    return e7;
                }
            } else if (gVar.c() <= 2 || gVar.h(1) != 58 || gVar.h(2) != 92) {
                return -1;
            } else {
                char h8 = (char) gVar.h(0);
                if (('a' > h8 || h8 >= '{') && ('A' > h8 || h8 >= '[')) {
                    return -1;
                }
                return 3;
            }
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Q6.e, java.lang.Object] */
    public static final o b(o oVar, o child, boolean z7) {
        j.e(oVar, "<this>");
        j.e(child, "child");
        if (a(child) != -1 || child.g() != null) {
            return child;
        }
        Q6.g c8 = c(oVar);
        if (c8 == null && (c8 = c(child)) == null) {
            c8 = f(o.f4480b);
        }
        ?? obj = new Object();
        obj.v(oVar.f4481a);
        if (obj.f4462b > 0) {
            obj.v(c8);
        }
        obj.v(child.f4481a);
        return d(obj, z7);
    }

    public static final Q6.g c(o oVar) {
        Q6.g gVar = oVar.f4481a;
        Q6.g gVar2 = f4785a;
        if (Q6.g.f(gVar, gVar2) == -1) {
            Q6.g gVar3 = f4786b;
            if (Q6.g.f(oVar.f4481a, gVar3) == -1) {
                return null;
            }
            return gVar3;
        }
        return gVar2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Q6.e, java.lang.Object] */
    public static final o d(Q6.e eVar, boolean z7) {
        Q6.g gVar;
        boolean z8;
        Q6.g gVar2;
        char c8;
        boolean z9;
        Q6.g gVar3;
        Q6.g n7;
        ?? obj = new Object();
        Q6.g gVar4 = null;
        int i7 = 0;
        while (true) {
            if (!eVar.g(f4785a)) {
                gVar = f4786b;
                if (!eVar.g(gVar)) {
                    break;
                }
            }
            byte j = eVar.j();
            if (gVar4 == null) {
                gVar4 = e(j);
            }
            i7++;
        }
        if (i7 >= 2 && j.a(gVar4, gVar)) {
            z8 = true;
        } else {
            z8 = false;
        }
        Q6.g gVar5 = f4787c;
        if (z8) {
            j.b(gVar4);
            obj.v(gVar4);
            obj.v(gVar4);
        } else if (i7 > 0) {
            j.b(gVar4);
            obj.v(gVar4);
        } else {
            long d7 = eVar.d(gVar5);
            if (gVar4 == null) {
                if (d7 == -1) {
                    gVar4 = f(o.f4480b);
                } else {
                    gVar4 = e(eVar.c(d7));
                }
            }
            if (!j.a(gVar4, gVar)) {
                gVar2 = gVar4;
            } else {
                gVar2 = gVar4;
                if (eVar.f4462b >= 2 && eVar.c(1L) == 58 && (('a' <= (c8 = (char) eVar.c(0L)) && c8 < '{') || ('A' <= c8 && c8 < '['))) {
                    if (d7 == 2) {
                        obj.l(eVar, 3L);
                    } else {
                        obj.l(eVar, 2L);
                    }
                }
            }
            gVar4 = gVar2;
        }
        if (obj.f4462b > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean b5 = eVar.b();
            gVar3 = f4788d;
            if (b5) {
                break;
            }
            long d8 = eVar.d(gVar5);
            if (d8 == -1) {
                n7 = eVar.n(eVar.f4462b);
            } else {
                n7 = eVar.n(d8);
                eVar.j();
            }
            Q6.g gVar6 = f4789e;
            if (j.a(n7, gVar6)) {
                if (!z9 || !arrayList.isEmpty()) {
                    if (z7 && (z9 || (!arrayList.isEmpty() && !j.a(AbstractC1447h.S(arrayList), gVar6)))) {
                        if ((!z8 || arrayList.size() != 1) && !arrayList.isEmpty()) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    } else {
                        arrayList.add(n7);
                    }
                }
            } else if (!j.a(n7, gVar3) && !j.a(n7, Q6.g.f4463d)) {
                arrayList.add(n7);
            }
        }
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (i8 > 0) {
                obj.v(gVar4);
            }
            obj.v((Q6.g) arrayList.get(i8));
        }
        if (obj.f4462b == 0) {
            obj.v(gVar3);
        }
        return new o(obj.n(obj.f4462b));
    }

    public static final Q6.g e(byte b5) {
        if (b5 != 47) {
            if (b5 == 92) {
                return f4786b;
            }
            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(b5, "not a directory separator: "));
        }
        return f4785a;
    }

    public static final Q6.g f(String str) {
        if (j.a(str, "/")) {
            return f4785a;
        }
        if (j.a(str, "\\")) {
            return f4786b;
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.h("not a directory separator: ", str));
    }
}
