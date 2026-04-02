package j$.util.stream;

import java.util.function.Predicate;
/* renamed from: j$.util.stream.p0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1301p0 extends AbstractC1320t0 {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ EnumC1325u0 f13327c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Predicate f13328d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1301p0(EnumC1325u0 enumC1325u0, Predicate predicate) {
        super(enumC1325u0);
        this.f13327c = enumC1325u0;
        this.f13328d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z7;
        boolean z8;
        if (this.f13350a) {
            return;
        }
        boolean test = this.f13328d.test(obj);
        EnumC1325u0 enumC1325u0 = this.f13327c;
        z7 = enumC1325u0.f13358a;
        if (test == z7) {
            this.f13350a = true;
            z8 = enumC1325u0.f13359b;
            this.f13351b = z8;
        }
    }
}
