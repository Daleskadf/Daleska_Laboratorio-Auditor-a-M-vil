package I6;

import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class h extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f2239a;

    /* renamed from: b  reason: collision with root package name */
    public int f2240b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f2241c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2242d;

    /* renamed from: e  reason: collision with root package name */
    public e f2243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, n6.d dVar) {
        super(dVar);
        this.f2241c = iVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f2239a = obj;
        this.f2240b |= Integer.MIN_VALUE;
        return this.f2241c.c0(null, this);
    }
}
