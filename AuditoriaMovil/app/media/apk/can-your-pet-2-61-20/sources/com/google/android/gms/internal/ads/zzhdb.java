package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhdb implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzhdc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhdb(zzhdc zzhdcVar) {
        zzhat zzhatVar;
        this.zzb = zzhdcVar;
        zzhatVar = zzhdcVar.zza;
        this.zza = zzhatVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
