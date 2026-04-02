package L0;

import D.AbstractC0055e;
import H0.E;
import H0.G;
import H0.r;
import android.os.Parcel;
import android.os.Parcelable;
import s3.C1772G;
/* loaded from: classes.dex */
public final class c implements G {
    public static final Parcelable.Creator<c> CREATOR = new C1772G(28);

    /* renamed from: a  reason: collision with root package name */
    public final long f2826a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2827b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2828c;

    public c(long j, long j8, long j9) {
        this.f2826a = j;
        this.f2827b = j8;
        this.f2828c = j9;
    }

    @Override // H0.G
    public final /* synthetic */ r b() {
        return null;
    }

    @Override // H0.G
    public final /* synthetic */ void c(E e7) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2826a == cVar.f2826a && this.f2827b == cVar.f2827b && this.f2828c == cVar.f2828c) {
            return true;
        }
        return false;
    }

    @Override // H0.G
    public final /* synthetic */ byte[] h() {
        return null;
    }

    public final int hashCode() {
        int l8 = AbstractC0055e.l(this.f2827b);
        return AbstractC0055e.l(this.f2828c) + ((l8 + ((AbstractC0055e.l(this.f2826a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f2826a + ", modification time=" + this.f2827b + ", timescale=" + this.f2828c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f2826a);
        parcel.writeLong(this.f2827b);
        parcel.writeLong(this.f2828c);
    }

    public c(Parcel parcel) {
        this.f2826a = parcel.readLong();
        this.f2827b = parcel.readLong();
        this.f2828c = parcel.readLong();
    }
}
