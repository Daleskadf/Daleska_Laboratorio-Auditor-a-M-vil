package com.google.android.gms.internal.maps;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbc extends zzaz {
    static final zzaz zza = new zzbc(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzbc(Object[] objArr, int i7) {
        this.zzb = objArr;
        this.zzc = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzas.zza(i7, this.zzc, "index");
        Object obj = this.zzb[i7];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzaz, com.google.android.gms.internal.maps.zzaw
    public final int zza(Object[] objArr, int i7) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final Object[] zze() {
        return this.zzb;
    }
}
