package com.google.android.gms.auth;

import N2.f;
import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import m5.d;
/* loaded from: classes.dex */
public class TokenData extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new f(2);

    /* renamed from: X  reason: collision with root package name */
    public final String f9085X;

    /* renamed from: a  reason: collision with root package name */
    public final int f9086a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9087b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f9088c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9089d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9090e;
    public final ArrayList f;

    public TokenData(int i7, String str, Long l8, boolean z7, boolean z8, ArrayList arrayList, String str2) {
        this.f9086a = i7;
        I.e(str);
        this.f9087b = str;
        this.f9088c = l8;
        this.f9089d = z7;
        this.f9090e = z8;
        this.f = arrayList;
        this.f9085X = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.f9087b, tokenData.f9087b) || !I.m(this.f9088c, tokenData.f9088c) || this.f9089d != tokenData.f9089d || this.f9090e != tokenData.f9090e || !I.m(this.f, tokenData.f) || !I.m(this.f9085X, tokenData.f9085X)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9087b, this.f9088c, Boolean.valueOf(this.f9089d), Boolean.valueOf(this.f9090e), this.f, this.f9085X});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.K(parcel, 1, 4);
        parcel.writeInt(this.f9086a);
        d.B(parcel, 2, this.f9087b, false);
        d.z(parcel, 3, this.f9088c);
        d.K(parcel, 4, 4);
        parcel.writeInt(this.f9089d ? 1 : 0);
        d.K(parcel, 5, 4);
        parcel.writeInt(this.f9090e ? 1 : 0);
        d.D(parcel, 6, this.f);
        d.B(parcel, 7, this.f9085X, false);
        d.J(G2, parcel);
    }
}
