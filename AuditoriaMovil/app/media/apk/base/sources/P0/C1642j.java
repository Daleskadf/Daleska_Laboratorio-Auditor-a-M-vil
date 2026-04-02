package p0;

import p6.AbstractC1700c;
/* renamed from: p0.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1642j extends AbstractC1700c {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ C1643k f15016X;

    /* renamed from: Y  reason: collision with root package name */
    public int f15017Y;

    /* renamed from: a  reason: collision with root package name */
    public Object f15018a;

    /* renamed from: b  reason: collision with root package name */
    public Object f15019b;

    /* renamed from: c  reason: collision with root package name */
    public Object f15020c;

    /* renamed from: d  reason: collision with root package name */
    public kotlin.jvm.internal.r f15021d;

    /* renamed from: e  reason: collision with root package name */
    public N f15022e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1642j(C1643k c1643k, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f15016X = c1643k;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.f15017Y |= Integer.MIN_VALUE;
        return this.f15016X.a(null, this);
    }
}
