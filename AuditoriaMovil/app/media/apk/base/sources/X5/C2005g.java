package x5;

import L5.v;
import g5.C1010b;
import k5.C1400c;
import k5.C1401d;
/* renamed from: x5.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2005g extends kotlin.jvm.internal.i implements w6.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16520a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2005g(int i7, Object obj, Class cls, String str, String str2, int i8, int i9) {
        super(i7, obj, cls, str, str2, i8);
        this.f16520a = i9;
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        switch (this.f16520a) {
            case 0:
                C1010b c1010b = (C1010b) obj;
                ((C2006h) this.receiver).getClass();
                if (c1010b == null) {
                    C1400c c1400c = (C1400c) e5.g.c().a(C1400c.class);
                    c1400c.getClass();
                    return c1400c.a(C1401d.f13709f0);
                }
                return ((C1400c) e5.g.c().a(C1400c.class)).a(c1010b);
            default:
                v p02 = (v) obj;
                kotlin.jvm.internal.j.e(p02, "p0");
                ((C5.d) ((I5.b) this.receiver)).b(p02);
                return l6.j.f13876a;
        }
    }
}
