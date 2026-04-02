package o3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import n3.c0;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class h extends X2.a {
    public static final Parcelable.Creator<h> CREATOR = new c0(9);

    /* renamed from: a  reason: collision with root package name */
    public final d f14584a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14585b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14586c;

    public h(d dVar, String str, String str2) {
        I.i(dVar);
        this.f14584a = dVar;
        this.f14586c = str;
        this.f14585b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f14586c;
        if (str == null) {
            if (hVar.f14586c != null) {
                return false;
            }
        } else if (!str.equals(hVar.f14586c)) {
            return false;
        }
        if (!this.f14584a.equals(hVar.f14584a)) {
            return false;
        }
        String str2 = hVar.f14585b;
        String str3 = this.f14585b;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        String str = this.f14586c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = this.f14584a.hashCode() + ((hashCode + 31) * 31);
        String str2 = this.f14585b;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return (hashCode2 * 31) + i7;
    }

    public final String toString() {
        d dVar = this.f14584a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(dVar.f14575b, 11));
            f fVar = dVar.f14576c;
            if (fVar != f.UNKNOWN) {
                jSONObject.put("version", fVar.toString());
            }
            ArrayList arrayList = dVar.f14577d;
            if (arrayList != null) {
                jSONObject.put("transports", arrayList.toString());
            }
            String str = this.f14586c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f14585b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 2, this.f14584a, i7, false);
        m5.d.B(parcel, 3, this.f14586c, false);
        m5.d.B(parcel, 4, this.f14585b, false);
        m5.d.J(G2, parcel);
    }
}
