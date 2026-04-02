package org.simpleframework.xml.core;

import java.lang.reflect.Method;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class Function {
    private final boolean contextual;
    private final Method method;

    public Function(Method method) {
        this(method, false);
    }

    public Object call(Context context, Object obj) {
        if (obj != null) {
            Map map = context.getSession().getMap();
            if (this.contextual) {
                return this.method.invoke(obj, map);
            }
            return this.method.invoke(obj, new Object[0]);
        }
        return null;
    }

    public Function(Method method, boolean z10) {
        this.contextual = z10;
        this.method = method;
    }
}
