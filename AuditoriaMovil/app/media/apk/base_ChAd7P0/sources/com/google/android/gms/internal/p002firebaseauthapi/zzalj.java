package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalj  reason: invalid package */
/* loaded from: classes.dex */
final class zzalj implements zzalg {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalg
    public final int zza(int i7, Object obj, Object obj2) {
        zzalh zzalhVar = (zzalh) obj;
        zzalf zzalfVar = (zzalf) obj2;
        if (zzalhVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzalhVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalg
    public final Object zzb(Object obj) {
        return zzalh.zza().zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalg
    public final Object zzc(Object obj) {
        ((zzalh) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalg
    public final Map<?, ?> zzd(Object obj) {
        return (zzalh) obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalg
    public final Map<?, ?> zze(Object obj) {
        return (zzalh) obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalg
    public final boolean zzf(Object obj) {
        if (!((zzalh) obj).zzd()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalg
    public final zzale<?, ?> zza(Object obj) {
        zzalf zzalfVar = (zzalf) obj;
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalg
    public final Object zza(Object obj, Object obj2) {
        zzalh zzalhVar = (zzalh) obj;
        zzalh zzalhVar2 = (zzalh) obj2;
        if (!zzalhVar2.isEmpty()) {
            if (!zzalhVar.zzd()) {
                zzalhVar = zzalhVar.zzb();
            }
            zzalhVar.zza(zzalhVar2);
        }
        return zzalhVar;
    }
}
