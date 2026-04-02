package X6;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class c extends OutputStream {
    public static final /* synthetic */ int f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6542a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f6543b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f6544c;

    /* renamed from: d  reason: collision with root package name */
    public int f6545d;

    /* renamed from: e  reason: collision with root package name */
    public int f6546e;

    public c() {
        a(8192);
    }

    public final void a(int i7) {
        int i8 = this.f6545d;
        ArrayList arrayList = this.f6542a;
        if (i8 < arrayList.size() - 1) {
            this.f6546e += this.f6544c.length;
            int i9 = this.f6545d + 1;
            this.f6545d = i9;
            this.f6544c = (byte[]) arrayList.get(i9);
            return;
        }
        byte[] bArr = this.f6544c;
        if (bArr == null) {
            this.f6546e = 0;
        } else {
            i7 = Math.max(bArr.length << 1, i7 - this.f6546e);
            this.f6546e += this.f6544c.length;
        }
        this.f6545d++;
        byte[] bArr2 = S6.c.f5279a;
        byte[] bArr3 = new byte[i7];
        this.f6544c = bArr3;
        arrayList.add(bArr3);
    }

    public final byte[] b() {
        int i7 = this.f6543b;
        if (i7 == 0) {
            return S6.c.f5279a;
        }
        byte[] bArr = S6.c.f5279a;
        byte[] bArr2 = new byte[i7];
        Iterator it = this.f6542a.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            int min = Math.min(bArr3.length, i7);
            System.arraycopy(bArr3, 0, bArr2, i8, min);
            i8 += min;
            i7 -= min;
            if (i7 == 0) {
                break;
            }
        }
        return bArr2;
    }

    public final String toString() {
        return new String(b(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i8) {
        int i9;
        if (i7 < 0 || i7 > bArr.length || i8 < 0 || (i9 = i7 + i8) > bArr.length || i9 < 0) {
            throw new IndexOutOfBoundsException(String.format("offset=%,d, length=%,d", Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        if (i8 == 0) {
            return;
        }
        int i10 = this.f6543b;
        int i11 = i10 + i8;
        int i12 = i10 - this.f6546e;
        while (i8 > 0) {
            int min = Math.min(i8, this.f6544c.length - i12);
            System.arraycopy(bArr, i9 - i8, this.f6544c, i12, min);
            i8 -= min;
            if (i8 > 0) {
                a(i11);
                i12 = 0;
            }
        }
        this.f6543b = i11;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i7) {
        int i8 = this.f6543b;
        int i9 = i8 - this.f6546e;
        if (i9 == this.f6544c.length) {
            a(i8 + 1);
            i9 = 0;
        }
        this.f6544c[i9] = (byte) i7;
        this.f6543b++;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
