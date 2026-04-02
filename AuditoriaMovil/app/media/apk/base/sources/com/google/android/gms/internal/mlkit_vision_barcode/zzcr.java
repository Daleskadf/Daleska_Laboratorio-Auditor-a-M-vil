package com.google.android.gms.internal.mlkit_vision_barcode;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcr extends zzcs {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzcs zzc;

    public zzcr(zzcs zzcsVar, int i7, int i8) {
        this.zzc = zzcsVar;
        this.zza = i7;
        this.zzb = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzaz.zza(i7, this.zzb, "index");
        return this.zzc.get(i7 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcs, java.util.List
    /* renamed from: zzf */
    public final zzcs subList(int i7, int i8) {
        zzaz.zze(i7, i8, this.zzb);
        int i9 = this.zza;
        return this.zzc.subList(i7 + i9, i8 + i9);
    }
}
