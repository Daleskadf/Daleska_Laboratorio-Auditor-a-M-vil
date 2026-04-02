package io.flutter.view;

import B5.B;
import android.view.accessibility.AccessibilityManager;
import com.google.android.libraries.barhopper.RecognitionOptions;
/* loaded from: classes.dex */
public final class d implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f12433a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f12434b;

    public d(o oVar, AccessibilityManager accessibilityManager) {
        this.f12434b = oVar;
        this.f12433a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z7) {
        o oVar = this.f12434b;
        if (oVar.f12515u) {
            return;
        }
        boolean z8 = false;
        if (!z7) {
            oVar.i(false);
            k kVar = oVar.f12509o;
            if (kVar != null) {
                oVar.g(kVar.f12468b, RecognitionOptions.QR_CODE);
                oVar.f12509o = null;
            }
        }
        A.m mVar = oVar.f12513s;
        if (mVar != null) {
            boolean isEnabled = this.f12433a.isEnabled();
            B b5 = (B) mVar.f28b;
            if (!b5.f295f0.f554b.f11612a.getIsSoftwareRenderingEnabled()) {
                if (!isEnabled && !z7) {
                    z8 = true;
                }
                b5.setWillNotDraw(z8);
                return;
            }
            b5.setWillNotDraw(false);
        }
    }
}
