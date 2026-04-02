package b4;

import java.util.List;
import k3.b0;
import k3.c0;
/* loaded from: classes.dex */
public final class e extends com.fasterxml.jackson.databind.ser.std.b {
    public e(k3.j jVar, boolean z10, w3.h hVar, k3.o oVar) {
        super(List.class, jVar, z10, hVar, oVar);
    }

    @Override // a4.h
    public a4.h c(w3.h hVar) {
        return new e(this, this.f6657b, hVar, this.f6661f, this.f6659d);
    }

    @Override // k3.o
    /* renamed from: i */
    public boolean isEmpty(c0 c0Var, List list) {
        return list.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.i0, k3.o
    /* renamed from: j */
    public final void serialize(List list, c3.h hVar, c0 c0Var) {
        int size = list.size();
        if (size == 1 && ((this.f6659d == null && c0Var.m0(b0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f6659d == Boolean.TRUE)) {
            g(list, hVar, c0Var);
            return;
        }
        hVar.u0(list, size);
        g(list, hVar, c0Var);
        hVar.V();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.b
    /* renamed from: k */
    public void g(List list, c3.h hVar, c0 c0Var) {
        k3.o e10;
        k3.o oVar = this.f6661f;
        if (oVar != null) {
            l(list, hVar, c0Var, oVar);
        } else if (this.f6660e != null) {
            m(list, hVar, c0Var);
        } else {
            int size = list.size();
            if (size == 0) {
                return;
            }
            int i10 = 0;
            try {
                k kVar = this.f6662g;
                while (i10 < size) {
                    Object obj = list.get(i10);
                    if (obj == null) {
                        c0Var.E(hVar);
                    } else {
                        Class<?> cls = obj.getClass();
                        k3.o j10 = kVar.j(cls);
                        if (j10 == null) {
                            if (this.f6656a.w()) {
                                e10 = f(kVar, c0Var.A(this.f6656a, cls), c0Var);
                            } else {
                                e10 = e(kVar, cls, c0Var);
                            }
                            j10 = e10;
                            kVar = this.f6662g;
                        }
                        j10.serialize(obj, hVar, c0Var);
                    }
                    i10++;
                }
            } catch (Exception e11) {
                wrapAndThrow(c0Var, e11, list, i10);
            }
        }
    }

    public void l(List list, c3.h hVar, c0 c0Var, k3.o oVar) {
        int size = list.size();
        if (size == 0) {
            return;
        }
        w3.h hVar2 = this.f6660e;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == null) {
                try {
                    c0Var.E(hVar);
                } catch (Exception e10) {
                    wrapAndThrow(c0Var, e10, list, i10);
                }
            } else if (hVar2 == null) {
                oVar.serialize(obj, hVar, c0Var);
            } else {
                oVar.serializeWithType(obj, hVar, c0Var, hVar2);
            }
        }
    }

    public void m(List list, c3.h hVar, c0 c0Var) {
        k3.o e10;
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i10 = 0;
        try {
            w3.h hVar2 = this.f6660e;
            k kVar = this.f6662g;
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj == null) {
                    c0Var.E(hVar);
                } else {
                    Class<?> cls = obj.getClass();
                    k3.o j10 = kVar.j(cls);
                    if (j10 == null) {
                        if (this.f6656a.w()) {
                            e10 = f(kVar, c0Var.A(this.f6656a, cls), c0Var);
                        } else {
                            e10 = e(kVar, cls, c0Var);
                        }
                        j10 = e10;
                        kVar = this.f6662g;
                    }
                    j10.serializeWithType(obj, hVar, c0Var, hVar2);
                }
                i10++;
            }
        } catch (Exception e11) {
            wrapAndThrow(c0Var, e11, list, i10);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.b
    /* renamed from: n */
    public e h(k3.d dVar, w3.h hVar, k3.o oVar, Boolean bool) {
        return new e(this, dVar, hVar, oVar, bool);
    }

    public e(e eVar, k3.d dVar, w3.h hVar, k3.o oVar, Boolean bool) {
        super(eVar, dVar, hVar, oVar, bool);
    }
}
