package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
final class zzbp extends zzbn implements ListIterator {
    final /* synthetic */ zzbq zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbp(zzbq zzbqVar) {
        super(zzbqVar);
        this.zzd = zzbqVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i7;
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzbr zzbrVar = this.zzd.zzf;
        i7 = zzbrVar.zzb;
        zzbrVar.zzb = i7 + 1;
        if (isEmpty) {
            this.zzd.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbp(zzbq zzbqVar, int i7) {
        super(zzbqVar, ((List) zzbqVar.zzb).listIterator(i7));
        this.zzd = zzbqVar;
    }
}
