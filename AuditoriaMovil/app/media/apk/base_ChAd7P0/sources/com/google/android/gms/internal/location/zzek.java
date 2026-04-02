package com.google.android.gms.internal.location;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import m5.d;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p3.InterfaceC1669i;
/* loaded from: classes.dex */
public final class zzek extends a implements InterfaceC1669i {
    public static final Parcelable.Creator<zzek> CREATOR = new zzel();
    private final String zza;
    private final long zzb;
    private final short zzc;
    private final double zzd;
    private final double zze;
    private final float zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;

    public zzek(String str, int i7, short s7, double d7, double d8, float f, long j, int i8, int i9) {
        if (str != null && str.length() <= 100) {
            if (f > 0.0f) {
                if (d7 <= 90.0d && d7 >= -90.0d) {
                    if (d8 <= 180.0d && d8 >= -180.0d) {
                        int i10 = i7 & 7;
                        if (i10 != 0) {
                            this.zzc = s7;
                            this.zza = str;
                            this.zzd = d7;
                            this.zze = d8;
                            this.zzf = f;
                            this.zzb = j;
                            this.zzg = i10;
                            this.zzh = i8;
                            this.zzi = i9;
                            return;
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 35);
                        sb.append("No supported transition specified: ");
                        sb.append(i7);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(d8).length() + 19);
                    sb2.append("invalid longitude: ");
                    sb2.append(d8);
                    throw new IllegalArgumentException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(d7).length() + 18);
                sb3.append("invalid latitude: ");
                sb3.append(d7);
                throw new IllegalArgumentException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder(String.valueOf(f).length() + 16);
            sb4.append("invalid radius: ");
            sb4.append(f);
            throw new IllegalArgumentException(sb4.toString());
        }
        throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(str)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzek) {
            zzek zzekVar = (zzek) obj;
            if (this.zzf == zzekVar.zzf && this.zzd == zzekVar.zzd && this.zze == zzekVar.zze && this.zzc == zzekVar.zzc && this.zzg == zzekVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final long getExpirationTime() {
        return this.zzb;
    }

    public final double getLatitude() {
        return this.zzd;
    }

    public final int getLoiteringDelay() {
        return this.zzi;
    }

    public final double getLongitude() {
        return this.zze;
    }

    public final int getNotificationResponsiveness() {
        return this.zzh;
    }

    public final float getRadius() {
        return this.zzf;
    }

    public final String getRequestId() {
        return this.zza;
    }

    public final int getTransitionTypes() {
        return this.zzg;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zzd);
        long j = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((Float.floatToIntBits(this.zzf) + ((((((int) j) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        String str;
        short s7 = this.zzc;
        Locale locale = Locale.US;
        if (s7 != -1) {
            if (s7 != 1) {
                str = "UNKNOWN";
            } else {
                str = "CIRCLE";
            }
        } else {
            str = "INVALID";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / PipesIterator.DEFAULT_QUEUE_SIZE), Integer.valueOf(this.zzi), Long.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int G2 = d.G(20293, parcel);
        d.B(parcel, 1, str, false);
        long j = this.zzb;
        d.K(parcel, 2, 8);
        parcel.writeLong(j);
        short s7 = this.zzc;
        d.K(parcel, 3, 4);
        parcel.writeInt(s7);
        double d7 = this.zzd;
        d.K(parcel, 4, 8);
        parcel.writeDouble(d7);
        double d8 = this.zze;
        d.K(parcel, 5, 8);
        parcel.writeDouble(d8);
        float f = this.zzf;
        d.K(parcel, 6, 4);
        parcel.writeFloat(f);
        int i8 = this.zzg;
        d.K(parcel, 7, 4);
        parcel.writeInt(i8);
        int i9 = this.zzh;
        d.K(parcel, 8, 4);
        parcel.writeInt(i9);
        int i10 = this.zzi;
        d.K(parcel, 9, 4);
        parcel.writeInt(i10);
        d.J(G2, parcel);
    }
}
