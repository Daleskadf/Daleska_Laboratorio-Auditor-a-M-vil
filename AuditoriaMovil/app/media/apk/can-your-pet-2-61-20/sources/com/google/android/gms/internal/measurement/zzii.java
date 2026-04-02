package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public abstract class zzii implements Serializable, Iterable<Byte> {
    public static final zzii zza = new zziv(zzjy.zzb);
    private static final zzip zzb = new zziu();
    private static final Comparator<zzii> zzc = new zzik();
    private int zzd = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zza(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract byte zza(int i);

    public abstract zzii zza(int i, int i2);

    protected abstract String zza(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(zzij zzijVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzb(int i);

    public abstract int zzb();

    protected abstract int zzb(int i, int i2, int i3);

    public abstract boolean zzd();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
            } else if (i2 < i) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
            }
        }
        return i4;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i == 0) {
            int zzb2 = zzb();
            i = zzb(zzb2, 0, zzb2);
            if (i == 0) {
                i = 1;
            }
            this.zzd = i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zza() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzir zzc(int i) {
        return new zzir(i);
    }

    public static zzii zza(byte[] bArr, int i, int i2) {
        zza(i, i + i2, bArr.length);
        return new zziv(zzb.zza(bArr, i, i2));
    }

    public static zzii zza(String str) {
        return new zziv(str.getBytes(zzjy.zza));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzii zza(byte[] bArr) {
        return new zziv(bArr);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            str = zzmr.zza(this);
        } else {
            str = zzmr.zza(zza(0, 47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String zzc() {
        return zzb() == 0 ? "" : zza(zzjy.zza);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzil(this);
    }
}
