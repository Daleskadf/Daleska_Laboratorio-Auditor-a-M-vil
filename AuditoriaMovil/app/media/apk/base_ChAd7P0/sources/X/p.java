package x;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import p.C1608t;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final C1608t f16413a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayMap f16414b = new ArrayMap(4);

    public p(C1608t c1608t) {
        this.f16413a = c1608t;
    }

    public static p a(Context context, Handler handler) {
        C1608t c1608t;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            c1608t = new C1608t(context, (C1608t) null);
        } else if (i7 >= 29) {
            c1608t = new C1608t(context, (C1608t) null);
        } else if (i7 >= 28) {
            c1608t = new C1608t(context, (C1608t) null);
        } else {
            c1608t = new C1608t(context, new C1608t(handler));
        }
        return new p(c1608t);
    }

    public final j b(String str) {
        j jVar;
        synchronized (this.f16414b) {
            jVar = (j) this.f16414b.get(str);
            if (jVar == null) {
                try {
                    j jVar2 = new j(this.f16413a.b0(str), str);
                    this.f16414b.put(str, jVar2);
                    jVar = jVar2;
                } catch (AssertionError e7) {
                    throw new C1967a(e7.getMessage(), e7);
                }
            }
        }
        return jVar;
    }
}
