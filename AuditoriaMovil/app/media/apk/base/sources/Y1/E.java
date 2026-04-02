package Y1;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import h0.AbstractC1066z;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class E implements Runnable {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f6602X;

    /* renamed from: a  reason: collision with root package name */
    public int f6603a;

    /* renamed from: b  reason: collision with root package name */
    public int f6604b;

    /* renamed from: c  reason: collision with root package name */
    public OverScroller f6605c;

    /* renamed from: d  reason: collision with root package name */
    public Interpolator f6606d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6607e;
    public boolean f;

    public E(RecyclerView recyclerView) {
        this.f6602X = recyclerView;
        n nVar = RecyclerView.f8008f1;
        this.f6606d = nVar;
        this.f6607e = false;
        this.f = false;
        this.f6605c = new OverScroller(recyclerView.getContext(), nVar);
    }

    public final void a() {
        if (this.f6607e) {
            this.f = true;
            return;
        }
        RecyclerView recyclerView = this.f6602X;
        recyclerView.removeCallbacks(this);
        Field field = AbstractC1066z.f11214a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean awakenScrollBars;
        boolean z7;
        boolean z8;
        boolean z9;
        RecyclerView recyclerView = this.f6602X;
        if (recyclerView.f8044g0 == null) {
            recyclerView.removeCallbacks(this);
            this.f6605c.abortAnimation();
            return;
        }
        this.f = false;
        this.f6607e = true;
        recyclerView.d();
        OverScroller overScroller = this.f6605c;
        recyclerView.f8044g0.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i7 = currX - this.f6603a;
            int i8 = currY - this.f6604b;
            this.f6603a = currX;
            this.f6604b = currY;
            RecyclerView recyclerView2 = this.f6602X;
            int[] iArr = recyclerView.f8033Y0;
            if (recyclerView2.f(i7, i8, 1, iArr, null)) {
                i7 -= iArr[0];
                i8 -= iArr[1];
            }
            if (!recyclerView.f8045h0.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i7, i8);
            }
            recyclerView.g(null, 1);
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (i8 != 0 && recyclerView.f8044g0.c() && i8 == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i7 != 0 && recyclerView.f8044g0.b() && i7 == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i7 != 0 || i8 != 0) && !z8 && !z7) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (!overScroller.isFinished() && (z9 || recyclerView.k())) {
                a();
                RunnableC0408i runnableC0408i = recyclerView.f8025Q0;
                if (runnableC0408i != null) {
                    runnableC0408i.a(recyclerView, i7, i8);
                }
            } else {
                recyclerView.setScrollState(0);
                C0406g c0406g = recyclerView.f8026R0;
                c0406g.getClass();
                c0406g.f6661c = 0;
                recyclerView.s(1);
            }
        }
        this.f6607e = false;
        if (this.f) {
            a();
        }
    }
}
