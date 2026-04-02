package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
/* renamed from: j$.util.stream.e3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1249e3 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    final boolean f13250a;

    /* renamed from: b  reason: collision with root package name */
    final AbstractC1230b f13251b;

    /* renamed from: c  reason: collision with root package name */
    private Supplier f13252c;

    /* renamed from: d  reason: collision with root package name */
    Spliterator f13253d;

    /* renamed from: e  reason: collision with root package name */
    InterfaceC1298o2 f13254e;
    BooleanSupplier f;

    /* renamed from: g  reason: collision with root package name */
    long f13255g;

    /* renamed from: h  reason: collision with root package name */
    AbstractC1240d f13256h;

    /* renamed from: i  reason: collision with root package name */
    boolean f13257i;

    abstract void d();

    abstract AbstractC1249e3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC1210d.e(this, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1249e3(AbstractC1230b abstractC1230b, Supplier supplier, boolean z7) {
        this.f13251b = abstractC1230b;
        this.f13252c = supplier;
        this.f13253d = null;
        this.f13250a = z7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1249e3(AbstractC1230b abstractC1230b, Spliterator spliterator, boolean z7) {
        this.f13251b = abstractC1230b;
        this.f13252c = null;
        this.f13253d = spliterator;
        this.f13250a = z7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.f13253d == null) {
            this.f13253d = (Spliterator) this.f13252c.get();
            this.f13252c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        AbstractC1240d abstractC1240d = this.f13256h;
        if (abstractC1240d == null) {
            if (this.f13257i) {
                return false;
            }
            c();
            d();
            this.f13255g = 0L;
            this.f13254e.l(this.f13253d.getExactSizeIfKnown());
            return b();
        }
        long j = this.f13255g + 1;
        this.f13255g = j;
        boolean z7 = j < abstractC1240d.count();
        if (z7) {
            return z7;
        }
        this.f13255g = 0L;
        this.f13256h.clear();
        return b();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (this.f13250a && this.f13256h == null && !this.f13257i) {
            c();
            Spliterator trySplit = this.f13253d.trySplit();
            if (trySplit == null) {
                return null;
            }
            return e(trySplit);
        }
        return null;
    }

    private boolean b() {
        while (this.f13256h.count() == 0) {
            if (this.f13254e.n() || !this.f.getAsBoolean()) {
                if (this.f13257i) {
                    return false;
                }
                this.f13254e.k();
                this.f13257i = true;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f13253d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC1239c3.SIZED.t(this.f13251b.K())) {
            return this.f13253d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int D4 = EnumC1239c3.D(this.f13251b.K()) & EnumC1239c3.f;
        return (D4 & 64) != 0 ? (D4 & (-16449)) | (this.f13253d.characteristics() & 16448) : D4;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC1210d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f13253d);
    }
}
