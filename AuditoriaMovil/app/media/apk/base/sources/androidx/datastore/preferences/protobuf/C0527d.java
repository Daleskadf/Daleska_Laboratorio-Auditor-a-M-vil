package androidx.datastore.preferences.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0780g;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: androidx.datastore.preferences.protobuf.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527d implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7799a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f7800b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final int f7801c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f7802d;

    public C0527d(C0530g c0530g) {
        this.f7802d = c0530g;
        this.f7801c = c0530g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7799a) {
            case 0:
                if (this.f7800b < this.f7801c) {
                    return true;
                }
                return false;
            default:
                if (this.f7800b < this.f7801c) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7799a) {
            case 0:
                int i7 = this.f7800b;
                if (i7 < this.f7801c) {
                    this.f7800b = i7 + 1;
                    return Byte.valueOf(((C0530g) this.f7802d).l(i7));
                }
                throw new NoSuchElementException();
            default:
                int i8 = this.f7800b;
                if (i8 < this.f7801c) {
                    this.f7800b = i8 + 1;
                    return Byte.valueOf(((C0780g) this.f7802d).m(i8));
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7799a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0527d(C0780g c0780g) {
        this.f7802d = c0780g;
        this.f7801c = c0780g.size();
    }
}
