package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzwf implements zzzx, zzuw {
    final /* synthetic */ zzwk zza;
    private final Uri zzc;
    private final zzhx zzd;
    private final zzvz zze;
    private final zzadi zzf;
    private final zzeo zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzaem zzm;
    private boolean zzn;
    private final zzaec zzh = new zzaec();
    private boolean zzj = true;
    private final long zzb = zzuy.zza();
    private zzhb zzl = zzi(0);

    public zzwf(zzwk zzwkVar, Uri uri, zzgv zzgvVar, zzvz zzvzVar, zzadi zzadiVar, zzeo zzeoVar) {
        this.zza = zzwkVar;
        this.zzc = uri;
        this.zzd = new zzhx(zzgvVar);
        this.zze = zzvzVar;
        this.zzf = zzadiVar;
        this.zzg = zzeoVar;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzwf zzwfVar, long j, long j2) {
        zzwfVar.zzh.zza = j;
        zzwfVar.zzk = j2;
        zzwfVar.zzj = true;
        zzwfVar.zzn = false;
    }

    private final zzhb zzi(long j) {
        Map map;
        zzgz zzgzVar = new zzgz();
        zzgzVar.zzd(this.zzc);
        zzgzVar.zzc(j);
        zzgzVar.zza(6);
        map = zzwk.zzb;
        zzgzVar.zzb(map);
        return zzgzVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzx
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x009e A[Catch: all -> 0x0207, TryCatch #1 {all -> 0x0207, blocks: (B:144:0x000b, B:154:0x003c, B:155:0x0041, B:158:0x0057, B:159:0x005d, B:168:0x0093, B:170:0x009e, B:172:0x00aa, B:174:0x00b4, B:176:0x00c0, B:178:0x00ca, B:180:0x00d6, B:182:0x00e0, B:184:0x00f2, B:186:0x00fc, B:187:0x0102, B:196:0x0132, B:197:0x0139, B:199:0x0146, B:201:0x014e, B:203:0x016b, B:205:0x0186, B:206:0x018b, B:208:0x018f, B:190:0x010c, B:193:0x0120, B:163:0x0069, B:166:0x007f), top: B:252:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00b4 A[Catch: all -> 0x0207, TryCatch #1 {all -> 0x0207, blocks: (B:144:0x000b, B:154:0x003c, B:155:0x0041, B:158:0x0057, B:159:0x005d, B:168:0x0093, B:170:0x009e, B:172:0x00aa, B:174:0x00b4, B:176:0x00c0, B:178:0x00ca, B:180:0x00d6, B:182:0x00e0, B:184:0x00f2, B:186:0x00fc, B:187:0x0102, B:196:0x0132, B:197:0x0139, B:199:0x0146, B:201:0x014e, B:203:0x016b, B:205:0x0186, B:206:0x018b, B:208:0x018f, B:190:0x010c, B:193:0x0120, B:163:0x0069, B:166:0x007f), top: B:252:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00ca A[Catch: all -> 0x0207, TryCatch #1 {all -> 0x0207, blocks: (B:144:0x000b, B:154:0x003c, B:155:0x0041, B:158:0x0057, B:159:0x005d, B:168:0x0093, B:170:0x009e, B:172:0x00aa, B:174:0x00b4, B:176:0x00c0, B:178:0x00ca, B:180:0x00d6, B:182:0x00e0, B:184:0x00f2, B:186:0x00fc, B:187:0x0102, B:196:0x0132, B:197:0x0139, B:199:0x0146, B:201:0x014e, B:203:0x016b, B:205:0x0186, B:206:0x018b, B:208:0x018f, B:190:0x010c, B:193:0x0120, B:163:0x0069, B:166:0x007f), top: B:252:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00e0 A[Catch: all -> 0x0207, TryCatch #1 {all -> 0x0207, blocks: (B:144:0x000b, B:154:0x003c, B:155:0x0041, B:158:0x0057, B:159:0x005d, B:168:0x0093, B:170:0x009e, B:172:0x00aa, B:174:0x00b4, B:176:0x00c0, B:178:0x00ca, B:180:0x00d6, B:182:0x00e0, B:184:0x00f2, B:186:0x00fc, B:187:0x0102, B:196:0x0132, B:197:0x0139, B:199:0x0146, B:201:0x014e, B:203:0x016b, B:205:0x0186, B:206:0x018b, B:208:0x018f, B:190:0x010c, B:193:0x0120, B:163:0x0069, B:166:0x007f), top: B:252:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00fc A[Catch: all -> 0x0207, TRY_LEAVE, TryCatch #1 {all -> 0x0207, blocks: (B:144:0x000b, B:154:0x003c, B:155:0x0041, B:158:0x0057, B:159:0x005d, B:168:0x0093, B:170:0x009e, B:172:0x00aa, B:174:0x00b4, B:176:0x00c0, B:178:0x00ca, B:180:0x00d6, B:182:0x00e0, B:184:0x00f2, B:186:0x00fc, B:187:0x0102, B:196:0x0132, B:197:0x0139, B:199:0x0146, B:201:0x014e, B:203:0x016b, B:205:0x0186, B:206:0x018b, B:208:0x018f, B:190:0x010c, B:193:0x0120, B:163:0x0069, B:166:0x007f), top: B:252:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0132 A[Catch: all -> 0x0207, TryCatch #1 {all -> 0x0207, blocks: (B:144:0x000b, B:154:0x003c, B:155:0x0041, B:158:0x0057, B:159:0x005d, B:168:0x0093, B:170:0x009e, B:172:0x00aa, B:174:0x00b4, B:176:0x00c0, B:178:0x00ca, B:180:0x00d6, B:182:0x00e0, B:184:0x00f2, B:186:0x00fc, B:187:0x0102, B:196:0x0132, B:197:0x0139, B:199:0x0146, B:201:0x014e, B:203:0x016b, B:205:0x0186, B:206:0x018b, B:208:0x018f, B:190:0x010c, B:193:0x0120, B:163:0x0069, B:166:0x007f), top: B:252:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0146 A[Catch: all -> 0x0207, TryCatch #1 {all -> 0x0207, blocks: (B:144:0x000b, B:154:0x003c, B:155:0x0041, B:158:0x0057, B:159:0x005d, B:168:0x0093, B:170:0x009e, B:172:0x00aa, B:174:0x00b4, B:176:0x00c0, B:178:0x00ca, B:180:0x00d6, B:182:0x00e0, B:184:0x00f2, B:186:0x00fc, B:187:0x0102, B:196:0x0132, B:197:0x0139, B:199:0x0146, B:201:0x014e, B:203:0x016b, B:205:0x0186, B:206:0x018b, B:208:0x018f, B:190:0x010c, B:193:0x0120, B:163:0x0069, B:166:0x007f), top: B:252:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0186 A[Catch: all -> 0x0207, TryCatch #1 {all -> 0x0207, blocks: (B:144:0x000b, B:154:0x003c, B:155:0x0041, B:158:0x0057, B:159:0x005d, B:168:0x0093, B:170:0x009e, B:172:0x00aa, B:174:0x00b4, B:176:0x00c0, B:178:0x00ca, B:180:0x00d6, B:182:0x00e0, B:184:0x00f2, B:186:0x00fc, B:187:0x0102, B:196:0x0132, B:197:0x0139, B:199:0x0146, B:201:0x014e, B:203:0x016b, B:205:0x0186, B:206:0x018b, B:208:0x018f, B:190:0x010c, B:193:0x0120, B:163:0x0069, B:166:0x007f), top: B:252:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x018f A[Catch: all -> 0x0207, TRY_LEAVE, TryCatch #1 {all -> 0x0207, blocks: (B:144:0x000b, B:154:0x003c, B:155:0x0041, B:158:0x0057, B:159:0x005d, B:168:0x0093, B:170:0x009e, B:172:0x00aa, B:174:0x00b4, B:176:0x00c0, B:178:0x00ca, B:180:0x00d6, B:182:0x00e0, B:184:0x00f2, B:186:0x00fc, B:187:0x0102, B:196:0x0132, B:197:0x0139, B:199:0x0146, B:201:0x014e, B:203:0x016b, B:205:0x0186, B:206:0x018b, B:208:0x018f, B:190:0x010c, B:193:0x0120, B:163:0x0069, B:166:0x007f), top: B:252:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01e5 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzzx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwf.zzh():void");
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zza(zzfo zzfoVar) {
        long zzR;
        long max;
        if (this.zzn) {
            zzR = this.zza.zzR(true);
            max = Math.max(zzR, this.zzk);
        } else {
            max = this.zzk;
        }
        int zzb = zzfoVar.zzb();
        zzaem zzaemVar = this.zzm;
        zzaemVar.getClass();
        zzaek.zzb(zzaemVar, zzfoVar, zzb);
        zzaemVar.zzs(max, 1, zzb, 0, null);
        this.zzn = true;
    }
}
