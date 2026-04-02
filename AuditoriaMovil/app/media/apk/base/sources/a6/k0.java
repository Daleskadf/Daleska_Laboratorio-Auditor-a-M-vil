package a6;

import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f7162d = Logger.getLogger(k0.class.getName());

    /* renamed from: e  reason: collision with root package name */
    public static k0 f7163e;

    /* renamed from: a  reason: collision with root package name */
    public String f7164a = "unknown";

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f7165b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public A3.j0 f7166c = A3.j0.f157X;

    public final synchronized void a(j0 j0Var) {
        G.i.f("isAvailable() returned false", j0Var.b());
        this.f7165b.add(j0Var);
    }

    public final j0 b(String str) {
        A3.j0 j0Var;
        if (str == null) {
            return null;
        }
        synchronized (this) {
            j0Var = this.f7166c;
        }
        return (j0) j0Var.get(str.toLowerCase(Locale.US));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L34
            r0.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "unknown"
            java.util.LinkedHashSet r2 = r9.f7165b     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L34
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L10:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L49
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L34
            a6.j0 r4 = (a6.j0) r4     // Catch: java.lang.Throwable -> L34
            r4.getClass()     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "dns"
            java.lang.Object r6 = r0.get(r5)     // Catch: java.lang.Throwable -> L34
            a6.j0 r6 = (a6.j0) r6     // Catch: java.lang.Throwable -> L34
            if (r6 == 0) goto L36
            int r6 = r6.c()     // Catch: java.lang.Throwable -> L34
            int r7 = r4.c()     // Catch: java.lang.Throwable -> L34
            if (r6 >= r7) goto L39
            goto L36
        L34:
            r0 = move-exception
            goto L53
        L36:
            r0.put(r5, r4)     // Catch: java.lang.Throwable -> L34
        L39:
            int r5 = r4.c()     // Catch: java.lang.Throwable -> L34
            if (r3 >= r5) goto L10
            int r1 = r4.c()     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = "dns"
            r8 = r3
            r3 = r1
            r1 = r8
            goto L10
        L49:
            A3.j0 r0 = A3.j0.a(r0)     // Catch: java.lang.Throwable -> L34
            r9.f7166c = r0     // Catch: java.lang.Throwable -> L34
            r9.f7164a = r1     // Catch: java.lang.Throwable -> L34
            monitor-exit(r9)
            return
        L53:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L34
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.k0.c():void");
    }
}
