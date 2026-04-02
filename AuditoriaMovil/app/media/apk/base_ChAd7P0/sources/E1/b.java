package E1;

import java.util.ArrayDeque;
import m1.l;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f939a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f940b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final e f941c = new e();

    /* renamed from: d  reason: collision with root package name */
    public A.c f942d;

    /* renamed from: e  reason: collision with root package name */
    public int f943e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public long f944g;

    public final long a(l lVar, int i7) {
        byte[] bArr = this.f939a;
        lVar.f(bArr, 0, i7, false);
        long j = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j = (j << 8) | (bArr[i8] & ForkServer.ERROR);
        }
        return j;
    }
}
