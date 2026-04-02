package M0;

import A3.e0;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* renamed from: M0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0236c implements h {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3146a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3147b = new ArrayList(1);

    /* renamed from: c  reason: collision with root package name */
    public int f3148c;

    /* renamed from: d  reason: collision with root package name */
    public l f3149d;

    public AbstractC0236c(boolean z7) {
        this.f3146a = z7;
    }

    public final void b(int i7) {
        boolean z7;
        l lVar = this.f3149d;
        int i8 = K0.x.f2529a;
        for (int i9 = 0; i9 < this.f3148c; i9++) {
            boolean z8 = this.f3146a;
            i1.g gVar = (i1.g) ((C) this.f3147b.get(i9));
            synchronized (gVar) {
                e0 e0Var = i1.g.f11396n;
                if (z8 && (lVar.f3178h & 8) != 8) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    gVar.f11409h += i7;
                }
            }
        }
    }

    public final void c() {
        boolean z7;
        boolean z8;
        l lVar = this.f3149d;
        int i7 = K0.x.f2529a;
        for (int i8 = 0; i8 < this.f3148c; i8++) {
            boolean z9 = this.f3146a;
            i1.g gVar = (i1.g) ((C) this.f3147b.get(i8));
            synchronized (gVar) {
                try {
                    e0 e0Var = i1.g.f11396n;
                    if (z9 && (lVar.f3178h & 8) != 8) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        if (gVar.f > 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        K0.a.j(z8);
                        gVar.f11405c.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i9 = (int) (elapsedRealtime - gVar.f11408g);
                        gVar.f11410i += i9;
                        long j = gVar.j;
                        long j8 = gVar.f11409h;
                        gVar.j = j + j8;
                        if (i9 > 0) {
                            gVar.f11407e.a((((float) j8) * 8000.0f) / i9, (int) Math.sqrt(j8));
                            if (gVar.f11410i < 2000) {
                                if (gVar.j >= 524288) {
                                }
                                gVar.c(i9, gVar.f11409h, gVar.f11411k);
                                gVar.f11408g = elapsedRealtime;
                                gVar.f11409h = 0L;
                            }
                            gVar.f11411k = gVar.f11407e.b();
                            gVar.c(i9, gVar.f11409h, gVar.f11411k);
                            gVar.f11408g = elapsedRealtime;
                            gVar.f11409h = 0L;
                        }
                        gVar.f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f3149d = null;
    }

    public final void h() {
        for (int i7 = 0; i7 < this.f3148c; i7++) {
            ((C) this.f3147b.get(i7)).getClass();
        }
    }

    @Override // M0.h
    public Map j() {
        return Collections.emptyMap();
    }

    public final void k(l lVar) {
        boolean z7;
        this.f3149d = lVar;
        for (int i7 = 0; i7 < this.f3148c; i7++) {
            boolean z8 = this.f3146a;
            i1.g gVar = (i1.g) ((C) this.f3147b.get(i7));
            synchronized (gVar) {
                try {
                    e0 e0Var = i1.g.f11396n;
                    if (z8 && (lVar.f3178h & 8) != 8) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        if (gVar.f == 0) {
                            gVar.f11405c.getClass();
                            gVar.f11408g = SystemClock.elapsedRealtime();
                        }
                        gVar.f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // M0.h
    public final void n(C c8) {
        c8.getClass();
        ArrayList arrayList = this.f3147b;
        if (!arrayList.contains(c8)) {
            arrayList.add(c8);
            this.f3148c++;
        }
    }
}
