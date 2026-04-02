package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzbv implements zzdg {
    private transient Collection zza;
    private transient Set zzb;
    private transient Map zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdg)) {
            return false;
        }
        return zzv().equals(((zzdg) obj).zzv());
    }

    public final int hashCode() {
        return zzv().hashCode();
    }

    public final String toString() {
        return zzv().toString();
    }

    public abstract Collection zzi();

    public abstract Iterator zzl();

    public abstract Map zzo();

    public abstract Set zzp();

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public boolean zzt(Object obj, Object obj2) {
        throw null;
    }

    public final Collection zzu() {
        Collection collection = this.zza;
        if (collection == null) {
            Collection zzi = zzi();
            this.zza = zzi;
            return zzi;
        }
        return collection;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final Map zzv() {
        Map map = this.zzc;
        if (map == null) {
            Map zzo = zzo();
            this.zzc = zzo;
            return zzo;
        }
        return map;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final Set zzw() {
        Set set = this.zzb;
        if (set == null) {
            Set zzp = zzp();
            this.zzb = zzp;
            return zzp;
        }
        return set;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final boolean zzx(Object obj, Object obj2) {
        Collection collection = ((zzbi) zzv()).get(obj);
        if (collection != null && collection.contains(obj2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final boolean zzy(Object obj, Object obj2) {
        Collection collection = ((zzbi) zzv()).get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }
}
