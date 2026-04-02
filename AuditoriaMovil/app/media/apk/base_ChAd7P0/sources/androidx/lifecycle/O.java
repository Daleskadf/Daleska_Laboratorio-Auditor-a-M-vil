package androidx.lifecycle;

import android.os.Bundle;
import c5.C0639a;
import com.google.firebase.firestore.Z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a  reason: collision with root package name */
    public static final C0639a f7908a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Z f7909b = new Z(15);

    /* renamed from: c  reason: collision with root package name */
    public static final v4.d f7910c = new Object();

    public static final void a(U u7, K5.s registry, AbstractC0564p lifecycle) {
        AutoCloseable autoCloseable;
        kotlin.jvm.internal.j.e(registry, "registry");
        kotlin.jvm.internal.j.e(lifecycle, "lifecycle");
        C0.a aVar = u7.f7923a;
        if (aVar != null) {
            synchronized (aVar.f426a) {
                autoCloseable = (AutoCloseable) aVar.f427b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        N n7 = (N) autoCloseable;
        if (n7 != null && !n7.f7907c) {
            n7.a(registry, lifecycle);
            EnumC0563o enumC0563o = ((C0570w) lifecycle).f7946c;
            if (enumC0563o != EnumC0563o.INITIALIZED && !enumC0563o.a(EnumC0563o.STARTED)) {
                lifecycle.a(new C0554f(registry, lifecycle));
            } else {
                registry.e();
            }
        }
    }

    public static M b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new M();
            }
            HashMap hashMap = new HashMap();
            for (String key : bundle2.keySet()) {
                kotlin.jvm.internal.j.d(key, "key");
                hashMap.put(key, bundle2.get(key));
            }
            return new M(hashMap);
        }
        ClassLoader classLoader = M.class.getClassLoader();
        kotlin.jvm.internal.j.b(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                Object obj = parcelableArrayList.get(i7);
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i7));
            }
            return new M(linkedHashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state");
    }

    public static final M c(B0.c cVar) {
        P p7;
        Bundle bundle;
        C0639a c0639a = f7908a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f229a;
        Z1.e eVar = (Z1.e) linkedHashMap.get(c0639a);
        if (eVar != null) {
            Y y2 = (Y) linkedHashMap.get(f7909b);
            if (y2 != null) {
                Bundle bundle2 = (Bundle) linkedHashMap.get(f7910c);
                String str = (String) linkedHashMap.get(C0.b.f430a);
                if (str != null) {
                    Z1.d b5 = eVar.c().b();
                    if (b5 instanceof P) {
                        p7 = (P) b5;
                    } else {
                        p7 = null;
                    }
                    if (p7 != null) {
                        LinkedHashMap linkedHashMap2 = e(y2).f7915b;
                        M m7 = (M) linkedHashMap2.get(str);
                        if (m7 == null) {
                            Class[] clsArr = M.f;
                            p7.b();
                            Bundle bundle3 = p7.f7913c;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = p7.f7913c;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = p7.f7913c;
                            if (bundle5 != null && bundle5.isEmpty()) {
                                p7.f7913c = null;
                            }
                            M b7 = b(bundle, bundle2);
                            linkedHashMap2.put(str, b7);
                            return b7;
                        }
                        return m7;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final void d(Z1.e eVar) {
        EnumC0563o enumC0563o = eVar.h().f7946c;
        if (enumC0563o != EnumC0563o.INITIALIZED && enumC0563o != EnumC0563o.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (eVar.c().b() == null) {
            P p7 = new P(eVar.c(), (Y) eVar);
            eVar.c().d("androidx.lifecycle.internal.SavedStateHandlesProvider", p7);
            eVar.h().a(new Z1.b(p7, 2));
        }
    }

    public static final Q e(Y y2) {
        B0.b defaultCreationExtras;
        e5.b bVar = new e5.b(15);
        X store = y2.g();
        if (y2 instanceof InterfaceC0557i) {
            defaultCreationExtras = ((InterfaceC0557i) y2).e();
        } else {
            defaultCreationExtras = B0.a.f228b;
        }
        kotlin.jvm.internal.j.e(store, "store");
        kotlin.jvm.internal.j.e(defaultCreationExtras, "defaultCreationExtras");
        return (Q) new V2.k(store, bVar, defaultCreationExtras).v(kotlin.jvm.internal.s.a(Q.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
