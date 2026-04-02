package j$.util.stream;

import j$.util.Spliterator;
/* loaded from: classes2.dex */
final class F1 extends AbstractC1340x0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f13050h;

    public /* synthetic */ F1(int i7) {
        this.f13050h = i7;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, j$.util.stream.T1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, j$.util.stream.T1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, j$.util.stream.T1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, j$.util.stream.T1] */
    @Override // j$.util.stream.AbstractC1340x0
    public final T1 e0() {
        switch (this.f13050h) {
            case 0:
                return new Object();
            case 1:
                return new Object();
            case 2:
                return new Object();
            default:
                return new Object();
        }
    }

    @Override // j$.util.stream.AbstractC1340x0, j$.util.stream.I3
    public final Object b(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        switch (this.f13050h) {
            case 0:
                if (EnumC1239c3.SIZED.t(abstractC1230b.K())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.b(abstractC1230b, spliterator);
            case 1:
                if (EnumC1239c3.SIZED.t(abstractC1230b.K())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.b(abstractC1230b, spliterator);
            case 2:
                if (EnumC1239c3.SIZED.t(abstractC1230b.K())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.b(abstractC1230b, spliterator);
            default:
                if (EnumC1239c3.SIZED.t(abstractC1230b.K())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.b(abstractC1230b, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC1340x0, j$.util.stream.I3
    public final Object c(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        switch (this.f13050h) {
            case 0:
                if (EnumC1239c3.SIZED.t(abstractC1230b.K())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.c(abstractC1230b, spliterator);
            case 1:
                if (EnumC1239c3.SIZED.t(abstractC1230b.K())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.c(abstractC1230b, spliterator);
            case 2:
                if (EnumC1239c3.SIZED.t(abstractC1230b.K())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.c(abstractC1230b, spliterator);
            default:
                if (EnumC1239c3.SIZED.t(abstractC1230b.K())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.c(abstractC1230b, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC1340x0, j$.util.stream.I3
    public final int d() {
        switch (this.f13050h) {
            case 0:
                return EnumC1239c3.f13223r;
            case 1:
                return EnumC1239c3.f13223r;
            case 2:
                return EnumC1239c3.f13223r;
            default:
                return EnumC1239c3.f13223r;
        }
    }
}
