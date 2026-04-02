package K4;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
/* loaded from: classes.dex */
public final class o extends AbstractMap implements Serializable {

    /* renamed from: Z  reason: collision with root package name */
    public static final k f2680Z = new k(0);

    /* renamed from: X  reason: collision with root package name */
    public m f2681X;

    /* renamed from: Y  reason: collision with root package name */
    public m f2682Y;

    /* renamed from: a  reason: collision with root package name */
    public final Comparator f2683a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2684b;

    /* renamed from: c  reason: collision with root package name */
    public n f2685c;

    /* renamed from: d  reason: collision with root package name */
    public int f2686d;

    /* renamed from: e  reason: collision with root package name */
    public int f2687e;
    public final n f;

    public o(boolean z7) {
        k kVar = f2680Z;
        this.f2686d = 0;
        this.f2687e = 0;
        this.f2683a = kVar;
        this.f2684b = z7;
        this.f = new n(z7);
    }

    public final n a(Object obj, boolean z7) {
        int i7;
        n nVar;
        Comparable comparable;
        n nVar2;
        n nVar3 = this.f2685c;
        k kVar = f2680Z;
        Comparator comparator = this.f2683a;
        if (nVar3 != null) {
            if (comparator == kVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = nVar3.f;
                if (comparable != null) {
                    i7 = comparable.compareTo(obj2);
                } else {
                    i7 = comparator.compare(obj, obj2);
                }
                if (i7 == 0) {
                    return nVar3;
                }
                if (i7 < 0) {
                    nVar2 = nVar3.f2676b;
                } else {
                    nVar2 = nVar3.f2677c;
                }
                if (nVar2 == null) {
                    break;
                }
                nVar3 = nVar2;
            }
        } else {
            i7 = 0;
        }
        if (!z7) {
            return null;
        }
        n nVar4 = this.f;
        if (nVar3 == null) {
            if (comparator == kVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            nVar = new n(this.f2684b, nVar3, obj, nVar4, nVar4.f2679e);
            this.f2685c = nVar;
        } else {
            nVar = new n(this.f2684b, nVar3, obj, nVar4, nVar4.f2679e);
            if (i7 < 0) {
                nVar3.f2676b = nVar;
            } else {
                nVar3.f2677c = nVar;
            }
            b(nVar3, true);
        }
        this.f2686d++;
        this.f2687e++;
        return nVar;
    }

    public final void b(n nVar, boolean z7) {
        int i7;
        int i8;
        int i9;
        int i10;
        while (nVar != null) {
            n nVar2 = nVar.f2676b;
            n nVar3 = nVar.f2677c;
            int i11 = 0;
            if (nVar2 != null) {
                i7 = nVar2.f2674Z;
            } else {
                i7 = 0;
            }
            if (nVar3 != null) {
                i8 = nVar3.f2674Z;
            } else {
                i8 = 0;
            }
            int i12 = i7 - i8;
            if (i12 == -2) {
                n nVar4 = nVar3.f2676b;
                n nVar5 = nVar3.f2677c;
                if (nVar5 != null) {
                    i10 = nVar5.f2674Z;
                } else {
                    i10 = 0;
                }
                if (nVar4 != null) {
                    i11 = nVar4.f2674Z;
                }
                int i13 = i11 - i10;
                if (i13 != -1 && (i13 != 0 || z7)) {
                    f(nVar3);
                    e(nVar);
                } else {
                    e(nVar);
                }
                if (z7) {
                    return;
                }
            } else if (i12 == 2) {
                n nVar6 = nVar2.f2676b;
                n nVar7 = nVar2.f2677c;
                if (nVar7 != null) {
                    i9 = nVar7.f2674Z;
                } else {
                    i9 = 0;
                }
                if (nVar6 != null) {
                    i11 = nVar6.f2674Z;
                }
                int i14 = i11 - i9;
                if (i14 != 1 && (i14 != 0 || z7)) {
                    e(nVar2);
                    f(nVar);
                } else {
                    f(nVar);
                }
                if (z7) {
                    return;
                }
            } else if (i12 == 0) {
                nVar.f2674Z = i7 + 1;
                if (z7) {
                    return;
                }
            } else {
                nVar.f2674Z = Math.max(i7, i8) + 1;
                if (!z7) {
                    return;
                }
            }
            nVar = nVar.f2675a;
        }
    }

    public final void c(n nVar, boolean z7) {
        n nVar2;
        n nVar3;
        int i7;
        if (z7) {
            n nVar4 = nVar.f2679e;
            nVar4.f2678d = nVar.f2678d;
            nVar.f2678d.f2679e = nVar4;
        }
        n nVar5 = nVar.f2676b;
        n nVar6 = nVar.f2677c;
        n nVar7 = nVar.f2675a;
        int i8 = 0;
        if (nVar5 != null && nVar6 != null) {
            if (nVar5.f2674Z > nVar6.f2674Z) {
                n nVar8 = nVar5.f2677c;
                while (true) {
                    n nVar9 = nVar8;
                    nVar3 = nVar5;
                    nVar5 = nVar9;
                    if (nVar5 == null) {
                        break;
                    }
                    nVar8 = nVar5.f2677c;
                }
            } else {
                n nVar10 = nVar6.f2676b;
                while (true) {
                    nVar2 = nVar6;
                    nVar6 = nVar10;
                    if (nVar6 == null) {
                        break;
                    }
                    nVar10 = nVar6.f2676b;
                }
                nVar3 = nVar2;
            }
            c(nVar3, false);
            n nVar11 = nVar.f2676b;
            if (nVar11 != null) {
                i7 = nVar11.f2674Z;
                nVar3.f2676b = nVar11;
                nVar11.f2675a = nVar3;
                nVar.f2676b = null;
            } else {
                i7 = 0;
            }
            n nVar12 = nVar.f2677c;
            if (nVar12 != null) {
                i8 = nVar12.f2674Z;
                nVar3.f2677c = nVar12;
                nVar12.f2675a = nVar3;
                nVar.f2677c = null;
            }
            nVar3.f2674Z = Math.max(i7, i8) + 1;
            d(nVar, nVar3);
            return;
        }
        if (nVar5 != null) {
            d(nVar, nVar5);
            nVar.f2676b = null;
        } else if (nVar6 != null) {
            d(nVar, nVar6);
            nVar.f2677c = null;
        } else {
            d(nVar, null);
        }
        b(nVar7, false);
        this.f2686d--;
        this.f2687e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f2685c = null;
        this.f2686d = 0;
        this.f2687e++;
        n nVar = this.f;
        nVar.f2679e = nVar;
        nVar.f2678d = nVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        n nVar = null;
        if (obj != null) {
            try {
                nVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (nVar == null) {
            return false;
        }
        return true;
    }

    public final void d(n nVar, n nVar2) {
        n nVar3 = nVar.f2675a;
        nVar.f2675a = null;
        if (nVar2 != null) {
            nVar2.f2675a = nVar3;
        }
        if (nVar3 != null) {
            if (nVar3.f2676b == nVar) {
                nVar3.f2676b = nVar2;
                return;
            } else {
                nVar3.f2677c = nVar2;
                return;
            }
        }
        this.f2685c = nVar2;
    }

    public final void e(n nVar) {
        int i7;
        int i8;
        n nVar2 = nVar.f2676b;
        n nVar3 = nVar.f2677c;
        n nVar4 = nVar3.f2676b;
        n nVar5 = nVar3.f2677c;
        nVar.f2677c = nVar4;
        if (nVar4 != null) {
            nVar4.f2675a = nVar;
        }
        d(nVar, nVar3);
        nVar3.f2676b = nVar;
        nVar.f2675a = nVar3;
        int i9 = 0;
        if (nVar2 != null) {
            i7 = nVar2.f2674Z;
        } else {
            i7 = 0;
        }
        if (nVar4 != null) {
            i8 = nVar4.f2674Z;
        } else {
            i8 = 0;
        }
        int max = Math.max(i7, i8) + 1;
        nVar.f2674Z = max;
        if (nVar5 != null) {
            i9 = nVar5.f2674Z;
        }
        nVar3.f2674Z = Math.max(max, i9) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        m mVar = this.f2681X;
        if (mVar == null) {
            m mVar2 = new m(this, 0);
            this.f2681X = mVar2;
            return mVar2;
        }
        return mVar;
    }

    public final void f(n nVar) {
        int i7;
        int i8;
        n nVar2 = nVar.f2676b;
        n nVar3 = nVar.f2677c;
        n nVar4 = nVar2.f2676b;
        n nVar5 = nVar2.f2677c;
        nVar.f2676b = nVar5;
        if (nVar5 != null) {
            nVar5.f2675a = nVar;
        }
        d(nVar, nVar2);
        nVar2.f2677c = nVar;
        nVar.f2675a = nVar2;
        int i9 = 0;
        if (nVar3 != null) {
            i7 = nVar3.f2674Z;
        } else {
            i7 = 0;
        }
        if (nVar5 != null) {
            i8 = nVar5.f2674Z;
        } else {
            i8 = 0;
        }
        int max = Math.max(i7, i8) + 1;
        nVar.f2674Z = max;
        if (nVar4 != null) {
            i9 = nVar4.f2674Z;
        }
        nVar2.f2674Z = Math.max(max, i9) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            K4.n r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Le
            java.lang.Object r0 = r3.f2673Y
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K4.o.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        m mVar = this.f2682Y;
        if (mVar == null) {
            m mVar2 = new m(this, 1);
            this.f2682Y = mVar2;
            return mVar2;
        }
        return mVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.f2684b) {
                throw new NullPointerException("value == null");
            }
            n a7 = a(obj, true);
            Object obj3 = a7.f2673Y;
            a7.f2673Y = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            K4.n r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.c(r3, r1)
        L10:
            if (r3 == 0) goto L14
            java.lang.Object r0 = r3.f2673Y
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K4.o.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2686d;
    }
}
