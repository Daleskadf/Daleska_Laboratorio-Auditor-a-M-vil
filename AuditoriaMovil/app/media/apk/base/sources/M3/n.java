package M3;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import p4.InterfaceC1671a;
import s3.C1786n;
/* loaded from: classes.dex */
public final class n implements InterfaceC1671a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f3246a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f3247b;

    public n(int i7) {
        switch (i7) {
            case 1:
                this.f3246a = new HashMap();
                this.f3247b = new HashMap();
                return;
            case 2:
                this.f3246a = new HashMap();
                this.f3247b = new HashMap();
                return;
            default:
                this.f3246a = new HashMap();
                this.f3247b = new HashMap();
                return;
        }
    }

    public void a(m mVar) {
        o oVar = new o(mVar.f3244a, N3.h.class);
        HashMap hashMap = this.f3246a;
        if (hashMap.containsKey(oVar)) {
            m mVar2 = (m) hashMap.get(oVar);
            if (!mVar2.equals(mVar) || !mVar.equals(mVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + oVar);
            }
            return;
        }
        hashMap.put(oVar, mVar);
    }

    public void b(F3.r rVar) {
        if (rVar != null) {
            Class c8 = rVar.c();
            HashMap hashMap = this.f3247b;
            if (hashMap.containsKey(c8)) {
                F3.r rVar2 = (F3.r) hashMap.get(c8);
                if (!rVar2.equals(rVar) || !rVar.equals(rVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + c8);
                }
                return;
            }
            hashMap.put(c8, rVar);
            return;
        }
        throw new NullPointerException("wrapper must be non-null");
    }

    public void c(C1786n c1786n) {
        HashMap hashMap = this.f3247b;
        Object obj = hashMap.get(c1786n);
        hashMap.remove(c1786n);
        this.f3246a.remove(obj);
    }

    @Override // p4.InterfaceC1671a
    public void d(m4.i iVar) {
        this.f3247b.put(iVar.f14046a, iVar);
    }

    @Override // p4.InterfaceC1671a
    public m4.e e(String str) {
        return (m4.e) this.f3246a.get(str);
    }

    @Override // p4.InterfaceC1671a
    public m4.i f(String str) {
        return (m4.i) this.f3247b.get(str);
    }

    @Override // p4.InterfaceC1671a
    public void q(m4.e eVar) {
        this.f3246a.put(eVar.f14030a, eVar);
    }

    public n(p pVar) {
        this.f3246a = new HashMap(pVar.f3250a);
        this.f3247b = new HashMap(pVar.f3251b);
    }
}
