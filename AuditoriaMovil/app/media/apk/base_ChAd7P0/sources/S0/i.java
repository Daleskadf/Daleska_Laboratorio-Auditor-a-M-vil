package S0;

import K0.x;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f4882a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4883b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4884c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4885d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4886e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f4882a = str;
        this.f4883b = str2;
        this.f4884c = str3;
        this.f4885d = str4;
        this.f4886e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (x.a(this.f4882a, iVar.f4882a) && x.a(this.f4883b, iVar.f4883b) && x.a(this.f4884c, iVar.f4884c) && x.a(this.f4885d, iVar.f4885d) && x.a(this.f4886e, iVar.f4886e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        String str = this.f4882a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (527 + i7) * 31;
        String str2 = this.f4883b;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i13 = (i12 + i8) * 31;
        String str3 = this.f4884c;
        if (str3 != null) {
            i9 = str3.hashCode();
        } else {
            i9 = 0;
        }
        int i14 = (i13 + i9) * 31;
        String str4 = this.f4885d;
        if (str4 != null) {
            i10 = str4.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        String str5 = this.f4886e;
        if (str5 != null) {
            i11 = str5.hashCode();
        }
        return i15 + i11;
    }
}
