package p0;

import java.io.Serializable;
import p6.AbstractC1700c;
/* renamed from: p0.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1624C extends AbstractC1700c {

    /* renamed from: X  reason: collision with root package name */
    public /* synthetic */ Object f14908X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ N f14909Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f14910Z;

    /* renamed from: a  reason: collision with root package name */
    public Object f14911a;

    /* renamed from: b  reason: collision with root package name */
    public Object f14912b;

    /* renamed from: c  reason: collision with root package name */
    public Serializable f14913c;

    /* renamed from: d  reason: collision with root package name */
    public kotlin.jvm.internal.r f14914d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14915e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1624C(N n7, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f14909Y = n7;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f14908X = obj;
        this.f14910Z |= Integer.MIN_VALUE;
        return N.e(this.f14909Y, false, this);
    }
}
