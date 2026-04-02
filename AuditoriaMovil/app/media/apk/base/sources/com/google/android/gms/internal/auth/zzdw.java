package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
final class zzdw extends zzdy {
    final /* synthetic */ zzef zza;
    private int zzb = 0;
    private final int zzc;

    public zzdw(zzef zzefVar) {
        this.zza = zzefVar;
        this.zzc = zzefVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzea
    public final byte zza() {
        int i7 = this.zzb;
        if (i7 < this.zzc) {
            this.zzb = i7 + 1;
            return this.zza.zzb(i7);
        }
        throw new NoSuchElementException();
    }
}
