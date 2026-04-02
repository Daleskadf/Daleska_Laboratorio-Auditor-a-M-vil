package d5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/* renamed from: d5.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0902d {

    /* renamed from: b  reason: collision with root package name */
    public static C0902d f10353b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f10354a = new HashMap();

    public C0902d(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0901c c0901c = (C0901c) it.next();
            HashMap hashMap = this.f10354a;
            c0901c.getClass();
            hashMap.put(AbstractC0899a.class, c0901c.f10352a);
        }
    }

    public C0902d() {
    }
}
