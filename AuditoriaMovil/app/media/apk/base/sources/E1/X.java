package e1;

import java.util.Arrays;
import java.util.Random;
/* loaded from: classes.dex */
public final class X {

    /* renamed from: a  reason: collision with root package name */
    public final Random f10754a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f10755b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f10756c;

    public X() {
        this(new Random());
    }

    public final X a(int i7) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i7];
        int[] iArr3 = new int[i7];
        int i8 = 0;
        while (true) {
            random = this.f10754a;
            iArr = this.f10755b;
            if (i8 >= i7) {
                break;
            }
            iArr2[i8] = random.nextInt(iArr.length + 1);
            int i9 = i8 + 1;
            int nextInt = random.nextInt(i9);
            iArr3[i8] = iArr3[nextInt];
            iArr3[nextInt] = i8;
            i8 = i9;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i7];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length + i7; i12++) {
            if (i10 < i7 && i11 == iArr2[i10]) {
                iArr4[i12] = iArr3[i10];
                i10++;
            } else {
                int i13 = i11 + 1;
                int i14 = iArr[i11];
                iArr4[i12] = i14;
                if (i14 >= 0) {
                    iArr4[i12] = i14 + i7;
                }
                i11 = i13;
            }
        }
        return new X(iArr4, new Random(random.nextLong()));
    }

    public X(int[] iArr, Random random) {
        this.f10755b = iArr;
        this.f10754a = random;
        this.f10756c = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            this.f10756c[iArr[i7]] = i7;
        }
    }

    public X(Random random) {
        this(new int[0], random);
    }
}
