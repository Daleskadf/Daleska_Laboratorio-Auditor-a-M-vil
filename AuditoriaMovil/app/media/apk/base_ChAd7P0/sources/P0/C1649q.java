package p0;

import o6.EnumC1565a;
import p6.AbstractC1700c;
import r0.C1722b;
/* renamed from: p0.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1649q extends p6.i implements w6.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15042a = 1;

    /* renamed from: b  reason: collision with root package name */
    public int f15043b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f15044c;

    public /* synthetic */ C1649q(int i7, n6.d dVar) {
        super(i7, dVar);
    }

    public final Object c(Object obj, Object obj2, AbstractC1700c abstractC1700c) {
        switch (this.f15042a) {
            case 0:
                I6.e eVar = (I6.e) obj;
                Throwable th = (Throwable) obj2;
                return new C1649q((N) this.f15044c, abstractC1700c).invokeSuspend(l6.j.f13876a);
            default:
                ((Boolean) obj2).getClass();
                C1649q c1649q = new C1649q(3, abstractC1700c);
                c1649q.f15044c = (C1722b) obj;
                return c1649q.invokeSuspend(l6.j.f13876a);
        }
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        switch (this.f15042a) {
            case 0:
                EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
                int i7 = this.f15043b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        org.slf4j.helpers.i.M(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    org.slf4j.helpers.i.M(obj);
                    this.f15043b = 1;
                    if (N.a((N) this.f15044c, this) == enumC1565a) {
                        return enumC1565a;
                    }
                }
                return l6.j.f13876a;
            default:
                EnumC1565a enumC1565a2 = EnumC1565a.COROUTINE_SUSPENDED;
                int i8 = this.f15043b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        org.slf4j.helpers.i.M(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    org.slf4j.helpers.i.M(obj);
                    C1722b c1722b = (C1722b) this.f15044c;
                    this.f15043b = 1;
                    c1722b.getClass();
                    obj = C1722b.a(c1722b, this);
                    if (obj == enumC1565a2) {
                        return enumC1565a2;
                    }
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1649q(N n7, n6.d dVar) {
        super(3, dVar);
        this.f15044c = n7;
    }
}
