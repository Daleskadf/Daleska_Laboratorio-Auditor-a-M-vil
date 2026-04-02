package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzfyd extends AbstractCollection {
    final Object zza;
    Collection zzb;
    @CheckForNull
    final zzfyd zzc;
    @CheckForNull
    final Collection zzd;
    final /* synthetic */ zzfyg zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyd(zzfyg zzfygVar, Object obj, @CheckForNull Collection collection, zzfyd zzfydVar) {
        this.zze = zzfygVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfydVar;
        this.zzd = zzfydVar == null ? null : zzfydVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            zzfyg zzfygVar = this.zze;
            i = zzfygVar.zzb;
            zzfygVar.zzb = i + 1;
            if (isEmpty) {
                zza();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzfyg zzfygVar = this.zze;
            i = zzfygVar.zzb;
            zzfygVar.zzb = i + (size2 - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i;
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzfyg zzfygVar = this.zze;
        i = zzfygVar.zzb;
        zzfygVar.zzb = i - size;
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzfyc(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        int i;
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzfyg zzfygVar = this.zze;
            i = zzfygVar.zzb;
            zzfygVar.zzb = i - 1;
            zzc();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            int size2 = this.zzb.size();
            zzfyg zzfygVar = this.zze;
            int i2 = size2 - size;
            i = zzfygVar.zzb;
            zzfygVar.zzb = i + i2;
            zzc();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        Map map;
        zzfyd zzfydVar = this.zzc;
        if (zzfydVar != null) {
            zzfydVar.zza();
            return;
        }
        zzfyg zzfygVar = this.zze;
        Object obj = this.zza;
        map = zzfygVar.zza;
        map.put(obj, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Map map;
        zzfyd zzfydVar = this.zzc;
        if (zzfydVar != null) {
            zzfydVar.zzb();
            zzfyd zzfydVar2 = this.zzc;
            if (zzfydVar2.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
        } else if (this.zzb.isEmpty()) {
            zzfyg zzfygVar = this.zze;
            Object obj = this.zza;
            map = zzfygVar.zza;
            Collection collection = (Collection) map.get(obj);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        Map map;
        zzfyd zzfydVar = this.zzc;
        if (zzfydVar != null) {
            zzfydVar.zzc();
        } else if (this.zzb.isEmpty()) {
            zzfyg zzfygVar = this.zze;
            Object obj = this.zza;
            map = zzfygVar.zza;
            map.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            int size2 = this.zzb.size();
            zzfyg zzfygVar = this.zze;
            int i2 = size2 - size;
            i = zzfygVar.zzb;
            zzfygVar.zzb = i + i2;
            zzc();
        }
        return retainAll;
    }
}
