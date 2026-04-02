package W2;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f6192b;

    public p(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f6192b = bArr;
    }

    @Override // W2.o
    public final byte[] c() {
        return this.f6192b;
    }
}
