package c6;

import a6.AbstractC0482k;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* renamed from: c6.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0705t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8986a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final long f8987b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8988c;

    public RunnableC0705t(C0708u c0708u, long j) {
        this.f8988c = c0708u;
        this.f8987b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        double longValue;
        long j = this.f8987b;
        Object obj = this.f8988c;
        switch (this.f8986a) {
            case 0:
                C0692o0 c0692o0 = new C0692o0(0);
                C0708u c0708u = (C0708u) obj;
                c0708u.j.d(c0692o0);
                long abs = Math.abs(j);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long nanos = abs / timeUnit.toNanos(1L);
                long abs2 = Math.abs(j) % timeUnit.toNanos(1L);
                StringBuilder sb = new StringBuilder("deadline exceeded after ");
                if (j < 0) {
                    sb.append('-');
                }
                sb.append(nanos);
                Locale locale = Locale.US;
                sb.append(String.format(locale, ".%09d", Long.valueOf(abs2)));
                sb.append("s. ");
                Long l8 = (Long) c0708u.f9002i.a(AbstractC0482k.f7161a);
                if (l8 == null) {
                    longValue = 0.0d;
                } else {
                    longValue = l8.longValue() / C0708u.f8994r;
                }
                sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(longValue)));
                sb.append(c0692o0);
                c0708u.j.i(a6.o0.f7175h.a(sb.toString()));
                return;
            default:
                FlutterJNI flutterJNI = (FlutterJNI) obj;
                if (flutterJNI.isAttached()) {
                    flutterJNI.unregisterTexture(j);
                    return;
                }
                return;
        }
    }

    public RunnableC0705t(long j, FlutterJNI flutterJNI) {
        this.f8987b = j;
        this.f8988c = flutterJNI;
    }
}
