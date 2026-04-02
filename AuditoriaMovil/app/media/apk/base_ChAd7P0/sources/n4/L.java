package n4;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a  reason: collision with root package name */
    public String f14303a;

    /* renamed from: b  reason: collision with root package name */
    public final List f14304b;

    /* renamed from: c  reason: collision with root package name */
    public final List f14305c;

    /* renamed from: d  reason: collision with root package name */
    public final q4.p f14306d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14307e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final C1517c f14308g;

    /* renamed from: h  reason: collision with root package name */
    public final C1517c f14309h;

    public L(q4.p pVar, String str, List list, List list2, long j, C1517c c1517c, C1517c c1517c2) {
        this.f14306d = pVar;
        this.f14307e = str;
        this.f14304b = list2;
        this.f14305c = list;
        this.f = j;
        this.f14308g = c1517c;
        this.f14309h = c1517c2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x000e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(q4.C1711d r11, n4.C1517c r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.L.a(q4.d, n4.c):android.util.Pair");
    }

    public final String b() {
        String str;
        String str2;
        String str3 = this.f14303a;
        if (str3 != null) {
            return str3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14306d.c());
        String str4 = this.f14307e;
        if (str4 != null) {
            sb.append("|cg:");
            sb.append(str4);
        }
        sb.append("|f:");
        for (AbstractC1530p abstractC1530p : this.f14305c) {
            sb.append(abstractC1530p.a());
        }
        sb.append("|ob:");
        for (C1513B c1513b : this.f14304b) {
            sb.append(c1513b.f14268b.c());
            if (c1513b.f14267a.equals(EnumC1512A.ASCENDING)) {
                str2 = "asc";
            } else {
                str2 = "desc";
            }
            sb.append(str2);
        }
        if (e()) {
            sb.append("|l:");
            sb.append(this.f);
        }
        String str5 = "a:";
        C1517c c1517c = this.f14308g;
        if (c1517c != null) {
            sb.append("|lb:");
            if (!c1517c.f14333a) {
                str = "a:";
            } else {
                str = "b:";
            }
            sb.append(str);
            sb.append(c1517c.b());
        }
        C1517c c1517c2 = this.f14309h;
        if (c1517c2 != null) {
            sb.append("|ub:");
            if (!c1517c2.f14333a) {
                str5 = "b:";
            }
            sb.append(str5);
            sb.append(c1517c2.b());
        }
        String sb2 = sb.toString();
        this.f14303a = sb2;
        return sb2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x000e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair c(q4.C1711d r11, n4.C1517c r12) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.L.c(q4.d, n4.c):android.util.Pair");
    }

    public final ArrayList d(q4.k kVar) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC1530p abstractC1530p : this.f14305c) {
            if (abstractC1530p instanceof C1529o) {
                C1529o c1529o = (C1529o) abstractC1530p;
                if (c1529o.f14351c.equals(kVar)) {
                    arrayList.add(c1529o);
                }
            }
        }
        return arrayList;
    }

    public final boolean e() {
        if (this.f != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L.class != obj.getClass()) {
            return false;
        }
        L l8 = (L) obj;
        String str = l8.f14307e;
        String str2 = this.f14307e;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        if (this.f != l8.f || !this.f14304b.equals(l8.f14304b) || !this.f14305c.equals(l8.f14305c) || !this.f14306d.equals(l8.f14306d)) {
            return false;
        }
        C1517c c1517c = l8.f14308g;
        C1517c c1517c2 = this.f14308g;
        if (c1517c2 == null ? c1517c != null : !c1517c2.equals(c1517c)) {
            return false;
        }
        C1517c c1517c3 = l8.f14309h;
        C1517c c1517c4 = this.f14309h;
        if (c1517c4 != null) {
            return c1517c4.equals(c1517c3);
        }
        if (c1517c3 == null) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (q4.h.e(this.f14306d) && this.f14307e == null && this.f14305c.isEmpty()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int hashCode = this.f14304b.hashCode() * 31;
        int i9 = 0;
        String str = this.f14307e;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f14305c.hashCode();
        int hashCode3 = this.f14306d.hashCode();
        long j = this.f;
        int i10 = (((hashCode3 + ((hashCode2 + ((hashCode + i7) * 31)) * 31)) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        C1517c c1517c = this.f14308g;
        if (c1517c != null) {
            i8 = c1517c.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i10 + i8) * 31;
        C1517c c1517c2 = this.f14309h;
        if (c1517c2 != null) {
            i9 = c1517c2.hashCode();
        }
        return i11 + i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Query(");
        sb.append(this.f14306d.c());
        String str = this.f14307e;
        if (str != null) {
            sb.append(" collectionGroup=");
            sb.append(str);
        }
        List list = this.f14305c;
        if (!list.isEmpty()) {
            sb.append(" where ");
            for (int i7 = 0; i7 < list.size(); i7++) {
                if (i7 > 0) {
                    sb.append(" and ");
                }
                sb.append(list.get(i7));
            }
        }
        List list2 = this.f14304b;
        if (!list2.isEmpty()) {
            sb.append(" order by ");
            for (int i8 = 0; i8 < list2.size(); i8++) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(list2.get(i8));
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
