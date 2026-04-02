package R1;

import K0.q;
import K0.x;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f4676a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f4677b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c  reason: collision with root package name */
    public static final Map f4678c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map f4679d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f4678c = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f4679d = DesugarCollections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, e eVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c8;
        char c9;
        char c10;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = eVar.f4662b;
        int length = spannableStringBuilder.length();
        String str2 = eVar.f4661a;
        str2.getClass();
        int i12 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals(StringUtils.EMPTY)) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i11, length, 33);
                break;
            case 2:
                for (String str3 : eVar.f4664d) {
                    Map map = f4678c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i11, length, 33);
                    } else {
                        Map map2 = f4679d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i11, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
                break;
            case 7:
                int c11 = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.f4658c);
                int i13 = eVar.f4662b;
                int i14 = 0;
                int i15 = 0;
                while (i14 < arrayList.size()) {
                    if ("rt".equals(((d) arrayList.get(i14)).f4659a.f4661a)) {
                        d dVar = (d) arrayList.get(i14);
                        int c12 = c(list2, str, dVar.f4659a);
                        if (c12 == i12) {
                            if (c11 != i12) {
                                c12 = c11;
                            } else {
                                c12 = 1;
                            }
                        }
                        int i16 = dVar.f4659a.f4662b - i15;
                        int i17 = dVar.f4660b - i15;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i16, i17);
                        spannableStringBuilder.delete(i16, i17);
                        spannableStringBuilder.setSpan(new J0.f(subSequence.toString(), c12), i13, i16, 33);
                        i15 = subSequence.length() + i15;
                        i13 = i16;
                    }
                    i14++;
                    i12 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b5 = b(list2, str, eVar);
        for (int i18 = 0; i18 < b5.size(); i18++) {
            b bVar = ((f) b5.get(i18)).f4666b;
            int i19 = bVar.f4649k;
            if (i19 == -1 && bVar.f4650l == -1) {
                i7 = -1;
            } else {
                if (i19 == 1) {
                    c9 = 1;
                } else {
                    c9 = 0;
                }
                if (bVar.f4650l == 1) {
                    c10 = 2;
                } else {
                    c10 = 0;
                }
                i7 = c10 | c9;
            }
            if (i7 != -1) {
                int i20 = bVar.f4649k;
                if (i20 == -1 && bVar.f4650l == -1) {
                    i10 = -1;
                } else {
                    if (i20 == 1) {
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    if (bVar.f4650l == 1) {
                        i9 = 2;
                    } else {
                        i9 = 0;
                    }
                    i10 = i8 | i9;
                }
                F.f.e(spannableStringBuilder, new StyleSpan(i10), i11, length);
            }
            if (bVar.j == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
            }
            if (bVar.f4646g) {
                if (bVar.f4646g) {
                    F.f.e(spannableStringBuilder, new ForegroundColorSpan(bVar.f), i11, length);
                } else {
                    throw new IllegalStateException("Font color not defined");
                }
            }
            if (bVar.f4648i) {
                if (bVar.f4648i) {
                    F.f.e(spannableStringBuilder, new BackgroundColorSpan(bVar.f4647h), i11, length);
                } else {
                    throw new IllegalStateException("Background color not defined.");
                }
            }
            if (bVar.f4645e != null) {
                F.f.e(spannableStringBuilder, new TypefaceSpan(bVar.f4645e), i11, length);
            }
            int i21 = bVar.f4651m;
            if (i21 != 1) {
                if (i21 != 2) {
                    if (i21 == 3) {
                        F.f.e(spannableStringBuilder, new RelativeSizeSpan(bVar.f4652n / 100.0f), i11, length);
                    }
                } else {
                    F.f.e(spannableStringBuilder, new RelativeSizeSpan(bVar.f4652n), i11, length);
                }
            } else {
                F.f.e(spannableStringBuilder, new AbsoluteSizeSpan((int) bVar.f4652n, true), i11, length);
            }
            if (bVar.f4654p) {
                spannableStringBuilder.setSpan(new Object(), i11, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, e eVar) {
        int i7;
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            b bVar = (b) list.get(i8);
            String str2 = eVar.f4661a;
            if (bVar.f4641a.isEmpty() && bVar.f4642b.isEmpty() && bVar.f4643c.isEmpty() && bVar.f4644d.isEmpty()) {
                i7 = TextUtils.isEmpty(str2);
            } else {
                int a7 = b.a(bVar.f4644d, b.a(bVar.f4642b, b.a(bVar.f4641a, 0, 1073741824, str), 2, str2), 4, eVar.f4663c);
                if (a7 != -1) {
                    if (eVar.f4664d.containsAll(bVar.f4643c)) {
                        i7 = a7 + (bVar.f4643c.size() * 4);
                    }
                }
                i7 = 0;
            }
            if (i7 > 0) {
                arrayList.add(new f(i7, bVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList b5 = b(list, str, eVar);
        for (int i7 = 0; i7 < b5.size(); i7++) {
            int i8 = ((f) b5.get(i7)).f4666b.f4653o;
            if (i8 != -1) {
                return i8;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, q qVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String group = matcher.group(1);
            group.getClass();
            gVar.f4667a = i.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            gVar.f4668b = i.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, gVar);
            StringBuilder sb = new StringBuilder();
            qVar.getClass();
            String i7 = qVar.i(z3.h.f16886c);
            while (!TextUtils.isEmpty(i7)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(i7.trim());
                i7 = qVar.i(z3.h.f16886c);
            }
            gVar.f4669c = f(str, arrayList, sb.toString());
            return new c(gVar.a().a(), gVar.f4667a, gVar.f4668b);
        } catch (NumberFormatException unused) {
            K0.a.A("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, g gVar) {
        char c8;
        int i7;
        char c9;
        int i8;
        int i9;
        Matcher matcher = f4677b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    g(group2, gVar);
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c8 = 1;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c8 = 2;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c8 = 3;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c8 = 4;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c8 = 5;
                                break;
                            }
                            c8 = 65535;
                            break;
                        default:
                            c8 = 65535;
                            break;
                    }
                    switch (c8) {
                        case 0:
                        case 1:
                            i7 = 2;
                            break;
                        case 2:
                            i7 = 3;
                            break;
                        case 3:
                            i7 = 4;
                            break;
                        case 4:
                            i7 = 5;
                            break;
                        case 5:
                            i7 = 1;
                            break;
                        default:
                            K0.a.A("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i7 = 2;
                            break;
                    }
                    gVar.f4670d = i7;
                } else if ("position".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        substring.getClass();
                        switch (substring.hashCode()) {
                            case -1842484672:
                                if (substring.equals("line-left")) {
                                    c9 = 0;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c9 = 1;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            case -1276788989:
                                if (substring.equals("line-right")) {
                                    c9 = 2;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c9 = 3;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c9 = 4;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c9 = 5;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            default:
                                c9 = 65535;
                                break;
                        }
                        switch (c9) {
                            case 0:
                            case 5:
                                i8 = 0;
                                break;
                            case 1:
                            case 3:
                                i8 = 1;
                                break;
                            case 2:
                            case 4:
                                i8 = 2;
                                break;
                            default:
                                K0.a.A("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                i8 = Integer.MIN_VALUE;
                                break;
                        }
                        gVar.f4674i = i8;
                        group2 = group2.substring(0, indexOf);
                    }
                    gVar.f4673h = i.b(group2);
                } else if ("size".equals(group)) {
                    gVar.j = i.b(group2);
                } else if ("vertical".equals(group)) {
                    if (!group2.equals("lr")) {
                        if (!group2.equals("rl")) {
                            K0.a.A("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i9 = Integer.MIN_VALUE;
                        } else {
                            i9 = 1;
                        }
                    } else {
                        i9 = 2;
                    }
                    gVar.f4675k = i9;
                } else {
                    K0.a.A("WebvttCueParser", "Unknown cue setting " + group + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + group2);
                }
            } catch (NumberFormatException unused) {
                K0.a.A("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static SpannedString f(String str, List list, String str2) {
        int i7;
        int i8;
        char c8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char c9;
        int i14 = -1;
        int i15 = 2;
        int i16 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i17 = 0;
        while (true) {
            int length = str2.length();
            String str3 = StringUtils.EMPTY;
            if (i17 < length) {
                char charAt = str2.charAt(i17);
                if (charAt != '&') {
                    if (charAt != '<') {
                        spannableStringBuilder.append(charAt);
                        i17 += i16;
                    } else {
                        int i18 = i17 + 1;
                        if (i18 >= str2.length()) {
                            i17 = i18;
                        } else {
                            if (str2.charAt(i18) == '/') {
                                i9 = i16;
                            } else {
                                i9 = 0;
                            }
                            int indexOf = str2.indexOf(62, i18);
                            if (indexOf == i14) {
                                i10 = str2.length();
                            } else {
                                i10 = indexOf + i16;
                            }
                            int i19 = i10 - 2;
                            if (str2.charAt(i19) == '/') {
                                i11 = i16;
                            } else {
                                i11 = 0;
                            }
                            if (i9 != 0) {
                                i12 = i15;
                            } else {
                                i12 = i16;
                            }
                            int i20 = i17 + i12;
                            if (i11 == 0) {
                                i19 = i10 - 1;
                            }
                            String substring = str2.substring(i20, i19);
                            if (!substring.trim().isEmpty()) {
                                String trim = substring.trim();
                                K0.a.e(trim.isEmpty() ^ i16);
                                int i21 = x.f2529a;
                                String str4 = trim.split("[ \\.]", i15)[0];
                                str4.getClass();
                                switch (str4.hashCode()) {
                                    case 98:
                                        if (str4.equals("b")) {
                                            i13 = 0;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 99:
                                        if (str4.equals("c")) {
                                            i13 = i16;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 105:
                                        if (str4.equals("i")) {
                                            i13 = i15;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 117:
                                        if (str4.equals("u")) {
                                            i13 = 3;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 118:
                                        if (str4.equals("v")) {
                                            i13 = 4;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 3650:
                                        if (str4.equals("rt")) {
                                            i13 = 5;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 3314158:
                                        if (str4.equals("lang")) {
                                            i13 = 6;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 3511770:
                                        if (str4.equals("ruby")) {
                                            i13 = 7;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    default:
                                        i13 = -1;
                                        break;
                                }
                                switch (i13) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        if (i9 != 0) {
                                            while (!arrayDeque.isEmpty()) {
                                                e eVar = (e) arrayDeque.pop();
                                                a(str, eVar, arrayList, spannableStringBuilder, list);
                                                if (!arrayDeque.isEmpty()) {
                                                    arrayList.add(new d(eVar, spannableStringBuilder.length()));
                                                } else {
                                                    arrayList.clear();
                                                }
                                                if (eVar.f4661a.equals(str4)) {
                                                }
                                            }
                                        } else if (i11 == 0) {
                                            int length2 = spannableStringBuilder.length();
                                            String trim2 = substring.trim();
                                            K0.a.e(trim2.isEmpty() ^ i16);
                                            int indexOf2 = trim2.indexOf(StringUtils.SPACE);
                                            if (indexOf2 == -1) {
                                                c9 = 0;
                                            } else {
                                                str3 = trim2.substring(indexOf2).trim();
                                                c9 = 0;
                                                trim2 = trim2.substring(0, indexOf2);
                                            }
                                            String[] split = trim2.split("\\.", -1);
                                            String str5 = split[c9];
                                            HashSet hashSet = new HashSet();
                                            for (int i22 = i16; i22 < split.length; i22 += i16) {
                                                hashSet.add(split[i22]);
                                            }
                                            arrayDeque.push(new e(str5, length2, str3, hashSet));
                                        }
                                        i17 = i10;
                                        i8 = i16;
                                        i7 = -1;
                                        break;
                                }
                            }
                            i17 = i10;
                            i14 = -1;
                        }
                    }
                    i8 = i16;
                    i7 = i14;
                } else {
                    i17 += i16;
                    int indexOf3 = str2.indexOf(59, i17);
                    int indexOf4 = str2.indexOf(32, i17);
                    i7 = -1;
                    if (indexOf3 == -1) {
                        indexOf3 = indexOf4;
                    } else if (indexOf4 != -1) {
                        indexOf3 = Math.min(indexOf3, indexOf4);
                    }
                    if (indexOf3 != -1) {
                        String substring2 = str2.substring(i17, indexOf3);
                        substring2.getClass();
                        switch (substring2.hashCode()) {
                            case 3309:
                                if (substring2.equals("gt")) {
                                    c8 = 0;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 3464:
                                if (substring2.equals("lt")) {
                                    c8 = 1;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 96708:
                                if (substring2.equals("amp")) {
                                    c8 = 2;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 3374865:
                                if (substring2.equals("nbsp")) {
                                    c8 = 3;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            default:
                                c8 = 65535;
                                break;
                        }
                        switch (c8) {
                            case 0:
                                spannableStringBuilder.append('>');
                                break;
                            case 1:
                                spannableStringBuilder.append('<');
                                break;
                            case 2:
                                spannableStringBuilder.append('&');
                                break;
                            case 3:
                                spannableStringBuilder.append(' ');
                                break;
                            default:
                                K0.a.A("WebvttCueParser", "ignoring unsupported entity: '&" + substring2 + ";'");
                                break;
                        }
                        if (indexOf3 == indexOf4) {
                            spannableStringBuilder.append((CharSequence) StringUtils.SPACE);
                        }
                        i8 = 1;
                        i17 = indexOf3 + 1;
                    } else {
                        i8 = 1;
                        spannableStringBuilder.append(charAt);
                    }
                }
                i14 = i7;
                i15 = 2;
                i16 = i8;
            } else {
                while (!arrayDeque.isEmpty()) {
                    a(str, (e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new e(StringUtils.EMPTY, 0, StringUtils.EMPTY, Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
    }

    public static void g(String str, g gVar) {
        int i7 = 2;
        int indexOf = str.indexOf(44);
        char c8 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c8 = 3;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                case 1:
                    i7 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i7 = 0;
                    break;
                default:
                    K0.a.A("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i7 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f4672g = i7;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            gVar.f4671e = i.b(str);
            gVar.f = 0;
            return;
        }
        gVar.f4671e = Integer.parseInt(str);
        gVar.f = 1;
    }
}
