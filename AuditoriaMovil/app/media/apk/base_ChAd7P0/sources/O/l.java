package o;

import android.widget.PopupWindow;
/* loaded from: classes.dex */
public final class l implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f14486a;

    public l(n nVar) {
        this.f14486a = nVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f14486a.c();
    }
}
