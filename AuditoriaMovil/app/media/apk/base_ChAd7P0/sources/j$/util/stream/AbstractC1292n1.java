package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
/* renamed from: j$.util.stream.n1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1292n1 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    J0 f13313a;

    /* renamed from: b  reason: collision with root package name */
    int f13314b;

    /* renamed from: c  reason: collision with root package name */
    Spliterator f13315c;

    /* renamed from: d  reason: collision with root package name */
    Spliterator f13316d;

    /* renamed from: e  reason: collision with root package name */
    ArrayDeque f13317e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1210d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC1210d.e(this, i7);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1292n1(J0 j02) {
        this.f13313a = j02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int q2 = this.f13313a.q();
        while (true) {
            q2--;
            if (q2 < this.f13314b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f13313a.b(q2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static J0 a(ArrayDeque arrayDeque) {
        while (true) {
            J0 j02 = (J0) arrayDeque.pollFirst();
            if (j02 == null) {
                return null;
            }
            if (j02.q() == 0) {
                if (j02.count() > 0) {
                    return j02;
                }
            } else {
                for (int q2 = j02.q() - 1; q2 >= 0; q2--) {
                    arrayDeque.addFirst(j02.b(q2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c() {
        if (this.f13313a == null) {
            return false;
        }
        if (this.f13316d == null) {
            Spliterator spliterator = this.f13315c;
            if (spliterator == null) {
                ArrayDeque b5 = b();
                this.f13317e = b5;
                J0 a7 = a(b5);
                if (a7 != null) {
                    this.f13316d = a7.spliterator();
                    return true;
                }
                this.f13313a = null;
                return false;
            }
            this.f13316d = spliterator;
            return true;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        J0 j02 = this.f13313a;
        if (j02 == null || this.f13316d != null) {
            return null;
        }
        Spliterator spliterator = this.f13315c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f13314b < j02.q() - 1) {
            J0 j03 = this.f13313a;
            int i7 = this.f13314b;
            this.f13314b = i7 + 1;
            return j03.b(i7).spliterator();
        }
        J0 b5 = this.f13313a.b(this.f13314b);
        this.f13313a = b5;
        if (b5.q() == 0) {
            Spliterator spliterator2 = this.f13313a.spliterator();
            this.f13315c = spliterator2;
            return spliterator2.trySplit();
        }
        J0 j04 = this.f13313a;
        this.f13314b = 1;
        return j04.b(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j = 0;
        if (this.f13313a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f13315c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i7 = this.f13314b; i7 < this.f13313a.q(); i7++) {
            j += this.f13313a.b(i7).count();
        }
        return j;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        return (j$.util.f0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Z trySplit() {
        return (j$.util.Z) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        return (j$.util.c0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.W trySplit() {
        return (j$.util.W) trySplit();
    }
}
