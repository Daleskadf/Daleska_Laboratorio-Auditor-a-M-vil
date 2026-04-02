package B6;

import D.AbstractC0055e;
import java.util.Iterator;
import x6.InterfaceC2020a;
/* loaded from: classes.dex */
public class d implements Iterable, InterfaceC2020a {

    /* renamed from: a  reason: collision with root package name */
    public final int f401a;

    /* renamed from: b  reason: collision with root package name */
    public final int f402b;

    /* renamed from: c  reason: collision with root package name */
    public final int f403c;

    public d(int i7, int i8, int i9) {
        if (i9 != 0) {
            if (i9 != Integer.MIN_VALUE) {
                this.f401a = i7;
                this.f402b = AbstractC0055e.k(i7, i8, i9);
                this.f403c = i9;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f401a != dVar.f401a || this.f402b != dVar.f402b || this.f403c != dVar.f403c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f401a * 31) + this.f402b) * 31) + this.f403c;
    }

    public boolean isEmpty() {
        int i7 = this.f403c;
        int i8 = this.f402b;
        int i9 = this.f401a;
        if (i7 > 0) {
            if (i9 <= i8) {
                return false;
            }
        } else if (i9 >= i8) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this.f401a, this.f402b, this.f403c);
    }

    public String toString() {
        StringBuilder sb;
        int i7 = this.f402b;
        int i8 = this.f401a;
        int i9 = this.f403c;
        if (i9 > 0) {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append("..");
            sb.append(i7);
            sb.append(" step ");
            sb.append(i9);
        } else {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append(" downTo ");
            sb.append(i7);
            sb.append(" step ");
            sb.append(-i9);
        }
        return sb.toString();
    }
}
