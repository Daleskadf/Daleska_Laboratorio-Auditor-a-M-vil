package K1;

import A.j;
import K0.x;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
/* loaded from: classes.dex */
public abstract class i implements J1.e {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f2621a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f2622b;

    /* renamed from: c  reason: collision with root package name */
    public final PriorityQueue f2623c;

    /* renamed from: d  reason: collision with root package name */
    public h f2624d;

    /* renamed from: e  reason: collision with root package name */
    public long f2625e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public long f2626g;

    public i() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f2621a.add(new N0.f(1));
        }
        this.f2622b = new ArrayDeque();
        for (int i8 = 0; i8 < 2; i8++) {
            ArrayDeque arrayDeque = this.f2622b;
            j jVar = new j(this, 8);
            J1.c cVar = new J1.c();
            cVar.f2362Y = jVar;
            arrayDeque.add(cVar);
        }
        this.f2623c = new PriorityQueue();
        this.f2626g = -9223372036854775807L;
    }

    @Override // N0.c
    public final void a(long j) {
        this.f2626g = j;
    }

    @Override // J1.e
    public final void b(long j) {
        this.f2625e = j;
    }

    @Override // N0.c
    public final Object d() {
        boolean z7;
        if (this.f2624d == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        ArrayDeque arrayDeque = this.f2621a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        h hVar = (h) arrayDeque.pollFirst();
        this.f2624d = hVar;
        return hVar;
    }

    @Override // N0.c
    public final void e(J1.i iVar) {
        boolean z7;
        if (iVar == this.f2624d) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        h hVar = (h) iVar;
        long j = this.f2626g;
        if (j != -9223372036854775807L && hVar.f3345X < j) {
            hVar.e();
            this.f2621a.add(hVar);
        } else {
            long j8 = this.f;
            this.f = 1 + j8;
            hVar.f2620f0 = j8;
            this.f2623c.add(hVar);
        }
        this.f2624d = null;
    }

    public abstract A.c f();

    @Override // N0.c
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.f2625e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f2623c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f2621a;
            if (isEmpty) {
                break;
            }
            h hVar = (h) priorityQueue.poll();
            int i7 = x.f2529a;
            hVar.e();
            arrayDeque.add(hVar);
        }
        h hVar2 = this.f2624d;
        if (hVar2 != null) {
            hVar2.e();
            arrayDeque.add(hVar2);
            this.f2624d = null;
        }
    }

    public abstract void g(h hVar);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        return null;
     */
    @Override // N0.c
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public J1.c c() {
        /*
            r7 = this;
            java.util.ArrayDeque r0 = r7.f2622b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue r1 = r7.f2623c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6a
            java.lang.Object r3 = r1.peek()
            K1.h r3 = (K1.h) r3
            int r4 = K0.x.f2529a
            long r3 = r3.f3345X
            long r5 = r7.f2625e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L6a
            java.lang.Object r1 = r1.poll()
            K1.h r1 = (K1.h) r1
            r3 = 4
            boolean r4 = r1.c(r3)
            java.util.ArrayDeque r5 = r7.f2621a
            if (r4 == 0) goto L41
            java.lang.Object r0 = r0.pollFirst()
            J1.c r0 = (J1.c) r0
            r0.a(r3)
            r1.e()
            r5.add(r1)
            return r0
        L41:
            r7.g(r1)
            boolean r3 = r7.i()
            if (r3 == 0) goto L63
            A.c r2 = r7.f()
            java.lang.Object r0 = r0.pollFirst()
            J1.c r0 = (J1.c) r0
            long r3 = r1.f3345X
            r0.f3351c = r3
            r0.f2363e = r2
            r0.f = r3
            r1.e()
            r5.add(r1)
            return r0
        L63:
            r1.e()
            r5.add(r1)
            goto La
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.i.c():J1.c");
    }

    public abstract boolean i();

    @Override // N0.c
    public void release() {
    }
}
