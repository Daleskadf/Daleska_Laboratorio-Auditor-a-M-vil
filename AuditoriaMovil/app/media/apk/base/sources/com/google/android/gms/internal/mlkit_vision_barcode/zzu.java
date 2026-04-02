package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzu extends X2.a {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    public int zza;
    public String zzb;
    public String zzc;
    public int zzd;
    public Point[] zze;
    public zzn zzf;
    public zzq zzg;
    public zzr zzh;
    public zzt zzi;
    public zzs zzj;
    public zzo zzk;
    public zzk zzl;
    public zzl zzm;
    public zzm zzn;
    public byte[] zzo;
    public boolean zzp;
    public double zzq;

    public zzu() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        int i8 = this.zza;
        d.K(parcel, 2, 4);
        parcel.writeInt(i8);
        d.B(parcel, 3, this.zzb, false);
        d.B(parcel, 4, this.zzc, false);
        int i9 = this.zzd;
        d.K(parcel, 5, 4);
        parcel.writeInt(i9);
        d.E(parcel, 6, this.zze, i7);
        d.A(parcel, 7, this.zzf, i7, false);
        d.A(parcel, 8, this.zzg, i7, false);
        d.A(parcel, 9, this.zzh, i7, false);
        d.A(parcel, 10, this.zzi, i7, false);
        d.A(parcel, 11, this.zzj, i7, false);
        d.A(parcel, 12, this.zzk, i7, false);
        d.A(parcel, 13, this.zzl, i7, false);
        d.A(parcel, 14, this.zzm, i7, false);
        d.A(parcel, 15, this.zzn, i7, false);
        d.r(parcel, 16, this.zzo, false);
        boolean z7 = this.zzp;
        d.K(parcel, 17, 4);
        parcel.writeInt(z7 ? 1 : 0);
        double d7 = this.zzq;
        d.K(parcel, 18, 8);
        parcel.writeDouble(d7);
        d.J(G2, parcel);
    }

    public zzu(int i7, String str, String str2, int i8, Point[] pointArr, zzn zznVar, zzq zzqVar, zzr zzrVar, zzt zztVar, zzs zzsVar, zzo zzoVar, zzk zzkVar, zzl zzlVar, zzm zzmVar, byte[] bArr, boolean z7, double d7) {
        this.zza = i7;
        this.zzb = str;
        this.zzo = bArr;
        this.zzc = str2;
        this.zzd = i8;
        this.zze = pointArr;
        this.zzp = z7;
        this.zzq = d7;
        this.zzf = zznVar;
        this.zzg = zzqVar;
        this.zzh = zzrVar;
        this.zzi = zztVar;
        this.zzj = zzsVar;
        this.zzk = zzoVar;
        this.zzl = zzkVar;
        this.zzm = zzlVar;
        this.zzn = zzmVar;
    }
}
