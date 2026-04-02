package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzwk implements zzvf, zzadi, zzzt, zzzy, zzww {
    private static final Map zzb;
    private static final zzam zzc;
    private long zzA;
    private boolean zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private int zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private boolean zzJ;
    private int zzK;
    private boolean zzL;
    private boolean zzM;
    private final zzzs zzN;
    private final zzzo zzO;
    private final Uri zzd;
    private final zzgv zze;
    private final zzsm zzf;
    private final zzvq zzg;
    private final zzsg zzh;
    private final zzwg zzi;
    private final long zzj;
    private final zzaab zzk = new zzaab("ProgressiveMediaPeriod");
    private final zzvz zzl;
    private final zzeo zzm;
    private final Runnable zzn;
    private final Runnable zzo;
    private final Handler zzp;
    private final boolean zzq;
    private zzve zzr;
    private zzagm zzs;
    private zzwx[] zzt;
    private zzwi[] zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private zzwj zzy;
    private zzaef zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzak zzakVar = new zzak();
        zzakVar.zzK("icy");
        zzakVar.zzW("application/x-icy");
        zzc = zzakVar.zzac();
    }

    public zzwk(Uri uri, zzgv zzgvVar, zzvz zzvzVar, zzsm zzsmVar, zzsg zzsgVar, zzzs zzzsVar, zzvq zzvqVar, zzwg zzwgVar, zzzo zzzoVar, String str, int i, long j) {
        this.zzd = uri;
        this.zze = zzgvVar;
        this.zzf = zzsmVar;
        this.zzh = zzsgVar;
        this.zzN = zzzsVar;
        this.zzg = zzvqVar;
        this.zzi = zzwgVar;
        this.zzO = zzzoVar;
        this.zzj = i;
        this.zzl = zzvzVar;
        this.zzA = j;
        this.zzq = j != -9223372036854775807L;
        this.zzm = new zzeo(zzel.zza);
        this.zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zzwb
            @Override // java.lang.Runnable
            public final void run() {
                zzwk.this.zzU();
            }
        };
        this.zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzwc
            @Override // java.lang.Runnable
            public final void run() {
                zzwk.this.zzE();
            }
        };
        this.zzp = zzfx.zzx(null);
        this.zzu = new zzwi[0];
        this.zzt = new zzwx[0];
        this.zzI = -9223372036854775807L;
        this.zzC = 1;
    }

    private final int zzQ() {
        int i = 0;
        for (zzwx zzwxVar : this.zzt) {
            i += zzwxVar.zzd();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzR(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (true) {
            zzwx[] zzwxVarArr = this.zzt;
            if (i >= zzwxVarArr.length) {
                return j;
            }
            if (!z) {
                zzwj zzwjVar = this.zzy;
                zzwjVar.getClass();
                i = zzwjVar.zzc[i] ? 0 : i + 1;
            }
            j = Math.max(j, zzwxVarArr[i].zzh());
        }
    }

    private final zzaem zzS(zzwi zzwiVar) {
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            if (zzwiVar.equals(this.zzu[i])) {
                return this.zzt[i];
            }
        }
        zzwx zzwxVar = new zzwx(this.zzO, this.zzf, this.zzh);
        zzwxVar.zzu(this);
        int i2 = length + 1;
        zzwi[] zzwiVarArr = (zzwi[]) Arrays.copyOf(this.zzu, i2);
        zzwiVarArr[length] = zzwiVar;
        int i3 = zzfx.zza;
        this.zzu = zzwiVarArr;
        zzwx[] zzwxVarArr = (zzwx[]) Arrays.copyOf(this.zzt, i2);
        zzwxVarArr[length] = zzwxVar;
        this.zzt = zzwxVarArr;
        return zzwxVar;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzT() {
        zzek.zzf(this.zzw);
        this.zzy.getClass();
        this.zzz.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU() {
        zzby zzc2;
        int i;
        if (this.zzM || this.zzw || !this.zzv || this.zzz == null) {
            return;
        }
        for (zzwx zzwxVar : this.zzt) {
            if (zzwxVar.zzi() == null) {
                return;
            }
        }
        this.zzm.zzc();
        int length = this.zzt.length;
        zzcz[] zzczVarArr = new zzcz[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzam zzi = this.zzt[i2].zzi();
            zzi.getClass();
            String str = zzi.zzm;
            boolean zzg = zzcb.zzg(str);
            boolean z = zzg || zzcb.zzh(str);
            zArr[i2] = z;
            this.zzx = z | this.zzx;
            zzagm zzagmVar = this.zzs;
            if (zzagmVar != null) {
                if (zzg || this.zzu[i2].zzb) {
                    zzby zzbyVar = zzi.zzk;
                    if (zzbyVar == null) {
                        zzc2 = new zzby(-9223372036854775807L, zzagmVar);
                    } else {
                        zzc2 = zzbyVar.zzc(zzagmVar);
                    }
                    zzak zzb2 = zzi.zzb();
                    zzb2.zzP(zzc2);
                    zzi = zzb2.zzac();
                }
                if (zzg && zzi.zzg == -1 && zzi.zzh == -1 && (i = zzagmVar.zza) != -1) {
                    zzak zzb3 = zzi.zzb();
                    zzb3.zzx(i);
                    zzi = zzb3.zzac();
                }
            }
            zzczVarArr[i2] = new zzcz(Integer.toString(i2), zzi.zzc(this.zzf.zza(zzi)));
        }
        this.zzy = new zzwj(new zzxk(zzczVarArr), zArr);
        this.zzw = true;
        zzve zzveVar = this.zzr;
        zzveVar.getClass();
        zzveVar.zzi(this);
    }

    private final void zzV(int i) {
        zzT();
        zzwj zzwjVar = this.zzy;
        boolean[] zArr = zzwjVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzam zzb2 = zzwjVar.zza.zzb(i).zzb(0);
        this.zzg.zzc(new zzvd(1, zzcb.zzb(zzb2.zzm), zzb2, 0, null, zzfx.zzu(this.zzH), -9223372036854775807L));
        zArr[i] = true;
    }

    private final void zzW(int i) {
        zzT();
        boolean[] zArr = this.zzy.zzb;
        if (this.zzJ && zArr[i] && !this.zzt[i].zzx(false)) {
            this.zzI = 0L;
            this.zzJ = false;
            this.zzE = true;
            this.zzH = 0L;
            this.zzK = 0;
            for (zzwx zzwxVar : this.zzt) {
                zzwxVar.zzp(false);
            }
            zzve zzveVar = this.zzr;
            zzveVar.getClass();
            zzveVar.zzg(this);
        }
    }

    private final void zzX() {
        zzwf zzwfVar = new zzwf(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzw) {
            zzek.zzf(zzY());
            long j = this.zzA;
            if (j == -9223372036854775807L || this.zzI <= j) {
                zzaef zzaefVar = this.zzz;
                zzaefVar.getClass();
                zzwf.zzf(zzwfVar, zzaefVar.zzg(this.zzI).zza.zzc, this.zzI);
                for (zzwx zzwxVar : this.zzt) {
                    zzwxVar.zzt(this.zzI);
                }
                this.zzI = -9223372036854775807L;
            } else {
                this.zzL = true;
                this.zzI = -9223372036854775807L;
                return;
            }
        }
        this.zzK = zzQ();
        long zza = this.zzk.zza(zzwfVar, this, zzzs.zza(this.zzC));
        zzhb zzd = zzwf.zzd(zzwfVar);
        this.zzg.zzg(new zzuy(zzwf.zzb(zzwfVar), zzd, zzd.zza, Collections.emptyMap(), zza, 0L, 0L), new zzvd(1, -1, null, 0, null, zzfx.zzu(zzwf.zzc(zzwfVar)), zzfx.zzu(this.zzA)));
    }

    private final boolean zzY() {
        return this.zzI != -9223372036854775807L;
    }

    private final boolean zzZ() {
        return this.zzE || zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final void zzD() {
        this.zzv = true;
        this.zzp.post(this.zzn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzF() {
        this.zzG = true;
    }

    final void zzH() throws IOException {
        this.zzk.zzi(zzzs.zza(this.zzC));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzI(int i) throws IOException {
        this.zzt[i].zzm();
        zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzzt
    public final /* bridge */ /* synthetic */ void zzJ(zzzx zzzxVar, long j, long j2, boolean z) {
        zzwf zzwfVar = (zzwf) zzzxVar;
        zzhx zze = zzwf.zze(zzwfVar);
        zzuy zzuyVar = new zzuy(zzwf.zzb(zzwfVar), zzwf.zzd(zzwfVar), zze.zzh(), zze.zzi(), j, j2, zze.zzg());
        zzwf.zzb(zzwfVar);
        this.zzg.zzd(zzuyVar, new zzvd(1, -1, null, 0, null, zzfx.zzu(zzwf.zzc(zzwfVar)), zzfx.zzu(this.zzA)));
        if (z) {
            return;
        }
        for (zzwx zzwxVar : this.zzt) {
            zzwxVar.zzp(false);
        }
        if (this.zzF > 0) {
            zzve zzveVar = this.zzr;
            zzveVar.getClass();
            zzveVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzt
    public final /* bridge */ /* synthetic */ void zzK(zzzx zzzxVar, long j, long j2) {
        zzaef zzaefVar;
        if (this.zzA == -9223372036854775807L && (zzaefVar = this.zzz) != null) {
            boolean zzh = zzaefVar.zzh();
            long zzR = zzR(true);
            long j3 = zzR == Long.MIN_VALUE ? 0L : zzR + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzA = j3;
            this.zzi.zza(j3, zzh, this.zzB);
        }
        zzwf zzwfVar = (zzwf) zzzxVar;
        zzhx zze = zzwf.zze(zzwfVar);
        zzuy zzuyVar = new zzuy(zzwf.zzb(zzwfVar), zzwf.zzd(zzwfVar), zze.zzh(), zze.zzi(), j, j2, zze.zzg());
        zzwf.zzb(zzwfVar);
        this.zzg.zze(zzuyVar, new zzvd(1, -1, null, 0, null, zzfx.zzu(zzwf.zzc(zzwfVar)), zzfx.zzu(this.zzA)));
        this.zzL = true;
        zzve zzveVar = this.zzr;
        zzveVar.getClass();
        zzveVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final void zzL() {
        for (zzwx zzwxVar : this.zzt) {
            zzwxVar.zzo();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzww
    public final void zzM(zzam zzamVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzN() {
        if (this.zzw) {
            for (zzwx zzwxVar : this.zzt) {
                zzwxVar.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzM = true;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final void zzO(final zzaef zzaefVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzwd
            @Override // java.lang.Runnable
            public final void run() {
                zzwk.this.zzG(zzaefVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzP(int i) {
        return !zzZ() && this.zzt[i].zzx(this.zzL);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zza(long j, zzmj zzmjVar) {
        zzT();
        if (this.zzz.zzh()) {
            zzaed zzg = this.zzz.zzg(j);
            zzaeg zzaegVar = zzg.zza;
            zzaeg zzaegVar2 = zzg.zzb;
            long j2 = zzmjVar.zzf;
            if (j2 == 0) {
                if (zzmjVar.zzg == 0) {
                    return j;
                }
                j2 = 0;
            }
            long j3 = zzaegVar.zzb;
            int i = zzfx.zza;
            long j4 = j - j2;
            long j5 = zzmjVar.zzg;
            long j6 = j + j5;
            long j7 = j ^ j6;
            long j8 = j5 ^ j6;
            if (((j ^ j2) & (j ^ j4)) < 0) {
                j4 = Long.MIN_VALUE;
            }
            if ((j7 & j8) < 0) {
                j6 = Long.MAX_VALUE;
            }
            boolean z = true;
            boolean z2 = j4 <= j3 && j3 <= j6;
            long j9 = zzaegVar2.zzb;
            z = (j4 > j9 || j9 > j6) ? false : false;
            if (z2 && z) {
                if (Math.abs(j3 - j) > Math.abs(j9 - j)) {
                    return j9;
                }
            } else if (!z2) {
                return z ? j9 : j4;
            }
            return j3;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final long zzb() {
        long j;
        zzT();
        if (this.zzL || this.zzF == 0) {
            return Long.MIN_VALUE;
        }
        if (zzY()) {
            return this.zzI;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzwj zzwjVar = this.zzy;
                if (zzwjVar.zzb[i] && zzwjVar.zzc[i] && !this.zzt[i].zzw()) {
                    j = Math.min(j, this.zzt[i].zzh());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzR(false);
        }
        return j == Long.MIN_VALUE ? this.zzH : j;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzd() {
        if (this.zzE) {
            if (this.zzL || zzQ() > this.zzK) {
                this.zzE = false;
                return this.zzH;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zze(long j) {
        int i;
        boolean zzz;
        zzT();
        boolean[] zArr = this.zzy.zzb;
        if (true != this.zzz.zzh()) {
            j = 0;
        }
        this.zzE = false;
        this.zzH = j;
        if (zzY()) {
            this.zzI = j;
            return j;
        }
        if (this.zzC != 7) {
            int length = this.zzt.length;
            while (i < length) {
                zzwx zzwxVar = this.zzt[i];
                if (this.zzq) {
                    zzz = zzwxVar.zzy(zzwxVar.zza());
                } else {
                    zzz = zzwxVar.zzz(j, false);
                }
                i = (zzz || (!zArr[i] && this.zzx)) ? i + 1 : 0;
            }
            return j;
        }
        this.zzJ = false;
        this.zzI = j;
        this.zzL = false;
        zzaab zzaabVar = this.zzk;
        if (zzaabVar.zzl()) {
            for (zzwx zzwxVar2 : this.zzt) {
                zzwxVar2.zzk();
            }
            this.zzk.zzg();
        } else {
            zzaabVar.zzh();
            for (zzwx zzwxVar3 : this.zzt) {
                zzwxVar3.zzp(false);
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r2 == 0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    @Override // com.google.android.gms.internal.ads.zzvf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzf(com.google.android.gms.internal.ads.zzyz[] r8, boolean[] r9, com.google.android.gms.internal.ads.zzwy[] r10, boolean[] r11, long r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwk.zzf(com.google.android.gms.internal.ads.zzyz[], boolean[], com.google.android.gms.internal.ads.zzwy[], boolean[], long):long");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzg(int i, zzlb zzlbVar, zzih zzihVar, int i2) {
        if (zzZ()) {
            return -3;
        }
        zzV(i);
        int zze = this.zzt[i].zze(zzlbVar, zzihVar, i2, this.zzL);
        if (zze == -3) {
            zzW(i);
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final zzxk zzh() {
        zzT();
        return this.zzy.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzi(int i, long j) {
        if (zzZ()) {
            return 0;
        }
        zzV(i);
        zzwx zzwxVar = this.zzt[i];
        int zzc2 = zzwxVar.zzc(j, this.zzL);
        zzwxVar.zzv(zzc2);
        if (zzc2 == 0) {
            zzW(i);
            return 0;
        }
        return zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzj(long j, boolean z) {
        if (this.zzq) {
            return;
        }
        zzT();
        if (zzY()) {
            return;
        }
        boolean[] zArr = this.zzy.zzc;
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            this.zzt[i].zzj(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzk() throws IOException {
        zzH();
        if (this.zzL && !this.zzw) {
            throw zzcc.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzl(zzve zzveVar, long j) {
        this.zzr = zzveVar;
        this.zzm.zze();
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final boolean zzo(zzlg zzlgVar) {
        if (this.zzL) {
            return false;
        }
        zzaab zzaabVar = this.zzk;
        if (zzaabVar.zzk() || this.zzJ) {
            return false;
        }
        if (this.zzw && this.zzF == 0) {
            return false;
        }
        boolean zze = this.zzm.zze();
        if (zzaabVar.zzl()) {
            return zze;
        }
        zzX();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    @Override // com.google.android.gms.internal.ads.zzzt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzzv zzu(com.google.android.gms.internal.ads.zzzx r22, long r23, long r25, java.io.IOException r27, int r28) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwk.zzu(com.google.android.gms.internal.ads.zzzx, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzzv");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzaem zzv() {
        return zzS(new zzwi(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzaem zzw(int i, int i2) {
        return zzS(new zzwi(i, false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzE() {
        if (this.zzM) {
            return;
        }
        zzve zzveVar = this.zzr;
        zzveVar.getClass();
        zzveVar.zzg(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzG(zzaef zzaefVar) {
        this.zzz = this.zzs == null ? zzaefVar : new zzaee(-9223372036854775807L, 0L);
        if (zzaefVar.zza() == -9223372036854775807L && this.zzA != -9223372036854775807L) {
            this.zzz = new zzwe(this, this.zzz);
        }
        this.zzA = this.zzz.zza();
        boolean z = false;
        if (!this.zzG && zzaefVar.zza() == -9223372036854775807L) {
            z = true;
        }
        this.zzB = z;
        this.zzC = true == z ? 7 : 1;
        this.zzi.zza(this.zzA, zzaefVar.zzh(), this.zzB);
        if (this.zzw) {
            return;
        }
        zzU();
    }
}
