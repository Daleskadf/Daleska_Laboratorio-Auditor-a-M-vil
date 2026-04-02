package o;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p.C1581f;
import p.C1583g;
import p.C1585h;
import p.X;
/* renamed from: o.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnTouchListenerC1537a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: X  reason: collision with root package name */
    public boolean f14395X;

    /* renamed from: Y  reason: collision with root package name */
    public int f14396Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int[] f14397Z;

    /* renamed from: a  reason: collision with root package name */
    public final float f14398a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14399b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14400c;

    /* renamed from: d  reason: collision with root package name */
    public final View f14401d;

    /* renamed from: e  reason: collision with root package name */
    public X f14402e;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ int f14403e0;
    public X f;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ View f14404f0;

    public View$OnTouchListenerC1537a(View view) {
        this.f14397Z = new int[2];
        this.f14401d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f14398a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f14399b = tapTimeout;
        this.f14400c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        X x7 = this.f;
        View view = this.f14401d;
        if (x7 != null) {
            view.removeCallbacks(x7);
        }
        X x8 = this.f14402e;
        if (x8 != null) {
            view.removeCallbacks(x8);
        }
    }

    public final k b() {
        C1581f c1581f;
        switch (this.f14403e0) {
            case 0:
                AbstractC1538b abstractC1538b = ((ActionMenuItemView) this.f14404f0).f7272k0;
                if (abstractC1538b == null || (c1581f = ((C1583g) abstractC1538b).f14792a.f14834n0) == null) {
                    return null;
                }
                return c1581f.a();
            default:
                C1581f c1581f2 = ((C1585h) this.f14404f0).f14816d.f14833m0;
                if (c1581f2 == null) {
                    return null;
                }
                return c1581f2.a();
        }
    }

    public final boolean c() {
        k b5;
        switch (this.f14403e0) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f14404f0;
                InterfaceC1544h interfaceC1544h = actionMenuItemView.f7270i0;
                if (interfaceC1544h == null || !interfaceC1544h.a(actionMenuItemView.f7267f0) || (b5 = b()) == null || !b5.i()) {
                    return false;
                }
                return true;
            default:
                ((C1585h) this.f14404f0).f14816d.i();
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r14 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009f, code lost:
        if (r4 != 3) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.View$OnTouchListenerC1537a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f14395X = false;
        this.f14396Y = -1;
        X x7 = this.f14402e;
        if (x7 != null) {
            this.f14401d.removeCallbacks(x7);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public View$OnTouchListenerC1537a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f14403e0 = 0;
        this.f14404f0 = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public View$OnTouchListenerC1537a(C1585h c1585h, C1585h c1585h2) {
        this(c1585h2);
        this.f14403e0 = 1;
        this.f14404f0 = c1585h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
