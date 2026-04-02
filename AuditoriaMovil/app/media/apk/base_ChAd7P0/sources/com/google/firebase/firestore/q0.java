package com.google.firebase.firestore;
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f9842a;

    public q0(int i7) {
        this.f9842a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q0.class == obj.getClass() && this.f9842a == ((q0) obj).f9842a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9842a;
    }

    public final String toString() {
        return "TransactionOptions{maxAttempts=" + this.f9842a + '}';
    }
}
