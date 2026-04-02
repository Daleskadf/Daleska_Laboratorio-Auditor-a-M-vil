package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaik implements zzadf {
    @Deprecated
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzaig
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzaik.zza;
            return new zzadf[]{new zzaik(zzalf.zza, 2)};
        }
    };
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private zzaij zzC;
    private boolean zzD;
    private int zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private long zzJ;
    private zzff zzK;
    private zzff zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private long zzP;
    private long zzQ;
    private int zzR;
    private int zzS;
    private int[] zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private long zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private int zzag;
    private byte zzah;
    private boolean zzai;
    private zzadi zzaj;
    private final zzaif zzh;
    private final zzaim zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzalf zzl;
    private final zzfo zzm;
    private final zzfo zzn;
    private final zzfo zzo;
    private final zzfo zzp;
    private final zzfo zzq;
    private final zzfo zzr;
    private final zzfo zzs;
    private final zzfo zzt;
    private final zzfo zzu;
    private final zzfo zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i = zzfx.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(zzfwd.zzc);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public zzaik() {
        this(new zzaid(), 2, zzalf.zza);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzo(zzadg zzadgVar, zzaij zzaijVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzaijVar.zzb)) {
            zzw(zzadgVar, zzb, i);
            int i3 = this.zzab;
            zzv();
            return i3;
        } else if ("S_TEXT/ASS".equals(zzaijVar.zzb)) {
            zzw(zzadgVar, zzd, i);
            int i4 = this.zzab;
            zzv();
            return i4;
        } else if ("S_TEXT/WEBVTT".equals(zzaijVar.zzb)) {
            zzw(zzadgVar, zze, i);
            int i5 = this.zzab;
            zzv();
            return i5;
        } else {
            zzaem zzaemVar = zzaijVar.zzW;
            if (!this.zzad) {
                if (zzaijVar.zzg) {
                    this.zzW &= -1073741825;
                    if (!this.zzae) {
                        ((zzact) zzadgVar).zzn(this.zzo.zzM(), 0, 1, false);
                        this.zzaa++;
                        if ((this.zzo.zzM()[0] & 128) == 128) {
                            throw zzcc.zza("Extension bit is set in signal byte", null);
                        }
                        this.zzah = this.zzo.zzM()[0];
                        this.zzae = true;
                    }
                    byte b = this.zzah;
                    if ((b & 1) == 1) {
                        int i6 = b & 2;
                        this.zzW |= 1073741824;
                        if (!this.zzai) {
                            ((zzact) zzadgVar).zzn(this.zzt.zzM(), 0, 8, false);
                            this.zzaa += 8;
                            this.zzai = true;
                            this.zzo.zzM()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                            this.zzo.zzK(0);
                            zzaemVar.zzr(this.zzo, 1, 1);
                            this.zzab++;
                            this.zzt.zzK(0);
                            zzaemVar.zzr(this.zzt, 8, 1);
                            this.zzab += 8;
                        }
                        if (i6 == 2) {
                            if (!this.zzaf) {
                                ((zzact) zzadgVar).zzn(this.zzo.zzM(), 0, 1, false);
                                this.zzaa++;
                                this.zzo.zzK(0);
                                this.zzag = this.zzo.zzm();
                                this.zzaf = true;
                            }
                            int i7 = this.zzag * 4;
                            this.zzo.zzH(i7);
                            ((zzact) zzadgVar).zzn(this.zzo.zzM(), 0, i7, false);
                            this.zzaa += i7;
                            int i8 = (this.zzag >> 1) + 1;
                            int i9 = (i8 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzw;
                            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                                this.zzw = ByteBuffer.allocate(i9);
                            }
                            this.zzw.position(0);
                            this.zzw.putShort((short) i8);
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                i2 = this.zzag;
                                if (i10 >= i2) {
                                    break;
                                }
                                int zzp = this.zzo.zzp();
                                int i12 = zzp - i11;
                                if (i10 % 2 == 0) {
                                    this.zzw.putShort((short) i12);
                                } else {
                                    this.zzw.putInt(i12);
                                }
                                i10++;
                                i11 = zzp;
                            }
                            int i13 = (i - this.zzaa) - i11;
                            if ((i2 & 1) == 1) {
                                this.zzw.putInt(i13);
                            } else {
                                this.zzw.putShort((short) i13);
                                this.zzw.putInt(0);
                            }
                            this.zzu.zzI(this.zzw.array(), i9);
                            zzaemVar.zzr(this.zzu, i9, 1);
                            this.zzab += i9;
                        }
                    }
                } else {
                    byte[] bArr = zzaijVar.zzh;
                    if (bArr != null) {
                        this.zzr.zzI(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzaijVar.zzb) ? zzaijVar.zzf > 0 : z) {
                    this.zzW |= 268435456;
                    this.zzv.zzH(0);
                    int zze2 = (this.zzr.zze() + i) - this.zzaa;
                    this.zzo.zzH(4);
                    this.zzo.zzM()[0] = (byte) ((zze2 >> 24) & 255);
                    this.zzo.zzM()[1] = (byte) ((zze2 >> 16) & 255);
                    this.zzo.zzM()[2] = (byte) ((zze2 >> 8) & 255);
                    this.zzo.zzM()[3] = (byte) (zze2 & 255);
                    zzaemVar.zzr(this.zzo, 4, 2);
                    this.zzab += 4;
                }
                this.zzad = true;
            }
            int zze3 = i + this.zzr.zze();
            if ("V_MPEG4/ISO/AVC".equals(zzaijVar.zzb) || "V_MPEGH/ISO/HEVC".equals(zzaijVar.zzb)) {
                byte[] zzM = this.zzn.zzM();
                zzM[0] = 0;
                zzM[1] = 0;
                zzM[2] = 0;
                int i14 = zzaijVar.zzX;
                int i15 = 4 - i14;
                while (this.zzaa < zze3) {
                    int i16 = this.zzac;
                    if (i16 == 0) {
                        int min = Math.min(i14, this.zzr.zzb());
                        ((zzact) zzadgVar).zzn(zzM, i15 + min, i14 - min, false);
                        if (min > 0) {
                            this.zzr.zzG(zzM, i15, min);
                        }
                        this.zzaa += i14;
                        this.zzn.zzK(0);
                        this.zzac = this.zzn.zzp();
                        this.zzm.zzK(0);
                        zzaek.zzb(zzaemVar, this.zzm, 4);
                        this.zzab += 4;
                    } else {
                        int zzp2 = zzp(zzadgVar, zzaemVar, i16);
                        this.zzaa += zzp2;
                        this.zzab += zzp2;
                        this.zzac -= zzp2;
                    }
                }
            } else {
                if (zzaijVar.zzT != null) {
                    zzek.zzf(this.zzr.zze() == 0);
                    zzaijVar.zzT.zzd(zzadgVar);
                }
                while (true) {
                    int i17 = this.zzaa;
                    if (i17 >= zze3) {
                        break;
                    }
                    int zzp3 = zzp(zzadgVar, zzaemVar, zze3 - i17);
                    this.zzaa += zzp3;
                    this.zzab += zzp3;
                }
            }
            if ("A_VORBIS".equals(zzaijVar.zzb)) {
                this.zzp.zzK(0);
                zzaek.zzb(zzaemVar, this.zzp, 4);
                this.zzab += 4;
            }
            int i18 = this.zzab;
            zzv();
            return i18;
        }
    }

    private final int zzp(zzadg zzadgVar, zzaem zzaemVar, int i) throws IOException {
        int zzb2 = this.zzr.zzb();
        if (zzb2 <= 0) {
            return zzaek.zza(zzaemVar, zzadgVar, i, false);
        }
        int min = Math.min(i, zzb2);
        zzaek.zzb(zzaemVar, this.zzr, min);
        return min;
    }

    private final long zzq(long j) throws zzcc {
        long j2 = this.zzz;
        if (j2 == -9223372036854775807L) {
            throw zzcc.zza("Can't scale timecode prior to timecodeScale being set.", null);
        }
        return zzfx.zzt(j, j2, 1000L, RoundingMode.FLOOR);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzr(int i) throws zzcc {
        if (this.zzK == null || this.zzL == null) {
            throw zzcc.zza("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzs(int i) throws zzcc {
        if (this.zzC != null) {
            return;
        }
        throw zzcc.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0 A[EDGE_INSN: B:62:0x00e0->B:51:0x00e0 ?: BREAK  , SYNTHETIC] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzt(com.google.android.gms.internal.ads.zzaij r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaik.zzt(com.google.android.gms.internal.ads.zzaij, long, int, int, int):void");
    }

    private final void zzu(zzadg zzadgVar, int i) throws IOException {
        if (this.zzo.zze() >= i) {
            return;
        }
        if (this.zzo.zzc() < i) {
            zzfo zzfoVar = this.zzo;
            int zzc2 = zzfoVar.zzc();
            zzfoVar.zzE(Math.max(zzc2 + zzc2, i));
        }
        zzfo zzfoVar2 = this.zzo;
        ((zzact) zzadgVar).zzn(zzfoVar2.zzM(), zzfoVar2.zze(), i - zzfoVar2.zze(), false);
        this.zzo.zzJ(i);
    }

    private final void zzv() {
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = 0;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = false;
        this.zzag = 0;
        this.zzah = (byte) 0;
        this.zzai = false;
        this.zzr.zzH(0);
    }

    private final void zzw(zzadg zzadgVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.zzs.zzc() < i2) {
            zzfo zzfoVar = this.zzs;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzfoVar.zzI(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzs.zzM(), 0, length);
        }
        ((zzact) zzadgVar).zzn(this.zzs.zzM(), length, i, false);
        this.zzs.zzK(0);
        this.zzs.zzJ(i2);
    }

    private static byte[] zzx(long j, String str, long j2) {
        zzek.zzd(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = zzfx.zza;
        return format.getBytes(zzfwd.zzc);
    }

    private static int[] zzy(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final int zzb(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        this.zzN = false;
        while (!this.zzN) {
            if (!this.zzh.zzc(zzadgVar)) {
                for (int i = 0; i < this.zzj.size(); i++) {
                    zzaij zzaijVar = (zzaij) this.zzj.valueAt(i);
                    zzaij.zzd(zzaijVar);
                    zzaen zzaenVar = zzaijVar.zzT;
                    if (zzaenVar != null) {
                        zzaenVar.zza(zzaijVar.zzW, zzaijVar.zzi);
                    }
                }
                return -1;
            }
            long zzf2 = zzadgVar.zzf();
            if (this.zzG) {
                this.zzI = zzf2;
                zzaecVar.zza = this.zzH;
                this.zzG = false;
                return 1;
            } else if (this.zzD) {
                long j = this.zzI;
                if (j != -1) {
                    zzaecVar.zza = j;
                    this.zzI = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        this.zzaj = zzadiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        this.zzJ = -9223372036854775807L;
        this.zzO = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzv();
        for (int i = 0; i < this.zzj.size(); i++) {
            zzaen zzaenVar = ((zzaij) this.zzj.valueAt(i)).zzT;
            if (zzaenVar != null) {
                zzaenVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final boolean zzf(zzadg zzadgVar) throws IOException {
        return new zzail().zza(zzadgVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e6, code lost:
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(int r22) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaik.zzi(int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzl(int i, long j, long j2) throws zzcc {
        zzek.zzb(this.zzaj);
        if (i == 160) {
            this.zzY = false;
            this.zzZ = 0L;
        } else if (i == 174) {
            this.zzC = new zzaij();
        } else if (i == 187) {
            this.zzM = false;
        } else if (i == 19899) {
            this.zzE = -1;
            this.zzF = -1L;
        } else if (i == 20533) {
            zzs(i);
            this.zzC.zzg = true;
        } else if (i == 21968) {
            zzs(i);
            this.zzC.zzx = true;
        } else if (i == 408125543) {
            long j3 = this.zzy;
            if (j3 != -1 && j3 != j) {
                throw zzcc.zza("Multiple Segment elements not supported", null);
            }
            this.zzy = j;
            this.zzx = j2;
        } else if (i == 475249515) {
            this.zzK = new zzff(32);
            this.zzL = new zzff(32);
        } else if (i == 524531317 && !this.zzD) {
            if (this.zzk && this.zzH != -1) {
                this.zzG = true;
                return;
            }
            this.zzaj.zzO(new zzaee(this.zzB, 0L));
            this.zzD = true;
        }
    }

    zzaik(zzaif zzaifVar, int i, zzalf zzalfVar) {
        this.zzy = -1L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzH = -1L;
        this.zzI = -1L;
        this.zzJ = -9223372036854775807L;
        this.zzh = zzaifVar;
        zzaifVar.zza(new zzaii(this, null));
        this.zzl = zzalfVar;
        this.zzk = true;
        this.zzi = new zzaim();
        this.zzj = new SparseArray();
        this.zzo = new zzfo(4);
        this.zzp = new zzfo(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzfo(4);
        this.zzm = new zzfo(zzgl.zza);
        this.zzn = new zzfo(4);
        this.zzr = new zzfo();
        this.zzs = new zzfo();
        this.zzt = new zzfo(8);
        this.zzu = new zzfo();
        this.zzv = new zzfo();
        this.zzT = new int[1];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzm(int i, String str) throws zzcc {
        if (i == 134) {
            zzs(i);
            this.zzC.zzb = str;
        } else if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzcc.zza("DocType " + str + " not supported", null);
        } else if (i == 21358) {
            zzs(i);
            this.zzC.zza = str;
        } else if (i != 2274716) {
        } else {
            zzs(i);
            zzaij.zzc(this.zzC, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0284, code lost:
        throw com.google.android.gms.internal.ads.zzcc.zza("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(int r20, int r21, com.google.android.gms.internal.ads.zzadg r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaik.zzh(int, int, com.google.android.gms.internal.ads.zzadg):void");
    }

    public zzaik(zzalf zzalfVar, int i) {
        this(new zzaid(), 2, zzalfVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzk(int i, long j) throws zzcc {
        boolean z;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw zzcc.zza("ContentEncodingOrder " + j + " not supported", null);
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw zzcc.zza("ContentEncodingScope " + j + " not supported", null);
        } else {
            switch (i) {
                case 131:
                    zzs(i);
                    this.zzC.zzd = (int) j;
                    return;
                case 136:
                    z = j == 1;
                    zzs(i);
                    this.zzC.zzV = z;
                    return;
                case 155:
                    this.zzQ = zzq(j);
                    return;
                case 159:
                    zzs(i);
                    this.zzC.zzO = (int) j;
                    return;
                case 176:
                    zzs(i);
                    this.zzC.zzl = (int) j;
                    return;
                case 179:
                    zzr(i);
                    this.zzK.zzc(zzq(j));
                    return;
                case 186:
                    zzs(i);
                    this.zzC.zzm = (int) j;
                    return;
                case 215:
                    zzs(i);
                    this.zzC.zzc = (int) j;
                    return;
                case 231:
                    this.zzJ = zzq(j);
                    return;
                case 238:
                    this.zzX = (int) j;
                    return;
                case 241:
                    if (this.zzM) {
                        return;
                    }
                    zzr(i);
                    this.zzL.zzc(j);
                    this.zzM = true;
                    return;
                case 251:
                    this.zzY = true;
                    return;
                case 16871:
                    zzs(i);
                    zzaij.zzb(this.zzC, (int) j);
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw zzcc.zza("ContentCompAlgo " + j + " not supported", null);
                case 17029:
                    if (j < 1 || j > 2) {
                        throw zzcc.zza("DocTypeReadVersion " + j + " not supported", null);
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw zzcc.zza("EBMLReadVersion " + j + " not supported", null);
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw zzcc.zza("ContentEncAlgo " + j + " not supported", null);
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw zzcc.zza("AESSettingsCipherMode " + j + " not supported", null);
                case 21420:
                    this.zzF = j + this.zzy;
                    return;
                case 21432:
                    int i2 = (int) j;
                    zzs(i);
                    if (i2 == 0) {
                        this.zzC.zzw = 0;
                        return;
                    } else if (i2 == 1) {
                        this.zzC.zzw = 2;
                        return;
                    } else if (i2 == 3) {
                        this.zzC.zzw = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.zzC.zzw = 3;
                        return;
                    }
                case 21680:
                    zzs(i);
                    this.zzC.zzo = (int) j;
                    return;
                case 21682:
                    zzs(i);
                    this.zzC.zzq = (int) j;
                    return;
                case 21690:
                    zzs(i);
                    this.zzC.zzp = (int) j;
                    return;
                case 21930:
                    z = j == 1;
                    zzs(i);
                    this.zzC.zzU = z;
                    return;
                case 21938:
                    zzs(i);
                    zzaij zzaijVar = this.zzC;
                    zzaijVar.zzx = true;
                    zzaijVar.zzn = (int) j;
                    return;
                case 21998:
                    zzs(i);
                    this.zzC.zzf = (int) j;
                    return;
                case 22186:
                    zzs(i);
                    this.zzC.zzR = j;
                    return;
                case 22203:
                    zzs(i);
                    this.zzC.zzS = j;
                    return;
                case 25188:
                    zzs(i);
                    this.zzC.zzP = (int) j;
                    return;
                case 30114:
                    this.zzZ = j;
                    return;
                case 30321:
                    int i3 = (int) j;
                    zzs(i);
                    if (i3 == 0) {
                        this.zzC.zzr = 0;
                        return;
                    } else if (i3 == 1) {
                        this.zzC.zzr = 1;
                        return;
                    } else if (i3 == 2) {
                        this.zzC.zzr = 2;
                        return;
                    } else if (i3 != 3) {
                        return;
                    } else {
                        this.zzC.zzr = 3;
                        return;
                    }
                case 2352003:
                    zzs(i);
                    this.zzC.zze = (int) j;
                    return;
                case 2807729:
                    this.zzz = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            int i4 = (int) j;
                            zzs(i);
                            if (i4 == 1) {
                                this.zzC.zzA = 2;
                                return;
                            } else if (i4 != 2) {
                                return;
                            } else {
                                this.zzC.zzA = 1;
                                return;
                            }
                        case 21946:
                            zzs(i);
                            int zzb2 = zzt.zzb((int) j);
                            if (zzb2 != -1) {
                                this.zzC.zzz = zzb2;
                                return;
                            }
                            return;
                        case 21947:
                            zzs(i);
                            this.zzC.zzx = true;
                            int zza2 = zzt.zza((int) j);
                            if (zza2 != -1) {
                                this.zzC.zzy = zza2;
                                return;
                            }
                            return;
                        case 21948:
                            zzs(i);
                            this.zzC.zzB = (int) j;
                            return;
                        case 21949:
                            zzs(i);
                            this.zzC.zzC = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzj(int i, double d) throws zzcc {
        if (i == 181) {
            zzs(i);
            this.zzC.zzQ = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    zzs(i);
                    this.zzC.zzD = (float) d;
                    return;
                case 21970:
                    zzs(i);
                    this.zzC.zzE = (float) d;
                    return;
                case 21971:
                    zzs(i);
                    this.zzC.zzF = (float) d;
                    return;
                case 21972:
                    zzs(i);
                    this.zzC.zzG = (float) d;
                    return;
                case 21973:
                    zzs(i);
                    this.zzC.zzH = (float) d;
                    return;
                case 21974:
                    zzs(i);
                    this.zzC.zzI = (float) d;
                    return;
                case 21975:
                    zzs(i);
                    this.zzC.zzJ = (float) d;
                    return;
                case 21976:
                    zzs(i);
                    this.zzC.zzK = (float) d;
                    return;
                case 21977:
                    zzs(i);
                    this.zzC.zzL = (float) d;
                    return;
                case 21978:
                    zzs(i);
                    this.zzC.zzM = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            zzs(i);
                            this.zzC.zzs = (float) d;
                            return;
                        case 30324:
                            zzs(i);
                            this.zzC.zzt = (float) d;
                            return;
                        case 30325:
                            zzs(i);
                            this.zzC.zzu = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.zzA = (long) d;
        }
    }
}
