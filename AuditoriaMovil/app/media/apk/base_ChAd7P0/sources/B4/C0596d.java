package b4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzzp;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: b4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596d extends X2.a implements a4.F {
    public static final Parcelable.Creator<C0596d> CREATOR = new C0595c(0);

    /* renamed from: X  reason: collision with root package name */
    public String f8238X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f8239Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f8240Z;

    /* renamed from: a  reason: collision with root package name */
    public String f8241a;

    /* renamed from: b  reason: collision with root package name */
    public String f8242b;

    /* renamed from: c  reason: collision with root package name */
    public String f8243c;

    /* renamed from: d  reason: collision with root package name */
    public String f8244d;

    /* renamed from: e  reason: collision with root package name */
    public Uri f8245e;
    public String f;

    public C0596d(String str, String str2, String str3, String str4, String str5, String str6, boolean z7, String str7) {
        this.f8241a = str;
        this.f8242b = str2;
        this.f = str3;
        this.f8238X = str4;
        this.f8243c = str5;
        this.f8244d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f8245e = Uri.parse(str6);
        }
        this.f8239Y = z7;
        this.f8240Z = str7;
    }

    public static C0596d k(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C0596d(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e7) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzzp(e7);
        }
    }

    @Override // a4.F
    public final String a() {
        return this.f8241a;
    }

    @Override // a4.F
    public final String d() {
        return this.f;
    }

    @Override // a4.F
    public final Uri e() {
        String str = this.f8244d;
        if (!TextUtils.isEmpty(str) && this.f8245e == null) {
            this.f8245e = Uri.parse(str);
        }
        return this.f8245e;
    }

    @Override // a4.F
    public final boolean f() {
        return this.f8239Y;
    }

    @Override // a4.F
    public final String g() {
        return this.f8238X;
    }

    @Override // a4.F
    public final String i() {
        return this.f8243c;
    }

    @Override // a4.F
    public final String j() {
        return this.f8242b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f8241a, false);
        m5.d.B(parcel, 2, this.f8242b, false);
        m5.d.B(parcel, 3, this.f8243c, false);
        m5.d.B(parcel, 4, this.f8244d, false);
        m5.d.B(parcel, 5, this.f, false);
        m5.d.B(parcel, 6, this.f8238X, false);
        m5.d.K(parcel, 7, 4);
        parcel.writeInt(this.f8239Y ? 1 : 0);
        m5.d.B(parcel, 8, this.f8240Z, false);
        m5.d.J(G2, parcel);
    }

    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f8241a);
            jSONObject.putOpt("providerId", this.f8242b);
            jSONObject.putOpt("displayName", this.f8243c);
            jSONObject.putOpt("photoUrl", this.f8244d);
            jSONObject.putOpt("email", this.f);
            jSONObject.putOpt("phoneNumber", this.f8238X);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f8239Y));
            jSONObject.putOpt("rawUserInfo", this.f8240Z);
            return jSONObject.toString();
        } catch (JSONException e7) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzzp(e7);
        }
    }
}
