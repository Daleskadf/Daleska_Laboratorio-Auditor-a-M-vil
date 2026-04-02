package a4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;
import com.google.android.gms.internal.p002firebaseauthapi.zzzp;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: a4.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451D extends u {
    public static final Parcelable.Creator<C0451D> CREATOR = new W2.m(14);

    /* renamed from: a  reason: collision with root package name */
    public final String f6956a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6957b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6958c;

    /* renamed from: d  reason: collision with root package name */
    public final zzaia f6959d;

    public C0451D(String str, String str2, long j, zzaia zzaiaVar) {
        com.google.android.gms.common.internal.I.e(str);
        this.f6956a = str;
        this.f6957b = str2;
        this.f6958c = j;
        com.google.android.gms.common.internal.I.j(zzaiaVar, "totpInfo cannot be null.");
        this.f6959d = zzaiaVar;
    }

    public static C0451D n(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            long optLong = jSONObject.optLong("enrollmentTimestamp");
            if (jSONObject.opt("totpInfo") != null) {
                return new C0451D(jSONObject.optString("uid"), jSONObject.optString("displayName"), optLong, new zzaia());
            }
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
    }

    @Override // a4.u
    public final String a() {
        return this.f6956a;
    }

    @Override // a4.u
    public final String i() {
        return this.f6957b;
    }

    @Override // a4.u
    public final long k() {
        return this.f6958c;
    }

    @Override // a4.u
    public final String l() {
        return "totp";
    }

    @Override // a4.u
    public final JSONObject m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f6956a);
            jSONObject.putOpt("displayName", this.f6957b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f6958c));
            jSONObject.putOpt("totpInfo", this.f6959d);
            return jSONObject;
        } catch (JSONException e7) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzzp(e7);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f6956a, false);
        m5.d.B(parcel, 2, this.f6957b, false);
        m5.d.K(parcel, 3, 8);
        parcel.writeLong(this.f6958c);
        m5.d.A(parcel, 4, this.f6959d, i7, false);
        m5.d.J(G2, parcel);
    }
}
