package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class Z extends X2.a {
    public static final Parcelable.Creator<Z> CREATOR = new U(28);

    /* renamed from: a  reason: collision with root package name */
    public final long f14200a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f14201b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f14202c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f14203d;

    public Z(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f14200a = j;
        com.google.android.gms.common.internal.I.i(bArr);
        this.f14201b = bArr;
        com.google.android.gms.common.internal.I.i(bArr2);
        this.f14202c = bArr2;
        com.google.android.gms.common.internal.I.i(bArr3);
        this.f14203d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z7 = (Z) obj;
        if (this.f14200a != z7.f14200a || !Arrays.equals(this.f14201b, z7.f14201b) || !Arrays.equals(this.f14202c, z7.f14202c) || !Arrays.equals(this.f14203d, z7.f14203d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f14200a), this.f14201b, this.f14202c, this.f14203d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 8);
        parcel.writeLong(this.f14200a);
        m5.d.r(parcel, 2, this.f14201b, false);
        m5.d.r(parcel, 3, this.f14202c, false);
        m5.d.r(parcel, 4, this.f14203d, false);
        m5.d.J(G2, parcel);
    }
}
