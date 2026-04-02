package n6;

import kotlin.jvm.internal.k;
import w6.p;
/* renamed from: n6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1536b extends k implements p {

    /* renamed from: b  reason: collision with root package name */
    public static final C1536b f14388b = new C1536b(2, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final C1536b f14389c = new C1536b(2, 1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14390a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1536b(int i7, int i8) {
        super(i7);
        this.f14390a = i8;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        switch (this.f14390a) {
            case 0:
                String acc = (String) obj;
                g element = (g) obj2;
                kotlin.jvm.internal.j.e(acc, "acc");
                kotlin.jvm.internal.j.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                i acc2 = (i) obj;
                g element2 = (g) obj2;
                kotlin.jvm.internal.j.e(acc2, "acc");
                kotlin.jvm.internal.j.e(element2, "element");
                i minusKey = acc2.minusKey(element2.getKey());
                j jVar = j.f14394a;
                if (minusKey != jVar) {
                    e eVar = e.f14393a;
                    f fVar = (f) minusKey.get(eVar);
                    if (fVar == null) {
                        cVar = new c(element2, minusKey);
                    } else {
                        i minusKey2 = minusKey.minusKey(eVar);
                        if (minusKey2 == jVar) {
                            return new c(fVar, element2);
                        }
                        cVar = new c(fVar, new c(element2, minusKey2));
                    }
                    return cVar;
                }
                return element2;
        }
    }
}
