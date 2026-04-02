package t4;

import com.google.protobuf.AbstractC0852m;
import java.util.HashMap;
import java.util.Map;
import n4.EnumC1520f;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public int f15855a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f15856b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public boolean f15857c = true;

    /* renamed from: d  reason: collision with root package name */
    public AbstractC0852m f15858d = AbstractC0852m.f10085b;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15859e = false;

    public final w a() {
        e4.e eVar = q4.h.f15356c;
        e4.e eVar2 = eVar;
        e4.e eVar3 = eVar2;
        e4.e eVar4 = eVar3;
        for (Map.Entry entry : this.f15856b.entrySet()) {
            q4.h hVar = (q4.h) entry.getKey();
            EnumC1520f enumC1520f = (EnumC1520f) entry.getValue();
            int i7 = x.f15854a[enumC1520f.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        eVar4 = eVar4.e(hVar);
                    } else {
                        m5.d.g("Encountered invalid change type: %s", enumC1520f);
                        throw null;
                    }
                } else {
                    eVar3 = eVar3.e(hVar);
                }
            } else {
                eVar2 = eVar2.e(hVar);
            }
        }
        return new w(this.f15858d, this.f15859e, eVar2, eVar3, eVar4);
    }
}
