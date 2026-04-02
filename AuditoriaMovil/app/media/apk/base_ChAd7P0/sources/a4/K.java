package a4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;
/* loaded from: classes.dex */
public final class K extends AbstractC0456e {
    public static final Parcelable.Creator<K> CREATOR = new W2.m(19);

    /* renamed from: X  reason: collision with root package name */
    public final String f6979X;

    /* renamed from: a  reason: collision with root package name */
    public final String f6980a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6981b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6982c;

    /* renamed from: d  reason: collision with root package name */
    public final zzaic f6983d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6984e;
    public final String f;

    public K(String str, String str2, String str3, zzaic zzaicVar, String str4, String str5, String str6) {
        this.f6980a = zzae.zzb(str);
        this.f6981b = str2;
        this.f6982c = str3;
        this.f6983d = zzaicVar;
        this.f6984e = str4;
        this.f = str5;
        this.f6979X = str6;
    }

    public static K n(zzaic zzaicVar) {
        com.google.android.gms.common.internal.I.j(zzaicVar, "Must specify a non-null webSignInCredential");
        return new K(null, null, null, zzaicVar, null, null, null);
    }

    @Override // a4.AbstractC0456e
    public final String k() {
        return this.f6980a;
    }

    @Override // a4.AbstractC0456e
    public final String l() {
        return this.f6980a;
    }

    @Override // a4.AbstractC0456e
    public final AbstractC0456e m() {
        return new K(this.f6980a, this.f6981b, this.f6982c, this.f6983d, this.f6984e, this.f, this.f6979X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f6980a, false);
        m5.d.B(parcel, 2, this.f6981b, false);
        m5.d.B(parcel, 3, this.f6982c, false);
        m5.d.A(parcel, 4, this.f6983d, i7, false);
        m5.d.B(parcel, 5, this.f6984e, false);
        m5.d.B(parcel, 6, this.f, false);
        m5.d.B(parcel, 7, this.f6979X, false);
        m5.d.J(G2, parcel);
    }
}
