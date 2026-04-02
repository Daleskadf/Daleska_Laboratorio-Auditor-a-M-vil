package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.pathprovider.b;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajk  reason: invalid package */
/* loaded from: classes.dex */
public final class zzajk extends zzaji {
    private final InputStream zzd;
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private final int zzaa() {
        int i7;
        int i8 = this.zzh;
        int i9 = this.zzf;
        if (i9 != i8) {
            byte[] bArr = this.zze;
            int i10 = i8 + 1;
            byte b5 = bArr[i8];
            if (b5 >= 0) {
                this.zzh = i10;
                return b5;
            } else if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b5;
                if (i12 < 0) {
                    i7 = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i7 = i14 ^ 16256;
                    } else {
                        int i15 = i8 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i7 = (-2080896) ^ i16;
                        } else {
                            i13 = i8 + 5;
                            byte b7 = bArr[i15];
                            int i17 = (i16 ^ (b7 << 28)) ^ 266354560;
                            if (b7 < 0) {
                                i15 = i8 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i8 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i8 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i8 + 9;
                                            if (bArr[i15] < 0) {
                                                int i18 = i8 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i11 = i18;
                                                    i7 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i17;
                            }
                            i7 = i17;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.zzh = i11;
                return i7;
            }
        }
        return (int) zzm();
    }

    private final long zzab() {
        int i7 = this.zzh;
        if (this.zzf - i7 < 8) {
            zzg(8);
            i7 = this.zzh;
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 8;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    private final long zzac() {
        long j;
        long j8;
        long j9;
        int i7 = this.zzh;
        int i8 = this.zzf;
        if (i8 != i7) {
            byte[] bArr = this.zze;
            int i9 = i7 + 1;
            byte b5 = bArr[i7];
            if (b5 >= 0) {
                this.zzh = i9;
                return b5;
            } else if (i8 - i9 >= 9) {
                int i10 = i7 + 2;
                int i11 = (bArr[i9] << 7) ^ b5;
                if (i11 < 0) {
                    j = i11 ^ (-128);
                } else {
                    int i12 = i7 + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        j = i13 ^ 16256;
                        i10 = i12;
                    } else {
                        int i14 = i7 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            i10 = i14;
                            j = (-2080896) ^ i15;
                        } else {
                            long j10 = i15;
                            i10 = i7 + 5;
                            long j11 = j10 ^ (bArr[i14] << 28);
                            if (j11 >= 0) {
                                j9 = 266354560;
                            } else {
                                int i16 = i7 + 6;
                                long j12 = j11 ^ (bArr[i10] << 35);
                                if (j12 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    i10 = i7 + 7;
                                    j11 = j12 ^ (bArr[i16] << 42);
                                    if (j11 >= 0) {
                                        j9 = 4363953127296L;
                                    } else {
                                        i16 = i7 + 8;
                                        j12 = j11 ^ (bArr[i10] << 49);
                                        if (j12 < 0) {
                                            j8 = -558586000294016L;
                                        } else {
                                            i10 = i7 + 9;
                                            long j13 = (j12 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j13 < 0) {
                                                int i17 = i7 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i10 = i17;
                                                }
                                            }
                                            j = j13;
                                        }
                                    }
                                }
                                j = j12 ^ j8;
                                i10 = i16;
                            }
                            j = j11 ^ j9;
                        }
                    }
                }
                this.zzh = i10;
                return j;
            }
        }
        return zzm();
    }

    private final void zzad() {
        int i7 = this.zzf + this.zzg;
        this.zzf = i7;
        int i8 = this.zzj + i7;
        int i9 = this.zzk;
        if (i8 > i9) {
            int i10 = i8 - i9;
            this.zzg = i10;
            this.zzf = i7 - i10;
            return;
        }
        this.zzg = 0;
    }

    private final byte zzy() {
        if (this.zzh == this.zzf) {
            zzg(1);
        }
        byte[] bArr = this.zze;
        int i7 = this.zzh;
        this.zzh = i7 + 1;
        return bArr[i7];
    }

