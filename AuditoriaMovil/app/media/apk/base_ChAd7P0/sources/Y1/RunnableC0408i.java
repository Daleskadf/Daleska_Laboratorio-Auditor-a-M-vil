package Y1;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
/* renamed from: Y1.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0408i implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadLocal f6667e = new ThreadLocal();
    public static final K4.k f = new K4.k(2);

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f6668a;

    /* renamed from: b  reason: collision with root package name */
    public long f6669b;

    /* renamed from: c  reason: collision with root package name */
    public long f6670c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f6671d;

    public final void a(RecyclerView recyclerView, int i7, int i8) {
        if (recyclerView.f8048k0 && this.f6669b == 0) {
            this.f6669b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0406g c0406g = recyclerView.f8026R0;
        c0406g.f6659a = i7;
        c0406g.f6660b = i8;
    }

    public final void b(long j) {
        C0407h c0407h;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f6668a;
        int size = arrayList.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i8);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0406g c0406g = recyclerView2.f8026R0;
                c0406g.f6661c = 0;
                i7 += c0406g.f6661c;
            }
        }
        ArrayList arrayList2 = this.f6671d;
        arrayList2.ensureCapacity(i7);
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i9);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0406g c0406g2 = recyclerView3.f8026R0;
                Math.abs(c0406g2.f6659a);
                Math.abs(c0406g2.f6660b);
                if (c0406g2.f6661c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new Object());
                    } else {
                        C0407h c0407h2 = (C0407h) arrayList2.get(0);
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f);
        if (arrayList2.size() > 0 && (recyclerView = (c0407h = (C0407h) arrayList2.get(0)).f6665d) != null) {
            int i10 = c0407h.f6666e;
            if (recyclerView.f8040d.B0() <= 0) {
                y yVar = recyclerView.f8035a;
                try {
                    recyclerView.f8057u0++;
                    yVar.f(i10);
                    throw null;
                } catch (Throwable th) {
                    int i11 = recyclerView.f8057u0 - 1;
                    recyclerView.f8057u0 = i11;
                    if (i11 < 1) {
                        recyclerView.f8057u0 = 0;
                    }
                    throw th;
                }
            }
            RecyclerView.j(recyclerView.f8040d.A0(0));
            throw null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i7 = d0.j.f10170a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f6668a;
            if (arrayList.isEmpty()) {
                this.f6669b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j = 0;
            for (int i8 = 0; i8 < size; i8++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i8);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f6669b = 0L;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j) + this.f6670c);
            this.f6669b = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f6669b = 0L;
            int i9 = d0.j.f10170a;
            Trace.endSection();
            throw th;
        }
    }
}
