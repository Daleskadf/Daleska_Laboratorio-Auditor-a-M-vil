package W6;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class g extends T6.d {

    /* renamed from: c  reason: collision with root package name */
    public int f6229c;

    public final h L() {
        T6.a aVar = this.f5504b;
        if (aVar != null) {
            return new h((byte[]) aVar.f5503b, this.f6229c);
        }
        throw new IllegalStateException("origin == null");
    }

    public final void M(byte[] bArr) {
        Objects.requireNonNull(bArr, "origin");
        this.f6229c = bArr.length;
        this.f5504b = new T6.a(bArr);
    }
}
