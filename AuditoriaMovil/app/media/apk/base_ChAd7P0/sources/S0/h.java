package S0;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f4878a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4879b;

    /* renamed from: c  reason: collision with root package name */
    public final List f4880c;

    /* renamed from: d  reason: collision with root package name */
    public final List f4881d;

    public h(String str, long j, ArrayList arrayList, List list) {
        this.f4878a = str;
        this.f4879b = j;
        this.f4880c = DesugarCollections.unmodifiableList(arrayList);
        this.f4881d = DesugarCollections.unmodifiableList(list);
    }
}
