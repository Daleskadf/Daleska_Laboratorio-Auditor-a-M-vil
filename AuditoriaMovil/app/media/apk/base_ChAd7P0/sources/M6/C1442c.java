package m6;

import D.AbstractC0059i;
import java.util.RandomAccess;
/* renamed from: m6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1442c extends AbstractC1443d implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1443d f14064a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14065b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14066c;

    public C1442c(AbstractC1443d list, int i7, int i8) {
        kotlin.jvm.internal.j.e(list, "list");
        this.f14064a = list;
        this.f14065b = i7;
        int e7 = list.e();
        if (i7 >= 0 && i8 <= e7) {
            if (i7 <= i8) {
                this.f14066c = i8 - i7;
                return;
            }
            throw new IllegalArgumentException(AbstractC0059i.x("fromIndex: ", i7, i8, " > toIndex: "));
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8 + ", size: " + e7);
    }

    @Override // m6.AbstractC1443d
    public final int e() {
        return this.f14066c;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int i8 = this.f14066c;
        if (i7 >= 0 && i7 < i8) {
            return this.f14064a.get(this.f14065b + i7);
        }
        throw new IndexOutOfBoundsException(AbstractC0059i.x("index: ", i7, i8, ", size: "));
    }
}
