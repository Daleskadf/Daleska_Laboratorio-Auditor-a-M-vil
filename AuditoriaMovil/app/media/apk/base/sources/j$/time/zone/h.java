package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;
/* loaded from: classes2.dex */
final class h implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ArrayList f12830a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(ArrayList arrayList) {
        this.f12830a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                j jVar = (j) j.class.cast(Class.forName(property, true, j.class.getClassLoader()).newInstance());
                j.e(jVar);
                this.f12830a.add(jVar);
                return null;
            } catch (Exception e7) {
                throw new Error(e7);
            }
        }
        j.e(new i());
        return null;
    }
}
