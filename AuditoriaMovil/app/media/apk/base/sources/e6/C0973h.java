package e6;

import D.AbstractC0059i;
import Q6.q;
import S1.H;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.fork.ForkServer;
/* renamed from: e6.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0973h implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final q f10949a;

    /* renamed from: b  reason: collision with root package name */
    public final Q6.e f10950b;

    /* renamed from: c  reason: collision with root package name */
    public final H f10951c;

    /* renamed from: d  reason: collision with root package name */
    public int f10952d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10953e;

    /* JADX WARN: Type inference failed for: r2v1, types: [Q6.e, java.lang.Object] */
    public C0973h(q qVar) {
        this.f10949a = qVar;
        ?? obj = new Object();
        this.f10950b = obj;
        this.f10951c = new H(obj);
        this.f10952d = 16384;
    }

    public final void a(int i7, int i8, byte b5, byte b7) {
        Logger logger = C0974i.f10954a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(AbstractC0971f.a(false, i7, i8, b5, b7));
        }
        int i9 = this.f10952d;
        if (i8 <= i9) {
            if ((Integer.MIN_VALUE & i7) == 0) {
                q qVar = this.f10949a;
                qVar.c((i8 >>> 16) & 255);
                qVar.c((i8 >>> 8) & 255);
                qVar.c(i8 & 255);
                qVar.c(b5 & ForkServer.ERROR);
                qVar.c(b7 & ForkServer.ERROR);
                qVar.d(i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                return;
            }
            Locale locale = Locale.US;
            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "reserved bit set: "));
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(AbstractC0059i.x("FRAME_SIZE_ERROR length > ", i9, i8, ": "));
    }

    public final void b(boolean z7, int i7, ArrayList arrayList) {
        byte b5;
        byte b7;
        int i8;
        int i9;
        if (!this.f10953e) {
            H h8 = this.f10951c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0967b c0967b = (C0967b) arrayList.get(i10);
                Q6.g p7 = c0967b.f10925a.p();
                Integer num = (Integer) AbstractC0969d.f10937c.get(p7);
                Q6.g gVar = c0967b.f10926b;
                if (num != null) {
                    int intValue = num.intValue();
                    i9 = intValue + 1;
                    if (i9 >= 2 && i9 <= 7) {
                        C0967b[] c0967bArr = AbstractC0969d.f10936b;
                        if (c0967bArr[intValue].f10926b.equals(gVar)) {
                            i8 = i9;
                        } else if (c0967bArr[i9].f10926b.equals(gVar)) {
                            i9 = intValue + 2;
                            i8 = i9;
                        }
                    }
                    i8 = i9;
                    i9 = -1;
                } else {
                    i8 = -1;
                    i9 = -1;
                }
                if (i9 == -1) {
                    int i11 = h8.f4958b + 1;
                    while (true) {
                        C0967b[] c0967bArr2 = (C0967b[]) h8.f4961e;
                        if (i11 >= c0967bArr2.length) {
                            break;
                        }
                        if (c0967bArr2[i11].f10925a.equals(p7)) {
                            if (((C0967b[]) h8.f4961e)[i11].f10926b.equals(gVar)) {
                                i9 = (i11 - h8.f4958b) + AbstractC0969d.f10936b.length;
                                break;
                            } else if (i8 == -1) {
                                i8 = (i11 - h8.f4958b) + AbstractC0969d.f10936b.length;
                            }
                        }
                        i11++;
                    }
                }
                if (i9 != -1) {
                    h8.f(i9, 127, RecognitionOptions.ITF);
                } else if (i8 == -1) {
                    ((Q6.e) h8.f4960d).x(64);
                    h8.e(p7);
                    h8.e(gVar);
                    h8.c(c0967b);
                } else {
                    Q6.g prefix = AbstractC0969d.f10935a;
                    p7.getClass();
                    kotlin.jvm.internal.j.e(prefix, "prefix");
                    if (p7.l(0, prefix, prefix.f4464a.length) && !C0967b.f10924h.equals(p7)) {
                        h8.f(i8, 15, 0);
                        h8.e(gVar);
                    } else {
                        h8.f(i8, 63, 64);
                        h8.e(gVar);
                        h8.c(c0967b);
                    }
                }
            }
            Q6.e eVar = this.f10950b;
            long j = eVar.f4462b;
            int min = (int) Math.min(this.f10952d, j);
            long j8 = min;
            int i12 = (j > j8 ? 1 : (j == j8 ? 0 : -1));
            if (i12 == 0) {
                b5 = 4;
            } else {
                b5 = 0;
            }
            if (z7) {
                b5 = (byte) (b5 | 1);
            }
            a(i7, min, (byte) 1, b5);
            q qVar = this.f10949a;
            qVar.l(eVar, j8);
            if (i12 > 0) {
                long j9 = j - j8;
                while (j9 > 0) {
                    int min2 = (int) Math.min(this.f10952d, j9);
                    long j10 = min2;
                    j9 -= j10;
                    if (j9 == 0) {
                        b7 = 4;
                    } else {
                        b7 = 0;
                    }
                    a(i7, min2, (byte) 9, b7);
                    qVar.l(eVar, j10);
                }
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f10953e = true;
        this.f10949a.close();
    }
}
