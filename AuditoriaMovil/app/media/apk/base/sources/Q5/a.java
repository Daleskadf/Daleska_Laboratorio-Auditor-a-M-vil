package Q5;

import H4.W;
import a.AbstractC0412a;
import com.google.firebase.firestore.C0810l;
import com.google.firebase.firestore.C0814p;
import com.google.firebase.firestore.EnumC0815q;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.InterfaceC0816s;
import com.google.firebase.firestore.J;
import com.google.firebase.firestore.g0;
import com.google.firebase.firestore.j0;
import com.google.firebase.firestore.r;
import java.util.ArrayList;
import java.util.Iterator;
import n4.T;
import q4.n;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0816s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4416a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4417b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4418c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f4416a = i7;
        this.f4418c = obj;
        this.f4417b = obj2;
    }

    @Override // com.google.firebase.firestore.InterfaceC0816s
    public final void a(Object obj, J j) {
        boolean z7;
        r rVar;
        boolean z8;
        switch (this.f4416a) {
            case 0:
                r rVar2 = (r) obj;
                L5.h hVar = (L5.h) this.f4417b;
                b bVar = (b) this.f4418c;
                if (j != null) {
                    bVar.getClass();
                    hVar.b("firebase_firestore", j.getMessage(), W.h(j));
                    hVar.a();
                    bVar.b();
                    return;
                }
                hVar.c(AbstractC0412a.a0(rVar2, bVar.f4421c).b());
                return;
            case 1:
                j0 j0Var = (j0) obj;
                b bVar2 = (b) this.f4418c;
                bVar2.getClass();
                L5.h hVar2 = (L5.h) this.f4417b;
                if (j != null) {
                    hVar2.b("firebase_firestore", j.getMessage(), W.h(j));
                    hVar2.a();
                    bVar2.b();
                    return;
                }
                ArrayList arrayList = new ArrayList(3);
                ArrayList arrayList2 = new ArrayList(j0Var.f().size());
                ArrayList arrayList3 = new ArrayList(j0Var.e().size());
                Iterator it = j0Var.f().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    EnumC0815q enumC0815q = bVar2.f4421c;
                    if (hasNext) {
                        arrayList2.add(AbstractC0412a.a0((r) it.next(), enumC0815q).b());
                    } else {
                        for (C0810l c0810l : j0Var.e()) {
                            arrayList3.add(AbstractC0412a.Z(c0810l, enumC0815q).a());
                        }
                        arrayList.add(arrayList2);
                        arrayList.add(arrayList3);
                        arrayList.add(AbstractC0412a.c0(j0Var.f).b());
                        hVar2.c(arrayList);
                        return;
                    }
                }
            case 2:
                T t7 = (T) obj;
                C0814p c0814p = (C0814p) this.f4418c;
                c0814p.getClass();
                InterfaceC0816s interfaceC0816s = (InterfaceC0816s) this.f4417b;
                if (j != null) {
                    interfaceC0816s.a(null, j);
                    return;
                }
                boolean z9 = true;
                if (t7 != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                m5.d.i("Got event without value or error set", z7, new Object[0]);
                if (t7.f14322b.f15358a.size() > 1) {
                    z9 = false;
                }
                m5.d.i("Too many documents returned on a document query", z9, new Object[0]);
                e4.c cVar = t7.f14322b.f15358a;
                q4.h hVar3 = c0814p.f9838a;
                n nVar = (n) cVar.f(hVar3);
                FirebaseFirestore firebaseFirestore = c0814p.f9839b;
                boolean z10 = t7.f14325e;
                if (nVar != null) {
                    rVar = new r(firebaseFirestore, nVar.f15362a, nVar, z10, t7.f.f10876a.e(nVar.f15362a));
                } else {
                    rVar = new r(firebaseFirestore, hVar3, null, z10, false);
                }
                interfaceC0816s.a(rVar, null);
                return;
            default:
                T t8 = (T) obj;
                g0 g0Var = (g0) this.f4418c;
                g0Var.getClass();
                InterfaceC0816s interfaceC0816s2 = (InterfaceC0816s) this.f4417b;
                if (j != null) {
                    interfaceC0816s2.a(null, j);
                    return;
                }
                if (t8 != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                m5.d.i("Got event without value or error set", z8, new Object[0]);
                interfaceC0816s2.a(new j0(g0Var, t8, g0Var.f9809b), null);
                return;
        }
    }
}
