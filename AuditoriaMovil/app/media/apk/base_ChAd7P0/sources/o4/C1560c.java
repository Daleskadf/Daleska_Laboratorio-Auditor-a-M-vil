package o4;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.AbstractC0852m;
import java.math.RoundingMode;
import org.slf4j.helpers.i;
/* renamed from: o4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1560c extends j3.f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14592c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C1561d f14593d;

    public /* synthetic */ C1560c(C1561d c1561d, int i7) {
        this.f14592c = i7;
        this.f14593d = c1561d;
    }

    @Override // j3.f
    public final void V(AbstractC0852m abstractC0852m) {
        switch (this.f14592c) {
            case 0:
                C1563f c1563f = this.f14593d.f14594a;
                for (int i7 = 0; i7 < abstractC0852m.size(); i7++) {
                    c1563f.b(abstractC0852m.h(i7));
                }
                c1563f.d((byte) 0);
                c1563f.d((byte) 1);
                return;
            default:
                C1563f c1563f2 = this.f14593d.f14594a;
                for (int i8 = 0; i8 < abstractC0852m.size(); i8++) {
                    c1563f2.c(abstractC0852m.h(i8));
                }
                c1563f2.e((byte) 0);
                c1563f2.e((byte) 1);
                return;
        }
    }

    @Override // j3.f
    public final void W(double d7) {
        long j;
        long j8;
        switch (this.f14592c) {
            case 0:
                C1563f c1563f = this.f14593d.f14594a;
                long doubleToLongBits = Double.doubleToLongBits(d7);
                if (doubleToLongBits < 0) {
                    j = -1;
                } else {
                    j = Long.MIN_VALUE;
                }
                long j9 = doubleToLongBits ^ j;
                int s7 = i.s(64 - Long.numberOfLeadingZeros(j9), 8, RoundingMode.UP);
                c1563f.a(s7 + 1);
                byte[] bArr = c1563f.f14599a;
                int i7 = c1563f.f14600b;
                int i8 = i7 + 1;
                c1563f.f14600b = i8;
                bArr[i7] = (byte) s7;
                int i9 = i8 + s7;
                while (true) {
                    i9--;
                    int i10 = c1563f.f14600b;
                    if (i9 >= i10) {
                        c1563f.f14599a[i9] = (byte) (255 & j9);
                        j9 >>>= 8;
                    } else {
                        c1563f.f14600b = i10 + s7;
                        return;
                    }
                }
            default:
                C1563f c1563f2 = this.f14593d.f14594a;
                long doubleToLongBits2 = Double.doubleToLongBits(d7);
                if (doubleToLongBits2 < 0) {
                    j8 = -1;
                } else {
                    j8 = Long.MIN_VALUE;
                }
                long j10 = doubleToLongBits2 ^ j8;
                int s8 = i.s(64 - Long.numberOfLeadingZeros(j10), 8, RoundingMode.UP);
                c1563f2.a(s8 + 1);
                byte[] bArr2 = c1563f2.f14599a;
                int i11 = c1563f2.f14600b;
                int i12 = i11 + 1;
                c1563f2.f14600b = i12;
                bArr2[i11] = (byte) (~s8);
                int i13 = i12 + s8;
                while (true) {
                    i13--;
                    int i14 = c1563f2.f14600b;
                    if (i13 >= i14) {
                        c1563f2.f14599a[i13] = (byte) (~(255 & j10));
                        j10 >>>= 8;
                    } else {
                        c1563f2.f14600b = i14 + s8;
                        return;
                    }
                }
        }
    }

    @Override // j3.f
    public final void X() {
        switch (this.f14592c) {
            case 0:
                C1563f c1563f = this.f14593d.f14594a;
                c1563f.d((byte) -1);
                c1563f.d((byte) -1);
                return;
            default:
                C1563f c1563f2 = this.f14593d.f14594a;
                c1563f2.e((byte) -1);
                c1563f2.e((byte) -1);
                return;
        }
    }

    @Override // j3.f
    public final void Y(long j) {
        switch (this.f14592c) {
            case 0:
                this.f14593d.f14594a.f(j);
                return;
            default:
                this.f14593d.f14594a.f(~j);
                return;
        }
    }

    @Override // j3.f
    public final void Z(String str) {
        switch (this.f14592c) {
            case 0:
                C1563f c1563f = this.f14593d.f14594a;
                int length = str.length();
                int i7 = 0;
                while (i7 < length) {
                    char charAt = str.charAt(i7);
                    if (charAt < 128) {
                        c1563f.b((byte) charAt);
                    } else if (charAt < 2048) {
                        c1563f.b((byte) ((charAt >>> 6) | 960));
                        c1563f.b((byte) ((charAt & '?') | RecognitionOptions.ITF));
                    } else if (charAt >= 55296 && 57343 >= charAt) {
                        int codePointAt = Character.codePointAt(str, i7);
                        i7++;
                        c1563f.b((byte) ((codePointAt >>> 18) | 240));
                        c1563f.b((byte) (((codePointAt >>> 12) & 63) | RecognitionOptions.ITF));
                        c1563f.b((byte) (((codePointAt >>> 6) & 63) | RecognitionOptions.ITF));
                        c1563f.b((byte) ((codePointAt & 63) | RecognitionOptions.ITF));
                    } else {
                        c1563f.b((byte) ((charAt >>> '\f') | 480));
                        c1563f.b((byte) (((charAt >>> 6) & 63) | RecognitionOptions.ITF));
                        c1563f.b((byte) ((charAt & '?') | RecognitionOptions.ITF));
                    }
                    i7++;
                }
                c1563f.d((byte) 0);
                c1563f.d((byte) 1);
                return;
            default:
                C1563f c1563f2 = this.f14593d.f14594a;
                int length2 = str.length();
                int i8 = 0;
                while (i8 < length2) {
                    char charAt2 = str.charAt(i8);
                    if (charAt2 < 128) {
                        c1563f2.c((byte) charAt2);
                    } else if (charAt2 < 2048) {
                        c1563f2.c((byte) ((charAt2 >>> 6) | 960));
                        c1563f2.c((byte) ((charAt2 & '?') | RecognitionOptions.ITF));
                    } else if (charAt2 >= 55296 && 57343 >= charAt2) {
                        int codePointAt2 = Character.codePointAt(str, i8);
                        i8++;
                        c1563f2.c((byte) ((codePointAt2 >>> 18) | 240));
                        c1563f2.c((byte) (((codePointAt2 >>> 12) & 63) | RecognitionOptions.ITF));
                        c1563f2.c((byte) (((codePointAt2 >>> 6) & 63) | RecognitionOptions.ITF));
                        c1563f2.c((byte) ((codePointAt2 & 63) | RecognitionOptions.ITF));
                    } else {
                        c1563f2.c((byte) ((charAt2 >>> '\f') | 480));
                        c1563f2.c((byte) (((charAt2 >>> 6) & 63) | RecognitionOptions.ITF));
                        c1563f2.c((byte) ((charAt2 & '?') | RecognitionOptions.ITF));
                    }
                    i8++;
                }
                c1563f2.e((byte) 0);
                c1563f2.e((byte) 1);
                return;
        }
    }
}
