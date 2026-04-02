package v3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import s3.C1770E;
/* renamed from: v3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1886b extends X2.a implements t {
    public static final Parcelable.Creator<C1886b> CREATOR = new C1770E(18);

    /* renamed from: a  reason: collision with root package name */
    public final int f16044a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16045b;

    /* renamed from: c  reason: collision with root package name */
    public final Intent f16046c;

    public C1886b(int i7, int i8, Intent intent) {
        this.f16044a = i7;
        this.f16045b = i8;
        this.f16046c = intent;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        if (this.f16045b == 0) {
            return Status.f9152e;
        }
        return Status.f9151Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f16044a);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f16045b);
        m5.d.A(parcel, 3, this.f16046c, i7, false);
        m5.d.J(G2, parcel);
    }
}
