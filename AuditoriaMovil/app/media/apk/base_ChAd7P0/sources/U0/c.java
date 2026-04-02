package U0;

import H0.C0137q;
import H0.I;
import f5.C0993a;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f5545d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b  reason: collision with root package name */
    public C0993a f5546b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5547c;

    public static void a(int i7, ArrayList arrayList) {
        if (AbstractC1740d.p(i7, 0, 7, f5545d) != -1 && !arrayList.contains(Integer.valueOf(i7))) {
            arrayList.add(Integer.valueOf(i7));
        }
    }

    public final H0.r b(H0.r rVar) {
        String str;
        if (this.f5547c && this.f5546b.i(rVar)) {
            C0137q a7 = rVar.a();
            a7.f1850l = I.l("application/x-media3-cues");
            a7.f1837F = this.f5546b.k(rVar);
            StringBuilder sb = new StringBuilder();
            sb.append(rVar.f1886m);
            String str2 = rVar.j;
            if (str2 != null) {
                str = StringUtils.SPACE.concat(str2);
            } else {
                str = StringUtils.EMPTY;
            }
            sb.append(str);
            a7.f1848i = sb.toString();
            a7.f1855q = Long.MAX_VALUE;
            return new H0.r(a7);
        }
        return rVar;
    }
}
