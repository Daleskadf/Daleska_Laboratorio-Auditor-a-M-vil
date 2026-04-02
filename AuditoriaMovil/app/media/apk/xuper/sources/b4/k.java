package b4;

import java.util.Arrays;
import k3.c0;
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4611a;

    /* loaded from: classes.dex */
    public static final class a extends k {

        /* renamed from: b  reason: collision with root package name */
        public final Class f4612b;

        /* renamed from: c  reason: collision with root package name */
        public final Class f4613c;

        /* renamed from: d  reason: collision with root package name */
        public final k3.o f4614d;

        /* renamed from: e  reason: collision with root package name */
        public final k3.o f4615e;

        public a(k kVar, Class cls, k3.o oVar, Class cls2, k3.o oVar2) {
            super(kVar);
            this.f4612b = cls;
            this.f4614d = oVar;
            this.f4613c = cls2;
            this.f4615e = oVar2;
        }

        @Override // b4.k
        public k i(Class cls, k3.o oVar) {
            return new c(this, new f[]{new f(this.f4612b, this.f4614d), new f(this.f4613c, this.f4615e), new f(cls, oVar)});
        }

        @Override // b4.k
        public k3.o j(Class cls) {
            if (cls == this.f4612b) {
                return this.f4614d;
            }
            if (cls == this.f4613c) {
                return this.f4615e;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends k {

        /* renamed from: b  reason: collision with root package name */
        public static final b f4616b = new b(false);

        /* renamed from: c  reason: collision with root package name */
        public static final b f4617c = new b(true);

        public b(boolean z10) {
            super(z10);
        }

        @Override // b4.k
        public k i(Class cls, k3.o oVar) {
            return new e(this, cls, oVar);
        }

        @Override // b4.k
        public k3.o j(Class cls) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends k {

        /* renamed from: b  reason: collision with root package name */
        public final f[] f4618b;

        public c(k kVar, f[] fVarArr) {
            super(kVar);
            this.f4618b = fVarArr;
        }

        @Override // b4.k
        public k i(Class cls, k3.o oVar) {
            f[] fVarArr = this.f4618b;
            int length = fVarArr.length;
            if (length == 8) {
                if (this.f4611a) {
                    return new e(this, cls, oVar);
                }
                return this;
            }
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, length + 1);
            fVarArr2[length] = new f(cls, oVar);
            return new c(this, fVarArr2);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0057 A[ORIG_RETURN, RETURN] */
        @Override // b4.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public k3.o j(java.lang.Class r4) {
            /*
                r3 = this;
                b4.k$f[] r0 = r3.f4618b
                r1 = 0
                r1 = r0[r1]
                java.lang.Class r2 = r1.f4623a
                if (r2 != r4) goto Lc
                k3.o r4 = r1.f4624b
                return r4
            Lc:
                r1 = 1
                r1 = r0[r1]
                java.lang.Class r2 = r1.f4623a
                if (r2 != r4) goto L16
                k3.o r4 = r1.f4624b
                return r4
            L16:
                r1 = 2
                r1 = r0[r1]
                java.lang.Class r2 = r1.f4623a
                if (r2 != r4) goto L20
                k3.o r4 = r1.f4624b
                return r4
            L20:
                int r1 = r0.length
                switch(r1) {
                    case 4: goto L4d;
                    case 5: goto L43;
                    case 6: goto L39;
                    case 7: goto L2f;
                    case 8: goto L25;
                    default: goto L24;
                }
            L24:
                goto L57
            L25:
                r1 = 7
                r1 = r0[r1]
                java.lang.Class r2 = r1.f4623a
                if (r2 != r4) goto L2f
                k3.o r4 = r1.f4624b
                return r4
            L2f:
                r1 = 6
                r1 = r0[r1]
                java.lang.Class r2 = r1.f4623a
                if (r2 != r4) goto L39
                k3.o r4 = r1.f4624b
                return r4
            L39:
                r1 = 5
                r1 = r0[r1]
                java.lang.Class r2 = r1.f4623a
                if (r2 != r4) goto L43
                k3.o r4 = r1.f4624b
                return r4
            L43:
                r1 = 4
                r1 = r0[r1]
                java.lang.Class r2 = r1.f4623a
                if (r2 != r4) goto L4d
                k3.o r4 = r1.f4624b
                return r4
            L4d:
                r1 = 3
                r0 = r0[r1]
                java.lang.Class r1 = r0.f4623a
                if (r1 != r4) goto L57
                k3.o r4 = r0.f4624b
                return r4
            L57:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: b4.k.c.j(java.lang.Class):k3.o");
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final k3.o f4619a;

        /* renamed from: b  reason: collision with root package name */
        public final k f4620b;

        public d(k3.o oVar, k kVar) {
            this.f4619a = oVar;
            this.f4620b = kVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends k {

        /* renamed from: b  reason: collision with root package name */
        public final Class f4621b;

        /* renamed from: c  reason: collision with root package name */
        public final k3.o f4622c;

        public e(k kVar, Class cls, k3.o oVar) {
            super(kVar);
            this.f4621b = cls;
            this.f4622c = oVar;
        }

        @Override // b4.k
        public k i(Class cls, k3.o oVar) {
            return new a(this, this.f4621b, this.f4622c, cls, oVar);
        }

        @Override // b4.k
        public k3.o j(Class cls) {
            if (cls == this.f4621b) {
                return this.f4622c;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final Class f4623a;

        /* renamed from: b  reason: collision with root package name */
        public final k3.o f4624b;

        public f(Class cls, k3.o oVar) {
            this.f4623a = cls;
            this.f4624b = oVar;
        }
    }

    public k(boolean z10) {
        this.f4611a = z10;
    }

    public static k c() {
        return b.f4616b;
    }

    public final d a(Class cls, k3.o oVar) {
        return new d(oVar, i(cls, oVar));
    }

    public final d b(k3.j jVar, k3.o oVar) {
        return new d(oVar, i(jVar.q(), oVar));
    }

    public final d d(Class cls, c0 c0Var, k3.d dVar) {
        k3.o I = c0Var.I(cls, dVar);
        return new d(I, i(cls, I));
    }

    public final d e(Class cls, c0 c0Var, k3.d dVar) {
        k3.o N = c0Var.N(cls, dVar);
        return new d(N, i(cls, N));
    }

    public final d f(k3.j jVar, c0 c0Var, k3.d dVar) {
        k3.o O = c0Var.O(jVar, dVar);
        return new d(O, i(jVar.q(), O));
    }

    public final d g(Class cls, c0 c0Var, k3.d dVar) {
        k3.o G = c0Var.G(cls, dVar);
        return new d(G, i(cls, G));
    }

    public final d h(k3.j jVar, c0 c0Var, k3.d dVar) {
        k3.o H = c0Var.H(jVar, dVar);
        return new d(H, i(jVar.q(), H));
    }

    public abstract k i(Class cls, k3.o oVar);

    public abstract k3.o j(Class cls);

    public k(k kVar) {
        this.f4611a = kVar.f4611a;
    }
}
