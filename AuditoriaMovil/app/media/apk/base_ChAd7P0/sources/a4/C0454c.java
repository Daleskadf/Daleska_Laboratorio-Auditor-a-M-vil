package a4;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: a4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454c extends X2.a {
    public static final Parcelable.Creator<C0454c> CREATOR = new W2.m(17);

    /* renamed from: X  reason: collision with root package name */
    public final boolean f7015X;

    /* renamed from: Y  reason: collision with root package name */
    public String f7016Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f7017Z;

    /* renamed from: a  reason: collision with root package name */
    public final String f7018a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7019b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7020c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7021d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7022e;

    /* renamed from: e0  reason: collision with root package name */
    public final String f7023e0;
    public final String f;

    /* renamed from: f0  reason: collision with root package name */
    public final String f7024f0;

    public C0454c(C0453b c0453b) {
        this.f7018a = c0453b.f7008a;
        this.f7019b = c0453b.f7009b;
        this.f7020c = null;
        this.f7021d = c0453b.f7010c;
        this.f7022e = c0453b.f7011d;
        this.f = c0453b.f7012e;
        this.f7015X = c0453b.f;
        this.f7023e0 = c0453b.f7013g;
        this.f7024f0 = c0453b.f7014h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f7018a, false);
        m5.d.B(parcel, 2, this.f7019b, false);
        m5.d.B(parcel, 3, this.f7020c, false);
        m5.d.B(parcel, 4, this.f7021d, false);
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(this.f7022e ? 1 : 0);
        m5.d.B(parcel, 6, this.f, false);
        m5.d.K(parcel, 7, 4);
        parcel.writeInt(this.f7015X ? 1 : 0);
        m5.d.B(parcel, 8, this.f7016Y, false);
        int i8 = this.f7017Z;
        m5.d.K(parcel, 9, 4);
        parcel.writeInt(i8);
        m5.d.B(parcel, 10, this.f7023e0, false);
        m5.d.B(parcel, 11, this.f7024f0, false);
        m5.d.J(G2, parcel);
    }

    public C0454c(String str, String str2, String str3, String str4, boolean z7, String str5, boolean z8, String str6, int i7, String str7, String str8) {
        this.f7018a = str;
        this.f7019b = str2;
        this.f7020c = str3;
        this.f7021d = str4;
        this.f7022e = z7;
        this.f = str5;
        this.f7015X = z8;
        this.f7016Y = str6;
        this.f7017Z = i7;
        this.f7023e0 = str7;
        this.f7024f0 = str8;
    }
}
