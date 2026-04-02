package l2;

import B5.C0050x;
import android.app.Activity;
import m2.InterfaceC1435a;
import o6.EnumC1565a;
import w6.p;
/* loaded from: classes.dex */
public final class j extends p6.i implements p {

    /* renamed from: a  reason: collision with root package name */
    public int f13836a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f13837b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f13838c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Activity f13839d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, Activity activity, n6.d dVar) {
        super(2, dVar);
        this.f13838c = bVar;
        this.f13839d = activity;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        j jVar = new j(this.f13838c, this.f13839d, dVar);
        jVar.f13837b = obj;
        return jVar;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((H6.p) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f13836a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            H6.p pVar = (H6.p) this.f13837b;
            C0050x c0050x = new C0050x(pVar, 3);
            b bVar = this.f13838c;
            ((InterfaceC1435a) bVar.f13820b).b(this.f13839d, new W1.c(0), c0050x);
            i iVar = new i(0, bVar, c0050x);
            this.f13836a = 1;
            if (H6.j.b(pVar, iVar, this) == enumC1565a) {
                return enumC1565a;
            }
        }
        return l6.j.f13876a;
    }
}
