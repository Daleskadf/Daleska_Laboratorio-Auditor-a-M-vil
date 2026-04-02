package com.google.android.gms.auth.api.signin;

import U2.e;
import X2.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import m5.d;
import org.json.JSONArray;
import org.json.JSONObject;
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new e(0);

    /* renamed from: X  reason: collision with root package name */
    public String f9105X;

    /* renamed from: Y  reason: collision with root package name */
    public final long f9106Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f9107Z;

    /* renamed from: a  reason: collision with root package name */
    public final int f9108a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9109b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9110c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9111d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9112e;

    /* renamed from: e0  reason: collision with root package name */
    public final ArrayList f9113e0;
    public final Uri f;

    /* renamed from: f0  reason: collision with root package name */
    public final String f9114f0;

    /* renamed from: g0  reason: collision with root package name */
    public final String f9115g0;

    /* renamed from: h0  reason: collision with root package name */
    public final HashSet f9116h0 = new HashSet();

    public GoogleSignInAccount(int i7, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f9108a = i7;
        this.f9109b = str;
        this.f9110c = str2;
        this.f9111d = str3;
        this.f9112e = str4;
        this.f = uri;
        this.f9105X = str5;
        this.f9106Y = j;
        this.f9107Z = str6;
        this.f9113e0 = arrayList;
        this.f9114f0 = str7;
        this.f9115g0 = str8;
    }

    public static GoogleSignInAccount k(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(1, jSONArray.getString(i7)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        String string = jSONObject.getString("obfuscatedIdentifier");
        I.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, null, parseLong, string, new ArrayList(hashSet), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        googleSignInAccount.f9105X = str7;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f9107Z.equals(this.f9107Z)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f9113e0);
            hashSet.addAll(googleSignInAccount.f9116h0);
            HashSet hashSet2 = new HashSet(this.f9113e0);
            hashSet2.addAll(this.f9116h0);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        HashSet hashSet = new HashSet(this.f9113e0);
        hashSet.addAll(this.f9116h0);
        return ((this.f9107Z.hashCode() + 527) * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.K(parcel, 1, 4);
        parcel.writeInt(this.f9108a);
        d.B(parcel, 2, this.f9109b, false);
        d.B(parcel, 3, this.f9110c, false);
        d.B(parcel, 4, this.f9111d, false);
        d.B(parcel, 5, this.f9112e, false);
        d.A(parcel, 6, this.f, i7, false);
        d.B(parcel, 7, this.f9105X, false);
        d.K(parcel, 8, 8);
        parcel.writeLong(this.f9106Y);
        d.B(parcel, 9, this.f9107Z, false);
        d.F(parcel, 10, this.f9113e0, false);
        d.B(parcel, 11, this.f9114f0, false);
        d.B(parcel, 12, this.f9115g0, false);
        d.J(G2, parcel);
    }
}
