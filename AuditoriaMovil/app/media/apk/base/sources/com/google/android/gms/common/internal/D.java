package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
/* loaded from: classes.dex */
public final class D extends X2.a {
    public static final Parcelable.Creator<D> CREATOR = new android.support.v4.media.session.b(7);

    /* renamed from: a  reason: collision with root package name */
    public final int f9298a;

    /* renamed from: b  reason: collision with root package name */
    public final Account f9299b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9300c;

    /* renamed from: d  reason: collision with root package name */
    public final GoogleSignInAccount f9301d;

    public D(int i7, Account account, int i8, GoogleSignInAccount googleSignInAccount) {
        this.f9298a = i7;
        this.f9299b = account;
        this.f9300c = i8;
        this.f9301d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f9298a);
        m5.d.A(parcel, 2, this.f9299b, i7, false);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f9300c);
        m5.d.A(parcel, 4, this.f9301d, i7, false);
        m5.d.J(G2, parcel);
    }
}
