package a6;

import D.AbstractC0055e;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class B extends SocketAddress {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f7064e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final InetSocketAddress f7065a;

    /* renamed from: b  reason: collision with root package name */
    public final InetSocketAddress f7066b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7067c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7068d;

    public B(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        G.i.j(inetSocketAddress, "proxyAddress");
        G.i.j(inetSocketAddress2, "targetAddress");
        G.i.n(inetSocketAddress, "The proxy address %s is not resolved", !inetSocketAddress.isUnresolved());
        this.f7065a = inetSocketAddress;
        this.f7066b = inetSocketAddress2;
        this.f7067c = str;
        this.f7068d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        B b5 = (B) obj;
        if (!F.f.l(this.f7065a, b5.f7065a) || !F.f.l(this.f7066b, b5.f7066b) || !F.f.l(this.f7067c, b5.f7067c) || !F.f.l(this.f7068d, b5.f7068d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7065a, this.f7066b, this.f7067c, this.f7068d});
    }

    public final String toString() {
        boolean z7;
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f7065a, "proxyAddr");
        C7.a(this.f7066b, "targetAddr");
        C7.a(this.f7067c, "username");
        if (this.f7068d != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        C7.c("hasPassword", z7);
        return C7.toString();
    }
}
