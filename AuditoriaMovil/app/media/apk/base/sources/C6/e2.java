package c6;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class e2 implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f8818c = Logger.getLogger(e2.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public boolean f8819a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayDeque f8820b;

    public final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.f8820b.poll();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    Level level = Level.SEVERE;
                    f8818c.log(level, "Exception while executing runnable " + runnable, th);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r6.f8820b == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void execute(java.lang.Runnable r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Exception while executing runnable "
            java.lang.String r1 = "'task' must not be null."
            G.i.j(r7, r1)
            boolean r1 = r6.f8819a
            if (r1 != 0) goto L40
            r1 = 1
            r6.f8819a = r1
            r1 = 0
            r7.run()     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayDeque r7 = r6.f8820b
            if (r7 == 0) goto L19
        L16:
            r6.a()
        L19:
            r6.f8819a = r1
            goto L51
        L1c:
            r2 = move-exception
            java.util.logging.Logger r3 = c6.e2.f8818c     // Catch: java.lang.Throwable -> L35
            java.util.logging.Level r4 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L35
            r5.append(r7)     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Throwable -> L35
            r3.log(r4, r7, r2)     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque r7 = r6.f8820b
            if (r7 == 0) goto L19
            goto L16
        L35:
            r7 = move-exception
            java.util.ArrayDeque r0 = r6.f8820b
            if (r0 == 0) goto L3d
            r6.a()
        L3d:
            r6.f8819a = r1
            throw r7
        L40:
            java.util.ArrayDeque r0 = r6.f8820b
            if (r0 != 0) goto L4c
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 4
            r0.<init>(r1)
            r6.f8820b = r0
        L4c:
            java.util.ArrayDeque r0 = r6.f8820b
            r0.add(r7)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.e2.execute(java.lang.Runnable):void");
    }
}
