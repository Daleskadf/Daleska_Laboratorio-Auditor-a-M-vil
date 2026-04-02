package H0;

import java.util.HashSet;
/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet f1646a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public static String f1647b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (D.class) {
            if (f1646a.add(str)) {
                f1647b += ", " + str;
            }
        }
    }
}
