package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.C0570w;
import androidx.lifecycle.InterfaceC0568u;
import androidx.lifecycle.ProcessLifecycleInitializer;
import b2.C0578a;
import b2.InterfaceC0579b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import u0.C1852h;
import u0.C1853i;
import u0.C1855k;
import u0.C1858n;
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0579b {
    @Override // b2.InterfaceC0579b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // b2.InterfaceC0579b
    public final Object b(Context context) {
        C1858n c1858n = new C1858n(new C1855k(context, 0));
        c1858n.f15945b = 1;
        if (C1852h.j == null) {
            synchronized (C1852h.f15919i) {
                try {
                    if (C1852h.j == null) {
                        C1852h.j = new C1852h(c1858n);
                    }
                } finally {
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object obj;
        C0578a c8 = C0578a.c(context);
        c8.getClass();
        synchronized (C0578a.f8161e) {
            try {
                obj = c8.f8162a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c8.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0570w h8 = ((InterfaceC0568u) obj).h();
        h8.a(new C1853i(this, h8));
    }
}
