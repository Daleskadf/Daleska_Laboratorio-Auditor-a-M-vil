package i6;

import a6.AbstractC0480i;
import a6.AbstractC0482k;
import a6.C0481j;
import a6.e0;
/* renamed from: i6.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1130q extends AbstractC0480i {

    /* renamed from: a  reason: collision with root package name */
    public final C1124k f11551a;

    /* renamed from: b  reason: collision with root package name */
    public final C1130q f11552b;

    public C1130q(C1124k c1124k, C1130q c1130q) {
        this.f11551a = c1124k;
        this.f11552b = c1130q;
    }

    @Override // a6.AbstractC0480i
    public final AbstractC0482k a(C0481j c0481j, e0 e0Var) {
        C1130q c1130q = this.f11552b;
        if (c1130q != null) {
            return new C1128o(this, c1130q.a(c0481j, e0Var));
        }
        return new C1129p(this);
    }
}
