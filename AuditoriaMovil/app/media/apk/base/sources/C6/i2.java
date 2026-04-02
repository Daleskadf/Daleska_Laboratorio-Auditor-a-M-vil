package c6;

import D.AbstractC0055e;
import java.util.Arrays;
import java.util.Map;
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f8856a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f8857b;

    public i2(String str, Map map) {
        G.i.j(str, "policyName");
        this.f8856a = str;
        G.i.j(map, "rawConfigValue");
        this.f8857b = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        if (!this.f8856a.equals(i2Var.f8856a) || !this.f8857b.equals(i2Var.f8857b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8856a, this.f8857b});
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f8856a, "policyName");
        C7.a(this.f8857b, "rawConfigValue");
        return C7.toString();
    }
}
