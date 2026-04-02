package V0;

import H0.Q;
import H0.r;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: n  reason: collision with root package name */
    public static final l f5865n = new l(StringUtils.EMPTY, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d  reason: collision with root package name */
    public final List f5866d;

    /* renamed from: e  reason: collision with root package name */
    public final List f5867e;
    public final List f;

    /* renamed from: g  reason: collision with root package name */
    public final List f5868g;

    /* renamed from: h  reason: collision with root package name */
    public final List f5869h;

    /* renamed from: i  reason: collision with root package name */
    public final List f5870i;
    public final r j;

    /* renamed from: k  reason: collision with root package name */
    public final List f5871k;

    /* renamed from: l  reason: collision with root package name */
    public final Map f5872l;

    /* renamed from: m  reason: collision with root package name */
    public final List f5873m;

    public l(String str, List list, List list2, List list3, List list4, List list5, List list6, r rVar, List list7, boolean z7, Map map, List list8) {
        super(str, list, z7);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list2.size(); i7++) {
            Uri uri = ((k) list2.get(i7)).f5860a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.f5866d = DesugarCollections.unmodifiableList(arrayList);
        this.f5867e = DesugarCollections.unmodifiableList(list2);
        this.f = DesugarCollections.unmodifiableList(list3);
        this.f5868g = DesugarCollections.unmodifiableList(list4);
        this.f5869h = DesugarCollections.unmodifiableList(list5);
        this.f5870i = DesugarCollections.unmodifiableList(list6);
        this.j = rVar;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f5871k = list9;
        this.f5872l = DesugarCollections.unmodifiableMap(map);
        this.f5873m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            Uri uri = ((j) list.get(i7)).f5857a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i7, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            Object obj = list.get(i8);
            int i9 = 0;
            while (true) {
                if (i9 < list2.size()) {
                    Q q2 = (Q) list2.get(i9);
                    if (q2.f1714b == i7 && q2.f1715c == i8) {
                        arrayList.add(obj);
                        break;
                    }
                    i9++;
                }
            }
        }
        return arrayList;
    }

    @Override // Z0.a
    public final Object a(List list) {
        return new l(this.f5874a, this.f5875b, c(this.f5867e, 0, list), Collections.emptyList(), c(this.f5868g, 1, list), c(this.f5869h, 2, list), Collections.emptyList(), this.j, this.f5871k, this.f5876c, this.f5872l, this.f5873m);
    }
}
