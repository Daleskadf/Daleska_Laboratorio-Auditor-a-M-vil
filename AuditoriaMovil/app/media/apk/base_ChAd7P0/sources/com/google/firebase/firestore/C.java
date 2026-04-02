package com.google.firebase.firestore;

import j$.util.Objects;
import n4.EnumC1528n;
/* loaded from: classes.dex */
public final class C extends D {

    /* renamed from: a  reason: collision with root package name */
    public final C0818u f9741a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC1528n f9742b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f9743c;

    public C(C0818u c0818u, EnumC1528n enumC1528n, Object obj) {
        this.f9741a = c0818u;
        this.f9742b = enumC1528n;
        this.f9743c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        C c8 = (C) obj;
        if (this.f9742b == c8.f9742b && Objects.equals(this.f9741a, c8.f9741a) && Objects.equals(this.f9743c, c8.f9743c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9 = 0;
        C0818u c0818u = this.f9741a;
        if (c0818u != null) {
            i7 = c0818u.f9851a.hashCode();
        } else {
            i7 = 0;
        }
        int i10 = i7 * 31;
        EnumC1528n enumC1528n = this.f9742b;
        if (enumC1528n != null) {
            i8 = enumC1528n.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i10 + i8) * 31;
        Object obj = this.f9743c;
        if (obj != null) {
            i9 = obj.hashCode();
        }
        return i11 + i9;
    }
}
