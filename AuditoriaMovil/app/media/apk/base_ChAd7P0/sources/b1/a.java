package B1;

import D.AbstractC0055e;
import H0.E;
import H0.G;
import H0.r;
import android.os.Parcel;
import android.os.Parcelable;
import s3.C1772G;
/* loaded from: classes.dex */
public final class a implements G {
    public static final Parcelable.Creator<a> CREATOR = new C1772G(12);

    /* renamed from: a  reason: collision with root package name */
    public final long f230a;

    /* renamed from: b  reason: collision with root package name */
    public final long f231b;

    /* renamed from: c  reason: collision with root package name */
    public final long f232c;

    /* renamed from: d  reason: collision with root package name */
    public final long f233d;

    /* renamed from: e  reason: collision with root package name */
    public final long f234e;

    public a(long j, long j8, long j9, long j10, long j11) {
        this.f230a = j;
        this.f231b = j8;
        this.f232c = j9;
        this.f233d = j10;
        this.f234e = j11;
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f230a == aVar.f230a && this.f231b == aVar.f231b && this.f232c == aVar.f232c && this.f233d == aVar.f233d && this.f234e == aVar.f234e) {
            return true;
        }
        return false;
    }

    @Override // H0.G
    public final /* synthetic */ byte[] h() {
        return null;
    }

    public final int hashCode() {
        int l8 = AbstractC0055e.l(this.f231b);
        int l9 = AbstractC0055e.l(this.f232c);
        int l10 = AbstractC0055e.l(this.f233d);
        return AbstractC0055e.l(this.f234e) + ((l10 + ((l9 + ((l8 + ((AbstractC0055e.l(this.f230a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f230a + ", photoSize=" + this.f231b + ", photoPresentationTimestampUs=" + this.f232c + ", videoStartPosition=" + this.f233d + ", videoSize=" + this.f234e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f230a);
        parcel.writeLong(this.f231b);
        parcel.writeLong(this.f232c);
        parcel.writeLong(this.f233d);
        parcel.writeLong(this.f234e);
    }

    public a(Parcel parcel) {
        this.f230a = parcel.readLong();
        this.f231b = parcel.readLong();
        this.f232c = parcel.readLong();
        this.f233d = parcel.readLong();
        this.f234e = parcel.readLong();
    }
}
