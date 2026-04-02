package U;

import H4.W;
/* loaded from: classes.dex */
public final class f extends W {
    @Override // H4.W
    public final void C(g gVar, g gVar2) {
        gVar.f5522b = gVar2;
    }

    @Override // H4.W
    public final void D(g gVar, Thread thread) {
        gVar.f5521a = thread;
    }

    @Override // H4.W
    public final boolean c(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f5527b == dVar) {
                    hVar.f5527b = dVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H4.W
    public final boolean d(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f5526a == obj) {
                    hVar.f5526a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H4.W
    public final boolean e(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f5528c == gVar) {
                    hVar.f5528c = gVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
