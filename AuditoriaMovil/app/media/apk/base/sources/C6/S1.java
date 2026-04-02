package c6;

import a6.AbstractC0482k;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class S1 extends AbstractC0482k {

    /* renamed from: b  reason: collision with root package name */
    public final Y1 f8581b;

    /* renamed from: c  reason: collision with root package name */
    public long f8582c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ N0 f8583d;

    public S1(N0 n02, Y1 y12) {
        this.f8583d = n02;
        this.f8581b = y12;
    }

    @Override // a6.AbstractC0482k
    public final void l(long j) {
        L1 l12;
        if (this.f8583d.f8534o.f != null) {
            return;
        }
        synchronized (this.f8583d.f8529i) {
            try {
                if (this.f8583d.f8534o.f == null) {
                    Y1 y12 = this.f8581b;
                    if (!y12.f8658b) {
                        long j8 = this.f8582c + j;
                        this.f8582c = j8;
                        N0 n02 = this.f8583d;
                        long j9 = n02.f8539t;
                        if (j8 <= j9) {
                            return;
                        }
                        if (j8 > n02.f8530k) {
                            y12.f8659c = true;
                        } else {
                            long addAndGet = ((AtomicLong) n02.j.f8171b).addAndGet(j8 - j9);
                            N0 n03 = this.f8583d;
                            n03.f8539t = this.f8582c;
                            if (addAndGet > n03.f8531l) {
                                this.f8581b.f8659c = true;
                            }
                        }
                        Y1 y13 = this.f8581b;
                        if (y13.f8659c) {
                            l12 = this.f8583d.o(y13);
                        } else {
                            l12 = null;
                        }
                        if (l12 != null) {
                            l12.run();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
