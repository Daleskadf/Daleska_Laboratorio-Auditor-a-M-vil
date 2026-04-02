package M0;

import java.util.Map;
/* loaded from: classes.dex */
public final /* synthetic */ class n implements z3.k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3189a;

    @Override // z3.k
    public final boolean apply(Object obj) {
        switch (this.f3189a) {
            case 0:
                if (((Map.Entry) obj).getKey() != null) {
                    return true;
                }
                return false;
            default:
                if (((String) obj) != null) {
                    return true;
                }
                return false;
        }
    }
}
