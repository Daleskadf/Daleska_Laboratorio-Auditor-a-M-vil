package X3;

import M0.x;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0730d;
import com.google.android.gms.common.internal.I;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final x f6396a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f6397b;

    public j(Context context, d dVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        I.i(context);
        I.i(dVar);
        x xVar = new x(dVar, executor, scheduledExecutorService);
        t2.i iVar = new t2.i(13);
        this.f6396a = xVar;
        ComponentCallbacks2C0730d.b((Application) context.getApplicationContext());
        ComponentCallbacks2C0730d.f9232e.a(new i(this, xVar, iVar));
    }
}
