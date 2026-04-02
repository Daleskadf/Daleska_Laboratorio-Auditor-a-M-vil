package f3;

import com.hpplay.component.protocol.plist.ASCIIPropertyListParser;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f13041a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f13042b;

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f13043c;

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f13044d;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f13045e;

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f13046f;

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f13047g;

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f13048h;

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f13049i;

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f13050j;

    /* renamed from: f3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0216a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0216a f13051b = new C0216a();

        /* renamed from: a  reason: collision with root package name */
        public int[][] f13052a = new int[128];

        public int[] a(int i10) {
            int[] iArr = this.f13052a[i10];
            if (iArr == null) {
                iArr = Arrays.copyOf(a.f13049i, 128);
                if (iArr[i10] == 0) {
                    iArr[i10] = -1;
                }
                this.f13052a[i10] = iArr;
            }
            return iArr;
        }
    }

    static {
        int i10;
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f13041a = charArray;
        int length = charArray.length;
        f13042b = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            f13042b[i11] = (byte) f13041a[i11];
        }
        int[] iArr = new int[256];
        for (int i12 = 0; i12 < 32; i12++) {
            iArr[i12] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f13043c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i13 = 128; i13 < 256; i13++) {
            if ((i13 & 224) == 192) {
                i10 = 2;
            } else if ((i13 & 240) == 224) {
                i10 = 3;
            } else if ((i13 & 248) == 240) {
                i10 = 4;
            } else {
                i10 = -1;
            }
            iArr2[i13] = i10;
        }
        f13044d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i14 = 33; i14 < 256; i14++) {
            if (Character.isJavaIdentifierPart((char) i14)) {
                iArr3[i14] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f13045e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        f13046f = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f13044d;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f13047g = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        f13048h = iArr7;
        int[] iArr8 = new int[128];
        for (int i15 = 0; i15 < 32; i15++) {
            iArr8[i15] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f13049i = iArr8;
        int[] iArr9 = new int[256];
        f13050j = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i16 = 0; i16 < 10; i16++) {
            f13050j[i16 + 48] = i16;
        }
        for (int i17 = 0; i17 < 6; i17++) {
            int[] iArr10 = f13050j;
            int i18 = i17 + 10;
            iArr10[i17 + 97] = i18;
            iArr10[i17 + 65] = i18;
        }
    }

    public static void a(StringBuilder sb, String str) {
        int[] iArr = f13049i;
        int length = iArr.length;
        int length2 = str.length();
        for (int i10 = 0; i10 < length2; i10++) {
            char charAt = str.charAt(i10);
            if (charAt < length && iArr[charAt] != 0) {
                sb.append(ASCIIPropertyListParser.QUOTEDSTRING_ESCAPE_TOKEN);
                int i11 = iArr[charAt];
                if (i11 < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    char[] cArr = f13041a;
                    sb.append(cArr[charAt >> 4]);
                    sb.append(cArr[charAt & 15]);
                } else {
                    sb.append((char) i11);
                }
            } else {
                sb.append(charAt);
            }
        }
    }

    public static int b(int i10) {
        return f13050j[i10 & 255];
    }

    public static byte[] c() {
        return (byte[]) f13042b.clone();
    }

    public static char[] d() {
        return (char[]) f13041a.clone();
    }

    public static int[] e() {
        return f13049i;
    }

    public static int[] f(int i10) {
        if (i10 == 34) {
            return f13049i;
        }
        return C0216a.f13051b.a(i10);
    }

    public static int[] g() {
        return f13043c;
    }

    public static int[] h() {
        return f13045e;
    }
}
