package S1;

import H0.C0137q;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: S1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338f {

    /* renamed from: a  reason: collision with root package name */
    public final int f5011a;

    /* renamed from: b  reason: collision with root package name */
    public final List f5012b;

    public C0338f(int i7, List list) {
        this.f5011a = i7;
        this.f5012b = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public S1.I a(int r6, K0.o r7) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.C0338f.a(int, K0.o):S1.I");
    }

    public List b(K0.o oVar) {
        boolean z7;
        String str;
        int i7;
        List list;
        boolean c8 = c(32);
        List list2 = this.f5012b;
        if (c8) {
            return list2;
        }
        K0.q qVar = new K0.q((byte[]) oVar.f2505d);
        while (qVar.a() > 0) {
            int u7 = qVar.u();
            int u8 = qVar.f2514b + qVar.u();
            if (u7 == 134) {
                ArrayList arrayList = new ArrayList();
                int u9 = qVar.u() & 31;
                for (int i8 = 0; i8 < u9; i8++) {
                    String s7 = qVar.s(3, z3.h.f16886c);
                    int u10 = qVar.u();
                    if ((u10 & RecognitionOptions.ITF) != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        i7 = u10 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte u11 = (byte) qVar.u();
                    qVar.H(1);
                    if (z7) {
                        list = Collections.singletonList((u11 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C0137q c0137q = new C0137q();
                    c0137q.f1850l = H0.I.l(str);
                    c0137q.f1844d = s7;
                    c0137q.f1836E = i7;
                    c0137q.f1853o = list;
                    arrayList.add(new H0.r(c0137q));
                }
                list2 = arrayList;
            }
            qVar.G(u8);
        }
        return list2;
    }

    public boolean c(int i7) {
        if ((i7 & this.f5011a) != 0) {
            return true;
        }
        return false;
    }

    public C0338f() {
        this.f5011a = 1;
        this.f5012b = Collections.singletonList(null);
    }

    public C0338f(ArrayList arrayList) {
        this.f5011a = 0;
        this.f5012b = arrayList;
    }
}
