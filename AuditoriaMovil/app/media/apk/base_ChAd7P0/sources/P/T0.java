package p;

import android.os.Parcel;
import android.os.Parcelable;
import o0.AbstractC1547b;
/* loaded from: classes.dex */
public final class T0 extends AbstractC1547b {
    public static final Parcelable.Creator<T0> CREATOR = new Y1.A(3);

    /* renamed from: c  reason: collision with root package name */
    public int f14718c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14719d;

    public T0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z7;
        this.f14718c = parcel.readInt();
        if (parcel.readInt() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f14719d = z7;
    }

    @Override // o0.AbstractC1547b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f14718c);
        parcel.writeInt(this.f14719d ? 1 : 0);
    }
}
