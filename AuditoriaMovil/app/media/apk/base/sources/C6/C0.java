package c6;

import h3.AbstractC1079a;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public abstract class C0 {

    /* renamed from: a  reason: collision with root package name */
    public static final long f8432a = TimeUnit.SECONDS.toNanos(1);

    public static void a(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!(list.get(i7) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i7), Integer.valueOf(i7), list));
            }
        }
    }

    public static Boolean b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List c(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List d(String str, Map map) {
        List c8 = c(str, map);
        if (c8 == null) {
            return null;
        }
        for (int i7 = 0; i7 < c8.size(); i7++) {
            if (!(c8.get(i7) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", c8.get(i7), Integer.valueOf(i7), c8));
            }
        }
        return c8;
    }

    public static Double e(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
            }
        }
        throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
    }

    public static Integer f(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            Double d7 = (Double) obj;
            int intValue = d7.intValue();
            if (intValue == d7.doubleValue()) {
                return Integer.valueOf(intValue);
            }
            throw new ClassCastException("Number expected to be integer: " + d7);
        } else if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        } else {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
        }
    }

    public static Map g(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static String h(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long i(String str, Map map) {
        String h8 = h(str, map);
        if (h8 == null) {
            return null;
        }
        try {
            return Long.valueOf(k(h8));
        } catch (ParseException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static long j(int i7, long j) {
        int i8;
        boolean z7;
        long j8 = i7;
        long j9 = f8432a;
        if (j8 <= (-j9) || j8 >= j9) {
            j = AbstractC1079a.f(j, j8 / j9);
            i7 = (int) (j8 % j9);
        }
        if (j > 0 && i7 < 0) {
            i7 = (int) (i7 + j9);
            j--;
        }
        if (j < 0 && i7 > 0) {
            i7 = (int) (i7 - j9);
            j++;
        }
        if (j >= -315576000000L && j <= 315576000000L) {
            long j10 = i7;
            if (j10 >= -999999999 && j10 < j9 && ((j >= 0 && i7 >= 0) || (i8 <= 0 && i7 <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j);
                long j11 = i7;
                long j12 = nanos + j11;
                int i9 = ((j11 ^ nanos) > 0L ? 1 : ((j11 ^ nanos) == 0L ? 0 : -1));
                boolean z8 = false;
                if (i9 < 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((nanos ^ j12) >= 0) {
                    z8 = true;
                }
                if (!(z7 | z8)) {
                    return ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
                }
                return j12;
            }
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i7 + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }

    public static long k(String str) {
        boolean z7;
        String str2;
        int i7;
        if (!str.isEmpty() && str.charAt(str.length() - 1) == 's') {
            if (str.charAt(0) == '-') {
                str = str.substring(1);
                z7 = true;
            } else {
                z7 = false;
            }
            String substring = str.substring(0, str.length() - 1);
            int indexOf = substring.indexOf(46);
            if (indexOf != -1) {
                str2 = substring.substring(indexOf + 1);
                substring = substring.substring(0, indexOf);
            } else {
                str2 = StringUtils.EMPTY;
            }
            long parseLong = Long.parseLong(substring);
            if (str2.isEmpty()) {
                i7 = 0;
            } else {
                i7 = 0;
                for (int i8 = 0; i8 < 9; i8++) {
                    i7 *= 10;
                    if (i8 < str2.length()) {
                        if (str2.charAt(i8) >= '0' && str2.charAt(i8) <= '9') {
                            i7 = (str2.charAt(i8) - '0') + i7;
                        } else {
                            throw new ParseException("Invalid nanoseconds.", 0);
                        }
                    }
                }
            }
            if (parseLong >= 0) {
                if (z7) {
                    parseLong = -parseLong;
                    i7 = -i7;
                }
                try {
                    return j(i7, parseLong);
                } catch (IllegalArgumentException unused) {
                    throw new ParseException("Duration value is out of range.", 0);
                }
            }
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        throw new ParseException("Invalid duration string: ".concat(str), 0);
    }
}
