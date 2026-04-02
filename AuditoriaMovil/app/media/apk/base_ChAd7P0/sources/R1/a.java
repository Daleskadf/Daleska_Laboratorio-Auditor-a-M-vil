package R1;

import K0.q;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f4637c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f4638d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a  reason: collision with root package name */
    public final q f4639a = new q();

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f4640b = new StringBuilder();

    public static String a(q qVar, StringBuilder sb) {
        boolean z7 = false;
        sb.setLength(0);
        int i7 = qVar.f2514b;
        int i8 = qVar.f2515c;
        while (i7 < i8 && !z7) {
            char c8 = (char) qVar.f2513a[i7];
            if ((c8 < 'A' || c8 > 'Z') && ((c8 < 'a' || c8 > 'z') && ((c8 < '0' || c8 > '9') && c8 != '#' && c8 != '-' && c8 != '.' && c8 != '_'))) {
                z7 = true;
            } else {
                i7++;
                sb.append(c8);
            }
        }
        qVar.H(i7 - qVar.f2514b);
        return sb.toString();
    }

    public static String b(q qVar, StringBuilder sb) {
        c(qVar);
        if (qVar.a() == 0) {
            return null;
        }
        String a7 = a(qVar, sb);
        if (!StringUtils.EMPTY.equals(a7)) {
            return a7;
        }
        return StringUtils.EMPTY + ((char) qVar.u());
    }

    public static void c(q qVar) {
        while (true) {
            for (boolean z7 = true; qVar.a() > 0 && z7; z7 = false) {
                int i7 = qVar.f2514b;
                byte[] bArr = qVar.f2513a;
                byte b5 = bArr[i7];
                char c8 = (char) b5;
                if (c8 != '\t' && c8 != '\n' && c8 != '\f' && c8 != '\r' && c8 != ' ') {
                    int i8 = qVar.f2515c;
                    int i9 = i7 + 2;
                    if (i9 <= i8) {
                        int i10 = i7 + 1;
                        if (b5 == 47 && bArr[i10] == 42) {
                            while (true) {
                                int i11 = i9 + 1;
                                if (i11 >= i8) {
                                    break;
                                } else if (((char) bArr[i9]) == '*' && ((char) bArr[i11]) == '/') {
                                    i9 += 2;
                                    i8 = i9;
                                } else {
                                    i9 = i11;
                                }
                            }
                            qVar.H(i8 - qVar.f2514b);
                        }
                    }
                } else {
                    qVar.H(1);
                }
            }
            return;
        }
    }
}
