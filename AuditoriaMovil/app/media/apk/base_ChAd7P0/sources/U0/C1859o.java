package u0;

import android.util.SparseArray;
/* renamed from: u0.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1859o {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f15947a;

    /* renamed from: b  reason: collision with root package name */
    public C1856l f15948b;

    public C1859o(int i7) {
        this.f15947a = new SparseArray(i7);
    }

    public final void a(C1856l c1856l, int i7, int i8) {
        C1859o c1859o;
        int a7 = c1856l.a(i7);
        SparseArray sparseArray = this.f15947a;
        if (sparseArray == null) {
            c1859o = null;
        } else {
            c1859o = (C1859o) sparseArray.get(a7);
        }
        if (c1859o == null) {
            c1859o = new C1859o(1);
            sparseArray.put(c1856l.a(i7), c1859o);
        }
        if (i8 > i7) {
            c1859o.a(c1856l, i7 + 1, i8);
        } else {
            c1859o.f15948b = c1856l;
        }
    }
}
