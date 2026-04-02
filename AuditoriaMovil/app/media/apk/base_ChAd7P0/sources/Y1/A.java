package Y1;

import android.os.Parcel;
import android.os.Parcelable;
import o0.AbstractC1547b;
import p.D0;
import p.T0;
/* loaded from: classes.dex */
public final class A implements Parcelable.ClassLoaderCreator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6595a;

    public /* synthetic */ A(int i7) {
        this.f6595a = i7;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f6595a) {
            case 0:
                return new B(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC1547b.f14516b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new D0(parcel, classLoader);
            default:
                return new T0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f6595a) {
            case 0:
                return new B[i7];
            case 1:
                return new AbstractC1547b[i7];
            case 2:
                return new D0[i7];
            default:
                return new T0[i7];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6595a) {
            case 0:
                return new B(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC1547b.f14516b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new D0(parcel, null);
            default:
                return new T0(parcel, null);
        }
    }
}
