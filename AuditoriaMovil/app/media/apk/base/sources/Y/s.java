package y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import w.C1894D;
/* loaded from: classes.dex */
public final class s implements t {

    /* renamed from: a  reason: collision with root package name */
    public final List f16597a;

    /* renamed from: b  reason: collision with root package name */
    public final C1894D f16598b;

    /* renamed from: c  reason: collision with root package name */
    public final G.k f16599c;

    /* renamed from: d  reason: collision with root package name */
    public C2027g f16600d = null;

    public s(ArrayList arrayList, G.k kVar, C1894D c1894d) {
        this.f16597a = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f16598b = c1894d;
        this.f16599c = kVar;
    }

    @Override // y.t
    public final Object a() {
        return null;
    }

    @Override // y.t
    public final int b() {
        return 0;
    }

    @Override // y.t
    public final CameraCaptureSession.StateCallback c() {
        return this.f16598b;
    }

    @Override // y.t
    public final List d() {
        return this.f16597a;
    }

    @Override // y.t
    public final void e(C2027g c2027g) {
        this.f16600d = c2027g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (Objects.equals(this.f16600d, sVar.f16600d)) {
                List list = this.f16597a;
                int size = list.size();
                List list2 = sVar.f16597a;
                if (size == list2.size()) {
                    for (int i7 = 0; i7 < list.size(); i7++) {
                        if (!((C2028h) list.get(i7)).equals(list2.get(i7))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // y.t
    public final C2027g f() {
        return this.f16600d;
    }

    @Override // y.t
    public final Executor g() {
        return this.f16599c;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f16597a.hashCode() ^ 31;
        int i7 = (hashCode2 << 5) - hashCode2;
        C2027g c2027g = this.f16600d;
        if (c2027g == null) {
            hashCode = 0;
        } else {
            hashCode = c2027g.f16577a.f16576a.hashCode();
        }
        int i8 = hashCode ^ i7;
        return (i8 << 5) - i8;
    }

    @Override // y.t
    public final void h(CaptureRequest captureRequest) {
    }
}
