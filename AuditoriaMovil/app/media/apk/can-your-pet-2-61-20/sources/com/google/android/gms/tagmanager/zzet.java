package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.gtm.zzrr;
import com.google.android.gms.internal.gtm.zzrv;
import com.google.android.gms.internal.gtm.zzrz;
import com.google.android.gms.internal.gtm.zzsd;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzet {
    private static final zzdr zza = new zzdr(zzfu.zza(), true);
    private final zzrv zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;
    private final Set zzf;
    private final DataLayer zzg;
    private final Map zzh;
    private volatile String zzi;
    private int zzj;
    private final zzdk zzk;
    private final zzda zzl;
    private final zzda zzm;

    public zzet(Context context, zzrv zzrvVar, DataLayer dataLayer, zzap zzapVar, zzap zzapVar2, zzdk zzdkVar) {
        this.zzb = zzrvVar;
        HashSet<zzrz> hashSet = new HashSet(zzrvVar.zzc());
        this.zzf = hashSet;
        this.zzg = dataLayer;
        this.zzk = zzdkVar;
        this.zzl = zzr.zza(1048576, new zzem(this));
        this.zzm = zzr.zza(1048576, new zzen(this));
        HashMap hashMap = new HashMap();
        this.zzc = hashMap;
        zzj(hashMap, new zzo(context));
        zzj(hashMap, new zzaq(zzapVar2));
        zzj(hashMap, new zzbe(dataLayer));
        zzj(hashMap, new zzfv(context, dataLayer));
        HashMap hashMap2 = new HashMap();
        this.zzd = hashMap2;
        zzj(hashMap2, new zzan());
        zzj(hashMap2, new zzbq());
        zzj(hashMap2, new zzbr());
        zzj(hashMap2, new zzbv());
        zzj(hashMap2, new zzbw());
        zzj(hashMap2, new zzdc());
        zzj(hashMap2, new zzdd());
        zzj(hashMap2, new zzed());
        zzj(hashMap2, new zzfj());
        HashMap hashMap3 = new HashMap();
        this.zze = hashMap3;
        zzj(hashMap3, new zze(zzd.zzb(context)));
        zzj(hashMap3, new zzf(zzd.zzb(context)));
        zzj(hashMap3, new zzh(context));
        zzj(hashMap3, new zzi(context));
        zzj(hashMap3, new zzj(context));
        zzj(hashMap3, new zzk(context));
        zzj(hashMap3, new zzl(context));
        zzj(hashMap3, new zzs());
        zzj(hashMap3, new zzam(zzrvVar.zzb()));
        zzj(hashMap3, new zzaq(zzapVar));
        zzj(hashMap3, new zzax(dataLayer));
        zzj(hashMap3, new zzbh(context));
        zzj(hashMap3, new zzbi());
        zzj(hashMap3, new zzbp());
        zzj(hashMap3, new zzbs(this));
        zzj(hashMap3, new zzbx());
        zzj(hashMap3, new zzby());
        zzj(hashMap3, new zzcv(context));
        zzj(hashMap3, new zzcx());
        zzj(hashMap3, new zzdb());
        zzj(hashMap3, new zzdh());
        zzj(hashMap3, new zzdi(context));
        zzj(hashMap3, new zzds());
        zzj(hashMap3, new zzdw());
        zzj(hashMap3, new zzea());
        zzj(hashMap3, new zzec());
        zzj(hashMap3, new zzee(context));
        zzj(hashMap3, new zzeu());
        zzj(hashMap3, new zzev());
        zzj(hashMap3, new zzfp());
        zzj(hashMap3, new zzfw());
        this.zzh = new HashMap();
        for (zzrz zzrzVar : hashSet) {
            for (int i = 0; i < zzrzVar.zza().size(); i++) {
                zzrr zzrrVar = (zzrr) zzrzVar.zza().get(i);
                zzes zzg = zzg(this.zzh, zzh(zzrrVar));
                zzg.zzk(zzrzVar);
                zzg.zzg(zzrzVar, zzrrVar);
                zzg.zzh(zzrzVar, "Unknown");
            }
            for (int i2 = 0; i2 < zzrzVar.zzf().size(); i2++) {
                zzrr zzrrVar2 = (zzrr) zzrzVar.zzf().get(i2);
                zzes zzg2 = zzg(this.zzh, zzh(zzrrVar2));
                zzg2.zzk(zzrzVar);
                zzg2.zzi(zzrzVar, zzrrVar2);
                zzg2.zzj(zzrzVar, "Unknown");
            }
        }
        for (Map.Entry entry : this.zzb.zzd().entrySet()) {
            for (zzrr zzrrVar3 : (List) entry.getValue()) {
                if (!zzfu.zzf(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) zzrrVar3.zzc().get(com.google.android.gms.internal.gtm.zzb.zzcg.toString()))).booleanValue()) {
                    zzg(this.zzh, (String) entry.getKey()).zzl(zzrrVar3);
                }
            }
        }
    }

    private static zzes zzg(Map map, String str) {
        zzes zzesVar = (zzes) map.get(str);
        if (zzesVar == null) {
            zzes zzesVar2 = new zzes();
            map.put(str, zzesVar2);
            return zzesVar2;
        }
        return zzesVar;
    }

    private static String zzh(zzrr zzrrVar) {
        return zzfu.zzm(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) zzrrVar.zzc().get(com.google.android.gms.internal.gtm.zzb.zzbA.toString())));
    }

    private final String zzi() {
        if (this.zzj <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.zzj));
        for (int i = 2; i < this.zzj; i++) {
            sb.append(' ');
        }
        sb.append(": ");
        return sb.toString();
    }

    private static void zzj(Map map, zzbt zzbtVar) {
        if (map.containsKey(zzbtVar.zze())) {
            throw new IllegalArgumentException("Duplicate function type name: ".concat(String.valueOf(zzbtVar.zze())));
        }
        map.put(zzbtVar.zze(), zzbtVar);
    }

    private final void zzk(com.google.android.gms.internal.gtm.zzam zzamVar, Set set) {
        zzdr zzo;
        if (zzamVar == null || (zzo = zzo(zzamVar, set, new zzdp())) == zza) {
            return;
        }
        Object zzk = zzfu.zzk((com.google.android.gms.internal.gtm.zzam) zzo.zza());
        if (zzk instanceof Map) {
            this.zzg.push((Map) zzk);
        } else if (zzk instanceof List) {
            for (Object obj : (List) zzk) {
                if (obj instanceof Map) {
                    this.zzg.push((Map) obj);
                } else {
                    Log.w("GoogleTagManager", "pushAfterEvaluate: value not a Map");
                }
            }
        } else {
            Log.w("GoogleTagManager", "pushAfterEvaluate: value not a Map or List");
        }
    }

    private final zzdr zzl(Set set, Set set2, zzeq zzeqVar, zzdo zzdoVar) {
        boolean z;
        boolean z2;
        zzdr zzdrVar;
        Set hashSet = new HashSet();
        Set hashSet2 = new HashSet();
        Iterator it = set.iterator();
        while (true) {
            while (it.hasNext()) {
                zzrz zzrzVar = (zzrz) it.next();
                zzdn zzdnVar = new zzdn();
                Iterator it2 = zzrzVar.zzd().iterator();
                while (true) {
                    while (true) {
                        if (it2.hasNext()) {
                            zzdr zzf = zzf((zzrr) it2.next(), set2, new zzdm());
                            if (((Boolean) zzf.zza()).booleanValue()) {
                                zzfu.zzb(false);
                                zzdrVar = new zzdr(false, zzf.zzb());
                                break;
                            }
                            z2 = z2 && zzf.zzb();
                        } else {
                            Iterator it3 = zzrzVar.zze().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zzdr zzf2 = zzf((zzrr) it3.next(), set2, new zzdm());
                                    if (!((Boolean) zzf2.zza()).booleanValue()) {
                                        zzfu.zzb(false);
                                        zzdrVar = new zzdr(false, zzf2.zzb());
                                        break;
                                    }
                                    z2 = z2 && zzf2.zzb();
                                } else {
                                    zzfu.zzb(true);
                                    zzdrVar = new zzdr(true, z2);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (((Boolean) zzdrVar.zza()).booleanValue()) {
                    zzeqVar.zza(zzrzVar, hashSet, hashSet2, zzdnVar);
                }
                z = z && zzdrVar.zzb();
            }
            hashSet.removeAll(hashSet2);
            return new zzdr(hashSet, z);
        }
    }

    private final zzdr zzm(String str, Set set, zzdl zzdlVar) {
        zzrr zzrrVar;
        boolean z = true;
        this.zzj++;
        zzer zzerVar = (zzer) this.zzm.zza(str);
        if (zzerVar == null) {
            zzes zzesVar = (zzes) this.zzh.get(str);
            if (zzesVar == null) {
                Log.e("GoogleTagManager", zzi() + "Invalid macro: " + str);
                this.zzj = this.zzj + (-1);
                return zza;
            }
            zzdr zzl = zzl(zzesVar.zzf(), set, new zzeo(this, zzesVar.zzc(), zzesVar.zzb(), zzesVar.zze(), zzesVar.zzd()), new zzdo());
            if (((Set) zzl.zza()).isEmpty()) {
                zzrrVar = zzesVar.zza();
            } else {
                if (((Set) zzl.zza()).size() > 1) {
                    Log.w("GoogleTagManager", zzi() + "Multiple macros active for macroName " + str);
                }
                zzrrVar = (zzrr) ((Set) zzl.zza()).iterator().next();
            }
            if (zzrrVar == null) {
                this.zzj--;
                return zza;
            }
            zzdr zzn = zzn(this.zze, zzrrVar, set, new zzdm());
            z = (zzl.zzb() && zzn.zzb()) ? false : false;
            zzdr zzdrVar = zza;
            if (zzn != zzdrVar) {
                zzdrVar = new zzdr((com.google.android.gms.internal.gtm.zzam) zzn.zza(), z);
            }
            com.google.android.gms.internal.gtm.zzam zza2 = zzrrVar.zza();
            if (zzdrVar.zzb()) {
                this.zzm.zzb(str, new zzer(zzdrVar, zza2));
            }
            zzk(zza2, set);
            this.zzj--;
            return zzdrVar;
        }
        zzk(zzerVar.zzb(), set);
        this.zzj--;
        return zzerVar.zzc();
    }

    private final zzdr zzn(Map map, zzrr zzrrVar, Set set, zzdm zzdmVar) {
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) zzrrVar.zzc().get(com.google.android.gms.internal.gtm.zzb.zzbo.toString());
        if (zzamVar == null) {
            Log.e("GoogleTagManager", "No function id in properties");
            return zza;
        }
        String zzo = zzamVar.zzo();
        zzbt zzbtVar = (zzbt) map.get(zzo);
        if (zzbtVar == null) {
            Log.e("GoogleTagManager", String.valueOf(zzo).concat(" has no backing implementation."));
            return zza;
        }
        zzdr zzdrVar = (zzdr) this.zzl.zza(zzrrVar);
        if (zzdrVar == null) {
            HashMap hashMap = new HashMap();
            boolean z = true;
            boolean z2 = true;
            for (Map.Entry entry : zzrrVar.zzc().entrySet()) {
                String str = (String) entry.getKey();
                com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) entry.getValue();
                zzdr zzo2 = zzo((com.google.android.gms.internal.gtm.zzam) entry.getValue(), set, new zzdp());
                zzdr zzdrVar2 = zza;
                if (zzo2 == zzdrVar2) {
                    return zzdrVar2;
                }
                if (zzo2.zzb()) {
                    zzrrVar.zzd((String) entry.getKey(), (com.google.android.gms.internal.gtm.zzam) zzo2.zza());
                } else {
                    z2 = false;
                }
                hashMap.put((String) entry.getKey(), (com.google.android.gms.internal.gtm.zzam) zzo2.zza());
            }
            if (!zzbtVar.zzg(hashMap.keySet())) {
                String obj = zzbtVar.zzf().toString();
                String valueOf = String.valueOf(hashMap.keySet());
                Log.e("GoogleTagManager", "Incorrect keys for function " + zzo + " required " + obj + " had " + valueOf);
                return zza;
            }
            z = (z2 && zzbtVar.zzb()) ? false : false;
            zzdr zzdrVar3 = new zzdr(zzbtVar.zza(hashMap), z);
            if (z) {
                this.zzl.zzb(zzrrVar, zzdrVar3);
            }
            com.google.android.gms.internal.gtm.zzam zzamVar3 = (com.google.android.gms.internal.gtm.zzam) zzdrVar3.zza();
            return zzdrVar3;
        }
        return zzdrVar;
    }

    private final zzdr zzo(com.google.android.gms.internal.gtm.zzam zzamVar, Set set, zzdp zzdpVar) {
        com.google.android.gms.internal.gtm.zzaq[] zzaqVarArr;
        if (zzamVar.zzP()) {
            com.google.android.gms.internal.gtm.zzat zzatVar = com.google.android.gms.internal.gtm.zzat.zza;
            int ordinal = zzamVar.zzh().ordinal();
            if (ordinal == 1) {
                com.google.android.gms.internal.gtm.zzan zzZ = zzsd.zza(zzamVar).zzZ();
                zzZ.zzj();
                for (int i = 0; i < zzamVar.zza(); i++) {
                    zzdr zzo = zzo(zzamVar.zzk(i), set, new zzdp());
                    zzdr zzdrVar = zza;
                    if (zzo == zzdrVar) {
                        return zzdrVar;
                    }
                    zzZ.zze((com.google.android.gms.internal.gtm.zzam) zzo.zza());
                }
                return new zzdr(zzZ.zzB(), false);
            } else if (ordinal == 2) {
                com.google.android.gms.internal.gtm.zzan zzZ2 = zzsd.zza(zzamVar).zzZ();
                if (zzamVar.zzc() != zzamVar.zzd()) {
                    Log.e("GoogleTagManager", "Invalid serving value: ".concat(zzamVar.toString()));
                    return zza;
                }
                zzZ2.zzk();
                zzZ2.zzl();
                for (int i2 = 0; i2 < zzamVar.zzc(); i2++) {
                    zzdr zzo2 = zzo(zzamVar.zzl(i2), set, new zzdp());
                    zzdr zzo3 = zzo(zzamVar.zzm(i2), set, new zzdp());
                    zzdr zzdrVar2 = zza;
                    if (zzo2 == zzdrVar2 || zzo3 == zzdrVar2) {
                        return zzdrVar2;
                    }
                    zzZ2.zzf((com.google.android.gms.internal.gtm.zzam) zzo2.zza());
                    zzZ2.zzg((com.google.android.gms.internal.gtm.zzam) zzo3.zza());
                }
                return new zzdr(zzZ2.zzB(), false);
            } else if (ordinal == 3) {
                if (set.contains(zzamVar.zzp())) {
                    Log.e("GoogleTagManager", "Macro cycle detected.  Current macro reference: " + zzamVar.zzp() + ".  Previous macro references: " + set.toString() + ".");
                    return zza;
                } else {
                    set.add(zzamVar.zzp());
                    zzdr zzm = zzm(zzamVar.zzp(), set, new zzdl());
                    for (com.google.android.gms.internal.gtm.zzaq zzaqVar : (com.google.android.gms.internal.gtm.zzaq[]) zzamVar.zzr().toArray(new com.google.android.gms.internal.gtm.zzaq[0])) {
                        if (!(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) zzm.zza()) instanceof String)) {
                            Log.e("GoogleTagManager", "Escaping can only be applied to strings.");
                        } else {
                            com.google.android.gms.internal.gtm.zzaq zzaqVar2 = com.google.android.gms.internal.gtm.zzaq.zza;
                            if (zzaqVar.ordinal() == 11) {
                                try {
                                    zzm = new zzdr(zzfu.zzb(zzfx.zza(zzfu.zzm(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) zzm.zza())))), zzm.zzb());
                                } catch (UnsupportedEncodingException e) {
                                    Log.e("GoogleTagManager", "Escape URI: unsupported encoding", e);
                                }
                            }
                        }
                    }
                    set.remove(zzamVar.zzp());
                    return zzm;
                }
            } else {
                if (ordinal == 6) {
                    com.google.android.gms.internal.gtm.zzan zzZ3 = zzsd.zza(zzamVar).zzZ();
                    zzZ3.zzm();
                    for (int i3 = 0; i3 < zzamVar.zze(); i3++) {
                        zzdr zzo4 = zzo(zzamVar.zzn(i3), set, new zzdp());
                        zzdr zzdrVar3 = zza;
                        if (zzo4 == zzdrVar3) {
                            return zzdrVar3;
                        }
                        zzZ3.zzh((com.google.android.gms.internal.gtm.zzam) zzo4.zza());
                    }
                    return new zzdr(zzZ3.zzB(), false);
                }
                Log.e("GoogleTagManager", "Unknown type: ".concat(String.valueOf(String.valueOf(zzamVar.zzh()))));
                return zza;
            }
        }
        return new zzdr(zzamVar, true);
    }

    public final zzdr zza(String str) {
        this.zzj = 0;
        return zzm(str, new HashSet(), new zzdl());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized String zzb() {
        return this.zzi;
    }

    public final synchronized void zzc(String str) {
        zzd(str);
        zzdo zzdoVar = new zzdo();
        for (zzrr zzrrVar : (Set) zzl(this.zzf, new HashSet(), new zzep(this), zzdoVar).zza()) {
            zzn(this.zzc, zzrrVar, new HashSet(), new zzdm());
        }
        zzd(null);
    }

    final synchronized void zzd(String str) {
        this.zzi = str;
    }

    public final synchronized void zze(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.gtm.zzai zzaiVar = (com.google.android.gms.internal.gtm.zzai) it.next();
            if (zzaiVar.zzf() && zzaiVar.zzd().startsWith("gaExperiment:")) {
                DataLayer dataLayer = this.zzg;
                if (!zzaiVar.zze()) {
                    Log.w("GoogleTagManager", "supplemental missing experimentSupplemental");
                } else {
                    for (com.google.android.gms.internal.gtm.zzam zzamVar : zzaiVar.zza().zze()) {
                        dataLayer.zzd(zzfu.zzm(zzfu.zzk(zzamVar)));
                    }
                    Iterator it2 = zzaiVar.zza().zzf().iterator();
                    while (true) {
                        Map<String, Object> map = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object zzk = zzfu.zzk((com.google.android.gms.internal.gtm.zzam) it2.next());
                        if (!(zzk instanceof Map)) {
                            String valueOf = String.valueOf(zzk);
                            Log.w("GoogleTagManager", "value: " + valueOf + " is not a map value, ignored.");
                        } else {
                            map = (Map) zzk;
                        }
                        if (map != null) {
                            dataLayer.push(map);
                        }
                    }
                    for (com.google.android.gms.internal.gtm.zzw zzwVar : zzaiVar.zza().zzd()) {
                        if (!zzwVar.zzh()) {
                            Log.w("GoogleTagManager", "GaExperimentRandom: No key");
                        } else {
                            Object obj = dataLayer.get(zzwVar.zzf());
                            Long valueOf2 = !(obj instanceof Number) ? null : Long.valueOf(((Number) obj).longValue());
                            long zzd = zzwVar.zzd();
                            long zzc = zzwVar.zzc();
                            if (!zzwVar.zzg() || valueOf2 == null || valueOf2.longValue() < zzd || valueOf2.longValue() > zzc) {
                                if (zzd <= zzc) {
                                    obj = Long.valueOf(Math.round((Math.random() * (zzc - zzd)) + zzd));
                                } else {
                                    Log.w("GoogleTagManager", "GaExperimentRandom: random range invalid");
                                }
                            }
                            dataLayer.zzd(zzwVar.zzf());
                            Map zza2 = dataLayer.zza(zzwVar.zzf(), obj);
                            if (zzwVar.zza() > 0) {
                                if (zza2.containsKey("gtm")) {
                                    Object obj2 = zza2.get("gtm");
                                    if (obj2 instanceof Map) {
                                        ((Map) obj2).put("lifetime", Long.valueOf(zzwVar.zza()));
                                    } else {
                                        Log.w("GoogleTagManager", "GaExperimentRandom: gtm not a map");
                                    }
                                } else {
                                    zza2.put("gtm", DataLayer.mapOf("lifetime", Long.valueOf(zzwVar.zza())));
                                }
                            }
                            dataLayer.push(zza2);
                        }
                    }
                }
            }
            zzdg.zzb.zzd("Ignored supplemental: ".concat(String.valueOf(String.valueOf(zzaiVar))));
        }
    }

    final zzdr zzf(zzrr zzrrVar, Set set, zzdm zzdmVar) {
        zzdr zzn = zzn(this.zzd, zzrrVar, set, zzdmVar);
        Boolean zzf = zzfu.zzf(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) zzn.zza()));
        zzfu.zzb(zzf);
        return new zzdr(zzf, zzn.zzb());
    }
}
