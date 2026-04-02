package j$.util;

import java.util.function.IntConsumer;
/* renamed from: j$.util.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1360z implements IntConsumer {
    private long count;
    private long sum;
    private int min = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    private int max = Integer.MIN_VALUE;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        this.count++;
        this.sum += i7;
        this.min = Math.min(this.min, i7);
        this.max = Math.max(this.max, i7);
    }

    public final void b(C1360z c1360z) {
        this.count += c1360z.count;
        this.sum += c1360z.sum;
        this.min = Math.min(this.min, c1360z.min);
        this.max = Math.max(this.max, c1360z.max);
    }

    public final String toString() {
        String simpleName = C1360z.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Integer valueOf3 = Integer.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(j > 0 ? this.sum / j : 0.0d), Integer.valueOf(this.max));
    }
}
