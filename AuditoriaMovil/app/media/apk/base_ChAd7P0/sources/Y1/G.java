package Y1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h0.C1042b;
import i0.C1095d;
/* loaded from: classes.dex */
public final class G extends C1042b {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f6609d;

    public G(RecyclerView recyclerView) {
        this.f6609d = recyclerView;
        new F(this);
    }

    @Override // h0.C1042b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !this.f6609d.l()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().A(accessibilityEvent);
            }
        }
    }

    @Override // h0.C1042b
    public final void b(View view, C1095d c1095d) {
        View.AccessibilityDelegate accessibilityDelegate = this.f11178a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1095d.f11380a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f6609d;
        if (!recyclerView.l() && recyclerView.getLayoutManager() != null) {
            s layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f6686b;
            y yVar = recyclerView2.f8035a;
            if (recyclerView2.canScrollVertically(-1) || layoutManager.f6686b.canScrollHorizontally(-1)) {
                accessibilityNodeInfo.addAction(8192);
                accessibilityNodeInfo.setScrollable(true);
            }
            if (layoutManager.f6686b.canScrollVertically(1) || layoutManager.f6686b.canScrollHorizontally(1)) {
                accessibilityNodeInfo.addAction(RecognitionOptions.AZTEC);
                accessibilityNodeInfo.setScrollable(true);
            }
            C c8 = recyclerView2.f8027S0;
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(yVar, c8), layoutManager.q(yVar, c8), false, 0));
        }
    }

    @Override // h0.C1042b
    public final boolean c(View view, int i7, Bundle bundle) {
        int i8;
        int s7;
        if (super.c(view, i7, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f6609d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        s layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f6686b;
        y yVar = recyclerView2.f8035a;
        if (i7 != 4096) {
            if (i7 != 8192) {
                s7 = 0;
                i8 = 0;
            } else {
                if (recyclerView2.canScrollVertically(-1)) {
                    i8 = -((layoutManager.f6690g - layoutManager.u()) - layoutManager.r());
                } else {
                    i8 = 0;
                }
                if (layoutManager.f6686b.canScrollHorizontally(-1)) {
                    s7 = -((layoutManager.f - layoutManager.s()) - layoutManager.t());
                }
                s7 = 0;
            }
        } else {
            if (recyclerView2.canScrollVertically(1)) {
                i8 = (layoutManager.f6690g - layoutManager.u()) - layoutManager.r();
            } else {
                i8 = 0;
            }
            if (layoutManager.f6686b.canScrollHorizontally(1)) {
                s7 = (layoutManager.f - layoutManager.s()) - layoutManager.t();
            }
            s7 = 0;
        }
        if (i8 == 0 && s7 == 0) {
            return false;
        }
        layoutManager.f6686b.r(s7, i8);
        return true;
    }
}
