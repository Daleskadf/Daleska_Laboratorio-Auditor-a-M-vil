package O6;

import K6.u;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes.dex */
public final class j extends u {

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReferenceArray f3886e;

    public j(long j, j jVar, int i7) {
        super(j, jVar, i7);
        this.f3886e = new AtomicReferenceArray(i.f);
    }

    @Override // K6.u
    public final int f() {
        return i.f;
    }

    @Override // K6.u
    public final void g(int i7, n6.i iVar) {
        this.f3886e.set(i7, i.f3885e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f2804c + ", hashCode=" + hashCode() + ']';
    }
}
