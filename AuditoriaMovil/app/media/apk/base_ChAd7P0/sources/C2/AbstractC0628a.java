package c2;

import android.os.Trace;
/* renamed from: c2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0628a {
    public static void a(int i7, String str) {
        Trace.beginAsyncSection(str, i7);
    }

    public static void b(int i7, String str) {
        Trace.endAsyncSection(str, i7);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(int i7, String str) {
        Trace.setCounter(str, i7);
    }
}
