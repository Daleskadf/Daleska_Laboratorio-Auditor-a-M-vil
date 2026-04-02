package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class T extends X2.a {
    public static final Parcelable.Creator<T> CREATOR = new android.support.v4.media.session.b(29);

    /* renamed from: a  reason: collision with root package name */
    public final byte[][] f14194a;

    public T(byte[][] bArr) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (bArr != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        com.google.android.gms.common.internal.I.c(z7);
        if (1 != ((bArr.length & 1) ^ 1)) {
            z8 = false;
        } else {
            z8 = true;
        }
        com.google.android.gms.common.internal.I.c(z8);
        for (int i7 = 0; i7 < bArr.length; i7 += 2) {
            if (i7 == 0 || bArr[i7] != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            com.google.android.gms.common.internal.I.c(z9);
            int i8 = i7 + 1;
            if (bArr[i8] != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            com.google.android.gms.common.internal.I.c(z10);
            int length = bArr[i8].length;
            if (length == 32 || length == 64) {
                z11 = true;
            } else {
                z11 = false;
            }
            com.google.android.gms.common.internal.I.c(z11);
        }
        this.f14194a = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof T)) {
            return false;
        }
        return Arrays.deepEquals(this.f14194a, ((T) obj).f14194a);
    }

    public final int hashCode() {
        byte[][] bArr = this.f14194a;
        int length = bArr.length;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            i7 ^= Arrays.hashCode(new Object[]{bArr[i8]});
        }
        return i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        byte[][] bArr = this.f14194a;
        if (bArr != null) {
            int G7 = m5.d.G(1, parcel);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            m5.d.J(G7, parcel);
        }
        m5.d.J(G2, parcel);
    }
}
