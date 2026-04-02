package t0;

import java.util.concurrent.atomic.AtomicBoolean;
import l6.j;
import o6.EnumC1565a;
import p6.i;
import w6.p;
/* renamed from: t0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1804c extends i implements p {

    /* renamed from: a  reason: collision with root package name */
    public int f15705a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f15706b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f15707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804c(p pVar, n6.d dVar) {
        super(2, dVar);
        this.f15707c = (i) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p6.i, w6.p] */
    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        C1804c c1804c = new C1804c(this.f15707c, dVar);
        c1804c.f15706b = obj;
        return c1804c;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1804c) create((C1803b) obj, (n6.d) obj2)).invokeSuspend(j.f13876a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [p6.i, w6.p] */
    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f15705a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            this.f15705a = 1;
            obj = this.f15707c.invoke((C1803b) this.f15706b, this);
            if (obj == enumC1565a) {
                return enumC1565a;
            }
        }
        C1803b c1803b = (C1803b) obj;
        kotlin.jvm.internal.j.c(c1803b, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) c1803b.f15704b.f8171b).set(true);
        return c1803b;
    }
}
