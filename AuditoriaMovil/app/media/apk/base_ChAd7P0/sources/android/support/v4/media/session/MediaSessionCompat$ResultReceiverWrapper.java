package android.support.v4.media.session;

import W2.m;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
/* loaded from: classes.dex */
public final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper> CREATOR = new m(27);

    /* renamed from: a  reason: collision with root package name */
    public ResultReceiver f7242a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        this.f7242a.writeToParcel(parcel, i7);
    }
}
