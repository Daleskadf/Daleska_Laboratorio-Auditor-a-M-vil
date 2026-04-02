package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.work.WorkRequest;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaaw extends zzto implements zzabc {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private zzdp zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private zzaba zzE;
    private zzabx zzF;
    private final Context zze;
    private final zzaby zzf;
    private final zzabu zzg;
    private final boolean zzh;
    private final zzabd zzi;
    private final zzabb zzj;
    private zzaav zzk;
    private boolean zzl;
    private boolean zzm;
    private Surface zzn;
    private zzfp zzo;
    private zzaaz zzp;
    private boolean zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private int zzx;
    private long zzy;
    private zzdp zzz;

    public zzaaw(Context context, zzte zzteVar, zztq zztqVar, long j, boolean z, Handler handler, zzabv zzabvVar, int i, float f) {
        super(2, zzteVar, zztqVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzg = new zzabu(handler, zzabvVar);
        zzaaq zzc2 = new zzaaj(applicationContext).zzc();
        if (zzc2.zza() == null) {
            zzc2.zzk(new zzabd(applicationContext, this, 0L));
        }
        this.zzf = zzc2;
        zzabd zza = zzc2.zza();
        zzek.zzb(zza);
        this.zzi = zza;
        this.zzj = new zzabb();
        this.zzh = "NVIDIA".equals(zzfx.zzc);
        this.zzr = 1;
        this.zzz = zzdp.zza;
        this.zzD = 0;
        this.zzA = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04c4, code lost:
        if (r13.equals("deb") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x07a4, code lost:
        if (r10 != 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static final boolean zzaO(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaw.zzaO(java.lang.String):boolean");
    }

    private static List zzaP(Context context, zztq zztqVar, zzam zzamVar, boolean z, boolean z2) throws zztw {
        if (zzamVar.zzm == null) {
            return zzfzn.zzm();
        }
        if (zzfx.zza >= 26 && "video/dolby-vision".equals(zzamVar.zzm) && !zzaau.zza(context)) {
            List zzd2 = zzuc.zzd(zztqVar, zzamVar, z, z2);
            if (!zzd2.isEmpty()) {
                return zzd2;
            }
        }
        return zzuc.zzf(zztqVar, zzamVar, z, z2);
    }

    private final void zzaQ() {
        zzdp zzdpVar = this.zzA;
        if (zzdpVar != null) {
            this.zzg.zzt(zzdpVar);
        }
    }

    private final void zzaR() {
        Surface surface = this.zzn;
        zzaaz zzaazVar = this.zzp;
        if (surface == zzaazVar) {
            this.zzn = null;
        }
        if (zzaazVar != null) {
            zzaazVar.release();
            this.zzp = null;
        }
    }

    private final boolean zzaS(zzti zztiVar) {
        if (zzfx.zza < 23 || zzaO(zztiVar.zza)) {
            return false;
        }
        return !zztiVar.zzf || zzaaz.zzb(this.zze);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
        if (r3.equals("video/av01") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzad(com.google.android.gms.internal.ads.zzti r10, com.google.android.gms.internal.ads.zzam r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaw.zzad(com.google.android.gms.internal.ads.zzti, com.google.android.gms.internal.ads.zzam):int");
    }

    protected static int zzae(zzti zztiVar, zzam zzamVar) {
        if (zzamVar.zzn != -1) {
            int size = zzamVar.zzo.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((byte[]) zzamVar.zzo.get(i2)).length;
            }
            return zzamVar.zzn + i;
        }
        return zzad(zztiVar, zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzA() {
        if (this.zzf.zzl()) {
            this.zzf.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq
    protected final void zzC() {
        try {
            super.zzC();
            this.zzC = false;
            if (this.zzp != null) {
                zzaR();
            }
        } catch (Throwable th) {
            this.zzC = false;
            if (this.zzp != null) {
                zzaR();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzD() {
        this.zzt = 0;
        zzh();
        this.zzs = SystemClock.elapsedRealtime();
        this.zzw = 0L;
        this.zzx = 0;
        this.zzi.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzE() {
        if (this.zzt > 0) {
            zzh();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzt, elapsedRealtime - this.zzs);
            this.zzt = 0;
            this.zzs = elapsedRealtime;
        }
        int i = this.zzx;
        if (i != 0) {
            this.zzg.zzr(this.zzw, i);
            this.zzw = 0L;
            this.zzx = 0;
        }
        this.zzi.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmf
    public final void zzM(float f, float f2) throws zziz {
        super.zzM(f, f2);
        this.zzi.zzn(f);
        if (this.zzF != null) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmf, com.google.android.gms.internal.ads.zzmh
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzmf
    public final void zzV(long j, long j2) throws zziz {
        super.zzV(j, j2);
        if (this.zzF == null) {
            return;
        }
        try {
            throw null;
        } catch (zzabw e) {
            throw zzi(e, e.zza, false, 7001);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzmf
    public final boolean zzW() {
        if (super.zzW()) {
            if (this.zzF == null) {
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzmf
    public final boolean zzX() {
        boolean z;
        zzaaz zzaazVar;
        if (!super.zzX()) {
            z = false;
        } else if (this.zzF != null) {
            throw null;
        } else {
            z = true;
        }
        if (!z || (((zzaazVar = this.zzp) == null || this.zzn != zzaazVar) && zzaw() != null)) {
            return this.zzi.zzo(z);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final float zzZ(float f, zzam zzamVar, zzam[] zzamVarArr) {
        float f2 = -1.0f;
        for (zzam zzamVar2 : zzamVarArr) {
            float f3 = zzamVar2.zzt;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzaA(long j) {
        super.zzaA(j);
        this.zzv--;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzaB(zzih zzihVar) throws zziz {
        this.zzv++;
        int i = zzfx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzaC(zzam zzamVar) throws zziz {
        zzfp zzfpVar;
        if (this.zzB && !this.zzC && !this.zzf.zzl()) {
            try {
                this.zzf.zzd(zzamVar);
                this.zzf.zzh(zzau());
                zzaba zzabaVar = this.zzE;
                if (zzabaVar != null) {
                    this.zzf.zzj(zzabaVar);
                }
                Surface surface = this.zzn;
                if (surface != null && (zzfpVar = this.zzo) != null) {
                    this.zzf.zzg(surface, zzfpVar);
                }
            } catch (zzabw e) {
                throw zzi(e, zzamVar, false, 7000);
            }
        }
        if (this.zzF != null || !this.zzf.zzl()) {
            this.zzC = true;
            return;
        }
        this.zzF = this.zzf.zzb();
        zzgev.zzb();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzaE() {
        super.zzaE();
        this.zzv = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final boolean zzaK(zzti zztiVar) {
        return this.zzn != null || zzaS(zztiVar);
    }

    protected final void zzaM(long j) {
        zzir zzirVar = this.zza;
        zzirVar.zzk += j;
        zzirVar.zzl++;
        this.zzw += j;
        this.zzx++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaN(long j, boolean z) throws zziz {
        int zzd2 = zzd(j);
        if (zzd2 == 0) {
            return false;
        }
        if (z) {
            zzir zzirVar = this.zza;
            zzirVar.zzd += zzd2;
            zzirVar.zzf += this.zzv;
        } else {
            this.zza.zzj++;
            zzao(zzd2, this.zzv);
        }
        zzaG();
        if (this.zzF == null) {
            return true;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final int zzaa(zztq zztqVar, zzam zzamVar) throws zztw {
        boolean z;
        if (zzcb.zzh(zzamVar.zzm)) {
            int i = 1;
            int i2 = 0;
            boolean z2 = zzamVar.zzp != null;
            List zzaP = zzaP(this.zze, zztqVar, zzamVar, z2, false);
            if (z2 && zzaP.isEmpty()) {
                zzaP = zzaP(this.zze, zztqVar, zzamVar, false, false);
            }
            if (!zzaP.isEmpty()) {
                if (zzaL(zzamVar)) {
                    zzti zztiVar = (zzti) zzaP.get(0);
                    boolean zze = zztiVar.zze(zzamVar);
                    if (!zze) {
                        for (int i3 = 1; i3 < zzaP.size(); i3++) {
                            zzti zztiVar2 = (zzti) zzaP.get(i3);
                            if (zztiVar2.zze(zzamVar)) {
                                zztiVar = zztiVar2;
                                z = false;
                                zze = true;
                                break;
                            }
                        }
                    }
                    z = true;
                    int i4 = true != zze ? 3 : 4;
                    int i5 = true != zztiVar.zzf(zzamVar) ? 8 : 16;
                    int i6 = true != zztiVar.zzg ? 0 : 64;
                    int i7 = true != z ? 0 : 128;
                    if (zzfx.zza >= 26 && "video/dolby-vision".equals(zzamVar.zzm) && !zzaau.zza(this.zze)) {
                        i7 = 256;
                    }
                    if (zze) {
                        List zzaP2 = zzaP(this.zze, zztqVar, zzamVar, z2, true);
                        if (!zzaP2.isEmpty()) {
                            zzti zztiVar3 = (zzti) zzuc.zzg(zzaP2, zzamVar).get(0);
                            if (zztiVar3.zze(zzamVar) && zztiVar3.zzf(zzamVar)) {
                                i2 = 32;
                            }
                        }
                    }
                    return i4 | i5 | i2 | i6 | i7;
                }
                i = 2;
            }
            return i | 128;
        }
        return 128;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final zzis zzab(zzti zztiVar, zzam zzamVar, zzam zzamVar2) {
        int i;
        int i2;
        zzis zzb2 = zztiVar.zzb(zzamVar, zzamVar2);
        int i3 = zzb2.zze;
        zzaav zzaavVar = this.zzk;
        zzaavVar.getClass();
        if (zzamVar2.zzr > zzaavVar.zza || zzamVar2.zzs > zzaavVar.zzb) {
            i3 |= 256;
        }
        if (zzae(zztiVar, zzamVar2) > zzaavVar.zzc) {
            i3 |= 64;
        }
        String str = zztiVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzb2.zzd;
            i2 = 0;
        }
        return new zzis(str, zzamVar, zzamVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final zzis zzac(zzlb zzlbVar) throws zziz {
        zzis zzac = super.zzac(zzlbVar);
        zzam zzamVar = zzlbVar.zza;
        zzamVar.getClass();
        this.zzg.zzf(zzamVar, zzac);
        return zzac;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f7  */
    @Override // com.google.android.gms.internal.ads.zzto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.google.android.gms.internal.ads.zztd zzaf(com.google.android.gms.internal.ads.zzti r20, com.google.android.gms.internal.ads.zzam r21, android.media.MediaCrypto r22, float r23) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaw.zzaf(com.google.android.gms.internal.ads.zzti, com.google.android.gms.internal.ads.zzam, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zztd");
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final List zzag(zztq zztqVar, zzam zzamVar, boolean z) throws zztw {
        return zzuc.zzg(zzaP(this.zze, zztqVar, zzamVar, false, false), zzamVar);
    }

    protected final void zzah(zztf zztfVar, int i, long j, long j2) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        zztfVar.zzm(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzu = 0;
        if (this.zzF == null) {
            zzdp zzdpVar = this.zzz;
            if (!zzdpVar.equals(zzdp.zza) && !zzdpVar.equals(this.zzA)) {
                this.zzA = zzdpVar;
                this.zzg.zzt(zzdpVar);
            }
            if (!this.zzi.zzp() || (surface = this.zzn) == null) {
                return;
            }
            this.zzg.zzq(surface);
            this.zzq = true;
        }
    }

    protected final void zzai(zztf zztfVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zztfVar.zzn(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzaj(zzih zzihVar) throws zziz {
        if (this.zzm) {
            ByteBuffer byteBuffer = zzihVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zztf zzaw = zzaw();
                        zzaw.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaw.zzp(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzak(Exception exc) {
        zzfe.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzal(String str, zztd zztdVar, long j, long j2) {
        this.zzg.zza(str, j, j2);
        this.zzl = zzaO(str);
        zzti zzay = zzay();
        zzay.getClass();
        boolean z = false;
        if (zzfx.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzay.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzay.zzh();
            int length = zzh.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (zzh[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.zzm = z;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzam(String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzan(zzam zzamVar, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        zztf zzaw = zzaw();
        if (zzaw != null) {
            zzaw.zzq(this.zzr);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        float f = zzamVar.zzv;
        int i = zzfx.zza;
        int i2 = zzamVar.zzu;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer2;
            integer2 = integer;
            integer = i3;
        }
        this.zzz = new zzdp(integer, integer2, 0, f);
        this.zzi.zzl(zzamVar.zzt);
        if (this.zzF == null) {
            return;
        }
        zzak zzb2 = zzamVar.zzb();
        zzb2.zzab(integer);
        zzb2.zzI(integer2);
        zzb2.zzV(0);
        zzb2.zzS(f);
        zzb2.zzac();
        throw null;
    }

    protected final void zzao(int i, int i2) {
        zzir zzirVar = this.zza;
        zzirVar.zzh += i;
        int i3 = i + i2;
        zzirVar.zzg += i3;
        this.zzt += i3;
        int i4 = this.zzu + i3;
        this.zzu = i4;
        zzirVar.zzi = Math.max(i4, zzirVar.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzap() {
        this.zzi.zzf();
        if (this.zzf.zzl()) {
            this.zzf.zzh(zzau());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final int zzat(zzih zzihVar) {
        int i = zzfx.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final zzth zzax(Throwable th, zzti zztiVar) {
        return new zzaat(th, zztiVar, this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmf
    public final void zzs() {
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq
    protected final void zzw() {
        this.zzA = null;
        this.zzi.zzd();
        this.zzq = false;
        try {
            super.zzw();
        } finally {
            this.zzg.zzc(this.zza);
            this.zzg.zzt(zzdp.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq
    protected final void zzx(boolean z, boolean z2) throws zziz {
        super.zzx(z, z2);
        zzm();
        this.zzg.zze(this.zza);
        this.zzi.zze(z2);
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzy() {
        zzabd zzabdVar = this.zzi;
        zzel zzh = zzh();
        zzabdVar.zzk(zzh);
        this.zzf.zzf(zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq
    protected final void zzz(long j, boolean z) throws zziz {
        if (this.zzF != null) {
            throw null;
        }
        super.zzz(j, z);
        if (this.zzf.zzl()) {
            this.zzf.zzh(zzau());
        }
        this.zzi.zzi();
        if (z) {
            this.zzi.zzc();
        }
        this.zzu = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final boolean zzar(long j, long j2, zztf zztfVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zziz {
        zztfVar.getClass();
        long zzau = j3 - zzau();
        int zza = this.zzi.zza(j3, j, j2, zzav(), z2, this.zzj);
        if (!z || z2) {
            if (this.zzn != this.zzp || this.zzf.zzl()) {
                if (this.zzF != null) {
                    try {
                        throw null;
                    } catch (zzabw e) {
                        throw zzi(e, e.zza, false, 7001);
                    }
                } else if (zza == 0) {
                    zzh();
                    long nanoTime = System.nanoTime();
                    int i4 = zzfx.zza;
                    zzah(zztfVar, i, zzau, nanoTime);
                    zzaM(this.zzj.zzc());
                    return true;
                } else if (zza == 1) {
                    zzabb zzabbVar = this.zzj;
                    long zzd2 = zzabbVar.zzd();
                    long zzc2 = zzabbVar.zzc();
                    int i5 = zzfx.zza;
                    if (zzd2 != this.zzy) {
                        zzah(zztfVar, i, zzau, zzd2);
                    } else {
                        zzai(zztfVar, i, zzau);
                    }
                    zzaM(zzc2);
                    this.zzy = zzd2;
                    return true;
                } else if (zza == 2) {
                    Trace.beginSection("dropVideoBuffer");
                    zztfVar.zzn(i, false);
                    Trace.endSection();
                    zzao(0, 1);
                    zzaM(this.zzj.zzc());
                    return true;
                } else if (zza == 3) {
                    zzai(zztfVar, i, zzau);
                    zzaM(this.zzj.zzc());
                    return true;
                }
            } else if (this.zzj.zzc() < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                zzai(zztfVar, i, zzau);
                zzaM(this.zzj.zzc());
                return true;
            }
            return false;
        }
        zzai(zztfVar, i, zzau);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzma
    public final void zzt(int i, Object obj) throws zziz {
        Surface surface;
        if (i != 1) {
            if (i == 7) {
                obj.getClass();
                zzaba zzabaVar = (zzaba) obj;
                this.zzE = zzabaVar;
                this.zzf.zzj(zzabaVar);
                return;
            } else if (i == 10) {
                obj.getClass();
                int intValue = ((Integer) obj).intValue();
                if (this.zzD != intValue) {
                    this.zzD = intValue;
                    return;
                }
                return;
            } else if (i == 4) {
                obj.getClass();
                int intValue2 = ((Integer) obj).intValue();
                this.zzr = intValue2;
                zztf zzaw = zzaw();
                if (zzaw != null) {
                    zzaw.zzq(intValue2);
                    return;
                }
                return;
            } else if (i == 5) {
                zzabd zzabdVar = this.zzi;
                obj.getClass();
                zzabdVar.zzj(((Integer) obj).intValue());
                return;
            } else if (i == 13) {
                obj.getClass();
                this.zzf.zzi((List) obj);
                this.zzB = true;
                return;
            } else if (i != 14) {
                return;
            } else {
                obj.getClass();
                this.zzo = (zzfp) obj;
                if (this.zzf.zzl()) {
                    zzfp zzfpVar = this.zzo;
                    zzfpVar.getClass();
                    if (zzfpVar.zzb() == 0 || zzfpVar.zza() == 0 || (surface = this.zzn) == null) {
                        return;
                    }
                    this.zzf.zzg(surface, zzfpVar);
                    return;
                }
                return;
            }
        }
        zzaaz zzaazVar = obj instanceof Surface ? (Surface) obj : null;
        if (zzaazVar == null) {
            zzaaz zzaazVar2 = this.zzp;
            if (zzaazVar2 != null) {
                zzaazVar = zzaazVar2;
            } else {
                zzti zzay = zzay();
                if (zzay != null && zzaS(zzay)) {
                    zzaazVar = zzaaz.zza(this.zze, zzay.zzf);
                    this.zzp = zzaazVar;
                }
            }
        }
        if (this.zzn != zzaazVar) {
            this.zzn = zzaazVar;
            this.zzi.zzm(zzaazVar);
            this.zzq = false;
            int zzcU = zzcU();
            zztf zzaw2 = zzaw();
            zzaaz zzaazVar3 = zzaazVar;
            if (zzaw2 != null) {
                zzaazVar3 = zzaazVar;
                if (!this.zzf.zzl()) {
                    zzaaz zzaazVar4 = zzaazVar;
                    if (zzfx.zza >= 23) {
                        if (zzaazVar != null) {
                            zzaazVar4 = zzaazVar;
                            if (!this.zzl) {
                                zzaw2.zzo(zzaazVar);
                                zzaazVar3 = zzaazVar;
                            }
                        } else {
                            zzaazVar4 = null;
                        }
                    }
                    zzaD();
                    zzaz();
                    zzaazVar3 = zzaazVar4;
                }
            }
            if (zzaazVar3 == null || zzaazVar3 == this.zzp) {
                this.zzA = null;
                if (this.zzf.zzl()) {
                    this.zzf.zzc();
                    return;
                }
                return;
            }
            zzaQ();
            if (zzcU == 2) {
                this.zzi.zzc();
            }
            if (this.zzf.zzl()) {
                this.zzf.zzg(zzaazVar3, zzfp.zza);
            }
        } else if (zzaazVar == null || zzaazVar == this.zzp) {
        } else {
            zzaQ();
            Surface surface2 = this.zzn;
            if (surface2 == null || !this.zzq) {
                return;
            }
            this.zzg.zzq(surface2);
        }
    }
}
