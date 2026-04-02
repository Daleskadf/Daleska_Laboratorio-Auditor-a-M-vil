package Q6;

import m6.AbstractC1446g;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4491a;

    /* renamed from: b  reason: collision with root package name */
    public int f4492b;

    /* renamed from: c  reason: collision with root package name */
    public int f4493c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4494d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4495e;
    public t f;

    /* renamed from: g  reason: collision with root package name */
    public t f4496g;

    public t() {
        this.f4491a = new byte[8192];
        this.f4495e = true;
        this.f4494d = false;
    }

    public final t a() {
        t tVar = this.f;
        if (tVar == this) {
            tVar = null;
        }
        t tVar2 = this.f4496g;
        kotlin.jvm.internal.j.b(tVar2);
        tVar2.f = this.f;
        t tVar3 = this.f;
        kotlin.jvm.internal.j.b(tVar3);
        tVar3.f4496g = this.f4496g;
        this.f = null;
        this.f4496g = null;
        return tVar;
    }

    public final void b(t segment) {
        kotlin.jvm.internal.j.e(segment, "segment");
        segment.f4496g = this;
        segment.f = this.f;
        t tVar = this.f;
        kotlin.jvm.internal.j.b(tVar);
        tVar.f4496g = segment;
        this.f = segment;
    }

    public final t c() {
        this.f4494d = true;
        return new t(this.f4491a, this.f4492b, this.f4493c, true);
    }

    public final void d(t sink, int i7) {
        kotlin.jvm.internal.j.e(sink, "sink");
        if (sink.f4495e) {
            int i8 = sink.f4493c;
            int i9 = i8 + i7;
            byte[] bArr = sink.f4491a;
            if (i9 > 8192) {
                if (!sink.f4494d) {
                    int i10 = sink.f4492b;
                    if (i9 - i10 <= 8192) {
                        AbstractC1446g.K(bArr, 0, bArr, i10, i8);
                        sink.f4493c -= sink.f4492b;
                        sink.f4492b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i11 = sink.f4493c;
            int i12 = this.f4492b;
            AbstractC1446g.K(this.f4491a, i11, bArr, i12, i12 + i7);
            sink.f4493c += i7;
            this.f4492b += i7;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public t(byte[] data, int i7, int i8, boolean z7) {
        kotlin.jvm.internal.j.e(data, "data");
        this.f4491a = data;
        this.f4492b = i7;
        this.f4493c = i8;
        this.f4494d = z7;
        this.f4495e = false;
    }
}
