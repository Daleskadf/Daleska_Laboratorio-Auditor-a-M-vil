package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import b2.C0578a;
import b2.InterfaceC0579b;
import java.util.List;
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0579b {
    @Override // b2.InterfaceC0579b
    public final List a() {
        return m6.p.f14074a;
    }

    @Override // b2.InterfaceC0579b
    public final Object b(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        C0578a c8 = C0578a.c(context);
        kotlin.jvm.internal.j.d(c8, "getInstance(context)");
        if (c8.f8163b.contains(ProcessLifecycleInitializer.class)) {
            if (!r.f7941a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.j.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0565q());
            }
            H h8 = H.f7888Z;
            h8.getClass();
            h8.f7895e = new Handler();
            h8.f.e(EnumC0562n.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            kotlin.jvm.internal.j.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new G(h8));
            return h8;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}
