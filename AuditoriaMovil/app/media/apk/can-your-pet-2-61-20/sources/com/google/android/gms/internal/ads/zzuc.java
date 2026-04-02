package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzuc {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x04e9, code lost:
        if (r1.equals("L90") != false) goto L218;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzam r21) {
        /*
            Method dump skipped, instructions count: 2462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuc.zza(com.google.android.gms.internal.ads.zzam):android.util.Pair");
    }

    public static zzti zzb() throws zztw {
        List zze = zze("audio/raw", false, false);
        if (zze.isEmpty()) {
            return null;
        }
        return (zzti) zze.get(0);
    }

    public static String zzc(zzam zzamVar) {
        Pair zza2;
        if ("audio/eac3-joc".equals(zzamVar.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzamVar.zzm) || (zza2 = zza(zzamVar)) == null) {
            return null;
        }
        int intValue = ((Integer) zza2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List zzd(zztq zztqVar, zzam zzamVar, boolean z, boolean z2) throws zztw {
        String zzc2 = zzc(zzamVar);
        if (zzc2 == null) {
            return zzfzn.zzm();
        }
        return zze(zzc2, z, z2);
    }

    public static synchronized List zze(String str, boolean z, boolean z2) throws zztw {
        synchronized (zzuc.class) {
            zztu zztuVar = new zztu(str, z, z2);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zztuVar);
            if (list != null) {
                return list;
            }
            int i = zzfx.zza;
            ArrayList zzh = zzh(zztuVar, new zzua(z, z2));
            if (z && zzh.isEmpty() && zzfx.zza <= 23) {
                zzh = zzh(zztuVar, new zztz(null));
                if (!zzh.isEmpty()) {
                    String str2 = ((zzti) zzh.get(0)).zza;
                    zzfe.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + str2);
                }
            }
            if ("audio/raw".equals(str)) {
                if (zzfx.zza < 26 && zzfx.zzb.equals("R9") && zzh.size() == 1 && ((zzti) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzti.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzi(zzh, new zzub() { // from class: com.google.android.gms.internal.ads.zzts
                    @Override // com.google.android.gms.internal.ads.zzub
                    public final int zza(Object obj) {
                        int i2 = zzuc.zza;
                        String str3 = ((zzti) obj).zza;
                        if (str3.startsWith("OMX.google") || str3.startsWith("c2.android")) {
                            return 1;
                        }
                        return (zzfx.zza >= 26 || !str3.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (zzfx.zza < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzti) zzh.get(0)).zza)) {
                zzh.add((zzti) zzh.remove(0));
            }
            zzfzn zzk = zzfzn.zzk(zzh);
            hashMap.put(zztuVar, zzk);
            return zzk;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zzf(zztq zztqVar, zzam zzamVar, boolean z, boolean z2) throws zztw {
        List zze = zze(zzamVar.zzm, z, z2);
        List zzd = zzd(zztqVar, zzamVar, z, z2);
        zzfzk zzfzkVar = new zzfzk();
        zzfzkVar.zzh(zze);
        zzfzkVar.zzh(zzd);
        return zzfzkVar.zzi();
    }

    public static List zzg(List list, final zzam zzamVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzub() { // from class: com.google.android.gms.internal.ads.zztt
            @Override // com.google.android.gms.internal.ads.zzub
            public final int zza(Object obj) {
                int i = zzuc.zza;
                return ((zzti) obj).zzd(zzam.this) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:64|65|(1:67)(2:129|(1:131)(1:132))|68|(1:70)(2:121|(1:128)(1:127))|(4:(2:115|116)|95|(8:98|99|100|101|102|103|104|106)|11)|74|75|76|77|11) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01bf, code lost:
        if (r1.zzb == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01dd, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (r7 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x018d A[Catch: Exception -> 0x021e, TryCatch #1 {Exception -> 0x021e, blocks: (B:80:0x0143, B:86:0x015a, B:92:0x016e, B:94:0x0174, B:99:0x0183, B:101:0x018d, B:111:0x01b7, B:102:0x0192, B:104:0x01a2, B:106:0x01aa, B:95:0x017a), top: B:153:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0192 A[Catch: Exception -> 0x021e, TryCatch #1 {Exception -> 0x021e, blocks: (B:80:0x0143, B:86:0x015a, B:92:0x016e, B:94:0x0174, B:99:0x0183, B:101:0x018d, B:111:0x01b7, B:102:0x0192, B:104:0x01a2, B:106:0x01aa, B:95:0x017a), top: B:153:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022d A[Catch: Exception -> 0x027b, TRY_ENTER, TryCatch #4 {Exception -> 0x027b, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0033, B:14:0x0041, B:16:0x0047, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0067, B:26:0x0071, B:28:0x007b, B:30:0x0085, B:32:0x008f, B:34:0x0099, B:36:0x00a3, B:38:0x00ad, B:40:0x00b7, B:42:0x00bd, B:44:0x00c5, B:46:0x00cd, B:48:0x00d5, B:138:0x0225, B:141:0x022d, B:143:0x0233, B:144:0x024d, B:145:0x026e, B:51:0x00de, B:52:0x00e1, B:54:0x00e9, B:57:0x00f4, B:59:0x00fc, B:62:0x0107, B:64:0x010f, B:67:0x011a, B:69:0x0122, B:72:0x012d, B:74:0x0135), top: B:159:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x024d A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0174 A[Catch: Exception -> 0x021e, TryCatch #1 {Exception -> 0x021e, blocks: (B:80:0x0143, B:86:0x015a, B:92:0x016e, B:94:0x0174, B:99:0x0183, B:101:0x018d, B:111:0x01b7, B:102:0x0192, B:104:0x01a2, B:106:0x01aa, B:95:0x017a), top: B:153:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017a A[Catch: Exception -> 0x021e, TryCatch #1 {Exception -> 0x021e, blocks: (B:80:0x0143, B:86:0x015a, B:92:0x016e, B:94:0x0174, B:99:0x0183, B:101:0x018d, B:111:0x01b7, B:102:0x0192, B:104:0x01a2, B:106:0x01aa, B:95:0x017a), top: B:153:0x0143 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zztu r23, com.google.android.gms.internal.ads.zztx r24) throws com.google.android.gms.internal.ads.zztw {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuc.zzh(com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zztx):java.util.ArrayList");
    }

    private static void zzi(List list, final zzub zzubVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zztr
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = zzuc.zza;
                zzub zzubVar2 = zzub.this;
                return zzubVar2.zza(obj2) - zzubVar2.zza(obj);
            }
        });
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (zzfx.zza >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        } else if (zzcb.zzg(str)) {
            return true;
        } else {
            String zza2 = zzfvx.zza(mediaCodecInfo.getName());
            if (zza2.startsWith("arc.")) {
                return false;
            }
            if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
                return true;
            }
            return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
        }
    }
}
