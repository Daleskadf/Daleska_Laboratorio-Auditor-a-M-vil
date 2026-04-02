package com.google.android.gms.location;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.location.zze;
import com.google.android.gms.internal.location.zzeo;
import f3.AbstractC0992e;
import java.util.Arrays;
import m5.d;
import n3.c0;
import org.apache.tika.utils.StringUtils;
import p3.z;
/* loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new c0(14);

    /* renamed from: X  reason: collision with root package name */
    public float f9426X;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f9427Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f9428Z;

    /* renamed from: a  reason: collision with root package name */
    public int f9429a;

    /* renamed from: b  reason: collision with root package name */
    public long f9430b;

    /* renamed from: c  reason: collision with root package name */
    public long f9431c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9432d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9433e;

    /* renamed from: e0  reason: collision with root package name */
    public final int f9434e0;
    public final int f;

    /* renamed from: f0  reason: collision with root package name */
    public final int f9435f0;

    /* renamed from: g0  reason: collision with root package name */
    public final boolean f9436g0;

    /* renamed from: h0  reason: collision with root package name */
    public final WorkSource f9437h0;

    /* renamed from: i0  reason: collision with root package name */
    public final zze f9438i0;

    public LocationRequest(int i7, long j, long j8, long j9, long j10, long j11, int i8, float f, boolean z7, long j12, int i9, int i10, boolean z8, WorkSource workSource, zze zzeVar) {
        long j13;
        long min;
        this.f9429a = i7;
        if (i7 == 105) {
            this.f9430b = Long.MAX_VALUE;
            j13 = j;
        } else {
            j13 = j;
            this.f9430b = j13;
        }
        this.f9431c = j8;
        this.f9432d = j9;
        if (j10 == Long.MAX_VALUE) {
            min = j11;
        } else {
            min = Math.min(Math.max(1L, j10 - SystemClock.elapsedRealtime()), j11);
        }
        this.f9433e = min;
        this.f = i8;
        this.f9426X = f;
        this.f9427Y = z7;
        this.f9428Z = j12 != -1 ? j12 : j13;
        this.f9434e0 = i9;
        this.f9435f0 = i10;
        this.f9436g0 = z8;
        this.f9437h0 = workSource;
        this.f9438i0 = zzeVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            int i7 = this.f9429a;
            if (i7 == locationRequest.f9429a && ((i7 == 105 || this.f9430b == locationRequest.f9430b) && this.f9431c == locationRequest.f9431c && k() == locationRequest.k() && ((!k() || this.f9432d == locationRequest.f9432d) && this.f9433e == locationRequest.f9433e && this.f == locationRequest.f && this.f9426X == locationRequest.f9426X && this.f9427Y == locationRequest.f9427Y && this.f9434e0 == locationRequest.f9434e0 && this.f9435f0 == locationRequest.f9435f0 && this.f9436g0 == locationRequest.f9436g0 && this.f9437h0.equals(locationRequest.f9437h0) && I.m(this.f9438i0, locationRequest.f9438i0)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9429a), Long.valueOf(this.f9430b), Long.valueOf(this.f9431c), this.f9437h0});
    }

    public final boolean k() {
        long j = this.f9432d;
        return j > 0 && (j >> 1) >= this.f9430b;
    }

    public final String toString() {
        boolean z7;
        String zzb;
        String str;
        StringBuilder l8 = Y.l("Request[");
        int i7 = this.f9429a;
        boolean z8 = false;
        if (i7 == 105) {
            z7 = true;
        } else {
            z7 = false;
        }
        long j = this.f9432d;
        if (z7) {
            l8.append(z.c(i7));
            if (j > 0) {
                l8.append("/");
                zzeo.zzc(j, l8);
            }
        } else {
            l8.append("@");
            if (k()) {
                zzeo.zzc(this.f9430b, l8);
                l8.append("/");
                zzeo.zzc(j, l8);
            } else {
                zzeo.zzc(this.f9430b, l8);
            }
            l8.append(StringUtils.SPACE);
            l8.append(z.c(this.f9429a));
        }
        String str2 = "∞";
        if (this.f9429a == 105 || this.f9431c != this.f9430b) {
            l8.append(", minUpdateInterval=");
            long j8 = this.f9431c;
            if (j8 == Long.MAX_VALUE) {
                zzb = "∞";
            } else {
                zzb = zzeo.zzb(j8);
            }
            l8.append(zzb);
        }
        if (this.f9426X > 0.0d) {
            l8.append(", minUpdateDistance=");
            l8.append(this.f9426X);
        }
        if (this.f9429a == 105) {
            z8 = true;
        }
        if (!z8 ? this.f9428Z != this.f9430b : this.f9428Z != Long.MAX_VALUE) {
            l8.append(", maxUpdateAge=");
            long j9 = this.f9428Z;
            if (j9 != Long.MAX_VALUE) {
                str2 = zzeo.zzb(j9);
            }
            l8.append(str2);
        }
        long j10 = this.f9433e;
        if (j10 != Long.MAX_VALUE) {
            l8.append(", duration=");
            zzeo.zzc(j10, l8);
        }
        int i8 = this.f;
        if (i8 != Integer.MAX_VALUE) {
            l8.append(", maxUpdates=");
            l8.append(i8);
        }
        int i9 = this.f9435f0;
        if (i9 != 0) {
            l8.append(", ");
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        str = "THROTTLE_NEVER";
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    str = "THROTTLE_ALWAYS";
                }
            } else {
                str = "THROTTLE_BACKGROUND";
            }
            l8.append(str);
        }
        int i10 = this.f9434e0;
        if (i10 != 0) {
            l8.append(", ");
            l8.append(z.d(i10));
        }
        if (this.f9427Y) {
            l8.append(", waitForAccurateLocation");
        }
        if (this.f9436g0) {
            l8.append(", bypass");
        }
        WorkSource workSource = this.f9437h0;
        if (!AbstractC0992e.a(workSource)) {
            l8.append(", ");
            l8.append(workSource);
        }
        zze zzeVar = this.f9438i0;
        if (zzeVar != null) {
            l8.append(", impersonation=");
            l8.append(zzeVar);
        }
        l8.append(']');
        return l8.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        int i8 = this.f9429a;
        d.K(parcel, 1, 4);
        parcel.writeInt(i8);
        long j = this.f9430b;
        d.K(parcel, 2, 8);
        parcel.writeLong(j);
        long j8 = this.f9431c;
        d.K(parcel, 3, 8);
        parcel.writeLong(j8);
        d.K(parcel, 6, 4);
        parcel.writeInt(this.f);
        float f = this.f9426X;
        d.K(parcel, 7, 4);
        parcel.writeFloat(f);
        d.K(parcel, 8, 8);
        parcel.writeLong(this.f9432d);
        d.K(parcel, 9, 4);
        parcel.writeInt(this.f9427Y ? 1 : 0);
        d.K(parcel, 10, 8);
        parcel.writeLong(this.f9433e);
        long j9 = this.f9428Z;
        d.K(parcel, 11, 8);
        parcel.writeLong(j9);
        d.K(parcel, 12, 4);
        parcel.writeInt(this.f9434e0);
        d.K(parcel, 13, 4);
        parcel.writeInt(this.f9435f0);
        d.K(parcel, 15, 4);
        parcel.writeInt(this.f9436g0 ? 1 : 0);
        d.A(parcel, 16, this.f9437h0, i7, false);
        d.A(parcel, 17, this.f9438i0, i7, false);
        d.J(G2, parcel);
    }
}
