package Y2;

import B5.M;
import O2.g;
import W2.d;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0751z;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
/* loaded from: classes.dex */
public final class b extends l implements y {

    /* renamed from: a  reason: collision with root package name */
    public static final i f6701a = new i("ClientTelemetry.API", new g(5), new Object());

    public final Task c(x xVar) {
        M a7 = AbstractC0751z.a();
        a7.f331d = new d[]{zaf.zaa};
        a7.f328a = false;
        a7.f330c = new C5.i(xVar, 25);
        return doBestEffortWrite(a7.a());
    }
}
