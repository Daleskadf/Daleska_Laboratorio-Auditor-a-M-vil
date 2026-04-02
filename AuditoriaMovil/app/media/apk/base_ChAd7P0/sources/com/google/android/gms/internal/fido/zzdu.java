package com.google.android.gms.internal.fido;

import D.AbstractC0059i;
import io.flutter.plugins.pathprovider.b;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
/* loaded from: classes.dex */
public final class zzdu implements Closeable {
    private final InputStream zza;
    private zzdt zzb;
    private final byte[] zzc = new byte[8];
    private final zzdv zzd = zzdv.zza();

    public zzdu(InputStream inputStream) {
        this.zza = inputStream;
    }

    private final long zzh() {
        byte[] bArr;
        if (this.zzb.zza() < 24) {
            long zza = this.zzb.zza();
            this.zzb = null;
            return zza;
        } else if (this.zzb.zza() == 24) {
            int read = this.zza.read();
            if (read != -1) {
                this.zzb = null;
                return read & 255;
            }
            throw new EOFException();
        } else if (this.zzb.zza() == 25) {
            zzk(this.zzc, 2);
            byte[] bArr2 = this.zzc;
            return ((bArr2[0] & 255) << 8) | (bArr2[1] & 255);
        } else if (this.zzb.zza() == 26) {
            zzk(this.zzc, 4);
            return (bArr[3] & 255) | ((bArr[1] & 255) << 16) | ((this.zzc[0] & 255) << 24) | ((bArr[2] & 255) << 8);
        } else if (this.zzb.zza() == 27) {
            zzk(this.zzc, 8);
            byte[] bArr3 = this.zzc;
            long j = bArr3[0];
            long j8 = bArr3[1];
            long j9 = bArr3[2];
            return (bArr3[7] & 255) | ((bArr3[6] & 255) << 8) | ((j8 & 255) << 48) | ((j & 255) << 56) | ((j9 & 255) << 40) | ((bArr3[3] & 255) << 32) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16);
        } else {
            throw new IOException(AbstractC0059i.x("invalid additional information ", this.zzb.zza(), this.zzb.zzc(), " for major type "));
        }
    }

    private final void zzi() {
        zzd();
        if (this.zzb.zza() != 31) {
            return;
        }
        throw new IllegalStateException(b.e(this.zzb.zza(), "expected definite length but found "));
    }

    private final void zzj(byte b5) {
        zzd();
        if (this.zzb.zzb() == b5) {
            return;
        }
        throw new IllegalStateException(AbstractC0059i.x("expected major type ", (b5 >> 5) & 7, this.zzb.zzc(), " but found "));
    }

    private final void zzk(byte[] bArr, int i7) {
        int i8 = 0;
        while (i8 != i7) {
            int read = this.zza.read(bArr, i8, i7 - i8);
            if (read != -1) {
                i8 += read;
            } else {
                throw new EOFException();
            }
        }
        this.zzb = null;
    }

    private final byte[] zzl() {
        zzi();
        long zzh = zzh();
        if (zzh >= 0 && zzh <= 2147483647L) {
            if (this.zza.available() >= zzh) {
                int i7 = (int) zzh;
                byte[] bArr = new byte[i7];
                zzk(bArr, i7);
                return bArr;
            }
            throw new EOFException();
        }
        throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
        this.zzd.zzb();
    }

    public final long zza() {
        zzj(Byte.MIN_VALUE);
        zzi();
        long zzh = zzh();
        int i7 = (zzh > 0L ? 1 : (zzh == 0L ? 0 : -1));
        if (i7 >= 0) {
            if (i7 > 0) {
                this.zzd.zzg(zzh);
            }
            return zzh;
        }
        throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
    }

    public final long zzb() {
        boolean z7;
        zzd();
        if (this.zzb.zzb() == 0) {
            z7 = true;
        } else if (this.zzb.zzb() == 32) {
            z7 = false;
        } else {
            throw new IllegalStateException(b.e(this.zzb.zzc(), "expected major type 0 or 1 but found "));
        }
        long zzh = zzh();
        if (zzh >= 0) {
            if (z7) {
                return zzh;
            }
            return ~zzh;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long zzc() {
        zzj((byte) -96);
        zzi();
        long zzh = zzh();
        int i7 = (zzh > 0L ? 1 : (zzh == 0L ? 0 : -1));
        if (i7 >= 0 && zzh <= 4611686018427387903L) {
            if (i7 > 0) {
                this.zzd.zzg(zzh + zzh);
            }
            return zzh;
        }
        throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
    }

    public final zzdt zzd() {
        if (this.zzb == null) {
            int read = this.zza.read();
            if (read == -1) {
                this.zzd.zzb();
                return null;
            }
            zzdt zzdtVar = new zzdt(read);
            this.zzb = zzdtVar;
            byte zzb = zzdtVar.zzb();
            if (zzb != Byte.MIN_VALUE && zzb != -96 && zzb != -64) {
                if (zzb != -32) {
                    if (zzb != 0 && zzb != 32) {
                        if (zzb != 64) {
                            if (zzb == 96) {
                                this.zzd.zze(-2L);
                            } else {
                                throw new IllegalStateException(b.e(this.zzb.zzc(), "invalid major type: "));
                            }
                        } else {
                            this.zzd.zze(-1L);
                        }
                        this.zzd.zzf();
                    }
                } else if (this.zzb.zza() == 31) {
                    this.zzd.zzc();
                }
            }
            this.zzd.zzd();
            this.zzd.zzf();
        }
        return this.zzb;
    }

    public final String zze() {
        zzj((byte) 96);
        return new String(zzl(), StandardCharsets.UTF_8);
    }

    public final boolean zzf() {
        zzj((byte) -32);
        if (this.zzb.zza() <= 24) {
            int zzh = (int) zzh();
            if (zzh == 20) {
                return false;
            }
            if (zzh == 21) {
                return true;
            }
            throw new IllegalStateException("expected FALSE or TRUE");
        }
        throw new IllegalStateException("expected simple value");
    }

    public final byte[] zzg() {
        zzj((byte) 64);
        return zzl();
    }
}
