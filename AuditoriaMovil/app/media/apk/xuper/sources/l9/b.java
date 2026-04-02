package l9;

import h9.m;
import k9.f;
import kotlin.coroutines.Continuation;
import m9.g;
import m9.i;
import s9.p;
import t9.a0;
/* loaded from: classes3.dex */
public abstract class b {

    /* loaded from: classes3.dex */
    public static final class a extends i {

        /* renamed from: a  reason: collision with root package name */
        public int f16431a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p f16432b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f16433c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation, p pVar, Object obj) {
            super(continuation);
            this.f16432b = pVar;
            this.f16433c = obj;
            t9.i.e(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // m9.a
        public Object invokeSuspend(Object obj) {
            int i10 = this.f16431a;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f16431a = 2;
                    m.b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f16431a = 1;
            m.b(obj);
            t9.i.e(this.f16432b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((p) a0.c(this.f16432b, 2)).invoke(this.f16433c, this);
        }
    }

    /* renamed from: l9.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0285b extends m9.c {

        /* renamed from: a  reason: collision with root package name */
        public int f16434a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p f16435b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f16436c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0285b(Continuation continuation, f fVar, p pVar, Object obj) {
            super(continuation, fVar);
            this.f16435b = pVar;
            this.f16436c = obj;
            t9.i.e(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // m9.a
        public Object invokeSuspend(Object obj) {
            int i10 = this.f16434a;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f16434a = 2;
                    m.b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f16434a = 1;
            m.b(obj);
            t9.i.e(this.f16435b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((p) a0.c(this.f16435b, 2)).invoke(this.f16436c, this);
        }
    }

    public static final Continuation a(p pVar, Object obj, Continuation continuation) {
        t9.i.g(pVar, "<this>");
        t9.i.g(continuation, "completion");
        Continuation<?> a10 = g.a(continuation);
        if (pVar instanceof m9.a) {
            return ((m9.a) pVar).create(obj, a10);
        }
        f context = a10.getContext();
        if (context == k9.g.f15708a) {
            return new a(a10, pVar, obj);
        }
        return new C0285b(a10, context, pVar, obj);
    }

    public static final Continuation b(Continuation continuation) {
        m9.c cVar;
        Continuation<Object> intercepted;
        t9.i.g(continuation, "<this>");
        if (continuation instanceof m9.c) {
            cVar = (m9.c) continuation;
        } else {
            cVar = null;
        }
        if (cVar != null && (intercepted = cVar.intercepted()) != null) {
            return intercepted;
        }
        return continuation;
    }
}
