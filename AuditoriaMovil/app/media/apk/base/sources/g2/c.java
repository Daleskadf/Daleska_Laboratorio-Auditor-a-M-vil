package g2;

import android.os.Build;
import java.util.HashSet;
/* loaded from: classes.dex */
public abstract class c implements e {

    /* renamed from: c  reason: collision with root package name */
    public static final HashSet f11114c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final String f11115a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11116b;

    public c(String str, String str2) {
        this.f11115a = str;
        this.f11116b = str2;
        f11114c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f11112a;
        String str = this.f11116b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ((!"eng".equals(str2) && !"userdebug".equals(str2)) || !hashSet.contains(str.concat(":dev"))) {
                return false;
            }
        }
        return true;
    }
}
