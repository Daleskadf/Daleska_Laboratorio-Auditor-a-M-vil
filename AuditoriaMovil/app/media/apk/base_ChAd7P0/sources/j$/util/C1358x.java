package j$.util;

import java.util.Comparator;
import java.util.SortedMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1358x extends C1355u implements SortedMap {
    private static final long serialVersionUID = -8806743815996713206L;

    /* renamed from: e  reason: collision with root package name */
    private final SortedMap f13416e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1358x(SortedMap sortedMap) {
        super(sortedMap);
        this.f13416e = sortedMap;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f13416e.comparator();
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return new C1358x(this.f13416e.subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return new C1358x(this.f13416e.headMap(obj));
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return new C1358x(this.f13416e.tailMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f13416e.firstKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f13416e.lastKey();
    }
}
