package S0;

import K0.x;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f4871a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4872b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4873c;

    public f(String str, String str2, String str3) {
        this.f4871a = str;
        this.f4872b = str2;
        this.f4873c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (x.a(this.f4871a, fVar.f4871a) && x.a(this.f4872b, fVar.f4872b) && x.a(this.f4873c, fVar.f4873c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f4871a.hashCode() * 31;
        int i8 = 0;
        String str = this.f4872b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = (hashCode + i7) * 31;
        String str2 = this.f4873c;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i9 + i8;
    }
}
