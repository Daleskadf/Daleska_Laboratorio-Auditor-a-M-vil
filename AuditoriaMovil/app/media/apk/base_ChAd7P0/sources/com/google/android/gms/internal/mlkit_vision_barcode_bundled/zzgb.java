package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
final class zzgb implements Iterator {
    private final ArrayDeque zza;
    private zzdd zzb;

    public /* synthetic */ zzgb(zzdf zzdfVar, zzga zzgaVar) {
        zzdf zzdfVar2;
        if (zzdfVar instanceof zzgd) {
            zzgd zzgdVar = (zzgd) zzdfVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzgdVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgdVar);
            zzdfVar2 = zzgdVar.zzd;
            this.zzb = zzb(zzdfVar2);
            return;
        }
        this.zza = null;
        this.zzb = (zzdd) zzdfVar;
    }

    private final zzdd zzb(zzdf zzdfVar) {
        while (zzdfVar instanceof zzgd) {
            zzgd zzgdVar = (zzgd) zzdfVar;
            this.zza.push(zzgdVar);
            zzdfVar = zzgdVar.zzd;
        }
        return (zzdd) zzdfVar;
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
    public final zzdd next() {
        zzdd zzddVar;
        zzdf zzdfVar;
        zzdd zzddVar2 = this.zzb;
        if (zzddVar2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzddVar = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                zzdfVar = ((zzgd) this.zza.pop()).zze;
                zzddVar = zzb(zzdfVar);
            } while (zzddVar.zzd() == 0);
            this.zzb = zzddVar;
            return zzddVar2;
        }
        throw new NoSuchElementException();
    }
}
