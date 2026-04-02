package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcj  reason: invalid package */
/* loaded from: classes.dex */
public final class zzcj {
    static {
        Logger.getLogger(zzcj.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(zzbe.class);
        hashSet.add(zzbk.class);
        hashSet.add(zzcl.class);
        hashSet.add(zzbm.class);
        hashSet.add(zzbj.class);
        hashSet.add(zzcd.class);
        hashSet.add(zzrx.class);
        hashSet.add(zzch.class);
        hashSet.add(zzck.class);
        DesugarCollections.unmodifiableSet(hashSet);
    }

    private zzcj() {
    }

    @Deprecated
    public static zzwb zza(String str, zzaiw zzaiwVar) {
        zzbn<?> zza = zzna.zza().zza(str);
        if (zza instanceof zzci) {
            return ((zzci) zza).zzc(zzaiwVar);
        }
        throw new GeneralSecurityException(AbstractC0059i.M("manager for key type ", str, " is not a PrivateKeyManager"));
    }

    public static Class<?> zza(Class<?> cls) {
        try {
            return zzon.zza().zza(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static <P> P zza(zzwb zzwbVar, Class<P> cls) {
        String zzf = zzwbVar.zzf();
        return zzna.zza().zza(zzf, cls).zzb(zzwbVar.zze());
    }

    public static <B, P> P zza(zzpg<B> zzpgVar, Class<P> cls) {
        return (P) zzon.zza().zza(zzpgVar, cls);
    }
}
