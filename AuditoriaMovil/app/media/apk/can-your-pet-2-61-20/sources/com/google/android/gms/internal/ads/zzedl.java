package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzedl implements zzfjq {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfkw zzc;
    private final zzflh zzd;

    public zzedl(String str, zzflh zzflhVar, zzfkw zzfkwVar) {
        this.zzb = str;
        this.zzd = zzflhVar;
        this.zzc = zzfkwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjq
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        JSONObject jSONObject;
        zzbxg zzbxgVar;
        zzdyi zzdyiVar;
        zzbxg zzbxgVar2;
        zzbxg zzbxgVar3;
        zzbxg zzbxgVar4;
        zzbxg zzbxgVar5;
        zzbxg zzbxgVar6;
        zzbxg zzbxgVar7;
        zzbxg zzbxgVar8;
        JSONObject jSONObject2;
        String str;
        zzedk zzedkVar = (zzedk) obj;
        jSONObject = zzedkVar.zza;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        zzbxgVar = zzedkVar.zzb;
        String str2 = "";
        if (zzbxgVar.zza() == -2) {
            HashMap hashMap = new HashMap();
            zzbxgVar2 = zzedkVar.zzb;
            if (zzbxgVar2.zzj() && !TextUtils.isEmpty(this.zzb)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaO)).booleanValue()) {
                    String str3 = this.zzb;
                    if (TextUtils.isEmpty(str3)) {
                        str = "";
                    } else {
                        Matcher matcher = zza.matcher(str3);
                        str = "";
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null && (group.toLowerCase(Locale.ROOT).startsWith("id=") || group.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("; ");
                                }
                                str = str.concat(group);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(HttpHeaders.COOKIE, str);
                    }
                } else {
                    hashMap.put(HttpHeaders.COOKIE, this.zzb);
                }
            }
            zzbxgVar3 = zzedkVar.zzb;
            if (zzbxgVar3.zzk()) {
                jSONObject2 = zzedkVar.zza;
                zzedm.zza(hashMap, jSONObject2);
            }
            zzbxgVar4 = zzedkVar.zzb;
            if (zzbxgVar4 != null) {
                zzbxgVar7 = zzedkVar.zzb;
                if (!TextUtils.isEmpty(zzbxgVar7.zzf())) {
                    zzbxgVar8 = zzedkVar.zzb;
                    str2 = zzbxgVar8.zzf();
                }
            }
            zzflh zzflhVar = this.zzd;
            zzfkw zzfkwVar = this.zzc;
            zzfkwVar.zzg(true);
            zzflhVar.zza(zzfkwVar);
            zzbxgVar5 = zzedkVar.zzb;
            String zzg = zzbxgVar5.zzg();
            byte[] bytes = str2.getBytes(zzfwd.zzc);
            zzbxgVar6 = zzedkVar.zzb;
            return new zzedg(zzg, optInt, hashMap, bytes, "", zzbxgVar6.zzk());
        }
        if (zzbxgVar.zza() == 1) {
            if (zzbxgVar.zzh() != null) {
                str2 = TextUtils.join(", ", zzbxgVar.zzh());
                com.google.android.gms.ads.internal.util.client.zzm.zzg(str2);
            }
            zzdyiVar = new zzdyi(2, "Error building request URL: ".concat(String.valueOf(str2)));
        } else {
            zzdyiVar = new zzdyi(1);
        }
        zzflh zzflhVar2 = this.zzd;
        zzfkw zzfkwVar2 = this.zzc;
        zzfkwVar2.zzh(zzdyiVar);
        zzfkwVar2.zzg(false);
        zzflhVar2.zza(zzfkwVar2);
        throw zzdyiVar;
    }
}
