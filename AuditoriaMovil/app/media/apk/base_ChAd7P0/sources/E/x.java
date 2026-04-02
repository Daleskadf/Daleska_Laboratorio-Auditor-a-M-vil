package e;

import B5.C0030c;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import w6.InterfaceC1959a;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f10581a = new Object();

    public final OnBackInvokedCallback a(InterfaceC1959a onBackInvoked) {
        kotlin.jvm.internal.j.e(onBackInvoked, "onBackInvoked");
        return new C0030c(onBackInvoked, 1);
    }

    public final void b(Object dispatcher, int i7, Object callback) {
        kotlin.jvm.internal.j.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.j.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i7, (OnBackInvokedCallback) callback);
    }

    public final void c(Object dispatcher, Object callback) {
        kotlin.jvm.internal.j.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.j.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
