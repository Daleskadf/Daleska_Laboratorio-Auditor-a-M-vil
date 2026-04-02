package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbkx {
    public static final zzbky zza = new zzbky() { // from class: com.google.android.gms.internal.ads.zzbjv
        @Override // com.google.android.gms.internal.ads.zzbky
        public final void zza(Object obj, Map map) {
            zzchr zzchrVar = (zzchr) obj;
            zzbky zzbkyVar = zzbkx.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzchrVar.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                hashMap.put(str2, valueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + valueOf);
            }
            ((zzbnt) zzchrVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzbky zzb = new zzbky() { // from class: com.google.android.gms.internal.ads.zzbjx
        @Override // com.google.android.gms.internal.ads.zzbky
        public final void zza(Object obj, Map map) {
            zzchr zzchrVar = (zzchr) obj;
            zzbky zzbkyVar = zzbkx.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzii)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(zzchrVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((zzbnt) zzchrVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzbky zzc = new zzbky() { // from class: com.google.android.gms.internal.ads.zzbka
        @Override // com.google.android.gms.internal.ads.zzbky
        public final void zza(Object obj, Map map) {
            zzbkx.zzb((zzchr) obj, map);
        }
    };
    public static final zzbky zzd = new zzbkp();
    public static final zzbky zze = new zzbkq();
    public static final zzbky zzf = new zzbky() { // from class: com.google.android.gms.internal.ads.zzbkb
        @Override // com.google.android.gms.internal.ads.zzbky
        public final void zza(Object obj, Map map) {
            zzchr zzchrVar = (zzchr) obj;
            zzbky zzbkyVar = zzbkx.zza;
            String str = (String) map.get("u");
            if (str == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzca(zzchrVar.getContext(), ((zzchy) zzchrVar).zzn().afmaVersion, str).zzb();
            }
        }
    };
    public static final zzbky zzg = new zzbkr();
    public static final zzbky zzh = new zzbks();
    public static final zzbky zzi = new zzbky() { // from class: com.google.android.gms.internal.ads.zzbjz
        @Override // com.google.android.gms.internal.ads.zzbky
        public final void zza(Object obj, Map map) {
            zzchx zzchxVar = (zzchx) obj;
            zzbky zzbkyVar = zzbkx.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzawo zzI = zzchxVar.zzI();
                if (zzI != null) {
                    zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbky zzj = new zzbkt();
    public static final zzbky zzk = new zzbku();
    public static final zzbky zzl = new zzcem();
    public static final zzbky zzm = new zzcen();
    public static final zzbky zzn = new zzbjr();
    public static final zzblo zzo = new zzblo();
    public static final zzbky zzp = new zzbkv();
    public static final zzbky zzq = new zzbkw();
    public static final zzbky zzr = new zzbkc();
    public static final zzbky zzs = new zzbkd();
    public static final zzbky zzt = new zzbke();
    public static final zzbky zzu = new zzbkf();
    public static final zzbky zzv = new zzbkg();
    public static final zzbky zzw = new zzbkh();
    public static final zzbky zzx = new zzbki();
    public static final zzbky zzy = new zzbkj();
    public static final zzbky zzz = new zzbkk();
    public static final zzbky zzA = new zzbkl();
    public static final zzbky zzB = new zzbkn();
    public static final zzbky zzC = new zzbko();

    public static ListenableFuture zza(zzcgm zzcgmVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzawo zzI = zzcgmVar.zzI();
            zzfgm zzQ = zzcgmVar.zzQ();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlF)).booleanValue() || zzQ == null) {
                if (zzI != null && zzI.zzf(parse)) {
                    parse = zzI.zza(parse, zzcgmVar.getContext(), zzcgmVar.zzF(), zzcgmVar.zzi());
                }
            } else if (zzI != null && zzI.zzf(parse)) {
                parse = zzQ.zza(parse, zzcgmVar.getContext(), zzcgmVar.zzF(), zzcgmVar.zzi());
            }
        } catch (zzawp unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String zzb2 = zzcaf.zzb(parse, zzcgmVar.getContext());
        long longValue = ((Long) zzbfs.zze.zze()).longValue();
        if (longValue <= 0 || longValue > 241199800) {
            return zzgee.zzh(zzb2);
        }
        return zzgee.zze(zzgee.zzm(zzgee.zze(zzgdv.zzu(zzcgmVar.zzS()), Throwable.class, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzbjs
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbky zzbkyVar = zzbkx.zza;
                if (((Boolean) zzbfs.zzk.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "prepareClickUrl.attestation1");
                    return "failure_click_attok";
                }
                return "failure_click_attok";
            }
        }, zzcbr.zzf), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzbjt
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                zzbky zzbkyVar = zzbkx.zza;
                String str3 = zzb2;
                if (str2 != null) {
                    if (((Boolean) zzbfs.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str3).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (!host.endsWith(strArr[i])) {
                            }
                        }
                    }
                    String str4 = (String) zzbfs.zza.zze();
                    String str5 = (String) zzbfs.zzb.zze();
                    if (!TextUtils.isEmpty(str4)) {
                        str3 = str3.replace(str4, str2);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        Uri parse2 = Uri.parse(str3);
                        if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                            return parse2.buildUpon().appendQueryParameter(str5, str2).toString();
                        }
                    }
                }
                return str3;
            }
        }, zzcbr.zzf), Throwable.class, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzbju
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbky zzbkyVar = zzbkx.zza;
                if (((Boolean) zzbfs.zzk.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "prepareClickUrl.attestation2");
                }
                return zzb2;
            }
        }, zzcbr.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(16:10|11|12|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
        com.google.android.gms.ads.internal.zzu.zzo().zzw(r0, r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzchr r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkx.zzb(com.google.android.gms.internal.ads.zzchr, java.util.Map):void");
    }

    public static void zzc(Map map, zzdgn zzdgnVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzku)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdgnVar != null) {
            zzdgnVar.zzdG();
        }
    }
}
