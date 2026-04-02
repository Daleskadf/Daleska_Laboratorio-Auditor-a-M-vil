package com.google.android.recaptcha.internal;

import F6.H;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.j;
import l6.c;
import l6.g;
import m5.d;
import m6.AbstractC1447h;
import m6.AbstractC1449j;
import m6.s;
/* loaded from: classes.dex */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final c zzd;
    private final c zze;
    private final c zzf;
    private final c zzg;
    private final c zzh;
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i7 = zzav.zza;
        this.zzd = d.m(zzdm.zza);
        this.zze = d.m(zzdn.zza);
        this.zzf = d.m(zzdo.zza);
        this.zzg = d.m(zzdp.zza);
        this.zzh = d.m(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) ((g) zzdtVar.zze).a();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) ((g) zzdtVar.zzd).a();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) ((g) zzdtVar.zzg).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) ((g) this.zzh).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        if (!zzx()) {
            return new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage());
        }
        return zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) ((g) this.zzf).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zza = this.zzb.zza();
        zza.zzc(str);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzv(com.google.android.recaptcha.internal.zzsc r11, long r12, n6.d r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzv(com.google.android.recaptcha.internal.zzsc, long, n6.d):java.lang.Object");
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return AbstractC1447h.Y(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i7 = zzav.zza;
        zzbe zzbeVar = (zzbe) d.m(zzdi.zza).a();
        try {
            Object systemService = zzr().getSystemService("connectivity");
            j.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) {
        try {
            zzrv zzj = zzrv.zzj(zzbt.zza(str));
            int i7 = zzav.zza;
            ((zzfu) d.m(zzde.zza).a()).zza(zzj);
        } catch (Exception e7) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e7.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzf = zzsp.zzf();
        zzf.zzs(this.zza);
        zzf.zze(recaptchaAction.getAction());
        zzf.zzf(zzscVar.zzN());
        zzf.zzq(zzscVar.zzM());
        zzf.zzr(zzsiVar);
        return (zzsp) zzf.zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzl(java.lang.String r6, long r7, n6.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdd
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzdd r0 = (com.google.android.recaptcha.internal.zzdd) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdd r0 = new com.google.android.recaptcha.internal.zzdd
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.zza
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.google.android.recaptcha.internal.zzen r6 = r0.zzd
            org.slf4j.helpers.i.M(r9)     // Catch: java.lang.Exception -> L29 F6.G0 -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            goto L53
        L29:
            r7 = move-exception
            goto L64
        L2b:
            r7 = move-exception
            goto L76
        L2d:
            r7 = move-exception
            goto L88
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            org.slf4j.helpers.i.M(r9)
            com.google.android.recaptcha.internal.zzek r9 = r5.zzu(r6)
            r2 = 27
            com.google.android.recaptcha.internal.zzen r9 = r9.zzf(r2)
            com.google.android.recaptcha.internal.zzl r2 = r5.zzc     // Catch: java.lang.Exception -> L5a F6.G0 -> L5d com.google.android.recaptcha.internal.zzbd -> L60
            r0.zzd = r9     // Catch: java.lang.Exception -> L5a F6.G0 -> L5d com.google.android.recaptcha.internal.zzbd -> L60
            r0.zzc = r3     // Catch: java.lang.Exception -> L5a F6.G0 -> L5d com.google.android.recaptcha.internal.zzbd -> L60
            java.lang.Object r6 = r2.zzb(r6, r7, r0)     // Catch: java.lang.Exception -> L5a F6.G0 -> L5d com.google.android.recaptcha.internal.zzbd -> L60
            if (r6 == r1) goto L59
            r4 = r9
            r9 = r6
            r6 = r4
        L53:
            com.google.android.recaptcha.internal.zzsi r9 = (com.google.android.recaptcha.internal.zzsi) r9     // Catch: java.lang.Exception -> L29 F6.G0 -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            r6.zza()     // Catch: java.lang.Exception -> L29 F6.G0 -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            return r9
        L59:
            return r1
        L5a:
            r6 = move-exception
            r7 = r6
            goto L63
        L5d:
            r6 = move-exception
            r7 = r6
            goto L75
        L60:
            r6 = move-exception
            r7 = r6
            goto L87
        L63:
            r6 = r9
        L64:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzaa
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            throw r8
        L75:
            r6 = r9
        L76:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            throw r8
        L87:
            r6 = r9
        L88:
            r6.zzb(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzl(java.lang.String, long, n6.d):java.lang.Object");
    }

    public final Object zzm(zzsp zzspVar, String str, long j, n6.d dVar) {
        return H.y(this.zzi.zza().a(), new zzdg(this, str, j, zzspVar, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzn(com.google.android.recaptcha.internal.zzsc r11, long r12, n6.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzdk
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzdk r0 = (com.google.android.recaptcha.internal.zzdk) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdk r0 = new com.google.android.recaptcha.internal.zzdk
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zza
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            org.slf4j.helpers.i.M(r14)     // Catch: java.lang.Exception -> L27 F6.G0 -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            goto L4b
        L27:
            r11 = move-exception
            goto L4e
        L29:
            r11 = move-exception
            goto L5c
        L2b:
            r11 = move-exception
            goto L6a
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            org.slf4j.helpers.i.M(r14)
            com.google.android.recaptcha.internal.zzdl r14 = new com.google.android.recaptcha.internal.zzdl     // Catch: java.lang.Exception -> L27 F6.G0 -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Exception -> L27 F6.G0 -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            r0.zzc = r3     // Catch: java.lang.Exception -> L27 F6.G0 -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            java.lang.Object r11 = F6.H.z(r12, r14, r0)     // Catch: java.lang.Exception -> L27 F6.G0 -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            if (r11 != r1) goto L4b
            return r1
        L4b:
            l6.j r11 = l6.j.f13876a
            return r11
        L4e:
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r13 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r14 = com.google.android.recaptcha.internal.zzba.zzap
            java.lang.String r11 = r11.getMessage()
            r12.<init>(r13, r14, r11)
            throw r12
        L5c:
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r13 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r14 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r11 = r11.getMessage()
            r12.<init>(r13, r14, r11)
            throw r12
        L6a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzn(com.google.android.recaptcha.internal.zzsc, long, n6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzo(long r7, n6.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdr
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzdr r0 = (com.google.android.recaptcha.internal.zzdr) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdr r0 = new com.google.android.recaptcha.internal.zzdr
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.zza
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            com.google.android.recaptcha.internal.zzen r7 = r0.zze
            com.google.android.recaptcha.internal.zzdt r8 = r0.zzd
            org.slf4j.helpers.i.M(r9)     // Catch: java.lang.Exception -> L2b F6.G0 -> L2d com.google.android.recaptcha.internal.zzbd -> L2f
            goto L5b
        L2b:
            r9 = move-exception
            goto L69
        L2d:
            r9 = move-exception
            goto L82
        L2f:
            r9 = move-exception
            goto L9b
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            org.slf4j.helpers.i.M(r9)
            com.google.android.recaptcha.internal.zzek r9 = r6.zzb
            r2 = 22
            com.google.android.recaptcha.internal.zzen r9 = r9.zzf(r2)
            com.google.android.recaptcha.internal.zzds r2 = new com.google.android.recaptcha.internal.zzds     // Catch: java.lang.Exception -> L5f F6.G0 -> L61 com.google.android.recaptcha.internal.zzbd -> L63
            r4 = 0
            r2.<init>(r6, r9, r4)     // Catch: java.lang.Exception -> L5f F6.G0 -> L61 com.google.android.recaptcha.internal.zzbd -> L63
            r0.zzd = r6     // Catch: java.lang.Exception -> L5f F6.G0 -> L61 com.google.android.recaptcha.internal.zzbd -> L63
            r0.zze = r9     // Catch: java.lang.Exception -> L5f F6.G0 -> L61 com.google.android.recaptcha.internal.zzbd -> L63
            r0.zzc = r3     // Catch: java.lang.Exception -> L5f F6.G0 -> L61 com.google.android.recaptcha.internal.zzbd -> L63
            java.lang.Object r7 = F6.H.z(r7, r2, r0)     // Catch: java.lang.Exception -> L5f F6.G0 -> L61 com.google.android.recaptcha.internal.zzbd -> L63
            if (r7 == r1) goto L5e
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L5b:
            com.google.android.recaptcha.internal.zzsc r9 = (com.google.android.recaptcha.internal.zzsc) r9     // Catch: java.lang.Exception -> L2b F6.G0 -> L2d com.google.android.recaptcha.internal.zzbd -> L2f
            return r9
        L5e:
            return r1
        L5f:
            r7 = move-exception
            goto L65
        L61:
            r7 = move-exception
            goto L7e
        L63:
            r7 = move-exception
            goto L97
        L65:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L69:
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzaw
            java.lang.String r3 = r9.getMessage()
            r0.<init>(r1, r2, r3)
            com.google.android.recaptcha.internal.zzbd r8 = r8.zzs(r9, r0)
            r7.zzb(r8)
            throw r8
        L7e:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L82:
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r3 = r9.getMessage()
            r0.<init>(r1, r2, r3)
            com.google.android.recaptcha.internal.zzbd r8 = r8.zzs(r9, r0)
            r7.zzb(r8)
            throw r8
        L97:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L9b:
            com.google.android.recaptcha.internal.zzbb r0 = r9.zzb()
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            boolean r0 = kotlin.jvm.internal.j.a(r0, r1)
            if (r0 == 0) goto Lab
            com.google.android.recaptcha.internal.zzbd r9 = r8.zzs(r9, r9)
        Lab:
            r7.zzb(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzo(long, n6.d):java.lang.Object");
    }

    public final void zzq(String str, zzsr zzsrVar) {
        zzen zzf = zzu(str).zzf(29);
        try {
            List<zzst> zzk = zzsrVar.zzk();
            int O7 = s.O(AbstractC1449j.M(zzk));
            if (O7 < 16) {
                O7 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(O7);
            for (zzst zzstVar : zzk) {
                linkedHashMap.put(zzstVar.zzg(), zzstVar.zzi());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzf.zza();
        } catch (zzbd e7) {
            zzf.zzb(e7);
        } catch (Exception e8) {
            zzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e8.getMessage()));
        }
    }
}
