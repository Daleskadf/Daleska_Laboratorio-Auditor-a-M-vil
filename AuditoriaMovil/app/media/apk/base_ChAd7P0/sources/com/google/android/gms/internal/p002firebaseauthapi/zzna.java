package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import io.flutter.plugins.pathprovider.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzna  reason: invalid package */
/* loaded from: classes.dex */
public final class zzna {
    private static final Logger zza = Logger.getLogger(zzna.class.getName());
    private static final zzna zzb = new zzna();
    private ConcurrentMap<String, zzbn<?>> zzc = new ConcurrentHashMap();
    private ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();

    private final synchronized zzbn<?> zzc(String str) {
        if (this.zzc.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.zzc.get(str);
    }

    public final <P> zzbn<P> zza(String str, Class<P> cls) {
        zzbn<P> zzbnVar = (zzbn<P>) zzc(str);
        if (zzbnVar.zza().equals(cls)) {
            return zzbnVar;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzbnVar.getClass());
        String valueOf2 = String.valueOf(zzbnVar.zza());
        StringBuilder l8 = b.l("Primitive type ", name, " not supported by key manager of type ", valueOf, ", which only supports: ");
        l8.append(valueOf2);
        throw new GeneralSecurityException(l8.toString());
    }

    public final boolean zzb(String str) {
        return this.zzd.get(str).booleanValue();
    }

    public final zzbn<?> zza(String str) {
        return zzc(str);
    }

    public static zzna zza() {
        return zzb;
    }

    private final synchronized void zza(zzbn<?> zzbnVar, boolean z7, boolean z8) {
        try {
            String zzb2 = zzbnVar.zzb();
            if (z8 && this.zzd.containsKey(zzb2) && !this.zzd.get(zzb2).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + zzb2);
            }
            zzbn<?> zzbnVar2 = this.zzc.get(zzb2);
            if (zzbnVar2 != null && !zzbnVar2.getClass().equals(zzbnVar.getClass())) {
                Logger logger = zza;
                Level level = Level.WARNING;
                logger.logp(level, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + zzb2);
                String name = zzbnVar2.getClass().getName();
                String name2 = zzbnVar.getClass().getName();
                throw new GeneralSecurityException("typeUrl (" + zzb2 + ") is already registered with " + name + ", cannot be re-registered with " + name2);
            }
            this.zzc.putIfAbsent(zzb2, zzbnVar);
            this.zzd.put(zzb2, Boolean.valueOf(z8));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized <P> void zza(zzbn<P> zzbnVar, boolean z7) {
        zza(zzbnVar, zzij.zza.zza, z7);
    }

    public final synchronized <P> void zza(zzbn<P> zzbnVar, zzij.zza zzaVar, boolean z7) {
        if (zzaVar.zza()) {
            zza((zzbn<?>) zzbnVar, false, z7);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}
