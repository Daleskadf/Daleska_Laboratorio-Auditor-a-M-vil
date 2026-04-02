package c6;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
/* renamed from: c6.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0661e {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f8814c = Logger.getLogger(C0661e.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final String f8815a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicLong f8816b;

    public C0661e(long j) {
        boolean z7;
        AtomicLong atomicLong = new AtomicLong();
        this.f8816b = atomicLong;
        if (j > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.f("value must be positive", z7);
        this.f8815a = "keepalive time nanos";
        atomicLong.set(j);
    }
}
