package A3;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class O extends E {
    @Override // A3.E
    public final E b(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final P g() {
        int i7 = this.f87b;
        if (i7 != 0) {
            if (i7 != 1) {
                P o7 = P.o(i7, this.f86a);
                this.f87b = o7.size();
                this.f88c = true;
                return o7;
            }
            Object obj = this.f86a[0];
            Objects.requireNonNull(obj);
            int i8 = P.f107c;
            return new r0(obj);
        }
        int i9 = P.f107c;
        return k0.f165e0;
    }
}
