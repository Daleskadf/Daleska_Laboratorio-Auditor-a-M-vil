package e1;
/* renamed from: e1.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0960z {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10852a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10853b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10854c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10855d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10856e;

    public C0960z(Object obj) {
        this(obj, -1L);
    }

    public final C0960z a(Object obj) {
        if (this.f10852a.equals(obj)) {
            return this;
        }
        return new C0960z(obj, this.f10853b, this.f10854c, this.f10855d, this.f10856e);
    }

    public final boolean b() {
        if (this.f10853b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0960z)) {
            return false;
        }
        C0960z c0960z = (C0960z) obj;
        if (this.f10852a.equals(c0960z.f10852a) && this.f10853b == c0960z.f10853b && this.f10854c == c0960z.f10854c && this.f10855d == c0960z.f10855d && this.f10856e == c0960z.f10856e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f10852a.hashCode() + 527) * 31) + this.f10853b) * 31) + this.f10854c) * 31) + ((int) this.f10855d)) * 31) + this.f10856e;
    }

    public C0960z(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public C0960z(Object obj, long j, int i7) {
        this(obj, -1, -1, j, i7);
    }

    public C0960z(Object obj, int i7, int i8, long j, int i9) {
        this.f10852a = obj;
        this.f10853b = i7;
        this.f10854c = i8;
        this.f10855d = j;
        this.f10856e = i9;
    }
}
