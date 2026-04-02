package d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: d.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0882d implements Parcelable {
    public static final Parcelable.Creator<C0882d> CREATOR = new android.support.v4.media.session.b(13);

    /* renamed from: a  reason: collision with root package name */
    public InterfaceC0880b f10161a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        synchronized (this) {
            try {
                if (this.f10161a == null) {
                    this.f10161a = new BinderC0881c(this);
                }
                parcel.writeStrongBinder(this.f10161a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i7, Bundle bundle) {
    }
}
