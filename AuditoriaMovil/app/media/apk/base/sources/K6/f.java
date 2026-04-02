package K6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final List f2775a;

    static {
        try {
            Iterator it = Arrays.asList(new G6.b()).iterator();
            kotlin.jvm.internal.j.e(it, "<this>");
            f2775a = D6.f.H(new D6.a(new D6.c(it, 2)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
