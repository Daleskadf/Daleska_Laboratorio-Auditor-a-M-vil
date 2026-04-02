package V0;

import H0.C0135o;
/* loaded from: classes.dex */
public abstract class g implements Comparable {

    /* renamed from: X  reason: collision with root package name */
    public final String f5825X;

    /* renamed from: Y  reason: collision with root package name */
    public final String f5826Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f5827Z;

    /* renamed from: a  reason: collision with root package name */
    public final String f5828a;

    /* renamed from: b  reason: collision with root package name */
    public final f f5829b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5830c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5831d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5832e;

    /* renamed from: e0  reason: collision with root package name */
    public final long f5833e0;
    public final C0135o f;

    /* renamed from: f0  reason: collision with root package name */
    public final boolean f5834f0;

    public g(String str, f fVar, long j, int i7, long j8, C0135o c0135o, String str2, String str3, long j9, long j10, boolean z7) {
        this.f5828a = str;
        this.f5829b = fVar;
        this.f5830c = j;
        this.f5831d = i7;
        this.f5832e = j8;
        this.f = c0135o;
        this.f5825X = str2;
        this.f5826Y = str3;
        this.f5827Z = j9;
        this.f5833e0 = j10;
        this.f5834f0 = z7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l8 = (Long) obj;
        long longValue = l8.longValue();
        long j = this.f5832e;
        if (j > longValue) {
            return 1;
        }
        if (j < l8.longValue()) {
            return -1;
        }
        return 0;
    }
}
