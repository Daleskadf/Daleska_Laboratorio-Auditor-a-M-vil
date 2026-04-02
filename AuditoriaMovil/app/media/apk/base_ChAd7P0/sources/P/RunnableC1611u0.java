package p;

import androidx.appcompat.widget.SearchView;
import n0.AbstractC1459b;
/* renamed from: p.u0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1611u0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14883a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SearchView f14884b;

    public /* synthetic */ RunnableC1611u0(SearchView searchView, int i7) {
        this.f14883a = i7;
        this.f14884b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14883a) {
            case 0:
                this.f14884b.q();
                return;
            default:
                AbstractC1459b abstractC1459b = this.f14884b.f7369M0;
                if (abstractC1459b instanceof G0) {
                    abstractC1459b.b(null);
                    return;
                }
                return;
        }
    }
}
