package c6;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class V1 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8608a;

    /* renamed from: b  reason: collision with root package name */
    public final List f8609b;

    /* renamed from: c  reason: collision with root package name */
    public final Collection f8610c;

    /* renamed from: d  reason: collision with root package name */
    public final Collection f8611d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8612e;
    public final Y1 f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8613g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8614h;

    public V1(List list, Collection collection, Collection collection2, Y1 y12, boolean z7, boolean z8, boolean z9, int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f8609b = list;
        G.i.j(collection, "drainedSubstreams");
        this.f8610c = collection;
        this.f = y12;
        this.f8611d = collection2;
        this.f8613g = z7;
        this.f8608a = z8;
        this.f8614h = z9;
        this.f8612e = i7;
        boolean z13 = false;
        if (z8 && list != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        G.i.o("passThrough should imply buffer is null", z10);
        if (z8 && y12 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        G.i.o("passThrough should imply winningSubstream != null", z11);
        if (z8 && ((collection.size() != 1 || !collection.contains(y12)) && (collection.size() != 0 || !y12.f8658b))) {
            z12 = false;
        } else {
            z12 = true;
        }
        G.i.o("passThrough should imply winningSubstream is drained", z12);
        G.i.o("cancelled should imply committed", (z7 && y12 == null) ? z13 : true);
    }

    public final V1 a(Y1 y12) {
        boolean z7;
        Collection unmodifiableCollection;
        G.i.o("hedging frozen", !this.f8614h);
        if (this.f == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("already committed", z7);
        Collection collection = this.f8611d;
        if (collection == null) {
            unmodifiableCollection = Collections.singleton(y12);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(y12);
            unmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        return new V1(this.f8609b, this.f8610c, unmodifiableCollection, this.f, this.f8613g, this.f8608a, this.f8614h, this.f8612e + 1);
    }

    public final V1 b(Y1 y12) {
        ArrayList arrayList = new ArrayList(this.f8611d);
        arrayList.remove(y12);
        return new V1(this.f8609b, this.f8610c, DesugarCollections.unmodifiableCollection(arrayList), this.f, this.f8613g, this.f8608a, this.f8614h, this.f8612e);
    }

    public final V1 c(Y1 y12, Y1 y13) {
        ArrayList arrayList = new ArrayList(this.f8611d);
        arrayList.remove(y12);
        arrayList.add(y13);
        return new V1(this.f8609b, this.f8610c, DesugarCollections.unmodifiableCollection(arrayList), this.f, this.f8613g, this.f8608a, this.f8614h, this.f8612e);
    }

    public final V1 d(Y1 y12) {
        y12.f8658b = true;
        Collection collection = this.f8610c;
        if (collection.contains(y12)) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.remove(y12);
            return new V1(this.f8609b, DesugarCollections.unmodifiableCollection(arrayList), this.f8611d, this.f, this.f8613g, this.f8608a, this.f8614h, this.f8612e);
        }
        return this;
    }

    public final V1 e(Y1 y12) {
        boolean z7;
        List list;
        boolean z8 = true;
        G.i.o("Already passThrough", !this.f8608a);
        boolean z9 = y12.f8658b;
        Collection collection = this.f8610c;
        if (!z9) {
            if (collection.isEmpty()) {
                collection = Collections.singletonList(y12);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(y12);
                collection = DesugarCollections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection2 = collection;
        Y1 y13 = this.f;
        if (y13 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            if (y13 != y12) {
                z8 = false;
            }
            G.i.o("Another RPC attempt has already committed", z8);
            list = null;
        } else {
            list = this.f8609b;
        }
        return new V1(list, collection2, this.f8611d, this.f, this.f8613g, z7, this.f8614h, this.f8612e);
    }
}
