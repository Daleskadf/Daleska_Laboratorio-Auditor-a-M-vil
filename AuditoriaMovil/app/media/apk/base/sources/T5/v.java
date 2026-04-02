package T5;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p6.AbstractC1700c;
import t0.C1805d;
/* loaded from: classes.dex */
public final class v extends AbstractC1700c {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ K f5482X;

    /* renamed from: Y  reason: collision with root package name */
    public int f5483Y;

    /* renamed from: a  reason: collision with root package name */
    public K f5484a;

    /* renamed from: b  reason: collision with root package name */
    public Set f5485b;

    /* renamed from: c  reason: collision with root package name */
    public Map f5486c;

    /* renamed from: d  reason: collision with root package name */
    public Iterator f5487d;

    /* renamed from: e  reason: collision with root package name */
    public C1805d f5488e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(K k2, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f5482X = k2;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.f5483Y |= Integer.MIN_VALUE;
        return K.b(this.f5482X, null, this);
    }
}
