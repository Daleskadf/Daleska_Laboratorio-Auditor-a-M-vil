package p;

import android.os.Handler;
import android.widget.AbsListView;
/* renamed from: p.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1580e0 implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC1584g0 f14788a;

    public C1580e0(AbstractC1584g0 abstractC1584g0) {
        this.f14788a = abstractC1584g0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
        if (i7 == 1) {
            AbstractC1584g0 abstractC1584g0 = this.f14788a;
            if (abstractC1584g0.q0.getInputMethodMode() != 2 && abstractC1584g0.q0.getContentView() != null) {
                Handler handler = abstractC1584g0.f14812m0;
                RunnableC1578d0 runnableC1578d0 = abstractC1584g0.f14808i0;
                handler.removeCallbacks(runnableC1578d0);
                runnableC1578d0.run();
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i7, int i8, int i9) {
    }
}
