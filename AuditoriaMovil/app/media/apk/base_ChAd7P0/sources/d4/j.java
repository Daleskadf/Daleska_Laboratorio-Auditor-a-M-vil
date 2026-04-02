package d4;

import com.google.android.gms.common.internal.I;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class j implements Executor {
    public static final Logger f = Logger.getLogger(j.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final Executor f10347a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f10348b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public i f10349c = i.IDLE;

    /* renamed from: d  reason: collision with root package name */
    public long f10350d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final H.h f10351e = new H.h(this);

    public j(Executor executor) {
        I.i(executor);
        this.f10347a = executor;
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
            com.google.android.gms.common.internal.I.i(r8)
            java.util.ArrayDeque r0 = r7.f10348b
            monitor-enter(r0)
            d4.i r1 = r7.f10349c     // Catch: java.lang.Throwable -> L6e
            d4.i r2 = d4.i.RUNNING     // Catch: java.lang.Throwable -> L6e
            if (r1 == r2) goto L70
            d4.i r2 = d4.i.QUEUED     // Catch: java.lang.Throwable -> L6e
            if (r1 != r2) goto L11
            goto L70
        L11:
            long r3 = r7.f10350d     // Catch: java.lang.Throwable -> L6e
            D2.g r1 = new D2.g     // Catch: java.lang.Throwable -> L6e
            r5 = 2
            r1.<init>(r8, r5)     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayDeque r8 = r7.f10348b     // Catch: java.lang.Throwable -> L6e
            r8.add(r1)     // Catch: java.lang.Throwable -> L6e
            d4.i r8 = d4.i.QUEUING     // Catch: java.lang.Throwable -> L6e
            r7.f10349c = r8     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            java.util.concurrent.Executor r0 = r7.f10347a     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            H.h r5 = r7.f10351e     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            r0.execute(r5)     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            d4.i r0 = r7.f10349c
            if (r0 == r8) goto L2f
            return
        L2f:
            java.util.ArrayDeque r0 = r7.f10348b
            monitor-enter(r0)
            long r5 = r7.f10350d     // Catch: java.lang.Throwable -> L3f
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L41
            d4.i r1 = r7.f10349c     // Catch: java.lang.Throwable -> L3f
            if (r1 != r8) goto L41
            r7.f10349c = r2     // Catch: java.lang.Throwable -> L3f
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
            java.util.ArrayDeque r2 = r7.f10348b
            monitor-enter(r2)
            d4.i r0 = r7.f10349c     // Catch: java.lang.Throwable -> L56
            d4.i r3 = d4.i.IDLE     // Catch: java.lang.Throwable -> L56
            if (r0 == r3) goto L58
            d4.i r3 = d4.i.QUEUING     // Catch: java.lang.Throwable -> L56
            if (r0 != r3) goto L62
            goto L58
        L56:
            r8 = move-exception
            goto L6c
        L58:
            java.util.ArrayDeque r0 = r7.f10348b     // Catch: java.lang.Throwable -> L56
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
            java.util.ArrayDeque r1 = r7.f10348b     // Catch: java.lang.Throwable -> L6e
            r1.add(r8)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            return
        L77:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.j.execute(java.lang.Runnable):void");
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f10347a + "}";
    }
}
