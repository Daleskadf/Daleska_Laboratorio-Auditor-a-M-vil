package com.google.firebase.firestore;
/* renamed from: com.google.firebase.firestore.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810l {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC0809k f9820a;

    /* renamed from: b  reason: collision with root package name */
    public final h0 f9821b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9822c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9823d;

    public C0810l(h0 h0Var, EnumC0809k enumC0809k, int i7, int i8) {
        this.f9820a = enumC0809k;
        this.f9821b = h0Var;
        this.f9822c = i7;
        this.f9823d = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0810l)) {
            return false;
        }
        C0810l c0810l = (C0810l) obj;
        if (!this.f9820a.equals(c0810l.f9820a) || !this.f9821b.equals(c0810l.f9821b) || this.f9822c != c0810l.f9822c || this.f9823d != c0810l.f9823d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f9821b.hashCode() + (this.f9820a.hashCode() * 31)) * 31) + this.f9822c) * 31) + this.f9823d;
    }
}
