package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
/* loaded from: classes.dex */
public final class Scope extends X2.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new A(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f9147a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9148b;

    public Scope(int i7, String str) {
        I.f(str, "scopeUri must not be null or empty");
        this.f9147a = i7;
        this.f9148b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f9148b.equals(((Scope) obj).f9148b);
    }

    public final int hashCode() {
        return this.f9148b.hashCode();
    }

    public final String toString() {
        return this.f9148b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f9147a);
        m5.d.B(parcel, 2, this.f9148b, false);
        m5.d.J(G2, parcel);
    }
}
