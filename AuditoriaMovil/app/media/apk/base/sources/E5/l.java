package e5;

import android.os.Trace;
import u0.C1852h;
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10906a;

    public /* synthetic */ l(int i7) {
        this.f10906a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        switch (this.f10906a) {
            case 0:
                return;
            default:
                try {
                    int i7 = d0.j.f10170a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (C1852h.j != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        C1852h.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i8 = d0.j.f10170a;
                    Trace.endSection();
                    throw th;
                }
        }
    }

    private final void a() {
    }
}
