package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajl  reason: invalid package */
/* loaded from: classes.dex */
public final class zzajl extends zzaji {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    private final int zzaa() {
        int i7;
        int i8 = this.zzg;
        int i9 = this.zze;
        if (i9 != i8) {
            byte[] bArr = this.zzd;
            int i10 = i8 + 1;
            byte b5 = bArr[i8];
            if (b5 >= 0) {
                this.zzg = i10;
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
                this.zzg = i11;
                return i7;
            }
        }
        return (int) zzm();
    }

    private final long zzab() {
        int i7 = this.zzg;
        if (this.zze - i7 >= 8) {
            byte[] bArr = this.zzd;
            this.zzg = i7 + 8;
            return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
        }
        throw zzakm.zzj();
    }

    private final long zzac() {
        long j;
        long j8;
        long j9;
        int i7 = this.zzg;
        int i8 = this.zze;
        if (i8 != i7) {
            byte[] bArr = this.zzd;
            int i9 = i7 + 1;
            byte b5 = bArr[i7];
            if (b5 >= 0) {
                this.zzg = i9;
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
                this.zzg = i10;
                return j;
            }
        }
        return zzm();
    }

    private final void zzad() {
        int i7 = this.zze + this.zzf;
        this.zze = i7;
        int i8 = i7 - this.zzh;
        int i9 = this.zzj;
        if (i8 > i9) {
            int i10 = i8 - i9;
            this.zzf = i10;
            this.zze = i7 - i10;
            return;
        }
        this.zzf = 0;
    }

    private final byte zzy() {
        int i7 = this.zzg;
        if (i7 != this.zze) {
            byte[] bArr = this.zzd;
            this.zzg = i7 + 1;
            return bArr[i7];
        }
        throw zzakm.zzj();
    }

    private final int zzz() {
        int i7 = this.zzg;
        if (this.zze - i7 >= 4) {
            byte[] bArr = this.zzd;
            this.zzg = i7 + 4;
            return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16);
        }
        throw zzakm.zzj();
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
        return this.zzg - this.zzh;
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
        byte[] bArr;
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i7 = this.zze;
            int i8 = this.zzg;
            if (zzaa <= i7 - i8) {
                zzaiw zza = zzaiw.zza(this.zzd, i8, zzaa);
                this.zzg += zzaa;
                return zza;
            }
        }
        if (zzaa == 0) {
            return zzaiw.zza;
        }
        if (zzaa > 0) {
            int i9 = this.zze;
            int i10 = this.zzg;
            if (zzaa <= i9 - i10) {
                int i11 = zzaa + i10;
                this.zzg = i11;
                bArr = Arrays.copyOfRange(this.zzd, i10, i11);
                return zzaiw.zzb(bArr);
            }
        }
        if (zzaa <= 0) {
            if (zzaa == 0) {
                bArr = zzaki.zzb;
                return zzaiw.zzb(bArr);
            }
            throw zzakm.zzf();
        }
        throw zzakm.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final String zzr() {
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i7 = this.zze;
            int i8 = this.zzg;
            if (zzaa <= i7 - i8) {
                String str = new String(this.zzd, i8, zzaa, zzaki.zza);
                this.zzg += zzaa;
                return str;
            }
        }
        if (zzaa == 0) {
            return StringUtils.EMPTY;
        }
        if (zzaa < 0) {
            throw zzakm.zzf();
        }
        throw zzakm.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final String zzs() {
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i7 = this.zze;
            int i8 = this.zzg;
            if (zzaa <= i7 - i8) {
                String zzb = zzanb.zzb(this.zzd, i8, zzaa);
                this.zzg += zzaa;
                return zzb;
            }
        }
        if (zzaa == 0) {
            return StringUtils.EMPTY;
        }
        if (zzaa <= 0) {
            throw zzakm.zzf();
        }
        throw zzakm.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final boolean zzw() {
        if (this.zzg == this.zze) {
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

    private zzajl(byte[] bArr, int i7, int i8, boolean z7) {
        super();
        this.zzj = f.API_PRIORITY_OTHER;
        this.zzd = bArr;
        this.zze = i8 + i7;
        this.zzg = i7;
        this.zzh = i7;
    }

    private final void zzf(int i7) {
        if (i7 >= 0) {
            int i8 = this.zze;
            int i9 = this.zzg;
            if (i7 <= i8 - i9) {
                this.zzg = i9 + i7;
                return;
            }
        }
        if (i7 < 0) {
            throw zzakm.zzf();
        }
        throw zzakm.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzb(int i7) {
        if (i7 >= 0) {
            int zzc = i7 + zzc();
            if (zzc >= 0) {
                int i8 = this.zzj;
                if (zzc <= i8) {
                    this.zzj = zzc;
                    zzad();
                    return i8;
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
        this.zzj = i7;
        zzad();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final boolean zze(int i7) {
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            if (this.zze - this.zzg >= 10) {
                while (i9 < 10) {
                    byte[] bArr = this.zzd;
                    int i10 = this.zzg;
                    this.zzg = i10 + 1;
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
            zzf(8);
            return true;
        } else if (i8 == 2) {
            zzf(zzaa());
            return true;
        } else if (i8 == 3) {
            zzv();
            zzc(((i7 >>> 3) << 3) | 4);
            return true;
        } else if (i8 == 4) {
            zzu();
            return false;
        } else if (i8 == 5) {
            zzf(4);
            return true;
        } else {
            throw zzakm.zza();
        }
    }
}
