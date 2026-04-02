package j$.time.format;

import H4.e1;
import H4.p1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.Objects;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j implements f {

    /* renamed from: d  reason: collision with root package name */
    static final String[] f12679d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e  reason: collision with root package name */
    static final j f12680e = new j("+HH:MM:ss", "Z");
    static final j f = new j("+HH:MM:ss", "0");

    /* renamed from: a  reason: collision with root package name */
    private final String f12681a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12682b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12683c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(String str, String str2) {
        Objects.requireNonNull(str, MimeTypesReaderMetKeys.PATTERN_ATTR);
        Objects.requireNonNull(str2, "noOffsetText");
        int i7 = 0;
        while (true) {
            String[] strArr = f12679d;
            if (i7 < 22) {
                if (strArr[i7].equals(str)) {
                    this.f12682b = i7;
                    this.f12683c = i7 % 11;
                    this.f12681a = str2;
                    return;
                }
                i7++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
        }
    }

    @Override // j$.time.format.f
    public final boolean o(t tVar, StringBuilder sb) {
        Long e7 = tVar.e(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z7 = false;
        if (e7 == null) {
            return false;
        }
        long longValue = e7.longValue();
        int i7 = (int) longValue;
        if (longValue == i7) {
            String str = this.f12681a;
            if (i7 == 0) {
                sb.append(str);
            } else {
                int abs = Math.abs((i7 / 3600) % 100);
                int abs2 = Math.abs((i7 / 60) % 60);
                int abs3 = Math.abs(i7 % 60);
                int length = sb.length();
                sb.append(i7 < 0 ? "-" : "+");
                if (this.f12682b < 11 || abs >= 10) {
                    a(false, abs, sb);
                } else {
                    sb.append((char) (abs + 48));
                }
                int i8 = this.f12683c;
                if ((i8 >= 3 && i8 <= 8) || ((i8 >= 9 && abs3 > 0) || (i8 >= 1 && abs2 > 0))) {
                    a(i8 > 0 && i8 % 2 == 0, abs2, sb);
                    abs += abs2;
                    if (i8 == 7 || i8 == 8 || (i8 >= 5 && abs3 > 0)) {
                        if (i8 > 0 && i8 % 2 == 0) {
                            z7 = true;
                        }
                        a(z7, abs3, sb);
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                    sb.append(str);
                }
            }
            return true;
        }
        throw new ArithmeticException();
    }

    private static void a(boolean z7, int i7, StringBuilder sb) {
        sb.append(z7 ? TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER : StringUtils.EMPTY);
        sb.append((char) ((i7 / 10) + 48));
        sb.append((char) ((i7 % 10) + 48));
    }

    @Override // j$.time.format.f
    public final int q(q qVar, CharSequence charSequence, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int length = charSequence.length();
        int length2 = this.f12681a.length();
        if (length2 == 0) {
            if (i7 == length) {
                return qVar.n(j$.time.temporal.a.OFFSET_SECONDS, 0L, i7, i7);
            }
        } else if (i7 == length) {
            return ~i7;
        } else {
            if (qVar.r(charSequence, i7, this.f12681a, 0, length2)) {
                return qVar.n(j$.time.temporal.a.OFFSET_SECONDS, 0L, i7, i7 + length2);
            }
        }
        char charAt = charSequence.charAt(i7);
        if (charAt == '+' || charAt == '-') {
            int i12 = charAt == '-' ? -1 : 1;
            int i13 = this.f12683c;
            boolean z7 = i13 > 0 && i13 % 2 == 0;
            int i14 = this.f12682b;
            boolean z8 = i14 < 11;
            int[] iArr = new int[4];
            iArr[0] = i7 + 1;
            if (!qVar.k()) {
                if (z8) {
                    if (z7 || (i14 == 0 && length > (i11 = i7 + 3) && charSequence.charAt(i11) == ':')) {
                        i14 = 10;
                        z7 = true;
                    } else {
                        i14 = 9;
                    }
                } else if (z7 || (i14 == 11 && length > (i10 = i7 + 3) && (charSequence.charAt(i7 + 2) == ':' || charSequence.charAt(i10) == ':'))) {
                    i14 = 21;
                    z7 = true;
                } else {
                    i14 = 20;
                }
            }
            switch (i14) {
                case 0:
                case 11:
                    c(charSequence, z8, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c(charSequence, z8, iArr);
                    d(charSequence, z7, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c(charSequence, z8, iArr);
                    d(charSequence, z7, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    c(charSequence, z8, iArr);
                    d(charSequence, z7, true, iArr);
                    b(charSequence, z7, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    c(charSequence, z8, iArr);
                    d(charSequence, z7, true, iArr);
                    if (!b(charSequence, z7, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                        break;
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    c(charSequence, z8, iArr);
                    if (b(charSequence, z7, 2, iArr)) {
                        b(charSequence, z7, 3, iArr);
                        break;
                    }
                    break;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    e(charSequence, 1, 4, iArr);
                    break;
                case 14:
                    e(charSequence, 3, 4, iArr);
                    break;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    e(charSequence, 3, 6, iArr);
                    break;
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    e(charSequence, 5, 6, iArr);
                    break;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    e(charSequence, 1, 6, iArr);
                    break;
            }
            int i15 = iArr[0];
            if (i15 > 0) {
                int i16 = iArr[1];
                if (i16 > 23 || (i8 = iArr[2]) > 59 || (i9 = iArr[3]) > 59) {
                    throw new RuntimeException("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return qVar.n(j$.time.temporal.a.OFFSET_SECONDS, ((i8 * 60) + (i16 * 3600) + i9) * i12, i7, i15);
            }
        }
        return length2 == 0 ? qVar.n(j$.time.temporal.a.OFFSET_SECONDS, 0L, i7, i7) : ~i7;
    }

    private static void c(CharSequence charSequence, boolean z7, int[] iArr) {
        if (z7) {
            if (b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
            return;
        }
        e(charSequence, 1, 2, iArr);
    }

    private static void d(CharSequence charSequence, boolean z7, boolean z8, int[] iArr) {
        if (b(charSequence, z7, 2, iArr) || !z8) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    private static boolean b(CharSequence charSequence, boolean z7, int i7, int[] iArr) {
        int i8 = iArr[0];
        if (i8 < 0) {
            return true;
        }
        if (z7 && i7 != 1) {
            int i9 = i8 + 1;
            if (i9 > charSequence.length() || charSequence.charAt(i8) != ':') {
                return false;
            }
            i8 = i9;
        }
        int i10 = i8 + 2;
        if (i10 > charSequence.length()) {
            return false;
        }
        int i11 = i8 + 1;
        char charAt = charSequence.charAt(i8);
        char charAt2 = charSequence.charAt(i11);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            int i12 = (charAt2 - '0') + ((charAt - '0') * 10);
            if (i12 >= 0 && i12 <= 59) {
                iArr[i7] = i12;
                iArr[0] = i10;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        r12[0] = ~r12[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(java.lang.CharSequence r9, int r10, int r11, int[] r12) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.j.e(java.lang.CharSequence, int, int, int[]):void");
    }

    public final String toString() {
        String replace = this.f12681a.replace("'", "''");
        String str = f12679d[this.f12682b];
        return "Offset(" + str + ",'" + replace + "')";
    }
}
