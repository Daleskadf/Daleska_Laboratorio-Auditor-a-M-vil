package com.google.firebase.firestore;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public final double[] f9848a;

    public s0(double[] dArr) {
        this.f9848a = (double[]) dArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s0.class == obj.getClass()) {
            return Arrays.equals(this.f9848a, ((s0) obj).f9848a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9848a);
    }
}
