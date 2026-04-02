package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
/* renamed from: com.google.protobuf.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0850l extends AbstractC0852m {

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f10082d;

    public C0850l(byte[] bArr) {
        bArr.getClass();
        this.f10082d = bArr;
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final ByteBuffer e() {
        return ByteBuffer.wrap(this.f10082d, z(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0852m) || size() != ((AbstractC0852m) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C0850l) {
            C0850l c0850l = (C0850l) obj;
            int i7 = this.f10087a;
            int i8 = c0850l.f10087a;
            if (i7 != 0 && i8 != 0 && i7 != i8) {
                return false;
            }
            return y(c0850l, 0, size());
        }
        return obj.equals(this);
    }

    @Override // com.google.protobuf.AbstractC0852m
    public byte h(int i7) {
        return this.f10082d[i7];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0842h(this);
    }

    @Override // com.google.protobuf.AbstractC0852m
    public void m(int i7, byte[] bArr, int i8, int i9) {
        System.arraycopy(this.f10082d, i7, bArr, i8, i9);
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final int n() {
        return 0;
    }

    @Override // com.google.protobuf.AbstractC0852m
    public byte o(int i7) {
        return this.f10082d[i7];
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final boolean p() {
        return true;
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final boolean q() {
        int z7 = z();
        if (b1.f10057a.U(0, this.f10082d, z7, size() + z7) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final J6.b r() {
        return J6.b.h(this.f10082d, z(), size(), true);
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final int s(int i7, int i8, int i9) {
        int z7 = z() + i8;
        Charset charset = V.f10033a;
        for (int i10 = z7; i10 < z7 + i9; i10++) {
            i7 = (i7 * 31) + this.f10082d[i10];
        }
        return i7;
    }

    @Override // com.google.protobuf.AbstractC0852m
    public int size() {
        return this.f10082d.length;
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final int t(int i7, int i8, int i9) {
        int z7 = z() + i8;
        return b1.f10057a.U(i7, this.f10082d, z7, i9 + z7);
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final AbstractC0852m u(int i7, int i8) {
        int k2 = AbstractC0852m.k(i7, i8, size());
        if (k2 == 0) {
            return AbstractC0852m.f10085b;
        }
        return new C0848k(this.f10082d, z() + i7, k2);
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final String w(Charset charset) {
        return new String(this.f10082d, z(), size(), charset);
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final void x(AbstractC0865t abstractC0865t) {
        abstractC0865t.W(this.f10082d, z(), size());
    }

    public final boolean y(C0850l c0850l, int i7, int i8) {
        if (i8 <= c0850l.size()) {
            int i9 = i7 + i8;
            if (i9 <= c0850l.size()) {
                if (c0850l instanceof C0850l) {
                    int z7 = z() + i8;
                    int z8 = z();
                    int z9 = c0850l.z() + i7;
                    while (z8 < z7) {
                        if (this.f10082d[z8] != c0850l.f10082d[z9]) {
                            return false;
                        }
                        z8++;
                        z9++;
                    }
                    return true;
                }
                return c0850l.u(i7, i9).equals(u(0, i8));
            }
            throw new IllegalArgumentException("Ran off end of other: " + i7 + ", " + i8 + ", " + c0850l.size());
        }
        throw new IllegalArgumentException("Length too large: " + i8 + size());
    }

    public int z() {
        return 0;
    }
}
