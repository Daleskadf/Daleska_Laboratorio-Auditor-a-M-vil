package z3;

import a1.C0415A;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p.C1608t;
/* loaded from: classes.dex */
public final class m implements Iterator {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ C0415A f16890X;

    /* renamed from: b  reason: collision with root package name */
    public String f16892b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f16893c;

    /* renamed from: d  reason: collision with root package name */
    public final e f16894d;

    /* renamed from: a  reason: collision with root package name */
    public EnumC2071b f16891a = EnumC2071b.NOT_READY;

    /* renamed from: e  reason: collision with root package name */
    public int f16895e = 0;
    public int f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public m(C0415A c0415a, C1608t c1608t, CharSequence charSequence) {
        this.f16890X = c0415a;
        this.f16894d = (e) c1608t.f14880b;
        this.f16893c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z7;
        String str;
        e eVar;
        EnumC2071b enumC2071b = this.f16891a;
        EnumC2071b enumC2071b2 = EnumC2071b.FAILED;
        if (enumC2071b != enumC2071b2) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.p(z7);
        int i7 = AbstractC2070a.f16878a[this.f16891a.ordinal()];
        if (i7 == 1) {
            return false;
        }
        if (i7 == 2) {
            return true;
        }
        this.f16891a = enumC2071b2;
        int i8 = this.f16895e;
        while (true) {
            int i9 = this.f16895e;
            if (i9 != -1) {
                d dVar = (d) this.f16890X.f6744a;
                CharSequence charSequence = this.f16893c;
                int length = charSequence.length();
                G.i.k(i9, length);
                while (true) {
                    if (i9 < length) {
                        if (dVar.a(charSequence.charAt(i9))) {
                            break;
                        }
                        i9++;
                    } else {
                        i9 = -1;
                        break;
                    }
                }
                if (i9 == -1) {
                    i9 = charSequence.length();
                    this.f16895e = -1;
                } else {
                    this.f16895e = i9 + 1;
                }
                int i10 = this.f16895e;
                if (i10 == i8) {
                    int i11 = i10 + 1;
                    this.f16895e = i11;
                    if (i11 > charSequence.length()) {
                        this.f16895e = -1;
                    }
                } else {
                    while (true) {
                        eVar = this.f16894d;
                        if (i8 >= i9 || !eVar.a(charSequence.charAt(i8))) {
                            break;
                        }
                        i8++;
                    }
                    while (i9 > i8 && eVar.a(charSequence.charAt(i9 - 1))) {
                        i9--;
                    }
                    int i12 = this.f;
                    if (i12 == 1) {
                        i9 = charSequence.length();
                        this.f16895e = -1;
                        while (i9 > i8 && eVar.a(charSequence.charAt(i9 - 1))) {
                            i9--;
                        }
                    } else {
                        this.f = i12 - 1;
                    }
                    str = charSequence.subSequence(i8, i9).toString();
                }
            } else {
                this.f16891a = EnumC2071b.DONE;
                str = null;
                break;
            }
        }
        this.f16892b = str;
        if (this.f16891a == EnumC2071b.DONE) {
            return false;
        }
        this.f16891a = EnumC2071b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f16891a = EnumC2071b.NOT_READY;
            String str = this.f16892b;
            this.f16892b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
