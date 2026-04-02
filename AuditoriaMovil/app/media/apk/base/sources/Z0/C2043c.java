package z0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s3.C1770E;
/* renamed from: z0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2043c implements Parcelable {
    public static final Parcelable.Creator<C2043c> CREATOR = new C1770E(27);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f16758a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f16759b;

    public C2043c(Parcel parcel) {
        this.f16758a = parcel.createStringArrayList();
        this.f16759b = parcel.createTypedArrayList(C2042b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f16758a);
        parcel.writeTypedList(this.f16759b);
    }
}
