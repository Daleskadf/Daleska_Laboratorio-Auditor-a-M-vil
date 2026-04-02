package y;

import D.D;
import android.hardware.camera2.params.DynamicRangeProfiles;
import g1.C1006c;
import java.util.Collections;
import java.util.Set;
/* renamed from: y.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2024d implements InterfaceC2022b {

    /* renamed from: a  reason: collision with root package name */
    public static final C1006c f16574a = new C1006c(new Object());

    /* renamed from: b  reason: collision with root package name */
    public static final Set f16575b = Collections.singleton(D.f607d);

    @Override // y.InterfaceC2022b
    public final DynamicRangeProfiles a() {
        return null;
    }

    @Override // y.InterfaceC2022b
    public final Set b(D d7) {
        boolean equals = D.f607d.equals(d7);
        g0.c.a("DynamicRange is not supported: " + d7, equals);
        return f16575b;
    }

    @Override // y.InterfaceC2022b
    public final Set c() {
        return f16575b;
    }
}
