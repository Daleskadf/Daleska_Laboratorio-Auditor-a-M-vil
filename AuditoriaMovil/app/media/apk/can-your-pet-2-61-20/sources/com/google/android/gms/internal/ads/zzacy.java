package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzacy implements zzadm {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20};
    private static final zzacx zzc = new zzacx(new zzacw() { // from class: com.google.android.gms.internal.ads.zzacu
        @Override // com.google.android.gms.internal.ads.zzacw
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzadf.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzacx zzd = new zzacx(new zzacw() { // from class: com.google.android.gms.internal.ads.zzacv
        @Override // com.google.android.gms.internal.ads.zzacw
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzadf.class).getConstructor(new Class[0]);
        }
    });
    private zzfzn zze;
    private final zzalf zzf = new zzala();

    /* JADX WARN: Removed duplicated region for block: B:131:0x01e8 A[Catch: all -> 0x03ca, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:131:0x01e8, B:132:0x01eb, B:246:0x039c, B:247:0x039f, B:249:0x03a4, B:252:0x03aa, B:253:0x03ad, B:254:0x03b0, B:255:0x03b7, B:257:0x03bd, B:135:0x01f4, B:137:0x01fc, B:140:0x0206, B:143:0x0211, B:145:0x0219, B:148:0x0223, B:151:0x022e, B:154:0x0239, B:157:0x0244, B:159:0x024c, B:161:0x0254, B:164:0x025e, B:166:0x026c, B:169:0x0276, B:172:0x0281, B:174:0x0289, B:176:0x0297, B:178:0x02a5, B:181:0x02b5, B:183:0x02c3, B:186:0x02cd, B:188:0x02d5, B:190:0x02dd, B:192:0x02e5, B:195:0x02ef, B:197:0x02f7, B:200:0x0307, B:202:0x030f, B:205:0x0319, B:207:0x0321, B:210:0x032a, B:212:0x0332, B:215:0x033b, B:218:0x0346, B:221:0x0351, B:224:0x035c, B:226:0x0364, B:229:0x036d, B:14:0x0048, B:15:0x0050, B:108:0x01ad, B:17:0x0055, B:20:0x0061, B:23:0x006d, B:26:0x0079, B:29:0x0085, B:32:0x0090, B:35:0x009b, B:38:0x00a6, B:41:0x00b2, B:44:0x00be, B:47:0x00ca, B:50:0x00d6, B:53:0x00e1, B:56:0x00ec, B:59:0x00f7, B:62:0x0103, B:65:0x010f, B:68:0x011b, B:71:0x0127, B:74:0x0133, B:77:0x013f, B:80:0x014b, B:83:0x0156, B:86:0x0161, B:89:0x016c, B:92:0x0177, B:95:0x0181, B:98:0x018c, B:101:0x0197, B:104:0x01a2), top: B:264:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f4 A[Catch: all -> 0x03ca, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:131:0x01e8, B:132:0x01eb, B:246:0x039c, B:247:0x039f, B:249:0x03a4, B:252:0x03aa, B:253:0x03ad, B:254:0x03b0, B:255:0x03b7, B:257:0x03bd, B:135:0x01f4, B:137:0x01fc, B:140:0x0206, B:143:0x0211, B:145:0x0219, B:148:0x0223, B:151:0x022e, B:154:0x0239, B:157:0x0244, B:159:0x024c, B:161:0x0254, B:164:0x025e, B:166:0x026c, B:169:0x0276, B:172:0x0281, B:174:0x0289, B:176:0x0297, B:178:0x02a5, B:181:0x02b5, B:183:0x02c3, B:186:0x02cd, B:188:0x02d5, B:190:0x02dd, B:192:0x02e5, B:195:0x02ef, B:197:0x02f7, B:200:0x0307, B:202:0x030f, B:205:0x0319, B:207:0x0321, B:210:0x032a, B:212:0x0332, B:215:0x033b, B:218:0x0346, B:221:0x0351, B:224:0x035c, B:226:0x0364, B:229:0x036d, B:14:0x0048, B:15:0x0050, B:108:0x01ad, B:17:0x0055, B:20:0x0061, B:23:0x006d, B:26:0x0079, B:29:0x0085, B:32:0x0090, B:35:0x009b, B:38:0x00a6, B:41:0x00b2, B:44:0x00be, B:47:0x00ca, B:50:0x00d6, B:53:0x00e1, B:56:0x00ec, B:59:0x00f7, B:62:0x0103, B:65:0x010f, B:68:0x011b, B:71:0x0127, B:74:0x0133, B:77:0x013f, B:80:0x014b, B:83:0x0156, B:86:0x0161, B:89:0x016c, B:92:0x0177, B:95:0x0181, B:98:0x018c, B:101:0x0197, B:104:0x01a2), top: B:264:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x03ca, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:131:0x01e8, B:132:0x01eb, B:246:0x039c, B:247:0x039f, B:249:0x03a4, B:252:0x03aa, B:253:0x03ad, B:254:0x03b0, B:255:0x03b7, B:257:0x03bd, B:135:0x01f4, B:137:0x01fc, B:140:0x0206, B:143:0x0211, B:145:0x0219, B:148:0x0223, B:151:0x022e, B:154:0x0239, B:157:0x0244, B:159:0x024c, B:161:0x0254, B:164:0x025e, B:166:0x026c, B:169:0x0276, B:172:0x0281, B:174:0x0289, B:176:0x0297, B:178:0x02a5, B:181:0x02b5, B:183:0x02c3, B:186:0x02cd, B:188:0x02d5, B:190:0x02dd, B:192:0x02e5, B:195:0x02ef, B:197:0x02f7, B:200:0x0307, B:202:0x030f, B:205:0x0319, B:207:0x0321, B:210:0x032a, B:212:0x0332, B:215:0x033b, B:218:0x0346, B:221:0x0351, B:224:0x035c, B:226:0x0364, B:229:0x036d, B:14:0x0048, B:15:0x0050, B:108:0x01ad, B:17:0x0055, B:20:0x0061, B:23:0x006d, B:26:0x0079, B:29:0x0085, B:32:0x0090, B:35:0x009b, B:38:0x00a6, B:41:0x00b2, B:44:0x00be, B:47:0x00ca, B:50:0x00d6, B:53:0x00e1, B:56:0x00ec, B:59:0x00f7, B:62:0x0103, B:65:0x010f, B:68:0x011b, B:71:0x0127, B:74:0x0133, B:77:0x013f, B:80:0x014b, B:83:0x0156, B:86:0x0161, B:89:0x016c, B:92:0x0177, B:95:0x0181, B:98:0x018c, B:101:0x0197, B:104:0x01a2), top: B:264:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x039a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03a4 A[Catch: all -> 0x03ca, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:131:0x01e8, B:132:0x01eb, B:246:0x039c, B:247:0x039f, B:249:0x03a4, B:252:0x03aa, B:253:0x03ad, B:254:0x03b0, B:255:0x03b7, B:257:0x03bd, B:135:0x01f4, B:137:0x01fc, B:140:0x0206, B:143:0x0211, B:145:0x0219, B:148:0x0223, B:151:0x022e, B:154:0x0239, B:157:0x0244, B:159:0x024c, B:161:0x0254, B:164:0x025e, B:166:0x026c, B:169:0x0276, B:172:0x0281, B:174:0x0289, B:176:0x0297, B:178:0x02a5, B:181:0x02b5, B:183:0x02c3, B:186:0x02cd, B:188:0x02d5, B:190:0x02dd, B:192:0x02e5, B:195:0x02ef, B:197:0x02f7, B:200:0x0307, B:202:0x030f, B:205:0x0319, B:207:0x0321, B:210:0x032a, B:212:0x0332, B:215:0x033b, B:218:0x0346, B:221:0x0351, B:224:0x035c, B:226:0x0364, B:229:0x036d, B:14:0x0048, B:15:0x0050, B:108:0x01ad, B:17:0x0055, B:20:0x0061, B:23:0x006d, B:26:0x0079, B:29:0x0085, B:32:0x0090, B:35:0x009b, B:38:0x00a6, B:41:0x00b2, B:44:0x00be, B:47:0x00ca, B:50:0x00d6, B:53:0x00e1, B:56:0x00ec, B:59:0x00f7, B:62:0x0103, B:65:0x010f, B:68:0x011b, B:71:0x0127, B:74:0x0133, B:77:0x013f, B:80:0x014b, B:83:0x0156, B:86:0x0161, B:89:0x016c, B:92:0x0177, B:95:0x0181, B:98:0x018c, B:101:0x0197, B:104:0x01a2), top: B:264:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03bd A[Catch: all -> 0x03ca, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:131:0x01e8, B:132:0x01eb, B:246:0x039c, B:247:0x039f, B:249:0x03a4, B:252:0x03aa, B:253:0x03ad, B:254:0x03b0, B:255:0x03b7, B:257:0x03bd, B:135:0x01f4, B:137:0x01fc, B:140:0x0206, B:143:0x0211, B:145:0x0219, B:148:0x0223, B:151:0x022e, B:154:0x0239, B:157:0x0244, B:159:0x024c, B:161:0x0254, B:164:0x025e, B:166:0x026c, B:169:0x0276, B:172:0x0281, B:174:0x0289, B:176:0x0297, B:178:0x02a5, B:181:0x02b5, B:183:0x02c3, B:186:0x02cd, B:188:0x02d5, B:190:0x02dd, B:192:0x02e5, B:195:0x02ef, B:197:0x02f7, B:200:0x0307, B:202:0x030f, B:205:0x0319, B:207:0x0321, B:210:0x032a, B:212:0x0332, B:215:0x033b, B:218:0x0346, B:221:0x0351, B:224:0x035c, B:226:0x0364, B:229:0x036d, B:14:0x0048, B:15:0x0050, B:108:0x01ad, B:17:0x0055, B:20:0x0061, B:23:0x006d, B:26:0x0079, B:29:0x0085, B:32:0x0090, B:35:0x009b, B:38:0x00a6, B:41:0x00b2, B:44:0x00be, B:47:0x00ca, B:50:0x00d6, B:53:0x00e1, B:56:0x00ec, B:59:0x00f7, B:62:0x0103, B:65:0x010f, B:68:0x011b, B:71:0x0127, B:74:0x0133, B:77:0x013f, B:80:0x014b, B:83:0x0156, B:86:0x0161, B:89:0x016c, B:92:0x0177, B:95:0x0181, B:98:0x018c, B:101:0x0197, B:104:0x01a2), top: B:264:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzadm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.zzadf[] zza(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacy.zza(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzadf[]");
    }

    private final void zzb(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzand());
                return;
            case 1:
                list.add(new zzang());
                return;
            case 2:
                list.add(new zzanj(0));
                return;
            case 3:
                list.add(new zzaeu(0));
                return;
            case 4:
                zzadf zza2 = zzc.zza(0);
                if (zza2 != null) {
                    list.add(zza2);
                    return;
                } else {
                    list.add(new zzafm(0));
                    return;
                }
            case 5:
                list.add(new zzafp());
                return;
            case 6:
                list.add(new zzaik(this.zzf, 2));
                return;
            case 7:
                list.add(new zzais(0));
                return;
            case 8:
                list.add(new zzajp(this.zzf, 32));
                list.add(new zzajv(this.zzf, 16));
                return;
            case 9:
                list.add(new zzakm());
                return;
            case 10:
                list.add(new zzaom());
                return;
            case 11:
                if (this.zze == null) {
                    this.zze = zzfzn.zzm();
                }
                list.add(new zzaow(1, 1, this.zzf, new zzfv(0L), new zzanl(0, this.zze), 112800));
                return;
            case 12:
                list.add(new zzapi());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new zzafv(0));
                return;
            case 15:
                zzadf zza3 = zzd.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    return;
                }
                return;
            case 16:
                list.add(new zzaez(1, this.zzf));
                return;
            case 17:
                list.add(new zzakx());
                return;
            case 18:
                list.add(new zzapn());
                return;
            case 19:
                list.add(new zzafg());
                return;
            case 20:
                list.add(new zzafu());
                return;
        }
    }
}
