package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import D.AbstractC0059i;
import com.google.android.gms.common.api.f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.pathprovider.b;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public abstract class zzdf implements Iterable, Serializable {
    public static final zzdf zzb = new zzde(zzep.zzb);
    private int zza = 0;

    static {
        int i7 = zzct.zza;
    }

    private static zzdf zzc(Iterator it, int i7) {
        if (i7 > 0) {
            if (i7 == 1) {
                return (zzdf) it.next();
            }
            int i8 = i7 >>> 1;
            zzdf zzc = zzc(it, i8);
            zzdf zzc2 = zzc(it, i7 - i8);
            if (f.API_PRIORITY_OTHER - zzc.zzd() >= zzc2.zzd()) {
                return zzgd.zzy(zzc, zzc2);
            }
            throw new IllegalArgumentException(AbstractC0059i.x("ByteString would be too long: ", zzc.zzd(), zzc2.zzd(), "+"));
        }
        throw new IllegalArgumentException(b.f("length (", i7, ") must be >= 1"));
    }

    public static int zzo(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) < 0) {
            if (i7 >= 0) {
                if (i8 < i7) {
                    throw new IndexOutOfBoundsException(AbstractC0059i.x("Beginning index larger than ending index: ", i7, i8, ", "));
                }
                throw new IndexOutOfBoundsException(AbstractC0059i.x("End index: ", i8, i9, " >= "));
            }
            throw new IndexOutOfBoundsException(b.f("Beginning index: ", i7, " < 0"));
        }
        return i10;
    }

    public static zzdf zzr(byte[] bArr, int i7, int i8) {
        zzo(i7, i7 + i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return new zzde(bArr2);
    }

    public static zzdf zzs(InputStream inputStream) {
        zzdf zzr;
        ArrayList arrayList = new ArrayList();
        int i7 = RecognitionOptions.QR_CODE;
        while (true) {
            byte[] bArr = new byte[i7];
            int i8 = 0;
            while (i8 < i7) {
                int read = inputStream.read(bArr, i8, i7 - i8);
                if (read == -1) {
                    break;
                }
                i8 += read;
            }
            if (i8 == 0) {
                zzr = null;
            } else {
                zzr = zzr(bArr, 0, i8);
            }
            if (zzr == null) {
                break;
            }
            arrayList.add(zzr);
            i7 = Math.min(i7 + i7, 8192);
        }
        int size = arrayList.size();
        if (size == 0) {
            return zzb;
        }
        return zzc(arrayList.iterator(), size);
    }

    public static void zzu(int i7, int i8) {
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException(b.e(i7, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0059i.x("Index > length: ", i7, i8, ", "));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.zza;
        if (i7 == 0) {
            int zzd = zzd();
            i7 = zzi(zzd, 0, zzd);
            if (i7 == 0) {
                i7 = 1;
            }
            this.zza = i7;
        }
        return i7;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd = zzd();
        if (zzd() <= 50) {
            concat = zzgq.zza(this);
        } else {
            concat = zzgq.zza(zzk(0, 47)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(zzd);
        sb.append(" contents=\"");
        return AbstractC0059i.D(sb, concat, "\">");
    }

    public abstract byte zza(int i7);

    public abstract byte zzb(int i7);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i7, int i8, int i9);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i7, int i8, int i9);

    public abstract int zzj(int i7, int i8, int i9);

    public abstract zzdf zzk(int i7, int i8);

    public abstract String zzl(Charset charset);

    public abstract void zzm(zzcx zzcxVar);

    public abstract boolean zzn();

    public final int zzp() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzq */
    public zzdb iterator() {
        return new zzcy(this);
    }

    public final String zzt() {
        Charset charset = zzep.zza;
        if (zzd() == 0) {
            return StringUtils.EMPTY;
        }
        return zzl(charset);
    }

    @Deprecated
    public final void zzv(byte[] bArr, int i7, int i8, int i9) {
        zzo(0, i9, zzd());
        zzo(i8, i8 + i9, bArr.length);
        if (i9 > 0) {
            zze(bArr, 0, i8, i9);
        }
    }

    public final byte[] zzw() {
        int zzd = zzd();
        if (zzd == 0) {
            return zzep.zzb;
        }
        byte[] bArr = new byte[zzd];
        zze(bArr, 0, 0, zzd);
        return bArr;
    }
}
