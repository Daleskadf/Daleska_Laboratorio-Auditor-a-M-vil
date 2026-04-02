package k3;

import java.io.Serializable;
/* loaded from: classes.dex */
public class x implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final x f15006d = new x("", null);

    /* renamed from: e  reason: collision with root package name */
    public static final x f15007e = new x(new String(""), null);

    /* renamed from: a  reason: collision with root package name */
    public final String f15008a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15009b;

    /* renamed from: c  reason: collision with root package name */
    public c3.q f15010c;

    public x(String str) {
        this(str, null);
    }

    public static x a(String str) {
        if (str != null && !str.isEmpty()) {
            return new x(j3.g.f14658b.a(str), null);
        }
        return f15006d;
    }

    public static x b(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null && str.isEmpty()) {
            return f15006d;
        }
        return new x(j3.g.f14658b.a(str), str2);
    }

    public String c() {
        return this.f15008a;
    }

    public boolean d() {
        if (this.f15009b != null) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return !this.f15008a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        x xVar = (x) obj;
        String str = this.f15008a;
        if (str == null) {
            if (xVar.f15008a != null) {
                return false;
            }
        } else if (!str.equals(xVar.f15008a)) {
            return false;
        }
        String str2 = this.f15009b;
        if (str2 == null) {
            if (xVar.f15009b == null) {
                return true;
            }
            return false;
        }
        return str2.equals(xVar.f15009b);
    }

    public boolean f(String str) {
        return this.f15008a.equals(str);
    }

    public x g() {
        if (this.f15008a.isEmpty()) {
            return this;
        }
        String a10 = j3.g.f14658b.a(this.f15008a);
        if (a10 == this.f15008a) {
            return this;
        }
        return new x(a10, this.f15009b);
    }

    public boolean h() {
        if (this.f15009b == null && this.f15008a.isEmpty()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f15009b;
        if (str == null) {
            return this.f15008a.hashCode();
        }
        return str.hashCode() ^ this.f15008a.hashCode();
    }

    public c3.q i(m3.m mVar) {
        c3.q d10;
        c3.q qVar = this.f15010c;
        if (qVar == null) {
            if (mVar == null) {
                d10 = new f3.i(this.f15008a);
            } else {
                d10 = mVar.d(this.f15008a);
            }
            c3.q qVar2 = d10;
            this.f15010c = qVar2;
            return qVar2;
        }
        return qVar;
    }

    public x j(String str) {
        if (str == null) {
            str = "";
        }
        if (str.equals(this.f15008a)) {
            return this;
        }
        return new x(str, this.f15009b);
    }

    public String toString() {
        if (this.f15009b == null) {
            return this.f15008a;
        }
        return "{" + this.f15009b + "}" + this.f15008a;
    }

    public x(String str, String str2) {
        this.f15008a = d4.h.Z(str);
        this.f15009b = str2;
    }
}
