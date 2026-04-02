package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class R2 extends X2 implements DoubleConsumer {
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.X2
    public final void s(Object obj, int i7, int i8, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i7 < i8) {
            doubleConsumer.accept(dArr[i7]);
            i7++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.X2
    public final int t(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e((DoubleConsumer) consumer);
        } else if (L3.f13096a) {
            L3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        } else {
            AbstractC1210d.a((Q2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.X2
    protected final Object[] w() {
        return new double[8];
    }

    @Override // j$.util.stream.X2
    public final Object c(int i7) {
        return new double[i7];
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d7) {
        x();
        int i7 = this.f13234b;
        this.f13234b = i7 + 1;
        ((double[]) this.f13180e)[i7] = d7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.X2, java.lang.Iterable
    /* renamed from: y */
    public j$.util.W spliterator() {
        return new Q2(this, 0, this.f13235c, 0, this.f13234b);
    }

    public final String toString() {
        double[] dArr = (double[]) d();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f13235c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f13235c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }
}
