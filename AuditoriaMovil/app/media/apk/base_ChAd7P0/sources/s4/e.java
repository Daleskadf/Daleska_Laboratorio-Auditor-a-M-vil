package S4;

import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public final class e extends B0.b {

    /* renamed from: b  reason: collision with root package name */
    public d f5273b;

    public final void x() {
        d dVar = this.f5273b;
        b bVar = dVar.f5269b;
        synchronized (bVar.f5265d) {
            bVar.f5264c.clear();
            Y4.b bVar2 = bVar.f5265d;
            bVar2.f6706d = null;
            LinkedHashSet linkedHashSet = bVar2.f6705c;
            if (linkedHashSet != null) {
                linkedHashSet.clear();
            }
        }
        dVar.f5270c.evictAll();
    }
}
