package c6;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.Collections;
/* loaded from: classes.dex */
public final class X extends a6.j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f8640a;

    static {
        boolean z7 = false;
        try {
            Class.forName("android.app.Application", false, X.class.getClassLoader());
            z7 = true;
        } catch (Exception unused) {
        }
        f8640a = z7;
    }

    @Override // a6.j0
    public Collection a() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // a6.j0
    public boolean b() {
        return true;
    }

    @Override // a6.j0
    public int c() {
        return 5;
    }
}
