package z0;

import android.os.Parcel;
import android.os.Parcelable;
import z1.C2067b;
import z1.C2068c;
/* loaded from: classes.dex */
public final class P implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16695a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f16695a) {
            case 0:
                return new Q(parcel);
            case 1:
                return new C2067b(parcel);
            default:
                return new C2068c(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f16695a) {
            case 0:
                return new Q[i7];
            case 1:
                return new C2067b[i7];
            default:
                return new C2068c[i7];
        }
    }
}
