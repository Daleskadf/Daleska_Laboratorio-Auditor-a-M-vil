package z0;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import com.example.appecoactivate.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import m6.AbstractC1447h;
import m6.AbstractC1453n;
import org.apache.tika.utils.StringUtils;
import p.C1608t;
/* renamed from: z0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2053m {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f16776a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f16777b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f16778c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16779d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16780e;

    public C2053m(ViewGroup container) {
        kotlin.jvm.internal.j.e(container, "container");
        this.f16776a = container;
        this.f16777b = new ArrayList();
        this.f16778c = new ArrayList();
    }

    public static final C2053m e(ViewGroup container, L fragmentManager) {
        kotlin.jvm.internal.j.e(container, "container");
        kotlin.jvm.internal.j.e(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.j.d(fragmentManager.I(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C2053m) {
            return (C2053m) tag;
        }
        C2053m c2053m = new C2053m(container);
        container.setTag(R.id.special_effects_controller_view_tag, c2053m);
        return c2053m;
    }

    public final void a(Y operation) {
        kotlin.jvm.internal.j.e(operation, "operation");
        if (!operation.f16727b) {
            return;
        }
        throw null;
    }

    public final void b(ArrayList arrayList, boolean z7) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            if (!listIterator.hasPrevious()) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Executing operations from " + ((Object) null) + " to " + ((Object) null));
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ((Y) AbstractC1447h.S(arrayList)).getClass();
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    Iterator it3 = arrayList.iterator();
                    if (it3.hasNext()) {
                        Y y2 = (Y) it3.next();
                        arrayList2.add(new C2047g(y2, z7));
                        new j3.f(y2);
                        y2.getClass();
                        if (c0.VISIBLE == null) {
                            if (z7) {
                                throw null;
                            }
                            throw null;
                        } else if (z7) {
                            throw null;
                        } else {
                            throw null;
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        if (!((C2052l) next).B()) {
                            arrayList4.add(next);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        ((C2052l) it5.next()).getClass();
                    }
                    Iterator it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        ((C2052l) it6.next()).getClass();
                    }
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it7 = arrayList2.iterator();
                    if (!it7.hasNext()) {
                        arrayList7.isEmpty();
                        Iterator it8 = arrayList2.iterator();
                        while (it8.hasNext()) {
                            C2047g c2047g = (C2047g) it8.next();
                            Context context = this.f16776a.getContext();
                            c2047g.getClass();
                            kotlin.jvm.internal.j.d(context, "context");
                            C1608t i02 = c2047g.i0(context);
                            if (i02 != null) {
                                if (((AnimatorSet) i02.f14881c) == null) {
                                    arrayList6.add(c2047g);
                                } else {
                                    throw null;
                                }
                            }
                        }
                        Iterator it9 = arrayList6.iterator();
                        if (!it9.hasNext()) {
                            return;
                        }
                        ((C2047g) it9.next()).getClass();
                        throw null;
                    }
                    ((C2047g) it7.next()).getClass();
                    throw null;
                }
                ((Y) it2.next()).getClass();
                throw null;
            }
            ((Y) listIterator.previous()).getClass();
            throw null;
        }
        ((Y) it.next()).getClass();
        throw null;
    }

    public final void c() {
        if (this.f16780e) {
            return;
        }
        if (!this.f16776a.isAttachedToWindow()) {
            d();
            this.f16779d = false;
            return;
        }
        synchronized (this.f16777b) {
            try {
                if (this.f16777b.isEmpty()) {
                    ArrayList a02 = AbstractC1447h.a0(this.f16778c);
                    this.f16778c.clear();
                    Iterator it = a02.iterator();
                    while (it.hasNext()) {
                        Y y2 = (Y) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + y2 + " with no incoming pendingOperations");
                        }
                        ViewGroup container = this.f16776a;
                        y2.getClass();
                        kotlin.jvm.internal.j.e(container, "container");
                        y2.a(container);
                        this.f16778c.add(y2);
                    }
                } else {
                    ArrayList a03 = AbstractC1447h.a0(this.f16778c);
                    this.f16778c.clear();
                    Iterator it2 = a03.iterator();
                    if (it2.hasNext()) {
                        Y y3 = (Y) it2.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + y3);
                        }
                        y3.getClass();
                        throw null;
                    }
                    g();
                    ArrayList a04 = AbstractC1447h.a0(this.f16777b);
                    if (a04.isEmpty()) {
                        return;
                    }
                    this.f16777b.clear();
                    this.f16778c.addAll(a04);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(a04, this.f16779d);
                    Iterator it3 = a04.iterator();
                    if (!it3.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it4 = a04.iterator();
                        while (it4.hasNext()) {
                            ((Y) it4.next()).getClass();
                            AbstractC1453n.N(arrayList, null);
                        }
                        if (!arrayList.isEmpty()) {
                            f(a04);
                            int size = a04.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                a((Y) a04.get(i7));
                            }
                        }
                        this.f16779d = false;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                        }
                    } else {
                        ((Y) it3.next()).getClass();
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f16776a.isAttachedToWindow();
        synchronized (this.f16777b) {
            try {
                g();
                f(this.f16777b);
                Iterator it = AbstractC1447h.a0(this.f16778c).iterator();
                while (it.hasNext()) {
                    Y y2 = (Y) it.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str2 = StringUtils.EMPTY;
                        } else {
                            str2 = "Container " + this.f16776a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + y2);
                    }
                    y2.a(this.f16776a);
                }
                Iterator it2 = AbstractC1447h.a0(this.f16777b).iterator();
                while (it2.hasNext()) {
                    Y y3 = (Y) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str = StringUtils.EMPTY;
                        } else {
                            str = "Container " + this.f16776a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + y3);
                    }
                    y3.a(this.f16776a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Y y2 = (Y) arrayList.get(i7);
            if (!y2.f16726a) {
                y2.f16726a = true;
                if (Z.ADDING != null) {
                    if (Z.REMOVING == null) {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Y) it.next()).getClass();
            AbstractC1453n.N(arrayList2, null);
        }
        List Y3 = AbstractC1447h.Y(AbstractC1447h.b0(arrayList2));
        int size2 = Y3.size();
        for (int i8 = 0; i8 < size2; i8++) {
            X x7 = (X) Y3.get(i8);
            x7.getClass();
            ViewGroup container = this.f16776a;
            kotlin.jvm.internal.j.e(container, "container");
            if (!x7.f16725a) {
                x7.c(container);
            }
            x7.f16725a = true;
        }
    }

    public final void g() {
        Iterator it = this.f16777b.iterator();
        while (it.hasNext()) {
            ((Y) it.next()).getClass();
            if (Z.ADDING == null) {
                throw null;
            }
        }
    }
}
