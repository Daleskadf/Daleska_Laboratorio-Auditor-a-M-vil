package com.google.firebase.firestore;

import l4.C1418b;
/* loaded from: classes.dex */
public final class N implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final double f9779a;

    /* renamed from: b  reason: collision with root package name */
    public final double f9780b;

    public N(double d7, double d8) {
        if (!Double.isNaN(d7) && d7 >= -90.0d && d7 <= 90.0d) {
            if (!Double.isNaN(d8) && d8 >= -180.0d && d8 <= 180.0d) {
                this.f9779a = d7;
                this.f9780b = d8;
                return;
            }
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        }
        throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        N n7 = (N) obj;
        double d7 = n7.f9779a;
        C1418b c1418b = u4.u.f16019a;
        int m7 = android.support.v4.media.session.a.m(this.f9779a, d7);
        if (m7 == 0) {
            return android.support.v4.media.session.a.m(this.f9780b, n7.f9780b);
        }
        return m7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n7 = (N) obj;
        if (this.f9779a != n7.f9779a || this.f9780b != n7.f9780b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f9779a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f9780b);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        return "GeoPoint { latitude=" + this.f9779a + ", longitude=" + this.f9780b + " }";
    }
}
