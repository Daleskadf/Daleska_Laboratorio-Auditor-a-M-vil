package B4;

import a.AbstractC0412a;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import b4.InterfaceC0593a;
import f3.C0988a;
import f5.C0993a;
import java.util.Random;
/* loaded from: classes.dex */
public final class e {
    public static final Random f = new Random();

    /* renamed from: g  reason: collision with root package name */
    public static final C0993a f281g = new C0993a(1);

    /* renamed from: h  reason: collision with root package name */
    public static final C0988a f282h = C0988a.f11051a;

    /* renamed from: a  reason: collision with root package name */
    public final Context f283a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0593a f284b;

    /* renamed from: c  reason: collision with root package name */
    public final Z3.b f285c;

    /* renamed from: d  reason: collision with root package name */
    public final long f286d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f287e;

    public e(Context context, InterfaceC0593a interfaceC0593a, Z3.b bVar, long j) {
        this.f283a = context;
        this.f284b = interfaceC0593a;
        this.f285c = bVar;
        this.f286d = j;
    }

    public static boolean a(int i7) {
        if ((i7 < 500 || i7 >= 600) && i7 != -2 && i7 != 429 && i7 != 408) {
            return false;
        }
        return true;
    }

    public final void b(C4.c cVar, boolean z7) {
        f282h.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + this.f286d;
        if (z7) {
            cVar.n(this.f283a, AbstractC0412a.r(this.f284b), AbstractC0412a.q(this.f285c));
        } else {
            cVar.p(AbstractC0412a.r(this.f284b), AbstractC0412a.q(this.f285c));
        }
        int i7 = 1000;
        while (true) {
            f282h.getClass();
            if (SystemClock.elapsedRealtime() + i7 <= elapsedRealtime && !cVar.l() && a(cVar.f542e)) {
                try {
                    f281g.getClass();
                    Thread.sleep(f.nextInt(250) + i7);
                    if (i7 < 30000) {
                        if (cVar.f542e != -2) {
                            i7 *= 2;
                            Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                        } else {
                            Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                            i7 = 1000;
                        }
                    }
                    if (this.f287e) {
                        return;
                    }
                    cVar.f538a = null;
                    cVar.f542e = 0;
                    if (z7) {
                        cVar.n(this.f283a, AbstractC0412a.r(this.f284b), AbstractC0412a.q(this.f285c));
                    } else {
                        cVar.p(AbstractC0412a.r(this.f284b), AbstractC0412a.q(this.f285c));
                    }
                } catch (InterruptedException unused) {
                    Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                    Thread.currentThread().interrupt();
                    return;
                }
            } else {
                return;
            }
        }
    }
}
