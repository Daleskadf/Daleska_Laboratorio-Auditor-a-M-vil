package j2;

import B5.C0050x;
import F6.D;
import I6.d;
import I6.o;
import l6.j;
import o6.EnumC1565a;
import p6.i;
import w6.p;
/* renamed from: j2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1363a extends i implements p {

    /* renamed from: a  reason: collision with root package name */
    public int f13423a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f13424b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0050x f13425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1363a(d dVar, C0050x c0050x, n6.d dVar2) {
        super(2, dVar2);
        this.f13424b = dVar;
        this.f13425c = c0050x;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        return new C1363a(this.f13424b, this.f13425c, dVar);
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1363a) create((D) obj, (n6.d) obj2)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f13423a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            o oVar = new o(this.f13425c, 1);
            this.f13423a = 1;
            if (this.f13424b.c0(oVar, this) == enumC1565a) {
                return enumC1565a;
            }
        }
        return j.f13876a;
    }
}
