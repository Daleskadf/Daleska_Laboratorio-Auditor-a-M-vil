package com.google.android.gms.internal.fido;

import java.util.AbstractMap;
/* loaded from: classes.dex */
final class zzbe extends zzaz {
    final /* synthetic */ zzbf zza;

    public zzbe(zzbf zzbfVar) {
        this.zza = zzbfVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        return new AbstractMap.SimpleImmutableEntry(zzbg.zzk(this.zza.zza).zzd.get(i7), zzbg.zze(this.zza.zza).get(i7));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zza.size();
    }
}
