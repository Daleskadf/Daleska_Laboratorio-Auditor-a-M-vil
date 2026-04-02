package K6;

import a.AbstractC0412a;
import p6.AbstractC1698a;
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f2805a = 0;

    static {
        Object j;
        Object j8;
        Exception exc = new Exception();
        String simpleName = AbstractC0412a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            j = AbstractC1698a.class.getCanonicalName();
        } catch (Throwable th) {
            j = org.slf4j.helpers.i.j(th);
        }
        if (l6.f.a(j) != null) {
            j = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) j;
        try {
            j8 = v.class.getCanonicalName();
        } catch (Throwable th2) {
            j8 = org.slf4j.helpers.i.j(th2);
        }
        if (l6.f.a(j8) != null) {
            j8 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) j8;
    }
}
