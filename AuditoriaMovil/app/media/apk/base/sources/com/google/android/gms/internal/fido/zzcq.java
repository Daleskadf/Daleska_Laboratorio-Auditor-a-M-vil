package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
final class zzcq extends zzcs {
    final /* synthetic */ zzcz zza;
    private int zzb = 0;
    private final int zzc;

    public zzcq(zzcz zzczVar) {
        this.zza = zzczVar;
        this.zzc = zzczVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzcu
    public final byte zza() {
        int i7 = this.zzb;
        if (i7 < this.zzc) {
            this.zzb = i7 + 1;
            return this.zza.zzb(i7);
        }
        throw new NoSuchElementException();
    }
}
