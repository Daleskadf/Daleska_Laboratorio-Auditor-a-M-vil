package S1;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class l {
    public static final byte[] f = {0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public boolean f5053a;

    /* renamed from: b  reason: collision with root package name */
    public int f5054b;

    /* renamed from: c  reason: collision with root package name */
    public int f5055c;

    /* renamed from: d  reason: collision with root package name */
    public int f5056d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f5057e;

    public final void a(byte[] bArr, int i7, int i8) {
        if (!this.f5053a) {
            return;
        }
        int i9 = i8 - i7;
        byte[] bArr2 = this.f5057e;
        int length = bArr2.length;
        int i10 = this.f5055c + i9;
        if (length < i10) {
            this.f5057e = Arrays.copyOf(bArr2, i10 * 2);
        }
        System.arraycopy(bArr, i7, this.f5057e, this.f5055c, i9);
        this.f5055c += i9;
    }
}
