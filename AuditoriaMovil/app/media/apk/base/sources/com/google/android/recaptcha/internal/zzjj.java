package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
/* loaded from: classes.dex */
public final class zzjj extends zzjn implements Serializable {
    final int zza;
    private final Queue zzb;

    private zzjj(int i7) {
        if (i7 >= 0) {
            this.zzb = new ArrayDeque(i7);
            this.zza = i7;
            return;
        }
        throw new IllegalArgumentException(zzji.zza("maxSize (%s) must >= 0", Integer.valueOf(i7)));
    }

    public static zzjj zza(int i7) {
        return new zzjj(i7);
    }

    @Override // com.google.android.recaptcha.internal.zzjl, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzjl, java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean z7;
        int size = collection.size();
        if (size >= this.zza) {
            clear();
            int i7 = size - this.zza;
            if (i7 >= 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            zzjf.zzb(z7, "number to skip cannot be negative");
            return zzjq.zza(this, new zzjp(collection, i7).iterator());
        }
        return zzjq.zza(this, collection.iterator());
    }

    @Override // com.google.android.recaptcha.internal.zzjn, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzjl, com.google.android.recaptcha.internal.zzjm
    public final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzjn, com.google.android.recaptcha.internal.zzjl
    public final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzjn
    public final Queue zzd() {
        return this.zzb;
    }
}
