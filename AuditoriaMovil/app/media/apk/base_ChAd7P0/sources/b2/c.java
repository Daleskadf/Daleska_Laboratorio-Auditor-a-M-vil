package B2;

import A3.K;
import D.C0072w;
import D.d0;
import H0.J;
import a1.y;
import a1.z;
import android.os.SystemClock;
import androidx.camera.core.impl.C;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f249a;

    /* renamed from: b  reason: collision with root package name */
    public long f250b;

    /* renamed from: c  reason: collision with root package name */
    public Object f251c;

    public c(long j, Exception exc) {
        this.f250b = SystemClock.elapsedRealtime() - j;
        if (exc instanceof C) {
            this.f249a = 2;
            this.f251c = exc;
        } else if (exc instanceof d0) {
            Throwable cause = exc.getCause();
            exc = cause != null ? cause : exc;
            this.f251c = exc;
            if (exc instanceof C0072w) {
                this.f249a = 2;
            } else if (exc instanceof IllegalArgumentException) {
                this.f249a = 1;
            } else {
                this.f249a = 0;
            }
        } else {
            this.f249a = 0;
            this.f251c = exc;
        }
    }

    public static byte[] b(byte b5, DataInputStream dataInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b5, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte readByte = dataInputStream.readByte();
            bArr[1] = readByte;
            byteArrayOutputStream.write(readByte);
        }
    }

    public K a(byte[] bArr) {
        boolean z7;
        long j;
        if (bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        String str = new String(bArr, 0, bArr.length - 2, y.f6919X);
        ArrayList arrayList = (ArrayList) this.f251c;
        arrayList.add(str);
        int i7 = this.f249a;
        if (i7 != 1) {
            if (i7 == 2) {
                try {
                    Matcher matcher = z.f6927c.matcher(str);
                    if (matcher.find()) {
                        String group = matcher.group(1);
                        group.getClass();
                        j = Long.parseLong(group);
                    } else {
                        j = -1;
                    }
                    if (j != -1) {
                        this.f250b = j;
                    }
                    if (str.isEmpty()) {
                        if (this.f250b > 0) {
                            this.f249a = 3;
                            return null;
                        }
                        K p7 = K.p(arrayList);
                        arrayList.clear();
                        this.f249a = 1;
                        this.f250b = 0L;
                        return p7;
                    }
                    return null;
                } catch (NumberFormatException e7) {
                    throw J.b(str, e7);
                }
            }
            throw new IllegalStateException();
        } else if (z.f6925a.matcher(str).matches() || z.f6926b.matcher(str).matches()) {
            this.f249a = 2;
            return null;
        } else {
            return null;
        }
    }

    public c(int i7, URL url, long j) {
        this.f249a = i7;
        this.f251c = url;
        this.f250b = j;
    }
}
