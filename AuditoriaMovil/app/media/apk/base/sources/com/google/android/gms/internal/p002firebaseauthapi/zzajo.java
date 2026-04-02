package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.pathprovider.b;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajo  reason: invalid package */
/* loaded from: classes.dex */
public abstract class zzajo extends zzaix {
    private static final Logger zzb = Logger.getLogger(zzajo.class.getName());
    private static final boolean zzc = zzana.zzc();
    zzajq zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajo$zza */
    /* loaded from: classes.dex */
    public static class zza extends zzajo {
        private final byte[] zzb;
        private final int zzc;
        private int zzd;

        public zza(byte[] bArr, int i7, int i8) {
            super();
            if (bArr != null) {
                if (((bArr.length - i8) | i8) >= 0) {
                    this.zzb = bArr;
                    this.zzd = 0;
                    this.zzc = i8;
                    return;
                }
                Locale locale = Locale.US;
                throw new IllegalArgumentException(AbstractC0059i.x("Array range is invalid. Buffer.length=", bArr.length, i8, ", offset=0, length="));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i7, boolean z7) {
            zzj(i7, 0);
            zza(z7 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc() {
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzd(int i7, zzaiw zzaiwVar) {
            zzj(1, 3);
            zzk(2, i7);
            zzc(3, zzaiwVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzf(int i7, long j) {
            zzj(i7, 1);
            zzf(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzg(int i7, int i8) {
            zzj(i7, 5);
            zzi(i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(int i7, int i8) {
            zzj(i7, 0);
            zzj(i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzi(int i7) {
            int i8 = this.zzd;
            try {
                byte[] bArr = this.zzb;
                bArr[i8] = (byte) i7;
                bArr[i8 + 1] = (byte) (i7 >> 8);
                bArr[i8 + 2] = (byte) (i7 >> 16);
                bArr[i8 + 3] = i7 >> 24;
                this.zzd = i8 + 4;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzd(i8, this.zzc, 4, (Throwable) e7);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzj(int i7) {
            if (i7 >= 0) {
                zzl(i7);
            } else {
                zzh(i7);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzk(int i7, int i8) {
            zzj(i7, 0);
            zzl(i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzl(int i7) {
            int i8;
            int i9 = this.zzd;
            while ((i7 & (-128)) != 0) {
                try {
                    i8 = i9 + 1;
                    try {
                        this.zzb[i9] = (byte) (i7 | RecognitionOptions.ITF);
                        i7 >>>= 7;
                        i9 = i8;
                    } catch (IndexOutOfBoundsException e7) {
                        e = e7;
                        i9 = i8;
                        throw new zzd(i9, this.zzc, 1, (Throwable) e);
                    }
                } catch (IndexOutOfBoundsException e8) {
                    e = e8;
                    throw new zzd(i9, this.zzc, 1, (Throwable) e);
                }
            }
            i8 = i9 + 1;
            this.zzb[i9] = (byte) i7;
            this.zzd = i8;
        }

        private final void zzc(byte[] bArr, int i7, int i8) {
            try {
                System.arraycopy(bArr, i7, this.zzb, this.zzd, i8);
                this.zzd += i8;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzd(this.zzd, this.zzc, i8, (Throwable) e7);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zza(byte b5) {
            int i7 = this.zzd;
            try {
                int i8 = i7 + 1;
                try {
                    this.zzb[i7] = b5;
                    this.zzd = i8;
                } catch (IndexOutOfBoundsException e7) {
                    e = e7;
                    i7 = i8;
                    throw new zzd(i7, this.zzc, 1, (Throwable) e);
                }
            } catch (IndexOutOfBoundsException e8) {
                e = e8;
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(byte[] bArr, int i7, int i8) {
            zzl(i8);
            zzc(bArr, 0, i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzf(long j) {
            int i7 = this.zzd;
            try {
                byte[] bArr = this.zzb;
                bArr[i7] = (byte) j;
                bArr[i7 + 1] = (byte) (j >> 8);
                bArr[i7 + 2] = (byte) (j >> 16);
                bArr[i7 + 3] = (byte) (j >> 24);
                bArr[i7 + 4] = (byte) (j >> 32);
                bArr[i7 + 5] = (byte) (j >> 40);
                bArr[i7 + 6] = (byte) (j >> 48);
                bArr[i7 + 7] = (byte) (j >> 56);
                this.zzd = i7 + 8;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzd(i7, this.zzc, 8, (Throwable) e7);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(int i7, long j) {
            zzj(i7, 0);
            zzh(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzj(int i7, int i8) {
            zzl((i7 << 3) | i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(zzaiw zzaiwVar) {
            zzl(zzaiwVar.zzb());
            zzaiwVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc(int i7, zzaiw zzaiwVar) {
            zzj(i7, 2);
            zzb(zzaiwVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(long j) {
            int i7;
            int i8;
            int i9 = this.zzd;
            if (zzajo.zzc && zza() >= 10) {
                while ((j & (-128)) != 0) {
                    zzana.zza(this.zzb, i9, (byte) (((int) j) | RecognitionOptions.ITF));
                    j >>>= 7;
                    i9++;
                }
                i7 = i9 + 1;
                zzana.zza(this.zzb, i9, (byte) j);
            } else {
                while ((j & (-128)) != 0) {
                    try {
                        i8 = i9 + 1;
                    } catch (IndexOutOfBoundsException e7) {
                        e = e7;
                    }
                    try {
                        this.zzb[i9] = (byte) (((int) j) | RecognitionOptions.ITF);
                        j >>>= 7;
                        i9 = i8;
                    } catch (IndexOutOfBoundsException e8) {
                        e = e8;
                        i9 = i8;
                        throw new zzd(i9, this.zzc, 1, (Throwable) e);
                    }
                }
                i7 = i9 + 1;
                try {
                    this.zzb[i9] = (byte) j;
                } catch (IndexOutOfBoundsException e9) {
                    e = e9;
                    i9 = i7;
                    throw new zzd(i9, this.zzc, 1, (Throwable) e);
                }
            }
            this.zzd = i7;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
        public final void zza(byte[] bArr, int i7, int i8) {
            zzc(bArr, i7, i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(zzaln zzalnVar, zzamc zzamcVar) {
            zzl(((zzain) zzalnVar).zza(zzamcVar));
            zzamcVar.zza((zzamc) zzalnVar, (zzanm) this.zza);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc(int i7, zzaln zzalnVar, zzamc zzamcVar) {
            zzj(i7, 2);
            zzl(((zzain) zzalnVar).zza(zzamcVar));
            zzamcVar.zza((zzamc) zzalnVar, (zzanm) this.zza);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i7, zzaln zzalnVar) {
            zzj(1, 3);
            zzk(2, i7);
            zzj(3, 2);
            zzc(zzalnVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc(zzaln zzalnVar) {
            zzl(zzalnVar.zzl());
            zzalnVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i7, String str) {
            zzj(i7, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(String str) {
            int i7 = this.zzd;
            try {
                int zzh = zzajo.zzh(str.length() * 3);
                int zzh2 = zzajo.zzh(str.length());
                if (zzh2 == zzh) {
                    int i8 = i7 + zzh2;
                    this.zzd = i8;
                    int zza = zzanb.zza(str, this.zzb, i8, zza());
                    this.zzd = i7;
                    zzl((zza - i7) - zzh2);
                    this.zzd = zza;
                    return;
                }
                zzl(zzanb.zza(str));
                this.zzd = zzanb.zza(str, this.zzb, this.zzd, zza());
            } catch (zzane e7) {
                this.zzd = i7;
                zza(str, e7);
            } catch (IndexOutOfBoundsException e8) {
                throw new zzd(e8);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajo$zzb */
    /* loaded from: classes.dex */
    public static abstract class zzb extends zzajo {
        final byte[] zzb;
        final int zzc;
        int zzd;
        int zze;

        public zzb(int i7) {
            super();
            if (i7 >= 0) {
                byte[] bArr = new byte[Math.max(i7, 20)];
                this.zzb = bArr;
                this.zzc = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void zzb(byte b5) {
            int i7 = this.zzd;
            this.zzb[i7] = b5;
            this.zzd = i7 + 1;
            this.zze++;
        }

        public final void zzi(long j) {
            int i7 = this.zzd;
            byte[] bArr = this.zzb;
            bArr[i7] = (byte) j;
            bArr[i7 + 1] = (byte) (j >> 8);
            bArr[i7 + 2] = (byte) (j >> 16);
            bArr[i7 + 3] = (byte) (j >> 24);
            bArr[i7 + 4] = (byte) (j >> 32);
            bArr[i7 + 5] = (byte) (j >> 40);
            bArr[i7 + 6] = (byte) (j >> 48);
            bArr[i7 + 7] = (byte) (j >> 56);
            this.zzd = i7 + 8;
            this.zze += 8;
        }

        public final void zzj(long j) {
            if (zzajo.zzc) {
                long j8 = this.zzd;
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i7 = this.zzd;
                    this.zzd = i7 + 1;
                    zzana.zza(bArr, i7, (byte) (((int) j) | RecognitionOptions.ITF));
                    j >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i8 = this.zzd;
                this.zzd = i8 + 1;
                zzana.zza(bArr2, i8, (byte) j);
                this.zze += (int) (this.zzd - j8);
                return;
            }
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.zzb;
                int i9 = this.zzd;
                this.zzd = i9 + 1;
                bArr3[i9] = (byte) (((int) j) | RecognitionOptions.ITF);
                this.zze++;
                j >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i10 = this.zzd;
            this.zzd = i10 + 1;
            bArr4[i10] = (byte) j;
            this.zze++;
        }

        public final void zzl(int i7, int i8) {
            zzn((i7 << 3) | i8);
        }

        public final void zzm(int i7) {
            int i8 = this.zzd;
            byte[] bArr = this.zzb;
            bArr[i8] = (byte) i7;
            bArr[i8 + 1] = (byte) (i7 >> 8);
            bArr[i8 + 2] = (byte) (i7 >> 16);
            bArr[i8 + 3] = i7 >> 24;
            this.zzd = i8 + 4;
            this.zze += 4;
        }

        public final void zzn(int i7) {
            if (zzajo.zzc) {
                long j = this.zzd;
                while ((i7 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i8 = this.zzd;
                    this.zzd = i8 + 1;
                    zzana.zza(bArr, i8, (byte) (i7 | RecognitionOptions.ITF));
                    i7 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i9 = this.zzd;
                this.zzd = i9 + 1;
                zzana.zza(bArr2, i9, (byte) i7);
                this.zze += (int) (this.zzd - j);
                return;
            }
            while ((i7 & (-128)) != 0) {
                byte[] bArr3 = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                bArr3[i10] = (byte) (i7 | RecognitionOptions.ITF);
                this.zze++;
                i7 >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            bArr4[i11] = (byte) i7;
            this.zze++;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajo$zzd */
    /* loaded from: classes.dex */
    public static class zzd extends IOException {
        public zzd() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzd(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        private zzd(String str, Throwable th) {
            super(b.h("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public zzd(int i7, int i8, int i9, Throwable th) {
            this(i7, i8, i9, th);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        private zzd(long j, long j8, int i7, Throwable th) {
            this("Pos: " + j + ", limit: " + j8 + ", len: " + i7, th);
            Locale locale = Locale.US;
        }
    }

    public static int zza(double d7) {
        return 8;
    }

    public static int zzb(int i7) {
        return 4;
    }

    public static int zzc(long j) {
        return 8;
    }

    public static int zzd(int i7) {
        return i7 > 4096 ? RecognitionOptions.AZTEC : i7;
    }

    public static int zze(int i7) {
        return 4;
    }

    public static int zzf(int i7) {
        return zzh(zzm(i7));
    }

    public static int zzg(int i7) {
        return zzh(i7 << 3);
    }

    public static int zzh(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    private static long zzi(long j) {
        return (j >> 63) ^ (j << 1);
    }

    private static int zzm(int i7) {
        return (i7 >> 31) ^ (i7 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b5);

    public abstract void zzb(int i7, zzaln zzalnVar);

    public abstract void zzb(int i7, String str);

    public abstract void zzb(int i7, boolean z7);

    public abstract void zzb(zzaiw zzaiwVar);

    public abstract void zzb(zzaln zzalnVar, zzamc zzamcVar);

    public abstract void zzb(String str);

    public abstract void zzb(byte[] bArr, int i7, int i8);

    public abstract void zzc();

    public abstract void zzc(int i7, zzaiw zzaiwVar);

    public abstract void zzc(int i7, zzaln zzalnVar, zzamc zzamcVar);

    public abstract void zzc(zzaln zzalnVar);

    public abstract void zzd(int i7, zzaiw zzaiwVar);

    public abstract void zzf(int i7, long j);

    public abstract void zzf(long j);

    public abstract void zzg(int i7, int i8);

    public abstract void zzh(int i7, int i8);

    public abstract void zzh(int i7, long j);

    public abstract void zzh(long j);

    public abstract void zzi(int i7);

    public abstract void zzj(int i7);

    public abstract void zzj(int i7, int i8);

    public final void zzk(int i7) {
        zzl(zzm(i7));
    }

    public abstract void zzk(int i7, int i8);

    public abstract void zzl(int i7);

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajo$zzc */
    /* loaded from: classes.dex */
    public static final class zzc extends zzb {
        private final OutputStream zzf;

        public zzc(OutputStream outputStream, int i7) {
            super(i7);
            if (outputStream != null) {
                this.zzf = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        private final void zze() {
            this.zzf.write(this.zzb, 0, this.zzd);
            this.zzd = 0;
        }

        private final void zzo(int i7) {
            if (this.zzc - this.zzd < i7) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zza(byte b5) {
            if (this.zzd == this.zzc) {
                zze();
            }
            zzb(b5);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i7, boolean z7) {
            zzo(11);
            zzl(i7, 0);
            zzb(z7 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc() {
            if (this.zzd > 0) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzd(int i7, zzaiw zzaiwVar) {
            zzj(1, 3);
            zzk(2, i7);
            zzc(3, zzaiwVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzf(int i7, long j) {
            zzo(18);
            zzl(i7, 1);
            zzi(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzg(int i7, int i8) {
            zzo(14);
            zzl(i7, 5);
            zzm(i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(int i7, int i8) {
            zzo(20);
            zzl(i7, 0);
            if (i8 >= 0) {
                zzn(i8);
            } else {
                zzj(i8);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzi(int i7) {
            zzo(4);
            zzm(i7);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzj(int i7) {
            if (i7 >= 0) {
                zzl(i7);
            } else {
                zzh(i7);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzk(int i7, int i8) {
            zzo(20);
            zzl(i7, 0);
            zzn(i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzl(int i7) {
            zzo(5);
            zzn(i7);
        }

        private final void zzc(byte[] bArr, int i7, int i8) {
            int i9 = this.zzc;
            int i10 = this.zzd;
            if (i9 - i10 >= i8) {
                System.arraycopy(bArr, i7, this.zzb, i10, i8);
                this.zzd += i8;
            } else {
                int i11 = i9 - i10;
                System.arraycopy(bArr, i7, this.zzb, i10, i11);
                int i12 = i7 + i11;
                i8 -= i11;
                this.zzd = this.zzc;
                this.zze += i11;
                zze();
                if (i8 <= this.zzc) {
                    System.arraycopy(bArr, i12, this.zzb, 0, i8);
                    this.zzd = i8;
                } else {
                    this.zzf.write(bArr, i12, i8);
                }
            }
            this.zze += i8;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzj(int i7, int i8) {
            zzl((i7 << 3) | i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
        public final void zza(byte[] bArr, int i7, int i8) {
            zzc(bArr, i7, i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(byte[] bArr, int i7, int i8) {
            zzl(i8);
            zzc(bArr, 0, i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzf(long j) {
            zzo(8);
            zzi(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(int i7, long j) {
            zzo(20);
            zzl(i7, 0);
            zzj(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(zzaiw zzaiwVar) {
            zzl(zzaiwVar.zzb());
            zzaiwVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(zzaln zzalnVar, zzamc zzamcVar) {
            zzl(((zzain) zzalnVar).zza(zzamcVar));
            zzamcVar.zza((zzamc) zzalnVar, (zzanm) this.zza);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(long j) {
            zzo(10);
            zzj(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i7, zzaln zzalnVar) {
            zzj(1, 3);
            zzk(2, i7);
            zzj(3, 2);
            zzc(zzalnVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i7, String str) {
            zzj(i7, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc(int i7, zzaiw zzaiwVar) {
            zzj(i7, 2);
            zzb(zzaiwVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(String str) {
            int zza;
            try {
                int length = str.length() * 3;
                int zzh = zzajo.zzh(length);
                int i7 = zzh + length;
                int i8 = this.zzc;
                if (i7 > i8) {
                    byte[] bArr = new byte[length];
                    int zza2 = zzanb.zza(str, bArr, 0, length);
                    zzl(zza2);
                    zza(bArr, 0, zza2);
                    return;
                }
                if (i7 > i8 - this.zzd) {
                    zze();
                }
                int zzh2 = zzajo.zzh(str.length());
                int i9 = this.zzd;
                try {
                    if (zzh2 == zzh) {
                        int i10 = i9 + zzh2;
                        this.zzd = i10;
                        int zza3 = zzanb.zza(str, this.zzb, i10, this.zzc - i10);
                        this.zzd = i9;
                        zza = (zza3 - i9) - zzh2;
                        zzn(zza);
                        this.zzd = zza3;
                    } else {
                        zza = zzanb.zza(str);
                        zzn(zza);
                        this.zzd = zzanb.zza(str, this.zzb, this.zzd, zza);
                    }
                    this.zze += zza;
                } catch (zzane e7) {
                    this.zze -= this.zzd - i9;
                    this.zzd = i9;
                    throw e7;
                } catch (ArrayIndexOutOfBoundsException e8) {
                    throw new zzd(e8);
                }
            } catch (zzane e9) {
                zza(str, e9);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc(int i7, zzaln zzalnVar, zzamc zzamcVar) {
            zzj(i7, 2);
            zzb(zzalnVar, zzamcVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc(zzaln zzalnVar) {
            zzl(zzalnVar.zzl());
            zzalnVar.zza(this);
        }
    }

    private zzajo() {
    }

    public static int zza(float f) {
        return 4;
    }

    public static int zzb(int i7, int i8) {
        return zzh(i7 << 3) + 4;
    }

    public static int zzc(int i7, int i8) {
        return zze(i8) + zzh(i7 << 3);
    }

    public static int zze(int i7, int i8) {
        return zzh(zzm(i8)) + zzh(i7 << 3);
    }

    public static int zzf(int i7, int i8) {
        return zzh(i8) + zzh(i7 << 3);
    }

    public final void zzg(int i7, long j) {
        zzh(i7, zzi(j));
    }

    public final void zzi(int i7, int i8) {
        zzk(i7, zzm(i8));
    }

    public static int zza(long j) {
        return 8;
    }

    public static int zzb(int i7, long j) {
        return zze(j) + zzh(i7 << 3);
    }

    public static int zzd(int i7, int i8) {
        return zzh(i7 << 3) + 4;
    }

    public final void zzg(long j) {
        zzh(zzi(j));
    }

    public static int zza(boolean z7) {
        return 1;
    }

    public static int zzc(int i7) {
        return zze(i7);
    }

    public static int zzd(int i7, long j) {
        return zze(zzi(j)) + zzh(i7 << 3);
    }

    public static int zze(int i7, long j) {
        return zze(j) + zzh(i7 << 3);
    }

    public static int zza(int i7, boolean z7) {
        return zzh(i7 << 3) + 1;
    }

    public static int zzb(long j) {
        return zze(j);
    }

    public static int zzc(int i7, long j) {
        return zzh(i7 << 3) + 8;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzh(length) + length;
    }

    public static int zzb(int i7, zzakv zzakvVar) {
        int zzh = zzh(i7 << 3);
        int zza2 = zzakvVar.zza();
        return zzh(zza2) + zza2 + zzh;
    }

    public static int zzd(long j) {
        return zze(zzi(j));
    }

    public static int zze(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int zza(int i7, zzaiw zzaiwVar) {
        int zzh = zzh(i7 << 3);
        int zzb2 = zzaiwVar.zzb();
        return zzh(zzb2) + zzb2 + zzh;
    }

    public static int zzb(int i7, zzaln zzalnVar, zzamc zzamcVar) {
        return zza(zzalnVar, zzamcVar) + zzh(i7 << 3);
    }

    public static int zza(zzaiw zzaiwVar) {
        int zzb2 = zzaiwVar.zzb();
        return zzh(zzb2) + zzb2;
    }

    public static int zzb(zzaln zzalnVar) {
        int zzl = zzalnVar.zzl();
        return zzh(zzl) + zzl;
    }

    public static int zza(int i7, double d7) {
        return zzh(i7 << 3) + 8;
    }

    public static int zzb(int i7, zzaiw zzaiwVar) {
        int zzf = zzf(2, i7);
        return zza(3, zzaiwVar) + zzf + (zzh(8) << 1);
    }

    public static int zza(int i7, int i8) {
        return zze(i8) + zzh(i7 << 3);
    }

    public static int zza(int i7) {
        return zze(i7);
    }

    public static zzajo zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zza(int i7, long j) {
        return zzh(i7 << 3) + 8;
    }

    public static int zza(int i7, float f) {
        return zzh(i7 << 3) + 4;
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    public static int zza(int i7, zzaln zzalnVar, zzamc zzamcVar) {
        return ((zzain) zzalnVar).zza(zzamcVar) + (zzh(i7 << 3) << 1);
    }

    public final void zzb(boolean z7) {
        zza(z7 ? (byte) 1 : (byte) 0);
    }

    @Deprecated
    public static int zza(zzaln zzalnVar) {
        return zzalnVar.zzl();
    }

    public final void zzb(int i7, double d7) {
        zzf(i7, Double.doubleToRawLongBits(d7));
    }

    public static int zza(int i7, zzakv zzakvVar) {
        int zzf = zzf(2, i7);
        return zzb(3, zzakvVar) + zzf + (zzh(8) << 1);
    }

    public final void zzb(double d7) {
        zzf(Double.doubleToRawLongBits(d7));
    }

    public final void zzb(int i7, float f) {
        zzg(i7, Float.floatToRawIntBits(f));
    }

    public final void zzb(float f) {
        zzi(Float.floatToRawIntBits(f));
    }

    public static int zza(zzakv zzakvVar) {
        int zza2 = zzakvVar.zza();
        return zzh(zza2) + zza2;
    }

    public static int zza(int i7, zzaln zzalnVar) {
        return zzb(zzalnVar) + zzh(24) + zzf(2, i7) + (zzh(8) << 1);
    }

    public static int zza(zzaln zzalnVar, zzamc zzamcVar) {
        int zza2 = ((zzain) zzalnVar).zza(zzamcVar);
        return zzh(zza2) + zza2;
    }

    public static int zza(int i7, String str) {
        return zza(str) + zzh(i7 << 3);
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzanb.zza(str);
        } catch (zzane unused) {
            length = str.getBytes(zzaki.zza).length;
        }
        return zzh(length) + length;
    }

    public static zzajo zza(OutputStream outputStream, int i7) {
        return new zzc(outputStream, i7);
    }

    public final void zza(String str, zzane zzaneVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzaneVar);
        byte[] bytes = str.getBytes(zzaki.zza);
        try {
            zzl(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzd(e7);
        }
    }
}
