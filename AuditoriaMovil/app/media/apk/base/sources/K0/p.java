package K0;

import com.google.android.libraries.barhopper.RecognitionOptions;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2506a;

    /* renamed from: b  reason: collision with root package name */
    public int f2507b;

    /* renamed from: c  reason: collision with root package name */
    public int f2508c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f2509d;

    /* renamed from: e  reason: collision with root package name */
    public int f2510e;

    public p() {
        this.f2506a = 0;
        this.f2509d = x.f;
    }

    public void a() {
        boolean z7;
        int i7;
        boolean z8;
        int i8;
        switch (this.f2506a) {
            case 0:
                int i9 = this.f2507b;
                if (i9 >= 0 && (i9 < (i7 = this.f2510e) || (i9 == i7 && this.f2508c == 0))) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                a.j(z7);
                return;
            default:
                int i10 = this.f2508c;
                if (i10 >= 0 && (i10 < (i8 = this.f2507b) || (i10 == i8 && this.f2510e == 0))) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                a.j(z8);
                return;
        }
    }

    public int b() {
        return ((this.f2510e - this.f2507b) * 8) - this.f2508c;
    }

    public void c() {
        if (this.f2508c == 0) {
            return;
        }
        this.f2508c = 0;
        this.f2507b++;
        a();
    }

    public boolean d(int i7) {
        int i8 = this.f2508c;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        int i11 = (this.f2510e + i7) - (i9 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i8++;
            if (i8 > i10 || i10 >= this.f2507b) {
                break;
            } else if (r(i8)) {
                i10++;
                i8 += 2;
            }
        }
        int i12 = this.f2507b;
        if (i10 < i12) {
            return true;
        }
        if (i10 == i12 && i11 == 0) {
            return true;
        }
        return false;
    }

    public boolean e() {
        boolean z7;
        int i7 = this.f2508c;
        int i8 = this.f2510e;
        int i9 = 0;
        while (this.f2508c < this.f2507b && !h()) {
            i9++;
        }
        if (this.f2508c == this.f2507b) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f2508c = i7;
        this.f2510e = i8;
        if (z7 || !d((i9 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public int f() {
        boolean z7;
        if (this.f2508c == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        a.j(z7);
        return this.f2507b;
    }

    public int g() {
        return (this.f2507b * 8) + this.f2508c;
    }

    public boolean h() {
        boolean z7;
        boolean z8;
        boolean z9;
        switch (this.f2506a) {
            case 0:
                if ((this.f2509d[this.f2507b] & (RecognitionOptions.ITF >> this.f2508c)) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                s();
                return z7;
            case 1:
            default:
                if ((((this.f2509d[this.f2508c] & ForkServer.ERROR) >> this.f2510e) & 1) == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                t(1);
                return z9;
            case 2:
                if ((this.f2509d[this.f2508c] & (RecognitionOptions.ITF >> this.f2510e)) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                s();
                return z8;
        }
    }

    public int i(int i7) {
        switch (this.f2506a) {
            case 0:
                if (i7 == 0) {
                    return 0;
                }
                this.f2508c += i7;
                int i8 = 0;
                while (true) {
                    int i9 = this.f2508c;
                    if (i9 > 8) {
                        int i10 = i9 - 8;
                        this.f2508c = i10;
                        byte[] bArr = this.f2509d;
                        int i11 = this.f2507b;
                        this.f2507b = i11 + 1;
                        i8 |= (bArr[i11] & ForkServer.ERROR) << i10;
                    } else {
                        byte[] bArr2 = this.f2509d;
                        int i12 = this.f2507b;
                        int i13 = ((-1) >>> (32 - i7)) & (i8 | ((bArr2[i12] & ForkServer.ERROR) >> (8 - i9)));
                        if (i9 == 8) {
                            this.f2508c = 0;
                            this.f2507b = i12 + 1;
                        }
                        a();
                        return i13;
                    }
                }
            case 1:
            default:
                int i14 = this.f2508c;
                int min = Math.min(i7, 8 - this.f2510e);
                int i15 = i14 + 1;
                byte[] bArr3 = this.f2509d;
                int i16 = ((bArr3[i14] & ForkServer.ERROR) >> this.f2510e) & (255 >> (8 - min));
                while (min < i7) {
                    i16 |= (bArr3[i15] & ForkServer.ERROR) << min;
                    min += 8;
                    i15++;
                }
                int i17 = i16 & ((-1) >>> (32 - i7));
                t(i7);
                return i17;
            case 2:
                this.f2510e += i7;
                int i18 = 0;
                while (true) {
                    int i19 = this.f2510e;
                    int i20 = 2;
                    if (i19 > 8) {
                        int i21 = i19 - 8;
                        this.f2510e = i21;
                        byte[] bArr4 = this.f2509d;
                        int i22 = this.f2508c;
                        i18 |= (bArr4[i22] & ForkServer.ERROR) << i21;
                        if (!r(i22 + 1)) {
                            i20 = 1;
                        }
                        this.f2508c = i22 + i20;
                    } else {
                        byte[] bArr5 = this.f2509d;
                        int i23 = this.f2508c;
                        int i24 = ((-1) >>> (32 - i7)) & (i18 | ((bArr5[i23] & ForkServer.ERROR) >> (8 - i19)));
                        if (i19 == 8) {
                            this.f2510e = 0;
                            if (!r(i23 + 1)) {
                                i20 = 1;
                            }
                            this.f2508c = i23 + i20;
                        }
                        a();
                        return i24;
                    }
                }
        }
    }

    public void j(byte[] bArr, int i7) {
        int i8 = i7 >> 3;
        for (int i9 = 0; i9 < i8; i9++) {
            byte[] bArr2 = this.f2509d;
            int i10 = this.f2507b;
            int i11 = i10 + 1;
            this.f2507b = i11;
            byte b5 = bArr2[i10];
            int i12 = this.f2508c;
            byte b7 = (byte) (b5 << i12);
            bArr[i9] = b7;
            bArr[i9] = (byte) (((255 & bArr2[i11]) >> (8 - i12)) | b7);
        }
        int i13 = i7 & 7;
        if (i13 == 0) {
            return;
        }
        byte b8 = (byte) (bArr[i8] & (255 >> i13));
        bArr[i8] = b8;
        int i14 = this.f2508c;
        if (i14 + i13 > 8) {
            byte[] bArr3 = this.f2509d;
            int i15 = this.f2507b;
            this.f2507b = i15 + 1;
            bArr[i8] = (byte) (b8 | ((bArr3[i15] & ForkServer.ERROR) << i14));
            this.f2508c = i14 - 8;
        }
        int i16 = this.f2508c + i13;
        this.f2508c = i16;
        byte[] bArr4 = this.f2509d;
        int i17 = this.f2507b;
        bArr[i8] = (byte) (((byte) (((255 & bArr4[i17]) >> (8 - i16)) << (8 - i13))) | bArr[i8]);
        if (i16 == 8) {
            this.f2508c = 0;
            this.f2507b = i17 + 1;
        }
        a();
    }

    public long k(int i7) {
        if (i7 <= 32) {
            int i8 = i(i7);
            int i9 = x.f2529a;
            return 4294967295L & i8;
        }
        int i10 = i(i7 - 32);
        int i11 = i(32);
        int i12 = x.f2529a;
        return (4294967295L & i11) | ((i10 & 4294967295L) << 32);
    }

    public void l(byte[] bArr, int i7) {
        boolean z7;
        if (this.f2508c == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        a.j(z7);
        System.arraycopy(this.f2509d, this.f2507b, bArr, 0, i7);
        this.f2507b += i7;
        a();
    }

    public int m() {
        int i7 = 0;
        int i8 = 0;
        while (!h()) {
            i8++;
        }
        int i9 = (1 << i8) - 1;
        if (i8 > 0) {
            i7 = i(i8);
        }
        return i9 + i7;
    }

    public int n() {
        int i7;
        int m7 = m();
        if (m7 % 2 == 0) {
            i7 = -1;
        } else {
            i7 = 1;
        }
        return ((m7 + 1) / 2) * i7;
    }

    public void o(q qVar) {
        p(qVar.f2513a, qVar.f2515c);
        q(qVar.f2514b * 8);
    }

    public void p(byte[] bArr, int i7) {
        this.f2509d = bArr;
        this.f2507b = 0;
        this.f2508c = 0;
        this.f2510e = i7;
    }

    public void q(int i7) {
        int i8 = i7 / 8;
        this.f2507b = i8;
        this.f2508c = i7 - (i8 * 8);
        a();
    }

    public boolean r(int i7) {
        if (2 <= i7 && i7 < this.f2507b) {
            byte[] bArr = this.f2509d;
            if (bArr[i7] == 3 && bArr[i7 - 2] == 0 && bArr[i7 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void s() {
        switch (this.f2506a) {
            case 0:
                int i7 = this.f2508c + 1;
                this.f2508c = i7;
                if (i7 == 8) {
                    this.f2508c = 0;
                    this.f2507b++;
                }
                a();
                return;
            default:
                int i8 = 1;
                int i9 = this.f2510e + 1;
                this.f2510e = i9;
                if (i9 == 8) {
                    this.f2510e = 0;
                    int i10 = this.f2508c;
                    if (r(i10 + 1)) {
                        i8 = 2;
                    }
                    this.f2508c = i10 + i8;
                }
                a();
                return;
        }
    }

    public void t(int i7) {
        int i8;
        switch (this.f2506a) {
            case 0:
                int i9 = i7 / 8;
                int i10 = this.f2507b + i9;
                this.f2507b = i10;
                int i11 = (i7 - (i9 * 8)) + this.f2508c;
                this.f2508c = i11;
                if (i11 > 7) {
                    this.f2507b = i10 + 1;
                    this.f2508c = i11 - 8;
                }
                a();
                return;
            case 1:
            default:
                int i12 = i7 / 8;
                int i13 = this.f2508c + i12;
                this.f2508c = i13;
                int i14 = (i7 - (i12 * 8)) + this.f2510e;
                this.f2510e = i14;
                boolean z7 = true;
                if (i14 > 7) {
                    this.f2508c = i13 + 1;
                    this.f2510e = i14 - 8;
                }
                int i15 = this.f2508c;
                if (i15 < 0 || (i15 >= (i8 = this.f2507b) && (i15 != i8 || this.f2510e != 0))) {
                    z7 = false;
                }
                a.j(z7);
                return;
            case 2:
                int i16 = this.f2508c;
                int i17 = i7 / 8;
                int i18 = i16 + i17;
                this.f2508c = i18;
                int i19 = (i7 - (i17 * 8)) + this.f2510e;
                this.f2510e = i19;
                if (i19 > 7) {
                    this.f2508c = i18 + 1;
                    this.f2510e = i19 - 8;
                }
                while (true) {
                    i16++;
                    if (i16 <= this.f2508c) {
                        if (r(i16)) {
                            this.f2508c++;
                            i16 += 2;
                        }
                    } else {
                        a();
                        return;
                    }
                }
        }
    }

    public void u(int i7) {
        boolean z7;
        if (this.f2508c == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        a.j(z7);
        this.f2507b += i7;
        a();
    }

    public p(byte[] bArr) {
        this.f2506a = 3;
        this.f2509d = bArr;
        this.f2507b = bArr.length;
    }

    public p(byte[] bArr, int i7, int i8) {
        this.f2506a = 2;
        this.f2509d = bArr;
        this.f2508c = i7;
        this.f2507b = i8;
        this.f2510e = 0;
        a();
    }

    public p(byte[] bArr, int i7) {
        this.f2506a = 0;
        this.f2509d = bArr;
        this.f2510e = i7;
    }

    public p(int i7, int i8) {
        this.f2506a = 1;
        this.f2507b = i7;
        this.f2508c = i8;
        this.f2509d = new byte[(i8 * 2) - 1];
        this.f2510e = 0;
    }
}
