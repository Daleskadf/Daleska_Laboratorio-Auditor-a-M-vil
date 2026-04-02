package a1;

import D.AbstractC0059i;
import android.net.Uri;
import java.net.DatagramSocket;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import r3.AbstractC1740d;
/* renamed from: a1.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423I implements InterfaceC0428e {

    /* renamed from: a  reason: collision with root package name */
    public final M0.E f6783a = new M0.E(AbstractC1740d.g(8000));

    /* renamed from: b  reason: collision with root package name */
    public C0423I f6784b;

    @Override // M0.h
    public final void close() {
        this.f6783a.close();
        C0423I c0423i = this.f6784b;
        if (c0423i != null) {
            c0423i.close();
        }
    }

    @Override // a1.InterfaceC0428e
    public final String d() {
        boolean z7;
        int g3 = g();
        if (g3 != -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        int i7 = K0.x.f2529a;
        Locale locale = Locale.US;
        return AbstractC0059i.x("RTP/AVP;unicast;client_port=", g3, 1 + g3, "-");
    }

    @Override // M0.h
    public final long e(M0.l lVar) {
        this.f6783a.e(lVar);
        return -1L;
    }

    @Override // a1.InterfaceC0428e
    public final int g() {
        int localPort;
        DatagramSocket datagramSocket = this.f6783a.f3136Z;
        if (datagramSocket == null) {
            localPort = -1;
        } else {
            localPort = datagramSocket.getLocalPort();
        }
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // M0.h
    public final Map j() {
        return Collections.emptyMap();
    }

    @Override // M0.h
    public final void n(M0.C c8) {
        this.f6783a.n(c8);
    }

    @Override // a1.InterfaceC0428e
    public final boolean o() {
        return true;
    }

    @Override // M0.h
    public final Uri p() {
        return this.f6783a.f3135Y;
    }

    @Override // H0.InterfaceC0131k
    public final int read(byte[] bArr, int i7, int i8) {
        try {
            return this.f6783a.read(bArr, i7, i8);
        } catch (M0.D e7) {
            if (e7.f3159a == 2002) {
                return -1;
            }
            throw e7;
        }
    }

    @Override // a1.InterfaceC0428e
    public final C0422H u() {
        return null;
    }
}
