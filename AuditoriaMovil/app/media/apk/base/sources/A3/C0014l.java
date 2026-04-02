package A3;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* renamed from: A3.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0014l extends C0009g implements SortedSet {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b0 f170c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0014l(b0 b0Var, SortedMap sortedMap) {
        super(b0Var, sortedMap);
        this.f170c = b0Var;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return e().comparator();
    }

    public SortedMap e() {
        return (SortedMap) this.f146a;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return e().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C0014l(this.f170c, e().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return e().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C0014l(this.f170c, e().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C0014l(this.f170c, e().tailMap(obj));
    }
}
