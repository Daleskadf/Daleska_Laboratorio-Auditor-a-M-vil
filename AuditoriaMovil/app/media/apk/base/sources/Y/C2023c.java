package y;

import D.D;
import android.hardware.camera2.params.DynamicRangeProfiles;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* renamed from: y.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2023c implements InterfaceC2022b {

    /* renamed from: a  reason: collision with root package name */
    public final DynamicRangeProfiles f16573a;

    public C2023c(Object obj) {
        this.f16573a = (DynamicRangeProfiles) obj;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l8 = (Long) it.next();
            long longValue = l8.longValue();
            D d7 = (D) AbstractC2021a.f16571a.get(l8);
            g0.c.f(d7, "Dynamic range profile cannot be converted to a DynamicRange object: " + longValue);
            hashSet.add(d7);
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // y.InterfaceC2022b
    public final DynamicRangeProfiles a() {
        return this.f16573a;
    }

    @Override // y.InterfaceC2022b
    public final Set b(D d7) {
        boolean z7;
        Long a7 = AbstractC2021a.a(d7, this.f16573a);
        if (a7 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.a("DynamicRange is not supported: " + d7, z7);
        return d(this.f16573a.getProfileCaptureRequestConstraints(a7.longValue()));
    }

    @Override // y.InterfaceC2022b
    public final Set c() {
        return d(this.f16573a.getSupportedProfiles());
    }
}
