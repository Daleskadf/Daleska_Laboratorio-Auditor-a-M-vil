package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import j6.C1372c;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import z0.AbstractActivityC2064y;
/* loaded from: classes.dex */
public final class S implements W {

    /* renamed from: a  reason: collision with root package name */
    public final Application f7916a;

    /* renamed from: b  reason: collision with root package name */
    public final V f7917b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f7918c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC0564p f7919d;

    /* renamed from: e  reason: collision with root package name */
    public final K5.s f7920e;

    public S(Application application, AbstractActivityC2064y abstractActivityC2064y, Bundle bundle) {
        V v6;
        this.f7920e = (K5.s) abstractActivityC2064y.f10553d.f690c;
        this.f7919d = abstractActivityC2064y.f6028a;
        this.f7918c = bundle;
        this.f7916a = application;
        if (application != null) {
            if (V.f7924d == null) {
                V.f7924d = new V(application);
            }
            v6 = V.f7924d;
            kotlin.jvm.internal.j.b(v6);
        } else {
            v6 = new V(null);
        }
        this.f7917b = v6;
    }

    public final U a(Class cls, String str) {
        Constructor a7;
        U b5;
        AutoCloseable autoCloseable;
        Application application;
        AbstractC0564p abstractC0564p = this.f7919d;
        if (abstractC0564p != null) {
            boolean isAssignableFrom = AbstractC0549a.class.isAssignableFrom(cls);
            if (isAssignableFrom && this.f7916a != null) {
                a7 = T.a(cls, T.f7921a);
            } else {
                a7 = T.a(cls, T.f7922b);
            }
            if (a7 == null) {
                if (this.f7916a != null) {
                    return this.f7917b.c(cls);
                }
                if (C1372c.f13459b == null) {
                    C1372c.f13459b = new C1372c(15);
                }
                C1372c c1372c = C1372c.f13459b;
                kotlin.jvm.internal.j.b(c1372c);
                return c1372c.c(cls);
            }
            K5.s sVar = this.f7920e;
            kotlin.jvm.internal.j.b(sVar);
            Bundle bundle = this.f7918c;
            Bundle a8 = sVar.a(str);
            Class[] clsArr = M.f;
            M b7 = O.b(a8, bundle);
            N n7 = new N(str, b7);
            n7.a(sVar, abstractC0564p);
            EnumC0563o enumC0563o = ((C0570w) abstractC0564p).f7946c;
            if (enumC0563o != EnumC0563o.INITIALIZED && !enumC0563o.a(EnumC0563o.STARTED)) {
                abstractC0564p.a(new C0554f(sVar, abstractC0564p));
            } else {
                sVar.e();
            }
            if (isAssignableFrom && (application = this.f7916a) != null) {
                b5 = T.b(cls, a7, application, b7);
            } else {
                b5 = T.b(cls, a7, b7);
            }
            b5.getClass();
            C0.a aVar = b5.f7923a;
            if (aVar != null) {
                if (aVar.f429d) {
                    C0.a.a(n7);
                } else {
                    synchronized (aVar.f426a) {
                        autoCloseable = (AutoCloseable) aVar.f427b.put("androidx.lifecycle.savedstate.vm.tag", n7);
                    }
                    C0.a.a(autoCloseable);
                }
            }
            return b5;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.W
    public final U c(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.W
    public final /* synthetic */ U e(kotlin.jvm.internal.e eVar, B0.c cVar) {
        return androidx.datastore.preferences.protobuf.Y.a(this, eVar, cVar);
    }

    @Override // androidx.lifecycle.W
    public final U n(Class cls, B0.c cVar) {
        Constructor a7;
        C0.b bVar = C0.b.f430a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f229a;
        String str = (String) linkedHashMap.get(bVar);
        if (str != null) {
            if (linkedHashMap.get(O.f7908a) != null && linkedHashMap.get(O.f7909b) != null) {
                Application application = (Application) linkedHashMap.get(V.f7925e);
                boolean isAssignableFrom = AbstractC0549a.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a7 = T.a(cls, T.f7921a);
                } else {
                    a7 = T.a(cls, T.f7922b);
                }
                if (a7 == null) {
                    return this.f7917b.n(cls, cVar);
                }
                if (isAssignableFrom && application != null) {
                    return T.b(cls, a7, application, O.c(cVar));
                }
                return T.b(cls, a7, O.c(cVar));
            } else if (this.f7919d != null) {
                return a(cls, str);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }
}
