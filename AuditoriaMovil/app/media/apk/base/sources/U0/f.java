package U0;

import f1.AbstractC0980b;
import java.util.List;
/* loaded from: classes.dex */
public final class f extends AbstractC0980b {

    /* renamed from: d  reason: collision with root package name */
    public final List f5551d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5552e;

    public f(List list, long j) {
        super(0L, list.size() - 1);
        this.f5552e = j;
        this.f5551d = list;
    }

    @Override // f1.m
    public final long a() {
        b();
        V0.g gVar = (V0.g) this.f5551d.get((int) this.f10984c);
        return this.f5552e + gVar.f5832e + gVar.f5830c;
    }

    @Override // f1.m
    public final long r() {
        b();
        return this.f5552e + ((V0.g) this.f5551d.get((int) this.f10984c)).f5832e;
    }
}
