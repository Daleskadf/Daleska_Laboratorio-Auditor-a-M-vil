package I2;

import A3.N;
import J2.i;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final g f2183a;

    /* renamed from: b  reason: collision with root package name */
    public final D2.b f2184b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2185c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f2186d;

    public f(g gVar, D2.b bVar, int i7, Runnable runnable) {
        this.f2183a = gVar;
        this.f2184b = bVar;
        this.f2185c = i7;
        this.f2186d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f2183a;
        D2.b bVar = this.f2184b;
        int i7 = this.f2185c;
        Runnable runnable = this.f2186d;
        try {
            try {
                K2.c cVar = gVar.f;
                J2.c cVar2 = gVar.f2189c;
                cVar2.getClass();
                ((i) cVar).d(new C5.i(cVar2, 10));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) gVar.f2187a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    gVar.a(bVar, i7);
                } else {
                    ((i) gVar.f).d(new N(gVar, i7, 1, bVar));
                }
            } catch (K2.a unused) {
                gVar.f2190d.a(bVar, i7 + 1, false);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
