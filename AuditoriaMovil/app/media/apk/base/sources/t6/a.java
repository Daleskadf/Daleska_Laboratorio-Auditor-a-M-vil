package T6;

import G.i;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: b  reason: collision with root package name */
    public final Object f5503b;

    public a(byte[] bArr) {
        Objects.requireNonNull(bArr, "origin");
        this.f5503b = bArr;
    }

    public final String toString() {
        return a.class.getSimpleName() + "[" + this.f5503b.toString() + "]";
    }
}
