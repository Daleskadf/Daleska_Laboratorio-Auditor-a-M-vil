package com.distriqt.extension.share.activities;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ShareOptions implements Parcelable {
    public static final Parcelable.Creator<ShareOptions> CREATOR = new Parcelable.Creator<ShareOptions>() { // from class: com.distriqt.extension.share.activities.ShareOptions.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareOptions createFromParcel(Parcel parcel) {
            return new ShareOptions(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareOptions[] newArray(int i) {
            return new ShareOptions[i];
        }
    };
    public boolean autoScale;
    public boolean cacheBitmapInternally;
    public boolean copyFileToPublic;
    public String packageName;
    public Rect position;
    public boolean showOpenIn;
    public String title;
    public boolean useChooser;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShareOptions() {
        this.position = new Rect(0, 0, 50, 50);
        this.autoScale = false;
        this.title = "Share...";
        this.showOpenIn = false;
        this.useChooser = true;
        this.packageName = "";
        this.copyFileToPublic = false;
    }

    public ShareOptions(Parcel parcel) {
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.position.left);
        parcel.writeInt(this.position.right);
        parcel.writeInt(this.position.top);
        parcel.writeInt(this.position.bottom);
        parcel.writeInt(this.autoScale ? 1 : 0);
        parcel.writeString(this.title);
        parcel.writeInt(this.showOpenIn ? 1 : 0);
        parcel.writeInt(this.useChooser ? 1 : 0);
        parcel.writeString(this.packageName);
    }

    public void readFromParcel(Parcel parcel) {
        Rect rect = new Rect();
        this.position = rect;
        rect.left = parcel.readInt();
        this.position.right = parcel.readInt();
        this.position.top = parcel.readInt();
        this.position.bottom = parcel.readInt();
        this.autoScale = parcel.readInt() == 1;
        this.title = parcel.readString();
        this.showOpenIn = parcel.readInt() == 1;
        this.useChooser = parcel.readInt() == 1;
        this.packageName = parcel.readString();
    }

    public String toString() {
        return String.format(Locale.UK, "position=[%d,%d,%d,%d] autoScale=%b", Integer.valueOf(this.position.left), Integer.valueOf(this.position.right), Integer.valueOf(this.position.top), Integer.valueOf(this.position.bottom), Boolean.valueOf(this.autoScale));
    }

    public static ShareOptions fromJSONObject(JSONObject jSONObject) throws Exception {
        ShareOptions shareOptions = new ShareOptions();
        if (jSONObject.has("title")) {
            shareOptions.title = jSONObject.getString("title");
        }
        if (jSONObject.has("autoScale")) {
            shareOptions.autoScale = jSONObject.getBoolean("autoScale");
        }
        if (jSONObject.has("useChooser")) {
            shareOptions.useChooser = jSONObject.getBoolean("useChooser");
        }
        if (jSONObject.has("packageName")) {
            shareOptions.packageName = jSONObject.getString("packageName");
        }
        if (jSONObject.has("cacheBitmapInternally")) {
            shareOptions.cacheBitmapInternally = jSONObject.getBoolean("cacheBitmapInternally");
        }
        if (jSONObject.has("position")) {
            Rect rect = new Rect();
            JSONObject jSONObject2 = jSONObject.getJSONObject("position");
            rect.left = jSONObject2.getInt("x");
            rect.top = jSONObject2.getInt("y");
            rect.right = jSONObject2.getInt("width");
            rect.bottom = jSONObject2.getInt("height");
            shareOptions.position = rect;
        }
        return shareOptions;
    }
}
