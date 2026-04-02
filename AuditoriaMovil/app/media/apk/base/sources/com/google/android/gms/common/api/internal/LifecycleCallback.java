package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import z0.AbstractActivityC2064y;
import z0.C2041a;
/* loaded from: classes.dex */
public class LifecycleCallback {
    protected final InterfaceC0739m mLifecycleFragment;

    public LifecycleCallback(InterfaceC0739m interfaceC0739m) {
        this.mLifecycleFragment = interfaceC0739m;
    }

    @Keep
    private static InterfaceC0739m getChimeraLifecycleFragmentImpl(C0738l c0738l) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static InterfaceC0739m getFragment(Activity activity) {
        return getFragment(new C0738l(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity f = this.mLifecycleFragment.f();
        com.google.android.gms.common.internal.I.i(f);
        return f;
    }

    public void onActivityResult(int i7, int i8, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static InterfaceC0739m getFragment(C0738l c0738l) {
        f0 f0Var;
        g0 g0Var;
        Activity activity = c0738l.f9266a;
        if (activity instanceof AbstractActivityC2064y) {
            AbstractActivityC2064y abstractActivityC2064y = (AbstractActivityC2064y) activity;
            WeakHashMap weakHashMap = g0.f9244Q0;
            WeakReference weakReference = (WeakReference) weakHashMap.get(abstractActivityC2064y);
            if (weakReference == null || (g0Var = (g0) weakReference.get()) == null) {
                try {
                    g0Var = (g0) abstractActivityC2064y.j().D("SupportLifecycleFragmentImpl");
                    if (g0Var == null || g0Var.f16833g0) {
                        g0Var = new g0();
                        z0.L j = abstractActivityC2064y.j();
                        j.getClass();
                        C2041a c2041a = new C2041a(j);
                        c2041a.e(0, g0Var, "SupportLifecycleFragmentImpl");
                        c2041a.d(true);
                    }
                    weakHashMap.put(abstractActivityC2064y, new WeakReference(g0Var));
                } catch (ClassCastException e7) {
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e7);
                }
            }
            return g0Var;
        } else if (activity instanceof Activity) {
            WeakHashMap weakHashMap2 = f0.f9240d;
            WeakReference weakReference2 = (WeakReference) weakHashMap2.get(activity);
            if (weakReference2 == null || (f0Var = (f0) weakReference2.get()) == null) {
                try {
                    f0Var = (f0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (f0Var == null || f0Var.isRemoving()) {
                        f0Var = new f0();
                        activity.getFragmentManager().beginTransaction().add(f0Var, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap2.put(activity, new WeakReference(f0Var));
                } catch (ClassCastException e8) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e8);
                }
            }
            return f0Var;
        } else {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
    }

    public static InterfaceC0739m getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
