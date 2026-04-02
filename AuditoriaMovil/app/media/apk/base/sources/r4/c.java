package R4;

import S4.e;
import T4.h;
import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.CameraPosition;
import io.flutter.plugins.googlemaps.C1173f;
import io.flutter.plugins.googlemaps.C1177j;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p.C1608t;
import q3.InterfaceC1707a;
import q3.d;
import s3.C1786n;
/* loaded from: classes.dex */
public final class c implements InterfaceC1707a, d, q3.b {

    /* renamed from: X  reason: collision with root package name */
    public CameraPosition f4768X;

    /* renamed from: Y  reason: collision with root package name */
    public b f4769Y;

    /* renamed from: Z  reason: collision with root package name */
    public final ReentrantReadWriteLock f4770Z = new ReentrantReadWriteLock();

    /* renamed from: a  reason: collision with root package name */
    public final U4.b f4771a;

    /* renamed from: b  reason: collision with root package name */
    public final U4.a f4772b;

    /* renamed from: c  reason: collision with root package name */
    public final U4.a f4773c;

    /* renamed from: d  reason: collision with root package name */
    public final e f4774d;

    /* renamed from: e  reason: collision with root package name */
    public h f4775e;

    /* renamed from: e0  reason: collision with root package name */
    public C1177j f4776e0;
    public final C1608t f;

    /* renamed from: f0  reason: collision with root package name */
    public C1173f f4777f0;

    /* JADX WARN: Type inference failed for: r2v1, types: [B0.b, S4.e] */
    public c(Context context, C1608t c1608t, U4.b bVar) {
        this.f = c1608t;
        this.f4771a = bVar;
        bVar.getClass();
        this.f4773c = new U4.a(bVar);
        this.f4772b = new U4.a(bVar);
        this.f4775e = new h(context, c1608t, this);
        S4.d dVar = new S4.d(new S4.b());
        ?? bVar2 = new B0.b(3);
        bVar2.f5273b = dVar;
        this.f4774d = bVar2;
        this.f4769Y = new b(this);
        this.f4775e.c();
    }

    @Override // q3.InterfaceC1707a
    public final void A() {
        h hVar = this.f4775e;
        if (hVar instanceof InterfaceC1707a) {
            ((InterfaceC1707a) hVar).A();
        }
        C1608t c1608t = this.f;
        c1608t.c0();
        this.f4774d.getClass();
        CameraPosition cameraPosition = this.f4768X;
        if (cameraPosition != null) {
            if (cameraPosition.f9460b == c1608t.c0().f9460b) {
                return;
            }
        }
        this.f4768X = c1608t.c0();
        a();
    }

    @Override // q3.b
    public final void W(C1786n c1786n) {
        this.f4771a.W(c1786n);
    }

    public final void a() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f4770Z;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f4769Y.cancel(true);
            b bVar = new b(this);
            this.f4769Y = bVar;
            bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Float.valueOf(this.f.c0().f9460b));
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // q3.d
    public final boolean e(C1786n c1786n) {
        return this.f4771a.e(c1786n);
    }
}
