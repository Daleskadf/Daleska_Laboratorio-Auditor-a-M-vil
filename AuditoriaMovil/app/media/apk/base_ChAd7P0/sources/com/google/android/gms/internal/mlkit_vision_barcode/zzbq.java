package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzbq extends zzbo implements List {
    final /* synthetic */ zzbr zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbq(zzbr zzbrVar, Object obj, List list, zzbo zzboVar) {
        super(zzbrVar, obj, list, zzboVar);
        this.zzf = zzbrVar;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i7, obj);
        zzbr zzbrVar = this.zzf;
        i8 = zzbrVar.zzb;
        zzbrVar.zzb = i8 + 1;
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        int i8;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i7, collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzbr zzbrVar = this.zzf;
            i8 = zzbrVar.zzb;
            zzbrVar.zzb = i8 + (size2 - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzb();
        return ((List) this.zzb).get(i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzbp(this);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        int i8;
        zzb();
        Object remove = ((List) this.zzb).remove(i7);
        zzbr zzbrVar = this.zzf;
        i8 = zzbrVar.zzb;
        zzbrVar.zzb = i8 - 1;
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        zzb();
        return ((List) this.zzb).set(i7, obj);
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        zzb();
        List subList = ((List) this.zzb).subList(i7, i8);
        zzbo zzboVar = this.zzc;
        if (zzboVar == null) {
            zzboVar = this;
        }
        return this.zzf.zzm(this.zza, subList, zzboVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        zzb();
        return new zzbp(this, i7);
    }
}
