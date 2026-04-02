package android.support.v4.media;

import S.k;
import W2.m;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f7237a;

    static {
        k kVar = new k(0);
        kVar.put("android.media.metadata.TITLE", 1);
        kVar.put("android.media.metadata.ARTIST", 1);
        kVar.put("android.media.metadata.DURATION", 0);
        kVar.put("android.media.metadata.ALBUM", 1);
        kVar.put("android.media.metadata.AUTHOR", 1);
        kVar.put("android.media.metadata.WRITER", 1);
        kVar.put("android.media.metadata.COMPOSER", 1);
        kVar.put("android.media.metadata.COMPILATION", 1);
        kVar.put("android.media.metadata.DATE", 1);
        kVar.put("android.media.metadata.YEAR", 0);
        kVar.put("android.media.metadata.GENRE", 1);
        kVar.put("android.media.metadata.TRACK_NUMBER", 0);
        kVar.put("android.media.metadata.NUM_TRACKS", 0);
        kVar.put("android.media.metadata.DISC_NUMBER", 0);
        kVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        kVar.put("android.media.metadata.ART", 2);
        kVar.put("android.media.metadata.ART_URI", 1);
        kVar.put("android.media.metadata.ALBUM_ART", 2);
        kVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        kVar.put("android.media.metadata.USER_RATING", 3);
        kVar.put("android.media.metadata.RATING", 3);
        kVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        kVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        kVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        kVar.put("android.media.metadata.DISPLAY_ICON", 2);
        kVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        kVar.put("android.media.metadata.MEDIA_ID", 1);
        kVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        kVar.put("android.media.metadata.MEDIA_URI", 1);
        kVar.put("android.media.metadata.ADVERTISEMENT", 0);
        kVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new m(24);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f7237a = parcel.readBundle(a.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeBundle(this.f7237a);
    }
}
