package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzyb extends X2.a {
    public static final Parcelable.Creator<zzyb> CREATOR = new zzyc();
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final byte[] zzd;
    private final Point[] zze;
    private final int zzf;
    private final zzxu zzg;
    private final zzxx zzh;
    private final zzxy zzi;
    private final zzya zzj;
    private final zzxz zzk;
    private final zzxv zzl;
    private final zzxr zzm;
    private final zzxs zzn;
    private final zzxt zzo;

    public zzyb(int i7, String str, String str2, byte[] bArr, Point[] pointArr, int i8, zzxu zzxuVar, zzxx zzxxVar, zzxy zzxyVar, zzya zzyaVar, zzxz zzxzVar, zzxv zzxvVar, zzxr zzxrVar, zzxs zzxsVar, zzxt zzxtVar) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = pointArr;
        this.zzf = i8;
        this.zzg = zzxuVar;
        this.zzh = zzxxVar;
        this.zzi = zzxyVar;
        this.zzj = zzyaVar;
        this.zzk = zzxzVar;
        this.zzl = zzxvVar;
        this.zzm = zzxrVar;
        this.zzn = zzxsVar;
        this.zzo = zzxtVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        int i8 = this.zza;
        d.K(parcel, 1, 4);
        parcel.writeInt(i8);
        d.B(parcel, 2, this.zzb, false);
        d.B(parcel, 3, this.zzc, false);
        d.r(parcel, 4, this.zzd, false);
        d.E(parcel, 5, this.zze, i7);
        int i9 = this.zzf;
        d.K(parcel, 6, 4);
        parcel.writeInt(i9);
        d.A(parcel, 7, this.zzg, i7, false);
        d.A(parcel, 8, this.zzh, i7, false);
        d.A(parcel, 9, this.zzi, i7, false);
        d.A(parcel, 10, this.zzj, i7, false);
        d.A(parcel, 11, this.zzk, i7, false);
        d.A(parcel, 12, this.zzl, i7, false);
        d.A(parcel, 13, this.zzm, i7, false);
        d.A(parcel, 14, this.zzn, i7, false);
        d.A(parcel, 15, this.zzo, i7, false);
        d.J(G2, parcel);
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzf;
    }

    public final zzxr zzc() {
        return this.zzm;
    }

    public final zzxs zzd() {
        return this.zzn;
    }

    public final zzxt zze() {
        return this.zzo;
    }

    public final zzxu zzf() {
        return this.zzg;
    }

    public final zzxv zzg() {
        return this.zzl;
    }

    public final zzxx zzh() {
        return this.zzh;
    }

    public final zzxy zzi() {
        return this.zzi;
    }

    public final zzxz zzj() {
        return this.zzk;
    }

    public final zzya zzk() {
        return this.zzj;
    }

    public final String zzl() {
        return this.zzb;
    }

    public final String zzm() {
        return this.zzc;
    }

    public final byte[] zzn() {
        return this.zzd;
    }

    public final Point[] zzo() {
        return this.zze;
    }
}
