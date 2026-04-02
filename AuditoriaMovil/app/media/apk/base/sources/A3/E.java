package A3;

import java.util.Arrays;
import java.util.Collection;
/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f86a;

    /* renamed from: b  reason: collision with root package name */
    public int f87b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f88c;

    public E(int i7) {
        AbstractC0021t.e(i7, "initialCapacity");
        this.f86a = new Object[i7];
        this.f87b = 0;
    }

    public static int e(int i7, int i8) {
        if (i8 >= 0) {
            int i9 = i7 + (i7 >> 1) + 1;
            if (i9 < i8) {
                i9 = Integer.highestOneBit(i8 - 1) << 1;
            }
            if (i9 < 0) {
                return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            }
            return i9;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public final void a(Object obj) {
        obj.getClass();
        f(this.f87b + 1);
        Object[] objArr = this.f86a;
        int i7 = this.f87b;
        this.f87b = i7 + 1;
        objArr[i7] = obj;
    }

    public abstract E b(Object obj);

    public void c(Object obj) {
        a(obj);
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(collection.size() + this.f87b);
            if (collection instanceof F) {
                this.f87b = ((F) collection).f(this.f87b, this.f86a);
                return;
            }
        }
        for (Object obj : iterable) {
            b(obj);
        }
    }

    public final void f(int i7) {
        Object[] objArr = this.f86a;
        if (objArr.length < i7) {
            this.f86a = Arrays.copyOf(objArr, e(objArr.length, i7));
            this.f88c = false;
        } else if (this.f88c) {
            this.f86a = (Object[]) objArr.clone();
            this.f88c = false;
        }
    }
}
