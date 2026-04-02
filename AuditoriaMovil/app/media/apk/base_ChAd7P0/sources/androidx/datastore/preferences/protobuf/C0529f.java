package androidx.datastore.preferences.protobuf;

import D.AbstractC0059i;
/* renamed from: androidx.datastore.preferences.protobuf.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0529f extends C0530g {

    /* renamed from: e  reason: collision with root package name */
    public final int f7812e;
    public final int f;

    public C0529f(byte[] bArr, int i7, int i8) {
        super(bArr);
        C0530g.f(i7, i7 + i8, bArr.length);
        this.f7812e = i7;
        this.f = i8;
    }

    @Override // androidx.datastore.preferences.protobuf.C0530g
    public final byte e(int i7) {
        int i8 = this.f;
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException(io.flutter.plugins.pathprovider.b.e(i7, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0059i.x("Index > length: ", i7, i8, ", "));
        }
        return this.f7821b[this.f7812e + i7];
    }

    @Override // androidx.datastore.preferences.protobuf.C0530g
    public final void i(byte[] bArr, int i7) {
        System.arraycopy(this.f7821b, this.f7812e, bArr, 0, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.C0530g
    public final int k() {
        return this.f7812e;
    }

    @Override // androidx.datastore.preferences.protobuf.C0530g
    public final byte l(int i7) {
        return this.f7821b[this.f7812e + i7];
    }

    @Override // androidx.datastore.preferences.protobuf.C0530g
    public final int size() {
        return this.f;
    }
}
