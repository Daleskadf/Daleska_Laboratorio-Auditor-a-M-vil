package a6;

import c6.C0687m1;
import c6.F1;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
/* renamed from: a6.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483l implements InterfaceC0484m, d0, m0, a0 {

    /* renamed from: b  reason: collision with root package name */
    public static final C0483l f7167b = new C0483l(0);

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f7168c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7169a;

    public /* synthetic */ C0483l(int i7) {
        this.f7169a = i7;
    }

    @Override // a6.a0
    public String a(Object obj) {
        return (String) obj;
    }

    @Override // a6.InterfaceC0484m
    public InputStream b(F1 f12) {
        switch (this.f7169a) {
            case 0:
                return f12;
            default:
                return new GZIPInputStream(f12);
        }
    }

    @Override // a6.InterfaceC0484m
    public OutputStream c(C0687m1 c0687m1) {
        switch (this.f7169a) {
            case 0:
                return c0687m1;
            default:
                return new GZIPOutputStream(c0687m1);
        }
    }

    @Override // a6.d0
    public Object d(byte[] bArr) {
        int i7;
        byte b5;
        switch (this.f7169a) {
            case 1:
                for (int i8 = 0; i8 < bArr.length; i8++) {
                    byte b7 = bArr[i8];
                    if (b7 < 32 || b7 >= 126 || (b7 == 37 && i8 + 2 < bArr.length)) {
                        ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
                        int i9 = 0;
                        while (i9 < bArr.length) {
                            if (bArr[i9] == 37 && i9 + 2 < bArr.length) {
                                try {
                                    allocate.put((byte) Integer.parseInt(new String(bArr, i9 + 1, 2, z3.h.f16884a), 16));
                                    i9 += 3;
                                } catch (NumberFormatException unused) {
                                }
                            }
                            allocate.put(bArr[i9]);
                            i9++;
                        }
                        return new String(allocate.array(), 0, allocate.position(), z3.h.f16886c);
                    }
                }
                return new String(bArr, 0);
            default:
                char c8 = 0;
                if (bArr.length == 1 && bArr[0] == 48) {
                    return o0.f7173e;
                }
                int length = bArr.length;
                if (length != 1) {
                    if (length == 2 && (b5 = bArr[0]) >= 48 && b5 <= 57) {
                        i7 = (b5 - 48) * 10;
                        c8 = 1;
                    }
                    return o0.f7174g.g("Unknown code ".concat(new String(bArr, z3.h.f16884a)));
                }
                i7 = 0;
                byte b8 = bArr[c8];
                if (b8 >= 48 && b8 <= 57) {
                    int i10 = (b8 - 48) + i7;
                    List list = o0.f7172d;
                    if (i10 < list.size()) {
                        return (o0) list.get(i10);
                    }
                }
                return o0.f7174g.g("Unknown code ".concat(new String(bArr, z3.h.f16884a)));
        }
    }

    @Override // a6.m0
    public boolean e(Object obj) {
        switch (this.f7169a) {
            case 6:
                return ((S) obj).c();
            case 7:
                return ((W) obj).b();
            default:
                return ((j0) obj).b();
        }
    }

    @Override // a6.m0
    public int f(Object obj) {
        switch (this.f7169a) {
            case 6:
                return ((S) obj).b();
            case 7:
                return ((W) obj).c();
            default:
                return ((j0) obj).c();
        }
    }

    @Override // a6.InterfaceC0484m
    public String g() {
        switch (this.f7169a) {
            case 0:
                return "identity";
            default:
                return "gzip";
        }
    }

    public String toString() {
        switch (this.f7169a) {
            case 5:
                return "internal:health-check-consumer-listener";
            default:
                return super.toString();
        }
    }

    public C0483l(SSLSession sSLSession) {
        this.f7169a = 4;
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                Certificate certificate2 = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e7) {
            Logger logger = E.f7073d;
            Level level = Level.FINE;
            String peerHost = sSLSession.getPeerHost();
            logger.log(level, "Peer cert not available for peerHost=" + peerHost, (Throwable) e7);
        }
    }

    @Override // a6.d0
    /* renamed from: a  reason: collision with other method in class */
    public byte[] mo0a(Object obj) {
        switch (this.f7169a) {
            case 1:
                byte[] bytes = ((String) obj).getBytes(z3.h.f16886c);
                int i7 = 0;
                while (i7 < bytes.length) {
                    byte b5 = bytes[i7];
                    if (b5 < 32 || b5 >= 126 || b5 == 37) {
                        byte[] bArr = new byte[((bytes.length - i7) * 3) + i7];
                        if (i7 != 0) {
                            System.arraycopy(bytes, 0, bArr, 0, i7);
                        }
                        int i8 = i7;
                        while (i7 < bytes.length) {
                            byte b7 = bytes[i7];
                            if (b7 >= 32 && b7 < 126 && b7 != 37) {
                                bArr[i8] = b7;
                                i8++;
                            } else {
                                bArr[i8] = 37;
                                byte[] bArr2 = f7168c;
                                bArr[i8 + 1] = bArr2[(b7 >> 4) & 15];
                                bArr[i8 + 2] = bArr2[b7 & 15];
                                i8 += 3;
                            }
                            i7++;
                        }
                        return Arrays.copyOf(bArr, i8);
                    }
                    i7++;
                }
                return bytes;
            default:
                return n0.a(((o0) obj).f7183a);
        }
    }

    @Override // a6.a0
    public Object h(String str) {
        return str;
    }
}
