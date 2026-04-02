package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes3.dex */
public final class zzbee {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    final LinkedHashMap zzb = new LinkedHashMap();
    final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(zzbee zzbeeVar) {
        while (true) {
            try {
                zzbeo zzbeoVar = (zzbeo) zzbeeVar.zza.take();
                zzben zza = zzbeoVar.zza();
                if (!TextUtils.isEmpty(zza.zzb())) {
                    zzbeeVar.zzg(zzbeeVar.zzb(zzbeeVar.zzb, zzbeoVar.zzb()), zza);
                }
            } catch (InterruptedException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    private final void zzg(Map map, zzben zzbenVar) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (zzbenVar != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(zzbenVar.zzb())) {
                sb.append("&it=");
                sb.append(zzbenVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbenVar.zza())) {
                sb.append("&blat=");
                sb.append(zzbenVar.zza());
            }
            uri = sb.toString();
        }
        if (!this.zzh.get()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzL(this.zze, this.zzf, uri);
            return;
        }
        File file = this.zzi;
        if (file != null) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file, true);
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileOutputStream.write(uri.getBytes());
                fileOutputStream.write(10);
                try {
                    fileOutputStream.close();
                    return;
                } catch (IOException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                    return;
                }
            } catch (IOException e3) {
                e = e3;
                fileOutputStream2 = fileOutputStream;
                com.google.android.gms.ads.internal.util.client.zzm.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                        return;
                    } catch (IOException e4) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                        return;
                    }
                }
                return;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e5) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                    }
                }
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
    }

    public final zzbek zza(String str) {
        zzbek zzbekVar = (zzbek) this.zzc.get(str);
        return zzbekVar != null ? zzbekVar : zzbek.zza;
    }

    final Map zzb(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, zza(str).zza(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbfo.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(zzfsg.zza(zzfsf.zza(), externalStorageDirectory, "sdk_csi_data.txt", zzfsk.zza));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcbr.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbed
            @Override // java.lang.Runnable
            public final void run() {
                zzbee.zzc(zzbee.this);
            }
        });
        this.zzc.put("action", zzbek.zzb);
        this.zzc.put(FirebaseAnalytics.Param.AD_FORMAT, zzbek.zzb);
        this.zzc.put("e", zzbek.zzc);
    }

    public final void zze(String str) {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzb(this.zzb, linkedHashMap), null);
    }

    public final boolean zzf(zzbeo zzbeoVar) {
        return this.zza.offer(zzbeoVar);
    }
}
