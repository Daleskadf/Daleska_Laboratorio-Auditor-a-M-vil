package q4;

import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: q4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1708a {

    /* renamed from: e  reason: collision with root package name */
    public static final C1710c f15337e = new C1710c(0, C1709b.f15342d);
    public static final K1.d f = new K1.d(26);

    /* renamed from: a  reason: collision with root package name */
    public final int f15338a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15339b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f15340c;

    /* renamed from: d  reason: collision with root package name */
    public final C1710c f15341d;

    public C1708a(int i7, String str, ArrayList arrayList, C1710c c1710c) {
        this.f15338a = i7;
        if (str != null) {
            this.f15339b = str;
            this.f15340c = arrayList;
            if (c1710c != null) {
                this.f15341d = c1710c;
                return;
            }
            throw new NullPointerException("Null indexState");
        }
        throw new NullPointerException("Null collectionGroup");
    }

    public final C1711d a() {
        Iterator it = this.f15340c.iterator();
        while (it.hasNext()) {
            C1711d c1711d = (C1711d) it.next();
            if (c1711d.f15350b.equals(j.CONTAINS)) {
                return c1711d;
            }
        }
        return null;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f15340c.iterator();
        while (it.hasNext()) {
            C1711d c1711d = (C1711d) it.next();
            if (!c1711d.f15350b.equals(j.CONTAINS)) {
                arrayList.add(c1711d);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1708a)) {
            return false;
        }
        C1708a c1708a = (C1708a) obj;
        if (this.f15338a == c1708a.f15338a && this.f15339b.equals(c1708a.f15339b) && this.f15340c.equals(c1708a.f15340c) && this.f15341d.equals(c1708a.f15341d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15341d.hashCode() ^ ((((((this.f15338a ^ 1000003) * 1000003) ^ this.f15339b.hashCode()) * 1000003) ^ this.f15340c.hashCode()) * 1000003);
    }

    public final String toString() {
        return "FieldIndex{indexId=" + this.f15338a + ", collectionGroup=" + this.f15339b + ", segments=" + this.f15340c + ", indexState=" + this.f15341d + "}";
    }
}
