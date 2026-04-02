package c6;

import a.AbstractC0412a;
import a6.C0472a;
import a6.InterfaceC0484m;
import g6.C1012a;
import j$.util.DesugarCollections;
import j6.AbstractC1371b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class k2 implements p2 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0472a f8879a = new C0472a("io.grpc.internal.GrpcAttributes.securityLevel");

    /* renamed from: b  reason: collision with root package name */
    public static final C0472a f8880b = new C0472a("io.grpc.internal.GrpcAttributes.clientEagAttrs");

    public static I0 n() {
        if (I1.f8477e == null) {
            return new I1();
        }
        return new A.c(25);
    }

    public static Set o(String str, Map map) {
        a6.n0 valueOf;
        boolean z7;
        List c8 = C0.c(str, map);
        if (c8 == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(a6.n0.class);
        for (Object obj : c8) {
            if (obj instanceof Double) {
                Double d7 = (Double) obj;
                int intValue = d7.intValue();
                boolean z8 = false;
                if (intValue == d7.doubleValue()) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                AbstractC0412a.g0(obj, "Status code %s is not integral", z7);
                valueOf = a6.o0.c(intValue).f7183a;
                if (valueOf.c() == d7.intValue()) {
                    z8 = true;
                }
                AbstractC0412a.g0(obj, "Status code %s is not valid", z8);
            } else if (obj instanceof String) {
                try {
                    valueOf = a6.n0.valueOf((String) obj);
                } catch (IllegalArgumentException e7) {
                    throw new RuntimeException("Status code " + obj + " is not valid", e7);
                }
            } else {
                throw new RuntimeException("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
            }
            noneOf.add(valueOf);
        }
        return DesugarCollections.unmodifiableSet(noneOf);
    }

    public static List p(Map map) {
        String h8;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List c8 = C0.c("loadBalancingConfig", map);
            if (c8 == null) {
                c8 = null;
            } else {
                C0.a(c8);
            }
            arrayList.addAll(c8);
        }
        if (arrayList.isEmpty() && (h8 = C0.h("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(h8.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static a6.h0 t(List list, a6.T t7) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i2 i2Var = (i2) it.next();
            String str = i2Var.f8856a;
            a6.S c8 = t7.c(str);
            if (c8 == null) {
                arrayList.add(str);
            } else {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(k2.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                a6.h0 e7 = c8.e(i2Var.f8857b);
                if (e7.f7153a != null) {
                    return e7;
                }
                return new a6.h0(new j2(c8, e7.f7154b));
            }
        }
        a6.o0 o0Var = a6.o0.f7174g;
        return new a6.h0(o0Var.g("None of " + arrayList + " specified by Service Config are available."));
    }

    public static List u(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map.size() == 1) {
                String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
                arrayList.add(new i2(str, C0.g(str, map)));
            } else {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // c6.p2
    public void a(InterfaceC0484m interfaceC0484m) {
        ((AbstractC0655c) this).f8794d.a(interfaceC0484m);
    }

    @Override // c6.p2
    public void e(int i7) {
        d6.l lVar = ((d6.m) this).f10429n;
        lVar.getClass();
        AbstractC1371b.b();
        S4.c cVar = new S4.c(lVar, i7, 1);
        synchronized (lVar.f10421w) {
            cVar.run();
        }
    }

    @Override // c6.p2
    public void flush() {
        InterfaceC0659d0 interfaceC0659d0 = ((AbstractC0655c) this).f8794d;
        if (!interfaceC0659d0.b()) {
            interfaceC0659d0.flush();
        }
    }

    @Override // c6.p2
    public void g(C1012a c1012a) {
        try {
            if (!((AbstractC0655c) this).f8794d.b()) {
                ((AbstractC0655c) this).f8794d.d(c1012a);
            }
        } finally {
            AbstractC0671h0.b(c1012a);
        }
    }

    @Override // c6.p2
    public void l() {
        d6.l lVar = ((d6.m) this).f10429n;
        C0684l1 c0684l1 = lVar.f8774d;
        c0684l1.f8890a = lVar;
        lVar.f8771a = c0684l1;
    }

    public abstract int q();

    public abstract boolean r(h2 h2Var);

    public abstract void s(h2 h2Var);
}
