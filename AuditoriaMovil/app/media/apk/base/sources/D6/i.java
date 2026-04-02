package D6;

import java.util.Iterator;
import x6.InterfaceC2020a;
/* loaded from: classes.dex */
public final class i implements Iterable, InterfaceC2020a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ E6.c f904a;

    public i(E6.c cVar) {
        this.f904a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new E6.b(this.f904a);
    }
}
