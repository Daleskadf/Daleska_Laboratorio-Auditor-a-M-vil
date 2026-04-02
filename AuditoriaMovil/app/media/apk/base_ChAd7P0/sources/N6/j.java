package n6;

import java.io.Serializable;
import w6.p;
/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final j f14394a = new Object();

    @Override // n6.i
    public final g get(h key) {
        kotlin.jvm.internal.j.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // n6.i
    public final i minusKey(h key) {
        kotlin.jvm.internal.j.e(key, "key");
        return this;
    }

    @Override // n6.i
    public final i plus(i context) {
        kotlin.jvm.internal.j.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // n6.i
    public final Object fold(Object obj, p pVar) {
        return obj;
    }
}
