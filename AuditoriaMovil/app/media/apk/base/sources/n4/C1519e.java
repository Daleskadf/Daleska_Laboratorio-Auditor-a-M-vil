package n4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: n4.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1519e extends AbstractC1530p {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f14335a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC1518d f14336b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f14337c;

    public C1519e(List list, EnumC1518d enumC1518d) {
        this.f14335a = new ArrayList(list);
        this.f14336b = enumC1518d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        r2 = false;
     */
    @Override // n4.AbstractC1530p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.ArrayList r1 = r4.f14335a
            java.util.Iterator r2 = r1.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1c
            java.lang.Object r3 = r2.next()
            n4.p r3 = (n4.AbstractC1530p) r3
            boolean r3 = r3 instanceof n4.C1519e
            if (r3 == 0) goto Lb
            goto L24
        L1c:
            boolean r2 = r4.e()
            if (r2 == 0) goto L24
            r2 = 1
            goto L25
        L24:
            r2 = 0
        L25:
            if (r2 == 0) goto L44
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            n4.p r2 = (n4.AbstractC1530p) r2
            java.lang.String r2 = r2.a()
            r0.append(r2)
            goto L2b
        L3f:
            java.lang.String r0 = r0.toString()
            return r0
        L44:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            n4.d r3 = r4.f14336b
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r3 = "("
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r2 = ","
            java.lang.String r1 = android.text.TextUtils.join(r2, r1)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.C1519e.a():java.lang.String");
    }

    @Override // n4.AbstractC1530p
    public final List b() {
        return DesugarCollections.unmodifiableList(this.f14335a);
    }

    @Override // n4.AbstractC1530p
    public final List c() {
        ArrayList arrayList = this.f14337c;
        if (arrayList != null) {
            return DesugarCollections.unmodifiableList(arrayList);
        }
        this.f14337c = new ArrayList();
        Iterator it = this.f14335a.iterator();
        while (it.hasNext()) {
            this.f14337c.addAll(((AbstractC1530p) it.next()).c());
        }
        return DesugarCollections.unmodifiableList(this.f14337c);
    }

    @Override // n4.AbstractC1530p
    public final boolean d(q4.n nVar) {
        boolean e7 = e();
        ArrayList arrayList = this.f14335a;
        if (e7) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((AbstractC1530p) it.next()).d(nVar)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((AbstractC1530p) it2.next()).d(nVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        if (this.f14336b == EnumC1518d.AND) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1519e)) {
            return false;
        }
        C1519e c1519e = (C1519e) obj;
        if (this.f14336b != c1519e.f14336b || !this.f14335a.equals(c1519e.f14335a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14335a.hashCode() + ((this.f14336b.hashCode() + 1147) * 31);
    }

    public final String toString() {
        return a();
    }
}
