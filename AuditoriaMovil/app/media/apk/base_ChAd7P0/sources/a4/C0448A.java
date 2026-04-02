package a4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzzp;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: a4.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448A extends u {
    public static final Parcelable.Creator<C0448A> CREATOR = new W2.m(12);

    /* renamed from: a  reason: collision with root package name */
    public final String f6948a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6949b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6950c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6951d;

    public C0448A(String str, String str2, long j, String str3) {
        com.google.android.gms.common.internal.I.e(str);
        this.f6948a = str;
        this.f6949b = str2;
        this.f6950c = j;
        com.google.android.gms.common.internal.I.e(str3);
        this.f6951d = str3;
    }

    public static C0448A n(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new C0448A(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // a4.u
    public final String a() {
        return this.f6948a;
    }

    @Override // a4.u
    public final String i() {
        return this.f6949b;
    }

    @Override // a4.u
    public final long k() {
        return this.f6950c;
    }

    @Override // a4.u
    public final String l() {
        return "phone";
    }

    @Override // a4.u
    public final JSONObject m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f6948a);
            jSONObject.putOpt("displayName", this.f6949b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f6950c));
            jSONObject.putOpt("phoneNumber", this.f6951d);
            return jSONObject;
        } catch (JSONException e7) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzzp(e7);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f6948a, false);
        m5.d.B(parcel, 2, this.f6949b, false);
        m5.d.K(parcel, 3, 8);
        parcel.writeLong(this.f6950c);
        m5.d.B(parcel, 4, this.f6951d, false);
        m5.d.J(G2, parcel);
    }
}
