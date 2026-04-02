package d4;

import android.os.StrictMode;
import com.google.firebase.firestore.S;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadFactory f10322e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicLong f10323a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    public final String f10324b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10325c;

    /* renamed from: d  reason: collision with root package name */
    public final StrictMode.ThreadPolicy f10326d;

    public a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f10324b = str;
        this.f10325c = i7;
        this.f10326d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f10322e.newThread(new S(2, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f10323a.getAndIncrement();
        newThread.setName(this.f10324b + " Thread #" + andIncrement);
        return newThread;
    }
}
