package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.q2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1308q2 extends AbstractC1253f2 {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ long f13334m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ long f13335n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1308q2(AbstractC1258g2 abstractC1258g2, int i7, long j, long j8) {
        super(abstractC1258g2, i7, 0);
        this.f13334m = j;
        this.f13335n = j8;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.E3, j$.util.Spliterator] */
    @Override // j$.util.stream.AbstractC1230b
    final Spliterator P(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        long j;
        long j8;
        long G2 = abstractC1230b.G(spliterator);
        int i7 = (G2 > 0L ? 1 : (G2 == 0L ? 0 : -1));
        long j9 = this.f13335n;
        if (i7 > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator X7 = abstractC1230b.X(spliterator);
            long j10 = this.f13334m;
            return new C1338w3(X7, j10, AbstractC1340x0.B(j10, j9));
        }
        if (!EnumC1239c3.ORDERED.t(abstractC1230b.K())) {
            Spliterator X8 = abstractC1230b.X(spliterator);
            long j11 = this.f13334m;
            if (j11 <= G2) {
                long j12 = G2 - j11;
                if (j9 >= 0) {
                    j12 = Math.min(j9, j12);
                }
                j8 = 0;
                j = j12;
            } else {
                j = j9;
                j8 = j11;
            }
            return new E3(X8, j8, j);
        }
        return ((J0) new C1347y2(this, abstractC1230b, spliterator, new r(29), this.f13334m, this.f13335n).invoke()).spliterator();
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [j$.util.stream.E3, j$.util.Spliterator] */
    @Override // j$.util.stream.AbstractC1230b
    final J0 O(AbstractC1230b abstractC1230b, Spliterator spliterator, IntFunction intFunction) {
        long j;
        long j8;
        long G2 = abstractC1230b.G(spliterator);
        if (G2 > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC1340x0.E(abstractC1230b, AbstractC1340x0.C(abstractC1230b.J(), spliterator, this.f13334m, this.f13335n), true, intFunction);
        }
        if (!EnumC1239c3.ORDERED.t(abstractC1230b.K())) {
            Spliterator X7 = abstractC1230b.X(spliterator);
            long j9 = this.f13334m;
            int i7 = (j9 > G2 ? 1 : (j9 == G2 ? 0 : -1));
            long j10 = this.f13335n;
            if (i7 <= 0) {
                j = j10 >= 0 ? Math.min(j10, G2 - j9) : G2 - j9;
                j8 = 0;
            } else {
                j = j10;
                j8 = j9;
            }
            return AbstractC1340x0.E(this, new E3(X7, j8, j), true, intFunction);
        }
        return (J0) new C1347y2(this, abstractC1230b, spliterator, intFunction, this.f13334m, this.f13335n).invoke();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final InterfaceC1298o2 R(int i7, InterfaceC1298o2 interfaceC1298o2) {
        return new C1303p2(this, interfaceC1298o2);
    }
}
