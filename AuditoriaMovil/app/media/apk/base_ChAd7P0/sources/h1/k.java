package h1;

import A3.d0;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
/* loaded from: classes.dex */
public final class k implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f11282a;

    public k(p pVar) {
        this.f11282a = pVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z7) {
        p pVar = this.f11282a;
        d0 d0Var = p.f11309i;
        pVar.e();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z7) {
        p pVar = this.f11282a;
        d0 d0Var = p.f11309i;
        pVar.e();
    }
}
