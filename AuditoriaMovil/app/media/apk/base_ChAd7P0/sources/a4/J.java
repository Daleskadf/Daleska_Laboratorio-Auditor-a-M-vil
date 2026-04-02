package a4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaj;
import com.google.android.gms.internal.p002firebaseauthapi.zzam;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class J extends X2.a {
    public static final Parcelable.Creator<J> CREATOR = new W2.m(10);

    /* renamed from: a  reason: collision with root package name */
    public final String f6976a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6977b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6978c;

    public J(String str, String str2, String str3) {
        this.f6976a = str;
        this.f6977b = str2;
        this.f6978c = str3;
    }

    public static final J k(JSONObject jSONObject) {
        return new J(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    public static zzaj l(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            zzam zzg = zzaj.zzg();
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i7);
                zzg.zza(new J(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
            }
            return zzg.zza();
        }
        return zzaj.zza(new ArrayList());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f6976a, false);
        m5.d.B(parcel, 2, this.f6977b, false);
        m5.d.B(parcel, 3, this.f6978c, false);
        m5.d.J(G2, parcel);
    }
}
