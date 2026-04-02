package i6;

import a6.C0493w;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.List;
/* renamed from: i6.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1123j {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f11528a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11529b;

    public C1123j(C0493w c0493w) {
        G.i.j(c0493w, "eag");
        List<SocketAddress> list = c0493w.f7224a;
        this.f11528a = new String[list.size()];
        int i7 = 0;
        for (SocketAddress socketAddress : list) {
            this.f11528a[i7] = socketAddress.toString();
            i7++;
        }
        Arrays.sort(this.f11528a);
        this.f11529b = Arrays.hashCode(this.f11528a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1123j)) {
            return false;
        }
        C1123j c1123j = (C1123j) obj;
        if (c1123j.f11529b == this.f11529b) {
            String[] strArr = c1123j.f11528a;
            int length = strArr.length;
            String[] strArr2 = this.f11528a;
            if (length == strArr2.length) {
                return Arrays.equals(strArr, strArr2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11529b;
    }

    public final String toString() {
        return Arrays.toString(this.f11528a);
    }
}
