package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class Y extends InputStream {

    /* renamed from: X  reason: collision with root package name */
    public byte[] f10039X;

    /* renamed from: Y  reason: collision with root package name */
    public int f10040Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f10041Z;

    /* renamed from: a  reason: collision with root package name */
    public Iterator f10042a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f10043b;

    /* renamed from: c  reason: collision with root package name */
    public int f10044c;

    /* renamed from: d  reason: collision with root package name */
    public int f10045d;

    /* renamed from: e  reason: collision with root package name */
    public int f10046e;
    public boolean f;

    public final boolean a() {
        this.f10045d++;
        Iterator it = this.f10042a;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f10043b = byteBuffer;
        this.f10046e = byteBuffer.position();
        if (this.f10043b.hasArray()) {
            this.f = true;
            this.f10039X = this.f10043b.array();
            this.f10040Y = this.f10043b.arrayOffset();
        } else {
            this.f = false;
            this.f10041Z = Y0.f10049c.j(this.f10043b, Y0.f10052g);
            this.f10039X = null;
        }
        return true;
    }

    public final void b(int i7) {
        int i8 = this.f10046e + i7;
        this.f10046e = i8;
        if (i8 == this.f10043b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f10045d == this.f10044c) {
            return -1;
        }
        if (this.f) {
            int i7 = this.f10039X[this.f10046e + this.f10040Y] & ForkServer.ERROR;
            b(1);
            return i7;
        }
        int e7 = Y0.f10049c.e(this.f10046e + this.f10041Z) & ForkServer.ERROR;
        b(1);
        return e7;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        if (this.f10045d == this.f10044c) {
            return -1;
        }
        int limit = this.f10043b.limit();
        int i9 = this.f10046e;
        int i10 = limit - i9;
        if (i8 > i10) {
            i8 = i10;
        }
        if (this.f) {
            System.arraycopy(this.f10039X, i9 + this.f10040Y, bArr, i7, i8);
            b(i8);
        } else {
            int position = this.f10043b.position();
            this.f10043b.position(this.f10046e);
            this.f10043b.get(bArr, i7, i8);
            this.f10043b.position(position);
            b(i8);
        }
        return i8;
    }
}
