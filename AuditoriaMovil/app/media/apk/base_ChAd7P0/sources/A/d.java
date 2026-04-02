package A;

import Q0.C0274k;
import androidx.camera.core.impl.J;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7c;

    public C0274k a() {
        if (!this.f5a && (this.f6b || this.f7c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new C0274k(this);
    }

    public void b(ArrayList arrayList) {
        if ((this.f5a || this.f6b || this.f7c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((J) it.next()).a();
            }
            org.slf4j.helpers.i.l("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
