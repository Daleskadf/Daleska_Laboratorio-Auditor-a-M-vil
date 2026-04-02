package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfyg extends zzfyj implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfyg(Map map) {
        zzfwr.zze(map.isEmpty());
        this.zza = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzo(zzfyg zzfygVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfygVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfygVar.zzb -= size;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Collection zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection zzb(Collection collection) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfyj
    final Collection zzf() {
        return new zzfyi(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfyj
    public final Iterator zzg() {
        return new zzfxq(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List zzh(Object obj, List list, @CheckForNull zzfyd zzfydVar) {
        if (list instanceof RandomAccess) {
            return new zzfxz(this, obj, list, zzfydVar);
        }
        return new zzfyf(this, obj, list, zzfydVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfyj
    Map zzj() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zzk() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfxx(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfya(this, (SortedMap) map);
        }
        return new zzfxt(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfyj
    Set zzl() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfxy(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfyb(this, (SortedMap) map);
        }
        return new zzfxw(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zzp() {
        for (Collection collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfyj, com.google.android.gms.internal.ads.zzgal
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            Collection zza = zza();
            if (zza.add(obj2)) {
                this.zzb++;
                this.zza.put(obj, zza);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.zzb++;
            return true;
        } else {
            return false;
        }
    }
}
