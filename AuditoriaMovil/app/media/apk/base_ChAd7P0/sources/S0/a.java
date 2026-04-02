package S0;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f4838a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4839b;

    /* renamed from: c  reason: collision with root package name */
    public final List f4840c;

    /* renamed from: d  reason: collision with root package name */
    public final List f4841d;

    /* renamed from: e  reason: collision with root package name */
    public final List f4842e;
    public final List f;

    public a(long j, int i7, ArrayList arrayList, List list, List list2, List list3) {
        this.f4838a = j;
        this.f4839b = i7;
        this.f4840c = DesugarCollections.unmodifiableList(arrayList);
        this.f4841d = DesugarCollections.unmodifiableList(list);
        this.f4842e = DesugarCollections.unmodifiableList(list2);
        this.f = DesugarCollections.unmodifiableList(list3);
    }
}
