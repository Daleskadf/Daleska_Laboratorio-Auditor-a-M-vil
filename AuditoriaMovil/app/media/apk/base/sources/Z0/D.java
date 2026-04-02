package z0;

import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16630a = false;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f16631b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public kotlin.jvm.internal.i f16632c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ L f16633d;

    public D(L l8) {
        this.f16633d = l8;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        L l8 = this.f16633d;
        if (isLoggable) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + l8);
        }
        C2041a c2041a = l8.f16664h;
        if (c2041a != null) {
            c2041a.f16742q = false;
            c2041a.d(false);
            l8.A(true);
            l8.E();
            Iterator it = l8.f16668m.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        l8.f16664h = null;
    }
}
