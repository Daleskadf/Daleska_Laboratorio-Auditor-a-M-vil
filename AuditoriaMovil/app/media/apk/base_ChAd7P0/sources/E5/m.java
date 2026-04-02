package e5;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
/* loaded from: classes.dex */
public final class m extends PhantomReference {

    /* renamed from: a  reason: collision with root package name */
    public final Set f10907a;

    /* renamed from: b  reason: collision with root package name */
    public final l f10908b;

    public /* synthetic */ m(C0965a c0965a, ReferenceQueue referenceQueue, Set set, l lVar) {
        super(c0965a, referenceQueue);
        this.f10907a = set;
        this.f10908b = lVar;
    }
}
