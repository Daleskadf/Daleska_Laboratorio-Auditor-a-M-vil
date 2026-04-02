package I6;

import F6.C0100m;
import K6.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class s extends J6.b implements q, d, J6.j {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2282e = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d  reason: collision with root package name */
    public int f2283d;

    public s(Object obj) {
        this._state = obj;
    }

    public final boolean F(Object obj, Object obj2) {
        int i7;
        J6.c[] cVarArr;
        w wVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2282e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.j.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.j.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i8 = this.f2283d;
            if ((i8 & 1) == 0) {
                int i9 = i8 + 1;
                this.f2283d = i9;
                J6.c[] cVarArr2 = (J6.c[]) this.f2427c;
                while (true) {
                    u[] uVarArr = (u[]) cVarArr2;
                    if (uVarArr != null) {
                        for (u uVar : uVarArr) {
                            if (uVar != null) {
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u.f2286a;
                                    Object obj4 = atomicReferenceFieldUpdater2.get(uVar);
                                    if (obj4 != null && obj4 != (wVar = t.f2285b)) {
                                        w wVar2 = t.f2284a;
                                        if (obj4 == wVar2) {
                                            while (!atomicReferenceFieldUpdater2.compareAndSet(uVar, obj4, wVar)) {
                                                if (atomicReferenceFieldUpdater2.get(uVar) != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReferenceFieldUpdater2.compareAndSet(uVar, obj4, wVar2)) {
                                                if (atomicReferenceFieldUpdater2.get(uVar) != obj4) {
                                                    break;
                                                }
                                            }
                                            ((C0100m) obj4).resumeWith(l6.j.f13876a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i7 = this.f2283d;
                        if (i7 == i9) {
                            this.f2283d = i9 + 1;
                            return true;
                        }
                        cVarArr = (J6.c[]) this.f2427c;
                    }
                    cVarArr2 = cVarArr;
                    i9 = i7;
                }
            } else {
                this.f2283d = i8 + 2;
                return true;
            }
        }
    }

    @Override // I6.e
    public final Object a(Object obj, n6.d dVar) {
        if (obj == null) {
            obj = J6.l.f2445a;
        }
        F(null, obj);
        return l6.j.f13876a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e6, code lost:
        if (r0.equals(r4) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4 A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00cc, B:52:0x00d4, B:55:0x00db, B:56:0x00df, B:58:0x00e2, B:68:0x0103, B:71:0x0116, B:72:0x012e, B:78:0x0142, B:75:0x0139, B:77:0x013f, B:60:0x00e8, B:64:0x00ef, B:21:0x0053, B:24:0x005e, B:49:0x00bd), top: B:91:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116 A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00cc, B:52:0x00d4, B:55:0x00db, B:56:0x00df, B:58:0x00e2, B:68:0x0103, B:71:0x0116, B:72:0x012e, B:78:0x0142, B:75:0x0139, B:77:0x013f, B:60:0x00e8, B:64:0x00ef, B:21:0x0053, B:24:0x005e, B:49:0x00bd), top: B:91:0x0026 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0115 -> B:50:0x00cc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x014b -> B:83:0x014e). Please submit an issue!!! */
    @Override // I6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c0(I6.e r17, n6.d r18) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I6.s.c0(I6.e, n6.d):java.lang.Object");
    }

    @Override // J6.j
    public final d r(n6.i iVar, int i7, H6.a aVar) {
        if ((((i7 >= 0 && i7 < 2) || i7 == -2) && aVar == H6.a.DROP_OLDEST) || ((i7 == 0 || i7 == -3) && aVar == H6.a.SUSPEND)) {
            return this;
        }
        return new J6.h(this, iVar, i7, aVar);
    }
}
