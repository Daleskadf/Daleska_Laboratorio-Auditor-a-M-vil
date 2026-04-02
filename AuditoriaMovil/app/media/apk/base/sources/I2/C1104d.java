package i2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import n2.C1463b;
/* renamed from: i2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1104d implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final kotlin.jvm.internal.e f11454a;

    /* renamed from: b  reason: collision with root package name */
    public final C1463b f11455b;

    public C1104d(kotlin.jvm.internal.e eVar, C1463b c1463b) {
        this.f11454a = eVar;
        this.f11455b = c1463b;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        kotlin.jvm.internal.e eVar;
        kotlin.jvm.internal.j.e(obj, "obj");
        kotlin.jvm.internal.j.e(method, "method");
        boolean a7 = kotlin.jvm.internal.j.a(method.getName(), "accept");
        C1463b c1463b = this.f11455b;
        boolean z7 = false;
        if (a7 && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (this.f11454a.d(obj2)) {
                kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
                c1463b.invoke(obj2);
                return l6.j.f13876a;
            }
            throw new ClassCastException("Value cannot be cast to " + eVar.b());
        } else if (kotlin.jvm.internal.j.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            if (obj == objArr[0]) {
                z7 = true;
            }
            return Boolean.valueOf(z7);
        } else if (kotlin.jvm.internal.j.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(c1463b.hashCode());
        } else {
            if (kotlin.jvm.internal.j.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return c1463b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
    }
}
