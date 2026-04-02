package com.google.firebase.firestore;

import com.google.protobuf.AbstractC0852m;
/* renamed from: com.google.firebase.firestore.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0806h implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0852m f9810a;

    public C0806h(AbstractC0852m abstractC0852m) {
        this.f9810a = abstractC0852m;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return u4.u.c(this.f9810a, ((C0806h) obj).f9810a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0806h) {
            if (this.f9810a.equals(((C0806h) obj).f9810a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9810a.hashCode();
    }

    public final String toString() {
        return "Blob { bytes=" + u4.u.j(this.f9810a) + " }";
    }
}
