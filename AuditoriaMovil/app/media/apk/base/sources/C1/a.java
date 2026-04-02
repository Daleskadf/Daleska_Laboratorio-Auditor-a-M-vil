package C1;

import D.AbstractC0059i;
import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import s3.C1772G;
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C1772G(16);

    /* renamed from: a  reason: collision with root package name */
    public final long f431a;

    /* renamed from: b  reason: collision with root package name */
    public final long f432b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f433c;

    public a(long j, byte[] bArr, long j8) {
        this.f431a = j8;
        this.f432b = j;
        this.f433c = bArr;
    }

    @Override // C1.b
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.f431a);
        sb.append(", identifier= ");
        return AbstractC0059i.C(sb, this.f432b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f431a);
        parcel.writeLong(this.f432b);
        parcel.writeByteArray(this.f433c);
    }

    public a(Parcel parcel) {
        this.f431a = parcel.readLong();
        this.f432b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i7 = x.f2529a;
        this.f433c = createByteArray;
    }
}
