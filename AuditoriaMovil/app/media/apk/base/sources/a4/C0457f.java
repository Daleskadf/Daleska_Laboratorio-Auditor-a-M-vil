package a4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* renamed from: a4.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0457f extends AbstractC0456e {
    public static final Parcelable.Creator<C0457f> CREATOR = new W2.m(20);

    /* renamed from: a  reason: collision with root package name */
    public final String f7029a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7030b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7031c;

    /* renamed from: d  reason: collision with root package name */
    public String f7032d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7033e;

    public C0457f(String str, String str2, String str3, String str4, boolean z7) {
        com.google.android.gms.common.internal.I.e(str);
        this.f7029a = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f7030b = str2;
        this.f7031c = str3;
        this.f7032d = str4;
        this.f7033e = z7;
    }

    @Override // a4.AbstractC0456e
    public final String k() {
        return "password";
    }

    @Override // a4.AbstractC0456e
    public final String l() {
        if (!TextUtils.isEmpty(this.f7030b)) {
            return "password";
        }
        return "emailLink";
    }

    @Override // a4.AbstractC0456e
    public final AbstractC0456e m() {
        return new C0457f(this.f7029a, this.f7030b, this.f7031c, this.f7032d, this.f7033e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f7029a, false);
        m5.d.B(parcel, 2, this.f7030b, false);
        m5.d.B(parcel, 3, this.f7031c, false);
        m5.d.B(parcel, 4, this.f7032d, false);
        boolean z7 = this.f7033e;
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(z7 ? 1 : 0);
        m5.d.J(G2, parcel);
    }
}
