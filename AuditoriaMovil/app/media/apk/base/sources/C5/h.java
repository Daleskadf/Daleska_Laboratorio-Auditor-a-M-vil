package C5;

import B5.AbstractActivityC0032e;
import L5.r;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.o;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f590a = new ArrayList();

    public h(AbstractActivityC0032e abstractActivityC0032e, String[] strArr) {
        F5.d dVar = (F5.d) V2.k.A().f5965b;
        if (!dVar.f1207b) {
            dVar.c(abstractActivityC0032e.getApplicationContext());
            dVar.a(abstractActivityC0032e.getApplicationContext(), strArr);
        }
    }

    public final c a(g gVar) {
        c cVar;
        AbstractActivityC0032e abstractActivityC0032e = (AbstractActivityC0032e) gVar.f587c;
        D5.a aVar = (D5.a) gVar.f588d;
        String str = (String) gVar.f589e;
        List<String> list = (List) gVar.f;
        o oVar = new o();
        boolean z7 = gVar.f585a;
        boolean z8 = gVar.f586b;
        if (aVar == null) {
            F5.d dVar = (F5.d) V2.k.A().f5965b;
            if (dVar.f1207b) {
                aVar = new D5.a((String) ((D5.b) dVar.f1209d).f869c, "main");
            } else {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
        }
        ArrayList arrayList = this.f590a;
        if (arrayList.size() == 0) {
            cVar = new c(abstractActivityC0032e, null, oVar, z7, z8);
            if (str != null) {
                ((r) cVar.f560i.f218b).a("setInitialRoute", str, null);
            }
            cVar.f555c.j(aVar, list);
        } else {
            FlutterJNI flutterJNI = ((c) arrayList.get(0)).f553a;
            if (flutterJNI.isAttached()) {
                cVar = new c(abstractActivityC0032e, flutterJNI.spawn(aVar.f866c, aVar.f865b, str, list), oVar, z7, z8);
            } else {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
        }
        arrayList.add(cVar);
        cVar.f569s.add(new f(this, cVar));
        return cVar;
    }
}
