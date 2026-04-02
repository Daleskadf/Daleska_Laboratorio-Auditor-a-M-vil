package E3;

import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f1070a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f1071b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AtomicLong f1072c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Boolean f1073d;

    public c(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.f1070a = threadFactory;
        this.f1071b = str;
        this.f1072c = atomicLong;
        this.f1073d = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f1070a.newThread(runnable);
        Objects.requireNonNull(newThread);
        String str = this.f1071b;
        if (str != null) {
            AtomicLong atomicLong = this.f1072c;
            Objects.requireNonNull(atomicLong);
            newThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
        }
        Boolean bool = this.f1073d;
        if (bool != null) {
            newThread.setDaemon(bool.booleanValue());
        }
        return newThread;
    }
}
