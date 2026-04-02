package h1;

import D.AbstractC0059i;
import H0.Z;
import K0.x;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import e1.b0;
import java.util.Map;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* renamed from: h1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1076j extends Z {

    /* renamed from: A  reason: collision with root package name */
    public static final /* synthetic */ int f11272A = 0;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f11273r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f11274s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f11275t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f11276u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f11277v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f11278w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f11279x;

    /* renamed from: y  reason: collision with root package name */
    public final SparseArray f11280y;

    /* renamed from: z  reason: collision with root package name */
    public final SparseBooleanArray f11281z;

    static {
        new C1076j(new C1075i());
        x.H(PipesIterator.DEFAULT_QUEUE_SIZE);
        x.H(1001);
        x.H(1002);
        x.H(1003);
        AbstractC0059i.F(1004, 1005, 1006, 1007, 1008);
        AbstractC0059i.F(1009, 1010, 1011, 1012, 1013);
        AbstractC0059i.F(1014, 1015, 1016, 1017, 1018);
    }

    public C1076j(C1075i c1075i) {
        super(c1075i);
        this.f11273r = c1075i.f11263r;
        this.f11274s = c1075i.f11264s;
        this.f11275t = c1075i.f11265t;
        this.f11276u = c1075i.f11266u;
        this.f11277v = c1075i.f11267v;
        this.f11278w = c1075i.f11268w;
        this.f11279x = c1075i.f11269x;
        this.f11280y = c1075i.f11270y;
        this.f11281z = c1075i.f11271z;
    }

    @Override // H0.Z
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1076j.class != obj.getClass()) {
            return false;
        }
        C1076j c1076j = (C1076j) obj;
        if (super.equals(c1076j) && this.f11273r == c1076j.f11273r && this.f11274s == c1076j.f11274s && this.f11275t == c1076j.f11275t && this.f11276u == c1076j.f11276u && this.f11277v == c1076j.f11277v && this.f11278w == c1076j.f11278w && this.f11279x == c1076j.f11279x) {
            SparseBooleanArray sparseBooleanArray = this.f11281z;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = c1076j.f11281z;
            if (sparseBooleanArray2.size() == size) {
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i7)) < 0) {
                            break;
                        }
                        i7++;
                    } else {
                        SparseArray sparseArray = this.f11280y;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = c1076j.f11280y;
                        if (sparseArray2.size() == size2) {
                            for (int i8 = 0; i8 < size2; i8++) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i8));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i8);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            b0 b0Var = (b0) entry.getKey();
                                            if (map2.containsKey(b0Var)) {
                                                if (!x.a(entry.getValue(), map2.get(b0Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // H0.Z
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f11273r ? 1 : 0)) * 961) + (this.f11274s ? 1 : 0)) * 961) + (this.f11275t ? 1 : 0)) * 28629151) + (this.f11276u ? 1 : 0)) * 31) + (this.f11277v ? 1 : 0)) * 31) + (this.f11278w ? 1 : 0)) * 961) + (this.f11279x ? 1 : 0)) * 31;
    }
}
