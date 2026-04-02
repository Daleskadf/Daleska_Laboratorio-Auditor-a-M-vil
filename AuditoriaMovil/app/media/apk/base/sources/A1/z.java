package a1;

import A3.AbstractC0021t;
import A3.K;
import A3.L;
import A3.e0;
import A3.t0;
import H0.J;
import H4.e1;
import android.net.Uri;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f6925a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f6926b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f6927c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f6928d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f6929e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");
    public static final Pattern f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* renamed from: g  reason: collision with root package name */
    public static final String f6930g = new String(new byte[]{10});

    /* renamed from: h  reason: collision with root package name */
    public static final String f6931h = new String(new byte[]{13, 10});

    public static int a(String str) {
        str.getClass();
        char c8 = 65535;
        switch (str.hashCode()) {
            case -1881579439:
                if (str.equals("RECORD")) {
                    c8 = 0;
                    break;
                }
                break;
            case -880847356:
                if (str.equals("TEARDOWN")) {
                    c8 = 1;
                    break;
                }
                break;
            case -702888512:
                if (str.equals("GET_PARAMETER")) {
                    c8 = 2;
                    break;
                }
                break;
            case -531492226:
                if (str.equals("OPTIONS")) {
                    c8 = 3;
                    break;
                }
                break;
            case -84360524:
                if (str.equals("PLAY_NOTIFY")) {
                    c8 = 4;
                    break;
                }
                break;
            case 2458420:
                if (str.equals("PLAY")) {
                    c8 = 5;
                    break;
                }
                break;
            case 6481884:
                if (str.equals("REDIRECT")) {
                    c8 = 6;
                    break;
                }
                break;
            case 71242700:
                if (str.equals("SET_PARAMETER")) {
                    c8 = 7;
                    break;
                }
                break;
            case 75902422:
                if (str.equals("PAUSE")) {
                    c8 = '\b';
                    break;
                }
                break;
            case 78791261:
                if (str.equals("SETUP")) {
                    c8 = '\t';
                    break;
                }
                break;
            case 133006441:
                if (str.equals("ANNOUNCE")) {
                    c8 = '\n';
                    break;
                }
                break;
            case 1800840907:
                if (str.equals("DESCRIBE")) {
                    c8 = 11;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                return 8;
            case 1:
                return 12;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 7;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 11;
            case '\b':
                return 5;
            case '\t':
                return 10;
            case '\n':
                return 1;
            case 11:
                return 2;
            default:
                return 0;
        }
    }

    public static e0 b(String str) {
        if (str == null) {
            A3.I i7 = K.f98b;
            return e0.f138e;
        }
        AbstractC0021t.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i8 = K0.x.f2529a;
        int i9 = 0;
        for (String str2 : str.split(",\\s?", -1)) {
            int a7 = a(str2);
            if (a7 != 0) {
                Integer valueOf = Integer.valueOf(a7);
                int i10 = i9 + 1;
                if (objArr.length < i10) {
                    objArr = Arrays.copyOf(objArr, A3.E.e(objArr.length, i10));
                }
                objArr[i9] = valueOf;
                i9 = i10;
            }
        }
        return K.n(i9, objArr);
    }

    public static J2.e c(String str) {
        long parseInt;
        Matcher matcher = f6928d.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            if (group2 != null) {
                try {
                    parseInt = Integer.parseInt(group2) * 1000;
                } catch (NumberFormatException e7) {
                    throw J.b(str, e7);
                }
            } else {
                parseInt = 60000;
            }
            return new J2.e(group, parseInt, 4);
        }
        throw J.b(str, null);
    }

    public static S0.t d(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
            return null;
        }
        int i7 = K0.x.f2529a;
        String[] split = userInfo.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, 2);
        return new S0.t(split[0], split[1], 1);
    }

    public static K0.o e(String str) {
        Matcher matcher = f6929e.matcher(str);
        boolean find = matcher.find();
        String str2 = StringUtils.EMPTY;
        if (find) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(3);
            group2.getClass();
            String group3 = matcher.group(4);
            if (group3 != null) {
                str2 = group3;
            }
            return new K0.o(2, group, group2, str2);
        }
        Matcher matcher2 = f.matcher(str);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            return new K0.o(1, group4, StringUtils.EMPTY, StringUtils.EMPTY);
        }
        throw J.b("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri f(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String authority = uri.getAuthority();
        authority.getClass();
        K0.a.e(authority.contains("@"));
        int i7 = K0.x.f2529a;
        return uri.buildUpon().encodedAuthority(authority.split("@", -1)[1]).build();
    }

    public static e0 g(C0416B c0416b) {
        boolean z7;
        if (c0416b.f6747c.c("CSeq") != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        A3.H h8 = new A3.H();
        h8.c(K0.x.o("%s %s %s", h(c0416b.f6746b), c0416b.f6745a, "RTSP/1.0"));
        L a7 = c0416b.f6747c.a();
        t0 it = a7.e().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            K d7 = a7.d(str);
            for (int i7 = 0; i7 < d7.size(); i7++) {
                h8.c(K0.x.o("%s: %s", str, d7.get(i7)));
            }
        }
        h8.c(StringUtils.EMPTY);
        h8.c(c0416b.f6748d);
        return h8.g();
    }

    public static String h(int i7) {
        switch (i7) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
