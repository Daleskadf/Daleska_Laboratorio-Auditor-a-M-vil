package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalo  reason: invalid package */
/* loaded from: classes.dex */
public final class zzalo {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzaln zzalnVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzalnVar, sb, 0);
        return sb.toString();
    }

    private static void zza(int i7, StringBuilder sb) {
        while (i7 > 0) {
            char[] cArr = zza;
            int length = i7 > cArr.length ? cArr.length : i7;
            sb.append(cArr, 0, length);
            i7 -= length;
        }
    }

    public static void zza(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zza(sb, i7, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zza(sb, i7, str, entry);
            }
        } else {
            sb.append('\n');
            zza(i7, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i8 = 1; i8 < str.length(); i8++) {
                    char charAt = str.charAt(i8);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzamo.zza(zzaiw.zza((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzaiw) {
                sb.append(": \"");
                sb.append(zzamo.zza((zzaiw) obj));
                sb.append('\"');
            } else if (obj instanceof zzakg) {
                sb.append(" {");
                zza((zzakg) obj, sb, i7 + 2);
                sb.append("\n");
                zza(i7, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i9 = i7 + 2;
                zza(sb, i9, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, entry2.getKey());
                zza(sb, i9, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, entry2.getValue());
                sb.append("\n");
                zza(i7, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x015c, code lost:
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0184, code lost:
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0186, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0197, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a9, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01bf, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.google.android.gms.internal.p002firebaseauthapi.zzaln r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalo.zza(com.google.android.gms.internal.firebase-auth-api.zzaln, java.lang.StringBuilder, int):void");
    }
}
