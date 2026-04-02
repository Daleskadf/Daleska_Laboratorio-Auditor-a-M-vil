package j6;
/* renamed from: j6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1371b {

    /* renamed from: a  reason: collision with root package name */
    public static final C1370a f13458a;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, j6.a] */
    static {
        /*
            r0 = 2
            r1 = 3
            r2 = 0
            r3 = 1
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            java.lang.String r6 = "io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> Lf
            r7 = r5
            goto L12
        Lf:
            r6 = move-exception
            r7 = r6
            r6 = r5
        L12:
            if (r6 == 0) goto L33
            java.lang.Class<j6.a> r8 = j6.C1370a.class
            java.lang.Class r6 = r6.asSubclass(r8)     // Catch: java.lang.Throwable -> L31
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L31
            java.lang.Class<j6.c> r9 = j6.C1372c.class
            r8[r2] = r9     // Catch: java.lang.Throwable -> L31
            java.lang.reflect.Constructor r6 = r6.getConstructor(r8)     // Catch: java.lang.Throwable -> L31
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L31
            j6.c r9 = j6.C1370a.f13456a     // Catch: java.lang.Throwable -> L31
            r8[r2] = r9     // Catch: java.lang.Throwable -> L31
            java.lang.Object r6 = r6.newInstance(r8)     // Catch: java.lang.Throwable -> L31
            j6.a r6 = (j6.C1370a) r6     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r6 = move-exception
            r7 = r6
        L33:
            r6 = r5
        L34:
            if (r6 == 0) goto L39
            j6.AbstractC1371b.f13458a = r6
            goto L40
        L39:
            j6.a r6 = new j6.a
            r6.<init>()
            j6.AbstractC1371b.f13458a = r6
        L40:
            if (r7 == 0) goto L95
            java.lang.String r6 = "io.perfmark.PerfMark.debug"
            boolean r6 = java.lang.Boolean.getBoolean(r6)     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L95
            java.lang.String r6 = "java.util.logging.Logger"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L95
            java.lang.String r8 = "getLogger"
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L95
            r9[r2] = r4     // Catch: java.lang.Throwable -> L95
            java.lang.reflect.Method r8 = r6.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L95
            java.lang.Class<j6.b> r9 = j6.AbstractC1371b.class
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> L95
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L95
            r10[r2] = r9     // Catch: java.lang.Throwable -> L95
            java.lang.Object r8 = r8.invoke(r5, r10)     // Catch: java.lang.Throwable -> L95
            java.lang.String r9 = "java.util.logging.Level"
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> L95
            java.lang.String r10 = "FINE"
            java.lang.reflect.Field r10 = r9.getField(r10)     // Catch: java.lang.Throwable -> L95
            java.lang.Object r5 = r10.get(r5)     // Catch: java.lang.Throwable -> L95
            java.lang.String r10 = "log"
            java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L95
            r11[r2] = r9     // Catch: java.lang.Throwable -> L95
            r11[r3] = r4     // Catch: java.lang.Throwable -> L95
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r11[r0] = r4     // Catch: java.lang.Throwable -> L95
            java.lang.reflect.Method r4 = r6.getMethod(r10, r11)     // Catch: java.lang.Throwable -> L95
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L95
            r1[r2] = r5     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = "Error during PerfMark.<clinit>"
            r1[r3] = r2     // Catch: java.lang.Throwable -> L95
            r1[r0] = r7     // Catch: java.lang.Throwable -> L95
            r4.invoke(r8, r1)     // Catch: java.lang.Throwable -> L95
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.AbstractC1371b.<clinit>():void");
    }

    public static void a() {
        f13458a.getClass();
    }

    public static void b() {
        f13458a.getClass();
    }

    public static void c() {
        f13458a.getClass();
    }
}
