package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class Y2 extends AbstractC1240d implements Consumer, Iterable {

    /* renamed from: e  reason: collision with root package name */
    protected Object[] f13186e = new Object[1 << 4];
    protected Object[][] f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(long j) {
        long length;
        Object[][] objArr;
        int i7;
        int i8 = this.f13235c;
        if (i8 == 0) {
            length = this.f13186e.length;
        } else {
            length = this.f13236d[i8] + this.f[i8].length;
        }
        if (j > length) {
            if (this.f == null) {
                Object[][] objArr2 = new Object[8];
                this.f = objArr2;
                this.f13236d = new long[8];
                objArr2[0] = this.f13186e;
            }
            int i9 = i8 + 1;
            while (j > length) {
                Object[][] objArr3 = this.f;
                if (i9 >= objArr3.length) {
                    int length2 = objArr3.length * 2;
                    this.f = (Object[][]) Arrays.copyOf(objArr3, length2);
                    this.f13236d = Arrays.copyOf(this.f13236d, length2);
                }
                int i10 = this.f13233a;
                if (i9 != 0 && i9 != 1) {
                    i10 = Math.min((i10 + i9) - 1, 30);
                }
                int i11 = 1 << i10;
                this.f[i9] = new Object[i11];
                long[] jArr = this.f13236d;
                jArr[i9] = jArr[i9 - 1] + objArr[i7].length;
                length += i11;
                i9++;
            }
        }
    }

    @Override // j$.util.stream.AbstractC1240d
    public final void clear() {
        Object[][] objArr = this.f;
        if (objArr != null) {
            this.f13186e = objArr[0];
            int i7 = 0;
            while (true) {
                Object[] objArr2 = this.f13186e;
                if (i7 >= objArr2.length) {
                    break;
                }
                objArr2[i7] = null;
                i7++;
            }
            this.f = null;
            this.f13236d = null;
        } else {
            for (int i8 = 0; i8 < this.f13234b; i8++) {
                this.f13186e[i8] = null;
            }
        }
        this.f13234b = 0;
        this.f13235c = 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer consumer) {
        for (int i7 = 0; i7 < this.f13235c; i7++) {
            for (Object obj : this.f[i7]) {
                consumer.accept(obj);
            }
        }
        for (int i8 = 0; i8 < this.f13234b; i8++) {
            consumer.accept(this.f13186e[i8]);
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i7 = this.f13234b;
        Object[] objArr = this.f13186e;
        if (i7 == objArr.length) {
            if (this.f == null) {
                Object[][] objArr2 = new Object[8];
                this.f = objArr2;
                this.f13236d = new long[8];
                objArr2[0] = objArr;
            }
            int i8 = this.f13235c;
            int i9 = i8 + 1;
            Object[][] objArr3 = this.f;
            if (i9 >= objArr3.length || objArr3[i9] == null) {
                if (i8 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i8].length + this.f13236d[i8];
                }
                s(length + 1);
            }
            this.f13234b = 0;
            int i10 = this.f13235c + 1;
            this.f13235c = i10;
            this.f13186e = this.f[i10];
        }
        Object[] objArr4 = this.f13186e;
        int i11 = this.f13234b;
        this.f13234b = i11 + 1;
        objArr4[i11] = obj;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new C1225a(10, arrayList));
        String obj = arrayList.toString();
        return "SpinedBuffer:" + obj;
    }

    @Override // java.lang.Iterable
    public j$.util.Spliterator spliterator() {
        return new P2(this, 0, this.f13235c, 0, this.f13234b);
    }
}
