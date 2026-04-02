package A3;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* renamed from: A3.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0013k extends C0008f implements SortedMap {

    /* renamed from: e  reason: collision with root package name */
    public SortedSet f163e;
    public final /* synthetic */ b0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0013k(b0 b0Var, SortedMap sortedMap) {
        super(b0Var, sortedMap);
        this.f = b0Var;
    }

    public SortedSet b() {
        return new C0014l(this.f, d());
    }

    @Override // A3.C0008f, java.util.AbstractMap, java.util.Map
    /* renamed from: c */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f163e;
        if (sortedSet == null) {
            SortedSet b5 = b();
            this.f163e = b5;
            return b5;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f143c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C0013k(this.f, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C0013k(this.f, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C0013k(this.f, d().tailMap(obj));
    }
}
