package L4;

import java.util.Date;
/* renamed from: L4.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0213e implements I4.H {
    @Override // I4.H
    public final I4.G create(I4.n nVar, P4.a aVar) {
        if (aVar.f4022a == Date.class) {
            return new C0216h(AbstractC0215g.f2952a);
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
