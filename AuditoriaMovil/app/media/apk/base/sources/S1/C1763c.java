package s1;

import K0.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
/* renamed from: s1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1763c extends B0.b {

    /* renamed from: b  reason: collision with root package name */
    public long f15567b;

    /* renamed from: c  reason: collision with root package name */
    public long[] f15568c;

    /* renamed from: d  reason: collision with root package name */
    public long[] f15569d;

    public static String A(q qVar) {
        int A7 = qVar.A();
        int i7 = qVar.f2514b;
        qVar.H(A7);
        return new String(qVar.f2513a, i7, A7);
    }

    public static Serializable x(int i7, q qVar) {
        if (i7 != 0) {
            boolean z7 = true;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 8) {
                            if (i7 != 10) {
                                if (i7 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(qVar.o()));
                                qVar.H(2);
                                return date;
                            }
                            int y2 = qVar.y();
                            ArrayList arrayList = new ArrayList(y2);
                            for (int i8 = 0; i8 < y2; i8++) {
                                Serializable x7 = x(qVar.u(), qVar);
                                if (x7 != null) {
                                    arrayList.add(x7);
                                }
                            }
                            return arrayList;
                        }
                        return y(qVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String A7 = A(qVar);
                        int u7 = qVar.u();
                        if (u7 == 9) {
                            return hashMap;
                        }
                        Serializable x8 = x(u7, qVar);
                        if (x8 != null) {
                            hashMap.put(A7, x8);
                        }
                    }
                } else {
                    return A(qVar);
                }
            } else {
                if (qVar.u() != 1) {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(qVar.o()));
        }
    }

    public static HashMap y(q qVar) {
        int y2 = qVar.y();
        HashMap hashMap = new HashMap(y2);
        for (int i7 = 0; i7 < y2; i7++) {
            String A7 = A(qVar);
            Serializable x7 = x(qVar.u(), qVar);
            if (x7 != null) {
                hashMap.put(A7, x7);
            }
        }
        return hashMap;
    }
}
