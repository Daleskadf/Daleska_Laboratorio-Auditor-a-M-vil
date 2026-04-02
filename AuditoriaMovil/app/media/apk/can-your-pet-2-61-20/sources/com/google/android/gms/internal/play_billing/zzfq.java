package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
final class zzfq implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzfr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfq(zzfr zzfrVar) {
        zzds zzdsVar;
        this.zzb = zzfrVar;
        zzdsVar = zzfrVar.zza;
        this.zza = zzdsVar.iterator();
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
