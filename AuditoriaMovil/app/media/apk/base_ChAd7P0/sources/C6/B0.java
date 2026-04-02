package c6;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class B0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f8429a = Logger.getLogger(B0.class.getName());

    public static Object a(Q4.a aVar) {
        G.i.o("unexpected end of JSON", aVar.q());
        boolean z7 = true;
        switch (A0.f8418a[aVar.D().ordinal()]) {
            case 1:
                aVar.a();
                ArrayList arrayList = new ArrayList();
                while (aVar.q()) {
                    arrayList.add(a(aVar));
                }
                if (aVar.D() != Q4.b.END_ARRAY) {
                    z7 = false;
                }
                G.i.o("Bad token: " + aVar.o(false), z7);
                aVar.g();
                return DesugarCollections.unmodifiableList(arrayList);
            case 2:
                aVar.b();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (aVar.q()) {
                    linkedHashMap.put(aVar.x(), a(aVar));
                }
                if (aVar.D() != Q4.b.END_OBJECT) {
                    z7 = false;
                }
                G.i.o("Bad token: " + aVar.o(false), z7);
                aVar.j();
                return DesugarCollections.unmodifiableMap(linkedHashMap);
            case 3:
                return aVar.B();
            case 4:
                return Double.valueOf(aVar.u());
            case 5:
                return Boolean.valueOf(aVar.t());
            case 6:
                aVar.z();
                return null;
            default:
                throw new IllegalStateException("Bad token: " + aVar.o(false));
        }
    }
}
