package n6;

import java.io.Serializable;
import org.apache.tika.utils.StringUtils;
import w6.p;
/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final i f14391a;

    /* renamed from: b  reason: collision with root package name */
    public final g f14392b;

    public c(g element, i left) {
        kotlin.jvm.internal.j.e(left, "left");
        kotlin.jvm.internal.j.e(element, "element");
        this.f14391a = left;
        this.f14392b = element;
    }

    public final boolean equals(Object obj) {
        boolean z7;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i7 = 2;
            c cVar2 = cVar;
            int i8 = 2;
            while (true) {
                i iVar = cVar2.f14391a;
                if (iVar instanceof c) {
                    cVar2 = (c) iVar;
                } else {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    break;
                }
                i8++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f14391a;
                if (iVar2 instanceof c) {
                    cVar3 = (c) iVar2;
                } else {
                    cVar3 = null;
                }
                if (cVar3 == null) {
                    break;
                }
                i7++;
            }
            if (i8 != i7) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                g gVar = cVar4.f14392b;
                if (!kotlin.jvm.internal.j.a(cVar.get(gVar.getKey()), gVar)) {
                    z7 = false;
                    break;
                }
                i iVar3 = cVar4.f14391a;
                if (iVar3 instanceof c) {
                    cVar4 = (c) iVar3;
                } else {
                    kotlin.jvm.internal.j.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    z7 = kotlin.jvm.internal.j.a(cVar.get(gVar2.getKey()), gVar2);
                    break;
                }
            }
            if (!z7) {
                return false;
            }
        }
        return true;
    }

    @Override // n6.i
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(this.f14391a.fold(obj, pVar), this.f14392b);
    }

    @Override // n6.i
    public final g get(h key) {
        kotlin.jvm.internal.j.e(key, "key");
        c cVar = this;
        while (true) {
            g gVar = cVar.f14392b.get(key);
            if (gVar != null) {
                return gVar;
            }
            i iVar = cVar.f14391a;
            if (iVar instanceof c) {
                cVar = (c) iVar;
            } else {
                return iVar.get(key);
            }
        }
    }

    public final int hashCode() {
        return this.f14392b.hashCode() + this.f14391a.hashCode();
    }

    @Override // n6.i
    public final i minusKey(h key) {
        kotlin.jvm.internal.j.e(key, "key");
        g gVar = this.f14392b;
        g gVar2 = gVar.get(key);
        i iVar = this.f14391a;
        if (gVar2 != null) {
            return iVar;
        }
        i minusKey = iVar.minusKey(key);
        if (minusKey == iVar) {
            return this;
        }
        if (minusKey != j.f14394a) {
            return new c(gVar, minusKey);
        }
        return gVar;
    }

    @Override // n6.i
    public final i plus(i context) {
        kotlin.jvm.internal.j.e(context, "context");
        if (context == j.f14394a) {
            return this;
        }
        return (i) context.fold(this, C1536b.f14389c);
    }

    public final String toString() {
        return "[" + ((String) fold(StringUtils.EMPTY, C1536b.f14388b)) + ']';
    }
}
