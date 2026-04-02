package com.umeng.message.proguard;

import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes3.dex */
public class eh extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private a f12033a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f12034b;

    /* loaded from: classes3.dex */
    public static abstract class a {

        /* renamed from: f  reason: collision with root package name */
        View f12038f;

        /* renamed from: a  reason: collision with root package name */
        private final AtomicLong f12035a = new AtomicLong(-1);

        /* renamed from: b  reason: collision with root package name */
        private final AtomicLong f12036b = new AtomicLong(0);

        /* renamed from: c  reason: collision with root package name */
        private boolean f12037c = false;

        /* renamed from: g  reason: collision with root package name */
        public float f12039g = -1.0f;

        /* renamed from: h  reason: collision with root package name */
        public float f12040h = -1.0f;

        /* renamed from: i  reason: collision with root package name */
        public float f12041i = -1.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f12042j = -1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f12043k = -1.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f12044l = -1.0f;

        /* renamed from: m  reason: collision with root package name */
        public float f12045m = -1.0f;

        /* renamed from: n  reason: collision with root package name */
        public float f12046n = -1.0f;

        public void a() {
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();

        public final long e() {
            long j10 = this.f12036b.get();
            if (this.f12035a.get() != -1) {
                return j10 + (SystemClock.elapsedRealtime() - this.f12035a.get());
            }
            return j10;
        }

        public void a(Configuration configuration) {
        }

        public final void a(boolean z10) {
            if (this.f12037c == z10) {
                return;
            }
            this.f12037c = z10;
            if (z10) {
                if (this.f12035a.get() == -1) {
                    this.f12035a.set(SystemClock.elapsedRealtime());
                    return;
                }
                return;
            }
            if (this.f12035a.get() != -1) {
                AtomicLong atomicLong = this.f12036b;
                atomicLong.set((atomicLong.get() + SystemClock.elapsedRealtime()) - this.f12035a.get());
            }
            this.f12035a.set(-1L);
        }
    }

    public eh(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f12033a != null) {
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action == 1) {
                    this.f12033a.f12040h = motionEvent.getX();
                    this.f12033a.f12042j = motionEvent.getY();
                    this.f12033a.f12045m = motionEvent.getRawX();
                    this.f12033a.f12046n = motionEvent.getRawY();
                }
            } else {
                this.f12033a.f12039g = motionEvent.getX();
                this.f12033a.f12041i = motionEvent.getY();
                this.f12033a.f12043k = motionEvent.getRawX();
                this.f12033a.f12044l = motionEvent.getRawY();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getOnStatusListener() {
        return this.f12033a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12034b = Boolean.TRUE;
        a aVar = this.f12033a;
        if (aVar != null) {
            aVar.c();
            aVar.a(true);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a aVar = this.f12033a;
        if (aVar != null) {
            aVar.a(configuration);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        a aVar;
        super.onDetachedFromWindow();
        if (this.f12034b.booleanValue() && (aVar = this.f12033a) != null) {
            aVar.a(false);
            aVar.d();
        }
        this.f12034b = Boolean.FALSE;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        a aVar = this.f12033a;
        if (aVar != null) {
            if (hasWindowFocus() && i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            aVar.a(z10);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        boolean z11;
        super.onWindowFocusChanged(z10);
        a aVar = this.f12033a;
        if (aVar != null) {
            if (z10 && getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            aVar.a(z11);
            if (z10) {
                aVar.a();
            } else {
                aVar.b();
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        a aVar = this.f12033a;
        if (aVar != null) {
            if (hasWindowFocus() && i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            aVar.a(z10);
        }
    }

    public void setOnStatusListener(a aVar) {
        Boolean bool;
        if (aVar != null) {
            aVar.f12038f = this;
        }
        this.f12033a = aVar;
        if (aVar != null && (bool = this.f12034b) != null) {
            if (bool.booleanValue()) {
                aVar.c();
                aVar.a(true);
                return;
            }
            aVar.a(false);
            aVar.d();
        }
    }
}
