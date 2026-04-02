package com.google.android.recaptcha.internal;

import F6.C0106t;
import F6.G0;
import F6.H;
import F6.InterfaceC0105s;
import android.app.Application;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import l6.c;
import l6.g;
import m5.d;
import m6.AbstractC1447h;
import o6.EnumC1565a;
/* loaded from: classes.dex */
public final class zzja extends zze {
    public InterfaceC0105s zza;
    public zzfo zzb;
    private final zzek zzc;
    private zzsc zzf;
    private final zzek zzj;
    private final c zzk;
    private final c zzl;
    private final c zzm;
    private final c zzn;
    private final c zzo;
    private zzen zzp;
    private final zzbi zzq;
    private final Map zzd = zzjb.zza();
    private final Map zze = new LinkedHashMap();
    private final zzcb zzg = new zzcb(zzje.zza);
    private final zzjh zzh = zzjh.zzc();
    private final zzij zzi = new zzij(this);

    public zzja(zzek zzekVar, zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zza = zzekVar.zza();
        zza.zzc(zzekVar.zzd());
        this.zzj = zza;
        int i7 = zzav.zza;
        this.zzk = d.m(zzis.zza);
        this.zzl = d.m(zzit.zza);
        this.zzm = d.m(zziu.zza);
        this.zzn = d.m(zziv.zza);
        this.zzo = d.m(zziw.zza);
    }

