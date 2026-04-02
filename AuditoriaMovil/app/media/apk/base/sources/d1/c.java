package d1;

import H0.Q;
import H0.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class c implements Z0.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f10188a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10189b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10190c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10191d;

    /* renamed from: e  reason: collision with root package name */
    public final C0886a f10192e;
    public final b[] f;

    /* renamed from: g  reason: collision with root package name */
    public final long f10193g;

    /* renamed from: h  reason: collision with root package name */
    public final long f10194h;

    public c(int i7, int i8, long j, long j8, int i9, boolean z7, C0886a c0886a, b[] bVarArr) {
        this.f10188a = i7;
        this.f10189b = i8;
        this.f10193g = j;
        this.f10194h = j8;
        this.f10190c = i9;
        this.f10191d = z7;
        this.f10192e = c0886a;
        this.f = bVarArr;
    }

    @Override // Z0.a
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            Q q2 = (Q) arrayList.get(i7);
            b bVar2 = this.f[q2.f1714b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.a((r[]) arrayList3.toArray(new r[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.j[q2.f1715c]);
            i7++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((r[]) arrayList3.toArray(new r[0])));
        }
        return new c(this.f10188a, this.f10189b, this.f10193g, this.f10194h, this.f10190c, this.f10191d, this.f10192e, (b[]) arrayList2.toArray(new b[0]));
    }
}
