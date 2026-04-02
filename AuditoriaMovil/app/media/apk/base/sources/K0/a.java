package K0;

import android.media.MediaFormat;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f2463a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f2464b = {StringUtils.EMPTY, "A", "B", "C"};

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2465c = new Object();

    public static void A(String str, String str2) {
        synchronized (f2465c) {
            Log.w(str, a(str2, null));
        }
    }

    public static void B(String str, String str2, Throwable th) {
        synchronized (f2465c) {
            Log.w(str, a(str2, th));
        }
    }

    public static String a(String str, Throwable th) {
        String replace;
        if (th == null) {
            replace = null;
        } else {
            synchronized (f2465c) {
                Throwable th2 = th;
                while (true) {
                    if (th2 != null) {
                        try {
                            if (th2 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th2 = th2.getCause();
                            }
                        } finally {
                        }
                    } else {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            return str + "\n  " + replace.replace("\n", "\n  ") + '\n';
        }
        return str;
    }

    public static String b(int i7, int i8, int i9) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
    }

    public static String c(int i7, boolean z7, int i8, int i9, int[] iArr, int i10) {
        char c8;
        String str = f2464b[i7];
        Integer valueOf = Integer.valueOf(i8);
        Integer valueOf2 = Integer.valueOf(i9);
        if (z7) {
            c8 = 'H';
        } else {
            c8 = 'L';
        }
        Object[] objArr = {str, valueOf, valueOf2, Character.valueOf(c8), Integer.valueOf(i10)};
        int i11 = x.f2529a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i12 = 0; i12 < length; i12++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i12])));
        }
        return sb.toString();
    }

    public static void d(String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void e(boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void f(String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new Exception(str);
    }

    public static void g(int i7, int i8) {
        if (i7 >= 0 && i7 < i8) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void h(Object obj) {
        obj.getClass();
    }

    public static void i(String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    public static void j(boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void k(Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void l(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void m(String str, String str2) {
        synchronized (f2465c) {
            Log.d(str, a(str2, null));
        }
    }

    public static void n(String str, String str2) {
        synchronized (f2465c) {
            Log.e(str, a(str2, null));
        }
    }

    public static void o(String str, String str2, Throwable th) {
        synchronized (f2465c) {
            Log.e(str, a(str2, th));
        }
    }

    public static String p(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            if (xmlPullParser.getAttributeName(i7).equals(str)) {
                return xmlPullParser.getAttributeValue(i7);
            }
        }
        return null;
    }

    public static int[] q(String str) {
        int i7;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i8 = indexOf4 + 2;
        if (i8 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i8) == '/') {
            i7 = str.indexOf(47, indexOf4 + 3);
            if (i7 == -1 || i7 > indexOf2) {
                i7 = indexOf2;
            }
        } else {
            i7 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i7;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static void r(String str, String str2) {
        synchronized (f2465c) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean s(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean t(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            return true;
        }
        return false;
    }

    public static boolean u(XmlPullParser xmlPullParser, String str) {
        if (t(xmlPullParser) && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static void v(MediaFormat mediaFormat, String str, int i7) {
        if (i7 != -1) {
            mediaFormat.setInteger(str, i7);
        }
    }

    public static String w(StringBuilder sb, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        if (i7 >= i8) {
            return sb.toString();
        }
        if (sb.charAt(i7) == '/') {
            i7++;
        }
        int i12 = i7;
        int i13 = i12;
        while (i12 <= i8) {
            if (i12 == i8) {
                i9 = i12;
            } else if (sb.charAt(i12) == '/') {
                i9 = i12 + 1;
            } else {
                i12++;
            }
            int i14 = i13 + 1;
            if (i12 == i14 && sb.charAt(i13) == '.') {
                sb.delete(i13, i9);
                i8 -= i9 - i13;
            } else {
                if (i12 == i13 + 2 && sb.charAt(i13) == '.' && sb.charAt(i14) == '.') {
                    i10 = sb.lastIndexOf("/", i13 - 2) + 1;
                    if (i10 > i7) {
                        i11 = i10;
                    } else {
                        i11 = i7;
                    }
                    sb.delete(i11, i9);
                    i8 -= i9 - i11;
                } else {
                    i10 = i12 + 1;
                }
                i13 = i10;
            }
            i12 = i13;
        }
        return sb.toString();
    }

    public static String x(String str, String str2) {
        int i7;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = StringUtils.EMPTY;
        }
        if (str2 == null) {
            str2 = StringUtils.EMPTY;
        }
        int[] q2 = q(str2);
        if (q2[0] != -1) {
            sb.append(str2);
            w(sb, q2[1], q2[2]);
            return sb.toString();
        }
        int[] q7 = q(str);
        if (q2[3] == 0) {
            sb.append((CharSequence) str, 0, q7[3]);
            sb.append(str2);
            return sb.toString();
        } else if (q2[2] == 0) {
            sb.append((CharSequence) str, 0, q7[2]);
            sb.append(str2);
            return sb.toString();
        } else {
            int i8 = q2[1];
            if (i8 != 0) {
                int i9 = q7[0] + 1;
                sb.append((CharSequence) str, 0, i9);
                sb.append(str2);
                return w(sb, q2[1] + i9, i9 + q2[2]);
            } else if (str2.charAt(i8) == '/') {
                sb.append((CharSequence) str, 0, q7[1]);
                sb.append(str2);
                int i10 = q7[1];
                return w(sb, i10, q2[2] + i10);
            } else {
                int i11 = q7[0] + 2;
                int i12 = q7[1];
                if (i11 < i12 && i12 == q7[2]) {
                    sb.append((CharSequence) str, 0, i12);
                    sb.append('/');
                    sb.append(str2);
                    int i13 = q7[1];
                    return w(sb, i13, q2[2] + i13 + 1);
                }
                int lastIndexOf = str.lastIndexOf(47, q7[2] - 1);
                if (lastIndexOf == -1) {
                    i7 = q7[1];
                } else {
                    i7 = lastIndexOf + 1;
                }
                sb.append((CharSequence) str, 0, i7);
                sb.append(str2);
                return w(sb, q7[1], i7 + q2[2]);
            }
        }
    }

    public static Uri y(String str, String str2) {
        return Uri.parse(x(str, str2));
    }

    public static void z(MediaFormat mediaFormat, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            mediaFormat.setByteBuffer(io.flutter.plugins.pathprovider.b.e(i7, "csd-"), ByteBuffer.wrap((byte[]) list.get(i7)));
        }
    }
}
