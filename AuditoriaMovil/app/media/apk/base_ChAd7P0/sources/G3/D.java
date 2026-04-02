package G3;

import R3.A0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0774a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class D implements F3.a {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f1516c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final A0 f1517a;

    /* renamed from: b  reason: collision with root package name */
    public final L3.b f1518b;

    public D(A0 a02, L3.b bVar) {
        this.f1517a = a02;
        this.f1518b = bVar;
    }

    @Override // F3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AbstractC0774a a7;
        A0 a02 = this.f1517a;
        AtomicReference atomicReference = F3.s.f1190a;
        synchronized (F3.s.class) {
            try {
                M3.d dVar = ((F3.f) F3.s.f1190a.get()).a(a02.D()).f1163a;
                Class cls = (Class) dVar.f3230b;
                if (!((Map) dVar.f3231c).keySet().contains(cls) && !Void.class.equals(cls)) {
                    String obj = dVar.toString();
                    String name = cls.getName();
                    throw new IllegalArgumentException("Given internalKeyMananger " + obj + " does not support primitive class " + name);
                }
                if (((Boolean) F3.s.f1192c.get(a02.D())).booleanValue()) {
                    AbstractC0781h E4 = a02.E();
                    try {
                        B0.b e7 = dVar.e();
                        AbstractC0774a p7 = e7.p(E4);
                        e7.v(p7);
                        a7 = e7.a(p7);
                    } catch (com.google.crypto.tink.shaded.protobuf.F e8) {
                        throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) dVar.e().f229a).getName()), e8);
                    }
                } else {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + a02.D());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] e9 = a7.e();
        byte[] a8 = this.f1518b.a(e9, f1516c);
        byte[] a9 = ((F3.a) F3.s.d(this.f1517a.D(), e9)).a(bArr, bArr2);
        return ByteBuffer.allocate(a8.length + 4 + a9.length).putInt(a8.length).put(a8).put(a9).array();
    }

    @Override // F3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i7 = wrap.getInt();
            if (i7 > 0 && i7 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i7];
                wrap.get(bArr3, 0, i7);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                return ((F3.a) F3.s.d(this.f1517a.D(), this.f1518b.b(bArr3, f1516c))).b(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException e7) {
            e = e7;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e8) {
            e = e8;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e9) {
            e = e9;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
