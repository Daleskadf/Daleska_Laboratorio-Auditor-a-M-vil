package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbdx implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;

    private final void zzf(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbeb.zza(new zzfxh() { // from class: com.google.android.gms.internal.ads.zzbdu
                @Override // com.google.android.gms.internal.ads.zzfxh
                public final Object zza() {
                    return sharedPreferences.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzf(sharedPreferences);
        }
    }

    public final Object zza(final zzbdq zzbdqVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null) {
                }
                return zzbdqVar.zzm();
            }
        }
        if (zzbdqVar.zze() == 2) {
            Bundle bundle = this.zzf;
            if (bundle == null) {
                return zzbdqVar.zzm();
            }
            return zzbdqVar.zzb(bundle);
        } else if (zzbdqVar.zze() != 1 || !this.zzh.has(zzbdqVar.zzn())) {
            return zzbeb.zza(new zzfxh() { // from class: com.google.android.gms.internal.ads.zzbdv
                @Override // com.google.android.gms.internal.ads.zzfxh
                public final Object zza() {
                    return zzbdx.this.zzc(zzbdqVar);
                }
            });
        } else {
            return zzbdqVar.zza(this.zzh);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(zzbdq zzbdqVar) {
        return zzbdqVar.zzc(this.zze);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbeb.zza(new com.google.android.gms.internal.ads.zzbdt(r3))).optBoolean("local_flags_enabled") != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad A[Catch: all -> 0x00ed, TRY_ENTER, TryCatch #3 {, blocks: (B:7:0x0008, B:9:0x000c, B:11:0x000e, B:13:0x0013, B:14:0x0015, B:16:0x0027, B:17:0x002b, B:18:0x002d, B:45:0x00ad, B:46:0x00b4, B:54:0x00db, B:55:0x00e2, B:20:0x0042, B:23:0x004c, B:27:0x0055, B:30:0x0060, B:31:0x0068, B:41:0x00a7, B:48:0x00b6, B:50:0x00cd, B:52:0x00d1, B:53:0x00d4, B:34:0x0079, B:36:0x0087, B:38:0x008f, B:39:0x009a), top: B:68:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6 A[Catch: all -> 0x00e4, TRY_ENTER, TryCatch #3 {, blocks: (B:7:0x0008, B:9:0x000c, B:11:0x000e, B:13:0x0013, B:14:0x0015, B:16:0x0027, B:17:0x002b, B:18:0x002d, B:45:0x00ad, B:46:0x00b4, B:54:0x00db, B:55:0x00e2, B:20:0x0042, B:23:0x004c, B:27:0x0055, B:30:0x0060, B:31:0x0068, B:41:0x00a7, B:48:0x00b6, B:50:0x00cd, B:52:0x00d1, B:53:0x00d4, B:34:0x0079, B:36:0x0087, B:38:0x008f, B:39:0x009a), top: B:68:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdx.zzd(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zze() {
        return this.zzi;
    }

    public final Object zzb(zzbdq zzbdqVar) {
        return (this.zzd || this.zza) ? zza(zzbdqVar) : zzbdqVar.zzm();
    }
}
