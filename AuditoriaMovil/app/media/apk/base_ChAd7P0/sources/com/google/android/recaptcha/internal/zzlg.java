package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.pathprovider.b;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlg extends zzli {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzlg(InputStream inputStream, int i7, zzlh zzlhVar) {
        super(null);
        this.zzl = f.API_PRIORITY_OTHER;
        byte[] bArr = zznl.zzb;
        this.zze = inputStream;
        this.zzf = new byte[RecognitionOptions.AZTEC];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzJ(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int min = Math.min(i7, (int) RecognitionOptions.AZTEC);
            byte[] bArr = new byte[min];
            int i8 = 0;
            while (i8 < min) {
                int read = this.zze.read(bArr, i8, min - i8);
                if (read != -1) {
                    this.zzk += read;
                    i8 += read;
                } else {
                    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            }
            i7 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzK() {
        int i7 = this.zzg + this.zzh;
        this.zzg = i7;
        int i8 = this.zzk + i7;
        int i9 = this.zzl;
        if (i8 <= i9) {
            this.zzh = 0;
            return;
        }
        int i10 = i8 - i9;
        this.zzh = i10;
        this.zzg = i7 - i10;
    }

    private final void zzL(int i7) {
        if (!zzM(i7)) {
            if (i7 > (f.API_PRIORITY_OTHER - this.zzk) - this.zzi) {
                throw new zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final boolean zzM(int i7) {
        int i8 = this.zzi;
        int i9 = i8 + i7;
        int i10 = this.zzg;
        if (i9 > i10) {
            int i11 = this.zzk;
            if (i7 > (f.API_PRIORITY_OTHER - i11) - i8 || i11 + i8 + i7 > this.zzl) {
                return false;
            }
            if (i8 > 0) {
                if (i10 > i8) {
                    byte[] bArr = this.zzf;
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                i11 = this.zzk + i8;
                this.zzk = i11;
                i10 = this.zzg - i8;
                this.zzg = i10;
                this.zzi = 0;
            }
            try {
                int read = this.zze.read(this.zzf, i10, Math.min(4096 - i10, (f.API_PRIORITY_OTHER - i11) - i10));
                if (read != 0 && read >= -1 && read <= 4096) {
                    if (read <= 0) {
                        return false;
                    }
                    this.zzg += read;
                    zzK();
                    if (this.zzg >= i7) {
                        return true;
                    }
                    return zzM(i7);
                }
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } catch (zznn e7) {
                e7.zza();
                throw e7;
            }
        }
        throw new IllegalStateException(b.f("refillBuffer() called when ", i7, " bytes were already available in buffer"));
    }

    private final byte[] zzN(int i7, boolean z7) {
        byte[] zzO = zzO(i7);
        if (zzO != null) {
            return zzO;
        }
        int i8 = this.zzi;
        int i9 = this.zzg;
        int i10 = i9 - i8;
        this.zzk += i9;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzJ = zzJ(i7 - i10);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zzf, i8, bArr, 0, i10);
        for (byte[] bArr2 : zzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i10, length);
            i10 += length;
        }
        return bArr;
    }

    private final byte[] zzO(int i7) {
        if (i7 == 0) {
            return zznl.zzb;
        }
        int i8 = this.zzk;
        int i9 = this.zzi;
        int i10 = i8 + i9 + i7;
        if ((-2147483647) + i10 <= 0) {
            int i11 = this.zzl;
            if (i10 <= i11) {
                int i12 = this.zzg - i9;
                int i13 = i7 - i12;
                if (i13 >= 4096) {
                    try {
                        if (i13 > this.zze.available()) {
                            return null;
                        }
                    } catch (zznn e7) {
                        e7.zza();
                        throw e7;
                    }
                }
                byte[] bArr = new byte[i7];
                System.arraycopy(this.zzf, this.zzi, bArr, 0, i12);
                this.zzk += this.zzg;
                this.zzi = 0;
                this.zzg = 0;
                while (i12 < i7) {
                    try {
                        int read = this.zze.read(bArr, i12, i7 - i12);
                        if (read != -1) {
                            this.zzk += read;
                            i12 += read;
                        } else {
                            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                    } catch (zznn e8) {
                        e8.zza();
                        throw e8;
                    }
                }
                return bArr;
            }
            zzB((i11 - i8) - i9);
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzA(int i7) {
        this.zzl = i7;
        zzK();
    }

    public final void zzB(int i7) {
        int i8 = this.zzg;
        int i9 = this.zzi;
        int i10 = i8 - i9;
        if (i7 <= i10 && i7 >= 0) {
            this.zzi = i9 + i7;
        } else if (i7 >= 0) {
            int i11 = this.zzk;
            int i12 = i11 + i9;
            int i13 = this.zzl;
            if (i12 + i7 <= i13) {
                this.zzk = i12;
                this.zzg = 0;
                this.zzi = 0;
                while (i10 < i7) {
                    try {
                        long j = i7 - i10;
                        try {
                            long skip = this.zze.skip(j);
                            int i14 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i14 >= 0 && skip <= j) {
                                if (i14 == 0) {
                                    break;
                                }
                                i10 += (int) skip;
                            } else {
                                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (zznn e7) {
                            e7.zza();
                            throw e7;
                        }
                    } catch (Throwable th) {
                        this.zzk += i10;
                        zzK();
                        throw th;
                    }
                }
                this.zzk += i10;
                zzK();
                if (i10 < i7) {
                    int i15 = this.zzg;
                    int i16 = i15 - this.zzi;
                    this.zzi = i15;
                    zzL(1);
                    while (true) {
                        int i17 = i7 - i16;
                        int i18 = this.zzg;
                        if (i17 > i18) {
                            i16 += i18;
                            this.zzi = i18;
                            zzL(1);
                        } else {
                            this.zzi = i17;
                            return;
                        }
                    }
                }
            } else {
                zzB((i13 - i11) - i9);
                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } else {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzC() {
        if (this.zzi == this.zzg && !zzM(1)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzD() {
        if (zzr() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzE(int i7) {
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4) {
                            return false;
                        }
                        if (i8 == 5) {
                            zzB(4);
                            return true;
                        }
                        throw new zznm("Protocol message tag had invalid wire type.");
                    }
                    zzI();
                    zzz(((i7 >>> 3) << 3) | 4);
                    return true;
                }
                zzB(zzj());
                return true;
            }
            zzB(8);
            return true;
        }
        if (this.zzg - this.zzi >= 10) {
            while (i9 < 10) {
                byte[] bArr = this.zzf;
                int i10 = this.zzi;
                this.zzi = i10 + 1;
                if (bArr[i10] < 0) {
                    i9++;
                }
            }
            throw new zznn("CodedInputStream encountered a malformed varint.");
        }
        while (i9 < 10) {
            if (zza() < 0) {
                i9++;
            }
        }
        throw new zznn("CodedInputStream encountered a malformed varint.");
        return true;
    }

    public final byte zza() {
        if (this.zzi == this.zzg) {
            zzL(1);
        }
        byte[] bArr = this.zzf;
        int i7 = this.zzi;
        this.zzi = i7 + 1;
        return bArr[i7];
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzd() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zze(int i7) {
        if (i7 >= 0) {
            int i8 = this.zzk + this.zzi + i7;
            if (i8 >= 0) {
                int i9 = this.zzl;
                if (i8 <= i9) {
                    this.zzl = i8;
                    zzK();
                    return i9;
                }
                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new zznn("Failed to parse the message.");
        }
        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzf() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzg() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzh() {
        return zzj();
    }

    public final int zzi() {
        int i7 = this.zzi;
        if (this.zzg - i7 < 4) {
            zzL(4);
            i7 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i7 + 4;
        int i8 = bArr[i7] & ForkServer.ERROR;
        int i9 = bArr[i7 + 1] & ForkServer.ERROR;
        int i10 = bArr[i7 + 2] & ForkServer.ERROR;
        return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    public final int zzj() {
        int i7;
        int i8 = this.zzi;
        int i9 = this.zzg;
        if (i9 != i8) {
            byte[] bArr = this.zzf;
            int i10 = i8 + 1;
            byte b5 = bArr[i8];
            if (b5 >= 0) {
                this.zzi = i10;
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
                this.zzi = i11;
                return i7;
            }
        }
        return (int) zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzk() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzl() {
        return zzli.zzF(zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzm() {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzj = zzj;
        if ((zzj >>> 3) != 0) {
            return zzj;
        }
        throw new zznn("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzn() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzo() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzp() {
        return zzr();
    }

    public final long zzq() {
        int i7 = this.zzi;
        if (this.zzg - i7 < 8) {
            zzL(8);
            i7 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i7 + 8;
        long j = bArr[i7 + 2];
        long j8 = bArr[i7 + 3];
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((j & 255) << 16) | ((j8 & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final long zzr() {
        long j;
        long j8;
        int i7 = this.zzi;
        int i8 = this.zzg;
        if (i8 != i7) {
            byte[] bArr = this.zzf;
            int i9 = i7 + 1;
            byte b5 = bArr[i7];
            if (b5 >= 0) {
                this.zzi = i9;
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
                    } else {
                        int i14 = i7 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            i10 = i14;
                            j = (-2080896) ^ i15;
                        } else {
                            i12 = i7 + 5;
                            long j9 = (bArr[i14] << 28) ^ i15;
                            if (j9 >= 0) {
                                j = j9 ^ 266354560;
                            } else {
                                i10 = i7 + 6;
                                long j10 = (bArr[i12] << 35) ^ j9;
                                if (j10 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    int i16 = i7 + 7;
                                    long j11 = j10 ^ (bArr[i10] << 42);
                                    if (j11 >= 0) {
                                        j = j11 ^ 4363953127296L;
                                    } else {
                                        i10 = i7 + 8;
                                        j10 = j11 ^ (bArr[i16] << 49);
                                        if (j10 < 0) {
                                            j8 = -558586000294016L;
                                        } else {
                                            i16 = i7 + 9;
                                            long j12 = (j10 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j12 < 0) {
                                                i10 = i7 + 10;
                                                if (bArr[i16] >= 0) {
                                                    j = j12;
                                                }
                                            } else {
                                                j = j12;
                                            }
                                        }
                                    }
                                    i10 = i16;
                                }
                                j = j10 ^ j8;
                            }
                        }
                    }
                    i10 = i12;
                }
                this.zzi = i10;
                return j;
            }
        }
        return zzs();
    }

    public final long zzs() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            byte zza = zza();
            j |= (zza & Byte.MAX_VALUE) << i7;
            if ((zza & 128) == 0) {
                return j;
            }
        }
        throw new zznn("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzt() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzu() {
        return zzli.zzG(zzr());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzv() {
        return zzr();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final zzle zzw() {
        int zzj = zzj();
        int i7 = this.zzg;
        int i8 = this.zzi;
        if (zzj <= i7 - i8 && zzj > 0) {
            zzle zzk = zzle.zzk(this.zzf, i8, zzj);
            this.zzi += zzj;
            return zzk;
        } else if (zzj == 0) {
            return zzle.zzb;
        } else {
            if (zzj >= 0) {
                byte[] zzO = zzO(zzj);
                if (zzO != null) {
                    return zzle.zzk(zzO, 0, zzO.length);
                }
                int i9 = this.zzi;
                int i10 = this.zzg;
                int i11 = i10 - i9;
                this.zzk += i10;
                this.zzi = 0;
                this.zzg = 0;
                List<byte[]> zzJ = zzJ(zzj - i11);
                byte[] bArr = new byte[zzj];
                System.arraycopy(this.zzf, i9, bArr, 0, i11);
                for (byte[] bArr2 : zzJ) {
                    int length = bArr2.length;
                    System.arraycopy(bArr2, 0, bArr, i11, length);
                    i11 += length;
                }
                return new zzlc(bArr);
            }
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            int i7 = this.zzg;
            int i8 = this.zzi;
            if (zzj <= i7 - i8) {
                String str = new String(this.zzf, i8, zzj, zznl.zza);
                this.zzi += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return StringUtils.EMPTY;
        }
        if (zzj >= 0) {
            if (zzj <= this.zzg) {
                zzL(zzj);
                String str2 = new String(this.zzf, this.zzi, zzj, zznl.zza);
                this.zzi += zzj;
                return str2;
            }
            return new String(zzN(zzj, false), zznl.zza);
        }
        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzy() {
        byte[] zzN;
        int zzj = zzj();
        int i7 = this.zzi;
        int i8 = this.zzg;
        if (zzj <= i8 - i7 && zzj > 0) {
            zzN = this.zzf;
            this.zzi = i7 + zzj;
        } else if (zzj == 0) {
            return StringUtils.EMPTY;
        } else {
            if (zzj >= 0) {
                i7 = 0;
                if (zzj <= i8) {
                    zzL(zzj);
                    zzN = this.zzf;
                    this.zzi = zzj;
                } else {
                    zzN = zzN(zzj, false);
                }
            } else {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
        return zzpv.zzd(zzN, i7, zzj);
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzz(int i7) {
        if (this.zzj == i7) {
            return;
        }
        throw new zznn("Protocol message end-group tag did not match expected tag.");
    }
}
