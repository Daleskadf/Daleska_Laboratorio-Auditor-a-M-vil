package Y1;

import android.os.Parcel;
import android.os.Parcelable;
import o0.AbstractC1547b;
/* loaded from: classes.dex */
public final class B extends AbstractC1547b {
    public static final Parcelable.Creator<B> CREATOR = new A(0);

    /* renamed from: c  reason: collision with root package name */
    public Parcelable f6596c;

    public B(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6596c = parcel.readParcelable(classLoader == null ? s.class.getClassLoader() : classLoader);
    }

    @Override // o0.AbstractC1547b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeParcelable(this.f6596c, 0);
    }
}
