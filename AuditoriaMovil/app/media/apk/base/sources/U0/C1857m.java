package u0;

import K0.w;
import S1.C0338f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import c1.RunnableC0626c;
import e0.AbstractC0929d;
import e0.C0930e;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j6.C1372c;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: u0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1857m implements InterfaceC1851g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15936a;

    /* renamed from: b  reason: collision with root package name */
    public final C0930e f15937b;

    /* renamed from: c  reason: collision with root package name */
    public final C1372c f15938c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f15939d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f15940e;
    public ThreadPoolExecutor f;

    /* renamed from: g  reason: collision with root package name */
    public ThreadPoolExecutor f15941g;

    /* renamed from: h  reason: collision with root package name */
    public f7.a f15942h;

    public C1857m(Context context, C0930e c0930e) {
        C1372c c1372c = C1858n.f15943d;
        this.f15939d = new Object();
        g0.c.f(context, "Context cannot be null");
        this.f15936a = context.getApplicationContext();
        this.f15937b = c0930e;
        this.f15938c = c1372c;
    }

    @Override // u0.InterfaceC1851g
    public final void a(f7.a aVar) {
        synchronized (this.f15939d) {
            this.f15942h = aVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f15939d) {
            try {
                this.f15942h = null;
                Handler handler = this.f15940e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f15940e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f15941g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.f15941g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f15939d) {
            try {
                if (this.f15942h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new w("emojiCompat", 1));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f15941g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new RunnableC0626c(this, 20));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final e0.i d() {
        try {
            C1372c c1372c = this.f15938c;
            Context context = this.f15936a;
            C0930e c0930e = this.f15937b;
            c1372c.getClass();
            Object[] objArr = {c0930e};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C0338f a7 = AbstractC0929d.a(context, DesugarCollections.unmodifiableList(arrayList));
            int i7 = a7.f5011a;
            if (i7 == 0) {
                e0.i[] iVarArr = (e0.i[]) a7.f5012b.get(0);
                if (iVarArr != null && iVarArr.length != 0) {
                    return iVarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(io.flutter.plugins.pathprovider.b.f("fetchFonts failed (", i7, ")"));
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException("provider not found", e7);
        }
    }
}
