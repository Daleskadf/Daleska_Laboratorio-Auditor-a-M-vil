package j1;

import android.os.SystemClock;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.pathprovider.b;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
/* renamed from: j1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1362a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f13419a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f13420b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f13421c;

    /* renamed from: d  reason: collision with root package name */
    public static long f13422d;

    public static long a() {
        DatagramSocket datagramSocket;
        long j;
        synchronized (f13420b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j = currentTimeMillis;
                datagramSocket = datagramSocket2;
            } else {
                long j8 = currentTimeMillis / 1000;
                Long.signum(j8);
                long j9 = currentTimeMillis - (j8 * 1000);
                long j10 = j8 + 2208988800L;
                j = currentTimeMillis;
                bArr[40] = (byte) (j10 >> 24);
                bArr[41] = (byte) (j10 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j10 >> 8);
                    bArr[43] = (byte) j10;
                    long j11 = (j9 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j11 >> 24);
                    bArr[45] = (byte) (j11 >> 16);
                    bArr[46] = (byte) (j11 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j12 = (elapsedRealtime2 - elapsedRealtime) + j;
            byte b5 = bArr[0];
            int i7 = bArr[1] & ForkServer.ERROR;
            long d7 = d(bArr, 24);
            long d8 = d(bArr, 32);
            long d9 = d(bArr, 40);
            b((byte) ((b5 >> 6) & 3), (byte) (b5 & 7), i7, d9);
            long j13 = (j12 + (((d9 - j12) + (d8 - d7)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j13;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static void b(byte b5, byte b7, int i7, long j) {
        if (b5 != 3) {
            if (b7 != 4 && b7 != 5) {
                throw new IOException(b.e(b7, "SNTP: Untrusted mode: "));
            }
            if (i7 != 0 && i7 <= 15) {
                if (j != 0) {
                    return;
                }
                throw new IOException("SNTP: Zero transmitTime");
            }
            throw new IOException(b.e(i7, "SNTP: Untrusted stratum: "));
        }
        throw new IOException("SNTP: Unsynchronized server");
    }

    public static long c(byte[] bArr, int i7) {
        int i8 = bArr[i7];
        int i9 = bArr[i7 + 1];
        int i10 = bArr[i7 + 2];
        int i11 = bArr[i7 + 3];
        if ((i8 & RecognitionOptions.ITF) == 128) {
            i8 = (i8 & 127) + RecognitionOptions.ITF;
        }
        if ((i9 & RecognitionOptions.ITF) == 128) {
            i9 = (i9 & 127) + RecognitionOptions.ITF;
        }
        if ((i10 & RecognitionOptions.ITF) == 128) {
            i10 = (i10 & 127) + RecognitionOptions.ITF;
        }
        if ((i11 & RecognitionOptions.ITF) == 128) {
            i11 = (i11 & 127) + RecognitionOptions.ITF;
        }
        return (i8 << 24) + (i9 << 16) + (i10 << 8) + i11;
    }

    public static long d(byte[] bArr, int i7) {
        long c8 = c(bArr, i7);
        long c9 = c(bArr, i7 + 4);
        if (c8 == 0 && c9 == 0) {
            return 0L;
        }
        return ((c9 * 1000) / 4294967296L) + ((c8 - 2208988800L) * 1000);
    }
}
