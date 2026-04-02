package J1;
/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final long f2364a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2365b;

    public g(long j, byte[] bArr) {
        this.f2364a = j;
        this.f2365b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f2364a, ((g) obj).f2364a);
    }
}
