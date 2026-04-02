package c6;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class Z1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f8725a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8726b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8727c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f8728d;

    public Z1(float f, float f4) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f8728d = atomicInteger;
        this.f8727c = (int) (f4 * 1000.0f);
        int i7 = (int) (f * 1000.0f);
        this.f8725a = i7;
        this.f8726b = i7 / 2;
        atomicInteger.set(i7);
    }

    public final boolean a() {
        AtomicInteger atomicInteger;
        int i7;
        int i8;
        do {
            atomicInteger = this.f8728d;
            i7 = atomicInteger.get();
            if (i7 == 0) {
                return false;
            }
            i8 = i7 - 1000;
        } while (!atomicInteger.compareAndSet(i7, Math.max(i8, 0)));
        if (i8 <= this.f8726b) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z1)) {
            return false;
        }
        Z1 z12 = (Z1) obj;
        if (this.f8725a == z12.f8725a && this.f8727c == z12.f8727c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8725a), Integer.valueOf(this.f8727c)});
    }
}
