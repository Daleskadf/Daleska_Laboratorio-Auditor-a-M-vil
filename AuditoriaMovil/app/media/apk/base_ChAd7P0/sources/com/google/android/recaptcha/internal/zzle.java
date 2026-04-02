package com.google.android.recaptcha.internal;

import D.AbstractC0059i;
import io.flutter.plugins.pathprovider.b;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class zzle implements Iterable, Serializable {
    public static final zzle zzb = new zzlc(zznl.zzb);
    private int zza = 0;

    static {
        int i7 = zzks.zza;
    }

    public static int zzi(int i7, int i8, int i9) {
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

    public static zzle zzk(byte[] bArr, int i7, int i8) {
        zzi(i7, i7 + i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return new zzlc(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.zza;
        if (i7 == 0) {
            int zzd = zzd();
            i7 = zzf(zzd, 0, zzd);
            if (i7 == 0) {
                i7 = 1;
            }
            this.zza = i7;
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzkx(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd = zzd();
        if (zzd() <= 50) {
            concat = zzpg.zza(this);
        } else {
            concat = zzpg.zza(zzg(0, 47)).concat("...");
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

    public abstract int zzf(int i7, int i8, int i9);

    public abstract zzle zzg(int i7, int i8);

    public abstract void zzh(zzkw zzkwVar);

    public final int zzj() {
        return this.zza;
    }

    public final byte[] zzl() {
        int zzd = zzd();
        if (zzd == 0) {
            return zznl.zzb;
        }
        byte[] bArr = new byte[zzd];
        zze(bArr, 0, 0, zzd);
        return bArr;
    }
}
