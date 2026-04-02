package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C0527d;
import java.util.Iterator;
/* renamed from: com.google.crypto.tink.shaded.protobuf.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0780g extends AbstractC0781h {

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f9647d;

    public C0780g(byte[] bArr) {
        this.f9650a = 0;
        bArr.getClass();
        this.f9647d = bArr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0781h
    public byte e(int i7) {
        return this.f9647d[i7];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0781h) || size() != ((AbstractC0781h) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C0780g) {
            C0780g c0780g = (C0780g) obj;
            int i7 = this.f9650a;
            int i8 = c0780g.f9650a;
            if (i7 != 0 && i8 != 0 && i7 != i8) {
                return false;
            }
            int size = size();
            if (size <= c0780g.size()) {
                if (size <= c0780g.size()) {
                    int l8 = l() + size;
                    int l9 = l();
                    int l10 = c0780g.l();
                    while (l9 < l8) {
                        if (this.f9647d[l9] != c0780g.f9647d[l10]) {
                            return false;
                        }
                        l9++;
                        l10++;
                    }
                    return true;
                }
                StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("Ran off end of other: 0, ", size, ", ");
                k2.append(c0780g.size());
                throw new IllegalArgumentException(k2.toString());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0781h
    public void i(byte[] bArr, int i7) {
        System.arraycopy(this.f9647d, 0, bArr, 0, i7);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0527d(this);
    }

    public int l() {
        return 0;
    }

    public byte m(int i7) {
        return this.f9647d[i7];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0781h
    public int size() {
        return this.f9647d.length;
    }
}
