package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
/* loaded from: classes2.dex */
abstract class X2 extends AbstractC1240d implements Iterable {

    /* renamed from: e  reason: collision with root package name */
    Object f13180e;
    Object[] f;

    public abstract Object c(int i7);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void s(Object obj, int i7, int i8, Object obj2);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int t(Object obj);

    protected abstract Object[] w();

    /* JADX INFO: Access modifiers changed from: package-private */
    public X2(int i7) {
        super(i7);
        this.f13180e = c(1 << this.f13233a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public X2() {
        this.f13180e = c(16);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(long j) {
        long t7;
        int i7;
        int i8 = this.f13235c;
        if (i8 == 0) {
            t7 = t(this.f13180e);
        } else {
            t7 = t(this.f[i8]) + this.f13236d[i8];
        }
        if (j > t7) {
            if (this.f == null) {
                Object[] w2 = w();
                this.f = w2;
                this.f13236d = new long[8];
                w2[0] = this.f13180e;
            }
            int i9 = this.f13235c + 1;
            while (j > t7) {
                Object[] objArr = this.f;
                if (i9 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f = Arrays.copyOf(objArr, length);
                    this.f13236d = Arrays.copyOf(this.f13236d, length);
                }
                int i10 = this.f13233a;
                if (i9 != 0 && i9 != 1) {
                    i10 = Math.min((i10 + i9) - 1, 30);
                }
                int i11 = 1 << i10;
                this.f[i9] = c(i11);
                long[] jArr = this.f13236d;
                jArr[i9] = jArr[i9 - 1] + t(this.f[i7]);
                t7 += i11;
                i9++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int u(long j) {
        if (this.f13235c == 0) {
            if (j < this.f13234b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else {
            for (int i7 = 0; i7 <= this.f13235c; i7++) {
                if (j < this.f13236d[i7] + t(this.f[i7])) {
                    return i7;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
    }

    public void r(int i7, Object obj) {
        long j = i7;
        long count = count() + j;
        if (count > t(obj) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f13235c == 0) {
            System.arraycopy(this.f13180e, 0, obj, i7, this.f13234b);
            return;
        }
        for (int i8 = 0; i8 < this.f13235c; i8++) {
            Object obj2 = this.f[i8];
            System.arraycopy(obj2, 0, obj, i7, t(obj2));
            i7 += t(this.f[i8]);
        }
        int i9 = this.f13234b;
        if (i9 > 0) {
            System.arraycopy(this.f13180e, 0, obj, i7, i9);
        }
    }

    public Object d() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object c8 = c((int) count);
        r(0, c8);
        return c8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        long t7;
        if (this.f13234b == t(this.f13180e)) {
            if (this.f == null) {
                Object[] w2 = w();
                this.f = w2;
                this.f13236d = new long[8];
                w2[0] = this.f13180e;
            }
            int i7 = this.f13235c;
            int i8 = i7 + 1;
            Object[] objArr = this.f;
            if (i8 >= objArr.length || objArr[i8] == null) {
                if (i7 == 0) {
                    t7 = t(this.f13180e);
                } else {
                    t7 = t(objArr[i7]) + this.f13236d[i7];
                }
                v(t7 + 1);
            }
            this.f13234b = 0;
            int i9 = this.f13235c + 1;
            this.f13235c = i9;
            this.f13180e = this.f[i9];
        }
    }

    @Override // j$.util.stream.AbstractC1240d
    public final void clear() {
        Object[] objArr = this.f;
        if (objArr != null) {
            this.f13180e = objArr[0];
            this.f = null;
            this.f13236d = null;
        }
        this.f13234b = 0;
        this.f13235c = 0;
    }

    public void e(Object obj) {
        for (int i7 = 0; i7 < this.f13235c; i7++) {
            Object obj2 = this.f[i7];
            s(obj2, 0, t(obj2), obj);
        }
        s(this.f13180e, 0, this.f13234b, obj);
    }
}
