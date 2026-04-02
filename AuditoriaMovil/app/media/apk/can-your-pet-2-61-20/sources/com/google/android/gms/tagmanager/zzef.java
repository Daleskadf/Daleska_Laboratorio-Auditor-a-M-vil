package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.gtm.zzsd;
import com.google.android.gms.internal.gtm.zzsg;
import com.google.android.gms.internal.gtm.zzsh;
import com.google.android.gms.internal.gtm.zzsi;
import com.google.android.gms.internal.gtm.zzxf;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzef implements Runnable {
    private final Context zza;
    private final zzsh zzb;
    private final String zzc;
    private final String zzd;
    private zzdf zze;
    private volatile zzao zzf;
    private volatile String zzg;
    private volatile String zzh;

    public zzef(Context context, String str, zzao zzaoVar) {
        zzsh zzshVar = new zzsh();
        this.zza = context;
        this.zzb = zzshVar;
        this.zzc = str;
        this.zzf = zzaoVar;
        String concat = "/r?id=".concat(String.valueOf(str));
        this.zzd = concat;
        this.zzg = concat;
        this.zzh = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzal zzalVar;
        Clock clock;
        long j;
        boolean zzv;
        com.google.android.gms.internal.gtm.zzak zzakVar;
        com.google.android.gms.internal.gtm.zzak zzakVar2;
        zzal zzalVar2;
        if (this.zze == null) {
            throw new IllegalStateException("callback must be set before execute");
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zza.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            zzdg.zzb.zzd("...no network connectivity");
            this.zze.zza(1);
            return;
        }
        zzdg.zzb.zzd("Start loading resource from network ...");
        String str = this.zzf.zza() + this.zzg + "&v=a65833898";
        if (this.zzh != null && !this.zzh.trim().isEmpty()) {
            str = str + "&pv=" + this.zzh;
        }
        int zze = zzdz.zza().zze();
        InputStream inputStream = null;
        if (zze == 0) {
            throw null;
        }
        if (zze == 3) {
            str = str.concat("&gtm_debug=x");
        }
        zzsg zza = zzsh.zza();
        try {
            try {
                inputStream = zza.zza(str);
            } catch (zzsi unused) {
                Log.w("GoogleTagManager", "Error when loading resource for url: " + str);
                this.zze.zza(4);
            } catch (FileNotFoundException unused2) {
                Log.w("GoogleTagManager", "No data is retrieved from the given url: " + str + ". Make sure container_id: " + this.zzc + " is correct.");
                this.zze.zza(3);
                zza.zzb();
                return;
            } catch (IOException e) {
                Log.w("GoogleTagManager", "Error when loading resources from url: " + str + " " + e.getMessage(), e);
                this.zze.zza(2);
                zza.zzb();
                return;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzsd.zzc(inputStream, byteArrayOutputStream);
                com.google.android.gms.internal.gtm.zzak zzg = com.google.android.gms.internal.gtm.zzak.zzg(byteArrayOutputStream.toByteArray(), zzxf.zza());
                zzdg.zzb.zzd("Successfully loaded supplemented resource: " + String.valueOf(zzg));
                if (!zzg.zzm() && zzg.zza() == 0) {
                    zzdg.zzb.zzd("No change for container: " + this.zzc);
                }
                zzdf zzdfVar = this.zze;
                zzalVar = ((zzaf) zzdfVar).zza.zzi;
                zzalVar.zzd();
                synchronized (((zzaf) zzdfVar).zza) {
                    if (!zzg.zzm()) {
                        zzakVar = ((zzaf) zzdfVar).zza.zzn;
                        if (zzakVar.zzm()) {
                            com.google.android.gms.internal.gtm.zzaj zzZ = zzg.zzZ();
                            zzakVar2 = ((zzaf) zzdfVar).zza.zzn;
                            zzZ.zzc(zzakVar2.zzc());
                            zzg = (com.google.android.gms.internal.gtm.zzak) zzZ.zzB();
                        } else {
                            Log.e("GoogleTagManager", "Current resource is null; network resource is also null");
                            zzalVar2 = ((zzaf) zzdfVar).zza.zzi;
                            ((zzaf) zzdfVar).zza.zzr(zzalVar2.zzb());
                        }
                    }
                    zzak zzakVar3 = ((zzaf) zzdfVar).zza;
                    clock = zzakVar3.zza;
                    zzakVar3.zzu(zzg, clock.currentTimeMillis(), false);
                    j = ((zzaf) zzdfVar).zza.zzo;
                    zzdg.zzb.zzd("setting refresh time to current time: " + j);
                    zzv = ((zzaf) zzdfVar).zza.zzv();
                    if (!zzv) {
                        ((zzaf) zzdfVar).zza.zzt(zzg);
                    }
                }
                zza.zzb();
                zzdg.zzb.zzd("Load resource from network finished.");
            } catch (IOException e2) {
                Log.w("GoogleTagManager", "Error when parsing downloaded resources from url: " + str + " " + e2.getMessage(), e2);
                this.zze.zza(3);
                zza.zzb();
            }
        } catch (Throwable th) {
            zza.zzb();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str) {
        if (str == null) {
            str = this.zzd;
        } else {
            zzdg.zzb.zza("Setting CTFE URL path: ".concat(str));
        }
        this.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzdf zzdfVar) {
        this.zze = zzdfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(String str) {
        zzdg.zzb.zza("Setting previous container version: ".concat(String.valueOf(str)));
        this.zzh = str;
    }
}
