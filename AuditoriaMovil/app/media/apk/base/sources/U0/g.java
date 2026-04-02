package U0;

import android.os.SystemClock;
import h1.AbstractC1069c;
import java.util.List;
/* loaded from: classes.dex */
public final class g extends AbstractC1069c {

    /* renamed from: g  reason: collision with root package name */
    public int f5553g;

    @Override // h1.r
    public final int k() {
        return 0;
    }

    @Override // h1.r
    public final int l() {
        return this.f5553g;
    }

    @Override // h1.r
    public final Object o() {
        return null;
    }

    @Override // h1.r
    public final void q(long j, long j8, long j9, List list, f1.m[] mVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!c(this.f5553g, elapsedRealtime)) {
            return;
        }
        for (int i7 = this.f11234b - 1; i7 >= 0; i7--) {
            if (!c(i7, elapsedRealtime)) {
                this.f5553g = i7;
                return;
            }
        }
        throw new IllegalStateException();
    }
}
