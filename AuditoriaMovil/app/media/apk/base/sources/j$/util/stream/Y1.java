package j$.util.stream;
/* loaded from: classes2.dex */
final class Y1 extends Z1 {
    @Override // j$.util.stream.U1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f13187b);
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t1) {
        this.f13187b += ((Z1) t1).f13187b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f13187b++;
    }
}
