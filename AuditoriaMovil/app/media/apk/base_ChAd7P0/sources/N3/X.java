package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class X extends X2.a {
    public static final Parcelable.Creator<X> CREATOR = new U(19);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f14196a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f14197b;

    public X(byte[] bArr, byte[] bArr2) {
        this.f14196a = bArr;
        this.f14197b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof X)) {
            return false;
        }
        X x7 = (X) obj;
        if (!Arrays.equals(this.f14196a, x7.f14196a) || !Arrays.equals(this.f14197b, x7.f14197b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14196a, this.f14197b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.r(parcel, 1, this.f14196a, false);
        m5.d.r(parcel, 2, this.f14197b, false);
        m5.d.J(G2, parcel);
    }
}
