package a4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class v extends AbstractC0456e implements Cloneable {
    public static final Parcelable.Creator<v> CREATOR = new W2.m(11);

    /* renamed from: a  reason: collision with root package name */
    public final String f7048a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7049b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7050c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7051d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7052e;

    public v(String str, String str2, String str3, String str4, boolean z7) {
        boolean z8;
        if ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))) {
            z8 = true;
        } else {
            z8 = false;
        }
        com.google.android.gms.common.internal.I.a("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", z8);
        this.f7048a = str;
        this.f7049b = str2;
        this.f7050c = str3;
        this.f7051d = z7;
        this.f7052e = str4;
    }

    public static v n(String str, String str2) {
        return new v(str, str2, null, null, true);
    }

    public final Object clone() {
        boolean z7 = this.f7051d;
        return new v(this.f7048a, this.f7049b, this.f7050c, this.f7052e, z7);
    }

    @Override // a4.AbstractC0456e
    public final String k() {
        return "phone";
    }

    @Override // a4.AbstractC0456e
    public final String l() {
        return "phone";
    }

    @Override // a4.AbstractC0456e
    public final AbstractC0456e m() {
        return (v) clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f7048a, false);
        m5.d.B(parcel, 2, this.f7049b, false);
        m5.d.B(parcel, 4, this.f7050c, false);
        boolean z7 = this.f7051d;
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(z7 ? 1 : 0);
        m5.d.B(parcel, 6, this.f7052e, false);
        m5.d.J(G2, parcel);
    }
}
