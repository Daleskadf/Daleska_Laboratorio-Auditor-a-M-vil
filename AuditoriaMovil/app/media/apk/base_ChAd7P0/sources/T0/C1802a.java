package t0;

import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import w6.l;
/* renamed from: t0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1802a extends k implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final C1802a f15702a = new k(1);

    @Override // w6.l
    public final Object invoke(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        j.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            j.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i7 = 0;
            for (byte b5 : bArr) {
                i7++;
                if (i7 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b5));
            }
            sb.append((CharSequence) "]");
            valueOf = sb.toString();
            j.d(valueOf, "toString(...)");
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((C1805d) entry.getKey()).f15708a + " = " + valueOf;
    }
}
