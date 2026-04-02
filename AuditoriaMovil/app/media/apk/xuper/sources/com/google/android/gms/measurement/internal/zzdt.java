package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzdt {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzdq zzc;
    private final Object zzd;
    private final Object zze;
    private final Object zzf = new Object();
    private volatile Object zzg = null;
    private volatile Object zzh = null;

    public /* synthetic */ zzdt(String str, Object obj, Object obj2, zzdq zzdqVar, zzds zzdsVar) {
        this.zzb = str;
        this.zzd = obj;
        this.zze = obj2;
        this.zzc = zzdqVar;
    }

    public final Object zza(Object obj) {
        Object obj2;
        synchronized (this.zzf) {
        }
        if (obj != null) {
            return obj;
        }
        if (zzdr.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            if (zzab.zza()) {
                if (this.zzh == null) {
                    obj2 = this.zzd;
                } else {
                    obj2 = this.zzh;
                }
                return obj2;
            }
            try {
                for (zzdt zzdtVar : zzdu.zzb()) {
                    if (!zzab.zza()) {
                        Object obj3 = null;
                        try {
                            zzdq zzdqVar = zzdtVar.zzc;
                            if (zzdqVar != null) {
                                obj3 = zzdqVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (zza) {
                            zzdtVar.zzh = obj3;
                        }
                    } else {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                }
            } catch (SecurityException unused2) {
            }
            zzdq zzdqVar2 = this.zzc;
            if (zzdqVar2 == null) {
                return this.zzd;
            }
            try {
                return zzdqVar2.zza();
            } catch (IllegalStateException unused3) {
                return this.zzd;
            } catch (SecurityException unused4) {
                return this.zzd;
            }
        }
    }

    public final String zzb() {
        return this.zzb;
    }
}
