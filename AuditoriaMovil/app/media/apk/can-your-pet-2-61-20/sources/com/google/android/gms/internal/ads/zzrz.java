package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzrz extends zzdu {
    private int zze;
    private boolean zzf;
    private int zzg;
    private long zzh;
    private int zzi = 0;
    private int zzk = 0;
    private int zzl = 0;
    private zzdr zzd = zzdr.zza;
    private byte[] zzj = zzfx.zzf;
    private byte[] zzm = zzfx.zzf;

    private final int zzq(int i) {
        int zzr = ((zzr(2000000L) - this.zzi) * this.zze) - (this.zzj.length >> 1);
        zzek.zzf(zzr >= 0);
        int i2 = this.zze;
        return (((int) Math.min((i * 0.2f) + 0.5f, zzr)) / i2) * i2;
    }

    private final int zzr(long j) {
        return (int) ((j * this.zzd.zzb) / 1000000);
    }

    private static int zzs(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    private final void zzt(boolean z) {
        int i;
        int i2;
        int i3;
        int i4 = this.zzl;
        int length = this.zzj.length;
        if (i4 != length) {
            if (!z) {
                return;
            }
            z = true;
        }
        if (this.zzi == 0) {
            if (z) {
                zzu(i4, 3);
                i2 = i4;
            } else {
                zzek.zzf(i4 >= (length >> 1));
                i2 = this.zzj.length >> 1;
                zzu(i2, 0);
            }
            i = i2;
        } else {
            int i5 = length >> 1;
            int i6 = i4 - i5;
            if (z) {
                int zzq = zzq(i6) + (this.zzj.length >> 1);
                zzu(zzq, 2);
                int i7 = i5 + i6;
                i = zzq;
                i2 = i7;
            } else {
                int zzq2 = zzq(i6);
                zzu(zzq2, 1);
                i = zzq2;
                i2 = i6;
            }
        }
        zzek.zzg(i2 % this.zze == 0, "bytesConsumed is not aligned to frame size: %s" + i2);
        zzek.zzf(i4 >= i);
        this.zzl -= i2;
        int i8 = this.zzk + i2;
        this.zzk = i8;
        this.zzk = i8 % this.zzj.length;
        this.zzi = this.zzi + (i / this.zze);
        this.zzh += (i2 - i) / i3;
    }

    private final void zzu(int i, int i2) {
        int i3;
        if (i == 0) {
            return;
        }
        zzek.zzd(this.zzl >= i);
        if (i2 == 2) {
            int i4 = this.zzk;
            int i5 = this.zzl;
            int i6 = i4 + i5;
            byte[] bArr = this.zzj;
            int length = bArr.length;
            if (i6 <= length) {
                System.arraycopy(bArr, i6 - i, this.zzm, 0, i);
            } else {
                int i7 = i5 - (length - i4);
                if (i7 >= i) {
                    System.arraycopy(bArr, i7 - i, this.zzm, 0, i);
                } else {
                    int i8 = i - i7;
                    System.arraycopy(bArr, length - i8, this.zzm, 0, i8);
                    System.arraycopy(this.zzj, 0, this.zzm, i8, i7);
                }
            }
        } else {
            int i9 = this.zzk;
            int i10 = i9 + i;
            byte[] bArr2 = this.zzj;
            int length2 = bArr2.length;
            if (i10 <= length2) {
                System.arraycopy(bArr2, i9, this.zzm, 0, i);
            } else {
                int i11 = length2 - i9;
                System.arraycopy(bArr2, i9, this.zzm, 0, i11);
                System.arraycopy(this.zzj, 0, this.zzm, i11, i - i11);
            }
        }
        boolean z = i % this.zze == 0;
        zzek.zze(z, "sizeToOutput is not aligned to frame size: " + i);
        zzek.zzf(this.zzk < this.zzj.length);
        byte[] bArr3 = this.zzm;
        int i12 = i % this.zze;
        zzek.zze(i12 == 0, "byteOutput size is not aligned to frame size " + i);
        if (i2 != 3) {
            for (int i13 = 0; i13 < i; i13 += 2) {
                int i14 = i13 + 1;
                int zzs = zzs(bArr3[i14], bArr3[i13]);
                if (i2 == 0) {
                    i3 = ((((i13 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i13) / (i - 1)) / 1000);
                    }
                }
                int i15 = (zzs * i3) / 100;
                if (i15 >= 32767) {
                    bArr3[i13] = -1;
                    bArr3[i14] = Byte.MAX_VALUE;
                } else if (i15 <= -32768) {
                    bArr3[i13] = 0;
                    bArr3[i14] = Byte.MIN_VALUE;
                } else {
                    bArr3[i13] = (byte) (i15 & 255);
                    bArr3[i14] = (byte) (i15 >> 8);
                }
            }
        }
        zzj(i).put(bArr3, 0, i).flip();
    }

    private static final boolean zzv(byte b, byte b2) {
        return Math.abs(zzs(b, b2)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zze(ByteBuffer byteBuffer) {
        int limit;
        int i;
        int position;
        while (byteBuffer.hasRemaining() && !zzn()) {
            boolean z = true;
            if (this.zzg == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.zzj.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 >= byteBuffer.position()) {
                        if (zzv(byteBuffer.get(limit3), byteBuffer.get(limit3 - 1))) {
                            int i2 = this.zze;
                            position = ((limit3 / i2) * i2) + i2;
                            break;
                        }
                        limit3 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.zzg = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    zzj(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                zzek.zzf(this.zzk < this.zzj.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 < byteBuffer.limit()) {
                        if (zzv(byteBuffer.get(position2), byteBuffer.get(position2 - 1))) {
                            int i3 = this.zze;
                            limit = i3 * (position2 / i3);
                            break;
                        }
                        position2 += 2;
                    } else {
                        limit = byteBuffer.limit();
                        break;
                    }
                }
                int position3 = limit - byteBuffer.position();
                int i4 = this.zzk;
                int i5 = this.zzl;
                int i6 = i4 + i5;
                int length = this.zzj.length;
                if (i6 < length) {
                    i = length - i6;
                } else {
                    i6 = i5 - (length - i4);
                    i = i4 - i6;
                }
                int min = Math.min(position3, i);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.zzj, i6, min);
                int i7 = this.zzl + min;
                this.zzl = i7;
                zzek.zzf(i7 <= this.zzj.length);
                z = (limit >= limit4 || position3 >= i) ? false : false;
                zzt(z);
                if (z) {
                    this.zzg = 0;
                    this.zzi = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdu, com.google.android.gms.internal.ads.zzdt
    public final boolean zzg() {
        return this.zzd.zzb != -1 && this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    protected final zzdr zzi(zzdr zzdrVar) throws zzds {
        if (zzdrVar.zzd == 2) {
            this.zzd = zzdrVar;
            int i = zzdrVar.zzc;
            this.zze = i + i;
            return zzdrVar;
        }
        throw new zzds("Unhandled input format:", zzdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    public final void zzk() {
        if (zzg()) {
            int i = this.zze;
            int zzr = ((zzr(100000L) / 2) / i) * i;
            int i2 = zzr + zzr;
            if (this.zzj.length != i2) {
                this.zzj = new byte[i2];
                this.zzm = new byte[i2];
            }
        }
        this.zzg = 0;
        this.zzh = 0L;
        this.zzi = 0;
        this.zzk = 0;
        this.zzl = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    public final void zzl() {
        if (this.zzl > 0) {
            zzt(true);
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    public final void zzm() {
        this.zzf = false;
        this.zzd = zzdr.zza;
        this.zzj = zzfx.zzf;
        this.zzm = zzfx.zzf;
    }

    public final long zzo() {
        return this.zzh;
    }

    public final void zzp(boolean z) {
        this.zzf = z;
    }
}
