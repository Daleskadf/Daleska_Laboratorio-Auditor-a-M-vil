package J6;

import F6.H;
import java.util.ArrayList;
import m6.AbstractC1447h;
import o6.EnumC1565a;
/* loaded from: classes.dex */
public abstract class f implements j {

    /* renamed from: a  reason: collision with root package name */
    public final n6.i f2435a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2436b;

    /* renamed from: c  reason: collision with root package name */
    public final H6.a f2437c;

    public f(n6.i iVar, int i7, H6.a aVar) {
        this.f2435a = iVar;
        this.f2436b = i7;
        this.f2437c = aVar;
    }

    public abstract Object a(H6.p pVar, n6.d dVar);

    public abstract f b(n6.i iVar, int i7, H6.a aVar);

    @Override // I6.d
    public Object c0(I6.e eVar, n6.d dVar) {
        Object e7 = H.e(new d(eVar, this, null), dVar);
        if (e7 != EnumC1565a.COROUTINE_SUSPENDED) {
            return l6.j.f13876a;
        }
        return e7;
    }

    @Override // J6.j
    public final I6.d r(n6.i iVar, int i7, H6.a aVar) {
        n6.i iVar2 = this.f2435a;
        n6.i plus = iVar.plus(iVar2);
        H6.a aVar2 = H6.a.SUSPEND;
        H6.a aVar3 = this.f2437c;
        int i8 = this.f2436b;
        if (aVar == aVar2) {
            if (i8 != -3) {
                if (i7 != -3) {
                    if (i8 != -2) {
                        if (i7 != -2) {
                            i7 += i8;
                            if (i7 < 0) {
                                i7 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                            }
                        }
                    }
                }
                i7 = i8;
            }
            aVar = aVar3;
        }
        if (kotlin.jvm.internal.j.a(plus, iVar2) && i7 == i8 && aVar == aVar3) {
            return this;
        }
        return b(plus, i7, aVar);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        n6.j jVar = n6.j.f14394a;
        n6.i iVar = this.f2435a;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i7 = this.f2436b;
        if (i7 != -3) {
            arrayList.add("capacity=" + i7);
        }
        H6.a aVar = H6.a.SUSPEND;
        H6.a aVar2 = this.f2437c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + AbstractC1447h.R(arrayList, ", ", null, null, null, 62) + ']';
    }
}
