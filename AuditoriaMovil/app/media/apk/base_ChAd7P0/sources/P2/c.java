package P2;

import android.os.Bundle;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
import java.util.Set;
/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: b  reason: collision with root package name */
    public static final c f4011b = new c(new Bundle());

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f4012a;

    public /* synthetic */ c(Bundle bundle) {
        this.f4012a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        Bundle bundle = ((c) obj).f4012a;
        Bundle bundle2 = this.f4012a;
        if (bundle2 != null && bundle != null) {
            if (bundle2.size() == bundle.size()) {
                Set<String> keySet = bundle2.keySet();
                if (keySet.containsAll(bundle.keySet())) {
                    for (String str : keySet) {
                        if (!I.m(bundle2.get(str), bundle.get(str))) {
                        }
                    }
                    return true;
                }
            }
        } else if (bundle2 == bundle) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4012a});
    }
}
