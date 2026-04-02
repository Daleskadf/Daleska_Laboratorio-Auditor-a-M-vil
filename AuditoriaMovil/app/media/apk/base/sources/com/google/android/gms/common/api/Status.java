package com.google.android.gms.common.api;

import a6.t0;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class Status extends X2.a implements t, ReflectedParcelable {

    /* renamed from: a  reason: collision with root package name */
    public final int f9153a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9154b;

    /* renamed from: c  reason: collision with root package name */
    public final PendingIntent f9155c;

    /* renamed from: d  reason: collision with root package name */
    public final W2.b f9156d;

    /* renamed from: e  reason: collision with root package name */
    public static final Status f9152e = new Status(0, null, null, null);
    public static final Status f = new Status(14, null, null, null);

    /* renamed from: X  reason: collision with root package name */
    public static final Status f9149X = new Status(8, null, null, null);

    /* renamed from: Y  reason: collision with root package name */
    public static final Status f9150Y = new Status(15, null, null, null);

    /* renamed from: Z  reason: collision with root package name */
    public static final Status f9151Z = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new A(1);

    public Status(int i7, String str, PendingIntent pendingIntent, W2.b bVar) {
        this.f9153a = i7;
        this.f9154b = str;
        this.f9155c = pendingIntent;
        this.f9156d = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f9153a != status.f9153a || !I.m(this.f9154b, status.f9154b) || !I.m(this.f9155c, status.f9155c) || !I.m(this.f9156d, status.f9156d)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9153a), this.f9154b, this.f9155c, this.f9156d});
    }

    public final boolean k() {
        return this.f9153a <= 0;
    }

    public final String toString() {
        t0 t0Var = new t0(this);
        String str = this.f9154b;
        if (str == null) {
            str = p3.z.a(this.f9153a);
        }
        t0Var.m(str, "statusCode");
        t0Var.m(this.f9155c, "resolution");
        return t0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f9153a);
        m5.d.B(parcel, 2, this.f9154b, false);
        m5.d.A(parcel, 3, this.f9155c, i7, false);
        m5.d.A(parcel, 4, this.f9156d, i7, false);
        m5.d.J(G2, parcel);
    }
}
