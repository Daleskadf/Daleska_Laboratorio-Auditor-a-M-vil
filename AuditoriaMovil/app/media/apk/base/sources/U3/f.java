package U3;

import com.google.android.gms.common.api.internal.InterfaceC0729c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class f implements InterfaceC0729c {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f5744a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.InterfaceC0729c
    public final void a(boolean z7) {
        synchronized (h.f5747k) {
            try {
                Iterator it = new ArrayList(h.f5748l.values()).iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar.f5753e.get()) {
                        hVar.j(z7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
