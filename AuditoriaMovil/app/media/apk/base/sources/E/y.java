package e;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import w6.InterfaceC1959a;
/* loaded from: classes.dex */
public final class y implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w6.l f10582a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w6.l f10583b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1959a f10584c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1959a f10585d;

    public y(w6.l lVar, w6.l lVar2, InterfaceC1959a interfaceC1959a, InterfaceC1959a interfaceC1959a2) {
        this.f10582a = lVar;
        this.f10583b = lVar2;
        this.f10584c = interfaceC1959a;
        this.f10585d = interfaceC1959a2;
    }

    public final void onBackCancelled() {
        this.f10585d.invoke();
    }

    public final void onBackInvoked() {
        this.f10584c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        this.f10583b.invoke(new C0921b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        this.f10582a.invoke(new C0921b(backEvent));
    }
}
