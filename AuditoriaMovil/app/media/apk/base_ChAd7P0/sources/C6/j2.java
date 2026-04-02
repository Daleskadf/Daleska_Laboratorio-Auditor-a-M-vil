package c6;

import D.AbstractC0055e;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a  reason: collision with root package name */
    public final a6.S f8872a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8873b;

    public j2(a6.S s7, Object obj) {
        this.f8872a = s7;
        this.f8873b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j2.class != obj.getClass()) {
            return false;
        }
        j2 j2Var = (j2) obj;
        if (F.f.l(this.f8872a, j2Var.f8872a) && F.f.l(this.f8873b, j2Var.f8873b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8872a, this.f8873b});
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f8872a, "provider");
        C7.a(this.f8873b, "config");
        return C7.toString();
    }
}
