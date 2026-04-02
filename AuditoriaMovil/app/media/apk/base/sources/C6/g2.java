package c6;
/* loaded from: classes.dex */
public final class g2 extends k2 {
    @Override // c6.k2
    public final boolean r(h2 h2Var) {
        synchronized (h2Var) {
            try {
                if (h2Var.f8849c == 0) {
                    h2Var.f8849c = -1;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c6.k2
    public final void s(h2 h2Var) {
        synchronized (h2Var) {
            h2Var.f8849c = 0;
        }
    }
}
