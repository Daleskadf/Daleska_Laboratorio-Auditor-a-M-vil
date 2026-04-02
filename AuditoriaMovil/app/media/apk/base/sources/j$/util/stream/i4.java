package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;
/* loaded from: classes2.dex */
final class i4 extends j4 implements Consumer {

    /* renamed from: e  reason: collision with root package name */
    final Predicate f13284e;
    Object f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f13285g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(Spliterator spliterator, Predicate predicate, int i7) {
        super(spliterator);
        this.f13285g = i7;
        this.f13284e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(Spliterator spliterator, i4 i4Var, int i7) {
        super(spliterator, i4Var);
        this.f13285g = i7;
        this.f13284e = i4Var.f13284e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f13292d = (this.f13292d + 1) & 63;
        this.f = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
        if (r0 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
        r6.f13290b.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
        r7.accept(r6.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return r2;
     */
    @Override // j$.util.Spliterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean tryAdvance(java.util.function.Consumer r7) {
        /*
            r6 = this;
            int r0 = r6.f13285g
            switch(r0) {
                case 0: goto L35;
                default: goto L5;
            }
        L5:
            boolean r0 = r6.f13291c
            r1 = 1
            if (r0 == 0) goto L28
            boolean r0 = r6.b()
            if (r0 == 0) goto L28
            j$.util.Spliterator r0 = r6.f13289a
            boolean r0 = r0.tryAdvance(r6)
            if (r0 == 0) goto L28
            java.util.function.Predicate r0 = r6.f13284e
            java.lang.Object r2 = r6.f
            boolean r0 = r0.test(r2)
            if (r0 == 0) goto L29
            java.lang.Object r0 = r6.f
            r7.accept(r0)
            goto L34
        L28:
            r0 = r1
        L29:
            r7 = 0
            r6.f13291c = r7
            if (r0 != 0) goto L33
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f13290b
            r0.set(r1)
        L33:
            r1 = r7
        L34:
            return r1
        L35:
            boolean r0 = r6.f13291c
            j$.util.Spliterator r1 = r6.f13289a
            if (r0 == 0) goto L66
            r0 = 0
            r6.f13291c = r0
        L3e:
            boolean r2 = r1.tryAdvance(r6)
            r3 = 1
            if (r2 == 0) goto L57
            boolean r4 = r6.b()
            if (r4 == 0) goto L57
            java.util.function.Predicate r4 = r6.f13284e
            java.lang.Object r5 = r6.f
            boolean r4 = r4.test(r5)
            if (r4 == 0) goto L57
            r0 = r3
            goto L3e
        L57:
            if (r2 == 0) goto L6a
            if (r0 == 0) goto L60
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f13290b
            r0.set(r3)
        L60:
            java.lang.Object r0 = r6.f
            r7.accept(r0)
            goto L6a
        L66:
            boolean r2 = r1.tryAdvance(r7)
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.i4.tryAdvance(java.util.function.Consumer):boolean");
    }

    @Override // j$.util.stream.j4, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.f13285g) {
            case 1:
                if (this.f13290b.get()) {
                    return null;
                }
                return super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.j4
    final Spliterator c(Spliterator spliterator) {
        switch (this.f13285g) {
            case 0:
                return new i4(spliterator, this, 0);
            default:
                return new i4(spliterator, this, 1);
        }
    }
}
