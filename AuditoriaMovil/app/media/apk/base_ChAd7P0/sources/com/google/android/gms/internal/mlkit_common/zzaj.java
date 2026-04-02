package com.google.android.gms.internal.mlkit_common;

import java.util.Set;
/* loaded from: classes.dex */
public abstract class zzaj extends zzab implements Set, j$.util.Set {
    private transient zzaf zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzar.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzas iterator();

    public final zzaf zzf() {
        zzaf zzafVar = this.zza;
        if (zzafVar == null) {
            zzaf zzg = zzg();
            this.zza = zzg;
            return zzg;
        }
        return zzafVar;
    }

    public zzaf zzg() {
        Object[] array = toArray();
        int i7 = zzaf.zzd;
        return zzaf.zzg(array, array.length);
    }
}
