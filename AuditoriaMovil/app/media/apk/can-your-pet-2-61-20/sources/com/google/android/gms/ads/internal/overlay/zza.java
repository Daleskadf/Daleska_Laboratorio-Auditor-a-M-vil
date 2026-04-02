package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbdz;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzaa zzaaVar, zzy zzyVar, boolean z) {
        if (z) {
            return zzc(context, intent.getData(), zzaaVar, zzyVar);
        }
        try {
            String uri = intent.toURI();
            com.google.android.gms.ads.internal.util.zze.zza("Launching an intent: " + uri);
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzT(context, intent);
            if (zzaaVar != null) {
                zzaaVar.zzg();
            }
            if (zzyVar != null) {
                zzyVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(e.getMessage());
            if (zzyVar != null) {
                zzyVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzcVar, zzaa zzaaVar, zzy zzyVar) {
        int i = 0;
        if (zzcVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbdz.zza(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return zza(context, intent, zzaaVar, zzyVar, zzcVar.zzj);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzcVar.zzb)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzcVar.zzc)) {
            String str = zzcVar.zzb;
            intent2.setDataAndType(Uri.parse(str), zzcVar.zzc);
        } else {
            intent2.setData(Uri.parse(zzcVar.zzb));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzcVar.zzd)) {
            intent2.setPackage(zzcVar.zzd);
        }
        if (!TextUtils.isEmpty(zzcVar.zze)) {
            String[] split = zzcVar.zze.split("/", 2);
            if (split.length < 2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse component name from open GMSG: ".concat(String.valueOf(zzcVar.zze)));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str2 = zzcVar.zzf;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) zzba.zzc().zza(zzbdz.zzex)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzba.zzc().zza(zzbdz.zzew)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzo(context, intent2);
            }
        }
        return zza(context, intent2, zzaaVar, zzyVar, zzcVar.zzj);
    }

    private static final boolean zzc(Context context, Uri uri, zzaa zzaaVar, zzy zzyVar) {
        int i;
        try {
            i = com.google.android.gms.ads.internal.zzu.zzp().zzm(context, uri);
            if (zzaaVar != null) {
                zzaaVar.zzg();
            }
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(e.getMessage());
            i = 6;
        }
        if (zzyVar != null) {
            zzyVar.zzb(i);
        }
        return i == 5;
    }
}
