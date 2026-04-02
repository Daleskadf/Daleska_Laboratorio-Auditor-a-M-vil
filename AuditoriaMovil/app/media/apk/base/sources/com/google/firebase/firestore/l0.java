package com.google.firebase.firestore;

import D.AbstractC0055e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final l0 f9824c = new l0(false, null);

    /* renamed from: d  reason: collision with root package name */
    public static final l0 f9825d = new l0(true, null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9826a;

    /* renamed from: b  reason: collision with root package name */
    public final r4.f f9827b;

    public l0(boolean z7, r4.f fVar) {
        boolean z8;
        if (fVar != null && !z7) {
            z8 = false;
        } else {
            z8 = true;
        }
        AbstractC0055e.a("Cannot specify a fieldMask for non-merge sets()", z8, new Object[0]);
        this.f9826a = z7;
        this.f9827b = fVar;
    }

    public static l0 a(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((C0818u) it.next()).f9851a);
        }
        return new l0(true, new r4.f(hashSet));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f9826a != l0Var.f9826a) {
            return false;
        }
        r4.f fVar = l0Var.f9827b;
        r4.f fVar2 = this.f9827b;
        if (fVar2 != null) {
            return fVar2.equals(fVar);
        }
        if (fVar == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = (this.f9826a ? 1 : 0) * 31;
        r4.f fVar = this.f9827b;
        if (fVar != null) {
            i7 = fVar.f15493a.hashCode();
        } else {
            i7 = 0;
        }
        return i8 + i7;
    }
}
