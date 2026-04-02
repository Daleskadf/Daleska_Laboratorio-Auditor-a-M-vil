package n4;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public final D f14321a;

    /* renamed from: b  reason: collision with root package name */
    public final q4.i f14322b;

    /* renamed from: c  reason: collision with root package name */
    public final q4.i f14323c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f14324d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14325e;
    public final e4.e f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f14326g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f14327h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f14328i;

    public T(D d7, q4.i iVar, q4.i iVar2, ArrayList arrayList, boolean z7, e4.e eVar, boolean z8, boolean z9, boolean z10) {
        this.f14321a = d7;
        this.f14322b = iVar;
        this.f14323c = iVar2;
        this.f14324d = arrayList;
        this.f14325e = z7;
        this.f = eVar;
        this.f14326g = z8;
        this.f14327h = z9;
        this.f14328i = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t7 = (T) obj;
        if (this.f14325e != t7.f14325e || this.f14326g != t7.f14326g || this.f14327h != t7.f14327h || !this.f14321a.equals(t7.f14321a) || !this.f.equals(t7.f) || !this.f14322b.equals(t7.f14322b) || !this.f14323c.equals(t7.f14323c) || this.f14328i != t7.f14328i) {
            return false;
        }
        return this.f14324d.equals(t7.f14324d);
    }

    public final int hashCode() {
        int hashCode = this.f14322b.hashCode();
        int hashCode2 = this.f14323c.hashCode();
        int hashCode3 = this.f14324d.hashCode();
        return ((((((((this.f.f10876a.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f14321a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + (this.f14325e ? 1 : 0)) * 31) + (this.f14326g ? 1 : 0)) * 31) + (this.f14327h ? 1 : 0)) * 31) + (this.f14328i ? 1 : 0);
    }

    public final String toString() {
        return "ViewSnapshot(" + this.f14321a + ", " + this.f14322b + ", " + this.f14323c + ", " + this.f14324d + ", isFromCache=" + this.f14325e + ", mutatedKeys=" + this.f.f10876a.size() + ", didSyncStateChange=" + this.f14326g + ", excludesMetadataChanges=" + this.f14327h + ", hasCachedResults=" + this.f14328i + ")";
    }
}
