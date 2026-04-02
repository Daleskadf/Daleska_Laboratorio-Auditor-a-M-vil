package j$.util;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
/* loaded from: classes2.dex */
class s0 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    private final java.util.Collection f13010a;

    /* renamed from: b  reason: collision with root package name */
    private Iterator f13011b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13012c;

    /* renamed from: d  reason: collision with root package name */
    private long f13013d;

    /* renamed from: e  reason: collision with root package name */
    private int f13014e;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1210d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC1210d.e(this, i7);
    }

    public s0(java.util.Collection collection, int i7) {
        this.f13010a = collection;
        this.f13011b = null;
        this.f13012c = (i7 & RecognitionOptions.AZTEC) == 0 ? i7 | 16448 : i7;
    }

    public s0(Iterator it) {
        this.f13010a = null;
        this.f13011b = it;
        this.f13013d = Long.MAX_VALUE;
        this.f13012c = 272;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long j;
        Iterator it = this.f13011b;
        if (it == null) {
            java.util.Collection collection = this.f13010a;
            Iterator it2 = collection.iterator();
            this.f13011b = it2;
            j = collection.size();
            this.f13013d = j;
            it = it2;
        } else {
            j = this.f13013d;
        }
        if (j <= 1 || !it.hasNext()) {
            return null;
        }
        int i7 = this.f13014e + RecognitionOptions.UPC_E;
        if (i7 > j) {
            i7 = (int) j;
        }
        if (i7 > 33554432) {
            i7 = 33554432;
        }
        Object[] objArr = new Object[i7];
        int i8 = 0;
        do {
            objArr[i8] = it.next();
            i8++;
            if (i8 >= i7) {
                break;
            }
        } while (it.hasNext());
        this.f13014e = i8;
        long j8 = this.f13013d;
        if (j8 != Long.MAX_VALUE) {
            this.f13013d = j8 - i8;
        }
        return new l0(objArr, 0, i8, this.f13012c);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f13011b;
        if (it == null) {
            java.util.Collection collection = this.f13010a;
            Iterator it2 = collection.iterator();
            this.f13011b = it2;
            this.f13013d = collection.size();
            it = it2;
        }
        AbstractC1210d.q(it, consumer);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f13011b == null) {
            java.util.Collection collection = this.f13010a;
            this.f13011b = collection.iterator();
            this.f13013d = collection.size();
        }
        if (this.f13011b.hasNext()) {
            consumer.accept(this.f13011b.next());
            return true;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f13011b == null) {
            java.util.Collection collection = this.f13010a;
            this.f13011b = collection.iterator();
            long size = collection.size();
            this.f13013d = size;
            return size;
        }
        return this.f13013d;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f13012c;
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        if (AbstractC1210d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
