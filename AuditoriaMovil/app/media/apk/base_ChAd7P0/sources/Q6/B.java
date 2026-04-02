package Q6;

import com.google.firebase.firestore.Z;
import java.io.IOException;
import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public final class B extends j {

    /* renamed from: e  reason: collision with root package name */
    public static final o f4450e;

    /* renamed from: b  reason: collision with root package name */
    public final o f4451b;

    /* renamed from: c  reason: collision with root package name */
    public final l f4452c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f4453d;

    static {
        String str = o.f4480b;
        f4450e = Z.s("/", false);
    }

    public B(o oVar, l fileSystem, LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.j.e(fileSystem, "fileSystem");
        this.f4451b = oVar;
        this.f4452c = fileSystem;
        this.f4453d = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.r, java.lang.Object] */
    @Override // Q6.j
    public final C.e b(o path) {
        Long valueOf;
        s sVar;
        int d7;
        kotlin.jvm.internal.j.e(path, "path");
        o oVar = f4450e;
        oVar.getClass();
        R6.f fVar = (R6.f) this.f4453d.get(R6.c.b(oVar, path, true));
        Throwable th = null;
        if (fVar == null) {
            return null;
        }
        boolean z7 = fVar.f4795b;
        boolean z8 = !z7;
        if (z7) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(fVar.f4796c);
        }
        C.e eVar = new C.e(z8, z7, valueOf, null, fVar.f4797d, null);
        long j = fVar.f4798e;
        if (j == -1) {
            return eVar;
        }
        k e7 = this.f4452c.e(this.f4451b);
        try {
            sVar = AbstractC0281b.b(e7.c(j));
            try {
                e7.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                e7.close();
            } catch (Throwable th4) {
                j3.f.a(th3, th4);
            }
            sVar = null;
            th = th3;
        }
        if (th == null) {
            kotlin.jvm.internal.j.b(sVar);
            ?? obj = new Object();
            obj.f13796a = (Long) eVar.f;
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            if (sVar.d() == 67324752) {
                sVar.o(2L);
                short j8 = sVar.j();
                int i7 = j8 & 65535;
                if ((j8 & 1) == 0) {
                    sVar.o(18L);
                    sVar.o(sVar.j() & 65535);
                    R6.b.d(sVar, sVar.j() & 65535, new R6.h(sVar, obj, obj2, obj3));
                    Long l8 = (Long) obj.f13796a;
                    Long l9 = (Long) obj2.f13796a;
                    C.e eVar2 = new C.e(eVar.f420b, eVar.f421c, (Long) eVar.f422d, (Long) obj3.f13796a, l8, l9);
                    kotlin.jvm.internal.j.b(eVar2);
                    return eVar2;
                }
                throw new IOException("unsupported zip: general purpose bit flag=" + R6.b.b(i7));
            }
            throw new IOException("bad zip: expected " + R6.b.b(67324752) + " but was " + R6.b.b(d7));
        }
        throw th;
    }
}
