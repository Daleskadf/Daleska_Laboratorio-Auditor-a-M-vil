package S;

import java.util.ConcurrentModificationException;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f4830a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f4831b = new Object();

    public static final void a(g gVar, int i7) {
        kotlin.jvm.internal.j.e(gVar, "<this>");
        gVar.f4823a = new int[i7];
        gVar.f4824b = new Object[i7];
    }

    public static final int b(g gVar, Object obj, int i7) {
        kotlin.jvm.internal.j.e(gVar, "<this>");
        int i8 = gVar.f4825c;
        if (i8 == 0) {
            return -1;
        }
        try {
            int a7 = T.a.a(gVar.f4825c, i7, gVar.f4823a);
            if (a7 < 0) {
                return a7;
            }
            if (kotlin.jvm.internal.j.a(obj, gVar.f4824b[a7])) {
                return a7;
            }
            int i9 = a7 + 1;
            while (i9 < i8 && gVar.f4823a[i9] == i7) {
                if (kotlin.jvm.internal.j.a(obj, gVar.f4824b[i9])) {
                    return i9;
                }
                i9++;
            }
            for (int i10 = a7 - 1; i10 >= 0 && gVar.f4823a[i10] == i7; i10--) {
                if (kotlin.jvm.internal.j.a(obj, gVar.f4824b[i10])) {
                    return i10;
                }
            }
            return ~i9;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
