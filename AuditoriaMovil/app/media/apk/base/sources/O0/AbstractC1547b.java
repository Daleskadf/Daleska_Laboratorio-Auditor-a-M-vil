package o0;

import Y1.A;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: o0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1547b implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable f14517a;

    /* renamed from: b  reason: collision with root package name */
    public static final C1546a f14516b = new AbstractC1547b();
    public static final Parcelable.Creator<AbstractC1547b> CREATOR = new A(1);

    public AbstractC1547b() {
        this.f14517a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f14517a, i7);
    }

    public AbstractC1547b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f14517a = parcelable == f14516b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC1547b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f14517a = readParcelable == null ? f14516b : readParcelable;
    }
}
