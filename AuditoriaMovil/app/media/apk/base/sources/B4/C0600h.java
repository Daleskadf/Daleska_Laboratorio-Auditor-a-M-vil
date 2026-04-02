package b4;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: b4.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0600h implements X2.b {
    public static final Parcelable.Creator<C0600h> CREATOR = new C0595c(2);

    /* renamed from: a  reason: collision with root package name */
    public final long f8262a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8263b;

    public C0600h(long j, long j8) {
        this.f8262a = j;
        this.f8263b = j8;
    }

    public static C0600h a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C0600h(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 8);
        parcel.writeLong(this.f8262a);
        m5.d.K(parcel, 2, 8);
        parcel.writeLong(this.f8263b);
        m5.d.J(G2, parcel);
    }
}
