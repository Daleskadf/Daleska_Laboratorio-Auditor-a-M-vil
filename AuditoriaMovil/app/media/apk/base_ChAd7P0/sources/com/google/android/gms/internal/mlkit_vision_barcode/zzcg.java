package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;
/* loaded from: classes.dex */
final class zzcg extends zzbs {
    final /* synthetic */ zzci zza;
    private final Object zzb;
    private int zzc;

    public zzcg(zzci zzciVar, int i7) {
        this.zza = zzciVar;
        this.zzb = zzci.zzg(zzciVar, i7);
        this.zzc = i7;
    }

    private final void zza() {
        int zzw;
        int i7 = this.zzc;
        if (i7 != -1 && i7 < this.zza.size() && zzax.zza(this.zzb, zzci.zzg(this.zza, this.zzc))) {
            return;
        }
        zzw = this.zza.zzw(this.zzb);
        this.zzc = zzw;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbs, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbs, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i7 = this.zzc;
        if (i7 == -1) {
            return null;
        }
        return zzci.zzj(this.zza, i7);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbs, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i7 = this.zzc;
        if (i7 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzci zzciVar = this.zza;
        Object zzj = zzci.zzj(zzciVar, i7);
        zzci.zzn(zzciVar, this.zzc, obj);
        return zzj;
    }
}
