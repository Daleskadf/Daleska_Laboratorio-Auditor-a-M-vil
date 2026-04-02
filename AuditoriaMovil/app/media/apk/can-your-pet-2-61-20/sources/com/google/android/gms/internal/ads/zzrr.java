package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.work.PeriodicWorkRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import kotlin.time.DurationKt;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzrr implements zzqn {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private zzrh zzA;
    private zzcg zzB;
    private boolean zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private float zzL;
    private ByteBuffer zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzl zzT;
    private zzpp zzU;
    private long zzV;
    private boolean zzW;
    private boolean zzX;
    private Looper zzY;
    private long zzZ;
    private long zzaa;
    private Handler zzab;
    private final zzrf zzac;
    private final zzqv zzad;
    private final Context zzd;
    private final zzqs zze;
    private final zzsb zzf;
    private final zzfzn zzg;
    private final zzfzn zzh;
    private final zzeo zzi;
    private final zzqr zzj;
    private final ArrayDeque zzk;
    private zzrp zzl;
    private final zzrk zzm;
    private final zzrk zzn;
    private final zzrc zzo;
    private zzpb zzp;
    private zzqk zzq;
    private zzre zzr;
    private zzre zzs;
    private zzdq zzt;
    private AudioTrack zzu;
    private zzph zzv;
    private zzpo zzw;
    private zzrj zzx;
    private zzk zzy;
    private zzrh zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzrr(zzrd zzrdVar, zzrq zzrqVar) {
        zzph zzb2;
        Context zza2 = zzrd.zza(zzrdVar);
        this.zzd = zza2;
        zzk zzkVar = zzk.zza;
        this.zzy = zzkVar;
        if (zza2 != null) {
            zzph zzphVar = zzph.zza;
            int i = zzfx.zza;
            zzb2 = zzph.zzc(zza2, zzkVar, null);
        } else {
            zzb2 = zzrd.zzb(zzrdVar);
        }
        this.zzv = zzb2;
        this.zzac = zzrd.zze(zzrdVar);
        int i2 = zzfx.zza;
        this.zzo = zzrd.zzc(zzrdVar);
        zzqv zzf = zzrd.zzf(zzrdVar);
        zzf.getClass();
        this.zzad = zzf;
        zzeo zzeoVar = new zzeo(zzel.zza);
        this.zzi = zzeoVar;
        zzeoVar.zze();
        this.zzj = new zzqr(new zzrm(this, null));
        zzqs zzqsVar = new zzqs();
        this.zze = zzqsVar;
        zzsb zzsbVar = new zzsb();
        this.zzf = zzsbVar;
        this.zzg = zzfzn.zzp(new zzdx(), zzqsVar, zzsbVar);
        this.zzh = zzfzn.zzn(new zzsa());
        this.zzL = 1.0f;
        this.zzS = 0;
        this.zzT = new zzl(0, 0.0f);
        this.zzA = new zzrh(zzcg.zza, 0L, 0L, null);
        this.zzB = zzcg.zza;
        this.zzC = false;
        this.zzk = new ArrayDeque();
        this.zzm = new zzrk(100L);
        this.zzn = new zzrk(100L);
    }

    public static /* synthetic */ void zzG(zzrr zzrrVar) {
        if (zzrrVar.zzaa >= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            zzrx.zzah(((zzrw) zzrrVar.zzq).zza, true);
            zzrrVar.zzaa = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzH(AudioTrack audioTrack, final zzqk zzqkVar, Handler handler, final zzqh zzqhVar, zzeo zzeoVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzqkVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqf zzqfVar;
                        zzqfVar = ((zzrw) zzqk.this).zza.zzc;
                        zzqfVar.zzd(zzqhVar);
                    }
                });
            }
            zzeoVar.zze();
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            if (zzqkVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqf zzqfVar;
                        zzqfVar = ((zzrw) zzqk.this).zza.zzc;
                        zzqfVar.zzd(zzqhVar);
                    }
                });
            }
            zzeoVar.zze();
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzK() {
        zzre zzreVar = this.zzs;
        return zzreVar.zzc == 0 ? this.zzD / zzreVar.zzb : this.zzE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzL() {
        zzre zzreVar = this.zzs;
        if (zzreVar.zzc == 0) {
            long j = this.zzF;
            long j2 = zzreVar.zzd;
            int i = zzfx.zza;
            return ((j + j2) - 1) / j2;
        }
        return this.zzG;
    }

    private final AudioTrack zzM(zzre zzreVar) throws zzqj {
        try {
            return zzreVar.zza(this.zzy, this.zzS);
        } catch (zzqj e) {
            zzqk zzqkVar = this.zzq;
            if (zzqkVar != null) {
                zzqkVar.zza(e);
            }
            throw e;
        }
    }

    private final void zzN(long j) {
        zzcg zzcgVar;
        boolean z;
        if (zzZ()) {
            zzrf zzrfVar = this.zzac;
            zzcgVar = this.zzB;
            zzrfVar.zzc(zzcgVar);
        } else {
            zzcgVar = zzcg.zza;
        }
        zzcg zzcgVar2 = zzcgVar;
        this.zzB = zzcgVar2;
        if (zzZ()) {
            zzrf zzrfVar2 = this.zzac;
            z = this.zzC;
            zzrfVar2.zzd(z);
        } else {
            z = false;
        }
        this.zzC = z;
        this.zzk.add(new zzrh(zzcgVar2, Math.max(0L, j), zzfx.zzs(zzL(), this.zzs.zze), null));
        zzU();
        zzqk zzqkVar = this.zzq;
        if (zzqkVar != null) {
            zzrx.zzae(((zzrw) zzqkVar).zza).zzw(this.zzC);
        }
    }

    private final void zzO() {
        if (this.zzs.zzc()) {
            this.zzW = true;
        }
    }

    private final void zzP() {
        if (this.zzw != null || this.zzd == null) {
            return;
        }
        this.zzY = Looper.myLooper();
        zzpo zzpoVar = new zzpo(this.zzd, new zzqz(this), this.zzy, this.zzU);
        this.zzw = zzpoVar;
        this.zzv = zzpoVar.zzc();
    }

    private final void zzQ() {
        if (this.zzQ) {
            return;
        }
        this.zzQ = true;
        this.zzj.zzb(zzL());
        this.zzu.stop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        r0 = r2.zzM;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r0.hasRemaining() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        r2.zzt.zze(r2.zzM);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzR(long r3) throws com.google.android.gms.internal.ads.zzqm {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.zzdq r0 = r2.zzt
            boolean r0 = r0.zzh()
            if (r0 == 0) goto L39
        L8:
            com.google.android.gms.internal.ads.zzdq r0 = r2.zzt
            boolean r0 = r0.zzg()
            if (r0 != 0) goto L38
        L10:
            com.google.android.gms.internal.ads.zzdq r0 = r2.zzt
            java.nio.ByteBuffer r0 = r0.zzb()
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L26
            r2.zzV(r0, r3)
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L10
            goto L38
        L26:
            java.nio.ByteBuffer r0 = r2.zzM
            if (r0 == 0) goto L38
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.zzdq r0 = r2.zzt
            java.nio.ByteBuffer r1 = r2.zzM
            r0.zze(r1)
            goto L8
        L38:
            return
        L39:
            java.nio.ByteBuffer r0 = r2.zzM
            if (r0 != 0) goto L3f
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzdt.zza
        L3f:
            r2.zzV(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrr.zzR(long):void");
    }

    private final void zzS(zzcg zzcgVar) {
        zzrh zzrhVar = new zzrh(zzcgVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzX()) {
            this.zzz = zzrhVar;
        } else {
            this.zzA = zzrhVar;
        }
    }

    private final void zzT() {
        if (zzX()) {
            int i = zzfx.zza;
            this.zzu.setVolume(this.zzL);
        }
    }

    private final void zzU() {
        zzdq zzdqVar = this.zzs.zzi;
        this.zzt = zzdqVar;
        zzdqVar.zzc();
    }

    private final void zzV(ByteBuffer byteBuffer, long j) throws zzqm {
        zzqk zzqkVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzO;
            if (byteBuffer2 != null) {
                zzek.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzO = byteBuffer;
                int i = zzfx.zza;
            }
            int remaining = byteBuffer.remaining();
            int i2 = zzfx.zza;
            int write = this.zzu.write(byteBuffer, remaining, 1);
            this.zzV = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((zzfx.zza >= 24 && write == -6) || write == -32) {
                    if (zzL() <= 0) {
                        if (zzY(this.zzu)) {
                            zzO();
                        }
                    }
                    r10 = true;
                }
                zzqm zzqmVar = new zzqm(write, this.zzs.zza, r10);
                zzqk zzqkVar2 = this.zzq;
                if (zzqkVar2 != null) {
                    zzqkVar2.zza(zzqmVar);
                }
                if (zzqmVar.zzb) {
                    this.zzv = zzph.zza;
                    throw zzqmVar;
                } else {
                    this.zzn.zzb(zzqmVar);
                    return;
                }
            }
            this.zzn.zza();
            if (zzY(this.zzu)) {
                if (this.zzG > 0) {
                    this.zzX = false;
                }
                if (this.zzR && (zzqkVar = this.zzq) != null && write < remaining) {
                    zzrx zzrxVar = ((zzrw) zzqkVar).zza;
                    if (zzrx.zzad(zzrxVar) != null) {
                        zzrx.zzad(zzrxVar).zza();
                    }
                }
            }
            int i3 = this.zzs.zzc;
            if (i3 == 0) {
                this.zzF += write;
            }
            if (write == remaining) {
                if (i3 != 0) {
                    zzek.zzf(byteBuffer == this.zzM);
                    this.zzG += this.zzH * this.zzN;
                }
                this.zzO = null;
            }
        }
    }

    private final boolean zzW() throws zzqm {
        if (!this.zzt.zzh()) {
            ByteBuffer byteBuffer = this.zzO;
            if (byteBuffer == null) {
                return true;
            }
            zzV(byteBuffer, Long.MIN_VALUE);
            return this.zzO == null;
        }
        this.zzt.zzd();
        zzR(Long.MIN_VALUE);
        if (this.zzt.zzg()) {
            ByteBuffer byteBuffer2 = this.zzO;
            return byteBuffer2 == null || !byteBuffer2.hasRemaining();
        }
        return false;
    }

    private final boolean zzX() {
        return this.zzu != null;
    }

    private static boolean zzY(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (zzfx.zza >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            return isOffloadedPlayback;
        }
        return false;
    }

    private final boolean zzZ() {
        zzre zzreVar = this.zzs;
        if (zzreVar.zzc == 0) {
            int i = zzreVar.zza.zzB;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final boolean zzA(zzam zzamVar) {
        return zza(zzamVar) != 0;
    }

    public final void zzI(zzph zzphVar) {
        zzek.zzf(this.zzY == Looper.myLooper());
        if (zzphVar.equals(this.zzv)) {
            return;
        }
        this.zzv = zzphVar;
        zzqk zzqkVar = this.zzq;
        if (zzqkVar != null) {
            zzrx.zzai(((zzrw) zzqkVar).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final int zza(zzam zzamVar) {
        zzP();
        if (!"audio/raw".equals(zzamVar.zzm)) {
            return this.zzv.zzb(zzamVar, this.zzy) != null ? 2 : 0;
        } else if (zzfx.zzK(zzamVar.zzB)) {
            return zzamVar.zzB != 2 ? 1 : 2;
        } else {
            int i = zzamVar.zzB;
            zzfe.zzf("DefaultAudioSink", "Invalid PCM encoding: " + i);
            return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final long zzb(boolean z) {
        long zzp;
        if (!zzX() || this.zzJ) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzj.zza(z), zzfx.zzs(zzL(), this.zzs.zze));
        while (!this.zzk.isEmpty() && min >= ((zzrh) this.zzk.getFirst()).zzc) {
            this.zzA = (zzrh) this.zzk.remove();
        }
        zzrh zzrhVar = this.zzA;
        long j = min - zzrhVar.zzc;
        if (zzrhVar.zza.equals(zzcg.zza)) {
            zzp = this.zzA.zzb + j;
        } else if (this.zzk.isEmpty()) {
            zzp = this.zzac.zza(j) + this.zzA.zzb;
        } else {
            zzrh zzrhVar2 = (zzrh) this.zzk.getFirst();
            zzp = zzrhVar2.zzb - zzfx.zzp(zzrhVar2.zzc - min, this.zzA.zza.zzc);
        }
        long zzb2 = this.zzac.zzb();
        long zzs = zzp + zzfx.zzs(zzb2, this.zzs.zze);
        long j2 = this.zzZ;
        if (zzb2 > j2) {
            long zzs2 = zzfx.zzs(zzb2 - j2, this.zzs.zze);
            this.zzZ = zzb2;
            this.zzaa += zzs2;
            if (this.zzab == null) {
                this.zzab = new Handler(Looper.myLooper());
            }
            this.zzab.removeCallbacksAndMessages(null);
            this.zzab.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqy
                @Override // java.lang.Runnable
                public final void run() {
                    zzrr.zzG(zzrr.this);
                }
            }, 100L);
        }
        return zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final zzcg zzc() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final zzps zzd(zzam zzamVar) {
        return this.zzW ? zzps.zza : this.zzad.zza(zzamVar, this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zze(zzam zzamVar, int i, int[] iArr) throws zzqi {
        int intValue;
        zzdq zzdqVar;
        int i2;
        int intValue2;
        int i3;
        int i4;
        int i5;
        int i6;
        int max;
        int zzb2;
        zzP();
        if ("audio/raw".equals(zzamVar.zzm)) {
            zzek.zzd(zzfx.zzK(zzamVar.zzB));
            i3 = zzfx.zzm(zzamVar.zzB, zzamVar.zzz);
            zzfzk zzfzkVar = new zzfzk();
            int i7 = zzamVar.zzB;
            zzfzkVar.zzh(this.zzg);
            zzfzkVar.zzg(this.zzac.zze());
            zzdq zzdqVar2 = new zzdq(zzfzkVar.zzi());
            if (zzdqVar2.equals(this.zzt)) {
                zzdqVar2 = this.zzt;
            }
            this.zzf.zzq(zzamVar.zzC, zzamVar.zzD);
            this.zze.zzo(iArr);
            try {
                zzdr zza2 = zzdqVar2.zza(new zzdr(zzamVar.zzA, zzamVar.zzz, zzamVar.zzB));
                intValue = zza2.zzd;
                i2 = zza2.zzb;
                int i8 = zza2.zzc;
                intValue2 = zzfx.zzh(i8);
                zzdqVar = zzdqVar2;
                i5 = zzfx.zzm(intValue, i8);
                i4 = 0;
            } catch (zzds e) {
                throw new zzqi(e, zzamVar);
            }
        } else {
            zzdq zzdqVar3 = new zzdq(zzfzn.zzm());
            int i9 = zzamVar.zzA;
            zzps zzpsVar = zzps.zza;
            Pair zzb3 = this.zzv.zzb(zzamVar, this.zzy);
            if (zzb3 == null) {
                throw new zzqi("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(zzamVar))), zzamVar);
            }
            intValue = ((Integer) zzb3.first).intValue();
            zzdqVar = zzdqVar3;
            i2 = i9;
            intValue2 = ((Integer) zzb3.second).intValue();
            i3 = -1;
            i4 = 2;
            i5 = -1;
        }
        if (intValue == 0) {
            String valueOf = String.valueOf(zzamVar);
            throw new zzqi("Invalid output encoding (mode=" + i4 + ") for: " + valueOf, zzamVar);
        } else if (intValue2 == 0) {
            String valueOf2 = String.valueOf(zzamVar);
            throw new zzqi("Invalid output channel config (mode=" + i4 + ") for: " + valueOf2, zzamVar);
        } else {
            int i10 = zzamVar.zzi;
            if ("audio/vnd.dts.hd;profile=lbr".equals(zzamVar.zzm) && i10 == -1) {
                i10 = 768000;
            }
            int minBufferSize = AudioTrack.getMinBufferSize(i2, intValue2, intValue);
            zzek.zzf(minBufferSize != -2);
            int i11 = i5 != -1 ? i5 : 1;
            int i12 = 250000;
            if (i4 == 0) {
                i6 = i4;
                max = Math.max(zzrt.zza(250000, i2, i11), Math.min(minBufferSize * 4, zzrt.zza(750000, i2, i11)));
            } else if (i4 == 1) {
                i6 = i4;
                max = zzgcl.zzb((zzrt.zzb(intValue) * 50000000) / 1000000);
            } else {
                if (intValue == 5) {
                    i12 = 500000;
                } else if (intValue == 8) {
                    i12 = DurationKt.NANOS_IN_MILLIS;
                    intValue = 8;
                }
                if (i10 != -1) {
                    zzb2 = zzgcd.zza(i10, 8, RoundingMode.CEILING);
                } else {
                    zzb2 = zzrt.zzb(intValue);
                }
                i6 = i4;
                max = zzgcl.zzb((i12 * zzb2) / 1000000);
            }
            this.zzW = false;
            zzre zzreVar = new zzre(zzamVar, i3, i6, i5, i2, intValue2, intValue, (((Math.max(minBufferSize, max) + i11) - 1) / i11) * i11, zzdqVar, false, false, false);
            if (zzX()) {
                this.zzr = zzreVar;
            } else {
                this.zzs = zzreVar;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzf() {
        zzrj zzrjVar;
        if (zzX()) {
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzF = 0L;
            this.zzG = 0L;
            this.zzX = false;
            this.zzH = 0;
            this.zzA = new zzrh(this.zzB, 0L, 0L, null);
            this.zzK = 0L;
            this.zzz = null;
            this.zzk.clear();
            this.zzM = null;
            this.zzN = 0;
            this.zzO = null;
            this.zzQ = false;
            this.zzP = false;
            this.zzf.zzp();
            zzU();
            if (this.zzj.zzh()) {
                this.zzu.pause();
            }
            if (zzY(this.zzu)) {
                zzrp zzrpVar = this.zzl;
                zzrpVar.getClass();
                zzrpVar.zzb(this.zzu);
            }
            int i = zzfx.zza;
            final zzqh zzb2 = this.zzs.zzb();
            zzre zzreVar = this.zzr;
            if (zzreVar != null) {
                this.zzs = zzreVar;
                this.zzr = null;
            }
            this.zzj.zzc();
            if (zzfx.zza >= 24 && (zzrjVar = this.zzx) != null) {
                zzrjVar.zzb();
                this.zzx = null;
            }
            final AudioTrack audioTrack = this.zzu;
            final zzeo zzeoVar = this.zzi;
            final zzqk zzqkVar = this.zzq;
            zzeoVar.zzc();
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzfx.zzE("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzrr.zzH(audioTrack, zzqkVar, handler, zzb2, zzeoVar);
                    }
                });
            }
            this.zzu = null;
        }
        this.zzn.zza();
        this.zzm.zza();
        this.zzZ = 0L;
        this.zzaa = 0L;
        Handler handler2 = this.zzab;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzg() {
        this.zzI = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzh() {
        this.zzR = false;
        if (zzX()) {
            if (this.zzj.zzk() || zzY(this.zzu)) {
                this.zzu.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzi() {
        this.zzR = true;
        if (zzX()) {
            this.zzj.zzf();
            this.zzu.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzj() throws zzqm {
        if (!this.zzP && zzX() && zzW()) {
            zzQ();
            this.zzP = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzk() {
        zzpo zzpoVar = this.zzw;
        if (zzpoVar != null) {
            zzpoVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzl() {
        zzf();
        zzfzn zzfznVar = this.zzg;
        int size = zzfznVar.size();
        for (int i = 0; i < size; i++) {
            ((zzdt) zzfznVar.get(i)).zzf();
        }
        zzfzn zzfznVar2 = this.zzh;
        int size2 = zzfznVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((zzdt) zzfznVar2.get(i2)).zzf();
        }
        zzdq zzdqVar = this.zzt;
        if (zzdqVar != null) {
            zzdqVar.zzf();
        }
        this.zzR = false;
        this.zzW = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzm(zzk zzkVar) {
        if (this.zzy.equals(zzkVar)) {
            return;
        }
        this.zzy = zzkVar;
        zzpo zzpoVar = this.zzw;
        if (zzpoVar != null) {
            zzpoVar.zzg(zzkVar);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzn(int i) {
        if (this.zzS != i) {
            this.zzS = i;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzo(zzl zzlVar) {
        if (this.zzT.equals(zzlVar)) {
            return;
        }
        if (this.zzu != null) {
            int i = this.zzT.zza;
        }
        this.zzT = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzp(zzel zzelVar) {
        this.zzj.zze(zzelVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzq(zzqk zzqkVar) {
        this.zzq = zzqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzr(int i, int i2) {
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzY(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzs(zzcg zzcgVar) {
        this.zzB = new zzcg(Math.max(0.1f, Math.min(zzcgVar.zzc, 8.0f)), Math.max(0.1f, Math.min(zzcgVar.zzd, 8.0f)));
        zzS(zzcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzt(zzpb zzpbVar) {
        this.zzp = zzpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzv(boolean z) {
        this.zzC = z;
        zzS(this.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzw(float f) {
        if (this.zzL != f) {
            this.zzL = f;
            zzT();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzqn
    public final boolean zzx(ByteBuffer byteBuffer, long j, int i) throws zzqj, zzqm {
        AudioTrack zzM;
        zzpo zzpoVar;
        zzpb zzpbVar;
        boolean z;
        int zza2;
        int i2;
        int i3;
        int i4;
        byte b;
        int i5;
        int i6;
        ByteBuffer byteBuffer2 = this.zzM;
        zzek.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzr != null) {
            if (!zzW()) {
                return false;
            }
            zzre zzreVar = this.zzr;
            zzre zzreVar2 = this.zzs;
            if (zzreVar2.zzc != zzreVar.zzc || zzreVar2.zzg != zzreVar.zzg || zzreVar2.zze != zzreVar.zze || zzreVar2.zzf != zzreVar.zzf || zzreVar2.zzd != zzreVar.zzd) {
                zzQ();
                if (zzy()) {
                    return false;
                }
                zzf();
            } else {
                boolean z2 = zzreVar2.zzj;
                boolean z3 = zzreVar.zzj;
                boolean z4 = zzreVar2.zzk;
                boolean z5 = zzreVar.zzk;
                this.zzs = zzreVar;
                this.zzr = null;
                AudioTrack audioTrack = this.zzu;
                if (audioTrack != null && zzY(audioTrack)) {
                    boolean z6 = this.zzs.zzk;
                }
            }
            zzN(j);
        }
        if (!zzX()) {
            try {
                if (!this.zzi.zzd()) {
                    return false;
                }
                try {
                    zzre zzreVar3 = this.zzs;
                    zzreVar3.getClass();
                    zzM = zzM(zzreVar3);
                } catch (zzqj e) {
                    zzre zzreVar4 = this.zzs;
                    if (zzreVar4.zzh > 1000000) {
                        zzam zzamVar = zzreVar4.zza;
                        int i7 = zzreVar4.zzb;
                        int i8 = zzreVar4.zzc;
                        int i9 = zzreVar4.zzd;
                        int i10 = zzreVar4.zze;
                        int i11 = zzreVar4.zzf;
                        int i12 = zzreVar4.zzg;
                        zzdq zzdqVar = zzreVar4.zzi;
                        boolean z7 = zzreVar4.zzj;
                        boolean z8 = zzreVar4.zzk;
                        boolean z9 = zzreVar4.zzl;
                        zzre zzreVar5 = new zzre(zzamVar, i7, i8, i9, i10, i11, i12, DurationKt.NANOS_IN_MILLIS, zzdqVar, false, false, false);
                        try {
                            zzM = zzM(zzreVar5);
                            this.zzs = zzreVar5;
                        } catch (zzqj e2) {
                            e.addSuppressed(e2);
                            zzO();
                            throw e;
                        }
                    }
                    zzO();
                    throw e;
                }
                this.zzu = zzM;
                if (zzY(zzM)) {
                    AudioTrack audioTrack2 = this.zzu;
                    if (this.zzl == null) {
                        this.zzl = new zzrp(this);
                    }
                    this.zzl.zza(audioTrack2);
                    boolean z10 = this.zzs.zzk;
                }
                if (zzfx.zza >= 31 && (zzpbVar = this.zzp) != null) {
                    zzrb.zza(this.zzu, zzpbVar);
                }
                this.zzS = this.zzu.getAudioSessionId();
                zzqr zzqrVar = this.zzj;
                AudioTrack audioTrack3 = this.zzu;
                zzre zzreVar6 = this.zzs;
                zzqrVar.zzd(audioTrack3, zzreVar6.zzc == 2, zzreVar6.zzg, zzreVar6.zzd, zzreVar6.zzh);
                zzT();
                int i13 = this.zzT.zza;
                zzpp zzppVar = this.zzU;
                if (zzppVar != null && zzfx.zza >= 23) {
                    zzra.zza(this.zzu, zzppVar);
                    zzpo zzpoVar2 = this.zzw;
                    if (zzpoVar2 != null) {
                        zzpoVar2.zzh(this.zzU.zza);
                    }
                }
                if (zzfx.zza >= 24 && (zzpoVar = this.zzw) != null) {
                    this.zzx = new zzrj(this.zzu, zzpoVar);
                }
                this.zzJ = true;
                zzqk zzqkVar = this.zzq;
                if (zzqkVar != null) {
                    zzrx.zzae(((zzrw) zzqkVar).zza).zzc(this.zzs.zzb());
                }
            } catch (zzqj e3) {
                if (e3.zzb) {
                    throw e3;
                }
                this.zzm.zzb(e3);
                return false;
            }
        }
        this.zzm.zza();
        if (this.zzJ) {
            this.zzK = Math.max(0L, j);
            this.zzI = false;
            this.zzJ = false;
            zzN(j);
            if (this.zzR) {
                zzi();
            }
        }
        if (this.zzj.zzj(zzL())) {
            if (this.zzM == null) {
                zzek.zzd(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                zzre zzreVar7 = this.zzs;
                if (zzreVar7.zzc != 0 && this.zzH == 0) {
                    int i14 = zzreVar7.zzg;
                    switch (i14) {
                        case 5:
                        case 6:
                        case 18:
                            z = true;
                            zza2 = zzace.zza(byteBuffer);
                            break;
                        case 7:
                        case 8:
                            int i15 = zzadc.zza;
                            if (byteBuffer.getInt(0) == -233094848) {
                                z = true;
                                zza2 = 1024;
                                break;
                            } else {
                                if (byteBuffer.getInt(0) != -398277519) {
                                    if (byteBuffer.getInt(0) != 622876772) {
                                        int position = byteBuffer.position();
                                        byte b2 = byteBuffer.get(position);
                                        if (b2 != -2) {
                                            if (b2 == -1) {
                                                i3 = 2;
                                                i4 = (byteBuffer.get(position + 4) & 7) << 4;
                                                b = byteBuffer.get(position + 7);
                                            } else if (b2 == 31) {
                                                i3 = 2;
                                                i4 = (byteBuffer.get(position + 5) & 7) << 4;
                                                b = byteBuffer.get(position + 6);
                                            } else {
                                                i4 = (byteBuffer.get(position + 4) & 1) << 6;
                                                i5 = byteBuffer.get(position + 5) & 252;
                                                i3 = 2;
                                                i2 = (i5 >> i3) | i4;
                                                z = true;
                                            }
                                            i5 = b & 60;
                                            i2 = (i5 >> i3) | i4;
                                            z = true;
                                        } else {
                                            z = true;
                                            i2 = ((byteBuffer.get(position + 5) & 1) << 6) | ((byteBuffer.get(position + 4) & 252) >> 2);
                                        }
                                        zza2 = (i2 + (z ? 1 : 0)) * 32;
                                        break;
                                    } else {
                                        zza2 = 4096;
                                        z = true;
                                        break;
                                    }
                                }
                                zza2 = 1024;
                                z = true;
                            }
                        case 9:
                            zza2 = zzaea.zzc(zzfx.zzi(byteBuffer, byteBuffer.position()));
                            if (zza2 == -1) {
                                throw new IllegalArgumentException();
                            }
                            z = true;
                            break;
                        case 10:
                        case 16:
                            zza2 = 1024;
                            z = true;
                            break;
                        case 11:
                        case 12:
                            zza2 = 2048;
                            z = true;
                            break;
                        case 13:
                        case 19:
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i14);
                        case 14:
                            int i16 = zzace.zza;
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i17 = position2;
                            while (true) {
                                if (i17 > limit) {
                                    i6 = -1;
                                } else if ((zzfx.zzi(byteBuffer, i17 + 4) & (-2)) == -126718022) {
                                    i6 = i17 - position2;
                                } else {
                                    i17++;
                                }
                            }
                            if (i6 == -1) {
                                zza2 = 0;
                            } else {
                                zza2 = (40 << ((byteBuffer.get((byteBuffer.position() + i6) + ((byteBuffer.get((byteBuffer.position() + i6) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            }
                            z = true;
                            break;
                        case 15:
                            zza2 = 512;
                            z = true;
                            break;
                        case 17:
                            int i18 = zzach.zza;
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            zza2 = zzach.zza(new zzfn(bArr, 16)).zzc;
                            z = true;
                            break;
                        case 20:
                            zza2 = zzaeb.zzb(byteBuffer);
                            z = true;
                            break;
                    }
                    this.zzH = zza2;
                    if (zza2 == 0) {
                        return z;
                    }
                }
                if (this.zzz != null) {
                    if (!zzW()) {
                        return false;
                    }
                    zzN(j);
                    this.zzz = null;
                }
                long zzs = this.zzK + zzfx.zzs(zzK() - this.zzf.zzo(), this.zzs.zza.zzA);
                if (!this.zzI && Math.abs(zzs - j) > 200000) {
                    zzqk zzqkVar2 = this.zzq;
                    if (zzqkVar2 != null) {
                        zzqkVar2.zza(new zzql(j, zzs));
                    }
                    this.zzI = true;
                }
                if (this.zzI) {
                    if (!zzW()) {
                        return false;
                    }
                    long j2 = j - zzs;
                    this.zzK += j2;
                    this.zzI = false;
                    zzN(j);
                    zzqk zzqkVar3 = this.zzq;
                    if (zzqkVar3 != null && j2 != 0) {
                        ((zzrw) zzqkVar3).zza.zzao();
                    }
                }
                if (this.zzs.zzc == 0) {
                    this.zzD += byteBuffer.remaining();
                } else {
                    this.zzE += this.zzH * i;
                }
                this.zzM = byteBuffer;
                this.zzN = i;
            }
            zzR(j);
            if (!this.zzM.hasRemaining()) {
                this.zzM = null;
                this.zzN = 0;
                return true;
            } else if (this.zzj.zzi(zzL())) {
                zzfe.zzf("DefaultAudioSink", "Resetting stalled audio track");
                zzf();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final boolean zzy() {
        return zzX() && this.zzj.zzg(zzL());
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final boolean zzz() {
        if (zzX()) {
            return this.zzP && !zzy();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzu(AudioDeviceInfo audioDeviceInfo) {
        this.zzU = audioDeviceInfo == null ? null : new zzpp(audioDeviceInfo);
        zzpo zzpoVar = this.zzw;
        if (zzpoVar != null) {
            zzpoVar.zzh(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzra.zza(audioTrack, this.zzU);
        }
    }
}
