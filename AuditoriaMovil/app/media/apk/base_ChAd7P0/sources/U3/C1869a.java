package u3;

import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* renamed from: u3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1869a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final C1869a f15978a = new Object();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1869a)) {
            return false;
        }
        ((C1869a) obj).getClass();
        if (I.m(null, null) && I.m(null, null) && I.m(null, null) && I.m(null, null) && I.m(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, bool, null, bool, bool, null, null, null, null});
    }
}
