package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzamx {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

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
        zzc = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString zza(java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamx.zza(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzea zzb(String str) {
        zzamw zzamwVar = new zzamw();
        zzh(str, zzamwVar);
        return zzamwVar.zza();
    }

    public static zzamq zzc(zzfo zzfoVar, List list) {
        String zzy = zzfoVar.zzy(zzfwd.zzc);
        if (zzy != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzy);
            if (!matcher.matches()) {
                String zzy2 = zzfoVar.zzy(zzfwd.zzc);
                if (zzy2 != null) {
                    Matcher matcher2 = pattern.matcher(zzy2);
                    if (matcher2.matches()) {
                        return zze(zzy.trim(), matcher2, zzfoVar, list);
                    }
                }
            } else {
                return zze(null, matcher, zzfoVar, list);
            }
        }
        return null;
    }

    private static int zzd(List list, String str, zzamu zzamuVar) {
        List zzf = zzf(list, str, zzamuVar);
        for (int i = 0; i < zzf.size(); i++) {
            zzamp zzampVar = ((zzamv) zzf.get(i)).zzb;
            if (zzampVar.zze() != -1) {
                return zzampVar.zze();
            }
        }
        return -1;
    }

    private static zzamq zze(String str, Matcher matcher, zzfo zzfoVar, List list) {
        zzamw zzamwVar = new zzamw();
        try {
            String group = matcher.group(1);
            group.getClass();
            zzamwVar.zza = zzamz.zzb(group);
            String group2 = matcher.group(2);
            group2.getClass();
            zzamwVar.zzb = zzamz.zzb(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            zzh(group3, zzamwVar);
            StringBuilder sb = new StringBuilder();
            String zzy = zzfoVar.zzy(zzfwd.zzc);
            while (!TextUtils.isEmpty(zzy)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(zzy.trim());
                zzy = zzfoVar.zzy(zzfwd.zzc);
            }
            zzamwVar.zzc = zza(str, sb.toString(), list);
            return new zzamq(zzamwVar.zza().zzp(), zzamwVar.zza, zzamwVar.zzb);
        } catch (NumberFormatException unused) {
            zzfe.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, String str, zzamu zzamuVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzamp zzampVar = (zzamp) list.get(i);
            int zzf = zzampVar.zzf(str, zzamuVar.zza, zzamuVar.zzd, zzamuVar.zzc);
            if (zzf > 0) {
                arrayList.add(new zzamv(zzf, zzampVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void zzg(String str, zzamu zzamuVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c;
        Comparator comparator;
        zzamu zzamuVar2;
        zzamu zzamuVar3;
        zzamu zzamuVar4;
        int i;
        int i2 = zzamuVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzamuVar.zza;
        int hashCode = str2.hashCode();
        int i3 = -1;
        if (hashCode == 0) {
            if (str2.equals("")) {
                c = 7;
            }
            c = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals("lang")) {
                c = 5;
            }
            c = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c = 6;
            }
            c = 65535;
        } else {
            if (str2.equals("u")) {
                c = 3;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case 2:
                int zzd2 = zzd(list2, str, zzamuVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                comparator = zzamt.zza;
                Collections.sort(arrayList, comparator);
                int i4 = zzamuVar.zzb;
                int i5 = 0;
                int i6 = 0;
                while (i5 < arrayList.size()) {
                    zzamuVar2 = ((zzamt) arrayList.get(i5)).zzb;
                    if ("rt".equals(zzamuVar2.zza)) {
                        zzamt zzamtVar = (zzamt) arrayList.get(i5);
                        zzamuVar3 = zzamtVar.zzb;
                        int zzd3 = zzd(list2, str, zzamuVar3);
                        if (zzd3 == i3) {
                            zzd3 = zzd2 != i3 ? zzd2 : 1;
                        }
                        zzamuVar4 = zzamtVar.zzb;
                        int i7 = zzamuVar4.zzb - i6;
                        i = zzamtVar.zzc;
                        int i8 = i - i6;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i7, i8);
                        spannableStringBuilder.delete(i7, i8);
                        spannableStringBuilder.setSpan(new zzeh(subSequence.toString(), zzd3), i4, i7, 33);
                        i6 += subSequence.length();
                        i4 = i7;
                    }
                    i5++;
                    i3 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case 4:
                for (String str3 : zzamuVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i2, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i2, length, 33);
                        }
                    }
                }
                break;
            case 5:
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List zzf = zzf(list2, str, zzamuVar);
        for (int i9 = 0; i9 < zzf.size(); i9++) {
            zzamp zzampVar = ((zzamv) zzf.get(i9)).zzb;
            if (zzampVar != null) {
                if (zzampVar.zzg() != -1) {
                    zzei.zza(spannableStringBuilder, new StyleSpan(zzampVar.zzg()), i2, length, 33);
                }
                if (zzampVar.zzz()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                }
                if (zzampVar.zzy()) {
                    zzei.zza(spannableStringBuilder, new ForegroundColorSpan(zzampVar.zzc()), i2, length, 33);
                }
                if (zzampVar.zzx()) {
                    zzei.zza(spannableStringBuilder, new BackgroundColorSpan(zzampVar.zzb()), i2, length, 33);
                }
                if (zzampVar.zzr() != null) {
                    zzei.zza(spannableStringBuilder, new TypefaceSpan(zzampVar.zzr()), i2, length, 33);
                }
                int zzd4 = zzampVar.zzd();
                if (zzd4 == 1) {
                    zzei.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzampVar.zza(), true), i2, length, 33);
                } else if (zzd4 == 2) {
                    zzei.zza(spannableStringBuilder, new RelativeSizeSpan(zzampVar.zza()), i2, length, 33);
                } else if (zzd4 == 3) {
                    zzei.zza(spannableStringBuilder, new RelativeSizeSpan(zzampVar.zza() / 100.0f), i2, length, 33);
                }
                if (zzampVar.zzw()) {
                    spannableStringBuilder.setSpan(new zzeg(), i2, length, 33);
                }
            }
        }
    }

    private static void zzh(String str, zzamw zzamwVar) {
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            int i2 = 2;
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                char c = 65535;
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c = 0;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            i2 = 0;
                        } else if (c == 1 || c == 2) {
                            i2 = 1;
                        } else if (c != 3) {
                            zzfe.zzf("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring)));
                            i2 = Integer.MIN_VALUE;
                        }
                        zzamwVar.zzg = i2;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        zzamwVar.zze = zzamz.zza(group2);
                        zzamwVar.zzf = 0;
                    } else {
                        zzamwVar.zze = Integer.parseInt(group2);
                        zzamwVar.zzf = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c = 0;
                                break;
                            }
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2 && c != 3) {
                                if (c != 4) {
                                    i = 5;
                                    if (c != 5) {
                                        zzfe.zzf("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                    }
                                } else {
                                    i = 3;
                                }
                            }
                            i = 2;
                        } else {
                            i = 4;
                        }
                    }
                    zzamwVar.zzd = i;
                } else if ("position".equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                if (substring2.equals("line-left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (substring2.equals("center")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (substring2.equals("line-right")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring2.equals("end")) {
                                    c = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring2.equals("start")) {
                                    c = 1;
                                    break;
                                }
                                break;
                        }
                        if (c == 0 || c == 1) {
                            i = 0;
                        } else if (c != 2 && c != 3) {
                            if (c == 4 || c == 5) {
                                i = 2;
                            } else {
                                zzfe.zzf("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring2)));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        zzamwVar.zzi = i;
                        group2 = group2.substring(0, indexOf2);
                    }
                    zzamwVar.zzh = zzamz.zza(group2);
                } else if ("size".equals(group)) {
                    zzamwVar.zzj = zzamz.zza(group2);
                } else if ("vertical".equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            c = 0;
                        }
                    } else if (group2.equals("lr")) {
                        c = 1;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            zzfe.zzf("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    zzamwVar.zzk = i;
                } else {
                    zzfe.zzf("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                zzfe.zzf("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
