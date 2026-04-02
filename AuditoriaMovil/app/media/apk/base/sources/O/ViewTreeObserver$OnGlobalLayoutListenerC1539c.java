package o;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p.C1596m0;
/* renamed from: o.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnGlobalLayoutListenerC1539c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14405a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f14406b;

    public /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC1539c(k kVar, int i7) {
        this.f14405a = i7;
        this.f14406b = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f14405a) {
            case 0:
                View$OnKeyListenerC1542f view$OnKeyListenerC1542f = (View$OnKeyListenerC1542f) this.f14406b;
                if (view$OnKeyListenerC1542f.i()) {
                    ArrayList arrayList = view$OnKeyListenerC1542f.f14413Y;
                    if (arrayList.size() > 0 && !((C1541e) arrayList.get(0)).f14409a.f14815p0) {
                        View view = view$OnKeyListenerC1542f.f14424j0;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C1541e) it.next()).f14409a.b();
                            }
                            return;
                        }
                        view$OnKeyListenerC1542f.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                s sVar = (s) this.f14406b;
                if (sVar.i()) {
                    C1596m0 c1596m0 = sVar.f14497Y;
                    if (!c1596m0.f14815p0) {
                        View view2 = sVar.f14506h0;
                        if (view2 != null && view2.isShown()) {
                            c1596m0.b();
                            return;
                        } else {
                            sVar.dismiss();
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
