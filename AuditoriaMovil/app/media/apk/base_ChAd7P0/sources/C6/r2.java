package c6;

import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class r2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f8971a = Logger.getLogger(r2.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f8972b = "-bin".getBytes(z3.h.f16884a);

    public static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i7 = length; i7 < bArr.length; i7++) {
            if (bArr[i7] != bArr2[i7 - length]) {
                return false;
            }
        }
        return true;
    }
}
