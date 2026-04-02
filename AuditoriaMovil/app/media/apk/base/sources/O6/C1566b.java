package o6;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import n6.d;
import org.slf4j.helpers.i;
import p6.AbstractC1704g;
import w6.p;
/* renamed from: o6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1566b extends AbstractC1704g {

    /* renamed from: a  reason: collision with root package name */
    public int f14602a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f14603b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f14604c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566b(d dVar, d dVar2, p pVar) {
        super(dVar);
        this.f14603b = pVar;
        this.f14604c = dVar2;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f14602a;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f14602a = 2;
                i.M(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f14602a = 1;
        i.M(obj);
        p pVar = this.f14603b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        u.b(2, pVar);
        return pVar.invoke(this.f14604c, this);
    }
}
