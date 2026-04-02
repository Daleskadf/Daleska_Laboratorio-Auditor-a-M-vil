package D6;

import E6.l;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a  reason: collision with root package name */
    public final E6.c f907a;

    /* renamed from: b  reason: collision with root package name */
    public final l f908b;

    public k(E6.c cVar, l lVar) {
        this.f907a = cVar;
        this.f908b = lVar;
    }

    @Override // D6.d
    public final Iterator iterator() {
        return new j(this);
    }
}
