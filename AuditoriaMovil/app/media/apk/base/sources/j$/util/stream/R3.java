package j$.util.stream;

import java.util.function.IntPredicate;
/* loaded from: classes2.dex */
final class R3 extends AbstractC1268i2 implements c4 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ S3 f13146b;

    @Override // j$.util.stream.c4
    public final long f() {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R3(S3 s32, InterfaceC1298o2 interfaceC1298o2, boolean z7) {
        super(interfaceC1298o2);
        this.f13146b = s32;
    }

    @Override // j$.util.stream.InterfaceC1288m2, j$.util.stream.InterfaceC1298o2
    public final void accept(int i7) {
        this.f13146b.getClass();
        IntPredicate intPredicate = null;
        intPredicate.test(i7);
        throw null;
    }
}
