package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.distriqt.extension.inappbilling.controller.SubscriptionPhase;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzamh implements zzalh {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzamf zzh = new zzamf(30.0f, 1, 1);

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
        if (r13.equals("s") != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long zzc(java.lang.String r13, com.google.android.gms.internal.ads.zzamf r14) throws com.google.android.gms.internal.ads.zzald {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamh.zzc(java.lang.String, com.google.android.gms.internal.ads.zzamf):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment zzd(String str) {
        char c;
        String zza2 = zzfvx.zza(str);
        switch (zza2.hashCode()) {
            case -1364013995:
                if (zza2.equals("center")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (zza2.equals("end")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3317767:
                if (zza2.equals("left")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 108511772:
                if (zza2.equals("right")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (zza2.equals("start")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c == 2 || c == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private static zzamk zze(zzamk zzamkVar) {
        return zzamkVar == null ? new zzamk() : zzamkVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static zzamk zzf(XmlPullParser xmlPullParser, zzamk zzamkVar) {
        char c;
        Matcher matcher;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            char c2 = 65535;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals(TypedValues.Custom.S_COLOR)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    if ("style".equals(xmlPullParser.getName())) {
                        zzamkVar = zze(zzamkVar);
                        zzamkVar.zzs(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    zzamkVar = zze(zzamkVar);
                    try {
                        zzamkVar.zzm(zzen.zzb(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzfe.zzf("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 2:
                    zzamkVar = zze(zzamkVar);
                    try {
                        zzamkVar.zzo(zzen.zzb(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        zzfe.zzf("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 3:
                    zzamkVar = zze(zzamkVar);
                    zzamkVar.zzp(attributeValue);
                    break;
                case 4:
                    try {
                        zzamkVar = zze(zzamkVar);
                        int i2 = zzfx.zza;
                        String[] split = attributeValue.split("\\s+", -1);
                        int length = split.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else if (length == 2) {
                            matcher = zze.matcher(split[1]);
                            zzfe.zzf("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        } else {
                            throw new zzald("Invalid number of entries for fontSize: " + length + ".");
                        }
                        if (matcher.matches()) {
                            String group = matcher.group(3);
                            group.getClass();
                            int hashCode = group.hashCode();
                            if (hashCode != 37) {
                                if (hashCode != 3240) {
                                    if (hashCode == 3592 && group.equals("px")) {
                                        c2 = 0;
                                    }
                                } else if (group.equals("em")) {
                                    c2 = 1;
                                }
                            } else if (group.equals("%")) {
                                c2 = 2;
                            }
                            if (c2 == 0) {
                                zzamkVar.zzr(1);
                            } else if (c2 == 1) {
                                zzamkVar.zzr(2);
                            } else if (c2 == 2) {
                                zzamkVar.zzr(3);
                            } else {
                                throw new zzald("Invalid unit for fontSize: '" + group + "'.");
                            }
                            String group2 = matcher.group(1);
                            group2.getClass();
                            zzamkVar.zzq(Float.parseFloat(group2));
                            break;
                        } else {
                            throw new zzald("Invalid expression for fontSize: '" + attributeValue + "'.");
                        }
                    } catch (zzald unused3) {
                        zzfe.zzf("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 5:
                    zzamkVar = zze(zzamkVar);
                    zzamkVar.zzn("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzamkVar = zze(zzamkVar);
                    zzamkVar.zzt("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzamkVar = zze(zzamkVar);
                    zzamkVar.zzz(zzd(attributeValue));
                    break;
                case '\b':
                    zzamkVar = zze(zzamkVar);
                    zzamkVar.zzv(zzd(attributeValue));
                    break;
                case '\t':
                    String zza2 = zzfvx.zza(attributeValue);
                    int hashCode2 = zza2.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && zza2.equals(SubscriptionPhase.RECURRENCE_MODE_NONE)) {
                            c2 = 0;
                        }
                    } else if (zza2.equals("all")) {
                        c2 = 1;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            break;
                        } else {
                            zzamkVar = zze(zzamkVar);
                            zzamkVar.zzA(true);
                            break;
                        }
                    } else {
                        zzamkVar = zze(zzamkVar);
                        zzamkVar.zzA(false);
                        break;
                    }
                case '\n':
                    String zza3 = zzfvx.zza(attributeValue);
                    switch (zza3.hashCode()) {
                        case -618561360:
                            if (zza3.equals("baseContainer")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (zza3.equals("container")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -250518009:
                            if (zza3.equals("delimiter")) {
                                c2 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (zza3.equals("textContainer")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (zza3.equals("base")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (zza3.equals("text")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 != 1 && c2 != 2) {
                            if (c2 != 3 && c2 != 4) {
                                if (c2 != 5) {
                                    break;
                                } else {
                                    zzamkVar = zze(zzamkVar);
                                    zzamkVar.zzx(4);
                                    break;
                                }
                            } else {
                                zzamkVar = zze(zzamkVar);
                                zzamkVar.zzx(3);
                                break;
                            }
                        } else {
                            zzamkVar = zze(zzamkVar);
                            zzamkVar.zzx(2);
                            break;
                        }
                    } else {
                        zzamkVar = zze(zzamkVar);
                        zzamkVar.zzx(1);
                        break;
                    }
                case 11:
                    String zza4 = zzfvx.zza(attributeValue);
                    int hashCode3 = zza4.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && zza4.equals("after")) {
                            c2 = 1;
                        }
                    } else if (zza4.equals("before")) {
                        c2 = 0;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            break;
                        } else {
                            zzamkVar = zze(zzamkVar);
                            zzamkVar.zzw(2);
                            break;
                        }
                    } else {
                        zzamkVar = zze(zzamkVar);
                        zzamkVar.zzw(1);
                        break;
                    }
                case '\f':
                    String zza5 = zzfvx.zza(attributeValue);
                    switch (zza5.hashCode()) {
                        case -1461280213:
                            if (zza5.equals("nounderline")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (zza5.equals("underline")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (zza5.equals("nolinethrough")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (zza5.equals("linethrough")) {
                                c2 = 0;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            if (c2 != 2) {
                                if (c2 != 3) {
                                    break;
                                } else {
                                    zzamkVar = zze(zzamkVar);
                                    zzamkVar.zzC(false);
                                    break;
                                }
                            } else {
                                zzamkVar = zze(zzamkVar);
                                zzamkVar.zzC(true);
                                break;
                            }
                        } else {
                            zzamkVar = zze(zzamkVar);
                            zzamkVar.zzu(false);
                            break;
                        }
                    } else {
                        zzamkVar = zze(zzamkVar);
                        zzamkVar.zzu(true);
                        break;
                    }
                case '\r':
                    zzamkVar = zze(zzamkVar);
                    zzamkVar.zzB(zzamd.zza(attributeValue));
                    break;
                case 14:
                    zzamkVar = zze(zzamkVar);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (!matcher2.matches()) {
                        zzfe.zzf("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    } else {
                        try {
                            String group3 = matcher2.group(1);
                            group3.getClass();
                            f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                        } catch (NumberFormatException e) {
                            zzfe.zzg("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                        }
                    }
                    zzamkVar.zzy(f);
                    break;
            }
        }
        return zzamkVar;
    }

    private static String[] zzg(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i = zzfx.zza;
        return trim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzalh
    public final void zza(byte[] bArr, int i, int i2, zzalg zzalgVar, zzep zzepVar) {
        zzalb.zza(zzb(bArr, i, i2), zzalgVar, zzepVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026f A[Catch: IOException -> 0x06bc, XmlPullParserException -> 0x06c6, LOOP:1: B:113:0x026f->B:254:0x04e9, LOOP_START, PHI: r2 r5 r11 
      PHI: (r2v35 java.lang.String) = (r2v16 java.lang.String), (r2v73 java.lang.String) binds: [B:112:0x026d, B:254:0x04e9] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v7 java.util.HashMap) = (r5v1 java.util.HashMap), (r5v24 java.util.HashMap) binds: [B:112:0x026d, B:254:0x04e9] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v10 com.google.android.gms.internal.ads.zzamf) = (r11v5 com.google.android.gms.internal.ads.zzamf), (r11v27 com.google.android.gms.internal.ads.zzamf) binds: [B:112:0x026d, B:254:0x04e9] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x06bc, XmlPullParserException -> 0x06c6, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0178, B:78:0x01cf, B:81:0x01dd, B:83:0x01e3, B:85:0x01eb, B:87:0x01f3, B:89:0x01fb, B:91:0x0203, B:93:0x020b, B:95:0x0211, B:97:0x0219, B:99:0x0221, B:101:0x0227, B:103:0x022d, B:105:0x0235, B:107:0x023d, B:110:0x0246, B:384:0x06a4, B:111:0x0269, B:113:0x026f, B:115:0x0278, B:117:0x0287, B:119:0x0291, B:121:0x02a5, B:123:0x02ab, B:251:0x04dd, B:124:0x02af, B:127:0x02b9, B:129:0x02bf, B:131:0x02ca, B:133:0x02d0, B:134:0x02d7, B:137:0x02e3, B:250:0x04d8, B:141:0x02f0, B:143:0x02f8, B:147:0x0311, B:149:0x0318, B:151:0x0326, B:166:0x0372, B:168:0x037a, B:171:0x0389, B:173:0x0390, B:175:0x039e, B:190:0x03ed, B:192:0x03f5, B:213:0x043b, B:215:0x0443, B:242:0x048c, B:177:0x03a9, B:178:0x03b4, B:181:0x03bc, B:184:0x03c8, B:186:0x03cf, B:188:0x03db, B:243:0x0498, B:244:0x04a3, B:245:0x04ae, B:153:0x032f, B:154:0x0339, B:157:0x0343, B:160:0x034e, B:162:0x0355, B:164:0x0361, B:246:0x04b5, B:247:0x04c0, B:248:0x04cb, B:256:0x04f5, B:259:0x0512, B:312:0x05b2, B:293:0x056e, B:296:0x0577, B:358:0x0633, B:299:0x057f, B:302:0x0589, B:309:0x059e, B:310:0x05a3, B:311:0x05ab, B:319:0x05c7, B:323:0x05d1, B:327:0x05da, B:337:0x05ee, B:345:0x0603, B:347:0x0611, B:349:0x0616, B:339:0x05f5, B:64:0x0182, B:66:0x018e, B:69:0x0199, B:71:0x01a0, B:73:0x01ac, B:75:0x01b6, B:39:0x010d, B:41:0x0119, B:44:0x0124, B:46:0x012b, B:48:0x0137, B:54:0x014d, B:56:0x0154, B:60:0x016e, B:364:0x0653, B:367:0x0662, B:369:0x066c, B:371:0x0679, B:373:0x0681, B:377:0x0695, B:381:0x069d), top: B:426:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0443 A[Catch: IOException -> 0x06bc, XmlPullParserException -> 0x06c6, TRY_LEAVE, TryCatch #17 {IOException -> 0x06bc, XmlPullParserException -> 0x06c6, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0178, B:78:0x01cf, B:81:0x01dd, B:83:0x01e3, B:85:0x01eb, B:87:0x01f3, B:89:0x01fb, B:91:0x0203, B:93:0x020b, B:95:0x0211, B:97:0x0219, B:99:0x0221, B:101:0x0227, B:103:0x022d, B:105:0x0235, B:107:0x023d, B:110:0x0246, B:384:0x06a4, B:111:0x0269, B:113:0x026f, B:115:0x0278, B:117:0x0287, B:119:0x0291, B:121:0x02a5, B:123:0x02ab, B:251:0x04dd, B:124:0x02af, B:127:0x02b9, B:129:0x02bf, B:131:0x02ca, B:133:0x02d0, B:134:0x02d7, B:137:0x02e3, B:250:0x04d8, B:141:0x02f0, B:143:0x02f8, B:147:0x0311, B:149:0x0318, B:151:0x0326, B:166:0x0372, B:168:0x037a, B:171:0x0389, B:173:0x0390, B:175:0x039e, B:190:0x03ed, B:192:0x03f5, B:213:0x043b, B:215:0x0443, B:242:0x048c, B:177:0x03a9, B:178:0x03b4, B:181:0x03bc, B:184:0x03c8, B:186:0x03cf, B:188:0x03db, B:243:0x0498, B:244:0x04a3, B:245:0x04ae, B:153:0x032f, B:154:0x0339, B:157:0x0343, B:160:0x034e, B:162:0x0355, B:164:0x0361, B:246:0x04b5, B:247:0x04c0, B:248:0x04cb, B:256:0x04f5, B:259:0x0512, B:312:0x05b2, B:293:0x056e, B:296:0x0577, B:358:0x0633, B:299:0x057f, B:302:0x0589, B:309:0x059e, B:310:0x05a3, B:311:0x05ab, B:319:0x05c7, B:323:0x05d1, B:327:0x05da, B:337:0x05ee, B:345:0x0603, B:347:0x0611, B:349:0x0616, B:339:0x05f5, B:64:0x0182, B:66:0x018e, B:69:0x0199, B:71:0x01a0, B:73:0x01ac, B:75:0x01b6, B:39:0x010d, B:41:0x0119, B:44:0x0124, B:46:0x012b, B:48:0x0137, B:54:0x014d, B:56:0x0154, B:60:0x016e, B:364:0x0653, B:367:0x0662, B:369:0x066c, B:371:0x0679, B:373:0x0681, B:377:0x0695, B:381:0x069d), top: B:426:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04d8 A[Catch: IOException -> 0x06bc, XmlPullParserException -> 0x06c6, TryCatch #17 {IOException -> 0x06bc, XmlPullParserException -> 0x06c6, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0178, B:78:0x01cf, B:81:0x01dd, B:83:0x01e3, B:85:0x01eb, B:87:0x01f3, B:89:0x01fb, B:91:0x0203, B:93:0x020b, B:95:0x0211, B:97:0x0219, B:99:0x0221, B:101:0x0227, B:103:0x022d, B:105:0x0235, B:107:0x023d, B:110:0x0246, B:384:0x06a4, B:111:0x0269, B:113:0x026f, B:115:0x0278, B:117:0x0287, B:119:0x0291, B:121:0x02a5, B:123:0x02ab, B:251:0x04dd, B:124:0x02af, B:127:0x02b9, B:129:0x02bf, B:131:0x02ca, B:133:0x02d0, B:134:0x02d7, B:137:0x02e3, B:250:0x04d8, B:141:0x02f0, B:143:0x02f8, B:147:0x0311, B:149:0x0318, B:151:0x0326, B:166:0x0372, B:168:0x037a, B:171:0x0389, B:173:0x0390, B:175:0x039e, B:190:0x03ed, B:192:0x03f5, B:213:0x043b, B:215:0x0443, B:242:0x048c, B:177:0x03a9, B:178:0x03b4, B:181:0x03bc, B:184:0x03c8, B:186:0x03cf, B:188:0x03db, B:243:0x0498, B:244:0x04a3, B:245:0x04ae, B:153:0x032f, B:154:0x0339, B:157:0x0343, B:160:0x034e, B:162:0x0355, B:164:0x0361, B:246:0x04b5, B:247:0x04c0, B:248:0x04cb, B:256:0x04f5, B:259:0x0512, B:312:0x05b2, B:293:0x056e, B:296:0x0577, B:358:0x0633, B:299:0x057f, B:302:0x0589, B:309:0x059e, B:310:0x05a3, B:311:0x05ab, B:319:0x05c7, B:323:0x05d1, B:327:0x05da, B:337:0x05ee, B:345:0x0603, B:347:0x0611, B:349:0x0616, B:339:0x05f5, B:64:0x0182, B:66:0x018e, B:69:0x0199, B:71:0x01a0, B:73:0x01ac, B:75:0x01b6, B:39:0x010d, B:41:0x0119, B:44:0x0124, B:46:0x012b, B:48:0x0137, B:54:0x014d, B:56:0x0154, B:60:0x016e, B:364:0x0653, B:367:0x0662, B:369:0x066c, B:371:0x0679, B:373:0x0681, B:377:0x0695, B:381:0x069d), top: B:426:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04e9 A[LOOP:1: B:113:0x026f->B:254:0x04e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x04e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182 A[Catch: IOException -> 0x06bc, XmlPullParserException -> 0x06c6, TryCatch #17 {IOException -> 0x06bc, XmlPullParserException -> 0x06c6, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0178, B:78:0x01cf, B:81:0x01dd, B:83:0x01e3, B:85:0x01eb, B:87:0x01f3, B:89:0x01fb, B:91:0x0203, B:93:0x020b, B:95:0x0211, B:97:0x0219, B:99:0x0221, B:101:0x0227, B:103:0x022d, B:105:0x0235, B:107:0x023d, B:110:0x0246, B:384:0x06a4, B:111:0x0269, B:113:0x026f, B:115:0x0278, B:117:0x0287, B:119:0x0291, B:121:0x02a5, B:123:0x02ab, B:251:0x04dd, B:124:0x02af, B:127:0x02b9, B:129:0x02bf, B:131:0x02ca, B:133:0x02d0, B:134:0x02d7, B:137:0x02e3, B:250:0x04d8, B:141:0x02f0, B:143:0x02f8, B:147:0x0311, B:149:0x0318, B:151:0x0326, B:166:0x0372, B:168:0x037a, B:171:0x0389, B:173:0x0390, B:175:0x039e, B:190:0x03ed, B:192:0x03f5, B:213:0x043b, B:215:0x0443, B:242:0x048c, B:177:0x03a9, B:178:0x03b4, B:181:0x03bc, B:184:0x03c8, B:186:0x03cf, B:188:0x03db, B:243:0x0498, B:244:0x04a3, B:245:0x04ae, B:153:0x032f, B:154:0x0339, B:157:0x0343, B:160:0x034e, B:162:0x0355, B:164:0x0361, B:246:0x04b5, B:247:0x04c0, B:248:0x04cb, B:256:0x04f5, B:259:0x0512, B:312:0x05b2, B:293:0x056e, B:296:0x0577, B:358:0x0633, B:299:0x057f, B:302:0x0589, B:309:0x059e, B:310:0x05a3, B:311:0x05ab, B:319:0x05c7, B:323:0x05d1, B:327:0x05da, B:337:0x05ee, B:345:0x0603, B:347:0x0611, B:349:0x0616, B:339:0x05f5, B:64:0x0182, B:66:0x018e, B:69:0x0199, B:71:0x01a0, B:73:0x01ac, B:75:0x01b6, B:39:0x010d, B:41:0x0119, B:44:0x0124, B:46:0x012b, B:48:0x0137, B:54:0x014d, B:56:0x0154, B:60:0x016e, B:364:0x0653, B:367:0x0662, B:369:0x066c, B:371:0x0679, B:373:0x0681, B:377:0x0695, B:381:0x069d), top: B:426:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01dd A[Catch: IOException -> 0x06bc, XmlPullParserException -> 0x06c6, TRY_ENTER, TryCatch #17 {IOException -> 0x06bc, XmlPullParserException -> 0x06c6, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0178, B:78:0x01cf, B:81:0x01dd, B:83:0x01e3, B:85:0x01eb, B:87:0x01f3, B:89:0x01fb, B:91:0x0203, B:93:0x020b, B:95:0x0211, B:97:0x0219, B:99:0x0221, B:101:0x0227, B:103:0x022d, B:105:0x0235, B:107:0x023d, B:110:0x0246, B:384:0x06a4, B:111:0x0269, B:113:0x026f, B:115:0x0278, B:117:0x0287, B:119:0x0291, B:121:0x02a5, B:123:0x02ab, B:251:0x04dd, B:124:0x02af, B:127:0x02b9, B:129:0x02bf, B:131:0x02ca, B:133:0x02d0, B:134:0x02d7, B:137:0x02e3, B:250:0x04d8, B:141:0x02f0, B:143:0x02f8, B:147:0x0311, B:149:0x0318, B:151:0x0326, B:166:0x0372, B:168:0x037a, B:171:0x0389, B:173:0x0390, B:175:0x039e, B:190:0x03ed, B:192:0x03f5, B:213:0x043b, B:215:0x0443, B:242:0x048c, B:177:0x03a9, B:178:0x03b4, B:181:0x03bc, B:184:0x03c8, B:186:0x03cf, B:188:0x03db, B:243:0x0498, B:244:0x04a3, B:245:0x04ae, B:153:0x032f, B:154:0x0339, B:157:0x0343, B:160:0x034e, B:162:0x0355, B:164:0x0361, B:246:0x04b5, B:247:0x04c0, B:248:0x04cb, B:256:0x04f5, B:259:0x0512, B:312:0x05b2, B:293:0x056e, B:296:0x0577, B:358:0x0633, B:299:0x057f, B:302:0x0589, B:309:0x059e, B:310:0x05a3, B:311:0x05ab, B:319:0x05c7, B:323:0x05d1, B:327:0x05da, B:337:0x05ee, B:345:0x0603, B:347:0x0611, B:349:0x0616, B:339:0x05f5, B:64:0x0182, B:66:0x018e, B:69:0x0199, B:71:0x01a0, B:73:0x01ac, B:75:0x01b6, B:39:0x010d, B:41:0x0119, B:44:0x0124, B:46:0x012b, B:48:0x0137, B:54:0x014d, B:56:0x0154, B:60:0x016e, B:364:0x0653, B:367:0x0662, B:369:0x066c, B:371:0x0679, B:373:0x0681, B:377:0x0695, B:381:0x069d), top: B:426:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzalc zzb(byte[] r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 1770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamh.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzalc");
    }

    public zzamh() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
