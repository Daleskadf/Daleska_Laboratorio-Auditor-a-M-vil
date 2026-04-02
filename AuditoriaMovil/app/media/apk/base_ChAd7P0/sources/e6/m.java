package E6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m6.AbstractC1446g;
import m6.AbstractC1449j;
/* loaded from: classes.dex */
public abstract class m extends j {
    public static boolean N(CharSequence charSequence, String str) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        if (R(0, 2, charSequence, str, false) < 0) {
            return false;
        }
        return true;
    }

    public static boolean O(String str, String str2, boolean z7) {
        kotlin.jvm.internal.j.e(str, "<this>");
        if (!z7) {
            return str.endsWith(str2);
        }
        return X(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static final int P(CharSequence charSequence) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int Q(CharSequence charSequence, String string, int i7, boolean z7) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        kotlin.jvm.internal.j.e(string, "string");
        if (!z7 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i7);
        }
        int length = charSequence.length();
        if (i7 < 0) {
            i7 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        B6.d dVar = new B6.d(i7, length, 1);
        boolean z8 = charSequence instanceof String;
        int i8 = dVar.f403c;
        int i9 = dVar.f402b;
        int i10 = dVar.f401a;
        if (z8 && (string instanceof String)) {
            if ((i8 > 0 && i10 <= i9) || (i8 < 0 && i9 <= i10)) {
                while (!X(0, i10, string.length(), string, (String) charSequence, z7)) {
                    if (i10 != i9) {
                        i10 += i8;
                    }
                }
                return i10;
            }
            return -1;
        }
        if ((i8 > 0 && i10 <= i9) || (i8 < 0 && i9 <= i10)) {
            while (!Y(i10, string.length(), charSequence, string, z7)) {
                if (i10 != i9) {
                    i10 += i8;
                }
            }
            return i10;
        }
        return -1;
    }

    public static /* synthetic */ int R(int i7, int i8, CharSequence charSequence, String str, boolean z7) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return Q(charSequence, str, i7, z7);
    }

    public static int S(String str, char c8, boolean z7, int i7) {
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        if (!z7) {
            return str.indexOf(c8, 0);
        }
        return T(str, new char[]{c8}, 0, z7);
    }

    public static final int T(CharSequence charSequence, char[] cArr, int i7, boolean z7) {
        int i8;
        char upperCase;
        char upperCase2;
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        boolean z8 = true;
        if (!z7 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length != 0) {
                if (length == 1) {
                    return ((String) charSequence).indexOf(cArr[0], i7);
                }
                throw new IllegalArgumentException("Array has more than one element.");
            }
            throw new NoSuchElementException("Array is empty.");
        }
        if (i7 < 0) {
            i7 = 0;
        }
        B6.d dVar = new B6.d(i7, P(charSequence), 1);
        int i9 = dVar.f403c;
        int i10 = dVar.f402b;
        if (i9 <= 0 ? i7 < i10 : i7 > i10) {
            z8 = false;
        }
        if (!z8) {
            i7 = i10;
        }
        while (z8) {
            if (i7 == i10) {
                if (z8) {
                    i8 = i7;
                    z8 = false;
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                i8 = i7 + i9;
            }
            char charAt = charSequence.charAt(i7);
            for (char c8 : cArr) {
                if (c8 == charAt || (z7 && ((upperCase = Character.toUpperCase(c8)) == (upperCase2 = Character.toUpperCase(charAt)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                    return i7;
                }
            }
            i7 = i8;
        }
        return -1;
    }

    public static boolean U(CharSequence charSequence) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        B6.d dVar = new B6.d(0, charSequence.length() - 1, 1);
        if ((dVar instanceof Collection) && ((Collection) dVar).isEmpty()) {
            return true;
        }
        Iterator it = dVar.iterator();
        while (((B6.e) it).f406c) {
            char charAt = charSequence.charAt(((B6.e) it).a());
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static String V(int i7, String str) {
        boolean z7;
        CharSequence charSequence;
        kotlin.jvm.internal.j.e(str, "<this>");
        if (i7 >= 0) {
            if (i7 <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i7);
                sb.append((CharSequence) str);
                int length = i7 - str.length();
                int i8 = 1;
                B6.d dVar = new B6.d(1, length, 1);
                int i9 = dVar.f403c;
                int i10 = dVar.f402b;
                if (i9 <= 0 ? 1 >= i10 : 1 <= i10) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7) {
                    i8 = i10;
                }
                while (z7) {
                    if (i8 == i10) {
                        if (z7) {
                            z7 = false;
                        } else {
                            throw new NoSuchElementException();
                        }
                    } else {
                        i8 += i9;
                    }
                    sb.append(' ');
                }
                charSequence = sb;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.f("Desired length ", i7, " is less than zero."));
    }

    public static c W(String str, String[] strArr, boolean z7, int i7) {
        a0(i7);
        return new c(str, 0, i7, new k(AbstractC1446g.H(strArr), z7, 1));
    }

    public static final boolean X(int i7, int i8, int i9, String str, String other, boolean z7) {
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(other, "other");
        if (!z7) {
            return str.regionMatches(i7, other, i8, i9);
        }
        return str.regionMatches(z7, i7, other, i8, i9);
    }

    public static final boolean Y(int i7, int i8, CharSequence other, String str, boolean z7) {
        char upperCase;
        char upperCase2;
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(other, "other");
        if (i7 < 0 || str.length() - i8 < 0 || i7 > other.length() - i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            char charAt = str.charAt(i9);
            char charAt2 = other.charAt(i7 + i9);
            if (charAt != charAt2 && (!z7 || ((upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                return false;
            }
        }
        return true;
    }

    public static String Z(String str, String str2, String newValue) {
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(newValue, "newValue");
        int Q7 = Q(str, str2, 0, false);
        if (Q7 >= 0) {
            int length = str2.length();
            int i7 = 1;
            if (length >= 1) {
                i7 = length;
            }
            int length2 = newValue.length() + (str.length() - length);
            if (length2 >= 0) {
                StringBuilder sb = new StringBuilder(length2);
                int i8 = 0;
                do {
                    sb.append((CharSequence) str, i8, Q7);
                    sb.append(newValue);
                    i8 = Q7 + length;
                    if (Q7 >= str.length()) {
                        break;
                    }
                    Q7 = Q(str, str2, Q7 + i7, false);
                } while (Q7 > 0);
                sb.append((CharSequence) str, i8, str.length());
                String sb2 = sb.toString();
                kotlin.jvm.internal.j.d(sb2, "toString(...)");
                return sb2;
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    public static final void a0(int i7) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Limit must be non-negative, but was ").toString());
    }

    public static final List b0(String str, String str2, boolean z7, int i7) {
        boolean z8;
        a0(i7);
        int i8 = 0;
        int Q7 = Q(str, str2, 0, z7);
        if (Q7 != -1 && i7 != 1) {
            if (i7 > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            int i9 = 10;
            if (z8 && i7 <= 10) {
                i9 = i7;
            }
            ArrayList arrayList = new ArrayList(i9);
            do {
                arrayList.add(str.subSequence(i8, Q7).toString());
                i8 = str2.length() + Q7;
                if (z8 && arrayList.size() == i7 - 1) {
                    break;
                }
                Q7 = Q(str, str2, i8, z7);
            } while (Q7 != -1);
            arrayList.add(str.subSequence(i8, str.length()).toString());
            return arrayList;
        }
        return G.i.A(str.toString());
    }

    public static List c0(String str, char[] cArr) {
        kotlin.jvm.internal.j.e(str, "<this>");
        if (cArr.length == 1) {
            return b0(str, String.valueOf(cArr[0]), false, 0);
        }
        a0(0);
        D6.i iVar = new D6.i(new c(str, 0, 0, new k(cArr, false, 0)));
        ArrayList arrayList = new ArrayList(AbstractC1449j.M(iVar));
        Iterator it = iVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                arrayList.add(f0(str, (B6.f) bVar.next()));
            } else {
                return arrayList;
            }
        }
    }

    public static List d0(String str, String[] strArr) {
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return b0(str, str2, false, 0);
            }
        }
        D6.i iVar = new D6.i(W(str, strArr, false, 0));
        ArrayList arrayList = new ArrayList(AbstractC1449j.M(iVar));
        Iterator it = iVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                arrayList.add(f0(str, (B6.f) bVar.next()));
            } else {
                return arrayList;
            }
        }
    }

    public static boolean e0(String str, String prefix) {
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(prefix, "prefix");
        return str.startsWith(prefix);
    }

    public static final String f0(String str, B6.f range) {
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(range, "range");
        return str.subSequence(range.f401a, range.f402b + 1).toString();
    }

    public static String g0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.j.e(delimiter, "delimiter");
        kotlin.jvm.internal.j.e(missingDelimiterValue, "missingDelimiterValue");
        int R7 = R(0, 6, str, delimiter, false);
        if (R7 != -1) {
            String substring = str.substring(delimiter.length() + R7, str.length());
            kotlin.jvm.internal.j.d(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static String h0(String str, char c8, String missingDelimiterValue) {
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(c8, P(str));
        if (lastIndexOf != -1) {
            String substring = str.substring(lastIndexOf + 1, str.length());
            kotlin.jvm.internal.j.d(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }
}
