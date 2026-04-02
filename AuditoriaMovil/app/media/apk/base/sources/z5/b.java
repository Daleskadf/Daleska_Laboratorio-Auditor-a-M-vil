package Z5;

import M0.x;
import android.widget.Toast$Callback;
/* loaded from: classes.dex */
public final class b extends Toast$Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f6743a;

    public b(x xVar) {
        this.f6743a = xVar;
    }

    public final void onToastHidden() {
        super.onToastHidden();
        this.f6743a.f3211c = null;
    }
}
