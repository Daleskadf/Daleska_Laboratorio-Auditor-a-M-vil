package j$.util.stream;

import j$.util.Spliterator;
/* renamed from: j$.util.stream.x3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1343x3 {

    /* renamed from: a  reason: collision with root package name */
    final long f13388a;

    /* renamed from: b  reason: collision with root package name */
    final long f13389b;

    /* renamed from: c  reason: collision with root package name */
    Spliterator f13390c;

    /* renamed from: d  reason: collision with root package name */
    long f13391d;

    /* renamed from: e  reason: collision with root package name */
    long f13392e;

    protected abstract Spliterator a(Spliterator spliterator, long j, long j8, long j9, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1343x3(Spliterator spliterator, long j, long j8, long j9, long j10) {
        this.f13390c = spliterator;
        this.f13388a = j;
        this.f13389b = j8;
        this.f13391d = j9;
        this.f13392e = j10;
    }

    public final Spliterator trySplit() {
        long j = this.f13392e;
        if (this.f13388a >= j || this.f13391d >= j) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.f13390c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f13391d;
            long min = Math.min(estimateSize, this.f13389b);
            long j8 = this.f13388a;
            if (j8 >= min) {
                this.f13391d = min;
            } else {
                long j9 = this.f13389b;
                if (min >= j9) {
                    this.f13390c = trySplit;
                    this.f13392e = min;
                } else {
                    long j10 = this.f13391d;
                    if (j10 >= j8 && estimateSize <= j9) {
                        this.f13391d = min;
                        return trySplit;
                    }
                    this.f13391d = min;
                    return a(trySplit, j8, j9, j10, min);
                }
            }
        }
    }

    public final long estimateSize() {
        long j = this.f13392e;
        long j8 = this.f13388a;
        if (j8 < j) {
            return j - Math.max(j8, this.f13391d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.f13390c.characteristics();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.f0 m12trySplit() {
        return (j$.util.f0) trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Z m10trySplit() {
        return (j$.util.Z) trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c0 m11trySplit() {
        return (j$.util.c0) trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.W m9trySplit() {
        return (j$.util.W) trySplit();
    }
}
