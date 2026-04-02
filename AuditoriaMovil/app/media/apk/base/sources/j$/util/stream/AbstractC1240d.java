package j$.util.stream;
/* renamed from: j$.util.stream.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1240d {

    /* renamed from: a  reason: collision with root package name */
    protected final int f13233a;

    /* renamed from: b  reason: collision with root package name */
    protected int f13234b;

    /* renamed from: c  reason: collision with root package name */
    protected int f13235c;

    /* renamed from: d  reason: collision with root package name */
    protected long[] f13236d;

    public abstract void clear();

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1240d() {
        this.f13233a = 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1240d(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i7);
        }
        this.f13233a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i7 - 1));
    }

    public final long count() {
        int i7 = this.f13235c;
        if (i7 == 0) {
            return this.f13234b;
        }
        return this.f13236d[i7] + this.f13234b;
    }
}
