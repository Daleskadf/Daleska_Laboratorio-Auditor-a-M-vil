package F6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* renamed from: F6.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084e {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1262b = AtomicIntegerFieldUpdater.newUpdater(C0084e.class, "notCompletedCount");

    /* renamed from: a  reason: collision with root package name */
    public final K[] f1263a;
    private volatile int notCompletedCount;

    public C0084e(K[] kArr) {
        this.f1263a = kArr;
        this.notCompletedCount = kArr.length;
    }
}