    private final int zzz() {
        int i7 = this.zzh;
        if (this.zzf - i7 < 4) {
            zzg(4);
            i7 = this.zzh;
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 4;
        return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final double zza() {
        return Double.longBitsToDouble(zzab());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final float zzb() {
        return Float.intBitsToFloat(zzz());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzc() {
        return this.zzj + this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzd() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zze() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzf() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzg() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzh() {
        return zzaji.zza(zzaa());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzi() {
        if (zzw()) {
            this.zzi = 0;
            return 0;
        }
        int zzaa = zzaa();
        this.zzi = zzaa;
        if ((zzaa >>> 3) != 0) {
            return zzaa;
        }
        throw zzakm.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzj() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final long zzk() {
        return zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final long zzl() {
        return zzac();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final long zzm() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            byte zzy = zzy();
            j |= (zzy & Byte.MAX_VALUE) << i7;
            if ((zzy & 128) == 0) {
                return j;
            }
        }
        throw zzakm.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final long zzn() {
        return zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final long zzo() {
        return zzaji.zza(zzac());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final long zzp() {
        return zzac();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final zzaiw zzq() {
        int zzaa = zzaa();
        int i7 = this.zzf;
        int i8 = this.zzh;
        if (zzaa <= i7 - i8 && zzaa > 0) {
            zzaiw zza = zzaiw.zza(this.zze, i8, zzaa);
            this.zzh += zzaa;
            return zza;
        } else if (zzaa == 0) {
            return zzaiw.zza;
        } else {
            if (zzaa >= 0) {
                byte[] zzj = zzj(zzaa);
                if (zzj != null) {
                    return zzaiw.zza(zzj);
                }
                int i9 = this.zzh;
                int i10 = this.zzf;
                int i11 = i10 - i9;
                this.zzj += i10;
                this.zzh = 0;
                this.zzf = 0;
                List<byte[]> zzf = zzf(zzaa - i11);
                byte[] bArr = new byte[zzaa];
                System.arraycopy(this.zze, i9, bArr, 0, i11);
                for (byte[] bArr2 : zzf) {
                    System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                    i11 += bArr2.length;
                }
                return zzaiw.zzb(bArr);
            }
            throw zzakm.zzf();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final String zzr() {
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i7 = this.zzf;
            int i8 = this.zzh;
            if (zzaa <= i7 - i8) {
                String str = new String(this.zze, i8, zzaa, zzaki.zza);
                this.zzh += zzaa;
                return str;
            }
        }
        if (zzaa == 0) {
            return StringUtils.EMPTY;
        }
        if (zzaa >= 0) {
            if (zzaa <= this.zzf) {
                zzg(zzaa);
                String str2 = new String(this.zze, this.zzh, zzaa, zzaki.zza);
                this.zzh += zzaa;
                return str2;
            }
            return new String(zza(zzaa, false), zzaki.zza);
        }
        throw zzakm.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final String zzs() {
        byte[] zza;
        int zzaa = zzaa();
        int i7 = this.zzh;
        int i8 = this.zzf;
        if (zzaa <= i8 - i7 && zzaa > 0) {
            zza = this.zze;
            this.zzh = i7 + zzaa;
        } else if (zzaa == 0) {
            return StringUtils.EMPTY;
        } else {
            if (zzaa >= 0) {
                i7 = 0;
                if (zzaa <= i8) {
                    zzg(zzaa);
                    zza = this.zze;
                    this.zzh = zzaa;
                } else {
                    zza = zza(zzaa, false);
                }
            } else {
                throw zzakm.zzf();
            }
        }
        return zzanb.zzb(zza, i7, zzaa);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final boolean zzw() {
        if (this.zzh == this.zzf && !zzi(1)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final boolean zzx() {
        if (zzac() != 0) {
            return true;
        }
        return false;
    }

    private zzajk(InputStream inputStream, int i7) {
        super();
        this.zzk = f.API_PRIORITY_OTHER;
        zzaki.zza(inputStream, "input");
        this.zzd = inputStream;
        this.zze = new byte[RecognitionOptions.AZTEC];
        this.zzf = 0;
        this.zzh = 0;
        this.zzj = 0;
    }

    private static int zza(InputStream inputStream) {
        try {
            return inputStream.available();
        } catch (zzakm e7) {
            e7.zzk();
            throw e7;
        }
    }

    private final List<byte[]> zzf(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int min = Math.min(i7, (int) RecognitionOptions.AZTEC);
            byte[] bArr = new byte[min];
            int i8 = 0;
            while (i8 < min) {
                int read = this.zzd.read(bArr, i8, min - i8);
                if (read != -1) {
                    this.zzj += read;
                    i8 += read;
                } else {
                    throw zzakm.zzj();
                }
            }
            i7 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzg(int i7) {
        if (zzi(i7)) {
            return;
        }
        if (i7 > (this.zzb - this.zzj) - this.zzh) {
            throw zzakm.zzi();
        }
        throw zzakm.zzj();
    }

    private final void zzh(int i7) {
        int i8 = this.zzf;
        int i9 = this.zzh;
        if (i7 <= i8 - i9 && i7 >= 0) {
            this.zzh = i9 + i7;
        } else if (i7 >= 0) {
            int i10 = this.zzj;
            int i11 = i10 + i9 + i7;
            int i12 = this.zzk;
            if (i11 <= i12) {
                this.zzj = i10 + i9;
                int i13 = i8 - i9;
                this.zzf = 0;
                this.zzh = 0;
                while (i13 < i7) {
                    try {
                        long j = i7 - i13;
                        long zza = zza(this.zzd, j);
                        int i14 = (zza > 0L ? 1 : (zza == 0L ? 0 : -1));
                        if (i14 >= 0 && zza <= j) {
                            if (i14 == 0) {
                                break;
                            }
                            i13 += (int) zza;
                        } else {
                            throw new IllegalStateException(String.valueOf(this.zzd.getClass()) + "#skip returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
                        }
                    } finally {
                        this.zzj += i13;
                        zzad();
                    }
                }
                if (i13 >= i7) {
                    return;
                }
                int i15 = this.zzf;
                int i16 = i15 - this.zzh;
                this.zzh = i15;
                zzg(1);
                while (true) {
                    int i17 = i7 - i16;
                    int i18 = this.zzf;
                    if (i17 > i18) {
                        i16 += i18;
                        this.zzh = i18;
                        zzg(1);
                    } else {
                        this.zzh = i17;
                        return;
                    }
                }
            } else {
                zzh((i12 - i10) - i9);
                throw zzakm.zzj();
            }
        } else {
            throw zzakm.zzf();
        }
    }

    private final byte[] zzj(int i7) {
        if (i7 == 0) {
            return zzaki.zzb;
        }
        if (i7 >= 0) {
            int i8 = this.zzj;
            int i9 = this.zzh;
            int i10 = i8 + i9 + i7;
            if (i10 - this.zzb <= 0) {
                int i11 = this.zzk;
                if (i10 <= i11) {
                    int i12 = this.zzf - i9;
                    int i13 = i7 - i12;
                    if (i13 < 4096 || i13 <= zza(this.zzd)) {
                        byte[] bArr = new byte[i7];
                        System.arraycopy(this.zze, this.zzh, bArr, 0, i12);
                        this.zzj += this.zzf;
                        this.zzh = 0;
                        this.zzf = 0;
                        while (i12 < i7) {
                            int zza = zza(this.zzd, bArr, i12, i7 - i12);
                            if (zza != -1) {
                                this.zzj += zza;
                                i12 += zza;
                            } else {
                                throw zzakm.zzj();
                            }
                        }
                        return bArr;
                    }
                    return null;
                }
                zzh((i11 - i8) - i9);
                throw zzakm.zzj();
            }
            throw zzakm.zzi();
        }
        throw zzakm.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzb(int i7) {
        if (i7 >= 0) {
            int i8 = this.zzj + this.zzh + i7;
            if (i8 >= 0) {
                int i9 = this.zzk;
                if (i8 <= i9) {
                    this.zzk = i8;
                    zzad();
                    return i9;
                }
                throw zzakm.zzj();
            }
            throw zzakm.zzg();
        }
        throw zzakm.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final void zzc(int i7) {
        if (this.zzi != i7) {
            throw zzakm.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final void zzd(int i7) {
        this.zzk = i7;
        zzad();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final boolean zze(int i7) {
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            if (this.zzf - this.zzh >= 10) {
                while (i9 < 10) {
                    byte[] bArr = this.zze;
                    int i10 = this.zzh;
                    this.zzh = i10 + 1;
                    if (bArr[i10] < 0) {
                        i9++;
                    }
                }
                throw zzakm.zze();
            }
            while (i9 < 10) {
                if (zzy() < 0) {
                    i9++;
                }
            }
            throw zzakm.zze();
            return true;
        } else if (i8 == 1) {
            zzh(8);
            return true;
        } else if (i8 == 2) {
            zzh(zzaa());
            return true;
        } else if (i8 == 3) {
            zzv();
            zzc(((i7 >>> 3) << 3) | 4);
            return true;
        } else if (i8 == 4) {
            zzu();
            return false;
        } else if (i8 == 5) {
            zzh(4);
            return true;
        } else {
            throw zzakm.zza();
        }
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i7, int i8) {
        try {
            return inputStream.read(bArr, i7, i8);
        } catch (zzakm e7) {
            e7.zzk();
            throw e7;
        }
    }

    private final boolean zzi(int i7) {
        do {
            int i8 = this.zzh;
            int i9 = i8 + i7;
            int i10 = this.zzf;
            if (i9 > i10) {
                int i11 = this.zzb;
                int i12 = this.zzj;
                if (i7 > (i11 - i12) - i8 || i12 + i8 + i7 > this.zzk) {
                    return false;
                }
                if (i8 > 0) {
                    if (i10 > i8) {
                        byte[] bArr = this.zze;
                        System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                    }
                    this.zzj += i8;
                    this.zzf -= i8;
                    this.zzh = 0;
                }
                InputStream inputStream = this.zzd;
                byte[] bArr2 = this.zze;
                int i13 = this.zzf;
                int zza = zza(inputStream, bArr2, i13, Math.min(bArr2.length - i13, (this.zzb - this.zzj) - i13));
                if (zza == 0 || zza < -1 || zza > this.zze.length) {
                    throw new IllegalStateException(String.valueOf(this.zzd.getClass()) + "#read(byte[]) returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
                } else if (zza <= 0) {
                    return false;
                } else {
                    this.zzf += zza;
                    zzad();
                }
            } else {
                throw new IllegalStateException(b.f("refillBuffer() called when ", i7, " bytes were already available in buffer"));
            }
        } while (this.zzf < i7);
        return true;
    }

    private static long zza(InputStream inputStream, long j) {
        try {
            return inputStream.skip(j);
        } catch (zzakm e7) {
            e7.zzk();
            throw e7;
        }
    }

    private final byte[] zza(int i7, boolean z7) {
        byte[] zzj = zzj(i7);
        if (zzj != null) {
            return zzj;
        }
        int i8 = this.zzh;
        int i9 = this.zzf;
        int i10 = i9 - i8;
        this.zzj += i9;
        this.zzh = 0;
        this.zzf = 0;
        List<byte[]> zzf = zzf(i7 - i10);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zze, i8, bArr, 0, i10);
        for (byte[] bArr2 : zzf) {
            System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
            i10 += bArr2.length;
        }
        return bArr;
    }
}
