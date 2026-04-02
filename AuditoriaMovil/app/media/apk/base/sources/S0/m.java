package S0;

import A3.K;
import K0.x;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public final H0.r f4892a;

    /* renamed from: b  reason: collision with root package name */
    public final K f4893b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4894c;

    /* renamed from: d  reason: collision with root package name */
    public final List f4895d;

    /* renamed from: e  reason: collision with root package name */
    public final j f4896e;

    public m(H0.r rVar, K k2, s sVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        List unmodifiableList;
        K0.a.e(!k2.isEmpty());
        this.f4892a = rVar;
        this.f4893b = K.p(k2);
        if (arrayList == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f4895d = unmodifiableList;
        this.f4896e = sVar.a(this);
        int i7 = x.f2529a;
        this.f4894c = x.U(sVar.f4910c, 1000000L, sVar.f4909b, RoundingMode.FLOOR);
    }

    public abstract String a();

    public abstract R0.i d();

    public abstract j e();
}
