package w1;

import D.AbstractC0059i;
import H0.E;
import H0.G;
import H0.r;
import android.os.Parcel;
import android.os.Parcelable;
import s3.C1770E;
/* renamed from: w1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1949a implements G {
    public static final Parcelable.Creator<C1949a> CREATOR = new C1770E(22);

    /* renamed from: a  reason: collision with root package name */
    public final int f16331a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16332b;

    public C1949a(int i7, String str) {
        this.f16331a = i7;
        this.f16332b = str;
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

    @Override // H0.G
    public final /* synthetic */ byte[] h() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f16331a);
        sb.append(",url=");
        return AbstractC0059i.D(sb, this.f16332b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f16332b);
        parcel.writeInt(this.f16331a);
    }
}
