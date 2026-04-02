package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import m5.d;
import n3.c0;
import o3.c;
import o3.h;
@Deprecated
/* loaded from: classes.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new c0(10);

    /* renamed from: X  reason: collision with root package name */
    public final String f9415X;

    /* renamed from: a  reason: collision with root package name */
    public final Integer f9416a;

    /* renamed from: b  reason: collision with root package name */
    public final Double f9417b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f9418c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f9419d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f9420e;
    public final c f;

    public SignRequestParams(Integer num, Double d7, Uri uri, byte[] bArr, ArrayList arrayList, c cVar, String str) {
        boolean z7;
        boolean z8;
        this.f9416a = num;
        this.f9417b = d7;
        this.f9418c = uri;
        this.f9419d = bArr;
        boolean z9 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.a("registeredKeys must not be null or empty", z7);
        this.f9420e = arrayList;
        this.f = cVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar.f14585b != null || uri != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            I.a("registered key has null appId and no request appId is provided", z8);
            String str2 = hVar.f14585b;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        I.a("Display Hint cannot be longer than 80 characters", (str == null || str.length() <= 80) ? true : z9);
        this.f9415X = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (I.m(this.f9416a, signRequestParams.f9416a) && I.m(this.f9417b, signRequestParams.f9417b) && I.m(this.f9418c, signRequestParams.f9418c) && Arrays.equals(this.f9419d, signRequestParams.f9419d)) {
            ArrayList arrayList = this.f9420e;
            ArrayList arrayList2 = signRequestParams.f9420e;
            if (arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList) && I.m(this.f, signRequestParams.f) && I.m(this.f9415X, signRequestParams.f9415X)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f9419d));
        return Arrays.hashCode(new Object[]{this.f9416a, this.f9418c, this.f9417b, this.f9420e, this.f, this.f9415X, valueOf});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.y(parcel, 2, this.f9416a);
        d.s(parcel, 3, this.f9417b);
        d.A(parcel, 4, this.f9418c, i7, false);
        d.r(parcel, 5, this.f9419d, false);
        d.F(parcel, 6, this.f9420e, false);
        d.A(parcel, 7, this.f, i7, false);
        d.B(parcel, 8, this.f9415X, false);
        d.J(G2, parcel);
    }
}
