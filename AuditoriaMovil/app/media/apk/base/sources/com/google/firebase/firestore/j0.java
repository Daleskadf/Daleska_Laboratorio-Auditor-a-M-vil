package com.google.firebase.firestore;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n4.C1521g;
import n4.EnumC1520f;
/* loaded from: classes.dex */
public final class j0 implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f9815a;

    /* renamed from: b  reason: collision with root package name */
    public final n4.T f9816b;

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseFirestore f9817c;

    /* renamed from: d  reason: collision with root package name */
    public List f9818d;

    /* renamed from: e  reason: collision with root package name */
    public a0 f9819e;
    public final m0 f;

    public j0(g0 g0Var, n4.T t7, FirebaseFirestore firebaseFirestore) {
        g0Var.getClass();
        this.f9815a = g0Var;
        t7.getClass();
        this.f9816b = t7;
        firebaseFirestore.getClass();
        this.f9817c = firebaseFirestore;
        this.f = new m0(!t7.f.f10876a.isEmpty(), t7.f14325e);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [com.google.firebase.firestore.h0, com.google.firebase.firestore.r] */
    /* JADX WARN: Type inference failed for: r8v17, types: [com.google.firebase.firestore.h0, com.google.firebase.firestore.r] */
    public final List e() {
        EnumC0809k enumC0809k;
        int i7;
        q4.i iVar;
        int i8;
        boolean z7;
        boolean z8;
        boolean z9;
        q4.n nVar;
        boolean z10;
        a0 a0Var = a0.EXCLUDE;
        boolean equals = a0.INCLUDE.equals(a0Var);
        n4.T t7 = this.f9816b;
        if (equals && t7.f14327h) {
            throw new IllegalArgumentException("To include metadata changes with your document changes, you must also pass MetadataChanges.INCLUDE to addSnapshotListener().");
        }
        if (this.f9818d == null || this.f9819e != a0Var) {
            ArrayList arrayList = new ArrayList();
            boolean isEmpty = t7.f14323c.f15358a.isEmpty();
            ArrayList arrayList2 = t7.f14324d;
            FirebaseFirestore firebaseFirestore = this.f9817c;
            e4.e eVar = t7.f;
            boolean z11 = t7.f14325e;
            if (isEmpty) {
                Iterator it = arrayList2.iterator();
                q4.n nVar2 = null;
                int i9 = 0;
                while (it.hasNext()) {
                    C1521g c1521g = (C1521g) it.next();
                    q4.n nVar3 = c1521g.f14339b;
                    int i10 = i9;
                    boolean z12 = z11;
                    Iterator it2 = it;
                    e4.e eVar2 = eVar;
                    ?? rVar = new r(firebaseFirestore, nVar3.f15362a, nVar3, z11, eVar.f10876a.e(nVar3.f15362a));
                    if (c1521g.f14338a == EnumC1520f.ADDED) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    m5.d.i("Invalid added event for first snapshot", z9, new Object[0]);
                    if (nVar2 != null) {
                        nVar = nVar3;
                        if (t7.f14321a.a().compare(nVar2, nVar) >= 0) {
                            z10 = false;
                            m5.d.i("Got added events in wrong order", z10, new Object[0]);
                            i9 = i10 + 1;
                            arrayList.add(new C0810l(rVar, EnumC0809k.ADDED, -1, i10));
                            eVar = eVar2;
                            nVar2 = nVar;
                            z11 = z12;
                            it = it2;
                        }
                    } else {
                        nVar = nVar3;
                    }
                    z10 = true;
                    m5.d.i("Got added events in wrong order", z10, new Object[0]);
                    i9 = i10 + 1;
                    arrayList.add(new C0810l(rVar, EnumC0809k.ADDED, -1, i10));
                    eVar = eVar2;
                    nVar2 = nVar;
                    z11 = z12;
                    it = it2;
                }
            } else {
                Iterator it3 = arrayList2.iterator();
                q4.i iVar2 = t7.f14323c;
                while (it3.hasNext()) {
                    C1521g c1521g2 = (C1521g) it3.next();
                    if (a0Var != a0.EXCLUDE || c1521g2.f14338a != EnumC1520f.METADATA) {
                        q4.n nVar4 = c1521g2.f14339b;
                        ?? rVar2 = new r(firebaseFirestore, nVar4.f15362a, nVar4, z11, eVar.f10876a.e(nVar4.f15362a));
                        int[] iArr = AbstractC0808j.f9814a;
                        EnumC1520f enumC1520f = c1521g2.f14338a;
                        int i11 = iArr[enumC1520f.ordinal()];
                        if (i11 != 1) {
                            if (i11 != 2 && i11 != 3) {
                                if (i11 == 4) {
                                    enumC0809k = EnumC0809k.REMOVED;
                                } else {
                                    throw new IllegalArgumentException("Unknown view change type: " + enumC1520f);
                                }
                            } else {
                                enumC0809k = EnumC0809k.MODIFIED;
                            }
                        } else {
                            enumC0809k = EnumC0809k.ADDED;
                        }
                        if (enumC0809k != EnumC0809k.ADDED) {
                            e4.c cVar = iVar2.f15358a;
                            q4.h hVar = nVar4.f15362a;
                            q4.n nVar5 = (q4.n) cVar.f(hVar);
                            if (nVar5 == null) {
                                i7 = -1;
                            } else {
                                i7 = iVar2.f15359b.f10876a.l(nVar5);
                            }
                            if (i7 >= 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            m5.d.i("Index for document not found", z8, new Object[0]);
                            iVar2 = iVar2.e(hVar);
                        } else {
                            i7 = -1;
                        }
                        if (enumC0809k != EnumC0809k.REMOVED) {
                            iVar2.getClass();
                            q4.h hVar2 = nVar4.f15362a;
                            q4.i e7 = iVar2.e(hVar2);
                            e4.c m7 = e7.f15358a.m(hVar2, nVar4);
                            e4.e e8 = e7.f15359b.e(nVar4);
                            iVar = new q4.i(m7, e8);
                            q4.n nVar6 = (q4.n) m7.f(hVar2);
                            if (nVar6 == null) {
                                i8 = -1;
                            } else {
                                i8 = e8.f10876a.l(nVar6);
                            }
                            if (i8 >= 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            m5.d.i("Index for document not found", z7, new Object[0]);
                        } else {
                            iVar = iVar2;
                            i8 = -1;
                        }
                        arrayList.add(new C0810l(rVar2, enumC0809k, i7, i8));
                        iVar2 = iVar;
                    }
                }
            }
            this.f9818d = DesugarCollections.unmodifiableList(arrayList);
            this.f9819e = a0Var;
        }
        return this.f9818d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f9817c.equals(j0Var.f9817c) && this.f9815a.equals(j0Var.f9815a) && this.f9816b.equals(j0Var.f9816b) && this.f.equals(j0Var.f)) {
            return true;
        }
        return false;
    }

    public final ArrayList f() {
        n4.T t7 = this.f9816b;
        ArrayList arrayList = new ArrayList(t7.f14322b.f15358a.size());
        Iterator it = t7.f14322b.f15359b.iterator();
        while (true) {
            e4.d dVar = (e4.d) it;
            if (((Iterator) dVar.f10875b).hasNext()) {
                q4.n nVar = (q4.n) dVar.next();
                arrayList.add(new r(this.f9817c, nVar.f15362a, nVar, t7.f14325e, t7.f.f10876a.e(nVar.f15362a)));
            } else {
                return arrayList;
            }
        }
    }

    public final int hashCode() {
        int hashCode = this.f9815a.hashCode();
        int hashCode2 = this.f9816b.hashCode();
        return this.f.hashCode() + ((hashCode2 + ((hashCode + (this.f9817c.hashCode() * 31)) * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new i0(this, (e4.d) this.f9816b.f14322b.f15359b.iterator());
    }
}
