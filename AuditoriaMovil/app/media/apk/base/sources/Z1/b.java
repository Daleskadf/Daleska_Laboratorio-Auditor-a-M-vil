package Z1;

import D.AbstractC0059i;
import K5.s;
import android.os.Bundle;
import androidx.lifecycle.EnumC0562n;
import androidx.lifecycle.InterfaceC0556h;
import androidx.lifecycle.InterfaceC0566s;
import androidx.lifecycle.InterfaceC0568u;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.U;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;
import z0.AbstractActivityC2064y;
import z0.AbstractComponentCallbacksC2061v;
/* loaded from: classes.dex */
public final class b implements InterfaceC0566s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6732a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6733b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f6732a = i7;
        this.f6733b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0566s
    public final void j(InterfaceC0568u interfaceC0568u, EnumC0562n enumC0562n) {
        switch (this.f6732a) {
            case 0:
                if (enumC0562n == EnumC0562n.ON_CREATE) {
                    interfaceC0568u.h().b(this);
                    e eVar = (e) this.f6733b;
                    Bundle a7 = eVar.c().a("androidx.savedstate.Restarter");
                    if (a7 != null) {
                        ArrayList<String> stringArrayList = a7.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            for (String str : stringArrayList) {
                                try {
                                    Class<? extends U> asSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                                    j.d(asSubclass, "{\n                Class.…class.java)\n            }");
                                    try {
                                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance(null);
                                            j.d(newInstance, "{\n                constr…wInstance()\n            }");
                                            c cVar = (c) newInstance;
                                            if (eVar instanceof Y) {
                                                X g3 = ((Y) eVar).g();
                                                s c8 = eVar.c();
                                                g3.getClass();
                                                LinkedHashMap linkedHashMap = g3.f7927a;
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    String key = (String) it.next();
                                                    j.e(key, "key");
                                                    U u7 = (U) linkedHashMap.get(key);
                                                    j.b(u7);
                                                    O.a(u7, c8, eVar.h());
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    c8.e();
                                                }
                                            } else {
                                                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                            }
                                        } catch (Exception e7) {
                                            throw new RuntimeException(io.flutter.plugins.pathprovider.b.h("Failed to instantiate ", str), e7);
                                        }
                                    } catch (NoSuchMethodException e8) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
                                    }
                                } catch (ClassNotFoundException e9) {
                                    throw new RuntimeException(AbstractC0059i.M("Class ", str, " wasn't found"), e9);
                                }
                            }
                            return;
                        }
                        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case 1:
                new HashMap();
                InterfaceC0556h[] interfaceC0556hArr = (InterfaceC0556h[]) this.f6733b;
                if (interfaceC0556hArr.length <= 0) {
                    if (interfaceC0556hArr.length <= 0) {
                        return;
                    }
                    InterfaceC0556h interfaceC0556h = interfaceC0556hArr[0];
                    throw null;
                }
                InterfaceC0556h interfaceC0556h2 = interfaceC0556hArr[0];
                throw null;
            case 2:
                if (enumC0562n == EnumC0562n.ON_CREATE) {
                    interfaceC0568u.h().b(this);
                    ((P) this.f6733b).b();
                    return;
                }
                throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0562n).toString());
            case 3:
                AbstractActivityC2064y abstractActivityC2064y = (AbstractActivityC2064y) this.f6733b;
                if (abstractActivityC2064y.f10554e == null) {
                    e.j jVar = (e.j) abstractActivityC2064y.getLastNonConfigurationInstance();
                    if (jVar != null) {
                        abstractActivityC2064y.f10554e = jVar.f10533a;
                    }
                    if (abstractActivityC2064y.f10554e == null) {
                        abstractActivityC2064y.f10554e = new X();
                    }
                }
                abstractActivityC2064y.f6028a.b(this);
                return;
            default:
                if (enumC0562n == EnumC0562n.ON_STOP) {
                    ((AbstractComponentCallbacksC2061v) this.f6733b).getClass();
                    return;
                }
                return;
        }
    }
}
