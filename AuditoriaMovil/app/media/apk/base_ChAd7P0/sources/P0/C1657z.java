package p0;

import p6.AbstractC1700c;
/* renamed from: p0.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1657z extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public N f15076a;

    /* renamed from: b  reason: collision with root package name */
    public Y f15077b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15078c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f15079d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ N f15080e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1657z(N n7, n6.d dVar) {
        super(dVar);
        this.f15080e = n7;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f15079d = obj;
        this.f |= Integer.MIN_VALUE;
        return N.d(this.f15080e, false, this);
    }
}
