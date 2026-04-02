package T5;

import android.content.Context;
import android.util.Log;
import f5.C0993a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m6.AbstractC1447h;
import o6.EnumC1565a;
import t0.C1805d;
import t0.C1807f;
/* loaded from: classes.dex */
public final class K implements H5.b, InterfaceC0348g {

    /* renamed from: a  reason: collision with root package name */
    public Context f5417a;

    /* renamed from: b  reason: collision with root package name */
    public R1.j f5418b;

    /* renamed from: c  reason: collision with root package name */
    public final C0993a f5419c = new C0993a(10);

    public static final Object a(K k2, String str, String str2, p6.i iVar) {
        k2.getClass();
        C1805d c1805d = new C1805d(str);
        Context context = k2.f5417a;
        if (context != null) {
            Object g3 = L.a(context).g(new C1807f(new C0352k(c1805d, str2, null), null), iVar);
            if (g3 != EnumC1565a.COROUTINE_SUSPENDED) {
                return l6.j.f13876a;
            }
            return g3;
        }
        kotlin.jvm.internal.j.g("context");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00cd -> B:36:0x00d0). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(T5.K r11, java.util.List r12, p6.AbstractC1700c r13) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.K.b(T5.K, java.util.List, p6.c):java.lang.Object");
    }

    @Override // T5.InterfaceC0348g
    public final Map B(List list, C0349h c0349h) {
        return (Map) F6.H.u(new C0353l(this, list, null));
    }

    @Override // T5.InterfaceC0348g
    public final void C(String str, String str2, C0349h c0349h) {
        F6.H.u(new J(this, str, str2, null));
    }

    @Override // T5.InterfaceC0348g
    public final List G(List list, C0349h c0349h) {
        return AbstractC1447h.Y(((Map) F6.H.u(new u(this, list, null))).keySet());
    }

    @Override // T5.InterfaceC0348g
    public final void J(String str, List list, C0349h c0349h) {
        F6.H.u(new D(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f5419c.h(list)), null));
    }

    @Override // T5.InterfaceC0348g
    public final ArrayList P(String str, C0349h c0349h) {
        List list;
        String Z6 = Z(str, c0349h);
        ArrayList arrayList = null;
        if (Z6 != null && !E6.m.e0(Z6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && E6.m.e0(Z6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && (list = (List) L.c(Z6, this.f5419c)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.r, java.lang.Object] */
    @Override // T5.InterfaceC0348g
    public final Long R(String str, C0349h c0349h) {
        ?? obj = new Object();
        F6.H.u(new t(str, this, obj, null));
        return (Long) obj.f13796a;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.r, java.lang.Object] */
    @Override // T5.InterfaceC0348g
    public final Double U(String str, C0349h c0349h) {
        ?? obj = new Object();
        F6.H.u(new r(str, this, obj, null));
        return (Double) obj.f13796a;
    }

    @Override // T5.InterfaceC0348g
    public final void W(String str, boolean z7, C0349h c0349h) {
        F6.H.u(new C(str, this, z7, null));
    }

    @Override // T5.InterfaceC0348g
    public final void Y(String str, double d7, C0349h c0349h) {
        F6.H.u(new F(str, this, d7, null));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.r, java.lang.Object] */
    @Override // T5.InterfaceC0348g
    public final String Z(String str, C0349h c0349h) {
        ?? obj = new Object();
        F6.H.u(new x(str, this, obj, null));
        return (String) obj.f13796a;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.r, java.lang.Object] */
    @Override // T5.InterfaceC0348g
    public final Boolean a0(String str, C0349h c0349h) {
        ?? obj = new Object();
        F6.H.u(new C0357p(str, this, obj, null));
        return (Boolean) obj.f13796a;
    }

    @Override // T5.InterfaceC0348g
    public final P l(String str, C0349h c0349h) {
        P p7;
        String Z6 = Z(str, c0349h);
        if (Z6 == null) {
            return null;
        }
        if (E6.m.e0(Z6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new P(Z6, N.JSON_ENCODED);
        }
        if (E6.m.e0(Z6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            p7 = new P(null, N.PLATFORM_ENCODED);
        } else {
            p7 = new P(null, N.UNEXPECTED_STRING);
        }
        return p7;
    }

    @Override // T5.InterfaceC0348g
    public final void m(String str, long j, C0349h c0349h) {
        F6.H.u(new I(str, this, j, null));
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a binding) {
        kotlin.jvm.internal.j.e(binding, "binding");
        L5.f fVar = binding.f2030b;
        kotlin.jvm.internal.j.d(fVar, "binding.binaryMessenger");
        Context context = binding.f2029a;
        kotlin.jvm.internal.j.d(context, "binding.applicationContext");
        this.f5417a = context;
        try {
            InterfaceC0348g.f5435n.getClass();
            C0347f.b(fVar, this, "data_store");
            this.f5418b = new R1.j(fVar, context, this.f5419c);
        } catch (Exception e7) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e7);
        }
        new C0342a().onAttachedToEngine(binding);
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a binding) {
        kotlin.jvm.internal.j.e(binding, "binding");
        L5.f fVar = binding.f2030b;
        kotlin.jvm.internal.j.d(fVar, "binding.binaryMessenger");
        InterfaceC0348g.f5435n.getClass();
        C0347f.b(fVar, null, "data_store");
        R1.j jVar = this.f5418b;
        if (jVar != null) {
            C0347f.b((L5.f) jVar.f4682b, null, "shared_preferences");
        }
        this.f5418b = null;
    }

    @Override // T5.InterfaceC0348g
    public final void p(String str, String str2, C0349h c0349h) {
        F6.H.u(new G(this, str, str2, null));
    }

    @Override // T5.InterfaceC0348g
    public final void q(List list, C0349h c0349h) {
        F6.H.u(new C0351j(this, list, null));
    }
}
