package Q6;

import java.io.InterruptedIOException;
/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    public static final z f4449a = new Object();

    public void a() {
        if (!Thread.currentThread().isInterrupted()) {
            return;
        }
        throw new InterruptedIOException("interrupted");
    }
}
