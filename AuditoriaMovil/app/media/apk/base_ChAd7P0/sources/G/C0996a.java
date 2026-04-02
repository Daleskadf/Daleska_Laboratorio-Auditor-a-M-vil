package g;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.j;
/* renamed from: g.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0996a implements Parcelable {
    public static final Parcelable.Creator<C0996a> CREATOR = new android.support.v4.media.session.b(19);

    /* renamed from: a  reason: collision with root package name */
    public final int f11075a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f11076b;

    public C0996a(Intent intent, int i7) {
        this.f11075a = i7;
        this.f11076b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i7 = this.f11075a;
        if (i7 != -1) {
            if (i7 != 0) {
                str = String.valueOf(i7);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.f11076b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        int i8;
        j.e(dest, "dest");
        dest.writeInt(this.f11075a);
        Intent intent = this.f11076b;
        if (intent == null) {
            i8 = 0;
        } else {
            i8 = 1;
        }
        dest.writeInt(i8);
        if (intent != null) {
            intent.writeToParcel(dest, i7);
        }
    }
}
