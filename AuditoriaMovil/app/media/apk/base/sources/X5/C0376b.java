package X5;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
/* renamed from: X5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0376b extends L5.x {
    @Override // L5.x
    public Object f(byte b5, ByteBuffer buffer) {
        kotlin.jvm.internal.j.e(buffer, "buffer");
        int i7 = 0;
        if (b5 == -127) {
            Long l8 = (Long) e(buffer);
            if (l8 == null) {
                return null;
            }
            int longValue = (int) l8.longValue();
            EnumC0394u.Companion.getClass();
            EnumC0394u[] values = EnumC0394u.values();
            int length = values.length;
            while (i7 < length) {
                EnumC0394u enumC0394u = values[i7];
                if (enumC0394u.a() == longValue) {
                    return enumC0394u;
                }
                i7++;
            }
            return null;
        } else if (b5 == -126) {
            Long l9 = (Long) e(buffer);
            if (l9 == null) {
                return null;
            }
            int longValue2 = (int) l9.longValue();
            EnumC0385k.Companion.getClass();
            EnumC0385k[] values2 = EnumC0385k.values();
            int length2 = values2.length;
            while (i7 < length2) {
                EnumC0385k enumC0385k = values2[i7];
                if (enumC0385k.a() == longValue2) {
                    return enumC0385k;
                }
                i7++;
            }
            return null;
        } else if (b5 == -125) {
            Long l10 = (Long) e(buffer);
            if (l10 == null) {
                return null;
            }
            int longValue3 = (int) l10.longValue();
            EnumC0399z.Companion.getClass();
            EnumC0399z[] values3 = EnumC0399z.values();
            int length3 = values3.length;
            while (i7 < length3) {
                EnumC0399z enumC0399z = values3[i7];
                if (enumC0399z.a() == longValue3) {
                    return enumC0399z;
                }
                i7++;
            }
            return null;
        } else if (b5 == -124) {
            Long l11 = (Long) e(buffer);
            if (l11 == null) {
                return null;
            }
            int longValue4 = (int) l11.longValue();
            V.Companion.getClass();
            V[] values4 = V.values();
            int length4 = values4.length;
            while (i7 < length4) {
                V v6 = values4[i7];
                if (v6.a() == longValue4) {
                    return v6;
                }
                i7++;
            }
            return null;
        } else {
            return super.f(b5, buffer);
        }
    }

    @Override // L5.x
    public void k(ByteArrayOutputStream stream, Object obj) {
        kotlin.jvm.internal.j.e(stream, "stream");
        if (obj instanceof EnumC0394u) {
            stream.write(129);
            k(stream, Integer.valueOf(((EnumC0394u) obj).a()));
        } else if (obj instanceof EnumC0385k) {
            stream.write(130);
            k(stream, Integer.valueOf(((EnumC0385k) obj).a()));
        } else if (obj instanceof EnumC0399z) {
            stream.write(131);
            k(stream, Integer.valueOf(((EnumC0399z) obj).a()));
        } else if (obj instanceof V) {
            stream.write(132);
            k(stream, Integer.valueOf(((V) obj).a()));
        } else {
            super.k(stream, obj);
        }
    }
}
