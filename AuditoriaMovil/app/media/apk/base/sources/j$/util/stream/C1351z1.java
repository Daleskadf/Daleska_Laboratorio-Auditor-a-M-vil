package j$.util.stream;

import java.util.function.LongBinaryOperator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.z1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1351z1 extends AbstractC1340x0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f13404h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ long f13405i;

    @Override // j$.util.stream.AbstractC1340x0
    public final T1 e0() {
        return new R1(this.f13405i, this.f13404h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1351z1(EnumC1244d3 enumC1244d3, LongBinaryOperator longBinaryOperator, long j) {
        this.f13404h = longBinaryOperator;
        this.f13405i = j;
    }
}
