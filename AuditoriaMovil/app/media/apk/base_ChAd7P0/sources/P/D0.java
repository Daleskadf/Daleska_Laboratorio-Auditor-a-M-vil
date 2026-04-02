package p;

import android.os.Parcel;
import android.os.Parcelable;
import o0.AbstractC1547b;
/* loaded from: classes.dex */
public final class D0 extends AbstractC1547b {
    public static final Parcelable.Creator<D0> CREATOR = new Y1.A(2);

    /* renamed from: c  reason: collision with root package name */
    public boolean f14648c;

    public D0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f14648c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f14648c + "}";
    }

    @Override // o0.AbstractC1547b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeValue(Boolean.valueOf(this.f14648c));
    }
}
