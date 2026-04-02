package d6;

import c6.r2;
import e6.C0967b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
/* renamed from: d6.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0903A {
    static {
        Logger.getLogger(AbstractC0903A.class.getName());
    }

    public static byte[][] a(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            C0967b c0967b = (C0967b) it.next();
            int i8 = i7 + 1;
            bArr[i7] = c0967b.f10925a.q();
            i7 += 2;
            bArr[i8] = c0967b.f10926b.q();
        }
        Logger logger = r2.f8971a;
        int i9 = 0;
        while (i9 < size) {
            byte[] bArr2 = bArr[i9];
            int i10 = i9 + 1;
            byte[] bArr3 = bArr[i10];
            byte[] bArr4 = r2.f8972b;
            if (r2.a(bArr2, bArr4)) {
                for (byte b5 : bArr3) {
                    if (b5 == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i11 = 0; i11 < i9; i11++) {
                            arrayList2.add(bArr[i11]);
                        }
                        while (i9 < size) {
                            byte[] bArr5 = bArr[i9];
                            byte[] bArr6 = bArr[i9 + 1];
                            if (!r2.a(bArr5, bArr4)) {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            } else {
                                int i12 = 0;
                                for (int i13 = 0; i13 <= bArr6.length; i13++) {
                                    if (i13 == bArr6.length || bArr6[i13] == 44) {
                                        byte[] a7 = B3.e.f266c.a(new String(bArr6, i12, i13 - i12, z3.h.f16884a));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(a7);
                                        i12 = i13 + 1;
                                    }
                                }
                            }
                            i9 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0]);
                    }
                }
                bArr[i10] = B3.e.f266c.a(new String(bArr3, z3.h.f16884a));
            }
            i9 += 2;
        }
        return bArr;
    }
}
