package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcef extends zzcct implements TextureView.SurfaceTextureListener, zzcdd {
    private final zzcdn zzc;
    private final zzcdo zzd;
    private final zzcdm zze;
    private zzccs zzf;
    private Surface zzg;
    private zzcde zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzcdl zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcef(Context context, zzcdo zzcdoVar, zzcdn zzcdnVar, boolean z, boolean z2, zzcdm zzcdmVar) {
        super(context);
        this.zzl = 1;
        this.zzc = zzcdnVar;
        this.zzd = zzcdoVar;
        this.zzn = z;
        this.zze = zzcdmVar;
        setSurfaceTextureListener(this);
        zzcdoVar.zza(this);
    }

    private static String zzT(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    private final void zzU() {
        zzcde zzcdeVar = this.zzh;
        if (zzcdeVar != null) {
            zzcdeVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (this.zzo) {
            return;
        }
        this.zzo = true;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcee
            @Override // java.lang.Runnable
            public final void run() {
                zzcef.this.zzI();
            }
        });
        zzn();
        this.zzd.zzb();
        if (this.zzp) {
            zzp();
        }
    }

    private final void zzW(boolean z, Integer num) {
        zzcde zzcdeVar = this.zzh;
        if (zzcdeVar == null || z) {
            if (this.zzi == null || this.zzg == null) {
                return;
            }
            if (z) {
                if (zzad()) {
                    zzcdeVar.zzU();
                    zzY();
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.zzi.startsWith("cache:")) {
                zzcey zzp = this.zzc.zzp(this.zzi);
                if (zzp instanceof zzcfh) {
                    zzcde zza = ((zzcfh) zzp).zza();
                    this.zzh = zza;
                    zza.zzP(num);
                    if (!this.zzh.zzV()) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Precached video player has been released.");
                        return;
                    }
                } else if (zzp instanceof zzcfe) {
                    zzcfe zzcfeVar = (zzcfe) zzp;
                    String zzF = zzF();
                    ByteBuffer zzk = zzcfeVar.zzk();
                    boolean zzl = zzcfeVar.zzl();
                    String zzi = zzcfeVar.zzi();
                    if (zzi == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Stream cache URL is null.");
                        return;
                    }
                    zzcde zzE = zzE(num);
                    this.zzh = zzE;
                    zzE.zzG(new Uri[]{Uri.parse(zzi)}, zzF, zzk, zzl);
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Stream cache miss: ".concat(String.valueOf(this.zzi)));
                    return;
                }
            } else {
                this.zzh = zzE(num);
                String zzF2 = zzF();
                Uri[] uriArr = new Uri[this.zzj.length];
                int i = 0;
                while (true) {
                    String[] strArr = this.zzj;
                    if (i >= strArr.length) {
                        break;
                    }
                    uriArr[i] = Uri.parse(strArr[i]);
                    i++;
                }
                this.zzh.zzF(uriArr, zzF2);
            }
            this.zzh.zzL(this);
            zzZ(this.zzg, false);
            if (this.zzh.zzV()) {
                int zzt = this.zzh.zzt();
                this.zzl = zzt;
                if (zzt == 3) {
                    zzV();
                    return;
                }
                return;
            }
            return;
        }
        zzcdeVar.zzP(num);
    }

    private final void zzX() {
        zzcde zzcdeVar = this.zzh;
        if (zzcdeVar != null) {
            zzcdeVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ(null, true);
            zzcde zzcdeVar = this.zzh;
            if (zzcdeVar != null) {
                zzcdeVar.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean z) {
        zzcde zzcdeVar = this.zzh;
        if (zzcdeVar != null) {
            try {
                zzcdeVar.zzS(surface, z);
                return;
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to set surface before player is initialized.");
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.zzs != f) {
            this.zzs = f;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        zzcde zzcdeVar = this.zzh;
        return (zzcdeVar == null || !zzcdeVar.zzV() || this.zzk) ? false : true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzs;
        if (f != 0.0f && this.zzm == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcdl zzcdlVar = this.zzm;
        if (zzcdlVar != null) {
            zzcdlVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzn) {
            zzcdl zzcdlVar = new zzcdl(getContext());
            this.zzm = zzcdlVar;
            zzcdlVar.zzd(surfaceTexture, i, i2);
            this.zzm.start();
            SurfaceTexture zzb = this.zzm.zzb();
            if (zzb != null) {
                surfaceTexture = zzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzW(false, null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzq == 0 || this.zzr == 0) {
            zzab(i, i2);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceb
            @Override // java.lang.Runnable
            public final void run() {
                zzcef.this.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcdl zzcdlVar = this.zzm;
        if (zzcdlVar != null) {
            zzcdlVar.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzX();
            Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ(null, true);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdx
            @Override // java.lang.Runnable
            public final void run() {
                zzcef.this.zzN();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzcdl zzcdlVar = this.zzm;
        if (zzcdlVar != null) {
            zzcdlVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdw
            @Override // java.lang.Runnable
            public final void run() {
                zzcef.this.zzO(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdv
            @Override // java.lang.Runnable
            public final void run() {
                zzcef.this.zzQ(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzA(int i) {
        zzcde zzcdeVar = this.zzh;
        if (zzcdeVar != null) {
            zzcdeVar.zzN(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzB(int i) {
        zzcde zzcdeVar = this.zzh;
        if (zzcdeVar != null) {
            zzcdeVar.zzR(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzD(int i, int i2) {
        this.zzq = i;
        this.zzr = i2;
        zzaa();
    }

    final zzcde zzE(Integer num) {
        zzcdm zzcdmVar = this.zze;
        zzcdn zzcdnVar = this.zzc;
        zzcfz zzcfzVar = new zzcfz(zzcdnVar.getContext(), zzcdmVar, zzcdnVar, num);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("ExoPlayerAdapter initialized.");
        return zzcfzVar;
    }

    final String zzF() {
        zzcdn zzcdnVar = this.zzc;
        return com.google.android.gms.ads.internal.zzu.zzp().zzc(zzcdnVar.getContext(), zzcdnVar.zzn().afmaVersion);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzG(String str) {
        zzccs zzccsVar = this.zzf;
        if (zzccsVar != null) {
            zzccsVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzH() {
        zzccs zzccsVar = this.zzf;
        if (zzccsVar != null) {
            zzccsVar.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzI() {
        zzccs zzccsVar = this.zzf;
        if (zzccsVar != null) {
            zzccsVar.zzf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzJ(boolean z, long j) {
        this.zzc.zzv(z, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzK(String str) {
        zzccs zzccsVar = this.zzf;
        if (zzccsVar != null) {
            zzccsVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzL() {
        zzccs zzccsVar = this.zzf;
        if (zzccsVar != null) {
            zzccsVar.zzg();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzM() {
        zzccs zzccsVar = this.zzf;
        if (zzccsVar != null) {
            zzccsVar.zzh();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzN() {
        zzccs zzccsVar = this.zzf;
        if (zzccsVar != null) {
            zzccsVar.zzi();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzO(int i, int i2) {
        zzccs zzccsVar = this.zzf;
        if (zzccsVar != null) {
            zzccsVar.zzj(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzP() {
        float zza = this.zzb.zza();
        zzcde zzcdeVar = this.zzh;
        if (zzcdeVar != null) {
            try {
                zzcdeVar.zzT(zza, false);
                return;
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to set volume before player is initialized.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzQ(int i) {
        zzccs zzccsVar = this.zzf;
        if (zzccsVar != null) {
            zzccsVar.onWindowVisibilityChanged(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzR() {
        zzccs zzccsVar = this.zzf;
        if (zzccsVar != null) {
            zzccsVar.zzd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzS() {
        zzccs zzccsVar = this.zzf;
        if (zzccsVar != null) {
            zzccsVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final int zzb() {
        zzcde zzcdeVar = this.zzh;
        if (zzcdeVar != null) {
            return zzcdeVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final int zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final int zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final long zzf() {
        zzcde zzcdeVar = this.zzh;
        if (zzcdeVar != null) {
            return zzcdeVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final long zzg() {
        zzcde zzcdeVar = this.zzh;
        if (zzcdeVar != null) {
            return zzcdeVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final long zzh() {
        zzcde zzcdeVar = this.zzh;
        if (zzcdeVar != null) {
            return zzcdeVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzi(final boolean z, final long j) {
        if (this.zzc != null) {
            zzcbr.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdy
                @Override // java.lang.Runnable
                public final void run() {
                    zzcef.this.zzJ(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzn ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzk(String str, Exception exc) {
        final String zzT = zzT(str, exc);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("ExoPlayerAdapter error: ".concat(zzT));
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcec
            @Override // java.lang.Runnable
            public final void run() {
                zzcef.this.zzG(zzT);
            }
        });
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzl(String str, Exception exc) {
        final String zzT = zzT("onLoadException", exc);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("ExoPlayerAdapter exception: ".concat(zzT));
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdz
            @Override // java.lang.Runnable
            public final void run() {
                zzcef.this.zzK(zzT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzm(int i) {
        if (this.zzl != i) {
            this.zzl = i;
            if (i == 3) {
                zzV();
            } else if (i != 4) {
            } else {
                if (this.zze.zza) {
                    zzX();
                }
                this.zzd.zze();
                this.zzb.zzc();
                com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzced
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcef.this.zzH();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct, com.google.android.gms.internal.ads.zzcdq
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdu
            @Override // java.lang.Runnable
            public final void run() {
                zzcef.this.zzP();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcea
                @Override // java.lang.Runnable
                public final void run() {
                    zzcef.this.zzR();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzp() {
        if (!zzac()) {
            this.zzp = true;
            return;
        }
        if (this.zze.zza) {
            zzU();
        }
        this.zzh.zzO(true);
        this.zzd.zzc();
        this.zzb.zzb();
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdt
            @Override // java.lang.Runnable
            public final void run() {
                zzcef.this.zzS();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzq(int i) {
        if (zzac()) {
            this.zzh.zzI(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzr(zzccs zzccsVar) {
        this.zzf = zzccsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzs(String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzu(float f, float f2) {
        zzcdl zzcdlVar = this.zzm;
        if (zzcdlVar != null) {
            zzcdlVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcds
            @Override // java.lang.Runnable
            public final void run() {
                zzcef.this.zzL();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final Integer zzw() {
        zzcde zzcdeVar = this.zzh;
        if (zzcdeVar != null) {
            return zzcdeVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzx(int i) {
        zzcde zzcdeVar = this.zzh;
        if (zzcdeVar != null) {
            zzcdeVar.zzJ(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzy(int i) {
        zzcde zzcdeVar = this.zzh;
        if (zzcdeVar != null) {
            zzcdeVar.zzK(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzz(int i) {
        zzcde zzcdeVar = this.zzh;
        if (zzcdeVar != null) {
            zzcdeVar.zzM(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzC(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr != null) {
            this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
        } else {
            this.zzj = new String[]{str};
        }
        String str2 = this.zzi;
        boolean z = false;
        if (this.zze.zzl && str2 != null && !str.equals(str2) && this.zzl == 4) {
            z = true;
        }
        this.zzi = str;
        zzW(z, num);
    }
}
