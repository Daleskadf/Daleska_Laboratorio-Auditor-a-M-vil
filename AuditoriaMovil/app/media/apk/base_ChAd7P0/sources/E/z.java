package e;

import android.window.OnBackInvokedCallback;
import w6.InterfaceC1959a;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f10586a = new Object();

    public final OnBackInvokedCallback a(w6.l onBackStarted, w6.l onBackProgressed, InterfaceC1959a onBackInvoked, InterfaceC1959a onBackCancelled) {
        kotlin.jvm.internal.j.e(onBackStarted, "onBackStarted");
        kotlin.jvm.internal.j.e(onBackProgressed, "onBackProgressed");
        kotlin.jvm.internal.j.e(onBackInvoked, "onBackInvoked");
        kotlin.jvm.internal.j.e(onBackCancelled, "onBackCancelled");
        return new y(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
