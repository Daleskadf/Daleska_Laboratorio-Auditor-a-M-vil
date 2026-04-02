package p;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
/* loaded from: classes.dex */
public final class O0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14705a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14706b;

    public O0(U0 u02) {
        this.f14706b = u02;
        u02.f14721a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o.j jVar;
        switch (this.f14705a) {
            case 0:
                Q0 q0 = ((Toolbar) this.f14706b).f7450I0;
                if (q0 == null) {
                    jVar = null;
                } else {
                    jVar = q0.f14712b;
                }
                if (jVar != null) {
                    jVar.collapseActionView();
                    return;
                }
                return;
            default:
                U0 u02 = (U0) this.f14706b;
                if (u02.f14729k != null) {
                    u02.getClass();
                    return;
                }
                return;
        }
    }

    public O0(Toolbar toolbar) {
        this.f14706b = toolbar;
    }
}
