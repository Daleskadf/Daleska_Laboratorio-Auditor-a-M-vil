package G;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public final Executor f1344b;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f1343a = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final c f1345c = new c(this, 1);

    /* renamed from: d  reason: collision with root package name */
    public j f1346d = j.IDLE;

    /* renamed from: e  reason: collision with root package name */
    public long f1347e = 0;

    public k(Executor executor) {
        executor.getClass();
        this.f1344b = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0067 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            r8.getClass()
            java.util.ArrayDeque r0 = r7.f1343a
            monitor-enter(r0)
            G.j r1 = r7.f1346d     // Catch: java.lang.Throwable -> L6e
            G.j r2 = G.j.RUNNING     // Catch: java.lang.Throwable -> L6e
            if (r1 == r2) goto L70
            G.j r2 = G.j.QUEUED     // Catch: java.lang.Throwable -> L6e
            if (r1 != r2) goto L11
            goto L70
        L11:
            long r3 = r7.f1347e     // Catch: java.lang.Throwable -> L6e
            D2.g r1 = new D2.g     // Catch: java.lang.Throwable -> L6e
            r5 = 1
            r1.<init>(r8, r5)     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayDeque r8 = r7.f1343a     // Catch: java.lang.Throwable -> L6e
            r8.add(r1)     // Catch: java.lang.Throwable -> L6e
            G.j r8 = G.j.QUEUING     // Catch: java.lang.Throwable -> L6e
            r7.f1346d = r8     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            java.util.concurrent.Executor r0 = r7.f1344b     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            G.c r5 = r7.f1345c     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            r0.execute(r5)     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            G.j r0 = r7.f1346d
            if (r0 == r8) goto L2f
            return
        L2f:
            java.util.ArrayDeque r0 = r7.f1343a
            monitor-enter(r0)
            long r5 = r7.f1347e     // Catch: java.lang.Throwable -> L3f
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L41
            G.j r1 = r7.f1346d     // Catch: java.lang.Throwable -> L3f
            if (r1 != r8) goto L41
            r7.f1346d = r2     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r8 = move-exception
            goto L43
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r8
        L45:
            r8 = move-exception
            goto L48
        L47:
            r8 = move-exception
        L48:
            java.util.ArrayDeque r2 = r7.f1343a
            monitor-enter(r2)
            G.j r0 = r7.f1346d     // Catch: java.lang.Throwable -> L56
            G.j r3 = G.j.IDLE     // Catch: java.lang.Throwable -> L56
            if (r0 == r3) goto L58
            G.j r3 = G.j.QUEUING     // Catch: java.lang.Throwable -> L56
            if (r0 != r3) goto L62
            goto L58
        L56:
            r8 = move-exception
            goto L6c
        L58:
            java.util.ArrayDeque r0 = r7.f1343a     // Catch: java.lang.Throwable -> L56
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L62
            r0 = 1
            goto L63
        L62:
            r0 = 0
        L63:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L6b
            if (r0 != 0) goto L6b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
            return
        L6b:
            throw r8     // Catch: java.lang.Throwable -> L56
        L6c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
            throw r8
        L6e:
            r8 = move-exception
            goto L77
        L70:
            java.util.ArrayDeque r1 = r7.f1343a     // Catch: java.lang.Throwable -> L6e
            r1.add(r8)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            return
        L77:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: G.k.execute(java.lang.Runnable):void");
    }
}
