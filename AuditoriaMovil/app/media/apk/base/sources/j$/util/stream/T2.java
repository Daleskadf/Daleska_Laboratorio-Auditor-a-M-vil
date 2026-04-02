package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class T2 extends X2 implements IntConsumer {
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.X2
    public final void s(Object obj, int i7, int i8, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i7 < i8) {
            intConsumer.accept(iArr[i7]);
            i7++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.X2
    public final int t(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            e((IntConsumer) consumer);
        } else if (L3.f13096a) {
            L3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        } else {
            AbstractC1210d.b((S2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.X2
    protected final Object[] w() {
        return new int[8];
    }

    @Override // j$.util.stream.X2
    public final Object c(int i7) {
        return new int[i7];
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i7) {
        x();
        int i8 = this.f13234b;
        this.f13234b = i8 + 1;
        ((int[]) this.f13180e)[i8] = i7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.X2, java.lang.Iterable
    /* renamed from: y */
    public j$.util.Z spliterator() {
        return new S2(this, 0, this.f13235c, 0, this.f13234b);
    }

    public final String toString() {
        int[] iArr = (int[]) d();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f13235c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f13235c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }
}
