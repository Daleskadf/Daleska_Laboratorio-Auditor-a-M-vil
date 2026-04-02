package G5;

import H4.W;
import X5.L;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.flutter.plugin.platform.j;
/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1593a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f1594b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f1595c;

    public a(View.OnFocusChangeListener onFocusChangeListener, b bVar) {
        this.f1594b = onFocusChangeListener;
        this.f1595c = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f1593a) {
            case 0:
                b bVar = (b) this.f1595c;
                this.f1594b.onFocusChange(bVar, W.L(bVar, new L(19)));
                return;
            default:
                L l8 = new L(19);
                j jVar = (j) this.f1595c;
                this.f1594b.onFocusChange(jVar, W.L(jVar, l8));
                return;
        }
    }

    public a(j jVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f1595c = jVar;
        this.f1594b = onFocusChangeListener;
    }
}
