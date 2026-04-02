package S1;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f5033e = {0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public boolean f5034a;

    /* renamed from: b  reason: collision with root package name */
    public int f5035b;

    /* renamed from: c  reason: collision with root package name */
    public int f5036c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f5037d;

    public final void a(byte[] bArr, int i7, int i8) {
        if (!this.f5034a) {
            return;
        }
        int i9 = i8 - i7;
        byte[] bArr2 = this.f5037d;
        int length = bArr2.length;
        int i10 = this.f5035b + i9;
        if (length < i10) {
            this.f5037d = Arrays.copyOf(bArr2, i10 * 2);
        }
        System.arraycopy(bArr, i7, this.f5037d, this.f5035b, i9);
        this.f5035b += i9;
    }
}
