package a1;

import D.AbstractC0059i;
import M0.AbstractC0236c;
import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* renamed from: a1.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422H extends AbstractC0236c implements InterfaceC0428e {

    /* renamed from: X  reason: collision with root package name */
    public byte[] f6780X;

    /* renamed from: Y  reason: collision with root package name */
    public int f6781Y;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedBlockingQueue f6782e;
    public final long f;

    public C0422H() {
        super(true);
        this.f = 8000L;
        this.f6782e = new LinkedBlockingQueue();
        this.f6780X = new byte[0];
        this.f6781Y = -1;
    }

    @Override // a1.InterfaceC0428e
    public final String d() {
        boolean z7;
        if (this.f6781Y != -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        int i7 = K0.x.f2529a;
        Locale locale = Locale.US;
        return AbstractC0059i.x("RTP/AVP/TCP;unicast;interleaved=", this.f6781Y, this.f6781Y + 1, "-");
    }

    @Override // M0.h
    public final long e(M0.l lVar) {
        this.f6781Y = lVar.f3172a.getPort();
        return -1L;
    }

    @Override // a1.InterfaceC0428e
    public final int g() {
        return this.f6781Y;
    }

    @Override // a1.InterfaceC0428e
    public final boolean o() {
        return false;
    }

    @Override // M0.h
    public final Uri p() {
        return null;
    }

    @Override // H0.InterfaceC0131k
    public final int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int min = Math.min(i8, this.f6780X.length);
        System.arraycopy(this.f6780X, 0, bArr, i7, min);
        byte[] bArr2 = this.f6780X;
        this.f6780X = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i8) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.f6782e.poll(this.f, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = Math.min(i8 - min, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i7 + min, min2);
            if (min2 < bArr3.length) {
                this.f6780X = Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // M0.h
    public final void close() {
    }

    @Override // a1.InterfaceC0428e
    public final C0422H u() {
        return this;
    }
}
