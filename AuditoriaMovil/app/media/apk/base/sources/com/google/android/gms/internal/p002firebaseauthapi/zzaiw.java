package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import io.flutter.plugins.pathprovider.b;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import org.apache.tika.fork.ForkServer;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaiw  reason: invalid package */
/* loaded from: classes.dex */
public abstract class zzaiw implements Serializable, Iterable<Byte> {
    public static final zzaiw zza = new zzajh(zzaki.zzb);
    private static final zzajd zzb = new zzajg();
    private int zzc = 0;

    static {
        new zzaiy();
    }

    public static /* synthetic */ int zza(byte b5) {
        return b5 & ForkServer.ERROR;
    }

    public static zzaiw zzb(byte[] bArr) {
        return new zzajh(bArr);
    }

    public static zzajf zzc(int i7) {
        return new zzajf(i7);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.zzc;
        if (i7 == 0) {
            int zzb2 = zzb();
            i7 = zzb(zzb2, 0, zzb2);
            if (i7 == 0) {
                i7 = 1;
            }
            this.zzc = i7;
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzaiz(this);
    }

    public final String toString() {
        String z7;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzb2 = zzb();
        if (zzb() <= 50) {
            z7 = zzamo.zza(this);
        } else {
            z7 = AbstractC0059i.z(zzamo.zza(zza(0, 47)), "...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(zzb2);
        sb.append(" contents=\"");
        return AbstractC0059i.D(sb, z7, "\">");
    }

    public abstract byte zza(int i7);

    public abstract zzaiw zza(int i7, int i8);

    public abstract void zza(zzaix zzaixVar);

    public abstract void zza(byte[] bArr, int i7, int i8, int i9);

    public abstract byte zzb(int i7);

    public abstract int zzb();

    public abstract int zzb(int i7, int i8, int i9);

    public abstract zzaji zzc();

    public final byte[] zzd() {
        int zzb2 = zzb();
        if (zzb2 == 0) {
            return zzaki.zzb;
        }
        byte[] bArr = new byte[zzb2];
        zza(bArr, 0, 0, zzb2);
        return bArr;
    }

    public static int zza(int i7, int i8, int i9) {
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

    public final int zza() {
        return this.zzc;
    }

    public static zzaiw zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzaiw zza(byte[] bArr, int i7, int i8) {
        zza(i7, i7 + i8, bArr.length);
        return new zzajh(zzb.zza(bArr, i7, i8));
    }

    public static zzaiw zza(String str) {
        return new zzajh(str.getBytes(zzaki.zza));
    }
}
