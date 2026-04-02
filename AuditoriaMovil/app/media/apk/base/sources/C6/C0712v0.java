package c6;

import a6.C0493w;
import java.net.SocketAddress;
import java.util.List;
/* renamed from: c6.v0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0712v0 {

    /* renamed from: a  reason: collision with root package name */
    public List f9015a;

    /* renamed from: b  reason: collision with root package name */
    public int f9016b;

    /* renamed from: c  reason: collision with root package name */
    public int f9017c;

    public SocketAddress a() {
        if (c()) {
            return (SocketAddress) ((C0493w) this.f9015a.get(this.f9016b)).f7224a.get(this.f9017c);
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public boolean b() {
        if (!c()) {
            return false;
        }
        int i7 = this.f9017c + 1;
        this.f9017c = i7;
        if (i7 < ((C0493w) this.f9015a.get(this.f9016b)).f7224a.size()) {
            return true;
        }
        int i8 = this.f9016b + 1;
        this.f9016b = i8;
        this.f9017c = 0;
        if (i8 >= this.f9015a.size()) {
            return false;
        }
        return true;
    }

    public boolean c() {
        if (this.f9016b < this.f9015a.size()) {
            return true;
        }
        return false;
    }

    public void d() {
        this.f9016b = 0;
        this.f9017c = 0;
    }

    public boolean e(SocketAddress socketAddress) {
        for (int i7 = 0; i7 < this.f9015a.size(); i7++) {
            int indexOf = ((C0493w) this.f9015a.get(i7)).f7224a.indexOf(socketAddress);
            if (indexOf != -1) {
                this.f9016b = i7;
                this.f9017c = indexOf;
                return true;
            }
        }
        return false;
    }
}
