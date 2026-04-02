package org.slf4j.helpers;

import java.io.PrintStream;
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final e f14627a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f14628b;

    static {
        e eVar;
        d dVar;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        if (property != null && !property.isEmpty()) {
            int i7 = 0;
            while (true) {
                if (i7 < 3) {
                    if (strArr[i7].equalsIgnoreCase(property)) {
                        eVar = e.Stdout;
                        break;
                    }
                    i7++;
                } else {
                    eVar = e.Stderr;
                    break;
                }
            }
        } else {
            eVar = e.Stderr;
        }
        f14627a = eVar;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                dVar = d.DEBUG;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                dVar = d.ERROR;
            } else if (property2.equalsIgnoreCase("WARN")) {
                dVar = d.WARN;
            } else {
                dVar = d.INFO;
            }
        } else {
            dVar = d.INFO;
        }
        f14628b = dVar;
    }

    public static final void a(String str, Throwable th) {
        PrintStream b5 = b();
        b5.println("SLF4J(E): " + str);
        b().println("SLF4J(E): Reported exception:");
        th.printStackTrace(b());
    }

    public static PrintStream b() {
        if (f14627a.ordinal() != 1) {
            return System.err;
        }
        return System.out;
    }

    public static boolean c(d dVar) {
        if (dVar.levelInt >= f14628b.levelInt) {
            return true;
        }
        return false;
    }

    public static final void d(String str) {
        if (c(d.WARN)) {
            PrintStream b5 = b();
            b5.println("SLF4J(W): " + str);
        }
    }
}
