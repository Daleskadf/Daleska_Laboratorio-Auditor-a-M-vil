package e6;

import Q6.AbstractC0281b;
import Q6.s;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
/* renamed from: e6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0968c {

    /* renamed from: b  reason: collision with root package name */
    public final s f10929b;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f10928a = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public C0967b[] f10932e = new C0967b[8];
    public int f = 7;

    /* renamed from: g  reason: collision with root package name */
    public int f10933g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f10934h = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f10930c = RecognitionOptions.AZTEC;

    /* renamed from: d  reason: collision with root package name */
    public int f10931d = RecognitionOptions.AZTEC;

    public C0968c(C0970e c0970e) {
        this.f10929b = AbstractC0281b.b(c0970e);
    }

    public final int a(int i7) {
        int i8;
        int i9 = 0;
        if (i7 > 0) {
            int length = this.f10932e.length;
            while (true) {
                length--;
                i8 = this.f;
                if (length < i8 || i7 <= 0) {
                    break;
                }
                int i10 = this.f10932e[length].f10927c;
                i7 -= i10;
                this.f10934h -= i10;
                this.f10933g--;
                i9++;
            }
            C0967b[] c0967bArr = this.f10932e;
            System.arraycopy(c0967bArr, i8 + 1, c0967bArr, i8 + 1 + i9, this.f10933g);
            this.f += i9;
        }
        return i9;
    }

    public final Q6.g b(int i7) {
        if (i7 >= 0) {
            C0967b[] c0967bArr = AbstractC0969d.f10936b;
            if (i7 <= c0967bArr.length - 1) {
                return c0967bArr[i7].f10925a;
            }
        }
        int length = this.f + 1 + (i7 - AbstractC0969d.f10936b.length);
        if (length >= 0) {
            C0967b[] c0967bArr2 = this.f10932e;
            if (length < c0967bArr2.length) {
                return c0967bArr2[length].f10925a;
            }
        }
        throw new IOException("Header index too large " + (i7 + 1));
    }

    public final void c(C0967b c0967b) {
        this.f10928a.add(c0967b);
        int i7 = this.f10931d;
        int i8 = c0967b.f10927c;
        if (i8 > i7) {
            Arrays.fill(this.f10932e, (Object) null);
            this.f = this.f10932e.length - 1;
            this.f10933g = 0;
            this.f10934h = 0;
            return;
        }
        a((this.f10934h + i8) - i7);
        int i9 = this.f10933g + 1;
        C0967b[] c0967bArr = this.f10932e;
        if (i9 > c0967bArr.length) {
            C0967b[] c0967bArr2 = new C0967b[c0967bArr.length * 2];
            System.arraycopy(c0967bArr, 0, c0967bArr2, c0967bArr.length, c0967bArr.length);
            this.f = this.f10932e.length - 1;
            this.f10932e = c0967bArr2;
        }
        int i10 = this.f;
        this.f = i10 - 1;
        this.f10932e[i10] = c0967b;
        this.f10933g++;
        this.f10934h += i8;
    }

    public final Q6.g d() {
        boolean z7;
        int i7;
        s sVar = this.f10929b;
        byte a7 = sVar.a();
        int i8 = a7 & ForkServer.ERROR;
        if ((a7 & 128) == 128) {
            z7 = true;
        } else {
            z7 = false;
        }
        int e7 = e(i8, 127);
        if (z7) {
            C0975j c0975j = C0975j.f10958d;
            long j = e7;
            sVar.n(j);
            byte[] m7 = sVar.f4489b.m(j);
            c0975j.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            G1.h hVar = c0975j.f10959a;
            G1.h hVar2 = hVar;
            int i9 = 0;
            int i10 = 0;
            for (byte b5 : m7) {
                i9 = (i9 << 8) | (b5 & ForkServer.ERROR);
                i10 += 8;
                while (i10 >= 8) {
                    hVar2 = ((G1.h[]) hVar2.f1374c)[(i9 >>> (i10 - 8)) & 255];
                    if (((G1.h[]) hVar2.f1374c) == null) {
                        byteArrayOutputStream.write(hVar2.f1372a);
                        i10 -= hVar2.f1373b;
                        hVar2 = hVar;
                    } else {
                        i10 -= 8;
                    }
                }
            }
            while (i10 > 0) {
                G1.h hVar3 = ((G1.h[]) hVar2.f1374c)[(i9 << (8 - i10)) & 255];
                if (((G1.h[]) hVar3.f1374c) != null || (i7 = hVar3.f1373b) > i10) {
                    break;
                }
                byteArrayOutputStream.write(hVar3.f1372a);
                i10 -= i7;
                hVar2 = hVar;
            }
            return Q6.g.k(byteArrayOutputStream.toByteArray());
        }
        return sVar.b(e7);
    }

    public final int e(int i7, int i8) {
        int i9 = i7 & i8;
        if (i9 < i8) {
            return i9;
        }
        int i10 = 0;
        while (true) {
            byte a7 = this.f10929b.a();
            int i11 = a7 & ForkServer.ERROR;
            if ((a7 & 128) != 0) {
                i8 += (a7 & Byte.MAX_VALUE) << i10;
                i10 += 7;
            } else {
                return i8 + (i11 << i10);
            }
        }
    }
}
