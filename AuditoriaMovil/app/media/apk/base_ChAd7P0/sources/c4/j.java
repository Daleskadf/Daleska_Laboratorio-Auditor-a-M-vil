package c4;

import D.AbstractC0059i;
import H4.W;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final r f8397a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8398b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8399c;

    public j(int i7, int i8, Class cls) {
        this(r.a(cls), i7, i8);
    }

    public static j a(Class cls) {
        return new j(0, 1, cls);
    }

    public static j b(Class cls) {
        return new j(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!this.f8397a.equals(jVar.f8397a) || this.f8398b != jVar.f8398b || this.f8399c != jVar.f8399c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f8397a.hashCode() ^ 1000003) * 1000003) ^ this.f8398b) * 1000003) ^ this.f8399c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f8397a);
        sb.append(", type=");
        int i7 = this.f8398b;
        if (i7 == 1) {
            str = "required";
        } else if (i7 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i8 = this.f8399c;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(io.flutter.plugins.pathprovider.b.e(i8, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return AbstractC0059i.D(sb, str2, "}");
    }

    public j(r rVar, int i7, int i8) {
        W.f(rVar, "Null dependency anInterface.");
        this.f8397a = rVar;
        this.f8398b = i7;
        this.f8399c = i8;
    }
}
