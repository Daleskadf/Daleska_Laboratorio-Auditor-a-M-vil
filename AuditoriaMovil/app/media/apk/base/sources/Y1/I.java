package Y1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new W2.m(3);

    /* renamed from: a  reason: collision with root package name */
    public int f6610a;

    /* renamed from: b  reason: collision with root package name */
    public int f6611b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f6612c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6613d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f6610a + ", mGapDir=" + this.f6611b + ", mHasUnwantedGapAfter=" + this.f6613d + ", mGapPerSpan=" + Arrays.toString(this.f6612c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f6610a);
        parcel.writeInt(this.f6611b);
        parcel.writeInt(this.f6613d ? 1 : 0);
        int[] iArr = this.f6612c;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f6612c);
            return;
        }
        parcel.writeInt(0);
    }
}
