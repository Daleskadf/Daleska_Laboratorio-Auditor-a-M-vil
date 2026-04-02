package com.google.crypto.tink.shaded.protobuf;

import D.AbstractC0059i;
/* renamed from: com.google.crypto.tink.shaded.protobuf.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0779f extends C0780g {

    /* renamed from: e  reason: collision with root package name */
    public final int f9642e;
    public final int f;

    public C0779f(byte[] bArr, int i7, int i8) {
        super(bArr);
        AbstractC0781h.f(i7, i7 + i8, bArr.length);
        this.f9642e = i7;
        this.f = i8;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0780g, com.google.crypto.tink.shaded.protobuf.AbstractC0781h
    public final byte e(int i7) {
        int i8 = this.f;
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException(io.flutter.plugins.pathprovider.b.e(i7, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0059i.x("Index > length: ", i7, i8, ", "));
        }
        return this.f9647d[this.f9642e + i7];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0780g, com.google.crypto.tink.shaded.protobuf.AbstractC0781h
    public final void i(byte[] bArr, int i7) {
        System.arraycopy(this.f9647d, this.f9642e, bArr, 0, i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0780g
    public final int l() {
        return this.f9642e;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0780g
    public final byte m(int i7) {
        return this.f9647d[this.f9642e + i7];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0780g, com.google.crypto.tink.shaded.protobuf.AbstractC0781h
    public final int size() {
        return this.f;
    }
}
