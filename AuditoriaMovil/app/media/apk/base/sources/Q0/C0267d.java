package Q0;

import A3.t0;
import java.util.Set;
/* renamed from: Q0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267d {

    /* renamed from: d  reason: collision with root package name */
    public static final C0267d f4267d;

    /* renamed from: a  reason: collision with root package name */
    public final int f4268a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4269b;

    /* renamed from: c  reason: collision with root package name */
    public final A3.P f4270c;

    /* JADX WARN: Type inference failed for: r1v1, types: [A3.E, A3.O] */
    static {
        C0267d c0267d;
        if (K0.x.f2529a >= 33) {
            ?? e7 = new A3.E(4);
            for (int i7 = 1; i7 <= 10; i7++) {
                e7.a(Integer.valueOf(K0.x.s(i7)));
            }
            c0267d = new C0267d(2, e7.g());
        } else {
            c0267d = new C0267d(2, 10);
        }
        f4267d = c0267d;
    }

    public C0267d(int i7, Set set) {
        this.f4268a = i7;
        A3.P p7 = A3.P.p(set);
        this.f4270c = p7;
        t0 it = p7.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 = Math.max(i8, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f4269b = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0267d)) {
            return false;
        }
        C0267d c0267d = (C0267d) obj;
        if (this.f4268a == c0267d.f4268a && this.f4269b == c0267d.f4269b && K0.x.a(this.f4270c, c0267d.f4270c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = ((this.f4268a * 31) + this.f4269b) * 31;
        A3.P p7 = this.f4270c;
        if (p7 == null) {
            hashCode = 0;
        } else {
            hashCode = p7.hashCode();
        }
        return i7 + hashCode;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f4268a + ", maxChannelCount=" + this.f4269b + ", channelMasks=" + this.f4270c + "]";
    }

    public C0267d(int i7, int i8) {
        this.f4268a = i7;
        this.f4269b = i8;
        this.f4270c = null;
    }
}
