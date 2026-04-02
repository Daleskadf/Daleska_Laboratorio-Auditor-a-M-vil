package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcy extends zzcz {
    final /* synthetic */ zzdf zza;
    private int zzb = 0;
    private final int zzc;

    public zzcy(zzdf zzdfVar) {
        this.zza = zzdfVar;
        this.zzc = zzdfVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final byte zza() {
        int i7 = this.zzb;
        if (i7 < this.zzc) {
            this.zzb = i7 + 1;
            return this.zza.zzb(i7);
        }
        throw new NoSuchElementException();
    }
}
