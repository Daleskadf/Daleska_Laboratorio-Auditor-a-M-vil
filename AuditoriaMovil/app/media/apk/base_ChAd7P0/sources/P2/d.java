package P2;

import M0.x;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: c  reason: collision with root package name */
    public static final d f4013c;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4014a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4015b;

    static {
        x xVar = new x((char) 0, 8);
        xVar.f3210b = Boolean.FALSE;
        f4013c = new d(xVar);
    }

    public d(x xVar) {
        this.f4014a = ((Boolean) xVar.f3210b).booleanValue();
        this.f4015b = (String) xVar.f3211c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        dVar.getClass();
        if (I.m(null, null) && this.f4014a == dVar.f4014a && I.m(this.f4015b, dVar.f4015b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f4014a), this.f4015b});
    }
}
