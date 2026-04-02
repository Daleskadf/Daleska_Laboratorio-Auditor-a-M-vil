package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhcd implements Iterator {
    private final ArrayDeque zza;
    private zzgye zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhcd(zzgyj zzgyjVar, zzhcc zzhccVar) {
        zzgyj zzgyjVar2;
        if (zzgyjVar instanceof zzhcf) {
            zzhcf zzhcfVar = (zzhcf) zzgyjVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzhcfVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzhcfVar);
            zzgyjVar2 = zzhcfVar.zzd;
            this.zzb = zzb(zzgyjVar2);
            return;
        }
        this.zza = null;
        this.zzb = (zzgye) zzgyjVar;
    }

    private final zzgye zzb(zzgyj zzgyjVar) {
        while (zzgyjVar instanceof zzhcf) {
            zzhcf zzhcfVar = (zzhcf) zzgyjVar;
            this.zza.push(zzhcfVar);
            zzgyjVar = zzhcfVar.zzd;
        }
        return (zzgye) zzgyjVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza */
    public final zzgye next() {
        zzgye zzgyeVar;
        zzgyj zzgyjVar;
        zzgye zzgyeVar2 = this.zzb;
        if (zzgyeVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgyeVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgyjVar = ((zzhcf) this.zza.pop()).zze;
            zzgyeVar = zzb(zzgyjVar);
        } while (zzgyeVar.zzd() == 0);
        this.zzb = zzgyeVar;
        return zzgyeVar2;
    }
}
