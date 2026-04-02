package com.google.firebase.firestore;

import D.AbstractC0055e;
import a6.t0;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public final FirebaseFirestore f9843a;

    /* renamed from: b  reason: collision with root package name */
    public final q4.h f9844b;

    /* renamed from: c  reason: collision with root package name */
    public final q4.n f9845c;

    /* renamed from: d  reason: collision with root package name */
    public final m0 f9846d;

    public r(FirebaseFirestore firebaseFirestore, q4.h hVar, q4.n nVar, boolean z7, boolean z8) {
        firebaseFirestore.getClass();
        this.f9843a = firebaseFirestore;
        hVar.getClass();
        this.f9844b = hVar;
        this.f9845c = nVar;
        this.f9846d = new m0(z8, z7);
    }

    public HashMap a(EnumC0815q enumC0815q) {
        AbstractC0055e.b(enumC0815q, "Provided serverTimestampBehavior value must not be null.");
        t0 t0Var = new t0(9, this.f9843a, enumC0815q);
        q4.n nVar = this.f9845c;
        if (nVar == null) {
            return null;
        }
        return t0Var.p(nVar.f15366e.b().N().y());
    }

    public Map b() {
        return a(EnumC0815q.DEFAULT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f9843a.equals(rVar.f9843a) && this.f9844b.equals(rVar.f9844b) && this.f9846d.equals(rVar.f9846d)) {
            q4.n nVar = rVar.f9845c;
            q4.n nVar2 = this.f9845c;
            if (nVar2 == null) {
                if (nVar == null) {
                    return true;
                }
            } else if (nVar != null && nVar2.f15366e.equals(nVar.f15366e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (this.f9844b.f15357a.hashCode() + (this.f9843a.hashCode() * 31)) * 31;
        int i8 = 0;
        q4.n nVar = this.f9845c;
        if (nVar != null) {
            i7 = nVar.f15362a.f15357a.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = (hashCode + i7) * 31;
        if (nVar != null) {
            i8 = nVar.f15366e.hashCode();
        }
        return this.f9846d.hashCode() + ((i9 + i8) * 31);
    }

    public final String toString() {
        return "DocumentSnapshot{key=" + this.f9844b + ", metadata=" + this.f9846d + ", doc=" + this.f9845c + '}';
    }
}
