package i1;

import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: h  reason: collision with root package name */
    public static final K1.d f11440h = new K1.d(16);

    /* renamed from: i  reason: collision with root package name */
    public static final K1.d f11441i = new K1.d(17);

    /* renamed from: a  reason: collision with root package name */
    public final int f11442a;

    /* renamed from: e  reason: collision with root package name */
    public int f11446e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f11447g;

    /* renamed from: c  reason: collision with root package name */
    public final r[] f11444c = new r[5];

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f11443b = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public int f11445d = -1;

    public s(int i7) {
        this.f11442a = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(float f, int i7) {
        r rVar;
        int i8 = this.f11445d;
        ArrayList arrayList = this.f11443b;
        if (i8 != 1) {
            Collections.sort(arrayList, f11440h);
            this.f11445d = 1;
        }
        int i9 = this.f11447g;
        r[] rVarArr = this.f11444c;
        if (i9 > 0) {
            int i10 = i9 - 1;
            this.f11447g = i10;
            rVar = rVarArr[i10];
        } else {
            rVar = new Object();
        }
        int i11 = this.f11446e;
        this.f11446e = i11 + 1;
        rVar.f11437a = i11;
        rVar.f11438b = i7;
        rVar.f11439c = f;
        arrayList.add(rVar);
        this.f += i7;
        while (true) {
            int i12 = this.f;
            int i13 = this.f11442a;
            if (i12 > i13) {
                int i14 = i12 - i13;
                r rVar2 = (r) arrayList.get(0);
                int i15 = rVar2.f11438b;
                if (i15 <= i14) {
                    this.f -= i15;
                    arrayList.remove(0);
                    int i16 = this.f11447g;
                    if (i16 < 5) {
                        this.f11447g = i16 + 1;
                        rVarArr[i16] = rVar2;
                    }
                } else {
                    rVar2.f11438b = i15 - i14;
                    this.f -= i14;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i7 = this.f11445d;
        ArrayList arrayList = this.f11443b;
        if (i7 != 0) {
            Collections.sort(arrayList, f11441i);
            this.f11445d = 0;
        }
        float f = 0.5f * this.f;
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            r rVar = (r) arrayList.get(i9);
            i8 += rVar.f11438b;
            if (i8 >= f) {
                return rVar.f11439c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((r) arrayList.get(arrayList.size() - 1)).f11439c;
    }
}
