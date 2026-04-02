package n4;

import java.util.List;
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final q4.o f14317a;

    /* renamed from: b  reason: collision with root package name */
    public final r4.f f14318b;

    /* renamed from: c  reason: collision with root package name */
    public final List f14319c;

    public /* synthetic */ O(q4.o oVar, r4.f fVar, List list) {
        this.f14317a = oVar;
        this.f14318b = fVar;
        this.f14319c = list;
    }

    public r4.h a(q4.h hVar, r4.m mVar) {
        r4.f fVar = this.f14318b;
        if (fVar != null) {
            return new r4.l(hVar, this.f14317a, fVar, mVar, this.f14319c);
        }
        return new r4.o(hVar, this.f14317a, mVar, this.f14319c);
    }
}
