package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgyr extends zzgyt {
    private final ByteBuffer zze;
    private final long zzf;
    private long zzg;
    private long zzh;
    private final long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgyr(ByteBuffer byteBuffer, boolean z, zzgyq zzgyqVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zze = byteBuffer;
        long zze = zzhdh.zze(byteBuffer);
        this.zzf = zze;
        this.zzg = byteBuffer.limit() + zze;
        long position = zze + byteBuffer.position();
        this.zzh = position;
        this.zzi = position;
    }

    private final int zzK() {
        return (int) (this.zzg - this.zzh);
    }

    private final void zzL() {
        long j = this.zzg + this.zzj;
        this.zzg = j;
        int i = (int) (j - this.zzi);
        int i2 = this.zzl;
        if (i <= i2) {
            this.zzj = 0;
            return;
        }
        int i3 = i - i2;
        this.zzj = i3;
        this.zzg = j - i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final void zzA(int i) {
        this.zzl = i;
        zzL();
    }

    public final void zzB(int i) throws IOException {
        if (i >= 0 && i <= zzK()) {
            this.zzh += i;
        } else if (i < 0) {
            throw zzhak.zzf();
        } else {
            throw zzhak.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final boolean zzC() throws IOException {
        return this.zzh == this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    public final byte zza() throws IOException {
        long j = this.zzh;
        if (j == this.zzg) {
            throw zzhak.zzj();
        }
        this.zzh = 1 + j;
        return zzhdh.zza(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzd() {
        return (int) (this.zzh - this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zze(int i) throws zzhak {
        if (i >= 0) {
            int zzd = i + zzd();
            int i2 = this.zzl;
            if (zzd <= i2) {
                this.zzl = zzd;
                zzL();
                return i2;
            }
            throw zzhak.zzj();
        }
        throw zzhak.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzf() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzg() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzh() throws IOException {
        return zzj();
    }

    public final int zzi() throws IOException {
        long j = this.zzh;
        if (this.zzg - j < 4) {
            throw zzhak.zzj();
        }
        this.zzh = 4 + j;
        int zza = (zzhdh.zza(1 + j) & 255) << 8;
        return ((zzhdh.zza(j + 3) & 255) << 24) | zza | (zzhdh.zza(j) & 255) | ((zzhdh.zza(2 + j) & 255) << 16);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzk() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzl() throws IOException {
        return zzF(zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzk = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzk = zzj;
        if ((zzj >>> 3) != 0) {
            return zzj;
        }
        throw zzhak.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzn() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final long zzo() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final long zzp() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        long j = this.zzh;
        if (this.zzg - j < 8) {
            throw zzhak.zzj();
        }
        this.zzh = 8 + j;
        return ((zzhdh.zza(j + 7) & 255) << 56) | (zzhdh.zza(j) & 255) | ((zzhdh.zza(1 + j) & 255) << 8) | ((zzhdh.zza(2 + j) & 255) << 16) | ((zzhdh.zza(3 + j) & 255) << 24) | ((zzhdh.zza(4 + j) & 255) << 32) | ((zzhdh.zza(5 + j) & 255) << 40) | ((zzhdh.zza(6 + j) & 255) << 48);
    }

    final long zzs() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zza = zza();
            j |= (zza & Byte.MAX_VALUE) << i;
            if ((zza & 128) == 0) {
                return j;
            }
        }
        throw zzhak.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final long zzt() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final long zzu() throws IOException {
        return zzH(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final long zzv() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final zzgyj zzw() throws IOException {
        int zzj = zzj();
        if (zzj <= 0 || zzj > zzK()) {
            if (zzj == 0) {
                return zzgyj.zzb;
            }
            if (zzj < 0) {
                throw zzhak.zzf();
            }
            throw zzhak.zzj();
        }
        byte[] bArr = new byte[zzj];
        long j = zzj;
        zzhdh.zzo(this.zzh, bArr, 0L, j);
        this.zzh += j;
        return new zzgyf(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final String zzx() throws IOException {
        int zzj = zzj();
        if (zzj <= 0 || zzj > zzK()) {
            if (zzj == 0) {
                return "";
            }
            if (zzj < 0) {
                throw zzhak.zzf();
            }
            throw zzhak.zzj();
        }
        byte[] bArr = new byte[zzj];
        long j = zzj;
        zzhdh.zzo(this.zzh, bArr, 0L, j);
        String str = new String(bArr, zzhai.zzb);
        this.zzh += j;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final String zzy() throws IOException {
        int zzj = zzj();
        if (zzj > 0 && zzj <= zzK()) {
            String zzg = zzhdm.zzg(this.zze, (int) (this.zzh - this.zzf), zzj);
            this.zzh += zzj;
            return zzg;
        } else if (zzj == 0) {
            return "";
        } else {
            if (zzj <= 0) {
                throw zzhak.zzf();
            }
            throw zzhak.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final void zzz(int i) throws zzhak {
        if (this.zzk != i) {
            throw zzhak.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final boolean zzE(int i) throws IOException {
        int zzm;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (zzK() < 10) {
                while (i3 < 10) {
                    if (zza() < 0) {
                        i3++;
                    }
                }
                throw zzhak.zze();
            }
            while (i3 < 10) {
                long j = this.zzh;
                this.zzh = 1 + j;
                if (zzhdh.zza(j) < 0) {
                    i3++;
                }
            }
            throw zzhak.zze();
            return true;
        } else if (i2 == 1) {
            zzB(8);
            return true;
        } else if (i2 == 2) {
            zzB(zzj());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzB(4);
                    return true;
                }
                throw zzhak.zza();
            }
            return false;
        } else {
            do {
                zzm = zzm();
                if (zzm == 0) {
                    break;
                }
            } while (zzE(zzm));
            zzz(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (com.google.android.gms.internal.ads.zzhdh.zza(r4) >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzj() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.zzh
            long r2 = r10.zzg
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L87
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzhdh.zza(r0)
            if (r0 < 0) goto L17
            r10.zzh = r4
            return r0
        L17:
            long r6 = r10.zzg
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L87
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L2e
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L84
        L2e:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L3d
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L3b:
            r6 = r4
            goto L84
        L3d:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L4d
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L84
        L4d:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r4)
            if (r1 < 0) goto L87
        L84:
            r10.zzh = r6
            return r0
        L87:
            long r0 = r10.zzs()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgyr.zzj():int");
    }

    public final long zzr() throws IOException {
        long zza;
        long j;
        long j2;
        int i;
        long j3 = this.zzh;
        if (this.zzg != j3) {
            long j4 = j3 + 1;
            byte zza2 = zzhdh.zza(j3);
            if (zza2 >= 0) {
                this.zzh = j4;
                return zza2;
            } else if (this.zzg - j4 >= 9) {
                long j5 = j4 + 1;
                int zza3 = zza2 ^ (zzhdh.zza(j4) << 7);
                if (zza3 >= 0) {
                    long j6 = j5 + 1;
                    int zza4 = zza3 ^ (zzhdh.zza(j5) << Ascii.SO);
                    if (zza4 >= 0) {
                        zza = zza4 ^ 16256;
                    } else {
                        j5 = j6 + 1;
                        int zza5 = zza4 ^ (zzhdh.zza(j6) << Ascii.NAK);
                        if (zza5 < 0) {
                            i = zza5 ^ (-2080896);
                        } else {
                            j6 = j5 + 1;
                            long zza6 = zza5 ^ (zzhdh.zza(j5) << 28);
                            if (zza6 < 0) {
                                long j7 = j6 + 1;
                                long zza7 = zza6 ^ (zzhdh.zza(j6) << 35);
                                if (zza7 < 0) {
                                    j = -34093383808L;
                                } else {
                                    j6 = j7 + 1;
                                    zza6 = zza7 ^ (zzhdh.zza(j7) << 42);
                                    if (zza6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        j7 = j6 + 1;
                                        zza7 = zza6 ^ (zzhdh.zza(j6) << 49);
                                        if (zza7 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            j6 = j7 + 1;
                                            zza = (zza7 ^ (zzhdh.zza(j7) << 56)) ^ 71499008037633920L;
                                            if (zza < 0) {
                                                long j8 = 1 + j6;
                                                if (zzhdh.zza(j6) >= 0) {
                                                    j5 = j8;
                                                    this.zzh = j5;
                                                    return zza;
                                                }
                                            }
                                        }
                                    }
                                }
                                zza = zza7 ^ j;
                                j5 = j7;
                                this.zzh = j5;
                                return zza;
                            }
                            j2 = 266354560;
                            zza = zza6 ^ j2;
                        }
                    }
                    j5 = j6;
                    this.zzh = j5;
                    return zza;
                }
                i = zza3 ^ (-128);
                zza = i;
                this.zzh = j5;
                return zza;
            }
        }
        return zzs();
    }
}
