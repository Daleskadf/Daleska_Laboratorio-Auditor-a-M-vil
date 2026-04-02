package H0;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList f1694a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f1695b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] X7 = K0.x.X(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : X7) {
            if (str2.equals(c(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() <= 0) {
            return null;
        }
        return sb.toString();
    }

    public static int b(String str, String str2) {
        C0132l e7;
        str.getClass();
        char c8 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c8 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c8 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c8 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c8 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c8 = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c8 = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c8 = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c8 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c8 = '\b';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c8 = '\t';
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c8 = '\n';
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c8 = 11;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (e7 = e(str2)) == null) {
                    return 0;
                }
                return e7.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case '\b':
                return 9;
            case '\t':
                return 20;
            case '\n':
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        C0132l e7;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String A7 = AbstractC1740d.A(str.trim());
        if (!A7.startsWith("avc1") && !A7.startsWith("avc3")) {
            if (!A7.startsWith("hev1") && !A7.startsWith("hvc1")) {
                if (!A7.startsWith("dvav") && !A7.startsWith("dva1") && !A7.startsWith("dvhe") && !A7.startsWith("dvh1")) {
                    if (A7.startsWith("av01")) {
                        return "video/av01";
                    }
                    if (!A7.startsWith("vp9") && !A7.startsWith("vp09")) {
                        if (!A7.startsWith("vp8") && !A7.startsWith("vp08")) {
                            if (A7.startsWith("mp4a")) {
                                if (A7.startsWith("mp4a.") && (e7 = e(A7)) != null) {
                                    str2 = d(e7.f1818b);
                                }
                                if (str2 == null) {
                                    return "audio/mp4a-latm";
                                }
                                return str2;
                            } else if (A7.startsWith("mha1")) {
                                return "audio/mha1";
                            } else {
                                if (A7.startsWith("mhm1")) {
                                    return "audio/mhm1";
                                }
                                if (!A7.startsWith("ac-3") && !A7.startsWith("dac3")) {
                                    if (!A7.startsWith("ec-3") && !A7.startsWith("dec3")) {
                                        if (A7.startsWith("ec+3")) {
                                            return "audio/eac3-joc";
                                        }
                                        if (!A7.startsWith("ac-4") && !A7.startsWith("dac4")) {
                                            if (A7.startsWith("dtsc")) {
                                                return "audio/vnd.dts";
                                            }
                                            if (A7.startsWith("dtse")) {
                                                return "audio/vnd.dts.hd;profile=lbr";
                                            }
                                            if (!A7.startsWith("dtsh") && !A7.startsWith("dtsl")) {
                                                if (A7.startsWith("dtsx")) {
                                                    return "audio/vnd.dts.uhd;profile=p2";
                                                }
                                                if (A7.startsWith("opus")) {
                                                    return "audio/opus";
                                                }
                                                if (A7.startsWith("vorbis")) {
                                                    return "audio/vorbis";
                                                }
                                                if (A7.startsWith("flac")) {
                                                    return "audio/flac";
                                                }
                                                if (A7.startsWith("stpp")) {
                                                    return "application/ttml+xml";
                                                }
                                                if (A7.startsWith("wvtt")) {
                                                    return "text/vtt";
                                                }
                                                if (A7.contains("cea708")) {
                                                    return "application/cea-708";
                                                }
                                                if (!A7.contains("eia608") && !A7.contains("cea608")) {
                                                    ArrayList arrayList = f1694a;
                                                    if (arrayList.size() <= 0) {
                                                        return null;
                                                    }
                                                    arrayList.get(0).getClass();
                                                    throw new ClassCastException();
                                                }
                                                return "application/cea-608";
                                            }
                                            return "audio/vnd.dts.hd";
                                        }
                                        return "audio/ac4";
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                        }
                        return "video/x-vnd.on2.vp8";
                    }
                    return "video/x-vnd.on2.vp9";
                }
                return "video/dolby-vision";
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    public static String d(int i7) {
        if (i7 != 32) {
            if (i7 != 33) {
                if (i7 != 35) {
                    if (i7 != 64) {
                        if (i7 != 163) {
                            if (i7 != 177) {
                                if (i7 != 221) {
                                    if (i7 != 165) {
                                        if (i7 != 166) {
                                            switch (i7) {
                                                case 96:
                                                case 97:
                                                case 98:
                                                case 99:
                                                case 100:
                                                case 101:
                                                    return "video/mpeg2";
                                                case 102:
                                                case 103:
                                                case 104:
                                                    return "audio/mp4a-latm";
                                                case 105:
                                                case 107:
                                                    return "audio/mpeg";
                                                case 106:
                                                    return "video/mpeg";
                                                case 108:
                                                    return "image/jpeg";
                                                default:
                                                    switch (i7) {
                                                        case 169:
                                                        case 172:
                                                            return "audio/vnd.dts";
                                                        case 170:
                                                        case 171:
                                                            return "audio/vnd.dts.hd";
                                                        case 173:
                                                            return "audio/opus";
                                                        case 174:
                                                            return "audio/ac4";
                                                        default:
                                                            return null;
                                                    }
                                            }
                                        }
                                        return "audio/eac3";
                                    }
                                    return "audio/ac3";
                                }
                                return "audio/vorbis";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    public static C0132l e(String str) {
        int i7;
        Matcher matcher = f1695b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(group, 16);
            if (group2 != null) {
                i7 = Integer.parseInt(group2);
            } else {
                i7 = 0;
            }
            return new C0132l(parseInt, i7, 1);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String f(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (k(str)) {
            return 2;
        }
        if (j(str)) {
            return 3;
        }
        if (i(str)) {
            return 4;
        }
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
            if ("application/x-camera-motion".equals(str)) {
                return 6;
            }
            ArrayList arrayList = f1694a;
            if (arrayList.size() <= 0) {
                return -1;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        return 5;
    }

    public static boolean h(String str) {
        return "audio".equals(f(str));
    }

    public static boolean i(String str) {
        if (!"image".equals(f(str)) && !"application/x-image-uri".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean j(String str) {
        if (!"text".equals(f(str)) && !"application/x-media3-cues".equals(str) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean k(String str) {
        return "video".equals(f(str));
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        String A7 = AbstractC1740d.A(str);
        A7.getClass();
        char c8 = 65535;
        switch (A7.hashCode()) {
            case -1007807498:
                if (A7.equals("audio/x-flac")) {
                    c8 = 0;
                    break;
                }
                break;
            case -979095690:
                if (A7.equals("application/x-mpegurl")) {
                    c8 = 1;
                    break;
                }
                break;
            case -586683234:
                if (A7.equals("audio/x-wav")) {
                    c8 = 2;
                    break;
                }
                break;
            case -432836268:
                if (A7.equals("audio/mpeg-l1")) {
                    c8 = 3;
                    break;
                }
                break;
            case -432836267:
                if (A7.equals("audio/mpeg-l2")) {
                    c8 = 4;
                    break;
                }
                break;
            case 187090231:
                if (A7.equals("audio/mp3")) {
                    c8 = 5;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                return "audio/flac";
            case 1:
                return "application/x-mpegURL";
            case 2:
                return "audio/wav";
            case 3:
                return "audio/mpeg-L1";
            case 4:
                return "audio/mpeg-L2";
            case 5:
                return "audio/mpeg";
            default:
                return A7;
        }
    }
}
