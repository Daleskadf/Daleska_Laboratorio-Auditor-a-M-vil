package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzwr {
    private final zzfo zza = new zzfo(32);
    private zzwq zzb;
    private zzwq zzc;
    private zzwq zzd;
    private long zze;
    private final zzzo zzf;

    public zzwr(zzzo zzzoVar) {
        this.zzf = zzzoVar;
        zzwq zzwqVar = new zzwq(0L, 65536);
        this.zzb = zzwqVar;
        this.zzc = zzwqVar;
        this.zzd = zzwqVar;
    }

    private final int zzi(int i) {
        zzwq zzwqVar = this.zzd;
        if (zzwqVar.zzc == null) {
            zzzh zzb = this.zzf.zzb();
            zzwq zzwqVar2 = new zzwq(this.zzd.zzb, 65536);
            zzwqVar.zzc = zzb;
            zzwqVar.zzd = zzwqVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzwq zzj(zzwq zzwqVar, long j) {
        while (j >= zzwqVar.zzb) {
            zzwqVar = zzwqVar.zzd;
        }
        return zzwqVar;
    }

    private static zzwq zzk(zzwq zzwqVar, long j, ByteBuffer byteBuffer, int i) {
        zzwq zzj = zzj(zzwqVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzj.zzb - j));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j), min);
            i -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzwq zzl(zzwq zzwqVar, long j, byte[] bArr, int i) {
        zzwq zzj = zzj(zzwqVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzj.zzb - j));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzwq zzm(zzwq zzwqVar, zzih zzihVar, zzwt zzwtVar, zzfo zzfoVar) {
        zzwq zzwqVar2;
        int i;
        if (zzihVar.zzk()) {
            long j = zzwtVar.zzb;
            zzfoVar.zzH(1);
            zzwq zzl = zzl(zzwqVar, j, zzfoVar.zzM(), 1);
            long j2 = j + 1;
            byte b = zzfoVar.zzM()[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            zzie zzieVar = zzihVar.zzb;
            byte[] bArr = zzieVar.zza;
            if (bArr == null) {
                zzieVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i2 != 0;
            zzwqVar2 = zzl(zzl, j2, zzieVar.zza, i3);
            long j3 = j2 + i3;
            if (z) {
                zzfoVar.zzH(2);
                zzwqVar2 = zzl(zzwqVar2, j3, zzfoVar.zzM(), 2);
                j3 += 2;
                i = zzfoVar.zzq();
            } else {
                i = 1;
            }
            int[] iArr = zzieVar.zzd;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzieVar.zze;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i * 6;
                zzfoVar.zzH(i4);
                zzwqVar2 = zzl(zzwqVar2, j3, zzfoVar.zzM(), i4);
                j3 += i4;
                zzfoVar.zzK(0);
                for (int i5 = 0; i5 < i; i5++) {
                    iArr2[i5] = zzfoVar.zzq();
                    iArr4[i5] = zzfoVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzwtVar.zza - ((int) (j3 - zzwtVar.zzb));
            }
            zzael zzaelVar = zzwtVar.zzc;
            int i6 = zzfx.zza;
            zzieVar.zzc(i, iArr2, iArr4, zzaelVar.zzb, zzieVar.zza, zzaelVar.zza, zzaelVar.zzc, zzaelVar.zzd);
            long j4 = zzwtVar.zzb;
            int i7 = (int) (j3 - j4);
            zzwtVar.zzb = j4 + i7;
            zzwtVar.zza -= i7;
        } else {
            zzwqVar2 = zzwqVar;
        }
        if (zzihVar.zze()) {
            zzfoVar.zzH(4);
            zzwq zzl2 = zzl(zzwqVar2, zzwtVar.zzb, zzfoVar.zzM(), 4);
            int zzp = zzfoVar.zzp();
            zzwtVar.zzb += 4;
            zzwtVar.zza -= 4;
            zzihVar.zzi(zzp);
            zzwq zzk = zzk(zzl2, zzwtVar.zzb, zzihVar.zzc, zzp);
            zzwtVar.zzb += zzp;
            int i8 = zzwtVar.zza - zzp;
            zzwtVar.zza = i8;
            ByteBuffer byteBuffer = zzihVar.zzf;
            if (byteBuffer == null || byteBuffer.capacity() < i8) {
                zzihVar.zzf = ByteBuffer.allocate(i8);
            } else {
                zzihVar.zzf.clear();
            }
            return zzk(zzk, zzwtVar.zzb, zzihVar.zzf, zzwtVar.zza);
        }
        zzihVar.zzi(zzwtVar.zza);
        return zzk(zzwqVar2, zzwtVar.zzb, zzihVar.zzc, zzwtVar.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + i;
        this.zze = j;
        zzwq zzwqVar = this.zzd;
        if (j == zzwqVar.zzb) {
            this.zzd = zzwqVar.zzd;
        }
    }

    public final int zza(zzu zzuVar, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zzwq zzwqVar = this.zzd;
        int zza = zzuVar.zza(zzwqVar.zzc.zza, zzwqVar.zza(this.zze), zzi);
        if (zza != -1) {
            zzn(zza);
            return zza;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zzwq zzwqVar;
        if (j != -1) {
            while (true) {
                zzwqVar = this.zzb;
                if (j < zzwqVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzwqVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzwqVar.zza) {
                this.zzc = zzwqVar;
            }
        }
    }

    public final void zzd(zzih zzihVar, zzwt zzwtVar) {
        zzm(this.zzc, zzihVar, zzwtVar, this.zza);
    }

    public final void zze(zzih zzihVar, zzwt zzwtVar) {
        this.zzc = zzm(this.zzc, zzihVar, zzwtVar, this.zza);
    }

    public final void zzf() {
        zzwq zzwqVar = this.zzb;
        if (zzwqVar.zzc != null) {
            this.zzf.zzd(zzwqVar);
            zzwqVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzwq zzwqVar2 = this.zzb;
        this.zzc = zzwqVar2;
        this.zzd = zzwqVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzfo zzfoVar, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zzwq zzwqVar = this.zzd;
            zzfoVar.zzG(zzwqVar.zzc.zza, zzwqVar.zza(this.zze), zzi);
            i -= zzi;
            zzn(zzi);
        }
    }
}
