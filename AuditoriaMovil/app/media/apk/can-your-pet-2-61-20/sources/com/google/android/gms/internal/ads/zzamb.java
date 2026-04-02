package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzamb implements zzalh {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzfo zze = new zzfo();

    public static float zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    private static long zzc(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = parseLong + (Long.parseLong(group2) * 60000);
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = parseLong2 + (Long.parseLong(group3) * 1000);
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzalh
    public final void zza(byte[] bArr, int i, int i2, zzalg zzalgVar, zzep zzepVar) {
        String str;
        char c;
        char c2;
        zzec zzp;
        zzamb zzambVar = this;
        zzambVar.zze.zzI(bArr, i + i2);
        zzambVar.zze.zzK(i);
        Charset zzB = zzambVar.zze.zzB();
        if (zzB == null) {
            zzB = zzfwd.zzc;
        }
        while (true) {
            String zzy = zzambVar.zze.zzy(zzB);
            if (zzy == null) {
                return;
            }
            if (zzy.length() != 0) {
                try {
                    Integer.parseInt(zzy);
                    String zzy2 = zzambVar.zze.zzy(zzB);
                    if (zzy2 != null) {
                        Matcher matcher = zza.matcher(zzy2);
                        if (matcher.matches()) {
                            long zzc = zzc(matcher, 1);
                            long zzc2 = zzc(matcher, 6);
                            zzambVar.zzc.setLength(0);
                            zzambVar.zzd.clear();
                            for (String zzy3 = zzambVar.zze.zzy(zzB); !TextUtils.isEmpty(zzy3); zzy3 = zzambVar.zze.zzy(zzB)) {
                                if (zzambVar.zzc.length() > 0) {
                                    zzambVar.zzc.append("<br>");
                                }
                                StringBuilder sb = zzambVar.zzc;
                                ArrayList arrayList = zzambVar.zzd;
                                String trim = zzy3.trim();
                                StringBuilder sb2 = new StringBuilder(trim);
                                Matcher matcher2 = zzb.matcher(trim);
                                int i3 = 0;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList.add(group);
                                    int start = matcher2.start() - i3;
                                    int length = group.length();
                                    sb2.replace(start, start + length, "");
                                    i3 += length;
                                }
                                sb.append(sb2.toString());
                            }
                            Spanned fromHtml = Html.fromHtml(zzambVar.zzc.toString());
                            int i4 = 0;
                            while (true) {
                                if (i4 < zzambVar.zzd.size()) {
                                    str = (String) zzambVar.zzd.get(i4);
                                    if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                        i4++;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            zzea zzeaVar = new zzea();
                            zzeaVar.zzl(fromHtml);
                            if (str == null) {
                                zzp = zzeaVar.zzp();
                            } else {
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                if (c == 0 || c == 1 || c == 2) {
                                    zzeaVar.zzi(0);
                                } else if (c == 3 || c == 4 || c == 5) {
                                    zzeaVar.zzi(2);
                                } else {
                                    zzeaVar.zzi(1);
                                }
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c2 = 3;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c2 = 4;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c2 = 5;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    default:
                                        c2 = 65535;
                                        break;
                                }
                                if (c2 == 0 || c2 == 1 || c2 == 2) {
                                    zzeaVar.zzf(2);
                                } else if (c2 == 3 || c2 == 4 || c2 == 5) {
                                    zzeaVar.zzf(0);
                                } else {
                                    zzeaVar.zzf(1);
                                }
                                zzeaVar.zzh(zzb(zzeaVar.zzb()));
                                zzeaVar.zze(zzb(zzeaVar.zza()), 0);
                                zzp = zzeaVar.zzp();
                            }
                            zzepVar.zza(new zzakz(zzfzn.zzn(zzp), zzc, zzc2 - zzc));
                        } else {
                            zzfe.zzf("SubripParser", "Skipping invalid timing: ".concat(zzy2));
                        }
                    } else {
                        zzfe.zzf("SubripParser", "Unexpected end");
                        return;
                    }
                } catch (NumberFormatException unused) {
                    zzfe.zzf("SubripParser", "Skipping invalid index: ".concat(zzy));
                }
            }
            zzambVar = this;
        }
    }
}
