package B5;

import android.window.OnBackInvokedCallback;
import w6.InterfaceC1959a;
/* renamed from: B5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0030c implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f348a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f349b;

    public /* synthetic */ C0030c(Object obj, int i7) {
        this.f348a = i7;
        this.f349b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f348a) {
            case 0:
                ((AbstractActivityC0032e) this.f349b).onBackPressed();
                return;
            case 1:
                InterfaceC1959a onBackInvoked = (InterfaceC1959a) this.f349b;
                kotlin.jvm.internal.j.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                return;
            default:
                ((Runnable) this.f349b).run();
                return;
        }
    }
}