    private final Application zzD() {
        return (Application) ((g) this.zzo).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzE(com.google.android.recaptcha.internal.zzsc r5, n6.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzim
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzim r0 = (com.google.android.recaptcha.internal.zzim) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzim r0 = new com.google.android.recaptcha.internal.zzim
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.google.android.recaptcha.internal.zzja r5 = r0.zzd
            org.slf4j.helpers.i.M(r6)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            goto L4e
        L29:
            r6 = move-exception
            goto L64
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            org.slf4j.helpers.i.M(r6)
            l6.c r6 = r4.zzn     // Catch: com.google.android.recaptcha.internal.zzbd -> L61
            l6.g r6 = (l6.g) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> L61
            java.lang.Object r6 = r6.a()     // Catch: com.google.android.recaptcha.internal.zzbd -> L61
            com.google.android.recaptcha.internal.zzff r6 = (com.google.android.recaptcha.internal.zzff) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> L61
            com.google.android.recaptcha.internal.zzek r2 = r4.zzj     // Catch: com.google.android.recaptcha.internal.zzbd -> L61
            r0.zzd = r4     // Catch: com.google.android.recaptcha.internal.zzbd -> L61
            r0.zzc = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L61
            java.lang.Object r6 = r6.zzd(r5, r2, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L61
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r5 = r4
        L4e:
            java.lang.String r6 = (java.lang.String) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            com.google.android.recaptcha.internal.zzbi r0 = r5.zzq     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            F6.D r0 = r0.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            com.google.android.recaptcha.internal.zzin r1 = new com.google.android.recaptcha.internal.zzin     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            r2 = 0
            r1.<init>(r5, r6, r2)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            r6 = 3
            F6.H.q(r0, r2, r1, r6)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            goto L6d
        L61:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L64:
            F6.s r5 = r5.zzA()
            F6.t r5 = (F6.C0106t) r5
            r5.O(r6)
        L6d:
            l6.j r5 = l6.j.f13876a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzE(com.google.android.recaptcha.internal.zzsc, n6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzF(java.lang.String r9, n6.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzio
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzio r0 = (com.google.android.recaptcha.internal.zzio) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzio r0 = new com.google.android.recaptcha.internal.zzio
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.zza
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.String r9 = r0.zzf
            java.lang.String r1 = r0.zze
            com.google.android.recaptcha.internal.zzja r0 = r0.zzd
            org.slf4j.helpers.i.M(r10)     // Catch: java.lang.Exception -> L2f
            r3 = r9
            r4 = r1
            goto L66
        L2f:
            r9 = move-exception
            goto L75
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            org.slf4j.helpers.i.M(r10)
            com.google.android.recaptcha.internal.zzek r10 = r8.zzj
            r2 = 26
            com.google.android.recaptcha.internal.zzen r10 = r10.zzf(r2)
            r8.zzp = r10
            l6.c r10 = r8.zzl     // Catch: java.lang.Exception -> L73
            l6.g r10 = (l6.g) r10     // Catch: java.lang.Exception -> L73
            java.lang.Object r10 = r10.a()     // Catch: java.lang.Exception -> L73
            com.google.android.recaptcha.internal.zzbr r10 = (com.google.android.recaptcha.internal.zzbr) r10     // Catch: java.lang.Exception -> L73
            java.lang.String r10 = r10.zza()     // Catch: java.lang.Exception -> L73
            r0.zzd = r8     // Catch: java.lang.Exception -> L73
            r0.zze = r9     // Catch: java.lang.Exception -> L73
            r0.zzf = r10     // Catch: java.lang.Exception -> L73
            r0.zzc = r3     // Catch: java.lang.Exception -> L73
            java.lang.Object r0 = r8.zzw(r0)     // Catch: java.lang.Exception -> L73
            if (r0 == r1) goto L72
            r4 = r9
            r3 = r10
            r10 = r0
            r0 = r8
        L66:
            r2 = r10
            android.webkit.WebView r2 = (android.webkit.WebView) r2     // Catch: java.lang.Exception -> L2f
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "utf-8"
            r7 = 0
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2f
            goto L95
        L72:
            return r1
        L73:
            r9 = move-exception
            r0 = r8
        L75:
            com.google.android.recaptcha.internal.zzbd r10 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzU
            java.lang.String r9 = r9.getMessage()
            r10.<init>(r1, r2, r9)
            com.google.android.recaptcha.internal.zzen r9 = r0.zzp
            if (r9 == 0) goto L89
            r9.zzb(r10)
        L89:
            r9 = 0
            r0.zzp = r9
            F6.s r9 = r0.zzA()
            F6.t r9 = (F6.C0106t) r9
            r9.O(r10)
        L95:
            l6.j r9 = l6.j.f13876a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzF(java.lang.String, n6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r11.zzc(r5, r3) == r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzG(java.lang.String r10, n6.d r11) {
        /*
            r9 = this;
            r0 = 3
            r1 = 1
            r2 = 2
            boolean r3 = r11 instanceof com.google.android.recaptcha.internal.zzix
            if (r3 == 0) goto L16
            r3 = r11
            com.google.android.recaptcha.internal.zzix r3 = (com.google.android.recaptcha.internal.zzix) r3
            int r4 = r3.zzc
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L16
            int r4 = r4 - r5
            r3.zzc = r4
            goto L1b
        L16:
            com.google.android.recaptcha.internal.zzix r3 = new com.google.android.recaptcha.internal.zzix
            r3.<init>(r9, r11)
        L1b:
            java.lang.Object r11 = r3.zza
            o6.a r4 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r5 = r3.zzc
            l6.j r6 = l6.j.f13876a
            if (r5 == 0) goto L41
            if (r5 == r1) goto L39
            if (r5 != r2) goto L31
            java.lang.String r10 = r3.zze
            com.google.android.recaptcha.internal.zzja r1 = r3.zzd
            org.slf4j.helpers.i.M(r11)
            goto L7c
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            java.lang.String r10 = r3.zze
            com.google.android.recaptcha.internal.zzja r1 = r3.zzd
            org.slf4j.helpers.i.M(r11)
            goto L62
        L41:
            org.slf4j.helpers.i.M(r11)
            com.google.android.recaptcha.internal.zzcb r11 = r9.zzg
            com.google.android.recaptcha.internal.zzje[] r5 = new com.google.android.recaptcha.internal.zzje[r0]
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzd
            r8 = 0
            r5[r8] = r7
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzc
            r5[r1] = r7
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzb
            r5[r2] = r7
            r3.zzd = r9
            r3.zze = r10
            r3.zzc = r1
            java.lang.Object r11 = r11.zzb(r5, r3)
            if (r11 == r4) goto L9d
            r1 = r9
        L62:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L6b
            return r6
        L6b:
            com.google.android.recaptcha.internal.zzcb r11 = r1.zzg
            com.google.android.recaptcha.internal.zzje r5 = com.google.android.recaptcha.internal.zzje.zzb
            r3.zzd = r1
            r3.zze = r10
            r3.zzc = r2
            java.lang.Object r11 = r11.zzc(r5, r3)
            if (r11 != r4) goto L7c
            goto L9d
        L7c:
            F6.t r11 = F6.H.a()
            r1.zza = r11
            com.google.android.recaptcha.internal.zzek r11 = r1.zzj
            r11.zzc(r10)
            r10 = 42
            com.google.android.recaptcha.internal.zzen r10 = r11.zzf(r10)
            com.google.android.recaptcha.internal.zzbi r11 = r1.zzq
            F6.D r11 = r11.zza()
            com.google.android.recaptcha.internal.zziz r2 = new com.google.android.recaptcha.internal.zziz
            r3 = 0
            r2.<init>(r1, r10, r3)
            F6.H.q(r11, r3, r2, r0)
            return r6
        L9d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzG(java.lang.String, n6.d):java.lang.Object");
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) ((g) zzjaVar.zzm).a();
    }

    public final InterfaceC0105s zzA() {
        InterfaceC0105s interfaceC0105s = this.zza;
        if (interfaceC0105s != null) {
            return interfaceC0105s;
        }
        return null;
    }

    public final zzft zzC(zzsc zzscVar, zzcg zzcgVar, WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(AbstractC1447h.Z(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zza(String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(String str, n6.d dVar) {
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        if (r12 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
        if (((F6.C0106t) r12).j(r0) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.recaptcha.internal.zzja] */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzf(java.lang.String r11, n6.d r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzf(java.lang.String, n6.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzg(zzbd zzbdVar, n6.d dVar) {
        if (j.a(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return l6.j.f13876a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (zzG(r6, r0) != r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
        if (r6.zzc(r7, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzh(com.google.android.recaptcha.internal.zzsc r6, n6.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzir
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzir r0 = (com.google.android.recaptcha.internal.zzir) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzir r0 = new com.google.android.recaptcha.internal.zzir
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            org.slf4j.helpers.i.M(r7)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            org.slf4j.helpers.i.M(r7)
            goto L6c
        L36:
            org.slf4j.helpers.i.M(r7)
            boolean r7 = r6.zzT()
            if (r7 == 0) goto L5f
            boolean r7 = r6.zzR()
            if (r7 == 0) goto L5f
            boolean r7 = r6.zzQ()
            if (r7 != 0) goto L4c
            goto L5f
        L4c:
            r5.zzf = r6
            com.google.android.recaptcha.internal.zzek r6 = r5.zzc
            java.lang.String r6 = r6.zzd()
            r0.zzc = r3
            java.lang.Object r6 = r5.zzG(r6, r0)
            if (r6 == r1) goto L6b
        L5c:
            l6.j r6 = l6.j.f13876a
            return r6
        L5f:
            com.google.android.recaptcha.internal.zzcb r6 = r5.zzg
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzd
            r0.zzc = r4
            java.lang.Object r6 = r6.zzc(r7, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            com.google.android.recaptcha.internal.zzbd r6 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r7 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzav
            r1 = 0
            r6.<init>(r7, r0, r1)
            l6.e r6 = org.slf4j.helpers.i.j(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzh(com.google.android.recaptcha.internal.zzsc, n6.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzi(String str, long j, Exception exc, n6.d dVar) {
        exc.getMessage();
        InterfaceC0105s interfaceC0105s = (InterfaceC0105s) this.zze.remove(str);
        if (interfaceC0105s != null) {
            ((C0106t) interfaceC0105s).O(exc);
        }
        return l6.j.f13876a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzj(Exception exc, n6.d dVar) {
        Long zza = this.zzi.zza();
        if ((exc instanceof G0) && zza == null) {
            return new zzbd(zzbb.zzc, zzba.zzH, null);
        }
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    public final zzcb zzm() {
        return this.zzg;
    }

    public final zzij zzq() {
        return this.zzi;
    }

    public final Object zzw(n6.d dVar) {
        return H.y(this.zzq.zzb().a(), new zzjc((zzjd) ((g) this.zzk).a(), zzD(), null), dVar);
    }

    public final Object zzx(n6.d dVar) {
        Object y2 = H.y(this.zzq.zzb().a(), new zzil(this, null), dVar);
        if (y2 == EnumC1565a.COROUTINE_SUSPENDED) {
            return y2;
        }
        return l6.j.f13876a;
    }
}
