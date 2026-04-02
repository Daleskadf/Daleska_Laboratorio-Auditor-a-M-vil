package com.google.firebase.firestore;
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9828a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9829b;

    public m0(boolean z7, boolean z8) {
        this.f9828a = z7;
        this.f9829b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (this.f9828a == m0Var.f9828a && this.f9829b == m0Var.f9829b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9828a ? 1 : 0) * 31) + (this.f9829b ? 1 : 0);
    }

    public final String toString() {
        return "SnapshotMetadata{hasPendingWrites=" + this.f9828a + ", isFromCache=" + this.f9829b + '}';
    }
}
