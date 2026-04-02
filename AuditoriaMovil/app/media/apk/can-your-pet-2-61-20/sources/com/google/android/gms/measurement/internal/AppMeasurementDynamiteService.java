package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzqr;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.0.0 */
/* loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzdg {
    zzhm zza = null;
    private final Map<Integer, zzix> zzb = new ArrayMap();

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.0.0 */
    /* loaded from: classes3.dex */
    class zza implements zzix {
        private com.google.android.gms.internal.measurement.zzdj zza;

        zza(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
            this.zza = zzdjVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzix
        public final void onEvent(String str, String str2, Bundle bundle, long j) {
            try {
                this.zza.zza(str, str2, bundle, j);
            } catch (RemoteException e) {
                if (AppMeasurementDynamiteService.this.zza != null) {
                    AppMeasurementDynamiteService.this.zza.zzj().zzu().zza("Event listener threw exception", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.0.0 */
    /* loaded from: classes3.dex */
    public class zzb implements zziy {
        private com.google.android.gms.internal.measurement.zzdj zza;

        zzb(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
            this.zza = zzdjVar;
        }

        @Override // com.google.android.gms.measurement.internal.zziy
        public final void interceptEvent(String str, String str2, Bundle bundle, long j) {
            try {
                this.zza.zza(str, str2, bundle, j);
            } catch (RemoteException e) {
                if (AppMeasurementDynamiteService.this.zza != null) {
                    AppMeasurementDynamiteService.this.zza.zzj().zzu().zza("Event interceptor threw exception", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        zza();
        this.zza.zze().zza(str, j);
    }

    @EnsuresNonNull({"scion"})
    private final void zza() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zza();
        this.zza.zzp().zza(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void clearMeasurementEnabled(long j) throws RemoteException {
        zza();
        this.zza.zzp().zza((Boolean) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        zza();
        this.zza.zze().zzb(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void generateEventId(com.google.android.gms.internal.measurement.zzdi zzdiVar) throws RemoteException {
        zza();
        long zzm = this.zza.zzt().zzm();
        zza();
        this.zza.zzt().zza(zzdiVar, zzm);
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzdi zzdiVar) throws RemoteException {
        zza();
        this.zza.zzl().zzb(new zzi(this, zzdiVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzdi zzdiVar) throws RemoteException {
        zza();
        zza(zzdiVar, this.zza.zzp().zzae());
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzdi zzdiVar) throws RemoteException {
        zza();
        this.zza.zzl().zzb(new zzm(this, zzdiVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzdi zzdiVar) throws RemoteException {
        zza();
        zza(zzdiVar, this.zza.zzp().zzaf());
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzdi zzdiVar) throws RemoteException {
        zza();
        zza(zzdiVar, this.zza.zzp().zzag());
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzdi zzdiVar) throws RemoteException {
        zza();
        zza(zzdiVar, this.zza.zzp().zzah());
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzdi zzdiVar) throws RemoteException {
        zza();
        this.zza.zzp();
        Preconditions.checkNotEmpty(str);
        zza();
        this.zza.zzt().zza(zzdiVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void getSessionId(com.google.android.gms.internal.measurement.zzdi zzdiVar) throws RemoteException {
        zza();
        zzjc zzp = this.zza.zzp();
        zzp.zzl().zzb(new zzkd(zzp, zzdiVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void getTestFlag(com.google.android.gms.internal.measurement.zzdi zzdiVar, int i) throws RemoteException {
        zza();
        if (i == 0) {
            this.zza.zzt().zza(zzdiVar, this.zza.zzp().zzai());
        } else if (i == 1) {
            this.zza.zzt().zza(zzdiVar, this.zza.zzp().zzad().longValue());
        } else if (i != 2) {
            if (i == 3) {
                this.zza.zzt().zza(zzdiVar, this.zza.zzp().zzac().intValue());
            } else if (i != 4) {
            } else {
                this.zza.zzt().zza(zzdiVar, this.zza.zzp().zzaa().booleanValue());
            }
        } else {
            zzny zzt = this.zza.zzt();
            double doubleValue = this.zza.zzp().zzab().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzdiVar.zza(bundle);
            } catch (RemoteException e) {
                zzt.zzu.zzj().zzu().zza("Error returning double value to wrapper", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void getUserProperties(String str, String str2, boolean z, com.google.android.gms.internal.measurement.zzdi zzdiVar) throws RemoteException {
        zza();
        this.zza.zzl().zzb(new zzk(this, zzdiVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void initForTests(Map map) throws RemoteException {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdq zzdqVar, long j) throws RemoteException {
        zzhm zzhmVar = this.zza;
        if (zzhmVar == null) {
            this.zza = zzhm.zza((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzdqVar, Long.valueOf(j));
        } else {
            zzhmVar.zzj().zzu().zza("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzdi zzdiVar) throws RemoteException {
        zza();
        this.zza.zzl().zzb(new zzl(this, zzdiVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zza();
        this.zza.zzp().zza(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzdi zzdiVar, long j) throws RemoteException {
        zza();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.zza.zzl().zzb(new zzh(this, zzdiVar, new zzbd(str2, new zzbc(bundle), "app", j), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        zza();
        this.zza.zzj().zza(i, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        zza();
        zzko zzkoVar = this.zza.zzp().zza;
        if (zzkoVar != null) {
            this.zza.zzp().zzal();
            zzkoVar.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        zzko zzkoVar = this.zza.zzp().zza;
        if (zzkoVar != null) {
            this.zza.zzp().zzal();
            zzkoVar.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        zzko zzkoVar = this.zza.zzp().zza;
        if (zzkoVar != null) {
            this.zza.zzp().zzal();
            zzkoVar.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        zzko zzkoVar = this.zza.zzp().zza;
        if (zzkoVar != null) {
            this.zza.zzp().zzal();
            zzkoVar.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdi zzdiVar, long j) throws RemoteException {
        zza();
        zzko zzkoVar = this.zza.zzp().zza;
        Bundle bundle = new Bundle();
        if (zzkoVar != null) {
            this.zza.zzp().zzal();
            zzkoVar.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzdiVar.zza(bundle);
        } catch (RemoteException e) {
            this.zza.zzj().zzu().zza("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        zzko zzkoVar = this.zza.zzp().zza;
        if (zzkoVar != null) {
            this.zza.zzp().zzal();
            zzkoVar.onActivityStarted((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        zzko zzkoVar = this.zza.zzp().zza;
        if (zzkoVar != null) {
            this.zza.zzp().zzal();
            zzkoVar.onActivityStopped((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzdi zzdiVar, long j) throws RemoteException {
        zza();
        zzdiVar.zza(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzdj zzdjVar) throws RemoteException {
        zzix zzixVar;
        zza();
        synchronized (this.zzb) {
            zzixVar = this.zzb.get(Integer.valueOf(zzdjVar.zza()));
            if (zzixVar == null) {
                zzixVar = new zza(zzdjVar);
                this.zzb.put(Integer.valueOf(zzdjVar.zza()), zzixVar);
            }
        }
        this.zza.zzp().zza(zzixVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void resetAnalyticsData(long j) throws RemoteException {
        zza();
        zzjc zzp = this.zza.zzp();
        zzp.zza((String) null);
        zzp.zzl().zzb(new zzka(zzp, j));
    }

    private final void zza(com.google.android.gms.internal.measurement.zzdi zzdiVar, String str) {
        zza();
        this.zza.zzt().zza(zzdiVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        zza();
        if (bundle == null) {
            this.zza.zzj().zzg().zza("Conditional user property must not be null");
        } else {
            this.zza.zzp().zza(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void setConsent(final Bundle bundle, final long j) throws RemoteException {
        zza();
        final zzjc zzp = this.zza.zzp();
        zzp.zzl().zzc(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzji
            @Override // java.lang.Runnable
            public final void run() {
                zzjc zzjcVar = zzjc.this;
                Bundle bundle2 = bundle;
                long j2 = j;
                if (TextUtils.isEmpty(zzjcVar.zzg().zzae())) {
                    zzjcVar.zza(bundle2, 0, j2);
                } else {
                    zzjcVar.zzj().zzv().zza("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        zza();
        this.zza.zzp().zza(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        zza();
        this.zza.zzq().zza((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zza();
        zzjc zzp = this.zza.zzp();
        zzp.zzu();
        zzp.zzl().zzb(new zzjp(zzp, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void setDefaultEventParameters(Bundle bundle) {
        zza();
        final zzjc zzp = this.zza.zzp();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        zzp.zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjf
            @Override // java.lang.Runnable
            public final void run() {
                zzjc.this.zza(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzdj zzdjVar) throws RemoteException {
        zza();
        zzb zzbVar = new zzb(zzdjVar);
        if (this.zza.zzl().zzg()) {
            this.zza.zzp().zza(zzbVar);
        } else {
            this.zza.zzl().zzb(new zzj(this, zzbVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdo zzdoVar) throws RemoteException {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zza();
        this.zza.zzp().zza(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void setMinimumSessionDuration(long j) throws RemoteException {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zza();
        zzjc zzp = this.zza.zzp();
        zzp.zzl().zzb(new zzjr(zzp, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        zza();
        zzjc zzp = this.zza.zzp();
        if (zzqr.zza() && zzp.zze().zzf(null, zzbf.zzbu)) {
            Uri data = intent.getData();
            if (data == null) {
                zzp.zzj().zzn().zza("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter == null || !queryParameter.equals("1")) {
                zzp.zzj().zzn().zza("Preview Mode was not enabled.");
                zzp.zze().zzi(null);
                return;
            }
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            zzp.zzj().zzn().zza("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            zzp.zze().zzi(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void setUserId(final String str, long j) throws RemoteException {
        zza();
        final zzjc zzp = this.zza.zzp();
        if (str != null && TextUtils.isEmpty(str)) {
            zzp.zzu.zzj().zzu().zza("User ID must be non-empty or null");
            return;
        }
        zzp.zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjj
            @Override // java.lang.Runnable
            public final void run() {
                zzjc zzjcVar = zzjc.this;
                if (zzjcVar.zzg().zzb(str)) {
                    zzjcVar.zzg().zzag();
                }
            }
        });
        zzp.zza((String) null, "_id", (Object) str, true, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        zza();
        this.zza.zzp().zza(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzdd
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzdj zzdjVar) throws RemoteException {
        zzix remove;
        zza();
        synchronized (this.zzb) {
            remove = this.zzb.remove(Integer.valueOf(zzdjVar.zza()));
        }
        if (remove == null) {
            remove = new zza(zzdjVar);
        }
        this.zza.zzp().zzb(remove);
    }
}
