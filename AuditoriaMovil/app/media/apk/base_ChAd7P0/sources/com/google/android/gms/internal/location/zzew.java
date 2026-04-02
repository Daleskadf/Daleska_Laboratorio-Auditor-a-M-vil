package com.google.android.gms.internal.location;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzew extends zzex {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzex zzc;

    public zzew(zzex zzexVar, int i7, int i8) {
        this.zzc = zzexVar;
        this.zza = i7;
        this.zzb = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzer.zzc(i7, this.zzb, "index");
        return this.zzc.get(i7 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzex, java.util.List
    /* renamed from: zzh */
    public final zzex subList(int i7, int i8) {
        zzer.zze(i7, i8, this.zzb);
        int i9 = this.zza;
        return this.zzc.subList(i7 + i9, i8 + i9);
    }
}
