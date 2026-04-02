package com.google.firebase.firestore;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a  reason: collision with root package name */
    public final String f9769a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9770b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9771c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9772d;

    /* renamed from: e  reason: collision with root package name */
    public final X f9773e;

    public L(K k2) {
        this.f9769a = k2.f9764a;
        this.f9770b = k2.f9765b;
        this.f9771c = k2.f9766c;
        this.f9772d = k2.f9767d;
        this.f9773e = k2.f9768e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L.class != obj.getClass()) {
            return false;
        }
        L l8 = (L) obj;
        if (this.f9770b != l8.f9770b || this.f9771c != l8.f9771c || this.f9772d != l8.f9772d || !this.f9769a.equals(l8.f9769a)) {
            return false;
        }
        return Objects.equals(this.f9773e, l8.f9773e);
    }

    public final int hashCode() {
        int i7;
        long j = this.f9772d;
        int hashCode = ((((((this.f9769a.hashCode() * 31) + (this.f9770b ? 1 : 0)) * 31) + (this.f9771c ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        X x7 = this.f9773e;
        if (x7 != null) {
            i7 = x7.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseFirestoreSettings{host=");
        sb.append(this.f9769a);
        sb.append(", sslEnabled=");
        sb.append(this.f9770b);
        sb.append(", persistenceEnabled=");
        sb.append(this.f9771c);
        sb.append(", cacheSizeBytes=");
        sb.append(this.f9772d);
        sb.append(", cacheSettings=");
        X x7 = this.f9773e;
        sb.append(x7);
        if (sb.toString() == null) {
            return "null";
        }
        return x7.toString() + "}";
    }
}
