package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import org.apache.tika.metadata.TikaCoreProperties;
/* renamed from: com.google.android.gms.common.internal.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758g extends X2.a {
    public static final Parcelable.Creator<C0758g> CREATOR = new android.support.v4.media.session.b(4);

    /* renamed from: a  reason: collision with root package name */
    public final int f9349a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9350b;

    public C0758g(int i7, String str) {
        this.f9349a = i7;
        this.f9350b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0758g)) {
            return false;
        }
        C0758g c0758g = (C0758g) obj;
        if (c0758g.f9349a == this.f9349a && I.m(c0758g.f9350b, this.f9350b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9349a;
    }

    public final String toString() {
        return this.f9349a + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + this.f9350b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f9349a);
        m5.d.B(parcel, 2, this.f9350b, false);
        m5.d.J(G2, parcel);
    }
}
