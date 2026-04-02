package io.flutter.view;

import B5.B;
import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;
/* loaded from: classes.dex */
public final class b implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f12431a;

    public b(o oVar) {
        this.f12431a = oVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z7) {
        o oVar = this.f12431a;
        if (oVar.f12515u) {
            return;
        }
        boolean z8 = false;
        V2.k kVar = oVar.f12498b;
        if (z7) {
            a aVar = oVar.f12516v;
            kVar.f5967d = aVar;
            ((FlutterJNI) kVar.f5966c).setAccessibilityDelegate(aVar);
            ((FlutterJNI) kVar.f5966c).setSemanticsEnabled(true);
        } else {
            oVar.i(false);
            kVar.f5967d = null;
            ((FlutterJNI) kVar.f5966c).setAccessibilityDelegate(null);
            ((FlutterJNI) kVar.f5966c).setSemanticsEnabled(false);
        }
        A.m mVar = oVar.f12513s;
        if (mVar != null) {
            boolean isTouchExplorationEnabled = oVar.f12499c.isTouchExplorationEnabled();
            B b5 = (B) mVar.f28b;
            if (!b5.f295f0.f554b.f11612a.getIsSoftwareRenderingEnabled()) {
                if (!z7 && !isTouchExplorationEnabled) {
                    z8 = true;
                }
                b5.setWillNotDraw(z8);
                return;
            }
            b5.setWillNotDraw(false);
        }
    }
}
