package com.google.protobuf;
/* renamed from: com.google.protobuf.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848k extends C0850l {

    /* renamed from: e  reason: collision with root package name */
    public final int f10079e;
    public final int f;

    public C0848k(byte[] bArr, int i7, int i8) {
        super(bArr);
        AbstractC0852m.k(i7, i7 + i8, bArr.length);
        this.f10079e = i7;
        this.f = i8;
    }

    @Override // com.google.protobuf.C0850l, com.google.protobuf.AbstractC0852m
    public final byte h(int i7) {
        AbstractC0852m.i(i7, this.f);
        return this.f10082d[this.f10079e + i7];
    }

    @Override // com.google.protobuf.C0850l, com.google.protobuf.AbstractC0852m
    public final void m(int i7, byte[] bArr, int i8, int i9) {
        System.arraycopy(this.f10082d, this.f10079e + i7, bArr, i8, i9);
    }

    @Override // com.google.protobuf.C0850l, com.google.protobuf.AbstractC0852m
    public final byte o(int i7) {
        return this.f10082d[this.f10079e + i7];
    }

    @Override // com.google.protobuf.C0850l, com.google.protobuf.AbstractC0852m
    public final int size() {
        return this.f;
    }

    @Override // com.google.protobuf.C0850l
    public final int z() {
        return this.f10079e;
    }
}
