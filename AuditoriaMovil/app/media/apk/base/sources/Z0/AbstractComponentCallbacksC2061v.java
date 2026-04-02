package z0;

import D.AbstractC0059i;
import D.C0054d;
import a.AbstractC0412a;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0570w;
import androidx.lifecycle.EnumC0563o;
import androidx.lifecycle.InterfaceC0557i;
import androidx.lifecycle.InterfaceC0568u;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import k0.RunnableC1375b;
import org.apache.tika.metadata.TikaCoreProperties;
/* renamed from: z0.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC2061v implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0568u, androidx.lifecycle.Y, InterfaceC0557i, Z1.e {

    /* renamed from: M0  reason: collision with root package name */
    public static final Object f16810M0 = new Object();

    /* renamed from: A0  reason: collision with root package name */
    public boolean f16811A0;

    /* renamed from: C0  reason: collision with root package name */
    public C2060u f16813C0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f16814D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f16815E0;

    /* renamed from: F0  reason: collision with root package name */
    public String f16816F0;

    /* renamed from: G0  reason: collision with root package name */
    public EnumC0563o f16817G0;

    /* renamed from: H0  reason: collision with root package name */
    public C0570w f16818H0;

    /* renamed from: I0  reason: collision with root package name */
    public final androidx.lifecycle.C f16819I0;

    /* renamed from: J0  reason: collision with root package name */
    public C0054d f16820J0;

    /* renamed from: K0  reason: collision with root package name */
    public final ArrayList f16821K0;

    /* renamed from: L0  reason: collision with root package name */
    public final C2058s f16822L0;

    /* renamed from: X  reason: collision with root package name */
    public AbstractComponentCallbacksC2061v f16823X;

    /* renamed from: Z  reason: collision with root package name */
    public int f16825Z;

    /* renamed from: b  reason: collision with root package name */
    public Bundle f16827b;

    /* renamed from: c  reason: collision with root package name */
    public SparseArray f16828c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f16829d;
    public Bundle f;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f16832f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f16833g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f16834h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f16835i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f16836j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f16837k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f16838l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f16839m0;

    /* renamed from: n0  reason: collision with root package name */
    public L f16840n0;

    /* renamed from: o0  reason: collision with root package name */
    public C2063x f16841o0;
    public AbstractComponentCallbacksC2061v q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f16843r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f16844s0;

    /* renamed from: t0  reason: collision with root package name */
    public String f16845t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f16846u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f16847v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f16848w0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f16850y0;

    /* renamed from: z0  reason: collision with root package name */
    public ViewGroup f16851z0;

    /* renamed from: a  reason: collision with root package name */
    public int f16826a = -1;

    /* renamed from: e  reason: collision with root package name */
    public String f16830e = UUID.randomUUID().toString();

    /* renamed from: Y  reason: collision with root package name */
    public String f16824Y = null;

    /* renamed from: e0  reason: collision with root package name */
    public Boolean f16831e0 = null;

    /* renamed from: p0  reason: collision with root package name */
    public L f16842p0 = new L();

    /* renamed from: x0  reason: collision with root package name */
    public final boolean f16849x0 = true;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f16812B0 = true;

    public AbstractComponentCallbacksC2061v() {
        new RunnableC1375b(this, 5);
        this.f16817G0 = EnumC0563o.RESUMED;
        this.f16819I0 = new androidx.lifecycle.C();
        new AtomicInteger();
        this.f16821K0 = new ArrayList();
        this.f16822L0 = new C2058s(this);
        o();
    }

    public LayoutInflater A(Bundle bundle) {
        C2063x c2063x = this.f16841o0;
        if (c2063x != null) {
            AbstractActivityC2064y abstractActivityC2064y = c2063x.f16855Y;
            LayoutInflater cloneInContext = abstractActivityC2064y.getLayoutInflater().cloneInContext(abstractActivityC2064y);
            cloneInContext.setFactory2(this.f16842p0.f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void B() {
        this.f16850y0 = true;
    }

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E();

    public void F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16842p0.P();
        this.f16838l0 = true;
        g();
    }

    public final Context G() {
        AbstractActivityC2064y abstractActivityC2064y;
        C2063x c2063x = this.f16841o0;
        if (c2063x == null) {
            abstractActivityC2064y = null;
        } else {
            abstractActivityC2064y = c2063x.f16857e;
        }
        if (abstractActivityC2064y != null) {
            return abstractActivityC2064y;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final void H(int i7, int i8, int i9, int i10) {
        if (this.f16813C0 == null && i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            return;
        }
        k().f16803b = i7;
        k().f16804c = i8;
        k().f16805d = i9;
        k().f16806e = i10;
    }

    @Override // Z1.e
    public final K5.s c() {
        return (K5.s) this.f16820J0.f690c;
    }

    @Override // androidx.lifecycle.InterfaceC0557i
    public final B0.c e() {
        Application application;
        Context applicationContext = G().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + G().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        B0.c cVar = new B0.c(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f229a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.V.f7925e, application);
        }
        linkedHashMap.put(androidx.lifecycle.O.f7908a, this);
        linkedHashMap.put(androidx.lifecycle.O.f7909b, this);
        Bundle bundle = this.f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.O.f7910c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.Y
    public final androidx.lifecycle.X g() {
        if (this.f16840n0 != null) {
            if (m() != EnumC0563o.INITIALIZED.ordinal()) {
                HashMap hashMap = this.f16840n0.f16656N.f16692d;
                androidx.lifecycle.X x7 = (androidx.lifecycle.X) hashMap.get(this.f16830e);
                if (x7 == null) {
                    androidx.lifecycle.X x8 = new androidx.lifecycle.X();
                    hashMap.put(this.f16830e, x8);
                    return x8;
                }
                return x7;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.InterfaceC0568u
    public final C0570w h() {
        return this.f16818H0;
    }

    public org.slf4j.helpers.i i() {
        return new C2059t(this);
    }

    public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z7;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f16843r0));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f16844s0));
        printWriter.print(" mTag=");
        printWriter.println(this.f16845t0);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f16826a);
        printWriter.print(" mWho=");
        printWriter.print(this.f16830e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f16839m0);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f16832f0);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f16833g0);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f16835i0);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f16836j0);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f16846u0);
        printWriter.print(" mDetached=");
        printWriter.print(this.f16847v0);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f16849x0);
        printWriter.print(" mHasMenu=");
        int i14 = 0;
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f16848w0);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f16812B0);
        if (this.f16840n0 != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f16840n0);
        }
        if (this.f16841o0 != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f16841o0);
        }
        if (this.q0 != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.q0);
        }
        if (this.f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f);
        }
        if (this.f16827b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f16827b);
        }
        if (this.f16828c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f16828c);
        }
        if (this.f16829d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f16829d);
        }
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16823X;
        AbstractActivityC2064y abstractActivityC2064y = null;
        if (abstractComponentCallbacksC2061v == null) {
            L l8 = this.f16840n0;
            if (l8 != null && (str2 = this.f16824Y) != null) {
                abstractComponentCallbacksC2061v = l8.f16660c.D(str2);
            } else {
                abstractComponentCallbacksC2061v = null;
            }
        }
        if (abstractComponentCallbacksC2061v != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(abstractComponentCallbacksC2061v);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f16825Z);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        C2060u c2060u = this.f16813C0;
        if (c2060u == null) {
            z7 = false;
        } else {
            z7 = c2060u.f16802a;
        }
        printWriter.println(z7);
        C2060u c2060u2 = this.f16813C0;
        if (c2060u2 == null) {
            i7 = 0;
        } else {
            i7 = c2060u2.f16803b;
        }
        if (i7 != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            C2060u c2060u3 = this.f16813C0;
            if (c2060u3 == null) {
                i13 = 0;
            } else {
                i13 = c2060u3.f16803b;
            }
            printWriter.println(i13);
        }
        C2060u c2060u4 = this.f16813C0;
        if (c2060u4 == null) {
            i8 = 0;
        } else {
            i8 = c2060u4.f16804c;
        }
        if (i8 != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            C2060u c2060u5 = this.f16813C0;
            if (c2060u5 == null) {
                i12 = 0;
            } else {
                i12 = c2060u5.f16804c;
            }
            printWriter.println(i12);
        }
        C2060u c2060u6 = this.f16813C0;
        if (c2060u6 == null) {
            i9 = 0;
        } else {
            i9 = c2060u6.f16805d;
        }
        if (i9 != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            C2060u c2060u7 = this.f16813C0;
            if (c2060u7 == null) {
                i11 = 0;
            } else {
                i11 = c2060u7.f16805d;
            }
            printWriter.println(i11);
        }
        C2060u c2060u8 = this.f16813C0;
        if (c2060u8 == null) {
            i10 = 0;
        } else {
            i10 = c2060u8.f16806e;
        }
        if (i10 != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            C2060u c2060u9 = this.f16813C0;
            if (c2060u9 != null) {
                i14 = c2060u9.f16806e;
            }
            printWriter.println(i14);
        }
        if (this.f16851z0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f16851z0);
        }
        C2063x c2063x = this.f16841o0;
        if (c2063x != null) {
            abstractActivityC2064y = c2063x.f16857e;
        }
        if (abstractActivityC2064y != null) {
            new A.f(this, g()).i(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f16842p0 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        this.f16842p0.w(AbstractC0059i.z(str, "  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [z0.u, java.lang.Object] */
    public final C2060u k() {
        if (this.f16813C0 == null) {
            ?? obj = new Object();
            Object obj2 = f16810M0;
            obj.f16807g = obj2;
            obj.f16808h = obj2;
            obj.f16809i = obj2;
            obj.j = null;
            this.f16813C0 = obj;
        }
        return this.f16813C0;
    }

    public final L l() {
        if (this.f16841o0 != null) {
            return this.f16842p0;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final int m() {
        EnumC0563o enumC0563o = this.f16817G0;
        if (enumC0563o != EnumC0563o.INITIALIZED && this.q0 != null) {
            return Math.min(enumC0563o.ordinal(), this.q0.m());
        }
        return enumC0563o.ordinal();
    }

    public final L n() {
        L l8 = this.f16840n0;
        if (l8 != null) {
            return l8;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void o() {
        Bundle bundle;
        this.f16818H0 = new C0570w(this);
        this.f16820J0 = new C0054d((Z1.e) this);
        ArrayList arrayList = this.f16821K0;
        C2058s c2058s = this.f16822L0;
        if (!arrayList.contains(c2058s)) {
            if (this.f16826a >= 0) {
                AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = c2058s.f16800a;
                abstractComponentCallbacksC2061v.f16820J0.l();
                androidx.lifecycle.O.d(abstractComponentCallbacksC2061v);
                Bundle bundle2 = abstractComponentCallbacksC2061v.f16827b;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle("registryState");
                } else {
                    bundle = null;
                }
                abstractComponentCallbacksC2061v.f16820J0.m(bundle);
                return;
            }
            arrayList.add(c2058s);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f16850y0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AbstractActivityC2064y abstractActivityC2064y;
        C2063x c2063x = this.f16841o0;
        if (c2063x == null) {
            abstractActivityC2064y = null;
        } else {
            abstractActivityC2064y = c2063x.f16856d;
        }
        if (abstractActivityC2064y != null) {
            abstractActivityC2064y.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f16850y0 = true;
    }

    public final void p() {
        o();
        this.f16816F0 = this.f16830e;
        this.f16830e = UUID.randomUUID().toString();
        this.f16832f0 = false;
        this.f16833g0 = false;
        this.f16835i0 = false;
        this.f16836j0 = false;
        this.f16837k0 = false;
        this.f16839m0 = 0;
        this.f16840n0 = null;
        this.f16842p0 = new L();
        this.f16841o0 = null;
        this.f16843r0 = 0;
        this.f16844s0 = 0;
        this.f16845t0 = null;
        this.f16846u0 = false;
        this.f16847v0 = false;
    }

    public final boolean q() {
        if (this.f16841o0 != null && this.f16832f0) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        boolean r7;
        if (!this.f16846u0) {
            L l8 = this.f16840n0;
            if (l8 == null) {
                return false;
            }
            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.q0;
            l8.getClass();
            if (abstractComponentCallbacksC2061v == null) {
                r7 = false;
            } else {
                r7 = abstractComponentCallbacksC2061v.r();
            }
            if (!r7) {
                return false;
            }
        }
        return true;
    }

    public final boolean s() {
        if (this.f16839m0 > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [z0.H, java.lang.Object] */
    public final void startActivityForResult(Intent intent, int i7) {
        if (this.f16841o0 != null) {
            L n7 = n();
            if (n7.f16644B != null) {
                String str = this.f16830e;
                ?? obj = new Object();
                obj.f16638a = str;
                obj.f16639b = i7;
                n7.f16647E.addLast(obj);
                R1.j jVar = n7.f16644B;
                e.l lVar = (e.l) jVar.f4682b;
                LinkedHashMap linkedHashMap = lVar.f10539b;
                String str2 = (String) jVar.f4683c;
                Object obj2 = linkedHashMap.get(str2);
                AbstractC0412a abstractC0412a = (AbstractC0412a) jVar.f4684d;
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    ArrayList arrayList = lVar.f10541d;
                    arrayList.add(str2);
                    try {
                        lVar.b(intValue, abstractC0412a, intent);
                        return;
                    } catch (Exception e7) {
                        arrayList.remove(str2);
                        throw e7;
                    }
                }
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0412a + " and input " + intent + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }
            C2063x c2063x = n7.f16677v;
            c2063x.getClass();
            kotlin.jvm.internal.j.e(intent, "intent");
            if (i7 == -1) {
                X.d.startActivity(c2063x.f16857e, intent, null);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void t() {
        this.f16850y0 = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) RecognitionOptions.ITF);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f16830e);
        if (this.f16843r0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f16843r0));
        }
        if (this.f16845t0 != null) {
            sb.append(" tag=");
            sb.append(this.f16845t0);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(int i7, int i8, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i7 + " resultCode: " + i8 + " data: " + intent);
        }
    }

    public void v(AbstractActivityC2064y abstractActivityC2064y) {
        AbstractActivityC2064y abstractActivityC2064y2;
        this.f16850y0 = true;
        C2063x c2063x = this.f16841o0;
        if (c2063x == null) {
            abstractActivityC2064y2 = null;
        } else {
            abstractActivityC2064y2 = c2063x.f16856d;
        }
        if (abstractActivityC2064y2 != null) {
            this.f16850y0 = true;
        }
    }

    public void w(Bundle bundle) {
        Bundle bundle2;
        this.f16850y0 = true;
        Bundle bundle3 = this.f16827b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f16842p0.U(bundle2);
            L l8 = this.f16842p0;
            l8.f16649G = false;
            l8.f16650H = false;
            l8.f16656N.f16694g = false;
            l8.u(1);
        }
        L l9 = this.f16842p0;
        if (l9.f16676u < 1) {
            l9.f16649G = false;
            l9.f16650H = false;
            l9.f16656N.f16694g = false;
            l9.u(1);
        }
    }

    public void x() {
        this.f16850y0 = true;
    }

    public void y() {
        this.f16850y0 = true;
    }

    public void z() {
        this.f16850y0 = true;
    }
}
