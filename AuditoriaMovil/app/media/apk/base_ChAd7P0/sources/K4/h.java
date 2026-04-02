package K4;

import I4.G;
import I4.H;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class h implements H, Cloneable {

    /* renamed from: c  reason: collision with root package name */
    public static final h f2659c = new h();

    /* renamed from: a  reason: collision with root package name */
    public final List f2660a = Collections.emptyList();

    /* renamed from: b  reason: collision with root package name */
    public final List f2661b = Collections.emptyList();

    public final boolean a(Class cls, boolean z7) {
        List list;
        if (!z7 && !Enum.class.isAssignableFrom(cls)) {
            org.slf4j.helpers.i iVar = N4.c.f3448a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        if (z7) {
            list = this.f2660a;
        } else {
            list = this.f2661b;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public final Object clone() {
        try {
            return (h) super.clone();
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // I4.H
    public final G create(I4.n nVar, P4.a aVar) {
        Class cls = aVar.f4022a;
        boolean a7 = a(cls, true);
        boolean a8 = a(cls, false);
        if (!a7 && !a8) {
            return null;
        }
        return new g(this, a8, a7, nVar, aVar);
    }
}
