package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzap extends a {
    public static final Parcelable.Creator<zzap> CREATOR = new zzbi();
    private final zzat zza;
    private final String zzb;
    private final String zzc;
    private final zzau[] zzd;
    private final zzar[] zze;
    private final String[] zzf;
    private final zzam[] zzg;

    public zzap(zzat zzatVar, String str, String str2, zzau[] zzauVarArr, zzar[] zzarVarArr, String[] strArr, zzam[] zzamVarArr) {
        this.zza = zzatVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzauVarArr;
        this.zze = zzarVarArr;
        this.zzf = strArr;
        this.zzg = zzamVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        zzat zzatVar = this.zza;
        int G2 = d.G(20293, parcel);
        d.A(parcel, 1, zzatVar, i7, false);
        d.B(parcel, 2, this.zzb, false);
        d.B(parcel, 3, this.zzc, false);
        d.E(parcel, 4, this.zzd, i7);
        d.E(parcel, 5, this.zze, i7);
        d.C(parcel, 6, this.zzf, false);
        d.E(parcel, 7, this.zzg, i7);
        d.J(G2, parcel);
    }
}
