package com.google.firebase.firestore;
/* loaded from: classes.dex */
public final class Y implements X {

    /* renamed from: a  reason: collision with root package name */
    public Z f9797a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Y.class == obj.getClass()) {
            return this.f9797a.equals(((Y) obj).f9797a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9797a.hashCode();
    }

    public final String toString() {
        return "MemoryCacheSettings{gcSettings=" + this.f9797a + "}";
    }
}
