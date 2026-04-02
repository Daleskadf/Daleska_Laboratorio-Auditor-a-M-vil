package o6;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import n6.d;
import n6.i;
import p6.AbstractC1700c;
import w6.p;
/* renamed from: o6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1567c extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public int f14605a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f14606b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f14607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1567c(d dVar, i iVar, p pVar, d dVar2) {
        super(dVar, iVar);
        this.f14606b = pVar;
        this.f14607c = dVar2;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f14605a;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f14605a = 2;
                org.slf4j.helpers.i.M(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f14605a = 1;
        org.slf4j.helpers.i.M(obj);
        p pVar = this.f14606b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        u.b(2, pVar);
        return pVar.invoke(this.f14607c, this);
    }
}
