package d6;

import B5.L;
import c6.AbstractC0652b;
import java.io.IOException;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: b  reason: collision with root package name */
    public final int f10498b;

    /* renamed from: c  reason: collision with root package name */
    public int f10499c;

    /* renamed from: d  reason: collision with root package name */
    public int f10500d;

    /* renamed from: e  reason: collision with root package name */
    public final y f10501e;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ K0.o f10502g;

    /* renamed from: a  reason: collision with root package name */
    public final Q6.e f10497a = new Object();
    public boolean f = false;

    /* JADX WARN: Type inference failed for: r1v1, types: [Q6.e, java.lang.Object] */
    public z(K0.o oVar, int i7, int i8, y yVar) {
        this.f10502g = oVar;
        this.f10498b = i7;
        this.f10499c = i8;
        this.f10501e = yVar;
    }

    public final int a(int i7) {
        if (i7 > 0 && com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i7 < this.f10499c) {
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f10498b);
        }
        int i8 = this.f10499c + i7;
        this.f10499c = i8;
        return i8;
    }

    public final void b(int i7, Q6.e eVar, boolean z7) {
        boolean z8;
        boolean z9;
        boolean z10;
        do {
            int min = Math.min(i7, ((C0907d) this.f10502g.f2504c).f10373b.f10357a.f10952d);
            int i8 = -min;
            ((z) this.f10502g.f2505d).a(i8);
            a(i8);
            try {
                boolean z11 = false;
                if (eVar.f4462b == min && z7) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                ((C0907d) this.f10502g.f2504c).b(z8, this.f10498b, eVar, min);
                AbstractC0652b abstractC0652b = (AbstractC0652b) this.f10501e;
                synchronized (abstractC0652b.f8772b) {
                    G.i.o("onStreamAllocated was not called, but it seems the stream is active", abstractC0652b.f);
                    int i9 = abstractC0652b.f8775e;
                    if (i9 < 32768) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    int i10 = i9 - min;
                    abstractC0652b.f8775e = i10;
                    if (i10 < 32768) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z9 && z10) {
                        z11 = true;
                    }
                }
                if (z11) {
                    abstractC0652b.f();
                }
                i7 -= min;
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        } while (i7 > 0);
    }

    public final void c(int i7, L l8) {
        int i8 = this.f10499c;
        K0.o oVar = this.f10502g;
        int min = Math.min(i7, Math.min(i8, ((z) oVar.f2505d).f10499c));
        int i9 = 0;
        while (true) {
            Q6.e eVar = this.f10497a;
            long j = eVar.f4462b;
            if (j > 0 && min > 0) {
                if (min >= j) {
                    int i10 = (int) j;
                    i9 += i10;
                    b(i10, eVar, this.f);
                } else {
                    i9 += min;
                    b(min, eVar, false);
                }
                l8.f327a++;
                min = Math.min(i7 - i9, Math.min(this.f10499c, ((z) oVar.f2505d).f10499c));
            } else {
                return;
            }
        }
    }
}
