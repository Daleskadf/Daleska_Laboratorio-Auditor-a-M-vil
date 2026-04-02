package L5;

import H4.e1;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public class x implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final x f3044a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f3045b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f3046c;

    /* JADX WARN: Type inference failed for: r0v0, types: [L5.x, java.lang.Object] */
    static {
        boolean z7;
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            z7 = true;
        } else {
            z7 = false;
        }
        f3045b = z7;
        f3046c = Charset.forName("UTF8");
    }

    public static final void c(int i7, ByteBuffer byteBuffer) {
        int position = byteBuffer.position() % i7;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i7) - position);
        }
    }

    public static final int d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int i7 = byteBuffer.get() & ForkServer.ERROR;
            if (i7 < 254) {
                return i7;
            }
            if (i7 == 254) {
                return byteBuffer.getChar();
            }
            return byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public static final void g(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        int size = byteArrayOutputStream.size() % i7;
        if (size != 0) {
            for (int i8 = 0; i8 < i7 - size; i8++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    public static final void h(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        if (f3045b) {
            byteArrayOutputStream.write(i7);
            byteArrayOutputStream.write(i7 >>> 8);
            byteArrayOutputStream.write(i7 >>> 16);
            byteArrayOutputStream.write(i7 >>> 24);
            return;
        }
        byteArrayOutputStream.write(i7 >>> 24);
        byteArrayOutputStream.write(i7 >>> 16);
        byteArrayOutputStream.write(i7 >>> 8);
        byteArrayOutputStream.write(i7);
    }

    public static final void i(ByteArrayOutputStream byteArrayOutputStream, long j) {
        if (f3045b) {
            byteArrayOutputStream.write((byte) j);
            byteArrayOutputStream.write((byte) (j >>> 8));
            byteArrayOutputStream.write((byte) (j >>> 16));
            byteArrayOutputStream.write((byte) (j >>> 24));
            byteArrayOutputStream.write((byte) (j >>> 32));
            byteArrayOutputStream.write((byte) (j >>> 40));
            byteArrayOutputStream.write((byte) (j >>> 48));
            byteArrayOutputStream.write((byte) (j >>> 56));
            return;
        }
        byteArrayOutputStream.write((byte) (j >>> 56));
        byteArrayOutputStream.write((byte) (j >>> 48));
        byteArrayOutputStream.write((byte) (j >>> 40));
        byteArrayOutputStream.write((byte) (j >>> 32));
        byteArrayOutputStream.write((byte) (j >>> 24));
        byteArrayOutputStream.write((byte) (j >>> 16));
        byteArrayOutputStream.write((byte) (j >>> 8));
        byteArrayOutputStream.write((byte) j);
    }

    public static final void j(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        if (i7 < 254) {
            byteArrayOutputStream.write(i7);
        } else if (i7 <= 65535) {
            byteArrayOutputStream.write(254);
            if (f3045b) {
                byteArrayOutputStream.write(i7);
                byteArrayOutputStream.write(i7 >>> 8);
                return;
            }
            byteArrayOutputStream.write(i7 >>> 8);
            byteArrayOutputStream.write(i7);
        } else {
            byteArrayOutputStream.write(255);
            h(byteArrayOutputStream, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [L5.w, java.io.ByteArrayOutputStream] */
    @Override // L5.n
    public final ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        k(byteArrayOutputStream, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    @Override // L5.n
    public final Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object e7 = e(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return e7;
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public final Object e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return f(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public Object f(byte b5, ByteBuffer byteBuffer) {
        Object bigInteger;
        Charset charset = f3046c;
        int i7 = 0;
        switch (b5) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                byte[] bArr = new byte[d(byteBuffer)];
                byteBuffer.get(bArr);
                bigInteger = new BigInteger(new String(bArr, charset), 16);
                break;
            case 6:
                c(8, byteBuffer);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                byte[] bArr2 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr2);
                bigInteger = new String(bArr2, charset);
                break;
            case 8:
                byte[] bArr3 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr3);
                return bArr3;
            case 9:
                int d7 = d(byteBuffer);
                int[] iArr = new int[d7];
                c(4, byteBuffer);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position((d7 * 4) + byteBuffer.position());
                return iArr;
            case 10:
                int d8 = d(byteBuffer);
                long[] jArr = new long[d8];
                c(8, byteBuffer);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((d8 * 8) + byteBuffer.position());
                return jArr;
            case 11:
                int d9 = d(byteBuffer);
                double[] dArr = new double[d9];
                c(8, byteBuffer);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((d9 * 8) + byteBuffer.position());
                return dArr;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                int d10 = d(byteBuffer);
                ArrayList arrayList = new ArrayList(d10);
                while (i7 < d10) {
                    arrayList.add(e(byteBuffer));
                    i7++;
                }
                return arrayList;
            case 13:
                int d11 = d(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i7 < d11) {
                    hashMap.put(e(byteBuffer), e(byteBuffer));
                    i7++;
                }
                return hashMap;
            case 14:
                int d12 = d(byteBuffer);
                float[] fArr = new float[d12];
                c(4, byteBuffer);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((d12 * 4) + byteBuffer.position());
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        return bigInteger;
    }

    public void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i7;
        int i8 = 0;
        if (obj != null && !obj.equals(null)) {
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    i7 = 1;
                } else {
                    i7 = 2;
                }
                byteArrayOutputStream.write(i7);
                return;
            }
            boolean z7 = obj instanceof Number;
            Charset charset = f3046c;
            if (z7) {
                if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
                    if (obj instanceof Long) {
                        byteArrayOutputStream.write(4);
                        i(byteArrayOutputStream, ((Long) obj).longValue());
                        return;
                    } else if (!(obj instanceof Float) && !(obj instanceof Double)) {
                        if (obj instanceof BigInteger) {
                            byteArrayOutputStream.write(5);
                            byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                            j(byteArrayOutputStream, bytes.length);
                            byteArrayOutputStream.write(bytes, 0, bytes.length);
                            return;
                        }
                        throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                    } else {
                        byteArrayOutputStream.write(6);
                        g(byteArrayOutputStream, 8);
                        i(byteArrayOutputStream, Double.doubleToLongBits(((Number) obj).doubleValue()));
                        return;
                    }
                }
                byteArrayOutputStream.write(3);
                h(byteArrayOutputStream, ((Number) obj).intValue());
                return;
            } else if (obj instanceof CharSequence) {
                byteArrayOutputStream.write(7);
                byte[] bytes2 = obj.toString().getBytes(charset);
                j(byteArrayOutputStream, bytes2.length);
                byteArrayOutputStream.write(bytes2, 0, bytes2.length);
                return;
            } else if (obj instanceof byte[]) {
                byteArrayOutputStream.write(8);
                byte[] bArr = (byte[]) obj;
                j(byteArrayOutputStream, bArr.length);
                byteArrayOutputStream.write(bArr, 0, bArr.length);
                return;
            } else if (obj instanceof int[]) {
                byteArrayOutputStream.write(9);
                int[] iArr = (int[]) obj;
                j(byteArrayOutputStream, iArr.length);
                g(byteArrayOutputStream, 4);
                int length = iArr.length;
                while (i8 < length) {
                    h(byteArrayOutputStream, iArr[i8]);
                    i8++;
                }
                return;
            } else if (obj instanceof long[]) {
                byteArrayOutputStream.write(10);
                long[] jArr = (long[]) obj;
                j(byteArrayOutputStream, jArr.length);
                g(byteArrayOutputStream, 8);
                int length2 = jArr.length;
                while (i8 < length2) {
                    i(byteArrayOutputStream, jArr[i8]);
                    i8++;
                }
                return;
            } else if (obj instanceof double[]) {
                byteArrayOutputStream.write(11);
                double[] dArr = (double[]) obj;
                j(byteArrayOutputStream, dArr.length);
                g(byteArrayOutputStream, 8);
                int length3 = dArr.length;
                while (i8 < length3) {
                    i(byteArrayOutputStream, Double.doubleToLongBits(dArr[i8]));
                    i8++;
                }
                return;
            } else if (obj instanceof List) {
                byteArrayOutputStream.write(12);
                List<Object> list = (List) obj;
                j(byteArrayOutputStream, list.size());
                for (Object obj2 : list) {
                    k(byteArrayOutputStream, obj2);
                }
                return;
            } else if (obj instanceof Map) {
                byteArrayOutputStream.write(13);
                Map map = (Map) obj;
                j(byteArrayOutputStream, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    k(byteArrayOutputStream, entry.getKey());
                    k(byteArrayOutputStream, entry.getValue());
                }
                return;
            } else if (obj instanceof float[]) {
                byteArrayOutputStream.write(14);
                float[] fArr = (float[]) obj;
                j(byteArrayOutputStream, fArr.length);
                g(byteArrayOutputStream, 4);
                int length4 = fArr.length;
                while (i8 < length4) {
                    h(byteArrayOutputStream, Float.floatToIntBits(fArr[i8]));
                    i8++;
                }
                return;
            } else {
                throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
            }
        }
        byteArrayOutputStream.write(0);
    }
}
