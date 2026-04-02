package G1;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.widget.TextView;
import com.google.protobuf.AbstractC0852m;
import h0.AbstractC1066z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import p.AbstractC1618y;
import p.C1620z;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1367a;

    /* renamed from: b  reason: collision with root package name */
    public int f1368b;

    /* renamed from: c  reason: collision with root package name */
    public int f1369c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1370d;

    /* renamed from: e  reason: collision with root package name */
    public Object f1371e;

    public g() {
        this.f1367a = 1;
        this.f1370d = new long[10];
        this.f1371e = new Object[10];
    }

    public static g d(AbstractC0852m abstractC0852m, int i7, int i8) {
        if (i7 >= 0 && i7 < 8) {
            if (i8 >= 0) {
                if (abstractC0852m.size() > 0 && i8 == 0) {
                    throw new Exception(io.flutter.plugins.pathprovider.b.e(i8, "Invalid hash count: "));
                }
                if (abstractC0852m.size() == 0 && i7 != 0) {
                    throw new Exception(io.flutter.plugins.pathprovider.b.e(i7, "Expected padding of 0 when bitmap length is 0, but got "));
                }
                return new g(abstractC0852m, i7, i8);
            }
            throw new Exception(io.flutter.plugins.pathprovider.b.e(i8, "Invalid hash count: "));
        }
        throw new Exception(io.flutter.plugins.pathprovider.b.e(i7, "Invalid padding: "));
    }

    public static long f(byte[] bArr, int i7) {
        long j = 0;
        for (int i8 = 0; i8 < 8; i8++) {
            j |= (bArr[i7 + i8] & 255) << (i8 * 8);
        }
        return j;
    }

    public synchronized void a(Object obj, long j) {
        int i7 = this.f1369c;
        if (i7 > 0) {
            if (j <= ((long[]) this.f1370d)[((this.f1368b + i7) - 1) % ((Object[]) this.f1371e).length]) {
                c();
            }
        }
        e();
        int i8 = this.f1368b;
        int i9 = this.f1369c;
        Object[] objArr = (Object[]) this.f1371e;
        int length = (i8 + i9) % objArr.length;
        ((long[]) this.f1370d)[length] = j;
        objArr[length] = obj;
        this.f1369c = i9 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new C.b(this, 23));
    }

    public synchronized void c() {
        this.f1368b = 0;
        this.f1369c = 0;
        Arrays.fill((Object[]) this.f1371e, (Object) null);
    }

    public void e() {
        int length = ((Object[]) this.f1371e).length;
        if (this.f1369c < length) {
            return;
        }
        int i7 = length * 2;
        long[] jArr = new long[i7];
        Object[] objArr = new Object[i7];
        int i8 = this.f1368b;
        int i9 = length - i8;
        System.arraycopy((long[]) this.f1370d, i8, jArr, 0, i9);
        System.arraycopy((Object[]) this.f1371e, this.f1368b, objArr, 0, i9);
        int i10 = this.f1368b;
        if (i10 > 0) {
            System.arraycopy((long[]) this.f1370d, 0, jArr, i9, i10);
            System.arraycopy((Object[]) this.f1371e, 0, objArr, i9, this.f1368b);
        }
        this.f1370d = jArr;
        this.f1371e = objArr;
        this.f1368b = 0;
    }

    public void g(Typeface typeface) {
        int i7;
        boolean z7;
        if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f1368b) != -1) {
            if ((this.f1369c & 2) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            typeface = AbstractC1618y.a(typeface, i7, z7);
        }
        C1620z c1620z = (C1620z) this.f1371e;
        if (c1620z.f14899m) {
            c1620z.f14898l = typeface;
            TextView textView = (TextView) ((WeakReference) this.f1370d).get();
            if (textView != null) {
                Field field = AbstractC1066z.f11214a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new H.l(textView, typeface, c1620z.j));
                } else {
                    textView.setTypeface(typeface, c1620z.j);
                }
            }
        }
    }

    public synchronized Object h() {
        Object j;
        if (this.f1369c == 0) {
            j = null;
        } else {
            j = j();
        }
        return j;
    }

    public synchronized Object i(long j) {
        Object obj;
        obj = null;
        while (this.f1369c > 0 && j - ((long[]) this.f1370d)[this.f1368b] >= 0) {
            obj = j();
        }
        return obj;
    }

    public Object j() {
        boolean z7;
        if (this.f1369c > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        Object[] objArr = (Object[]) this.f1371e;
        int i7 = this.f1368b;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f1368b = (i7 + 1) % objArr.length;
        this.f1369c--;
        return obj;
    }

    public synchronized int k() {
        return this.f1369c;
    }

    public String toString() {
        switch (this.f1367a) {
            case 3:
                return "BloomFilter{hashCount=" + this.f1369c + ", size=" + this.f1368b + ", bitmap=\"" + Base64.encodeToString(((AbstractC0852m) this.f1370d).v(), 2) + "\"}";
            default:
                return super.toString();
        }
    }

    public g(AbstractC0852m abstractC0852m, int i7, int i8) {
        this.f1367a = 3;
        if (i7 < 0 || i7 >= 8) {
            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Invalid padding: "));
        }
        if (i8 >= 0) {
            if (abstractC0852m.size() > 0 && i8 == 0) {
                throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i8, "Invalid hash count: "));
            }
            if (abstractC0852m.size() == 0 && i7 != 0) {
                throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Expected padding of 0 when bitmap length is 0, but got "));
            }
            this.f1370d = abstractC0852m;
            this.f1369c = i8;
            this.f1368b = (abstractC0852m.size() * 8) - i7;
            try {
                this.f1371e = MessageDigest.getInstance("MD5");
                return;
            } catch (NoSuchAlgorithmException e7) {
                throw new RuntimeException("Missing MD5 MessageDigest provider: ", e7);
            }
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i8, "Invalid hash count: "));
    }

    public g(C1620z c1620z, int i7, int i8, WeakReference weakReference) {
        this.f1367a = 2;
        this.f1371e = c1620z;
        this.f1368b = i7;
        this.f1369c = i8;
        this.f1370d = weakReference;
    }

    public g(int i7) {
        this.f1367a = 0;
        this.f1370d = new v[i7];
        this.f1369c = 0;
    }
}
