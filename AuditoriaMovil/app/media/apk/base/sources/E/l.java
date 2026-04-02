package e;

import W.AbstractC0359b;
import a.AbstractC0412a;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import d0.AbstractC0884b;
import g.C0996a;
import g.C0998c;
import g.C1001f;
import g.InterfaceC0997b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import z0.AbstractActivityC2064y;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f10538a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f10539b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f10540c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f10541d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final transient LinkedHashMap f10542e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f10543g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2064y f10544h;

    public l(AbstractActivityC2064y abstractActivityC2064y) {
        this.f10544h = abstractActivityC2064y;
    }

    public final boolean a(int i7, int i8, Intent intent) {
        InterfaceC0997b interfaceC0997b;
        String str = (String) this.f10538a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        C0998c c0998c = (C0998c) this.f10542e.get(str);
        if (c0998c != null) {
            interfaceC0997b = c0998c.f11077a;
        } else {
            interfaceC0997b = null;
        }
        if (interfaceC0997b != null) {
            ArrayList arrayList = this.f10541d;
            if (arrayList.contains(str)) {
                c0998c.f11077a.i(c0998c.f11078b.Q(intent, i8));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.f10543g.putParcelable(str, new C0996a(intent, i8));
        return true;
    }

    public final void b(int i7, AbstractC0412a abstractC0412a, Intent intent) {
        Bundle bundle;
        AbstractActivityC2064y abstractActivityC2064y = this.f10544h;
        F2.c u7 = abstractC0412a.u(abstractActivityC2064y, intent);
        if (u7 != null) {
            new Handler(Looper.getMainLooper()).post(new K0.g(this, i7, 2, u7));
            return;
        }
        Intent g3 = abstractC0412a.g(abstractActivityC2064y, intent);
        if (g3.getExtras() != null) {
            Bundle extras = g3.getExtras();
            kotlin.jvm.internal.j.b(extras);
            if (extras.getClassLoader() == null) {
                g3.setExtrasClassLoader(abstractActivityC2064y.getClassLoader());
            }
        }
        if (g3.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = g3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            g3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(g3.getAction())) {
            String[] stringArrayExtra = g3.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC0359b.a(abstractActivityC2064y, stringArrayExtra, i7);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(g3.getAction())) {
            C1001f c1001f = (C1001f) g3.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                kotlin.jvm.internal.j.b(c1001f);
                abstractActivityC2064y.startIntentSenderForResult(c1001f.f11080a, i7, c1001f.f11081b, c1001f.f11082c, c1001f.f11083d, 0, bundle);
            } catch (IntentSender.SendIntentException e7) {
                new Handler(Looper.getMainLooper()).post(new K0.g(this, i7, 3, e7));
            }
        } else {
            abstractActivityC2064y.startActivityForResult(g3, i7, bundle);
        }
    }

    public final R1.j c(String key, AbstractC0412a abstractC0412a, InterfaceC0997b interfaceC0997b) {
        Object parcelable;
        kotlin.jvm.internal.j.e(key, "key");
        LinkedHashMap linkedHashMap = this.f10539b;
        if (((Integer) linkedHashMap.get(key)) == null) {
            Iterator it = new D6.a(new D6.c(new kotlin.jvm.internal.k(1), 0)).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f10538a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), key);
                    linkedHashMap.put(key, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f10542e.put(key, new C0998c(interfaceC0997b, abstractC0412a));
        LinkedHashMap linkedHashMap3 = this.f;
        if (linkedHashMap3.containsKey(key)) {
            Object obj = linkedHashMap3.get(key);
            linkedHashMap3.remove(key);
            interfaceC0997b.i(obj);
        }
        int i7 = Build.VERSION.SDK_INT;
        Bundle bundle = this.f10543g;
        if (i7 >= 34) {
            parcelable = AbstractC0884b.a(key, bundle);
        } else {
            parcelable = bundle.getParcelable(key);
            if (!C0996a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0996a c0996a = (C0996a) parcelable;
        if (c0996a != null) {
            bundle.remove(key);
            interfaceC0997b.i(abstractC0412a.Q(c0996a.f11076b, c0996a.f11075a));
        }
        return new R1.j(this, key, abstractC0412a, 17);
    }
}
