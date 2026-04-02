package j$.util.stream;

import java.util.function.Supplier;
/* renamed from: j$.util.stream.n0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1291n0 implements Supplier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13311a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EnumC1325u0 f13312b;

    public /* synthetic */ C1291n0(EnumC1325u0 enumC1325u0, int i7) {
        this.f13311a = i7;
        this.f13312b = enumC1325u0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f13311a) {
            case 0:
                return new AbstractC1320t0(this.f13312b);
            case 1:
                return new AbstractC1320t0(this.f13312b);
            default:
                return new AbstractC1320t0(this.f13312b);
        }
    }
}
