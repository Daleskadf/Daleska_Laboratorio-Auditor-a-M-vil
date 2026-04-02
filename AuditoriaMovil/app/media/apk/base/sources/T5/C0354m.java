package T5;

import p6.AbstractC1700c;
/* renamed from: T5.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354m extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f5449a;

    /* renamed from: b  reason: collision with root package name */
    public int f5450b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0355n f5451c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0354m(C0355n c0355n, n6.d dVar) {
        super(dVar);
        this.f5451c = c0355n;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f5449a = obj;
        this.f5450b |= Integer.MIN_VALUE;
        return this.f5451c.a(null, this);
    }
}
