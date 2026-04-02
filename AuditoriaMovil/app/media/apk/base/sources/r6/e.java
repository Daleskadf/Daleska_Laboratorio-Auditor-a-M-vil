package R6;

import Q6.j;
import Q6.o;
import c5.C0639a;
import com.google.firebase.firestore.Z;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: c  reason: collision with root package name */
    public static final o f4792c;

    /* renamed from: b  reason: collision with root package name */
    public final l6.g f4793b;

    static {
        String str = o.f4480b;
        f4792c = Z.s("/", false);
    }

    public e(ClassLoader classLoader) {
        this.f4793b = m5.d.m(new d(classLoader, 0));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [Q6.e, java.lang.Object] */
    @Override // Q6.j
    public final C.e b(o child) {
        o oVar;
        o oVar2;
        o d7;
        kotlin.jvm.internal.j.e(child, "path");
        if (!C0639a.h(child)) {
            return null;
        }
        o oVar3 = f4792c;
        oVar3.getClass();
        kotlin.jvm.internal.j.e(child, "child");
        o b5 = c.b(oVar3, child, true);
        int a7 = c.a(b5);
        Q6.g gVar = b5.f4481a;
        if (a7 == -1) {
            oVar = null;
        } else {
            oVar = new o(gVar.n(0, a7));
        }
        int a8 = c.a(oVar3);
        Q6.g gVar2 = oVar3.f4481a;
        if (a8 == -1) {
            oVar2 = null;
        } else {
            oVar2 = new o(gVar2.n(0, a8));
        }
        if (kotlin.jvm.internal.j.a(oVar, oVar2)) {
            ArrayList a9 = b5.a();
            ArrayList a10 = oVar3.a();
            int min = Math.min(a9.size(), a10.size());
            int i7 = 0;
            while (i7 < min && kotlin.jvm.internal.j.a(a9.get(i7), a10.get(i7))) {
                i7++;
            }
            if (i7 == min && gVar.c() == gVar2.c()) {
                String str = o.f4480b;
                d7 = Z.s(".", false);
            } else if (a10.subList(i7, a10.size()).indexOf(c.f4789e) == -1) {
                ?? obj = new Object();
                Q6.g c8 = c.c(oVar3);
                if (c8 == null && (c8 = c.c(b5)) == null) {
                    c8 = c.f(o.f4480b);
                }
                int size = a10.size();
                for (int i8 = i7; i8 < size; i8++) {
                    obj.v(c.f4789e);
                    obj.v(c8);
                }
                int size2 = a9.size();
                while (i7 < size2) {
                    obj.v((Q6.g) a9.get(i7));
                    obj.v(c8);
                    i7++;
                }
                d7 = c.d(obj, false);
            } else {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + b5 + " and " + oVar3).toString());
            }
            String r7 = d7.f4481a.r();
            for (l6.d dVar : (List) this.f4793b.a()) {
                C.e b7 = ((j) dVar.f13865a).b(((o) dVar.f13866b).d(r7));
                if (b7 != null) {
                    return b7;
                }
            }
            return null;
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + b5 + " and " + oVar3).toString());
    }
}
