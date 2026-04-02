package B4;

import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC0739m;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class b extends LifecycleCallback {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f272a;

    public b(InterfaceC0739m interfaceC0739m) {
        super(interfaceC0739m);
        this.f272a = new ArrayList();
        this.mLifecycleFragment.b("StorageOnStopCallback", this);
    }

    public final void a(a aVar) {
        synchronized (this.f272a) {
            this.f272a.add(aVar);
        }
    }

    public final void b(a aVar) {
        synchronized (this.f272a) {
            this.f272a.remove(aVar);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        ArrayList arrayList;
        synchronized (this.f272a) {
            arrayList = new ArrayList(this.f272a);
            this.f272a.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                Log.d("StorageOnStopCallback", "removing subscription from activity.");
                aVar.f270b.run();
                c.f273c.a(aVar.f271c);
            }
        }
    }
}
