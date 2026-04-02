package a1;

import java.util.Locale;
/* renamed from: a1.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0432i {

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f6832g = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6833a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f6834b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6835c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6836d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6837e;
    public final byte[] f;

    public C0432i(C0431h c0431h) {
        this.f6833a = c0431h.f6827a;
        this.f6834b = c0431h.f6828b;
        this.f6835c = c0431h.f6829c;
        this.f6836d = c0431h.f6830d;
        this.f6837e = c0431h.f6831e;
        this.f = c0431h.f;
    }

    public static int a(int i7) {
        return f7.a.e0(i7 + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0432i.class != obj.getClass()) {
            return false;
        }
        C0432i c0432i = (C0432i) obj;
        if (this.f6834b == c0432i.f6834b && this.f6835c == c0432i.f6835c && this.f6833a == c0432i.f6833a && this.f6836d == c0432i.f6836d && this.f6837e == c0432i.f6837e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f6836d;
        return ((((((((527 + this.f6834b) * 31) + this.f6835c) * 31) + (this.f6833a ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f6837e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.f6834b), Integer.valueOf(this.f6835c), Long.valueOf(this.f6836d), Integer.valueOf(this.f6837e), Boolean.valueOf(this.f6833a)};
        int i7 = K0.x.f2529a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
