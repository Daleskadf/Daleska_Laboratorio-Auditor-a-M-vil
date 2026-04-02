package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.b;
import e2.C0962b;
import e2.InterfaceC0963c;
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(18);

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0963c f8074a;

    public ParcelImpl(Parcel parcel) {
        this.f8074a = new C0962b(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        new C0962b(parcel).l(this.f8074a);
    }
}
