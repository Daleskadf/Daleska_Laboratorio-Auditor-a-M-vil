package j$.util;

import java.util.function.DoubleConsumer;
/* renamed from: j$.util.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1359y implements DoubleConsumer {

    /* renamed from: a  reason: collision with root package name */
    private double f13417a;

    /* renamed from: b  reason: collision with root package name */
    private double f13418b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d7) {
        this.count++;
        this.f13418b += d7;
        c(d7);
        this.min = Math.min(this.min, d7);
        this.max = Math.max(this.max, d7);
    }

    public final void b(C1359y c1359y) {
        this.count += c1359y.count;
        this.f13418b += c1359y.f13418b;
        c(c1359y.sum);
        c(c1359y.f13417a);
        this.min = Math.min(this.min, c1359y.min);
        this.max = Math.max(this.max, c1359y.max);
    }

    private void c(double d7) {
        double d8 = d7 - this.f13417a;
        double d9 = this.sum;
        double d10 = d9 + d8;
        this.f13417a = (d10 - d9) - d8;
        this.sum = d10;
    }

    public final String toString() {
        double d7;
        String simpleName = C1359y.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        double d8 = this.sum + this.f13417a;
        if (Double.isNaN(d8) && Double.isInfinite(this.f13418b)) {
            d8 = this.f13418b;
        }
        Double valueOf2 = Double.valueOf(d8);
        Double valueOf3 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d9 = this.sum + this.f13417a;
            if (Double.isNaN(d9) && Double.isInfinite(this.f13418b)) {
                d9 = this.f13418b;
            }
            d7 = d9 / this.count;
        } else {
            d7 = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(d7), Double.valueOf(this.max));
    }
}
