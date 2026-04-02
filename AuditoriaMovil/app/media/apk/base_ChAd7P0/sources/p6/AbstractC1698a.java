package p6;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.j;
import o6.EnumC1565a;
import p.C0;
/* renamed from: p6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1698a implements n6.d, InterfaceC1701d, Serializable {
    private final n6.d completion;

    public AbstractC1698a(n6.d dVar) {
        this.completion = dVar;
    }

    public n6.d create(n6.d completion) {
        j.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public InterfaceC1701d getCallerFrame() {
        n6.d dVar = this.completion;
        if (dVar instanceof InterfaceC1701d) {
            return (InterfaceC1701d) dVar;
        }
        return null;
    }

    public final n6.d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i7;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i8;
        InterfaceC1702e interfaceC1702e = (InterfaceC1702e) getClass().getAnnotation(InterfaceC1702e.class);
        String str2 = null;
        if (interfaceC1702e == null) {
            return null;
        }
        int v6 = interfaceC1702e.v();
        if (v6 <= 1) {
            int i9 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i8 = num.intValue();
                } else {
                    i8 = 0;
                }
                i7 = i8 - 1;
            } catch (Exception unused) {
                i7 = -1;
            }
            if (i7 >= 0) {
                i9 = interfaceC1702e.l()[i7];
            }
            C0 c02 = AbstractC1703f.f15315b;
            C0 c03 = AbstractC1703f.f15314a;
            if (c02 == null) {
                try {
                    C0 c04 = new C0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    AbstractC1703f.f15315b = c04;
                    c02 = c04;
                } catch (Exception unused2) {
                    AbstractC1703f.f15315b = c03;
                    c02 = c03;
                }
            }
            if (c02 != c03) {
                Method method = c02.f14645a;
                if (method != null) {
                    obj = method.invoke(getClass(), null);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = c02.f14646b;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, null);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = c02.f14647c;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, null);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = interfaceC1702e.c();
            } else {
                str = str2 + '/' + interfaceC1702e.c();
            }
            return new StackTraceElement(str, interfaceC1702e.m(), interfaceC1702e.f(), i9);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v6 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // n6.d
    public final void resumeWith(Object obj) {
        n6.d dVar = this;
        while (true) {
            AbstractC1698a abstractC1698a = (AbstractC1698a) dVar;
            n6.d dVar2 = abstractC1698a.completion;
            j.b(dVar2);
            try {
                obj = abstractC1698a.invokeSuspend(obj);
                if (obj == EnumC1565a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = org.slf4j.helpers.i.j(th);
            }
            abstractC1698a.releaseIntercepted();
            if (dVar2 instanceof AbstractC1698a) {
                dVar = dVar2;
            } else {
                dVar2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public n6.d create(Object obj, n6.d completion) {
        j.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
