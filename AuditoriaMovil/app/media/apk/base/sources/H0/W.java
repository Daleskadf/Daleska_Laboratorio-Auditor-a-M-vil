package H0;

import java.util.Arrays;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class W {

    /* renamed from: a  reason: collision with root package name */
    public final int f1739a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1740b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1741c;

    /* renamed from: d  reason: collision with root package name */
    public final r[] f1742d;

    /* renamed from: e  reason: collision with root package name */
    public int f1743e;

    static {
        K0.x.H(0);
        K0.x.H(1);
    }

    public W(String str, r... rVarArr) {
        boolean z7;
        if (rVarArr.length > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        this.f1740b = str;
        this.f1742d = rVarArr;
        this.f1739a = rVarArr.length;
        int g3 = I.g(rVarArr[0].f1886m);
        this.f1741c = g3 == -1 ? I.g(rVarArr[0].f1885l) : g3;
        String str2 = rVarArr[0].f1879d;
        str2 = (str2 == null || str2.equals("und")) ? StringUtils.EMPTY : str2;
        int i7 = rVarArr[0].f | 16384;
        for (int i8 = 1; i8 < rVarArr.length; i8++) {
            String str3 = rVarArr[i8].f1879d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? StringUtils.EMPTY : str3)) {
                c(i8, "languages", rVarArr[0].f1879d, rVarArr[i8].f1879d);
                return;
            } else if (i7 != (rVarArr[i8].f | 16384)) {
                c(i8, "role flags", Integer.toBinaryString(rVarArr[0].f), Integer.toBinaryString(rVarArr[i8].f));
                return;
            }
        }
    }

    public static void c(int i7, String str, String str2, String str3) {
        StringBuilder l8 = io.flutter.plugins.pathprovider.b.l("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        l8.append(str3);
        l8.append("' (track ");
        l8.append(i7);
        l8.append(")");
        K0.a.o("TrackGroup", StringUtils.EMPTY, new IllegalStateException(l8.toString()));
    }

    public final r a() {
        return this.f1742d[0];
    }

    public final int b(r rVar) {
        int i7 = 0;
        while (true) {
            r[] rVarArr = this.f1742d;
            if (i7 < rVarArr.length) {
                if (rVar == rVarArr[i7]) {
                    return i7;
                }
                i7++;
            } else {
                return -1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        W w2 = (W) obj;
        if (this.f1740b.equals(w2.f1740b) && Arrays.equals(this.f1742d, w2.f1742d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1743e == 0) {
            this.f1743e = Arrays.hashCode(this.f1742d) + ((this.f1740b.hashCode() + 527) * 31);
        }
        return this.f1743e;
    }
}
