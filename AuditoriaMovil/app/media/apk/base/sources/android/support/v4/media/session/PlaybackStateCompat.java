package android.support.v4.media.session;

import D.AbstractC0059i;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new b(0);

    /* renamed from: X  reason: collision with root package name */
    public final CharSequence f7249X;

    /* renamed from: Y  reason: collision with root package name */
    public final long f7250Y;

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f7251Z;

    /* renamed from: a  reason: collision with root package name */
    public final int f7252a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7253b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7254c;

    /* renamed from: d  reason: collision with root package name */
    public final float f7255d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7256e;

    /* renamed from: e0  reason: collision with root package name */
    public final long f7257e0;
    public final int f;

    /* renamed from: f0  reason: collision with root package name */
    public final Bundle f7258f0;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();

        /* renamed from: a  reason: collision with root package name */
        public final String f7259a;

        /* renamed from: b  reason: collision with root package name */
        public final CharSequence f7260b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7261c;

        /* renamed from: d  reason: collision with root package name */
        public final Bundle f7262d;

        public CustomAction(Parcel parcel) {
            this.f7259a = parcel.readString();
            this.f7260b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f7261c = parcel.readInt();
            this.f7262d = parcel.readBundle(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f7260b) + ", mIcon=" + this.f7261c + ", mExtras=" + this.f7262d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f7259a);
            TextUtils.writeToParcel(this.f7260b, parcel, i7);
            parcel.writeInt(this.f7261c);
            parcel.writeBundle(this.f7262d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f7252a = parcel.readInt();
        this.f7253b = parcel.readLong();
        this.f7255d = parcel.readFloat();
        this.f7250Y = parcel.readLong();
        this.f7254c = parcel.readLong();
        this.f7256e = parcel.readLong();
        this.f7249X = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f7251Z = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f7257e0 = parcel.readLong();
        this.f7258f0 = parcel.readBundle(a.class.getClassLoader());
        this.f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f7252a);
        sb.append(", position=");
        sb.append(this.f7253b);
        sb.append(", buffered position=");
        sb.append(this.f7254c);
        sb.append(", speed=");
        sb.append(this.f7255d);
        sb.append(", updated=");
        sb.append(this.f7250Y);
        sb.append(", actions=");
        sb.append(this.f7256e);
        sb.append(", error code=");
        sb.append(this.f);
        sb.append(", error message=");
        sb.append(this.f7249X);
        sb.append(", custom actions=");
        sb.append(this.f7251Z);
        sb.append(", active item id=");
        return AbstractC0059i.C(sb, this.f7257e0, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f7252a);
        parcel.writeLong(this.f7253b);
        parcel.writeFloat(this.f7255d);
        parcel.writeLong(this.f7250Y);
        parcel.writeLong(this.f7254c);
        parcel.writeLong(this.f7256e);
        TextUtils.writeToParcel(this.f7249X, parcel, i7);
        parcel.writeTypedList(this.f7251Z);
        parcel.writeLong(this.f7257e0);
        parcel.writeBundle(this.f7258f0);
        parcel.writeInt(this.f);
    }
}
