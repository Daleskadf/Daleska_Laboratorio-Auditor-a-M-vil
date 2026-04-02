package k0;

import D.AbstractC0059i;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* renamed from: k0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1381h extends View.BaseSavedState {
    public static final Parcelable.Creator<C1381h> CREATOR = new android.support.v4.media.session.b(21);

    /* renamed from: a  reason: collision with root package name */
    public int f13564a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return AbstractC0059i.B(sb, this.f13564a, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f13564a);
    }
}
