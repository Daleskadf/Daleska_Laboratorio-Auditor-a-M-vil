package v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import java.util.ArrayList;
import s3.C1770E;
/* loaded from: classes.dex */
public final class e extends X2.a implements t {
    public static final Parcelable.Creator<e> CREATOR = new C1770E(19);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f16047a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16048b;

    public e(String str, ArrayList arrayList) {
        this.f16047a = arrayList;
        this.f16048b = str;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        if (this.f16048b != null) {
            return Status.f9152e;
        }
        return Status.f9151Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.D(parcel, 1, this.f16047a);
        m5.d.B(parcel, 2, this.f16048b, false);
        m5.d.J(G2, parcel);
    }
}
