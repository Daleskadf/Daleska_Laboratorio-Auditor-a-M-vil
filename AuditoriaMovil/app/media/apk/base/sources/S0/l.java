package S0;

import A3.K;
import android.net.Uri;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: X  reason: collision with root package name */
    public final C5.i f4891X;
    public final j f;

    public l(long j, H0.r rVar, K k2, r rVar2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(rVar, k2, rVar2, arrayList, arrayList2, arrayList3);
        j jVar;
        Uri.parse(((b) k2.get(0)).f4843a);
        long j8 = rVar2.f4907e;
        if (j8 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar2.f4906d, j8, null);
        }
        this.f = jVar;
        this.f4891X = jVar == null ? new C5.i(new j(0L, -1L, null), 20) : null;
    }

    @Override // S0.m
    public final String a() {
        return null;
    }

    @Override // S0.m
    public final R0.i d() {
        return this.f4891X;
    }

    @Override // S0.m
    public final j e() {
        return this.f;
    }
}
