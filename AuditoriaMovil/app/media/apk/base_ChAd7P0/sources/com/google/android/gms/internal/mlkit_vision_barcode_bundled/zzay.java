package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import X2.a;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzay extends a {
    public static final Parcelable.Creator<zzay> CREATOR = new zzaz();
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final byte[] zzd;
    private final Point[] zze;
    private final int zzf;
    private final zzar zzg;
    private final zzau zzh;
    private final zzav zzi;
    private final zzax zzj;
    private final zzaw zzk;
    private final zzas zzl;
    private final zzao zzm;
    private final zzap zzn;
    private final zzaq zzo;

    public zzay(int i7, String str, String str2, byte[] bArr, Point[] pointArr, int i8, zzar zzarVar, zzau zzauVar, zzav zzavVar, zzax zzaxVar, zzaw zzawVar, zzas zzasVar, zzao zzaoVar, zzap zzapVar, zzaq zzaqVar) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = pointArr;
        this.zzf = i8;
        this.zzg = zzarVar;
        this.zzh = zzauVar;
        this.zzi = zzavVar;
        this.zzj = zzaxVar;
        this.zzk = zzawVar;
        this.zzl = zzasVar;
        this.zzm = zzaoVar;
        this.zzn = zzapVar;
        this.zzo = zzaqVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int G2 = d.G(20293, parcel);
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
}
