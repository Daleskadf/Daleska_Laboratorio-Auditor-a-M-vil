package O0;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a  reason: collision with root package name */
    public int f3547a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3548b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3549c;

    /* renamed from: d  reason: collision with root package name */
    public int f3550d;

    /* renamed from: e  reason: collision with root package name */
    public Object f3551e;

    public K(int i7) {
        this.f3547a = i7;
        byte[] bArr = new byte[131];
        this.f3551e = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i7, int i8) {
        if (!this.f3548b) {
            return;
        }
        int i9 = i8 - i7;
        byte[] bArr2 = (byte[]) this.f3551e;
        int length = bArr2.length;
        int i10 = this.f3550d;
        if (length < i10 + i9) {
            this.f3551e = Arrays.copyOf(bArr2, (i10 + i9) * 2);
        }
        System.arraycopy(bArr, i7, (byte[]) this.f3551e, this.f3550d, i9);
        this.f3550d += i9;
    }

    public boolean b(int i7) {
        if (!this.f3548b) {
            return false;
        }
        this.f3550d -= i7;
        this.f3548b = false;
        this.f3549c = true;
        return true;
    }

    public void c(int i7) {
        boolean z7;
        boolean z8 = this.f3548b;
        if (i7 > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f3548b = z8 | z7;
        this.f3547a += i7;
    }

    public void d() {
        this.f3548b = false;
        this.f3549c = false;
    }

    public void e(int i7) {
        boolean z7 = true;
        K0.a.j(!this.f3548b);
        if (i7 != this.f3547a) {
            z7 = false;
        }
        this.f3548b = z7;
        if (z7) {
            this.f3550d = 3;
            this.f3549c = false;
        }
    }

    public K(e0 e0Var) {
        this.f3551e = e0Var;
    }
}
