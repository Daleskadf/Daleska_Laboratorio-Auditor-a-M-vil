package a1;

import A3.AbstractC0021t;
import A3.e0;
import A3.j0;
import android.net.Uri;
/* renamed from: a1.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0420F {

    /* renamed from: a  reason: collision with root package name */
    public final j0 f6766a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f6767b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6768c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6769d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6770e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final Uri f6771g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6772h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6773i;
    public final String j;

    /* renamed from: k  reason: collision with root package name */
    public final String f6774k;

    /* renamed from: l  reason: collision with root package name */
    public final String f6775l;

    public C0420F(C0419E c0419e) {
        this.f6766a = j0.a(c0419e.f6756a);
        this.f6767b = c0419e.f6757b.g();
        String str = c0419e.f6759d;
        int i7 = K0.x.f2529a;
        this.f6768c = str;
        this.f6769d = c0419e.f6760e;
        this.f6770e = c0419e.f;
        this.f6771g = c0419e.f6761g;
        this.f6772h = c0419e.f6762h;
        this.f = c0419e.f6758c;
        this.f6773i = c0419e.f6763i;
        this.j = c0419e.f6764k;
        this.f6774k = c0419e.f6765l;
        this.f6775l = c0419e.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0420F.class != obj.getClass()) {
            return false;
        }
        C0420F c0420f = (C0420F) obj;
        if (this.f == c0420f.f) {
            j0 j0Var = this.f6766a;
            j0Var.getClass();
            if (AbstractC0021t.h(j0Var, c0420f.f6766a) && this.f6767b.equals(c0420f.f6767b) && K0.x.a(this.f6769d, c0420f.f6769d) && K0.x.a(this.f6768c, c0420f.f6768c) && K0.x.a(this.f6770e, c0420f.f6770e) && K0.x.a(this.f6775l, c0420f.f6775l) && K0.x.a(this.f6771g, c0420f.f6771g) && K0.x.a(this.j, c0420f.j) && K0.x.a(this.f6774k, c0420f.f6774k) && K0.x.a(this.f6772h, c0420f.f6772h) && K0.x.a(this.f6773i, c0420f.f6773i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9 = (this.f6767b.hashCode() + ((this.f6766a.hashCode() + 217) * 31)) * 31;
        int i7 = 0;
        String str = this.f6769d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode9 + hashCode) * 31;
        String str2 = this.f6768c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        String str3 = this.f6770e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i10 = (((i9 + hashCode3) * 31) + this.f) * 31;
        String str4 = this.f6775l;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        Uri uri = this.f6771g;
        if (uri == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = uri.hashCode();
        }
        int i12 = (i11 + hashCode5) * 31;
        String str5 = this.j;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        String str6 = this.f6774k;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i14 = (i13 + hashCode7) * 31;
        String str7 = this.f6772h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i15 = (i14 + hashCode8) * 31;
        String str8 = this.f6773i;
        if (str8 != null) {
            i7 = str8.hashCode();
        }
        return i15 + i7;
    }
}
