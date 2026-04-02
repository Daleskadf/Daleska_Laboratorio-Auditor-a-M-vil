package Z5;

import L5.f;
import L5.r;
import M0.x;
import android.content.Context;
import kotlin.jvm.internal.j;
/* loaded from: classes.dex */
public final class a implements H5.b {

    /* renamed from: a  reason: collision with root package name */
    public r f6742a;

    @Override // H5.b
    public final void onAttachedToEngine(H5.a binding) {
        j.e(binding, "binding");
        f fVar = binding.f2030b;
        j.d(fVar, "binding.binaryMessenger");
        Context context = binding.f2029a;
        j.d(context, "binding.applicationContext");
        this.f6742a = new r(fVar, "PonnamKarthik/fluttertoast");
        x xVar = new x((char) 0, 21);
        xVar.f3210b = context;
        r rVar = this.f6742a;
        if (rVar != null) {
            rVar.b(xVar);
        }
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a p02) {
        j.e(p02, "p0");
        r rVar = this.f6742a;
        if (rVar != null) {
            rVar.b(null);
        }
        this.f6742a = null;
    }
}
