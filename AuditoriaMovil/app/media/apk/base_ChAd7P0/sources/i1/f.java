package i1;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final /* synthetic */ class f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f11395a;

    public final void a(int i7) {
        int i8;
        g gVar = this.f11395a;
        synchronized (gVar) {
            int i9 = gVar.f11413m;
            if (i9 == 0 || gVar.f11406d) {
                if (i9 != i7) {
                    gVar.f11413m = i7;
                    if (i7 != 1 && i7 != 0 && i7 != 8) {
                        gVar.f11411k = gVar.b(i7);
                        gVar.f11405c.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (gVar.f > 0) {
                            i8 = (int) (elapsedRealtime - gVar.f11408g);
                        } else {
                            i8 = 0;
                        }
                        gVar.c(i8, gVar.f11409h, gVar.f11411k);
                        gVar.f11408g = elapsedRealtime;
                        gVar.f11409h = 0L;
                        gVar.j = 0L;
                        gVar.f11410i = 0L;
                        s sVar = gVar.f11407e;
                        sVar.f11443b.clear();
                        sVar.f11445d = -1;
                        sVar.f11446e = 0;
                        sVar.f = 0;
                    }
                }
            }
        }
    }
}
