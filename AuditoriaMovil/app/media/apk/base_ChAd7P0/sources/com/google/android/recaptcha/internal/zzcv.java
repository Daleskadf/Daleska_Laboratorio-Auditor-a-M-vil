package com.google.android.recaptcha.internal;

import O6.a;
import O6.e;
import X.d;
import android.app.Application;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.j;
/* loaded from: classes.dex */
public final class zzcv {
    private final Application zza;
    private zzdc zzc;
    private final a zzb = e.a();
    private final String zzd = UUID.randomUUID().toString();
    private zzbi zzf = new zzbi();
    private final zzl zze = new zzl(null, 1, null);

    public zzcv(Application application) {
        Map map;
        Map map2;
        this.zza = application;
        int i7 = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(915034652, new zzaz(null, 1, null)), new zzaw(915034802, new zzfu()), new zzaw(915034662, new zzbe()), new zzaw(915034909, new zzjd()), new zzaw(915034675, new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(915034774, new zzex(null, 1, null)), new zzaw(915034792, new zzfk(true)), new zzaw(735120228, application), new zzaw(915034663, new zzbf(application)), new zzaw(915034791, new zzfj()), new zzaw(915034643, new zzbm(application)), new zzaw(915034775, new zzfa()), new zzaw(915034787, new zzff())};
        for (int i8 = 0; i8 < 13; i8++) {
            zzaw zzawVar = zzawVarArr[i8];
            map = zzav.zzc;
            if (!map.containsKey(Integer.valueOf(zzawVar.zza()))) {
                map2 = zzav.zzc;
                map2.put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (!j.a(zzdcVar.zzd(), str)) {
            throw new zzbd(zzbb.zzd, zzba.zzam, null);
        }
        return zzdcVar;
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j) {
        if (j >= 5000) {
            if (d.checkSelfPermission(zzcvVar.zza, "android.permission.INTERNET") == 0) {
                return;
            }
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
        throw new zzbd(zzbb.zzj, zzba.zzI, null);
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        if (j.a(zzchVar, zzch.zza)) {
            return new zzef(zzdtVar);
        }
        return new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, n6.d dVar, int i7, Object obj) {
        zzbi zzbiVar2;
        zzch zzchVar2;
        long j8;
        if ((i7 & 8) != 0) {
            zzbiVar2 = zzcvVar.zzf;
        } else {
            zzbiVar2 = zzbiVar;
        }
        if ((i7 & 16) != 0) {
            zzchVar2 = zzch.zza;
        } else {
            zzchVar2 = zzchVar;
        }
        if ((i7 & 2) != 0) {
            j8 = 10000;
        } else {
            j8 = j;
        }
        return zzcvVar.zzg(str, j8, null, zzbiVar2, zzchVar2, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzj(java.lang.String r6, int r7, w6.p r8, n6.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzcu
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzcu r0 = (com.google.android.recaptcha.internal.zzcu) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcu r0 = new com.google.android.recaptcha.internal.zzcu
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.zza
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.google.android.recaptcha.internal.zzen r6 = r0.zzd
            org.slf4j.helpers.i.M(r9)     // Catch: java.lang.Exception -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            goto L4e
        L29:
            r7 = move-exception
            goto L5a
        L2b:
            r7 = move-exception
            goto L72
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            org.slf4j.helpers.i.M(r9)
            com.google.android.recaptcha.internal.zzbi r9 = r5.zzf
            com.google.android.recaptcha.internal.zzek r6 = r5.zzk(r6, r9, r7)
            r7 = 6
            com.google.android.recaptcha.internal.zzen r7 = r6.zzf(r7)
            r0.zzd = r7     // Catch: java.lang.Exception -> L53 com.google.android.recaptcha.internal.zzbd -> L55
            r0.zzc = r3     // Catch: java.lang.Exception -> L53 com.google.android.recaptcha.internal.zzbd -> L55
            java.lang.Object r9 = r8.invoke(r6, r0)     // Catch: java.lang.Exception -> L53 com.google.android.recaptcha.internal.zzbd -> L55
            if (r9 == r1) goto L52
            r6 = r7
        L4e:
            r6.zza()     // Catch: java.lang.Exception -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            return r9
        L52:
            return r1
        L53:
            r6 = move-exception
            goto L57
        L55:
            r6 = move-exception
            goto L6f
        L57:
            r4 = r7
            r7 = r6
            r6 = r4
        L5a:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zza
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            com.google.android.recaptcha.RecaptchaException r6 = r8.zzc()
            throw r6
        L6f:
            r4 = r7
            r7 = r6
            r6 = r4
        L72:
            r6.zzb(r7)
            com.google.android.recaptcha.RecaptchaException r6 = r7.zzc()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.zzj(java.lang.String, int, w6.p, n6.d):java.lang.Object");
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i7) {
        String uuid = UUID.randomUUID().toString();
        int i8 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) m5.d.m(zzcr.zza).a()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, uuid, i7, this.zza, zzesVar, null);
        zzekVar.zzc(uuid);
        return zzekVar;
    }

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0091 A[Catch: all -> 0x00cf, TryCatch #1 {all -> 0x00cf, blocks: (B:69:0x0086, B:77:0x009c, B:73:0x0091), top: B:90:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzg(java.lang.String r23, long r24, com.google.android.recaptcha.internal.zzcn r26, com.google.android.recaptcha.internal.zzbi r27, com.google.android.recaptcha.internal.zzch r28, n6.d r29) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.zzg(java.lang.String, long, com.google.android.recaptcha.internal.zzcn, com.google.android.recaptcha.internal.zzbi, com.google.android.recaptcha.internal.zzch, n6.d):java.lang.Object");
    }
}
