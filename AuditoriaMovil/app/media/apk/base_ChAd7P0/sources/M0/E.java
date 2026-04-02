package M0;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
/* loaded from: classes.dex */
public final class E extends AbstractC0236c {

    /* renamed from: X  reason: collision with root package name */
    public final DatagramPacket f3134X;

    /* renamed from: Y  reason: collision with root package name */
    public Uri f3135Y;

    /* renamed from: Z  reason: collision with root package name */
    public DatagramSocket f3136Z;

    /* renamed from: e  reason: collision with root package name */
    public final int f3137e;

    /* renamed from: e0  reason: collision with root package name */
    public MulticastSocket f3138e0;
    public final byte[] f;

    /* renamed from: f0  reason: collision with root package name */
    public InetAddress f3139f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f3140g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f3141h0;

    public E(int i7) {
        super(true);
        this.f3137e = i7;
        byte[] bArr = new byte[2000];
        this.f = bArr;
        this.f3134X = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // M0.h
    public final void close() {
        this.f3135Y = null;
        MulticastSocket multicastSocket = this.f3138e0;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f3139f0;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f3138e0 = null;
        }
        DatagramSocket datagramSocket = this.f3136Z;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f3136Z = null;
        }
        this.f3139f0 = null;
        this.f3141h0 = 0;
        if (this.f3140g0) {
            this.f3140g0 = false;
            c();
        }
    }

    @Override // M0.h
    public final long e(l lVar) {
        Uri uri = lVar.f3172a;
        this.f3135Y = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f3135Y.getPort();
        h();
        try {
            this.f3139f0 = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f3139f0, port);
            if (this.f3139f0.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f3138e0 = multicastSocket;
                multicastSocket.joinGroup(this.f3139f0);
                this.f3136Z = this.f3138e0;
            } else {
                this.f3136Z = new DatagramSocket(inetSocketAddress);
            }
            this.f3136Z.setSoTimeout(this.f3137e);
            this.f3140g0 = true;
            k(lVar);
            return -1L;
        } catch (IOException e7) {
            throw new i(e7, 2001);
        } catch (SecurityException e8) {
            throw new i(e8, 2006);
        }
    }

    @Override // M0.h
    public final Uri p() {
        return this.f3135Y;
    }

    @Override // H0.InterfaceC0131k
    public final int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f3141h0;
        DatagramPacket datagramPacket = this.f3134X;
        if (i9 == 0) {
            try {
                DatagramSocket datagramSocket = this.f3136Z;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f3141h0 = length;
                b(length);
            } catch (SocketTimeoutException e7) {
                throw new i(e7, 2002);
            } catch (IOException e8) {
                throw new i(e8, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i10 = this.f3141h0;
        int min = Math.min(i10, i8);
        System.arraycopy(this.f, length2 - i10, bArr, i7, min);
        this.f3141h0 -= min;
        return min;
    }
}
