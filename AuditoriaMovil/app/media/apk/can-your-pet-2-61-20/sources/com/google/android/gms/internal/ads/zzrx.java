package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.distriqt.extension.applicationrater.controller.ApplicationRaterController;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzrx extends zzto implements zzlh {
    private final Context zzb;
    private final zzqf zzc;
    private final zzqn zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private zzam zzh;
    private zzam zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private zzme zzm;
    private boolean zzn;

    public zzrx(Context context, zzte zzteVar, zztq zztqVar, boolean z, Handler handler, zzqg zzqgVar, zzqn zzqnVar) {
        super(1, zzteVar, zztqVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzqnVar;
        this.zzc = new zzqf(handler, zzqgVar);
        zzqnVar.zzq(new zzrw(this, null));
    }

    private final int zzaM(zzti zztiVar, zzam zzamVar) {
        if (!"OMX.google.raw.decoder".equals(zztiVar.zza) || zzfx.zza >= 24 || (zzfx.zza == 23 && zzfx.zzM(this.zzb))) {
            return zzamVar.zzn;
        }
        return -1;
    }

    private static List zzaN(zztq zztqVar, zzam zzamVar, boolean z, zzqn zzqnVar) throws zztw {
        zzti zzb;
        if (zzamVar.zzm == null) {
            return zzfzn.zzm();
        }
        if (!zzqnVar.zzA(zzamVar) || (zzb = zzuc.zzb()) == null) {
            return zzuc.zzf(zztqVar, zzamVar, false, false);
        }
        return zzfzn.zzn(zzb);
    }

    private final void zzaO() {
        long zzb = this.zzd.zzb(zzW());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzk) {
                zzb = Math.max(this.zzj, zzb);
            }
            this.zzj = zzb;
            this.zzk = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzA() {
        this.zzd.zzk();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq
    public final void zzC() {
        this.zzn = false;
        try {
            super.zzC();
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzl();
            }
        } catch (Throwable th) {
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzl();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzD() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzE() {
        zzaO();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzmf, com.google.android.gms.internal.ads.zzmh
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzmf
    public final boolean zzW() {
        return super.zzW() && this.zzd.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzmf
    public final boolean zzX() {
        return this.zzd.zzy() || super.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final float zzZ(float f, zzam zzamVar, zzam[] zzamVarArr) {
        int i = -1;
        for (zzam zzamVar2 : zzamVarArr) {
            int i2 = zzamVar2.zzA;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final long zza() {
        if (zzcU() == 2) {
            zzaO();
        }
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final int zzaa(zztq zztqVar, zzam zzamVar) throws zztw {
        int i;
        boolean z;
        if (zzcb.zzg(zzamVar.zzm)) {
            int i2 = zzfx.zza;
            int i3 = zzamVar.zzG;
            boolean zzaL = zzaL(zzamVar);
            int i4 = 1;
            if (!zzaL || (i3 != 0 && zzuc.zzb() == null)) {
                i = 0;
            } else {
                zzps zzd = this.zzd.zzd(zzamVar);
                if (zzd.zzb) {
                    i = true != zzd.zzc ? 512 : 1536;
                    if (zzd.zzd) {
                        i |= 2048;
                    }
                } else {
                    i = 0;
                }
                if (this.zzd.zzA(zzamVar)) {
                    return i | 172;
                }
            }
            if ((!"audio/raw".equals(zzamVar.zzm) || this.zzd.zzA(zzamVar)) && this.zzd.zzA(zzfx.zzz(2, zzamVar.zzz, zzamVar.zzA))) {
                List zzaN = zzaN(zztqVar, zzamVar, false, this.zzd);
                if (!zzaN.isEmpty()) {
                    if (zzaL) {
                        zzti zztiVar = (zzti) zzaN.get(0);
                        boolean zze = zztiVar.zze(zzamVar);
                        if (!zze) {
                            for (int i5 = 1; i5 < zzaN.size(); i5++) {
                                zzti zztiVar2 = (zzti) zzaN.get(i5);
                                if (zztiVar2.zze(zzamVar)) {
                                    zztiVar = zztiVar2;
                                    z = false;
                                    zze = true;
                                    break;
                                }
                            }
                        }
                        z = true;
                        int i6 = true != zze ? 3 : 4;
                        int i7 = 8;
                        if (zze && zztiVar.zzf(zzamVar)) {
                            i7 = 16;
                        }
                        return i6 | i7 | 32 | (true != zztiVar.zzg ? 0 : 64) | (true != z ? 0 : 128) | i;
                    }
                    i4 = 2;
                }
            }
            return i4 | 128;
        }
        return 128;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final zzis zzab(zzti zztiVar, zzam zzamVar, zzam zzamVar2) {
        int i;
        int i2;
        zzis zzb = zztiVar.zzb(zzamVar, zzamVar2);
        int i3 = zzb.zze;
        if (zzaJ(zzamVar2)) {
            i3 |= 32768;
        }
        if (zzaM(zztiVar, zzamVar2) > this.zze) {
            i3 |= 64;
        }
        String str = zztiVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzb.zzd;
            i2 = 0;
        }
        return new zzis(str, zzamVar, zzamVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final zztd zzaf(zzti zztiVar, zzam zzamVar, MediaCrypto mediaCrypto, float f) {
        zzam[] zzT = zzT();
        int length = zzT.length;
        int zzaM = zzaM(zztiVar, zzamVar);
        if (length != 1) {
            for (zzam zzamVar2 : zzT) {
                if (zztiVar.zzb(zzamVar, zzamVar2).zzd != 0) {
                    zzaM = Math.max(zzaM, zzaM(zztiVar, zzamVar2));
                }
            }
        }
        this.zze = zzaM;
        this.zzf = zzfx.zza < 24 && "OMX.SEC.aac.dec".equals(zztiVar.zza) && ApplicationRaterController.STORE_SAMSUNGGALAXY.equals(zzfx.zzc) && (zzfx.zzb.startsWith("zeroflte") || zzfx.zzb.startsWith("herolte") || zzfx.zzb.startsWith("heroqlte"));
        String str = zztiVar.zza;
        this.zzg = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zztiVar.zzc;
        int i = this.zze;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        mediaFormat.setInteger("channel-count", zzamVar.zzz);
        mediaFormat.setInteger("sample-rate", zzamVar.zzA);
        zzfh.zzb(mediaFormat, zzamVar.zzo);
        zzfh.zza(mediaFormat, "max-input-size", i);
        if (zzfx.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (zzfx.zza != 23 || (!"ZTE B2017G".equals(zzfx.zzd) && !"AXON 7 mini".equals(zzfx.zzd)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (zzfx.zza <= 28 && "audio/ac4".equals(zzamVar.zzm)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (zzfx.zza >= 24 && this.zzd.zza(zzfx.zzz(4, zzamVar.zzz, zzamVar.zzA)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (zzfx.zza >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.zzi = (!"audio/raw".equals(zztiVar.zzb) || "audio/raw".equals(zzamVar.zzm)) ? null : zzamVar;
        return zztd.zza(zztiVar, mediaFormat, zzamVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final List zzag(zztq zztqVar, zzam zzamVar, boolean z) throws zztw {
        return zzuc.zzg(zzaN(zztqVar, zzamVar, false, this.zzd), zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzaj(zzih zzihVar) {
        zzam zzamVar;
        if (zzfx.zza < 29 || (zzamVar = zzihVar.zza) == null || !Objects.equals(zzamVar.zzm, "audio/opus") || !zzaI()) {
            return;
        }
        ByteBuffer byteBuffer = zzihVar.zzf;
        byteBuffer.getClass();
        zzam zzamVar2 = zzihVar.zza;
        zzamVar2.getClass();
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzr(zzamVar2.zzC, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzak(Exception exc) {
        zzfe.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzal(String str, zztd zztdVar, long j, long j2) {
        this.zzc.zze(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzam(String str) {
        this.zzc.zzf(str);
    }

    public final void zzao() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzap() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzaq() throws zziz {
        try {
            this.zzd.zzj();
        } catch (zzqm e) {
            throw zzi(e, e.zzc, e.zzb, true != zzaI() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final boolean zzas(zzam zzamVar) {
        zzm();
        return this.zzd.zzA(zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final zzcg zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final void zzg(zzcg zzcgVar) {
        this.zzd.zzs(zzcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final boolean zzj() {
        boolean z = this.zzn;
        this.zzn = false;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmf
    public final zzlh zzk() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzma
    public final void zzt(int i, Object obj) throws zziz {
        if (i == 2) {
            zzqn zzqnVar = this.zzd;
            obj.getClass();
            zzqnVar.zzw(((Float) obj).floatValue());
        } else if (i == 3) {
            zzk zzkVar = (zzk) obj;
            zzqn zzqnVar2 = this.zzd;
            zzkVar.getClass();
            zzqnVar2.zzm(zzkVar);
        } else if (i != 6) {
            switch (i) {
                case 9:
                    zzqn zzqnVar3 = this.zzd;
                    obj.getClass();
                    zzqnVar3.zzv(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    zzqn zzqnVar4 = this.zzd;
                    obj.getClass();
                    zzqnVar4.zzn(((Integer) obj).intValue());
                    return;
                case 11:
                    this.zzm = (zzme) obj;
                    return;
                case 12:
                    if (zzfx.zza >= 23) {
                        zzru.zza(this.zzd, obj);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            zzl zzlVar = (zzl) obj;
            zzqn zzqnVar5 = this.zzd;
            zzlVar.getClass();
            zzqnVar5.zzo(zzlVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq
    public final void zzw() {
        this.zzl = true;
        this.zzh = null;
        try {
            this.zzd.zzf();
            super.zzw();
        } finally {
            this.zzc.zzg(this.zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq
    public final void zzx(boolean z, boolean z2) throws zziz {
        super.zzx(z, z2);
        this.zzc.zzh(this.zza);
        zzm();
        this.zzd.zzt(zzn());
        this.zzd.zzp(zzh());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq
    public final void zzz(long j, boolean z) throws zziz {
        super.zzz(j, z);
        this.zzd.zzf();
        this.zzj = j;
        this.zzn = false;
        this.zzk = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzto
    public final zzis zzac(zzlb zzlbVar) throws zziz {
        zzam zzamVar = zzlbVar.zza;
        zzamVar.getClass();
        this.zzh = zzamVar;
        zzis zzac = super.zzac(zzlbVar);
        this.zzc.zzi(zzamVar, zzac);
        return zzac;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final boolean zzar(long j, long j2, zztf zztfVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zziz {
        byteBuffer.getClass();
        if (this.zzi != null && (i2 & 2) != 0) {
            zztfVar.getClass();
            zztfVar.zzn(i, false);
            return true;
        } else if (z) {
            if (zztfVar != null) {
                zztfVar.zzn(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzg();
            return true;
        } else {
            try {
                if (this.zzd.zzx(byteBuffer, j3, i3)) {
                    if (zztfVar != null) {
                        zztfVar.zzn(i, false);
                    }
                    this.zza.zze += i3;
                    return true;
                }
                return false;
            } catch (zzqj e) {
                zzam zzamVar2 = this.zzh;
                if (zzaI()) {
                    zzm();
                }
                throw zzi(e, zzamVar2, e.zzb, 5001);
            } catch (zzqm e2) {
                if (zzaI()) {
                    zzm();
                }
                throw zzi(e2, zzamVar, e2.zzb, 5002);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzan(zzam zzamVar, MediaFormat mediaFormat) throws zziz {
        int zzl;
        int[] iArr;
        int i;
        zzam zzamVar2 = this.zzi;
        boolean z = true;
        int[] iArr2 = null;
        if (zzamVar2 != null) {
            zzamVar = zzamVar2;
        } else if (zzaw() != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(zzamVar.zzm)) {
                zzl = zzamVar.zzB;
            } else if (zzfx.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                zzl = mediaFormat.containsKey("v-bits-per-sample") ? zzfx.zzl(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                zzl = mediaFormat.getInteger("pcm-encoding");
            }
            zzak zzakVar = new zzak();
            zzakVar.zzW("audio/raw");
            zzakVar.zzQ(zzl);
            zzakVar.zzF(zzamVar.zzC);
            zzakVar.zzG(zzamVar.zzD);
            zzakVar.zzP(zzamVar.zzk);
            zzakVar.zzK(zzamVar.zzb);
            zzakVar.zzM(zzamVar.zzc);
            zzakVar.zzN(zzamVar.zzd);
            zzakVar.zzY(zzamVar.zze);
            zzakVar.zzU(zzamVar.zzf);
            zzakVar.zzy(mediaFormat.getInteger("channel-count"));
            zzakVar.zzX(mediaFormat.getInteger("sample-rate"));
            zzam zzac = zzakVar.zzac();
            if (this.zzf && zzac.zzz == 6 && (i = zzamVar.zzz) < 6) {
                iArr2 = new int[i];
                for (int i2 = 0; i2 < zzamVar.zzz; i2++) {
                    iArr2[i2] = i2;
                }
            } else if (this.zzg) {
                int i3 = zzac.zzz;
                if (i3 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i3 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i3 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i3 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i3 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
                iArr2 = iArr;
            }
            zzamVar = zzac;
        }
        try {
            if (zzfx.zza >= 29) {
                if (zzaI()) {
                    zzm();
                }
                if (zzfx.zza < 29) {
                    z = false;
                }
                zzek.zzf(z);
            }
            this.zzd.zze(zzamVar, 0, iArr2);
        } catch (zzqi e) {
            throw zzi(e, e.zza, false, 5001);
        }
    }
}
