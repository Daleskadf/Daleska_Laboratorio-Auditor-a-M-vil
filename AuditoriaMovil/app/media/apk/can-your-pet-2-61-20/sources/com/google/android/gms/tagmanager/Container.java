package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzrv;
import com.google.android.gms.internal.gtm.zzsc;
import com.google.android.gms.internal.gtm.zzsd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public class Container {
    private final Context zza;
    private final String zzb;
    private final DataLayer zzc;
    private zzet zzd;
    private Map zze;
    private Map zzf;
    private volatile long zzg;
    private volatile String zzh;

    /* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
    /* loaded from: classes3.dex */
    public interface FunctionCallMacroCallback {
        Object getValue(String str, Map<String, Object> map);
    }

    /* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
    /* loaded from: classes3.dex */
    public interface FunctionCallTagCallback {
        void execute(String str, Map<String, Object> map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Container(Context context, DataLayer dataLayer, String str, long j, com.google.android.gms.internal.gtm.zzak zzakVar) {
        this.zze = new HashMap();
        this.zzf = new HashMap();
        this.zzh = "";
        this.zza = context;
        this.zzc = dataLayer;
        this.zzb = str;
        this.zzg = j;
        com.google.android.gms.internal.gtm.zzac zzc = zzakVar.zzc();
        zzc.getClass();
        try {
            zzg(zzsd.zzb(zzc));
        } catch (zzsc e) {
            Log.e("GoogleTagManager", "Not loading resource: " + zzc.toString() + " because it is invalid: " + e.toString());
        }
        if (zzakVar.zza() != 0) {
            com.google.android.gms.internal.gtm.zzai[] zzaiVarArr = (com.google.android.gms.internal.gtm.zzai[]) zzakVar.zzi().toArray(new com.google.android.gms.internal.gtm.zzai[0]);
            zzet zzf = zzf();
            if (zzf == null) {
                Log.e("GoogleTagManager", "evaluateTags called for closed container.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.gtm.zzai zzaiVar : zzaiVarArr) {
                arrayList.add(zzaiVar);
            }
            zzf.zze(arrayList);
        }
    }

    private final synchronized zzet zzf() {
        return this.zzd;
    }

    private final void zzg(zzrv zzrvVar) {
        this.zzh = zzrvVar.zzb();
        zzh(new zzet((Context) Preconditions.checkNotNull(this.zza), zzrvVar, (DataLayer) Preconditions.checkNotNull(this.zzc), new zzu(this, null), new zzw(this, null), new zzdk()));
        if (getBoolean("_gtm.loadEventEnabled")) {
            this.zzc.pushEvent("gtm.load", DataLayer.mapOf("gtm.id", Preconditions.checkNotNull(this.zzb)));
        }
    }

    private final synchronized void zzh(zzet zzetVar) {
        this.zzd = zzetVar;
    }

    public boolean getBoolean(String str) {
        zzet zzf = zzf();
        if (zzf == null) {
            Log.e("GoogleTagManager", "getBoolean called for closed container.");
            zzfu.zze().booleanValue();
            return false;
        }
        try {
            return zzfu.zzf(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) zzf.zza(str).zza())).booleanValue();
        } catch (Exception e) {
            String message = e.getMessage();
            Log.e("GoogleTagManager", "Calling getBoolean() threw an exception: " + message + " Returning default value.");
            zzfu.zze().booleanValue();
            return false;
        }
    }

    public String getContainerId() {
        return this.zzb;
    }

    public double getDouble(String str) {
        zzet zzf = zzf();
        if (zzf == null) {
            Log.e("GoogleTagManager", "getDouble called for closed container.");
            return zzfu.zzg().doubleValue();
        }
        try {
            return zzfu.zzh(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) zzf.zza(str).zza())).doubleValue();
        } catch (Exception e) {
            String message = e.getMessage();
            Log.e("GoogleTagManager", "Calling getDouble() threw an exception: " + message + " Returning default value.");
            return zzfu.zzg().doubleValue();
        }
    }

    public long getLastRefreshTime() {
        return this.zzg;
    }

    public long getLong(String str) {
        zzet zzf = zzf();
        if (zzf == null) {
            Log.e("GoogleTagManager", "getLong called for closed container.");
            zzfu.zzi().longValue();
            return 0L;
        }
        try {
            return zzfu.zzj(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) zzf.zza(str).zza())).longValue();
        } catch (Exception e) {
            String message = e.getMessage();
            Log.e("GoogleTagManager", "Calling getLong() threw an exception: " + message + " Returning default value.");
            zzfu.zzi().longValue();
            return 0L;
        }
    }

    public String getString(String str) {
        zzet zzf = zzf();
        if (zzf == null) {
            Log.e("GoogleTagManager", "getString called for closed container.");
            return zzfu.zzl();
        }
        try {
            return zzfu.zzm(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) zzf.zza(str).zza()));
        } catch (Exception e) {
            String message = e.getMessage();
            Log.e("GoogleTagManager", "Calling getString() threw an exception: " + message + " Returning default value.");
            return zzfu.zzl();
        }
    }

    public boolean isDefault() {
        return getLastRefreshTime() == 0;
    }

    public void registerFunctionCallMacroCallback(String str, FunctionCallMacroCallback functionCallMacroCallback) {
        if (functionCallMacroCallback != null) {
            synchronized (this.zze) {
                this.zze.put(str, functionCallMacroCallback);
            }
            return;
        }
        throw new NullPointerException("Macro handler must be non-null");
    }

    public void registerFunctionCallTagCallback(String str, FunctionCallTagCallback functionCallTagCallback) {
        if (functionCallTagCallback != null) {
            synchronized (this.zzf) {
                this.zzf.put(str, functionCallTagCallback);
            }
            return;
        }
        throw new NullPointerException("Tag callback must be non-null");
    }

    public void unregisterFunctionCallMacroCallback(String str) {
        synchronized (this.zze) {
            this.zze.remove(str);
        }
    }

    public void unregisterFunctionCallTagCallback(String str) {
        synchronized (this.zzf) {
            this.zzf.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final FunctionCallMacroCallback zza(String str) {
        FunctionCallMacroCallback functionCallMacroCallback;
        synchronized (this.zze) {
            functionCallMacroCallback = (FunctionCallMacroCallback) this.zze.get(str);
        }
        return functionCallMacroCallback;
    }

    public final FunctionCallTagCallback zzb(String str) {
        FunctionCallTagCallback functionCallTagCallback;
        synchronized (this.zzf) {
            functionCallTagCallback = (FunctionCallTagCallback) this.zzf.get(str);
        }
        return functionCallTagCallback;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final void zzd(String str) {
        zzet zzf = zzf();
        if (zzf == null) {
            Log.e("GoogleTagManager", "evaluateTags called for closed container.");
        } else {
            zzf.zzc(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze() {
        this.zzd = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Container(Context context, DataLayer dataLayer, String str, long j, zzrv zzrvVar) {
        this.zze = new HashMap();
        this.zzf = new HashMap();
        this.zzh = "";
        this.zza = context;
        this.zzc = dataLayer;
        this.zzb = str;
        this.zzg = 0L;
        zzg(zzrvVar);
    }
}
