package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzto extends zziq {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private long zzG;
    private int zzH;
    private int zzI;
    private ByteBuffer zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private long zzW;
    private long zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzir zza;
    private boolean zzaa;
    private zztn zzab;
    private long zzac;
    private boolean zzad;
    private zzsn zzae;
    private zzsn zzaf;
    private final zzte zzc;
    private final zztq zzd;
    private final float zze;
    private final zzih zzf;
    private final zzih zzg;
    private final zzih zzh;
    private final zztb zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzry zzl;
    private zzam zzm;
    private zzam zzn;
    private MediaCrypto zzo;
    private long zzp;
    private float zzq;
    private zztf zzr;
    private zzam zzs;
    private MediaFormat zzt;
    private boolean zzu;
    private float zzv;
    private ArrayDeque zzw;
    private zztm zzx;
    private zzti zzy;
    private int zzz;

    public zzto(int i, zzte zzteVar, zztq zztqVar, boolean z, float f) {
        super(i);
        this.zzc = zzteVar;
        zztqVar.getClass();
        this.zzd = zztqVar;
        this.zze = f;
        this.zzf = new zzih(0, 0);
        this.zzg = new zzih(0, 0);
        this.zzh = new zzih(2, 0);
        zztb zztbVar = new zztb();
        this.zzi = zztbVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzq = 1.0f;
        this.zzp = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzab = zztn.zza;
        zztbVar.zzi(0);
        zztbVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzry();
        this.zzv = -1.0f;
        this.zzz = 0;
        this.zzQ = 0;
        this.zzH = -1;
        this.zzI = -1;
        this.zzG = -9223372036854775807L;
        this.zzW = -9223372036854775807L;
        this.zzX = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzR = 0;
        this.zzS = 0;
        this.zza = new zzir();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean zzaL(zzam zzamVar) {
        return zzamVar.zzG == 0;
    }

    private final void zzaM() {
        this.zzH = -1;
        this.zzg.zzc = null;
    }

    private final void zzaN() {
        this.zzI = -1;
        this.zzJ = null;
    }

    private final void zzaO(zztn zztnVar) {
        this.zzab = zztnVar;
        if (zztnVar.zzd != -9223372036854775807L) {
            this.zzad = true;
        }
    }

    private final void zzaP() throws zziz {
        zzsn zzsnVar = this.zzaf;
        zzsnVar.getClass();
        this.zzae = zzsnVar;
        this.zzR = 0;
        this.zzS = 0;
    }

    private final boolean zzaQ() throws zziz {
        if (this.zzT) {
            this.zzR = 1;
            if (this.zzB) {
                this.zzS = 3;
                return false;
            }
            this.zzS = 2;
        } else {
            zzaP();
        }
        return true;
    }

    private final boolean zzaR() throws zziz {
        zztf zztfVar = this.zzr;
        if (zztfVar == null || this.zzR == 2 || this.zzY) {
            return false;
        }
        if (this.zzH < 0) {
            int zza = zztfVar.zza();
            this.zzH = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzc = zztfVar.zzf(zza);
            this.zzg.zzb();
        }
        if (this.zzR == 1) {
            if (!this.zzF) {
                this.zzU = true;
                zztfVar.zzj(this.zzH, 0, 0, 0L, 4);
                zzaM();
            }
            this.zzR = 2;
            return false;
        } else if (this.zzD) {
            this.zzD = false;
            ByteBuffer byteBuffer = this.zzg.zzc;
            byteBuffer.getClass();
            byteBuffer.put(zzb);
            zztfVar.zzj(this.zzH, 0, 38, 0L, 0);
            zzaM();
            this.zzT = true;
            return true;
        } else {
            if (this.zzQ == 1) {
                int i = 0;
                while (true) {
                    zzam zzamVar = this.zzs;
                    zzamVar.getClass();
                    if (i >= zzamVar.zzo.size()) {
                        break;
                    }
                    ByteBuffer byteBuffer2 = this.zzg.zzc;
                    byteBuffer2.getClass();
                    byteBuffer2.put((byte[]) this.zzs.zzo.get(i));
                    i++;
                }
                this.zzQ = 2;
            }
            ByteBuffer byteBuffer3 = this.zzg.zzc;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            zzlb zzcX = zzcX();
            try {
                int zzcV = zzcV(zzcX, this.zzg, 0);
                if (zzcV == -3) {
                    if (zzQ()) {
                        this.zzX = this.zzW;
                    }
                    return false;
                } else if (zzcV == -5) {
                    if (this.zzQ == 2) {
                        this.zzg.zzb();
                        this.zzQ = 1;
                    }
                    zzac(zzcX);
                    return true;
                } else {
                    zzih zzihVar = this.zzg;
                    if (zzihVar.zzf()) {
                        this.zzX = this.zzW;
                        if (this.zzQ == 2) {
                            zzihVar.zzb();
                            this.zzQ = 1;
                        }
                        this.zzY = true;
                        if (!this.zzT) {
                            zzao();
                            return false;
                        }
                        try {
                            if (!this.zzF) {
                                this.zzU = true;
                                zztfVar.zzj(this.zzH, 0, 0, 0L, 4);
                                zzaM();
                            }
                            return false;
                        } catch (MediaCodec.CryptoException e) {
                            throw zzi(e, this.zzm, false, zzfx.zzj(e.getErrorCode()));
                        }
                    } else if (this.zzT || zzihVar.zzg()) {
                        boolean zzk = zzihVar.zzk();
                        if (zzk) {
                            zzihVar.zzb.zzb(position);
                        }
                        long j = this.zzg.zze;
                        if (this.zzaa) {
                            if (!this.zzk.isEmpty()) {
                                zzfu zzfuVar = ((zztn) this.zzk.peekLast()).zze;
                                zzam zzamVar2 = this.zzm;
                                zzamVar2.getClass();
                                zzfuVar.zzd(j, zzamVar2);
                            } else {
                                zzfu zzfuVar2 = this.zzab.zze;
                                zzam zzamVar3 = this.zzm;
                                zzamVar3.getClass();
                                zzfuVar2.zzd(j, zzamVar3);
                            }
                            this.zzaa = false;
                        }
                        long max = Math.max(this.zzW, j);
                        this.zzW = max;
                        if (zzQ() || this.zzg.zzh()) {
                            this.zzX = max;
                        }
                        this.zzg.zzj();
                        zzih zzihVar2 = this.zzg;
                        if (zzihVar2.zze()) {
                            zzaj(zzihVar2);
                        }
                        zzaB(this.zzg);
                        zzat(this.zzg);
                        try {
                            if (zzk) {
                                zztfVar.zzk(this.zzH, 0, this.zzg.zzb, j, 0);
                            } else {
                                int i2 = this.zzH;
                                ByteBuffer byteBuffer4 = this.zzg.zzc;
                                byteBuffer4.getClass();
                                zztfVar.zzj(i2, 0, byteBuffer4.limit(), j, 0);
                            }
                            zzaM();
                            this.zzT = true;
                            this.zzQ = 0;
                            this.zza.zzc++;
                            return true;
                        } catch (MediaCodec.CryptoException e2) {
                            throw zzi(e2, this.zzm, false, zzfx.zzj(e2.getErrorCode()));
                        }
                    } else {
                        zzihVar.zzb();
                        if (this.zzQ == 2) {
                            this.zzQ = 1;
                        }
                        return true;
                    }
                }
            } catch (zzig e3) {
                zzak(e3);
                zzaU(0);
                zzah();
                return true;
            }
        }
    }

    private final boolean zzaS() {
        return this.zzI >= 0;
    }

    private final boolean zzaT(long j, long j2) {
        if (j2 < j) {
            zzam zzamVar = this.zzn;
            return (zzamVar != null && Objects.equals(zzamVar.zzm, "audio/opus") && zzaeb.zzf(j, j2)) ? false : true;
        }
        return false;
    }

    private final boolean zzaU(int i) throws zziz {
        zzih zzihVar = this.zzf;
        zzlb zzcX = zzcX();
        zzihVar.zzb();
        int zzcV = zzcV(zzcX, this.zzf, i | 4);
        if (zzcV == -5) {
            zzac(zzcX);
            return true;
        } else if (zzcV == -4 && this.zzf.zzf()) {
            this.zzY = true;
            zzao();
            return false;
        } else {
            return false;
        }
    }

    private final boolean zzaV(long j) {
        if (this.zzp != -9223372036854775807L) {
            zzh();
            return SystemClock.elapsedRealtime() - j < this.zzp;
        }
        return true;
    }

    private final boolean zzaW(zzam zzamVar) throws zziz {
        if (zzfx.zza >= 23 && this.zzr != null && this.zzS != 3 && zzcU() != 0) {
            float f = this.zzq;
            zzamVar.getClass();
            float zzZ = zzZ(f, zzamVar, zzT());
            float f2 = this.zzv;
            if (f2 != zzZ) {
                if (zzZ == -1.0f) {
                    zzae();
                    return false;
                } else if (f2 != -1.0f || zzZ > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzZ);
                    zztf zztfVar = this.zzr;
                    zztfVar.getClass();
                    zztfVar.zzp(bundle);
                    this.zzv = zzZ;
                }
            }
        }
        return true;
    }

    private final void zzad() {
        this.zzO = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzN = false;
        this.zzM = false;
        this.zzl.zzb();
    }

    private final void zzae() throws zziz {
        if (this.zzT) {
            this.zzR = 1;
            this.zzS = 3;
            return;
        }
        zzaD();
        zzaz();
    }

    private final void zzah() {
        try {
            zztf zztfVar = this.zzr;
            zzek.zzb(zztfVar);
            zztfVar.zzi();
        } finally {
            zzaE();
        }
    }

    private final void zzai(zzti zztiVar, MediaCrypto mediaCrypto) throws Exception {
        zztd zztdVar;
        long j;
        int i;
        long j2;
        zzam zzamVar = this.zzm;
        zzamVar.getClass();
        String str = zztiVar.zza;
        float zzZ = zzfx.zza < 23 ? -1.0f : zzZ(this.zzq, zzamVar, zzT());
        if (zzZ <= this.zze) {
            zzZ = -1.0f;
        }
        zzaC(zzamVar);
        zzh();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zztd zzaf = zzaf(zztiVar, zzamVar, null, zzZ);
        if (zzfx.zza >= 31) {
            zztl.zza(zzaf, zzn());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            this.zzr = this.zzc.zzd(zzaf);
            Trace.endSection();
            zzh();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (zztiVar.zze(zzamVar)) {
                zztdVar = zzaf;
                j = elapsedRealtime;
            } else {
                Object[] objArr = new Object[2];
                StringBuilder sb = new StringBuilder();
                sb.append("id=");
                sb.append(zzamVar.zzb);
                sb.append(", mimeType=");
                sb.append(zzamVar.zzm);
                if (zzamVar.zzl != null) {
                    sb.append(", container=");
                    sb.append(zzamVar.zzl);
                }
                if (zzamVar.zzi != -1) {
                    sb.append(", bitrate=");
                    sb.append(zzamVar.zzi);
                }
                if (zzamVar.zzj != null) {
                    sb.append(", codecs=");
                    sb.append(zzamVar.zzj);
                }
                if (zzamVar.zzp != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int i2 = 0;
                    while (true) {
                        zzae zzaeVar = zzamVar.zzp;
                        zztdVar = zzaf;
                        if (i2 >= zzaeVar.zzb) {
                            break;
                        }
                        UUID uuid = zzaeVar.zza(i2).zza;
                        if (uuid.equals(zzo.zzb)) {
                            linkedHashSet.add("cenc");
                        } else if (uuid.equals(zzo.zzc)) {
                            linkedHashSet.add("clearkey");
                        } else if (uuid.equals(zzo.zze)) {
                            linkedHashSet.add("playready");
                        } else if (uuid.equals(zzo.zzd)) {
                            linkedHashSet.add("widevine");
                        } else if (uuid.equals(zzo.zza)) {
                            linkedHashSet.add("universal");
                        } else {
                            j2 = elapsedRealtime;
                            linkedHashSet.add("unknown (" + uuid.toString() + ")");
                            i2++;
                            zzaf = zztdVar;
                            elapsedRealtime = j2;
                        }
                        j2 = elapsedRealtime;
                        i2++;
                        zzaf = zztdVar;
                        elapsedRealtime = j2;
                    }
                    j = elapsedRealtime;
                    sb.append(", drm=[");
                    zzfwg.zzb(sb, linkedHashSet, ",");
                    sb.append(']');
                } else {
                    zztdVar = zzaf;
                    j = elapsedRealtime;
                }
                if (zzamVar.zzr != -1 && zzamVar.zzs != -1) {
                    sb.append(", res=");
                    sb.append(zzamVar.zzr);
                    sb.append("x");
                    sb.append(zzamVar.zzs);
                }
                zzt zztVar = zzamVar.zzy;
                if (zztVar != null && (zztVar.zze() || zztVar.zzf())) {
                    sb.append(", color=");
                    sb.append(zzamVar.zzy.zzd());
                }
                if (zzamVar.zzt != -1.0f) {
                    sb.append(", fps=");
                    sb.append(zzamVar.zzt);
                }
                if (zzamVar.zzz != -1) {
                    sb.append(", channels=");
                    sb.append(zzamVar.zzz);
                }
                if (zzamVar.zzA != -1) {
                    sb.append(", sample_rate=");
                    sb.append(zzamVar.zzA);
                }
                if (zzamVar.zzd != null) {
                    sb.append(", language=");
                    sb.append(zzamVar.zzd);
                }
                if (zzamVar.zzc != null) {
                    sb.append(", label=");
                    sb.append(zzamVar.zzc);
                }
                if (zzamVar.zze != 0) {
                    sb.append(", selectionFlags=[");
                    int i3 = zzamVar.zze;
                    ArrayList arrayList = new ArrayList();
                    if ((i3 & 1) != 0) {
                        arrayList.add("default");
                    }
                    if ((i3 & 2) != 0) {
                        arrayList.add("forced");
                    }
                    zzfwg.zzb(sb, arrayList, ",");
                    sb.append("]");
                }
                if (zzamVar.zzf != 0) {
                    sb.append(", roleFlags=[");
                    int i4 = zzamVar.zzf;
                    ArrayList arrayList2 = new ArrayList();
                    if ((i4 & 1) != 0) {
                        arrayList2.add("main");
                    }
                    if ((i4 & 2) != 0) {
                        arrayList2.add("alt");
                    }
                    if ((i4 & 4) != 0) {
                        arrayList2.add("supplementary");
                    }
                    if ((i4 & 8) != 0) {
                        arrayList2.add("commentary");
                    }
                    if ((i4 & 16) != 0) {
                        arrayList2.add("dub");
                    }
                    if ((i4 & 32) != 0) {
                        arrayList2.add("emergency");
                    }
                    if ((i4 & 64) != 0) {
                        arrayList2.add("caption");
                    }
                    if ((i4 & 128) != 0) {
                        arrayList2.add("subtitle");
                    }
                    if ((i4 & 256) != 0) {
                        arrayList2.add("sign");
                    }
                    if ((i4 & 512) != 0) {
                        arrayList2.add("describes-video");
                    }
                    if ((i4 & 1024) != 0) {
                        arrayList2.add("describes-music");
                    }
                    if ((i4 & 2048) != 0) {
                        arrayList2.add("enhanced-intelligibility");
                    }
                    if ((i4 & 4096) != 0) {
                        arrayList2.add("transcribes-dialog");
                    }
                    if ((i4 & 8192) != 0) {
                        arrayList2.add("easy-read");
                    }
                    if ((i4 & 16384) != 0) {
                        arrayList2.add("trick-play");
                    }
                    zzfwg.zzb(sb, arrayList2, ",");
                    sb.append("]");
                }
                objArr[0] = sb.toString();
                objArr[1] = str;
                zzfe.zzf("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
            }
            this.zzy = zztiVar;
            this.zzv = zzZ;
            this.zzs = zzamVar;
            if (zzfx.zza <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (zzfx.zzd.startsWith("SM-T585") || zzfx.zzd.startsWith("SM-A510") || zzfx.zzd.startsWith("SM-A520") || zzfx.zzd.startsWith("SM-J700"))) {
                i = 2;
            } else {
                i = (zzfx.zza >= 24 || !(("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(zzfx.zzb) || "flounder_lte".equals(zzfx.zzb) || "grouper".equals(zzfx.zzb) || "tilapia".equals(zzfx.zzb)))) ? 0 : 1;
            }
            this.zzz = i;
            this.zzs.getClass();
            this.zzA = zzfx.zza == 29 && "c2.android.aac.decoder".equals(str);
            this.zzB = zzfx.zza <= 23 && "OMX.google.vorbis.decoder".equals(str);
            this.zzC = zzfx.zza == 21 && "OMX.google.aac.decoder".equals(str);
            String str2 = zztiVar.zza;
            this.zzF = (zzfx.zza <= 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (zzfx.zza <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || ("Amazon".equals(zzfx.zzc) && "AFTS".equals(zzfx.zzd) && zztiVar.zzf);
            this.zzr.getClass();
            if (zzcU() == 2) {
                zzh();
                this.zzG = SystemClock.elapsedRealtime() + 1000;
            }
            this.zza.zza++;
            zzal(str, zztdVar, elapsedRealtime2, elapsedRealtime2 - j);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zziq
    public void zzC() {
        try {
            zzad();
            zzaD();
        } finally {
            this.zzaf = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zziq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzF(com.google.android.gms.internal.ads.zzam[] r16, long r17, long r19, com.google.android.gms.internal.ads.zzvh r21) throws com.google.android.gms.internal.ads.zziz {
        /*
            r15 = this;
            r0 = r15
            com.google.android.gms.internal.ads.zztn r1 = r0.zzab
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L21
            com.google.android.gms.internal.ads.zztn r1 = new com.google.android.gms.internal.ads.zztn
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r17
            r11 = r19
            r6.<init>(r7, r9, r11)
            r15.zzaO(r1)
            return
        L21:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L57
            long r1 = r0.zzW
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L39
            long r5 = r0.zzac
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L57
        L39:
            com.google.android.gms.internal.ads.zztn r1 = new com.google.android.gms.internal.ads.zztn
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r11 = r17
            r13 = r19
            r8.<init>(r9, r11, r13)
            r15.zzaO(r1)
            com.google.android.gms.internal.ads.zztn r1 = r0.zzab
            long r1 = r1.zzd
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L56
            r15.zzap()
        L56:
            return
        L57:
            java.util.ArrayDeque r1 = r0.zzk
            com.google.android.gms.internal.ads.zztn r9 = new com.google.android.gms.internal.ads.zztn
            long r3 = r0.zzW
            r2 = r9
            r5 = r17
            r7 = r19
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzto.zzF(com.google.android.gms.internal.ads.zzam[], long, long, com.google.android.gms.internal.ads.zzvh):void");
    }

    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmf
    public void zzM(float f, float f2) throws zziz {
        this.zzq = f2;
        zzaW(this.zzs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x02e2, code lost:
        if (r15.zzn != null) goto L234;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x039b A[LOOP:2: B:107:0x01dc->B:212:0x039b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03ab A[Catch: IllegalStateException -> 0x03dc, TryCatch #6 {IllegalStateException -> 0x03dc, blocks: (B:209:0x0394, B:214:0x03a5, B:216:0x03ab, B:218:0x03b1, B:205:0x037c, B:207:0x038e, B:225:0x03c2), top: B:267:0x01ce }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x039a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03a2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzmf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzV(long r24, long r26) throws com.google.android.gms.internal.ads.zziz {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzto.zzV(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public boolean zzW() {
        return this.zzZ;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public boolean zzX() {
        if (this.zzm != null) {
            if (zzS() || zzaS()) {
                return true;
            }
            if (this.zzG != -9223372036854775807L) {
                zzh();
                return SystemClock.elapsedRealtime() < this.zzG;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final int zzY(zzam zzamVar) throws zziz {
        try {
            return zzaa(this.zzd, zzamVar);
        } catch (zztw e) {
            throw zzi(e, zzamVar, false, 4002);
        }
    }

    protected float zzZ(float f, zzam zzamVar, zzam[] zzamVarArr) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzaA(long j) {
        this.zzac = j;
        while (!this.zzk.isEmpty() && j >= ((zztn) this.zzk.peek()).zzb) {
            zztn zztnVar = (zztn) this.zzk.poll();
            zztnVar.getClass();
            zzaO(zztnVar);
            zzap();
        }
    }

    protected void zzaB(zzih zzihVar) throws zziz {
    }

    protected void zzaC(zzam zzamVar) throws zziz {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzsn, android.media.MediaCrypto, com.google.android.gms.internal.ads.zztf] */
    public final void zzaD() {
        try {
            zztf zztfVar = this.zzr;
            if (zztfVar != null) {
                zztfVar.zzl();
                this.zza.zzb++;
                zzti zztiVar = this.zzy;
                zztiVar.getClass();
                zzam(zztiVar.zza);
            }
        } finally {
            this.zzr = null;
            this.zzo = null;
            this.zzae = null;
            zzaF();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzaE() {
        zzaM();
        zzaN();
        this.zzG = -9223372036854775807L;
        this.zzU = false;
        this.zzT = false;
        this.zzD = false;
        this.zzE = false;
        this.zzK = false;
        this.zzL = false;
        this.zzW = -9223372036854775807L;
        this.zzX = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzR = 0;
        this.zzS = 0;
        this.zzQ = this.zzP ? 1 : 0;
    }

    protected final void zzaF() {
        zzaE();
        this.zzw = null;
        this.zzy = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = false;
        this.zzV = false;
        this.zzv = -1.0f;
        this.zzz = 0;
        this.zzA = false;
        this.zzB = false;
        this.zzC = false;
        this.zzF = false;
        this.zzP = false;
        this.zzQ = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaG() throws zziz {
        boolean zzaH = zzaH();
        if (zzaH) {
            zzaz();
        }
        return zzaH;
    }

    protected final boolean zzaH() {
        if (this.zzr == null) {
            return false;
        }
        int i = this.zzS;
        if (i != 3 && ((!this.zzA || this.zzV) && (!this.zzB || !this.zzU))) {
            if (i == 2) {
                zzek.zzf(zzfx.zza >= 23);
                if (zzfx.zza >= 23) {
                    try {
                        zzaP();
                    } catch (zziz e) {
                        zzfe.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                        zzaD();
                        return true;
                    }
                }
            }
            zzah();
            return false;
        }
        zzaD();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaI() {
        return this.zzM;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaJ(zzam zzamVar) {
        return this.zzaf == null && zzas(zzamVar);
    }

    protected boolean zzaK(zzti zztiVar) {
        return true;
    }

    protected abstract int zzaa(zztq zztqVar, zzam zzamVar) throws zztw;

    protected zzis zzab(zzti zztiVar, zzam zzamVar, zzam zzamVar2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
        if (zzaQ() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0092, code lost:
        if (zzaQ() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a6, code lost:
        if (zzaQ() == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.zzis zzac(com.google.android.gms.internal.ads.zzlb r12) throws com.google.android.gms.internal.ads.zziz {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzto.zzac(com.google.android.gms.internal.ads.zzlb):com.google.android.gms.internal.ads.zzis");
    }

    protected abstract zztd zzaf(zzti zztiVar, zzam zzamVar, MediaCrypto mediaCrypto, float f);

    protected abstract List zzag(zztq zztqVar, zzam zzamVar, boolean z) throws zztw;

    protected void zzaj(zzih zzihVar) throws zziz {
        throw null;
    }

    protected void zzak(Exception exc) {
        throw null;
    }

    protected void zzal(String str, zztd zztdVar, long j, long j2) {
        throw null;
    }

    protected void zzam(String str) {
        throw null;
    }

    protected void zzan(zzam zzamVar, MediaFormat mediaFormat) throws zziz {
        throw null;
    }

    protected void zzap() {
    }

    protected void zzaq() throws zziz {
    }

    protected abstract boolean zzar(long j, long j2, zztf zztfVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zziz;

    protected boolean zzas(zzam zzamVar) {
        return false;
    }

    protected int zzat(zzih zzihVar) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzau() {
        return this.zzab.zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzav() {
        return this.zzab.zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zztf zzaw() {
        return this.zzr;
    }

    protected zzth zzax(Throwable th, zzti zztiVar) {
        return new zzth(th, zztiVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzti zzay() {
        return this.zzy;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed A[Catch: zztm -> 0x010c, TryCatch #1 {zztm -> 0x010c, blocks: (B:25:0x0053, B:27:0x0057, B:28:0x005c, B:30:0x0061, B:33:0x0066, B:35:0x007c, B:36:0x0087, B:41:0x0094, B:43:0x009c, B:45:0x00a1, B:46:0x00a7, B:48:0x00ab, B:50:0x00b4, B:60:0x00d3, B:62:0x00ed, B:64:0x00f6, B:67:0x00fd, B:68:0x00ff, B:63:0x00f0, B:69:0x0100, B:71:0x0103, B:72:0x010b, B:39:0x008b, B:40:0x0093, B:52:0x00ba, B:57:0x00c3, B:58:0x00d1), top: B:79:0x0053, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0 A[Catch: zztm -> 0x010c, TryCatch #1 {zztm -> 0x010c, blocks: (B:25:0x0053, B:27:0x0057, B:28:0x005c, B:30:0x0061, B:33:0x0066, B:35:0x007c, B:36:0x0087, B:41:0x0094, B:43:0x009c, B:45:0x00a1, B:46:0x00a7, B:48:0x00ab, B:50:0x00b4, B:60:0x00d3, B:62:0x00ed, B:64:0x00f6, B:67:0x00fd, B:68:0x00ff, B:63:0x00f0, B:69:0x0100, B:71:0x0103, B:72:0x010b, B:39:0x008b, B:40:0x0093, B:52:0x00ba, B:57:0x00c3, B:58:0x00d1), top: B:79:0x0053, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzaz() throws com.google.android.gms.internal.ads.zziz {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzto.zzaz():void");
    }

    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmh
    public final int zze() {
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zziq
    public void zzw() {
        this.zzm = null;
        zzaO(zztn.zza);
        this.zzk.clear();
        zzaH();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zziq
    public void zzx(boolean z, boolean z2) throws zziz {
        this.zza = new zzir();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zziq
    public void zzz(long j, boolean z) throws zziz {
        this.zzY = false;
        this.zzZ = false;
        if (this.zzM) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzN = false;
            this.zzl.zzb();
        } else {
            zzaG();
        }
        zzfu zzfuVar = this.zzab.zze;
        if (zzfuVar.zza() > 0) {
            this.zzaa = true;
        }
        zzfuVar.zze();
        this.zzk.clear();
    }

    private final void zzao() throws zziz {
        int i = this.zzS;
        if (i == 1) {
            zzah();
        } else if (i == 2) {
            zzah();
            zzaP();
        } else if (i != 3) {
            this.zzZ = true;
            zzaq();
        } else {
            zzaD();
            zzaz();
        }
    }
}
