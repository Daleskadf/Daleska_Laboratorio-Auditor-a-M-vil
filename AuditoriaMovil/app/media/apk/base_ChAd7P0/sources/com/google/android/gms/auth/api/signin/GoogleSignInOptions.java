package com.google.android.gms.auth.api.signin;

import U2.d;
import X2.a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInOptions extends a implements e, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: f0  reason: collision with root package name */
    public static final GoogleSignInOptions f9117f0;

    /* renamed from: g0  reason: collision with root package name */
    public static final GoogleSignInOptions f9118g0;

    /* renamed from: h0  reason: collision with root package name */
    public static final Scope f9119h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final Scope f9120i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final Scope f9121j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final Scope f9122k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final d f9123l0;

    /* renamed from: X  reason: collision with root package name */
    public final String f9124X;

    /* renamed from: Y  reason: collision with root package name */
    public final String f9125Y;

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f9126Z;

    /* renamed from: a  reason: collision with root package name */
    public final int f9127a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f9128b;

    /* renamed from: c  reason: collision with root package name */
    public final Account f9129c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9130d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9131e;

    /* renamed from: e0  reason: collision with root package name */
    public final String f9132e0;
    public final boolean f;

    static {
        Scope scope = new Scope(1, "profile");
        f9119h0 = new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f9120i0 = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f9121j0 = scope3;
        f9122k0 = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f9122k0)) {
            Scope scope4 = f9121j0;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f9117f0 = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap, null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f9122k0)) {
            Scope scope5 = f9121j0;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        f9118g0 = new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = new U2.e(1);
        f9123l0 = new d(1);
    }

    public GoogleSignInOptions(int i7, ArrayList arrayList, Account account, boolean z7, boolean z8, boolean z9, String str, String str2, HashMap hashMap, String str3) {
        this.f9127a = i7;
        this.f9128b = arrayList;
        this.f9129c = account;
        this.f9130d = z7;
        this.f9131e = z8;
        this.f = z9;
        this.f9124X = str;
        this.f9125Y = str2;
        this.f9126Z = new ArrayList(hashMap.values());
        this.f9132e0 = str3;
    }

    public static GoogleSignInOptions l(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(1, jSONArray.getString(i7)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z7 = jSONObject.getBoolean("idTokenRequested");
        boolean z8 = jSONObject.getBoolean("serverAuthRequested");
        boolean z9 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z7, z8, z9, str3, str4, new HashMap(), null);
    }

    public static HashMap m(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                V2.a aVar = (V2.a) it.next();
                hashMap.put(Integer.valueOf(aVar.f5939b), aVar);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r1.equals(r4) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.f9124X
            java.util.ArrayList r1 = r7.f9128b
            r2 = 0
            if (r8 != 0) goto L8
            return r2
        L8:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r8 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r8     // Catch: java.lang.ClassCastException -> L77
            java.lang.String r3 = r8.f9124X     // Catch: java.lang.ClassCastException -> L77
            android.accounts.Account r4 = r8.f9129c     // Catch: java.lang.ClassCastException -> L77
            java.util.ArrayList r5 = r7.f9126Z     // Catch: java.lang.ClassCastException -> L77
            boolean r5 = r5.isEmpty()     // Catch: java.lang.ClassCastException -> L77
            if (r5 == 0) goto L77
            java.util.ArrayList r5 = r8.f9126Z     // Catch: java.lang.ClassCastException -> L77
            boolean r5 = r5.isEmpty()     // Catch: java.lang.ClassCastException -> L77
            if (r5 != 0) goto L1f
            goto L77
        L1f:
            int r5 = r1.size()     // Catch: java.lang.ClassCastException -> L77
            java.util.ArrayList r6 = r8.k()     // Catch: java.lang.ClassCastException -> L77
            int r6 = r6.size()     // Catch: java.lang.ClassCastException -> L77
            if (r5 != r6) goto L77
            java.util.ArrayList r5 = r8.k()     // Catch: java.lang.ClassCastException -> L77
            boolean r1 = r1.containsAll(r5)     // Catch: java.lang.ClassCastException -> L77
            if (r1 != 0) goto L38
            goto L77
        L38:
            android.accounts.Account r1 = r7.f9129c     // Catch: java.lang.ClassCastException -> L77
            if (r1 != 0) goto L3f
            if (r4 != 0) goto L77
            goto L45
        L3f:
            boolean r1 = r1.equals(r4)     // Catch: java.lang.ClassCastException -> L77
            if (r1 == 0) goto L77
        L45:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L77
            if (r1 == 0) goto L52
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.ClassCastException -> L77
            if (r0 == 0) goto L77
            goto L59
        L52:
            boolean r0 = r0.equals(r3)     // Catch: java.lang.ClassCastException -> L77
            if (r0 != 0) goto L59
            goto L77
        L59:
            boolean r0 = r7.f     // Catch: java.lang.ClassCastException -> L77
            boolean r1 = r8.f     // Catch: java.lang.ClassCastException -> L77
            if (r0 != r1) goto L77
            boolean r0 = r7.f9130d     // Catch: java.lang.ClassCastException -> L77
            boolean r1 = r8.f9130d     // Catch: java.lang.ClassCastException -> L77
            if (r0 != r1) goto L77
            boolean r0 = r7.f9131e     // Catch: java.lang.ClassCastException -> L77
            boolean r1 = r8.f9131e     // Catch: java.lang.ClassCastException -> L77
            if (r0 != r1) goto L77
            java.lang.String r0 = r7.f9132e0     // Catch: java.lang.ClassCastException -> L77
            java.lang.String r8 = r8.f9132e0     // Catch: java.lang.ClassCastException -> L77
            boolean r8 = android.text.TextUtils.equals(r0, r8)     // Catch: java.lang.ClassCastException -> L77
            if (r8 == 0) goto L77
            r8 = 1
            return r8
        L77:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f9128b;
        int size = arrayList2.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(((Scope) arrayList2.get(i8)).f9148b);
        }
        Collections.sort(arrayList);
        Account account = this.f9129c;
        int hashCode3 = (arrayList.hashCode() + (1 * 31)) * 31;
        if (account == null) {
            hashCode = 0;
        } else {
            hashCode = account.hashCode();
        }
        int i9 = hashCode3 + hashCode;
        String str = this.f9124X;
        int i10 = i9 * 31;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = ((((((i10 + hashCode2) * 31) + (this.f ? 1 : 0)) * 31) + (this.f9130d ? 1 : 0)) * 31) + (this.f9131e ? 1 : 0);
        String str2 = this.f9132e0;
        int i12 = i11 * 31;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return i12 + i7;
    }

    public final ArrayList k() {
        return new ArrayList(this.f9128b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f9127a);
        m5.d.F(parcel, 2, k(), false);
        m5.d.A(parcel, 3, this.f9129c, i7, false);
        m5.d.K(parcel, 4, 4);
        parcel.writeInt(this.f9130d ? 1 : 0);
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(this.f9131e ? 1 : 0);
        m5.d.K(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        m5.d.B(parcel, 7, this.f9124X, false);
        m5.d.B(parcel, 8, this.f9125Y, false);
        m5.d.F(parcel, 9, this.f9126Z, false);
        m5.d.B(parcel, 10, this.f9132e0, false);
        m5.d.J(G2, parcel);
    }
}
