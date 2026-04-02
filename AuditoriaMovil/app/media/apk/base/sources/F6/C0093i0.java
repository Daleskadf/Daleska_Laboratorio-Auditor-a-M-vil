package F6;

import java.util.concurrent.CancellationException;
/* renamed from: F6.i0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093i0 extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final transient InterfaceC0091h0 f1277a;

    public C0093i0(String str, Throwable th, InterfaceC0091h0 interfaceC0091h0) {
        super(str);
        this.f1277a = interfaceC0091h0;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0093i0) {
                C0093i0 c0093i0 = (C0093i0) obj;
                if (!kotlin.jvm.internal.j.a(c0093i0.getMessage(), getMessage()) || !kotlin.jvm.internal.j.a(c0093i0.f1277a, this.f1277a) || !kotlin.jvm.internal.j.a(c0093i0.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i7;
        String message = getMessage();
        kotlin.jvm.internal.j.b(message);
        int hashCode = (this.f1277a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i7 = cause.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f1277a;
    }
}
