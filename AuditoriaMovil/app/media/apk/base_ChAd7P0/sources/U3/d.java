package U3;

import android.content.Context;
import c4.C0632a;
import c4.C0638g;
import c4.InterfaceC0635d;
import c4.r;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
import k4.InterfaceC1396b;
import w4.InterfaceC1956b;
import x4.C1997a;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1956b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5740a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5741b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f5742c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f5740a = i7;
        this.f5741b = obj;
        this.f5742c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, M3.q] */
    @Override // w4.InterfaceC1956b
    public final Object get() {
        boolean z7;
        switch (this.f5740a) {
            case 0:
                h hVar = (h) this.f5741b;
                return new C1997a((Context) this.f5742c, hVar.f(), (InterfaceC1396b) hVar.f5752d.a(InterfaceC1396b.class));
            default:
                C0638g c0638g = (C0638g) this.f5741b;
                c0638g.getClass();
                C0632a c0632a = (C0632a) this.f5742c;
                InterfaceC0635d interfaceC0635d = c0632a.f;
                ?? obj = new Object();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                for (c4.j jVar : c0632a.f8377c) {
                    int i7 = jVar.f8399c;
                    if (i7 == 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    int i8 = jVar.f8398b;
                    r rVar = jVar.f8397a;
                    if (z7) {
                        if (i8 == 2) {
                            hashSet4.add(rVar);
                        } else {
                            hashSet.add(rVar);
                        }
                    } else if (i7 == 2) {
                        hashSet3.add(rVar);
                    } else if (i8 == 2) {
                        hashSet5.add(rVar);
                    } else {
                        hashSet2.add(rVar);
                    }
                }
                Set set = c0632a.f8380g;
                if (!set.isEmpty()) {
                    hashSet.add(r.a(InterfaceC1396b.class));
                }
                obj.f3252a = DesugarCollections.unmodifiableSet(hashSet);
                obj.f3254c = DesugarCollections.unmodifiableSet(hashSet2);
                obj.f3255d = DesugarCollections.unmodifiableSet(hashSet3);
                obj.f3256e = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                obj.f = set;
                obj.f3253b = c0638g;
                return interfaceC0635d.d(obj);
        }
    }
}
