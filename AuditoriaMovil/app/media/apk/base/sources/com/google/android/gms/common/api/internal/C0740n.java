package com.google.android.gms.common.api.internal;
/* renamed from: com.google.android.gms.common.api.internal.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740n {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9267a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9268b;

    public C0740n(Object obj, String str) {
        this.f9267a = obj;
        this.f9268b = str;
    }

    public final String a() {
        int identityHashCode = System.identityHashCode(this.f9267a);
        return this.f9268b + "@" + identityHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0740n)) {
            return false;
        }
        C0740n c0740n = (C0740n) obj;
        if (this.f9267a == c0740n.f9267a && this.f9268b.equals(c0740n.f9268b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9268b.hashCode() + (System.identityHashCode(this.f9267a) * 31);
    }
}
