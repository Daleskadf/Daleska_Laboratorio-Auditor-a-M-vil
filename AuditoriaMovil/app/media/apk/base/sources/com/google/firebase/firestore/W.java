package com.google.firebase.firestore;
/* loaded from: classes.dex */
public final class W {

    /* renamed from: g  reason: collision with root package name */
    public static final W f9791g = new W(0, 0, 0, 0, null, V.SUCCESS);

    /* renamed from: a  reason: collision with root package name */
    public final int f9792a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9793b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9794c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9795d;

    /* renamed from: e  reason: collision with root package name */
    public final V f9796e;
    public final J f;

    public W(int i7, int i8, long j, long j8, J j9, V v6) {
        this.f9792a = i7;
        this.f9793b = i8;
        this.f9794c = j;
        this.f9795d = j8;
        this.f9796e = v6;
        this.f = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        W w2 = (W) obj;
        if (this.f9792a != w2.f9792a || this.f9793b != w2.f9793b || this.f9794c != w2.f9794c || this.f9795d != w2.f9795d || this.f9796e != w2.f9796e) {
            return false;
        }
        J j = w2.f;
        J j8 = this.f;
        if (j8 != null) {
            return j8.equals(j);
        }
        if (j == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j = this.f9794c;
        long j8 = this.f9795d;
        int hashCode = (this.f9796e.hashCode() + (((((((this.f9792a * 31) + this.f9793b) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31)) * 31;
        J j9 = this.f;
        if (j9 != null) {
            i7 = j9.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }
}
