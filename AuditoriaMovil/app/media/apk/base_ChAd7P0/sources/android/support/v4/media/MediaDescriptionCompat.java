package android.support.v4.media;

import W2.m;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new m(23);

    /* renamed from: X  reason: collision with root package name */
    public final Bundle f7229X;

    /* renamed from: Y  reason: collision with root package name */
    public final Uri f7230Y;

    /* renamed from: Z  reason: collision with root package name */
    public MediaDescription f7231Z;

    /* renamed from: a  reason: collision with root package name */
    public final String f7232a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f7233b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f7234c;

    /* renamed from: d  reason: collision with root package name */
    public final CharSequence f7235d;

    /* renamed from: e  reason: collision with root package name */
    public final Bitmap f7236e;
    public final Uri f;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f7232a = str;
        this.f7233b = charSequence;
        this.f7234c = charSequence2;
        this.f7235d = charSequence3;
        this.f7236e = bitmap;
        this.f = uri;
        this.f7229X = bundle;
        this.f7230Y = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f7233b) + ", " + ((Object) this.f7234c) + ", " + ((Object) this.f7235d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        MediaDescription mediaDescription = this.f7231Z;
        if (mediaDescription == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f7232a);
            builder.setTitle(this.f7233b);
            builder.setSubtitle(this.f7234c);
            builder.setDescription(this.f7235d);
            builder.setIconBitmap(this.f7236e);
            builder.setIconUri(this.f);
            builder.setExtras(this.f7229X);
            builder.setMediaUri(this.f7230Y);
            mediaDescription = builder.build();
            this.f7231Z = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i7);
    }
}
