package com.google.android.gms.auth.api.signin;

import U2.e;
import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import m5.d;
/* loaded from: classes.dex */
public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new e(2);

    /* renamed from: a  reason: collision with root package name */
    public final String f9133a;

    /* renamed from: b  reason: collision with root package name */
    public final GoogleSignInAccount f9134b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9135c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f9134b = googleSignInAccount;
        I.f(str, "8.3 and 8.4 SDKs require non-null email");
        this.f9133a = str;
        I.f(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f9135c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.B(parcel, 4, this.f9133a, false);
        d.A(parcel, 7, this.f9134b, i7, false);
        d.B(parcel, 8, this.f9135c, false);
        d.J(G2, parcel);
    }
}
