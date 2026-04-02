package i1;

import K0.w;
import K0.x;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class n implements o {

    /* renamed from: d  reason: collision with root package name */
    public static final T1.e f11427d = new T1.e(0, -9223372036854775807L, false);

    /* renamed from: e  reason: collision with root package name */
    public static final T1.e f11428e = new T1.e(2, -9223372036854775807L, false);
    public static final T1.e f = new T1.e(3, -9223372036854775807L, false);

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f11429a;

    /* renamed from: b  reason: collision with root package name */
    public j f11430b;

    /* renamed from: c  reason: collision with root package name */
    public IOException f11431c;

    public n(String str) {
        String h8 = io.flutter.plugins.pathprovider.b.h("ExoPlayer:Loader:", str);
        int i7 = x.f2529a;
        this.f11429a = Executors.newSingleThreadExecutor(new w(h8, 0));
    }

    @Override // i1.o
    public final void a() {
        IOException iOException;
        IOException iOException2 = this.f11431c;
        if (iOException2 == null) {
            j jVar = this.f11430b;
            if (jVar != null && (iOException = jVar.f11425e) != null && jVar.f > jVar.f11421a) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public final void b() {
        j jVar = this.f11430b;
        K0.a.k(jVar);
        jVar.a(false);
    }

    public final boolean c() {
        if (this.f11431c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f11430b != null) {
            return true;
        }
        return false;
    }

    public final void e(l lVar) {
        j jVar = this.f11430b;
        if (jVar != null) {
            jVar.a(true);
        }
        ExecutorService executorService = this.f11429a;
        if (lVar != null) {
            executorService.execute(new G.c(lVar, 28));
        }
        executorService.shutdown();
    }

    public final long f(k kVar, i iVar, int i7) {
        boolean z7;
        Looper myLooper = Looper.myLooper();
        K0.a.k(myLooper);
        this.f11431c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        j jVar = new j(this, myLooper, kVar, iVar, i7, elapsedRealtime);
        if (this.f11430b == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        this.f11430b = jVar;
        jVar.f11425e = null;
        this.f11429a.execute(jVar);
        return elapsedRealtime;
    }
}
