package j$.util.stream;

import java.util.function.IntFunction;
/* loaded from: classes2.dex */
abstract class U0 extends L0 implements I0 {
    @Override // j$.util.stream.J0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC1340x0.m(this, intFunction);
    }

    @Override // j$.util.stream.I0
    public final void e(Object obj) {
        ((I0) this.f13088a).e(obj);
        ((I0) this.f13089b).e(obj);
    }

    @Override // j$.util.stream.I0
    public final void r(int i7, Object obj) {
        J0 j02 = this.f13088a;
        ((I0) j02).r(i7, obj);
        ((I0) this.f13089b).r(i7 + ((int) ((I0) j02).count()), obj);
    }

    @Override // j$.util.stream.I0
    public final Object d() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object c8 = c((int) count);
        r(0, c8);
        return c8;
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f13088a, this.f13089b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
