package a4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class G extends X2.a {
    public static final Parcelable.Creator<G> CREATOR = new W2.m(16);

    /* renamed from: a  reason: collision with root package name */
    public final String f6962a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6963b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6964c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6965d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri f6966e;

    public G(String str, String str2, boolean z7, boolean z8) {
        Uri parse;
        this.f6962a = str;
        this.f6963b = str2;
        this.f6964c = z7;
        this.f6965d = z8;
        if (TextUtils.isEmpty(str2)) {
            parse = null;
        } else {
            parse = Uri.parse(str2);
        }
        this.f6966e = parse;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 2, this.f6962a, false);
        m5.d.B(parcel, 3, this.f6963b, false);
        m5.d.K(parcel, 4, 4);
        parcel.writeInt(this.f6964c ? 1 : 0);
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(this.f6965d ? 1 : 0);
        m5.d.J(G2, parcel);
    }
}
