package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfrr {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfrs zzc;
    private final zzfpp zzd;
    private final zzfpi zze;
    private zzfrg zzf;
    private final Object zzg = new Object();

    public zzfrr(Context context, zzfrs zzfrsVar, zzfpp zzfppVar, zzfpi zzfpiVar) {
        this.zzb = context;
        this.zzc = zzfrsVar;
        this.zzd = zzfppVar;
        this.zze = zzfpiVar;
    }

    private final synchronized Class zzd(zzfrh zzfrhVar) throws zzfrq {
        String zzk = zzfrhVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzfrhVar.zzc())) {
                try {
                    File zzb = zzfrhVar.zzb();
                    if (!zzb.exists()) {
                        zzb.mkdirs();
                    }
                    Class loadClass = new DexClassLoader(zzfrhVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(zzk, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                    throw new zzfrq(2008, e);
                }
            }
            throw new zzfrq(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e2) {
            throw new zzfrq(2026, e2);
        }
    }

    public final zzfps zza() {
        zzfrg zzfrgVar;
        synchronized (this.zzg) {
            zzfrgVar = this.zzf;
        }
        return zzfrgVar;
    }

    public final zzfrh zzb() {
        synchronized (this.zzg) {
            zzfrg zzfrgVar = this.zzf;
            if (zzfrgVar != null) {
                return zzfrgVar.zzf();
            }
            return null;
        }
    }

    public final boolean zzc(zzfrh zzfrhVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfrg zzfrgVar = new zzfrg(zzd(zzfrhVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfrhVar.zze(), null, new Bundle(), 2), zzfrhVar, this.zzc, this.zzd);
                if (!zzfrgVar.zzh()) {
                    throw new zzfrq(4000, "init failed");
                }
                int zze = zzfrgVar.zze();
                if (zze == 0) {
                    synchronized (this.zzg) {
                        zzfrg zzfrgVar2 = this.zzf;
                        if (zzfrgVar2 != null) {
                            try {
                                zzfrgVar2.zzg();
                            } catch (zzfrq e) {
                                this.zzd.zzc(e.zza(), -1L, e);
                            }
                        }
                        this.zzf = zzfrgVar;
                    }
                    this.zzd.zzd(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                throw new zzfrq(4001, "ci: " + zze);
            } catch (Exception e2) {
                throw new zzfrq(2004, e2);
            }
        } catch (zzfrq e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }
}
