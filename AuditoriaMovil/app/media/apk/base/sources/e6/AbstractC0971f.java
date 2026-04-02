package e6;

import D.AbstractC0059i;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;
/* renamed from: e6.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0971f {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f10943a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f10944b = new String[64];

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f10945c = new String[RecognitionOptions.QR_CODE];

    static {
        int i7 = 0;
        int i8 = 0;
        while (true) {
            String[] strArr = f10945c;
            if (i8 >= strArr.length) {
                break;
            }
            strArr[i8] = String.format("%8s", Integer.toBinaryString(i8)).replace(' ', '0');
            i8++;
        }
        String[] strArr2 = f10944b;
        strArr2[0] = StringUtils.EMPTY;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i9 = iArr[0];
        strArr2[i9 | 8] = AbstractC0059i.D(new StringBuilder(), strArr2[i9], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr2[i10];
            int i12 = iArr[0];
            String[] strArr3 = f10944b;
            int i13 = i12 | i11;
            strArr3[i13] = strArr3[i12] + '|' + strArr3[i11];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i12]);
            sb.append('|');
            strArr3[i13 | 8] = AbstractC0059i.D(sb, strArr3[i11], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f10944b;
            if (i7 < strArr4.length) {
                if (strArr4[i7] == null) {
                    strArr4[i7] = f10945c[i7];
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public static String a(boolean z7, int i7, int i8, byte b5, byte b7) {
        String format;
        String str;
        String str2;
        String str3;
        if (b5 < 10) {
            format = f10943a[b5];
        } else {
            format = String.format("0x%02x", Byte.valueOf(b5));
        }
        if (b7 == 0) {
            str = StringUtils.EMPTY;
        } else {
            String[] strArr = f10945c;
            if (b5 != 2 && b5 != 3) {
                if (b5 != 4 && b5 != 6) {
                    if (b5 != 7 && b5 != 8) {
                        if (b7 < 64) {
                            str2 = f10944b[b7];
                        } else {
                            str2 = strArr[b7];
                        }
                        if (b5 == 5 && (b7 & 4) != 0) {
                            str = str2.replace("HEADERS", "PUSH_PROMISE");
                        } else if (b5 == 0 && (b7 & 32) != 0) {
                            str = str2.replace("PRIORITY", "COMPRESSED");
                        } else {
                            str = str2;
                        }
                    }
                } else if (b7 == 1) {
                    str = "ACK";
                } else {
                    str = strArr[b7];
                }
            }
            str = strArr[b7];
        }
        Locale locale = Locale.US;
        if (z7) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        return String.format(locale, "%s 0x%08x %5d %-13s %s", str3, Integer.valueOf(i7), Integer.valueOf(i8), format, str);
    }
}
