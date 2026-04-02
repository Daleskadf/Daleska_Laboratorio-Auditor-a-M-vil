package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfyq extends AbstractSet {
    final /* synthetic */ zzfyw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyq(zzfyw zzfywVar) {
        this.zza = zzfywVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        int zzw;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzw = this.zza.zzw(entry.getKey());
            if (zzw != -1 && zzfwl.zza(zzfyw.zzj(this.zza, zzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfyw zzfywVar = this.zza;
        Map zzl = zzfywVar.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new zzfyo(zzfywVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        int zzv;
        Object requireNonNull;
        int[] zzA;
        Object[] zzB;
        Object[] zzC;
        int i;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzfyw zzfywVar = this.zza;
            if (zzfywVar.zzr()) {
                return false;
            }
            zzv = zzfywVar.zzv();
            Object key = entry.getKey();
            Object value = entry.getValue();
            zzfyw zzfywVar2 = this.zza;
            requireNonNull = Objects.requireNonNull(zzfywVar2.zze);
            zzA = zzfywVar2.zzA();
            zzB = zzfywVar2.zzB();
            zzC = zzfywVar2.zzC();
            int zzb = zzfyx.zzb(key, value, zzv, requireNonNull, zzA, zzB, zzC);
            if (zzb != -1) {
                this.zza.zzq(zzb, zzv);
                zzfyw zzfywVar3 = this.zza;
                i = zzfywVar3.zzg;
                zzfywVar3.zzg = i - 1;
                this.zza.zzo();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
