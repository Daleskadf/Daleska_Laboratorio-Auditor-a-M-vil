package D2;

import V2.k;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final b f848a;

    /* renamed from: b  reason: collision with root package name */
    public final A2.b f849b;

    /* renamed from: c  reason: collision with root package name */
    public final A2.e f850c;

    /* renamed from: d  reason: collision with root package name */
    public final i f851d;

    public h(b bVar, A2.b bVar2, A2.e eVar, i iVar) {
        this.f848a = bVar;
        this.f849b = bVar2;
        this.f850c = eVar;
        this.f851d = iVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, M3.q] */
    public final void a(A2.c cVar) {
        b bVar = this.f848a;
        if (cVar != null) {
            A2.e eVar = this.f850c;
            if (eVar != null) {
                A2.b bVar2 = this.f849b;
                i iVar = this.f851d;
                A2.a aVar = (A2.a) cVar;
                k a7 = b.a();
                String str = bVar.f835a;
                if (str != null) {
                    a7.f5965b = str;
                    A2.d dVar = aVar.f78b;
                    if (dVar != null) {
                        a7.f5967d = dVar;
                        a7.f5966c = bVar.f836b;
                        b a8 = a7.a();
                        ?? obj = new Object();
                        obj.f = new HashMap();
                        obj.f3255d = Long.valueOf(iVar.f853a.o());
                        obj.f3256e = Long.valueOf(iVar.f854b.o());
                        obj.f3252a = "FIREBASE_ML_SDK";
                        obj.f3254c = new e(bVar2, (byte[]) eVar.apply(aVar.f77a));
                        obj.f3253b = null;
                        a k2 = obj.k();
                        H2.b bVar3 = (H2.b) iVar.f855c;
                        bVar3.getClass();
                        bVar3.f1971b.execute(new H2.a(bVar3, a8, k2));
                        return;
                    }
                    throw new NullPointerException("Null priority");
                }
                throw new NullPointerException("Null backendName");
            }
            throw new NullPointerException("Null transformer");
        }
        throw new NullPointerException("Null event");
    }
}
