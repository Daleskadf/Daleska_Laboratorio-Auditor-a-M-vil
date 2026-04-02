package C1;

import H0.E;
import H0.G;
import H0.r;
/* loaded from: classes.dex */
public abstract class b implements G {
    @Override // H0.G
    public final /* synthetic */ r b() {
        return null;
    }

    @Override // H0.G
    public final /* synthetic */ void c(E e7) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // H0.G
    public final /* synthetic */ byte[] h() {
        return null;
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
