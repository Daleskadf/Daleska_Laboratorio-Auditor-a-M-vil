package x4;

import a6.t0;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* renamed from: x4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1998b {

    /* renamed from: a  reason: collision with root package name */
    public String f16505a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1998b)) {
            return false;
        }
        return I.m(this.f16505a, ((C1998b) obj).f16505a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16505a});
    }

    public final String toString() {
        t0 t0Var = new t0(this);
        t0Var.m(this.f16505a, "token");
        return t0Var.toString();
    }
}
