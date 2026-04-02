package com.google.android.gms.internal.p002firebaseauthapi;

import S.k;
import a4.y;
import android.app.Activity;
import java.util.Map;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafc  reason: invalid package */
/* loaded from: classes.dex */
public final class zzafc {
    private static final Map<String, zzafe> zza = new k(0);

    public static y zza(String str, y yVar, zzaeg zzaegVar) {
        zza(str, zzaegVar);
        return new zzafb(yVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzaeg zzaegVar) {
        zza.put(str, new zzafe(zzaegVar, System.currentTimeMillis()));
    }

    public static boolean zza(String str, y yVar, Activity activity, Executor executor) {
        Map<String, zzafe> map = zza;
        if (map.containsKey(str)) {
            zzafe zzafeVar = map.get(str);
            if (System.currentTimeMillis() - zzafeVar.zzb < 120000) {
                zzaeg zzaegVar = zzafeVar.zza;
                if (zzaegVar != null) {
                    zzaegVar.zza(yVar, activity, executor, str);
                    return true;
                }
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}
