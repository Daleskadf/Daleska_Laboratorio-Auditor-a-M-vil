package J6;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final transient I6.e f2424a;

    public a(I6.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f2424a = eVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
