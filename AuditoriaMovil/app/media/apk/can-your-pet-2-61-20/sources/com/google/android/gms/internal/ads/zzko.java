package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.core.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzko extends zzm implements zzjj {
    public static final /* synthetic */ int zzd = 0;
    private final zzmo zzA;
    private final long zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private int zzF;
    private zzmj zzG;
    private zzck zzH;
    private zzbv zzI;
    private zzbv zzJ;
    private zzam zzK;
    private zzam zzL;
    private Object zzM;
    private Surface zzN;
    private int zzO;
    private zzfp zzP;
    private zzir zzQ;
    private zzir zzR;
    private int zzS;
    private zzk zzT;
    private float zzU;
    private boolean zzV;
    private zzee zzW;
    private boolean zzX;
    private boolean zzY;
    private zzaa zzZ;
    private zzdp zzaa;
    private zzbv zzab;
    private zzly zzac;
    private int zzad;
    private long zzae;
    private final zzjk zzaf;
    private zzxb zzag;
    final zzzg zzb;
    final zzck zzc;
    private final zzeo zze;
    private final Context zzf;
    private final zzco zzg;
    private final zzmf[] zzh;
    private final zzzf zzi;
    private final zzev zzj;
    private final zzkz zzk;
    private final zzfb zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcu zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzvg zzq;
    private final zzmp zzr;
    private final Looper zzs;
    private final zzzn zzt;
    private final zzel zzu;
    private final zzkk zzv;
    private final zzkm zzw;
    private final zzil zzx;
    private final zzip zzy;
    private final zzmn zzz;

    static {
        zzbq.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, com.google.android.gms.internal.ads.zzmp, com.google.android.gms.internal.ads.zzzm] */
    public zzko(zzji zzjiVar, zzco zzcoVar) {
        zzpb zza;
        zzeo zzeoVar = new zzeo(zzel.zza);
        this.zze = zzeoVar;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfx.zze;
            zzfe.zze("ExoPlayerImpl", "Init " + hexString + " [AndroidXMedia3/1.3.0] [" + str + "]");
            Context applicationContext = zzjiVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? apply = zzjiVar.zzh.apply(zzjiVar.zzb);
            this.zzr = apply;
            this.zzT = zzjiVar.zzj;
            this.zzO = zzjiVar.zzk;
            this.zzV = false;
            this.zzB = zzjiVar.zzo;
            zzkk zzkkVar = new zzkk(this, null);
            this.zzv = zzkkVar;
            zzkm zzkmVar = new zzkm(null);
            this.zzw = zzkmVar;
            Handler handler = new Handler(zzjiVar.zzi);
            zzmf[] zza2 = ((zzjb) zzjiVar.zzc).zza.zza(handler, zzkkVar, zzkkVar, zzkkVar, zzkkVar);
            this.zzh = zza2;
            int length = zza2.length;
            zzzf zzzfVar = (zzzf) zzjiVar.zze.zza();
            this.zzi = zzzfVar;
            this.zzq = zzji.zza(((zzjc) zzjiVar.zzd).zza);
            zzzr zzg = zzzr.zzg(((zzjf) zzjiVar.zzg).zza);
            this.zzt = zzg;
            this.zzp = zzjiVar.zzl;
            this.zzG = zzjiVar.zzm;
            Looper looper = zzjiVar.zzi;
            this.zzs = looper;
            zzel zzelVar = zzjiVar.zzb;
            this.zzu = zzelVar;
            this.zzg = zzcoVar;
            zzfb zzfbVar = new zzfb(looper, zzelVar, new zzez() { // from class: com.google.android.gms.internal.ads.zzke
                @Override // com.google.android.gms.internal.ads.zzez
                public final void zza(Object obj, zzah zzahVar) {
                    zzcl zzclVar = (zzcl) obj;
                }
            });
            this.zzl = zzfbVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzag = new zzxb(0);
            int length2 = zza2.length;
            zzzg zzzgVar = new zzzg(new zzmi[2], new zzyz[2], zzdk.zza, null);
            this.zzb = zzzgVar;
            this.zzn = new zzcu();
            zzci zzciVar = new zzci();
            zzciVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzzfVar.zzn();
            zzciVar.zzd(29, true);
            zzciVar.zzd(23, false);
            zzciVar.zzd(25, false);
            zzciVar.zzd(33, false);
            zzciVar.zzd(26, false);
            zzciVar.zzd(34, false);
            zzck zze = zzciVar.zze();
            this.zzc = zze;
            zzci zzciVar2 = new zzci();
            zzciVar2.zzb(zze);
            zzciVar2.zza(4);
            zzciVar2.zza(10);
            this.zzH = zzciVar2.zze();
            this.zzj = zzelVar.zzb(looper, null);
            zzjk zzjkVar = new zzjk(this);
            this.zzaf = zzjkVar;
            this.zzac = zzly.zzg(zzzgVar);
            apply.zzR(zzcoVar, looper);
            if (zzfx.zza < 31) {
                zza = new zzpb(zzjiVar.zzr);
            } else {
                zza = zzkf.zza(applicationContext, this, zzjiVar.zzp, zzjiVar.zzr);
            }
            this.zzk = new zzkz(zza2, zzzfVar, zzzgVar, (zzlc) zzjiVar.zzf.zza(), zzg, 0, false, apply, this.zzG, zzjiVar.zzs, zzjiVar.zzn, false, looper, zzelVar, zzjkVar, zza, null);
            this.zzU = 1.0f;
            this.zzI = zzbv.zza;
            zzbv zzbvVar = zzbv.zza;
            this.zzJ = zzbvVar;
            this.zzab = zzbvVar;
            int i = -1;
            this.zzad = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            if (audioManager != null) {
                i = audioManager.generateAudioSessionId();
            }
            this.zzS = i;
            this.zzW = zzee.zza;
            this.zzX = true;
            apply.getClass();
            zzfbVar.zzb(apply);
            zzg.zze(new Handler(looper), apply);
            copyOnWriteArraySet.add(zzkkVar);
            this.zzx = new zzil(zzjiVar.zza, handler, zzkkVar);
            this.zzy = new zzip(zzjiVar.zza, handler, zzkkVar);
            zzfx.zzG(null, null);
            this.zzz = new zzmn(zzjiVar.zza);
            this.zzA = new zzmo(zzjiVar.zza);
            this.zzZ = new zzy(0).zza();
            this.zzaa = zzdp.zza;
            this.zzP = zzfp.zza;
            zzzfVar.zzk(this.zzT);
            zzag(1, 10, Integer.valueOf(this.zzS));
            zzag(2, 10, Integer.valueOf(this.zzS));
            zzag(1, 3, this.zzT);
            zzag(2, 4, Integer.valueOf(this.zzO));
            zzag(2, 5, 0);
            zzag(1, 9, Boolean.valueOf(this.zzV));
            zzag(2, 7, zzkmVar);
            zzag(6, 8, zzkmVar);
            zzeoVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ void zzP(zzko zzkoVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkoVar.zzai(surface);
        zzkoVar.zzN = surface;
    }

    private final int zzW(zzly zzlyVar) {
        return zzlyVar.zza.zzo() ? this.zzad : zzlyVar.zza.zzn(zzlyVar.zzb.zza, this.zzn).zzd;
    }

    public static int zzX(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long zzY(zzly zzlyVar) {
        if (zzlyVar.zzb.zzb()) {
            zzlyVar.zza.zzn(zzlyVar.zzb.zza, this.zzn);
            if (zzlyVar.zzc != -9223372036854775807L) {
                int i = zzfx.zza;
                return zzfx.zzu(zzlyVar.zzc) + zzfx.zzu(0L);
            }
            long j = zzlyVar.zza.zze(zzW(zzlyVar), this.zza, 0L).zzn;
            return zzfx.zzu(0L);
        }
        return zzfx.zzu(zzZ(zzlyVar));
    }

    private final long zzZ(zzly zzlyVar) {
        if (zzlyVar.zza.zzo()) {
            return zzfx.zzr(this.zzae);
        }
        boolean z = zzlyVar.zzo;
        long j = zzlyVar.zzr;
        if (zzlyVar.zzb.zzb()) {
            return j;
        }
        zzab(zzlyVar.zza, zzlyVar.zzb, j);
        return j;
    }

    private static long zzaa(zzly zzlyVar) {
        zzcw zzcwVar = new zzcw();
        zzcu zzcuVar = new zzcu();
        zzlyVar.zza.zzn(zzlyVar.zzb.zza, zzcuVar);
        long j = zzlyVar.zzc;
        if (j == -9223372036854775807L) {
            long j2 = zzlyVar.zza.zze(zzcuVar.zzd, zzcwVar, 0L).zzn;
            return 0L;
        }
        return j;
    }

    private final long zzab(zzcx zzcxVar, zzvh zzvhVar, long j) {
        zzcxVar.zzn(zzvhVar.zza, this.zzn);
        return j;
    }

    private final Pair zzac(zzcx zzcxVar, int i, long j) {
        if (zzcxVar.zzo()) {
            this.zzad = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzae = j;
            return null;
        }
        if (i == -1 || i >= zzcxVar.zzc()) {
            i = zzcxVar.zzg(false);
            long j2 = zzcxVar.zze(i, this.zza, 0L).zzn;
            j = zzfx.zzu(0L);
        }
        return zzcxVar.zzl(this.zza, this.zzn, i, zzfx.zzr(j));
    }

    private final zzly zzad(zzly zzlyVar, zzcx zzcxVar, Pair pair) {
        int i;
        zzek.zzd(zzcxVar.zzo() || pair != null);
        zzcx zzcxVar2 = zzlyVar.zza;
        long zzY = zzY(zzlyVar);
        zzly zzf = zzlyVar.zzf(zzcxVar);
        if (zzcxVar.zzo()) {
            zzvh zzh = zzly.zzh();
            long zzr = zzfx.zzr(this.zzae);
            zzly zza = zzf.zzb(zzh, zzr, zzr, zzr, 0L, zzxk.zza, this.zzb, zzfzn.zzm()).zza(zzh);
            zza.zzp = zza.zzr;
            return zza;
        }
        Object obj = zzf.zzb.zza;
        int i2 = zzfx.zza;
        boolean z = !obj.equals(pair.first);
        zzvh zzvhVar = z ? new zzvh(pair.first, -1L) : zzf.zzb;
        long longValue = ((Long) pair.second).longValue();
        long zzr2 = zzfx.zzr(zzY);
        if (!zzcxVar2.zzo()) {
            zzcxVar2.zzn(obj, this.zzn);
        }
        if (z || longValue < zzr2) {
            zzek.zzf(!zzvhVar.zzb());
            zzly zza2 = zzf.zzb(zzvhVar, longValue, longValue, longValue, 0L, z ? zzxk.zza : zzf.zzh, z ? this.zzb : zzf.zzi, z ? zzfzn.zzm() : zzf.zzj).zza(zzvhVar);
            zza2.zzp = longValue;
            return zza2;
        } else if (i != 0) {
            zzek.zzf(!zzvhVar.zzb());
            long max = Math.max(0L, zzf.zzq - (longValue - zzr2));
            long j = zzf.zzp;
            if (zzf.zzk.equals(zzf.zzb)) {
                j = longValue + max;
            }
            zzly zzb = zzf.zzb(zzvhVar, longValue, longValue, longValue, max, zzf.zzh, zzf.zzi, zzf.zzj);
            zzb.zzp = j;
            return zzb;
        } else {
            int zza3 = zzcxVar.zza(zzf.zzk.zza);
            if (zza3 == -1 || zzcxVar.zzd(zza3, this.zzn, false).zzd != zzcxVar.zzn(zzvhVar.zza, this.zzn).zzd) {
                zzcxVar.zzn(zzvhVar.zza, this.zzn);
                long zzh2 = zzvhVar.zzb() ? this.zzn.zzh(zzvhVar.zzb, zzvhVar.zzc) : this.zzn.zze;
                zzly zza4 = zzf.zzb(zzvhVar, zzf.zzr, zzf.zzr, zzf.zzd, zzh2 - zzf.zzr, zzf.zzh, zzf.zzi, zzf.zzj).zza(zzvhVar);
                zza4.zzp = zzh2;
                return zza4;
            }
            return zzf;
        }
    }

    private final zzmb zzae(zzma zzmaVar) {
        int zzW = zzW(this.zzac);
        zzcx zzcxVar = this.zzac.zza;
        int i = zzW == -1 ? 0 : zzW;
        zzel zzelVar = this.zzu;
        zzkz zzkzVar = this.zzk;
        return new zzmb(zzkzVar, zzmaVar, zzcxVar, i, zzelVar, zzkzVar.zzb());
    }

    public final void zzaf(final int i, final int i2) {
        if (i == this.zzP.zzb() && i2 == this.zzP.zza()) {
            return;
        }
        this.zzP = new zzfp(i, i2);
        zzfb zzfbVar = this.zzl;
        zzfbVar.zzd(24, new zzey() { // from class: com.google.android.gms.internal.ads.zzkb
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                int i3 = zzko.zzd;
                ((zzcl) obj).zzo(i, i2);
            }
        });
        zzfbVar.zzc();
        zzag(2, 14, new zzfp(i, i2));
    }

    private final void zzag(int i, int i2, Object obj) {
        zzmf[] zzmfVarArr = this.zzh;
        int length = zzmfVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzmf zzmfVar = zzmfVarArr[i3];
            if (zzmfVar.zzb() == i) {
                zzmb zzae = zzae(zzmfVar);
                zzae.zzf(i2);
                zzae.zze(obj);
                zzae.zzd();
            }
        }
    }

    public final void zzah() {
        zzag(1, 2, Float.valueOf(this.zzU * this.zzy.zza()));
    }

    public final void zzai(Object obj) {
        ArrayList<zzmb> arrayList = new ArrayList();
        zzmf[] zzmfVarArr = this.zzh;
        int length = zzmfVarArr.length;
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            zzmf zzmfVar = zzmfVarArr[i];
            if (zzmfVar.zzb() == 2) {
                zzmb zzae = zzae(zzmfVar);
                zzae.zzf(1);
                zzae.zze(obj);
                zzae.zzd();
                arrayList.add(zzae);
            }
        }
        Object obj2 = this.zzM;
        if (obj2 != null && obj2 != obj) {
            try {
                for (zzmb zzmbVar : arrayList) {
                    zzmbVar.zzi(this.zzB);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.zzM;
            Surface surface = this.zzN;
            if (obj3 == surface) {
                surface.release();
                this.zzN = null;
            }
        }
        this.zzM = obj;
        if (z) {
            zzaj(zziz.zzd(new zzla(3), PointerIconCompat.TYPE_HELP));
        }
    }

    private final void zzaj(zziz zzizVar) {
        zzly zzlyVar = this.zzac;
        zzly zza = zzlyVar.zza(zzlyVar.zzb);
        zza.zzp = zza.zzr;
        zza.zzq = 0L;
        zzly zze = zza.zze(1);
        if (zzizVar != null) {
            zze = zze.zzd(zzizVar);
        }
        this.zzC++;
        this.zzk.zzo();
        zzal(zze, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void zzak(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzly zzlyVar = this.zzac;
        if (zzlyVar.zzl == z2 && zzlyVar.zzm == i3) {
            return;
        }
        this.zzC++;
        boolean z3 = zzlyVar.zzo;
        zzly zzc = zzlyVar.zzc(z2, i3);
        this.zzk.zzn(z2, i3);
        zzal(zzc, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:254:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0481 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x048c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x049d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x04c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x04ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x04e4  */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzal(final com.google.android.gms.internal.ads.zzly r44, final int r45, final int r46, boolean r47, int r48, long r49, int r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzko.zzal(com.google.android.gms.internal.ads.zzly, int, int, boolean, int, long, int, boolean):void");
    }

    private final void zzam() {
        int zzf = zzf();
        if (zzf == 2 || zzf == 3) {
            zzan();
            boolean z = this.zzac.zzo;
            zzv();
            zzv();
        }
    }

    private final void zzan() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (this.zzX) {
                throw new IllegalStateException(format);
            }
            zzfe.zzg("ExoPlayerImpl", format, this.zzY ? null : new IllegalStateException());
            this.zzY = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzA(zzms zzmsVar) {
        zzan();
        this.zzr.zzQ(zzmsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzB(zzvj zzvjVar) {
        zzan();
        List singletonList = Collections.singletonList(zzvjVar);
        zzan();
        zzan();
        zzW(this.zzac);
        zzk();
        this.zzC++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzag = this.zzag.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzlv zzlvVar = new zzlv((zzvj) singletonList.get(i2), this.zzp);
            arrayList.add(zzlvVar);
            this.zzo.add(i2, new zzkn(zzlvVar.zzb, zzlvVar.zza));
        }
        this.zzag = this.zzag.zzg(0, arrayList.size());
        zzmd zzmdVar = new zzmd(this.zzo, this.zzag);
        if (zzmdVar.zzo() || zzmdVar.zzc() >= 0) {
            int zzg = zzmdVar.zzg(false);
            zzly zzad = zzad(this.zzac, zzmdVar, zzac(zzmdVar, zzg, -9223372036854775807L));
            int i3 = zzad.zze;
            if (zzg != -1 && i3 != 1) {
                i3 = 4;
                if (!zzmdVar.zzo() && zzg < zzmdVar.zzc()) {
                    i3 = 2;
                }
            }
            zzly zze = zzad.zze(i3);
            this.zzk.zzq(arrayList, zzg, zzfx.zzr(-9223372036854775807L), this.zzag);
            zzal(zze, 0, 1, (this.zzac.zzb.zza.equals(zze.zzb.zza) || this.zzac.zza.zzo()) ? false : true, 4, zzZ(zze), -1, false);
            return;
        }
        throw new zzan(zzmdVar, -1, -9223372036854775807L);
    }

    public final zziz zzE() {
        zzan();
        return this.zzac.zzf;
    }

    public final /* synthetic */ void zzS(zzkx zzkxVar) {
        long j;
        boolean z;
        int i = this.zzC - zzkxVar.zzb;
        this.zzC = i;
        boolean z2 = true;
        if (zzkxVar.zzc) {
            this.zzD = zzkxVar.zzd;
            this.zzE = true;
        }
        if (zzkxVar.zze) {
            this.zzF = zzkxVar.zzf;
        }
        if (i == 0) {
            zzcx zzcxVar = zzkxVar.zza.zza;
            if (!this.zzac.zza.zzo() && zzcxVar.zzo()) {
                this.zzad = -1;
                this.zzae = 0L;
            }
            if (!zzcxVar.zzo()) {
                List zzw = ((zzmd) zzcxVar).zzw();
                zzek.zzf(zzw.size() == this.zzo.size());
                for (int i2 = 0; i2 < zzw.size(); i2++) {
                    ((zzkn) this.zzo.get(i2)).zzc((zzcx) zzw.get(i2));
                }
            }
            if (this.zzE) {
                if (zzkxVar.zza.zzb.equals(this.zzac.zzb) && zzkxVar.zza.zzd == this.zzac.zzr) {
                    z2 = false;
                }
                if (!z2) {
                    j = -9223372036854775807L;
                } else if (zzcxVar.zzo() || zzkxVar.zza.zzb.zzb()) {
                    j = zzkxVar.zza.zzd;
                } else {
                    zzly zzlyVar = zzkxVar.zza;
                    zzvh zzvhVar = zzlyVar.zzb;
                    j = zzlyVar.zzd;
                    zzab(zzcxVar, zzvhVar, j);
                }
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzE = false;
            zzal(zzkxVar.zza, 1, this.zzF, z, this.zzD, j, -1, false);
        }
    }

    public final /* synthetic */ void zzT(final zzkx zzkxVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkd
            @Override // java.lang.Runnable
            public final void run() {
                zzko.this.zzS(zzkxVar);
            }
        });
    }

    public final /* synthetic */ void zzU(zzcl zzclVar) {
        zzclVar.zza(this.zzH);
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i, long j, int i2, boolean z) {
        zzan();
        zzek.zzd(i >= 0);
        this.zzr.zzu();
        zzcx zzcxVar = this.zzac.zza;
        if (zzcxVar.zzo() || i < zzcxVar.zzc()) {
            this.zzC++;
            if (zzx()) {
                zzfe.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzkx zzkxVar = new zzkx(this.zzac);
                zzkxVar.zza(1);
                this.zzaf.zza.zzT(zzkxVar);
                return;
            }
            zzly zzlyVar = this.zzac;
            int i3 = zzlyVar.zze;
            if (i3 == 3 || (i3 == 4 && !zzcxVar.zzo())) {
                zzlyVar = this.zzac.zze(2);
            }
            int zzd2 = zzd();
            zzly zzad = zzad(zzlyVar, zzcxVar, zzac(zzcxVar, i, j));
            this.zzk.zzl(zzcxVar, i, zzfx.zzr(j));
            zzal(zzad, 0, 1, true, 1, zzZ(zzad), zzd2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzb() {
        zzan();
        if (zzx()) {
            return this.zzac.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzc() {
        zzan();
        if (zzx()) {
            return this.zzac.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzd() {
        zzan();
        int zzW = zzW(this.zzac);
        if (zzW == -1) {
            return 0;
        }
        return zzW;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zze() {
        zzan();
        if (this.zzac.zza.zzo()) {
            return 0;
        }
        zzly zzlyVar = this.zzac;
        return zzlyVar.zza.zza(zzlyVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzf() {
        zzan();
        return this.zzac.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzg() {
        zzan();
        return this.zzac.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzh() {
        zzan();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzi() {
        zzan();
        if (!zzx()) {
            zzan();
            if (this.zzac.zza.zzo()) {
                return this.zzae;
            }
            zzly zzlyVar = this.zzac;
            long j = 0;
            if (zzlyVar.zzk.zzd != zzlyVar.zzb.zzd) {
                return zzfx.zzu(zzlyVar.zza.zze(zzd(), this.zza, 0L).zzo);
            }
            long j2 = zzlyVar.zzp;
            if (this.zzac.zzk.zzb()) {
                zzly zzlyVar2 = this.zzac;
                zzlyVar2.zza.zzn(zzlyVar2.zzk.zza, this.zzn).zzi(this.zzac.zzk.zzb);
            } else {
                j = j2;
            }
            zzly zzlyVar3 = this.zzac;
            zzab(zzlyVar3.zza, zzlyVar3.zzk, j);
            return zzfx.zzu(j);
        }
        zzly zzlyVar4 = this.zzac;
        if (zzlyVar4.zzk.equals(zzlyVar4.zzb)) {
            return zzfx.zzu(this.zzac.zzp);
        }
        return zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzj() {
        zzan();
        return zzY(this.zzac);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzk() {
        zzan();
        return zzfx.zzu(zzZ(this.zzac));
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzl() {
        zzan();
        if (!zzx()) {
            zzcx zzn = zzn();
            if (zzn.zzo()) {
                return -9223372036854775807L;
            }
            return zzfx.zzu(zzn.zze(zzd(), this.zza, 0L).zzo);
        }
        zzly zzlyVar = this.zzac;
        zzvh zzvhVar = zzlyVar.zzb;
        zzlyVar.zza.zzn(zzvhVar.zza, this.zzn);
        return zzfx.zzu(this.zzn.zzh(zzvhVar.zzb, zzvhVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzm() {
        zzan();
        return zzfx.zzu(this.zzac.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcx zzn() {
        zzan();
        return this.zzac.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzdk zzo() {
        zzan();
        return this.zzac.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzp() {
        zzan();
        zzip zzipVar = this.zzy;
        boolean zzv = zzv();
        int zzb = zzipVar.zzb(zzv, 2);
        zzak(zzv, zzb, zzX(zzv, zzb));
        zzly zzlyVar = this.zzac;
        if (zzlyVar.zze != 1) {
            return;
        }
        zzly zzd2 = zzlyVar.zzd(null);
        zzly zze = zzd2.zze(true == zzd2.zza.zzo() ? 4 : 2);
        this.zzC++;
        this.zzk.zzk();
        zzal(zze, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzq() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfx.zze;
        String zza = zzbq.zza();
        zzfe.zze("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.3.0] [" + str + "] [" + zza + "]");
        zzan();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzfb zzfbVar = this.zzl;
            zzfbVar.zzd(10, new zzey() { // from class: com.google.android.gms.internal.ads.zzkc
                @Override // com.google.android.gms.internal.ads.zzey
                public final void zza(Object obj) {
                    ((zzcl) obj).zzj(zziz.zzd(new zzla(1), PointerIconCompat.TYPE_HELP));
                }
            });
            zzfbVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzt.zzf(this.zzr);
        boolean z = this.zzac.zzo;
        zzly zze = this.zzac.zze(1);
        this.zzac = zze;
        zzly zza2 = zze.zza(zze.zzb);
        this.zzac = zza2;
        zza2.zzp = zza2.zzr;
        this.zzac.zzq = 0L;
        this.zzr.zzP();
        this.zzi.zzj();
        Surface surface = this.zzN;
        if (surface != null) {
            surface.release();
            this.zzN = null;
        }
        this.zzW = zzee.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzr(boolean z) {
        zzan();
        int zzb = this.zzy.zzb(z, zzf());
        zzak(z, zzb, zzX(z, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzs(Surface surface) {
        zzan();
        zzai(surface);
        int i = surface == null ? 0 : -1;
        zzaf(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzt(float f) {
        zzan();
        final float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzU == max) {
            return;
        }
        this.zzU = max;
        zzah();
        zzfb zzfbVar = this.zzl;
        zzfbVar.zzd(22, new zzey() { // from class: com.google.android.gms.internal.ads.zzjs
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                int i = zzko.zzd;
                ((zzcl) obj).zzs(max);
            }
        });
        zzfbVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzu() {
        zzan();
        this.zzy.zzb(zzv(), 1);
        zzaj(null);
        this.zzW = new zzee(zzfzn.zzm(), this.zzac.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzv() {
        zzan();
        return this.zzac.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzw() {
        zzan();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzx() {
        zzan();
        return this.zzac.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final int zzy() {
        zzan();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzz(zzms zzmsVar) {
        this.zzr.zzt(zzmsVar);
    }
}
