package Y1;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h0.C1042b;
import i0.C1095d;
/* loaded from: classes.dex */
public final class F extends C1042b {

    /* renamed from: d  reason: collision with root package name */
    public final G f6608d;

    public F(G g3) {
        this.f6608d = g3;
    }

    @Override // h0.C1042b
    public final void b(View view, C1095d c1095d) {
        this.f11178a.onInitializeAccessibilityNodeInfo(view, c1095d.f11380a);
        G g3 = this.f6608d;
        if (!g3.f6609d.l()) {
            RecyclerView recyclerView = g3.f6609d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().getClass();
                RecyclerView.j(view);
            }
        }
    }

    @Override // h0.C1042b
    public final boolean c(View view, int i7, Bundle bundle) {
        if (super.c(view, i7, bundle)) {
            return true;
        }
        G g3 = this.f6608d;
        if (!g3.f6609d.l()) {
            RecyclerView recyclerView = g3.f6609d;
            if (recyclerView.getLayoutManager() != null) {
                y yVar = recyclerView.getLayoutManager().f6686b.f8035a;
            }
        }
        return false;
    }
}
