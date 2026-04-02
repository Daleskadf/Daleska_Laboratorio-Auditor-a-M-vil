package G1;

import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: c  reason: collision with root package name */
    public final long f1349c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1350d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f1351e;

    public a(int i7, long j) {
        super(i7);
        this.f1349c = j;
        this.f1350d = new ArrayList();
        this.f1351e = new ArrayList();
    }

    public final a e(int i7) {
        ArrayList arrayList = this.f1351e;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            a aVar = (a) arrayList.get(i8);
            if (aVar.f1354b == i7) {
                return aVar;
            }
        }
        return null;
    }

    public final b f(int i7) {
        ArrayList arrayList = this.f1350d;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) arrayList.get(i8);
            if (bVar.f1354b == i7) {
                return bVar;
            }
        }
        return null;
    }

    @Override // G1.c
    public final String toString() {
        return c.b(this.f1354b) + " leaves: " + Arrays.toString(this.f1350d.toArray()) + " containers: " + Arrays.toString(this.f1351e.toArray());
    }
}
