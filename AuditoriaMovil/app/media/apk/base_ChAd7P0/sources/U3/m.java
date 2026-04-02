package U3;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        kotlin.jvm.internal.j.e(source, "source");
        return new p(source.readInt(), source.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new p[i7];
    }
}
