package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakq  reason: invalid package */
/* loaded from: classes.dex */
final class zzakq<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzakr> zza;

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzaln) {
            return this.zza.getValue().zza((zzaln) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzakr zza() {
        return this.zza.getValue();
    }

    private zzakq(Map.Entry<K, zzakr> entry) {
        this.zza = entry;
    }
}
