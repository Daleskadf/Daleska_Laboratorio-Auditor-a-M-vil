package com.google.android.gms.auth.api.identity;

import N2.f;
import X2.a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import m5.d;
/* loaded from: classes.dex */
public class AuthorizationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new f(8);

    /* renamed from: X  reason: collision with root package name */
    public final String f9093X;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f9094Y;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f9095a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9096b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9097c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9098d;

    /* renamed from: e  reason: collision with root package name */
    public final Account f9099e;
    public final String f;

    public AuthorizationRequest(ArrayList arrayList, String str, boolean z7, boolean z8, Account account, String str2, String str3, boolean z9) {
        boolean z10 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = true;
        }
        I.a("requestedScopes cannot be null or empty", z10);
        this.f9095a = arrayList;
        this.f9096b = str;
        this.f9097c = z7;
        this.f9098d = z8;
        this.f9099e = account;
        this.f = str2;
        this.f9093X = str3;
        this.f9094Y = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        ArrayList arrayList = this.f9095a;
        if (arrayList.size() != authorizationRequest.f9095a.size() || !arrayList.containsAll(authorizationRequest.f9095a) || this.f9097c != authorizationRequest.f9097c || this.f9094Y != authorizationRequest.f9094Y || this.f9098d != authorizationRequest.f9098d || !I.m(this.f9096b, authorizationRequest.f9096b) || !I.m(this.f9099e, authorizationRequest.f9099e) || !I.m(this.f, authorizationRequest.f) || !I.m(this.f9093X, authorizationRequest.f9093X)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f9097c);
        Boolean valueOf2 = Boolean.valueOf(this.f9094Y);
        Boolean valueOf3 = Boolean.valueOf(this.f9098d);
        return Arrays.hashCode(new Object[]{this.f9095a, this.f9096b, valueOf, valueOf2, valueOf3, this.f9099e, this.f, this.f9093X});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.F(parcel, 1, this.f9095a, false);
        d.B(parcel, 2, this.f9096b, false);
        d.K(parcel, 3, 4);
        parcel.writeInt(this.f9097c ? 1 : 0);
        d.K(parcel, 4, 4);
        parcel.writeInt(this.f9098d ? 1 : 0);
        d.A(parcel, 5, this.f9099e, i7, false);
        d.B(parcel, 6, this.f, false);
        d.B(parcel, 7, this.f9093X, false);
        d.K(parcel, 8, 4);
        parcel.writeInt(this.f9094Y ? 1 : 0);
        d.J(G2, parcel);
    }
}
