package kotlinx.coroutines.internal;

import ca.v1;
import k9.f;
/* loaded from: classes3.dex */
public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final y f15728a = new y("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    public static final s9.p f15729b = a.f15732a;

    /* renamed from: c  reason: collision with root package name */
    public static final s9.p f15730c = b.f15733a;

    /* renamed from: d  reason: collision with root package name */
    public static final s9.p f15731d = c.f15734a;

    /* loaded from: classes3.dex */
    public static final class a extends t9.j implements s9.p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15732a = new a();

        public a() {
            super(2);
        }

        @Override // s9.p
        /* renamed from: b */
        public final Object invoke(Object obj, f.b bVar) {
            Integer num;
            int i10;
            if (bVar instanceof v1) {
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = 1;
                }
                if (i10 != 0) {
                    return Integer.valueOf(i10 + 1);
                }
                return bVar;
            }
            return obj;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends t9.j implements s9.p {

        /* renamed from: a  reason: collision with root package name */
        public static final b f15733a = new b();

        public b() {
            super(2);
        }

        @Override // s9.p
        /* renamed from: b */
        public final v1 invoke(v1 v1Var, f.b bVar) {
            if (v1Var != null) {
                return v1Var;
            }
            if (bVar instanceof v1) {
                return (v1) bVar;
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends t9.j implements s9.p {

        /* renamed from: a  reason: collision with root package name */
        public static final c f15734a = new c();

        public c() {
            super(2);
        }

        @Override // s9.p
        /* renamed from: b */
        public final f0 invoke(f0 f0Var, f.b bVar) {
            if (bVar instanceof v1) {
                v1 v1Var = (v1) bVar;
                f0Var.a(v1Var, v1Var.z(f0Var.f15742a));
            }
            return f0Var;
        }
    }

    public static final void a(k9.f fVar, Object obj) {
        if (obj == f15728a) {
            return;
        }
        if (obj instanceof f0) {
            ((f0) obj).b(fVar);
            return;
        }
        Object m10 = fVar.m(null, f15730c);
        if (m10 != null) {
            ((v1) m10).I(fVar, obj);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    public static final Object b(k9.f fVar) {
        Object m10 = fVar.m(0, f15729b);
        t9.i.d(m10);
        return m10;
    }

    public static final Object c(k9.f fVar, Object obj) {
        if (obj == null) {
            obj = b(fVar);
        }
        if (obj == 0) {
            return f15728a;
        }
        if (obj instanceof Integer) {
            return fVar.m(new f0(fVar, ((Number) obj).intValue()), f15731d);
        }
        return ((v1) obj).z(fVar);
    }
}
