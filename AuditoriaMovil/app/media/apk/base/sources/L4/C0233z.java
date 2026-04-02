package L4;

import D.AbstractC0059i;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: L4.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233z {

    /* renamed from: a  reason: collision with root package name */
    public final String f3018a;

    /* renamed from: b  reason: collision with root package name */
    public final Field f3019b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3020c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f3021d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Method f3022e;
    public final /* synthetic */ I4.G f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ I4.G f3023g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f3024h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f3025i;

    public C0233z(String str, Field field, boolean z7, Method method, I4.G g3, I4.G g4, boolean z8, boolean z9) {
        this.f3021d = z7;
        this.f3022e = method;
        this.f = g3;
        this.f3023g = g4;
        this.f3024h = z8;
        this.f3025i = z9;
        this.f3018a = str;
        this.f3019b = field;
        this.f3020c = field.getName();
    }

    public final void a(Q4.c cVar, Object obj) {
        Object obj2;
        Field field = this.f3019b;
        boolean z7 = this.f3021d;
        Method method = this.f3022e;
        if (z7) {
            if (method == null) {
                E.a(obj, field);
            } else {
                E.a(obj, method);
            }
        }
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e7) {
                throw new RuntimeException(AbstractC0059i.M("Accessor ", N4.c.d(method, false), " threw exception"), e7.getCause());
            }
        } else {
            obj2 = field.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        cVar.m(this.f3018a);
        this.f.c(cVar, obj2);
    }
}
