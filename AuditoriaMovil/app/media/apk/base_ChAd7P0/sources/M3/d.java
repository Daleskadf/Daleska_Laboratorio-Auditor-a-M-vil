package M3;

import D.AbstractC0059i;
import G3.C0119g;
import R3.EnumC0324v0;
import c6.L1;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.shaded.protobuf.AbstractC0774a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3229a;

    /* renamed from: b  reason: collision with root package name */
    public final Serializable f3230b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3231c;

    public d() {
        this.f3230b = new AtomicInteger(0);
        this.f3231c = new AtomicBoolean(false);
        this.f3229a = new K5.d(1);
    }

    public Task a(final Executor executor, Callable callable, final CancellationToken cancellationToken) {
        boolean z7;
        if (((AtomicInteger) this.f3230b).get() > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.l(z7);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        Executor executor2 = new Executor() { // from class: e5.q
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e7) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                    } else {
                        taskCompletionSource.setException(e7);
                    }
                    throw e7;
                }
            }
        };
        ((K5.d) this.f3229a).h(new L1(this, cancellationToken, cancellationTokenSource, callable, taskCompletionSource), executor2);
        return taskCompletionSource.getTask();
    }

    public J3.c b() {
        return J3.c.ALGORITHM_NOT_FIPS;
    }

    public abstract String c();

    public Object d(AbstractC0774a abstractC0774a, Class cls) {
        C0119g c0119g = (C0119g) ((Map) this.f3231c).get(cls);
        if (c0119g != null) {
            return c0119g.a(abstractC0774a);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract B0.b e();

    public abstract EnumC0324v0 f();

    public abstract AbstractC0774a g(AbstractC0781h abstractC0781h);

    public abstract void h(AbstractC0774a abstractC0774a);

    public d(Class cls, C0119g... c0119gArr) {
        this.f3229a = cls;
        HashMap hashMap = new HashMap();
        for (C0119g c0119g : c0119gArr) {
            boolean containsKey = hashMap.containsKey(c0119g.f1529a);
            Class cls2 = c0119g.f1529a;
            if (!containsKey) {
                hashMap.put(cls2, c0119g);
            } else {
                throw new IllegalArgumentException(AbstractC0059i.w(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
        }
        if (c0119gArr.length > 0) {
            this.f3230b = c0119gArr[0].f1529a;
        } else {
            this.f3230b = Void.class;
        }
        this.f3231c = DesugarCollections.unmodifiableMap(hashMap);
    }
}
