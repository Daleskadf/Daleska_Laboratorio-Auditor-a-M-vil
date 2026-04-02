package T;

import kotlin.jvm.internal.j;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f5282a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Object[] f5283b = new Object[0];

    public static final int a(int i7, int i8, int[] array) {
        j.e(array, "array");
        int i9 = i7 - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = array[i11];
            if (i12 < i8) {
                i10 = i11 + 1;
            } else if (i12 > i8) {
                i9 = i11 - 1;
            } else {
                return i11;
            }
        }
        return ~i10;
    }

    public static final int b(long[] array, int i7, long j) {
        j.e(array, "array");
        int i8 = i7 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            int i11 = (array[i10] > j ? 1 : (array[i10] == j ? 0 : -1));
            if (i11 < 0) {
                i9 = i10 + 1;
            } else if (i11 > 0) {
                i8 = i10 - 1;
            } else {
                return i10;
            }
        }
        return ~i9;
    }
}
