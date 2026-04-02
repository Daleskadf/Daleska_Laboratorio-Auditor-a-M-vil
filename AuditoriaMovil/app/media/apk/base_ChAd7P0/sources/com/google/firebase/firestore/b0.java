package com.google.firebase.firestore;
/* loaded from: classes.dex */
public final class b0 implements X {

    /* renamed from: a  reason: collision with root package name */
    public final long f9799a;

    public b0(long j) {
        this.f9799a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass() && this.f9799a == ((b0) obj).f9799a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f9799a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "PersistentCacheSettings{sizeBytes=" + this.f9799a + '}';
    }
}
