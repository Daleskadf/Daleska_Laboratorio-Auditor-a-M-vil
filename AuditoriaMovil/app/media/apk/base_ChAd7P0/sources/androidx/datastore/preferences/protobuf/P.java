package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f7764a;

    static {
        char[] cArr = new char[80];
        f7764a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i7, StringBuilder sb) {
        while (i7 > 0) {
            int i8 = 80;
            if (i7 <= 80) {
                i8 = i7;
            }
            sb.append(f7764a, 0, i8);
            i7 -= i8;
        }
    }

    public static void b(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                b(sb, i7, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb, i7, str, entry);
            }
        } else {
            sb.append('\n');
            a(i7, sb);
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
                C0530g c0530g = C0530g.f7818c;
                sb.append(H4.W.i(new C0530g(((String) obj).getBytes(A.f7747a))));
                sb.append('\"');
            } else if (obj instanceof C0530g) {
                sb.append(": \"");
                sb.append(H4.W.i((C0530g) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC0547y) {
                sb.append(" {");
                c((AbstractC0547y) obj, sb, i7 + 2);
                sb.append("\n");
                a(i7, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i9 = i7 + 2;
                b(sb, i9, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, entry2.getKey());
                b(sb, i9, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, entry2.getValue());
                sb.append("\n");
                a(i7, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0195, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0197, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a8, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01be, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(androidx.datastore.preferences.protobuf.AbstractC0547y r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.P.c(androidx.datastore.preferences.protobuf.y, java.lang.StringBuilder, int):void");
    }
}
