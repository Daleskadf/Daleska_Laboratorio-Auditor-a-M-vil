package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.common.api.f;
/* loaded from: classes.dex */
final class zzdh extends zzdj {
    private int zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzdh(byte[] bArr, int i7, int i8, boolean z7, zzdg zzdgVar) {
        super(null);
        this.zzd = f.API_PRIORITY_OTHER;
        this.zzb = 0;
    }

    public final int zza(int i7) {
        int i8 = this.zzd;
        this.zzd = 0;
        int i9 = this.zzb + this.zzc;
        this.zzb = i9;
        if (i9 > 0) {
            this.zzc = i9;
            this.zzb = 0;
        } else {
            this.zzc = 0;
        }
        return i8;
    }
}
