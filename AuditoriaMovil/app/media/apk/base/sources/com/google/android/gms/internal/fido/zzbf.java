package com.google.android.gms.internal.fido;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbf extends zzbb {
    final /* synthetic */ zzbg zza;

    public zzbf(zzbg zzbgVar) {
        this.zza = zzbgVar;
    }

    @Override // com.google.android.gms.internal.fido.zzbc, com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzi().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzbc, com.google.android.gms.internal.fido.zzav
    public final zzcb zzd() {
        return zzi().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzbb
    public final zzba zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzbc
    public final zzaz zzj() {
        return new zzbe(this);
    }
}
