package K0;

import A3.K;
import B5.S;
import H0.I;
import H0.J;
import H4.e1;
import H4.p1;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h3.AbstractC1079a;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.XMLReaderUtils;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public static final int f2529a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f2530b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f2531c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f2532d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f2533e;
    public static final byte[] f;

    /* renamed from: g  reason: collision with root package name */
    public static final long[] f2534g;

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f2535h;

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f2536i;
    public static final Pattern j;

    /* renamed from: k  reason: collision with root package name */
    public static HashMap f2537k;

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f2538l;

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f2539m;

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f2540n;

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f2541o;

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f2542p;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f2529a = i7;
        String str = Build.DEVICE;
        f2530b = str;
        String str2 = Build.MANUFACTURER;
        f2531c = str2;
        String str3 = Build.MODEL;
        f2532d = str3;
        f2533e = str + ", " + str3 + ", " + str2 + ", " + i7;
        f = new byte[0];
        f2534g = new long[0];
        f2535h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f2536i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f2538l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f2539m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f2540n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f2541o = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f2542p = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, RecognitionOptions.ITF, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static int A(int i7) {
        if (i7 != 8) {
            if (i7 != 16) {
                if (i7 != 24) {
                    if (i7 != 32) {
                        return 0;
                    }
                    return 22;
                }
                return 21;
            }
            return 2;
        }
        return 3;
    }

    public static int B(int i7, int i8) {
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    if (i7 != 21) {
                        if (i7 != 22) {
                            if (i7 != 268435456) {
                                if (i7 != 1342177280) {
                                    if (i7 != 1610612736) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                    return i8 * 3;
                }
                return i8 * 4;
            }
            return i8;
        }
        return i8 * 2;
    }

    public static long C(long j8, float f4) {
        if (f4 == 1.0f) {
            return j8;
        }
        return Math.round(j8 / f4);
    }

    public static String[] D() {
        String locale;
        String[] strArr;
        LocaleList locales;
        String languageTags;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i7 = f2529a;
        if (i7 >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            strArr = languageTags.split(",", -1);
        } else {
            Locale locale2 = configuration.locale;
            if (i7 >= 21) {
                locale = locale2.toLanguageTag();
            } else {
                locale = locale2.toString();
            }
            strArr = new String[]{locale};
        }
        for (int i8 = 0; i8 < strArr.length; i8++) {
            strArr[i8] = N(strArr[i8]);
        }
        return strArr;
    }

    public static String E(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e7) {
            a.o("Util", "Failed to read system property ".concat(str), e7);
            return null;
        }
    }

    public static String F(int i7) {
        switch (i7) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return ExternalParsersConfigReaderMetKeys.METADATA_TAG;
            case 6:
                return "camera motion";
            default:
                if (i7 >= 10000) {
                    return io.flutter.plugins.pathprovider.b.f("custom (", i7, ")");
                }
                return "?";
        }
    }

    public static int G(Uri uri, String str) {
        int i7;
        char c8 = 65535;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme != null && AbstractC1740d.m("rtsp", scheme)) {
                return 3;
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int lastIndexOf = lastPathSegment.lastIndexOf(46);
                if (lastIndexOf >= 0) {
                    String A7 = AbstractC1740d.A(lastPathSegment.substring(lastIndexOf + 1));
                    A7.getClass();
                    switch (A7.hashCode()) {
                        case 104579:
                            if (A7.equals("ism")) {
                                c8 = 0;
                                break;
                            }
                            break;
                        case 108321:
                            if (A7.equals("mpd")) {
                                c8 = 1;
                                break;
                            }
                            break;
                        case 3242057:
                            if (A7.equals("isml")) {
                                c8 = 2;
                                break;
                            }
                            break;
                        case 3299913:
                            if (A7.equals("m3u8")) {
                                c8 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c8) {
                        case 0:
                        case 2:
                            i7 = 1;
                            break;
                        case 1:
                            i7 = 0;
                            break;
                        case 3:
                            i7 = 2;
                            break;
                        default:
                            i7 = 4;
                            break;
                    }
                    if (i7 != 4) {
                        return i7;
                    }
                }
                String path = uri.getPath();
                path.getClass();
                Matcher matcher = j.matcher(path);
                if (matcher.matches()) {
                    String group = matcher.group(2);
                    if (group == null) {
                        return 1;
                    }
                    if (group.contains("format=mpd-time-csf")) {
                        return 0;
                    }
                    if (!group.contains("format=m3u8-aapl")) {
                        return 1;
                    }
                    return 2;
                }
            }
            return 4;
        }
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c8 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c8 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c8 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c8 = 3;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    public static void H(int i7) {
        Integer.toString(i7, 36);
    }

    public static boolean I(int i7) {
        if (i7 != 3 && i7 != 2 && i7 != 268435456 && i7 != 21 && i7 != 1342177280 && i7 != 22 && i7 != 1610612736 && i7 != 4) {
            return false;
        }
        return true;
    }

    public static boolean J(Context context) {
        int i7 = f2529a;
        if (i7 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i7 == 30) {
                String str = f2532d;
                if (AbstractC1740d.m(str, "moto g(20)") || AbstractC1740d.m(str, "rmx3231")) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean K(int i7) {
        if (i7 != 10 && i7 != 13) {
            return false;
        }
        return true;
    }

    public static boolean L(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static long M(long j8) {
        if (j8 != -9223372036854775807L && j8 != Long.MIN_VALUE) {
            return j8 * 1000;
        }
        return j8;
    }

    public static String N(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String A7 = AbstractC1740d.A(str);
        int i7 = 0;
        String str2 = A7.split("-", 2)[0];
        if (f2537k == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f2538l;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i8 = 0; i8 < strArr.length; i8 += 2) {
                hashMap.put(strArr[i8], strArr[i8 + 1]);
            }
            f2537k = hashMap;
        }
        String str4 = (String) f2537k.get(str2);
        if (str4 != null) {
            StringBuilder l8 = Y.l(str4);
            l8.append(A7.substring(str2.length()));
            A7 = l8.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return A7;
        }
        while (true) {
            String[] strArr2 = f2539m;
            if (i7 < strArr2.length) {
                if (A7.startsWith(strArr2[i7])) {
                    return strArr2[i7 + 1] + A7.substring(strArr2[i7].length());
                }
                i7 += 2;
            } else {
                return A7;
            }
        }
    }

    public static Object[] O(int i7, Object[] objArr) {
        boolean z7;
        if (i7 <= objArr.length) {
            z7 = true;
        } else {
            z7 = false;
        }
        a.e(z7);
        return Arrays.copyOf(objArr, i7);
    }

    public static long P(String str) {
        Matcher matcher = f2535h.matcher(str);
        if (matcher.matches()) {
            int i7 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i7 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                if ("-".equals(matcher.group(11))) {
                    i7 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i7 != 0) {
                return timeInMillis - (i7 * 60000);
            }
            return timeInMillis;
        }
        throw J.a(null, "Invalid date/time format: " + str);
    }

    public static void Q(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void R(ArrayList arrayList, int i7, int i8) {
        if (i7 >= 0 && i8 <= arrayList.size() && i7 <= i8) {
            if (i7 != i8) {
                arrayList.subList(i7, i8).clear();
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static long S(int i7, long j8) {
        return U(j8, 1000000L, i7, RoundingMode.FLOOR);
    }

    public static void T(long[] jArr, long j8) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i7 = (j8 > 1000000L ? 1 : (j8 == 1000000L ? 0 : -1));
        int i8 = 0;
        if (i7 >= 0 && j8 % 1000000 == 0) {
            long g3 = AbstractC1079a.g(j8, 1000000L, RoundingMode.UNNECESSARY);
            while (i8 < jArr.length) {
                jArr[i8] = AbstractC1079a.g(jArr[i8], g3, roundingMode);
                i8++;
            }
        } else if (i7 < 0 && 1000000 % j8 == 0) {
            long g4 = AbstractC1079a.g(1000000L, j8, RoundingMode.UNNECESSARY);
            while (i8 < jArr.length) {
                jArr[i8] = AbstractC1079a.t(jArr[i8], g4);
                i8++;
            }
        } else {
            for (int i9 = 0; i9 < jArr.length; i9++) {
                long j9 = jArr[i9];
                if (j9 != 0) {
                    int i10 = (j8 > j9 ? 1 : (j8 == j9 ? 0 : -1));
                    if (i10 >= 0 && j8 % j9 == 0) {
                        jArr[i9] = AbstractC1079a.g(1000000L, AbstractC1079a.g(j8, j9, RoundingMode.UNNECESSARY), roundingMode);
                    } else if (i10 < 0 && j9 % j8 == 0) {
                        jArr[i9] = AbstractC1079a.t(1000000L, AbstractC1079a.g(j9, j8, RoundingMode.UNNECESSARY));
                    } else {
                        jArr[i9] = V(j9, 1000000L, j8, roundingMode);
                    }
                }
            }
        }
    }

    public static long U(long j8, long j9, long j10, RoundingMode roundingMode) {
        if (j8 == 0 || j9 == 0) {
            return 0L;
        }
        int i7 = (j10 > j9 ? 1 : (j10 == j9 ? 0 : -1));
        if (i7 >= 0 && j10 % j9 == 0) {
            return AbstractC1079a.g(j8, AbstractC1079a.g(j10, j9, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i7 < 0 && j9 % j10 == 0) {
            return AbstractC1079a.t(j8, AbstractC1079a.g(j9, j10, RoundingMode.UNNECESSARY));
        }
        int i8 = (j10 > j8 ? 1 : (j10 == j8 ? 0 : -1));
        if (i8 >= 0 && j10 % j8 == 0) {
            return AbstractC1079a.g(j9, AbstractC1079a.g(j10, j8, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i8 < 0 && j8 % j10 == 0) {
            return AbstractC1079a.t(j9, AbstractC1079a.g(j8, j10, RoundingMode.UNNECESSARY));
        }
        return V(j8, j9, j10, roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
        if (java.lang.Math.abs(r9 - r2) == 0.5d) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long V(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.x.V(long, long, long, java.math.RoundingMode):long");
    }

    public static String[] W(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] X(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.trim().split("(\\s*,\\s*)", -1);
    }

    public static String Y(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i7 = 0; i7 < bArr.length; i7++) {
            sb.append(Character.forDigit((bArr[i7] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i7] & 15, 16));
        }
        return sb.toString();
    }

    public static long Z(long j8) {
        if (j8 != -9223372036854775807L && j8 != Long.MIN_VALUE) {
            return j8 / 1000;
        }
        return j8;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int b(long[] jArr, long j8, boolean z7) {
        int i7;
        int binarySearch = Arrays.binarySearch(jArr, j8);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i7 = binarySearch + 1;
            if (i7 >= jArr.length || jArr[i7] != j8) {
                break;
            }
            binarySearch = i7;
        }
        if (z7) {
            return binarySearch;
        }
        return i7;
    }

    public static int c(K k2, Long l8, boolean z7) {
        int i7;
        int binarySearch = Collections.binarySearch(k2, l8);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            while (true) {
                int i8 = binarySearch - 1;
                if (i8 < 0 || ((Comparable) k2.get(i8)).compareTo(l8) != 0) {
                    break;
                }
                binarySearch = i8;
            }
            i7 = binarySearch;
        }
        if (z7) {
            return Math.max(0, i7);
        }
        return i7;
    }

    public static int d(S s7, long j8) {
        int i7 = s7.f335b - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            if (s7.e(i9) < j8) {
                i8 = i9 + 1;
            } else {
                i7 = i9 - 1;
            }
        }
        int i10 = i7 + 1;
        if (i10 < s7.f335b && s7.e(i10) == j8) {
            return i10;
        }
        if (i7 == -1) {
            return 0;
        }
        return i7;
    }

    public static int e(int[] iArr, int i7, boolean z7, boolean z8) {
        int i8;
        int i9;
        int binarySearch = Arrays.binarySearch(iArr, i7);
        if (binarySearch < 0) {
            i9 = -(binarySearch + 2);
        } else {
            while (true) {
                i8 = binarySearch - 1;
                if (i8 < 0 || iArr[i8] != i7) {
                    break;
                }
                binarySearch = i8;
            }
            if (z7) {
                i9 = binarySearch;
            } else {
                i9 = i8;
            }
        }
        if (z8) {
            return Math.max(0, i9);
        }
        return i9;
    }

    public static int f(long[] jArr, long j8, boolean z7) {
        int i7;
        int binarySearch = Arrays.binarySearch(jArr, j8);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            while (true) {
                int i8 = binarySearch - 1;
                if (i8 < 0 || jArr[i8] != j8) {
                    break;
                }
                binarySearch = i8;
            }
            i7 = binarySearch;
        }
        if (z7) {
            return Math.max(0, i7);
        }
        return i7;
    }

    public static int g(int i7, int i8) {
        return ((i7 + i8) - 1) / i8;
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float i(float f4, float f8, float f9) {
        return Math.max(f8, Math.min(f4, f9));
    }

    public static int j(int i7, int i8, int i9) {
        return Math.max(i8, Math.min(i7, i9));
    }

    public static long k(long j8, long j9, long j10) {
        return Math.max(j9, Math.min(j8, j10));
    }

    public static boolean l(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int m(int i7, byte[] bArr, int i8, int i9) {
        while (i7 < i8) {
            i9 = f2540n[((i9 >>> 24) ^ (bArr[i7] & 255)) & 255] ^ (i9 << 8);
            i7++;
        }
        return i9;
    }

    public static Handler n(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        a.k(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String o(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String p(byte[] bArr) {
        return new String(bArr, z3.h.f16886c);
    }

    public static int q(int i7) {
        if (i7 == 20) {
            return 30;
        }
        if (i7 != 22) {
            if (i7 != 30) {
                switch (i7) {
                    case 2:
                    case 3:
                        return 3;
                    case 4:
                    case 5:
                    case 6:
                        return 21;
                    case 7:
                    case 8:
                        return 23;
                    case 9:
                    case 10:
                    case 11:
                    case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        return 28;
                    default:
                        switch (i7) {
                            case 14:
                                return 25;
                            case 15:
                            case RecognitionOptions.DATA_MATRIX /* 16 */:
                            case 17:
                            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                return 28;
                            default:
                                return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                        }
                }
            }
            return 34;
        }
        return 31;
    }

    public static AudioFormat r(int i7, int i8, int i9) {
        return new AudioFormat.Builder().setSampleRate(i7).setChannelMask(i8).setEncoding(i9).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int s(int i7) {
        switch (i7) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                break;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (f2529a >= 32) {
                    return 737532;
                }
                break;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return 743676;
        }
        return 6396;
    }

    public static byte[] t(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 * 2;
            bArr[i7] = (byte) (Character.digit(str.charAt(i8 + 1), 16) + (Character.digit(str.charAt(i8), 16) << 4));
        }
        return bArr;
    }

    public static int u(int i7, String str) {
        int i8 = 0;
        for (String str2 : X(str)) {
            if (i7 == I.g(I.c(str2))) {
                i8++;
            }
        }
        return i8;
    }

    public static String v(int i7, String str) {
        String[] X7 = X(str);
        if (X7.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : X7) {
            if (i7 == I.g(I.c(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() <= 0) {
            return null;
        }
        return sb.toString();
    }

    public static int w(int i7) {
        if (i7 != 2 && i7 != 4) {
            if (i7 != 10) {
                if (i7 != 7) {
                    if (i7 != 8) {
                        switch (i7) {
                            case 15:
                                return 6003;
                            case RecognitionOptions.DATA_MATRIX /* 16 */:
                            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                return 6005;
                            case 17:
                            case 19:
                            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            case 21:
                            case 22:
                                return 6004;
                            default:
                                switch (i7) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return 6003;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }

    public static int x(String str) {
        String[] split;
        int length;
        boolean z7;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z7 = true;
        } else {
            z7 = false;
        }
        try {
            str2.getClass();
            int parseInt = Integer.parseInt(str2);
            if (z7) {
                return -parseInt;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long y(long j8, float f4) {
        if (f4 == 1.0f) {
            return j8;
        }
        return Math.round(j8 * f4);
    }

    public static long z(long j8) {
        if (j8 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j8 + SystemClock.elapsedRealtime();
    }
}
