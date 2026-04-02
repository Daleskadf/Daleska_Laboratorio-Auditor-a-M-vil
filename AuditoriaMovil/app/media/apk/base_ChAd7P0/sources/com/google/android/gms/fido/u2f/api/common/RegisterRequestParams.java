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
import o3.g;
import o3.h;
@Deprecated
/* loaded from: classes.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new c0(8);

    /* renamed from: X  reason: collision with root package name */
    public final String f9409X;

    /* renamed from: a  reason: collision with root package name */
    public final Integer f9410a;

    /* renamed from: b  reason: collision with root package name */
    public final Double f9411b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f9412c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f9413d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f9414e;
    public final c f;

    public RegisterRequestParams(Integer num, Double d7, Uri uri, ArrayList arrayList, ArrayList arrayList2, c cVar, String str) {
        boolean z7;
        boolean z8;
        boolean z9;
        this.f9410a = num;
        this.f9411b = d7;
        this.f9412c = uri;
        boolean z10 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.a("empty list of register requests is provided", z7);
        this.f9413d = arrayList;
        this.f9414e = arrayList2;
        this.f = cVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (uri != null || gVar.f14583d != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            I.a("register request has null appId and no request appId is provided", z9);
            String str2 = gVar.f14583d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            h hVar = (h) it2.next();
            if (uri != null || hVar.f14585b != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            I.a("registered key has null appId and no request appId is provided", z8);
            String str3 = hVar.f14585b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        I.a("Display Hint cannot be longer than 80 characters", (str == null || str.length() <= 80) ? true : z10);
        this.f9409X = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        if (I.m(this.f9410a, registerRequestParams.f9410a) && I.m(this.f9411b, registerRequestParams.f9411b) && I.m(this.f9412c, registerRequestParams.f9412c) && I.m(this.f9413d, registerRequestParams.f9413d)) {
            ArrayList arrayList = this.f9414e;
            ArrayList arrayList2 = registerRequestParams.f9414e;
            if (((arrayList == null && arrayList2 == null) || (arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList))) && I.m(this.f, registerRequestParams.f) && I.m(this.f9409X, registerRequestParams.f9409X)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9410a, this.f9412c, this.f9411b, this.f9413d, this.f9414e, this.f, this.f9409X});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.y(parcel, 2, this.f9410a);
        d.s(parcel, 3, this.f9411b);
        d.A(parcel, 4, this.f9412c, i7, false);
        d.F(parcel, 5, this.f9413d, false);
        d.F(parcel, 6, this.f9414e, false);
        d.A(parcel, 7, this.f, i7, false);
        d.B(parcel, 8, this.f9409X, false);
        d.J(G2, parcel);
    }
}
