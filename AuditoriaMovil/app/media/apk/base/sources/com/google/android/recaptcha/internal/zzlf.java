package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlf extends zzli {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    public /* synthetic */ zzlf(byte[] bArr, int i7, int i8, boolean z7, zzlh zzlhVar) {
        super(null);
        this.zzj = f.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = 0;
        this.zzh = 0;
    }

    private final void zzJ() {
        int i7 = this.zzf + this.zzg;
        this.zzf = i7;
        int i8 = this.zzj;
        if (i7 <= i8) {
            this.zzg = 0;
            return;
        }
        int i9 = i7 - i8;
        this.zzg = i9;
        this.zzf = i7 - i9;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzA(int i7) {
        this.zzj = i7;
        zzJ();
    }

    public final void zzB(int i7) {
        if (i7 >= 0) {
            int i8 = this.zzf;
            int i9 = this.zzh;
            if (i7 <= i8 - i9) {
                this.zzh = i9 + i7;
                return;
            }
        }
        if (i7 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzC() {
        return this.zzh == this.zzf;
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
        if (this.zzf - this.zzh >= 10) {
            while (i9 < 10) {
                byte[] bArr = this.zze;
                int i10 = this.zzh;
                this.zzh = i10 + 1;
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
        int i7 = this.zzh;
        if (i7 != this.zzf) {
            byte[] bArr = this.zze;
            this.zzh = i7 + 1;
            return bArr[i7];
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
        return this.zzh;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zze(int i7) {
        if (i7 >= 0) {
            int i8 = i7 + this.zzh;
            if (i8 >= 0) {
                int i9 = this.zzj;
                if (i8 <= i9) {
                    this.zzj = i8;
                    zzJ();
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
        int i7 = this.zzh;
        if (this.zzf - i7 >= 4) {
            byte[] bArr = this.zze;
            this.zzh = i7 + 4;
            int i8 = bArr[i7] & ForkServer.ERROR;
            int i9 = bArr[i7 + 1] & ForkServer.ERROR;
            int i10 = bArr[i7 + 2] & ForkServer.ERROR;
            return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (i9 << 8) | i8 | (i10 << 16);
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final int zzj() {
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
            this.zzi = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzi = zzj;
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
        int i7 = this.zzh;
        if (this.zzf - i7 >= 8) {
            byte[] bArr = this.zze;
            this.zzh = i7 + 8;
            long j = bArr[i7 + 2];
            long j8 = bArr[i7 + 3];
            return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((j & 255) << 16) | ((j8 & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final long zzr() {
        long j;
        long j8;
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
                this.zzh = i10;
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
        if (zzj > 0) {
            int i7 = this.zzf;
            int i8 = this.zzh;
            if (zzj <= i7 - i8) {
                zzle zzk = zzle.zzk(this.zze, i8, zzj);
                this.zzh += zzj;
                return zzk;
            }
        }
        if (zzj != 0) {
            if (zzj > 0) {
                int i9 = this.zzf;
                int i10 = this.zzh;
                if (zzj <= i9 - i10) {
                    int i11 = zzj + i10;
                    this.zzh = i11;
                    return new zzlc(Arrays.copyOfRange(this.zze, i10, i11));
                }
            }
            if (zzj <= 0) {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        return zzle.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            int i7 = this.zzf;
            int i8 = this.zzh;
            if (zzj <= i7 - i8) {
                String str = new String(this.zze, i8, zzj, zznl.zza);
                this.zzh += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return StringUtils.EMPTY;
        }
        if (zzj < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzy() {
        int zzj = zzj();
        if (zzj > 0) {
            int i7 = this.zzf;
            int i8 = this.zzh;
            if (zzj <= i7 - i8) {
                String zzd = zzpv.zzd(this.zze, i8, zzj);
                this.zzh += zzj;
                return zzd;
            }
        }
        if (zzj == 0) {
            return StringUtils.EMPTY;
        }
        if (zzj <= 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzz(int i7) {
        if (this.zzi == i7) {
            return;
        }
        throw new zznn("Protocol message end-group tag did not match expected tag.");
    }
}
