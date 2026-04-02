package O0;

import android.text.TextUtils;
/* renamed from: O0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245g {

    /* renamed from: a  reason: collision with root package name */
    public final String f3741a;

    /* renamed from: b  reason: collision with root package name */
    public final H0.r f3742b;

    /* renamed from: c  reason: collision with root package name */
    public final H0.r f3743c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3744d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3745e;

    public C0245g(String str, H0.r rVar, H0.r rVar2, int i7, int i8) {
        boolean z7;
        if (i7 != 0 && i8 != 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        K0.a.e(z7);
        if (!TextUtils.isEmpty(str)) {
            this.f3741a = str;
            rVar.getClass();
            this.f3742b = rVar;
            rVar2.getClass();
            this.f3743c = rVar2;
            this.f3744d = i7;
            this.f3745e = i8;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0245g.class != obj.getClass()) {
            return false;
        }
        C0245g c0245g = (C0245g) obj;
        if (this.f3744d == c0245g.f3744d && this.f3745e == c0245g.f3745e && this.f3741a.equals(c0245g.f3741a) && this.f3742b.equals(c0245g.f3742b) && this.f3743c.equals(c0245g.f3743c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f3741a.hashCode();
        int hashCode2 = this.f3742b.hashCode();
        return this.f3743c.hashCode() + ((hashCode2 + ((hashCode + ((((527 + this.f3744d) * 31) + this.f3745e) * 31)) * 31)) * 31);
    }
}
