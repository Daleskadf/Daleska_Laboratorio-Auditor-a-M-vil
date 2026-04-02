package m1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f13998c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f13999a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f14000b = -1;

    public final boolean a(String str) {
        Matcher matcher = f13998c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i7 = K0.x.f2529a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f13999a = parseInt;
                    this.f14000b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(H0.H h8) {
        int i7 = 0;
        while (true) {
            H0.G[] gArr = h8.f1692a;
            if (i7 < gArr.length) {
                H0.G g3 = gArr[i7];
                if (g3 instanceof A1.e) {
                    A1.e eVar = (A1.e) g3;
                    if ("iTunSMPB".equals(eVar.f51c) && a(eVar.f52d)) {
                        return;
                    }
                } else if (g3 instanceof A1.k) {
                    A1.k kVar = (A1.k) g3;
                    if ("com.apple.iTunes".equals(kVar.f64b) && "iTunSMPB".equals(kVar.f65c) && a(kVar.f66d)) {
                        return;
                    }
                } else {
                    continue;
                }
                i7++;
            } else {
                return;
            }
        }
    }
}
