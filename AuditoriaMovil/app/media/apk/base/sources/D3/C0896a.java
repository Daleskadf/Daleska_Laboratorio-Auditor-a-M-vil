package d3;

import a6.t0;
import android.os.Parcel;
import c3.C0629a;
import c3.C0630b;
/* renamed from: d3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896a extends X2.a {
    public static final e CREATOR = new Object();

    /* renamed from: X  reason: collision with root package name */
    public final int f10297X;

    /* renamed from: Y  reason: collision with root package name */
    public final Class f10298Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f10299Z;

    /* renamed from: a  reason: collision with root package name */
    public final int f10300a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10301b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10302c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10303d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10304e;

    /* renamed from: e0  reason: collision with root package name */
    public h f10305e0;
    public final String f;

    /* renamed from: f0  reason: collision with root package name */
    public final C0629a f10306f0;

    public C0896a(int i7, int i8, boolean z7, int i9, boolean z8, String str, int i10, String str2, C0630b c0630b) {
        this.f10300a = i7;
        this.f10301b = i8;
        this.f10302c = z7;
        this.f10303d = i9;
        this.f10304e = z8;
        this.f = str;
        this.f10297X = i10;
        if (str2 == null) {
            this.f10298Y = null;
            this.f10299Z = null;
        } else {
            this.f10298Y = d.class;
            this.f10299Z = str2;
        }
        if (c0630b == null) {
            this.f10306f0 = null;
            return;
        }
        C0629a c0629a = c0630b.f8371b;
        if (c0629a != null) {
            this.f10306f0 = c0629a;
            return;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public static C0896a k(int i7, String str) {
        return new C0896a(7, true, 7, true, str, i7, null);
    }

    public final String toString() {
        t0 t0Var = new t0(this);
        t0Var.m(Integer.valueOf(this.f10300a), "versionCode");
        t0Var.m(Integer.valueOf(this.f10301b), "typeIn");
        t0Var.m(Boolean.valueOf(this.f10302c), "typeInArray");
        t0Var.m(Integer.valueOf(this.f10303d), "typeOut");
        t0Var.m(Boolean.valueOf(this.f10304e), "typeOutArray");
        t0Var.m(this.f, "outputFieldName");
        t0Var.m(Integer.valueOf(this.f10297X), "safeParcelFieldId");
        String str = this.f10299Z;
        if (str == null) {
            str = null;
        }
        t0Var.m(str, "concreteTypeName");
        Class cls = this.f10298Y;
        if (cls != null) {
            t0Var.m(cls.getCanonicalName(), "concreteType.class");
        }
        C0629a c0629a = this.f10306f0;
        if (c0629a != null) {
            t0Var.m(c0629a.getClass().getCanonicalName(), "converterName");
        }
        return t0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f10300a);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f10301b);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f10302c ? 1 : 0);
        m5.d.K(parcel, 4, 4);
        parcel.writeInt(this.f10303d);
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(this.f10304e ? 1 : 0);
        m5.d.B(parcel, 6, this.f, false);
        m5.d.K(parcel, 7, 4);
        parcel.writeInt(this.f10297X);
        C0630b c0630b = null;
        String str = this.f10299Z;
        if (str == null) {
            str = null;
        }
        m5.d.B(parcel, 8, str, false);
        C0629a c0629a = this.f10306f0;
        if (c0629a != null) {
            if (c0629a instanceof C0629a) {
                c0630b = new C0630b(c0629a);
            } else {
                throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
            }
        }
        m5.d.A(parcel, 9, c0630b, i7, false);
        m5.d.J(G2, parcel);
    }

    public C0896a(int i7, boolean z7, int i8, boolean z8, String str, int i9, Class cls) {
        this.f10300a = 1;
        this.f10301b = i7;
        this.f10302c = z7;
        this.f10303d = i8;
        this.f10304e = z8;
        this.f = str;
        this.f10297X = i9;
        this.f10298Y = cls;
        if (cls == null) {
            this.f10299Z = null;
        } else {
            this.f10299Z = cls.getCanonicalName();
        }
        this.f10306f0 = null;
    }
}
