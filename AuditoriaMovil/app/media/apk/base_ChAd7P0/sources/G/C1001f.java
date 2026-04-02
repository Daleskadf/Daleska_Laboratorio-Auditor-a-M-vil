package g;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.j;
/* renamed from: g.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1001f implements Parcelable {
    public static final Parcelable.Creator<C1001f> CREATOR = new android.support.v4.media.session.b(20);

    /* renamed from: a  reason: collision with root package name */
    public final IntentSender f11080a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f11081b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11082c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11083d;

    public C1001f(IntentSender intentSender, Intent intent, int i7, int i8) {
        this.f11080a = intentSender;
        this.f11081b = intent;
        this.f11082c = i7;
        this.f11083d = i8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        j.e(dest, "dest");
        dest.writeParcelable(this.f11080a, i7);
        dest.writeParcelable(this.f11081b, i7);
        dest.writeInt(this.f11082c);
        dest.writeInt(this.f11083d);
    }
}
