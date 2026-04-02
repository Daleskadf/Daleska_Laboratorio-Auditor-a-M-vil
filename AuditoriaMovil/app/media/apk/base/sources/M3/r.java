package M3;

import f5.C0993a;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final C0993a f3257a = new C0993a(7);

    public static void a(V2.k kVar) {
        Integer num;
        F3.g gVar;
        ArrayList arrayList = new ArrayList();
        P3.a aVar = P3.a.f4016b;
        for (List<F3.p> list : ((ConcurrentHashMap) kVar.f5965b).values()) {
            for (F3.p pVar : list) {
                int i7 = f.f3234a[pVar.f1185d.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            gVar = F3.g.f1168e;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    } else {
                        gVar = F3.g.f1167d;
                    }
                } else {
                    gVar = F3.g.f1166c;
                }
                String str = pVar.f1187g;
                if (str.startsWith("type.googleapis.com/google.crypto.")) {
                    str = str.substring(34);
                }
                arrayList.add(new P3.b(gVar, pVar.f, str, pVar.f1186e.name()));
            }
        }
        F3.p pVar2 = (F3.p) kVar.f5966c;
        if (pVar2 != null) {
            num = Integer.valueOf(pVar2.f);
        } else {
            num = null;
        }
        if (num != null) {
            try {
                int intValue = num.intValue();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((P3.b) it.next()).f4019b == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e7) {
                throw new IllegalStateException(e7);
            }
        }
        DesugarCollections.unmodifiableList(arrayList);
    }
}
