package k;

import G.i;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import d2.C0888b;
/* loaded from: classes.dex */
public final class e extends Drawable implements Drawable.Callback {

    /* renamed from: o0  reason: collision with root package name */
    public static final /* synthetic */ int f13518o0 = 0;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f13520Y;

    /* renamed from: Z  reason: collision with root package name */
    public G.c f13521Z;

    /* renamed from: a  reason: collision with root package name */
    public b f13522a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f13523b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f13524c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f13525d;

    /* renamed from: e0  reason: collision with root package name */
    public long f13527e0;
    public boolean f;

    /* renamed from: f0  reason: collision with root package name */
    public long f13528f0;

    /* renamed from: g0  reason: collision with root package name */
    public C0888b f13529g0;

    /* renamed from: h0  reason: collision with root package name */
    public b f13530h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f13531i0;

    /* renamed from: j0  reason: collision with root package name */
    public b f13532j0;

    /* renamed from: k0  reason: collision with root package name */
    public i f13533k0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f13536n0;

    /* renamed from: e  reason: collision with root package name */
    public int f13526e = 255;

    /* renamed from: X  reason: collision with root package name */
    public int f13519X = -1;

    /* renamed from: l0  reason: collision with root package name */
    public int f13534l0 = -1;

    /* renamed from: m0  reason: collision with root package name */
    public int f13535m0 = -1;

    public e(b bVar, Resources resources) {
        i(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0276, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static k.e c(android.content.Context r20, android.content.res.Resources r21, android.content.res.XmlResourceParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.c(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):k.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f13524c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f13527e0
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f13526e
            r3.setAlpha(r9)
            r13.f13527e0 = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            k.b r10 = r13.f13522a
            int r10 = r10.f13511y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f13526e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f13527e0 = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f13525d
            if (r9 == 0) goto L61
            long r10 = r13.f13528f0
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f13525d = r0
            r13.f13528f0 = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            k.b r4 = r13.f13522a
            int r4 = r4.f13512z
            int r3 = r3 / r4
            int r4 = r13.f13526e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f13528f0 = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            G.c r14 = r13.f13521Z
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        b bVar = this.f13522a;
        if (theme != null) {
            bVar.c();
            int i7 = bVar.f13495h;
            Drawable[] drawableArr = bVar.f13494g;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i8].applyTheme(theme);
                    bVar.f13493e |= drawableArr[i8].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f13490b = resources;
                int i9 = resources.getDisplayMetrics().densityDpi;
                if (i9 == 0) {
                    i9 = 160;
                }
                int i10 = bVar.f13491c;
                bVar.f13491c = i9;
                if (i10 != i9) {
                    bVar.f13499m = false;
                    bVar.j = false;
                    return;
                }
                return;
            }
            return;
        }
        bVar.getClass();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f13522a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f13529g0 == null) {
            this.f13529g0 = new C0888b();
        }
        C0888b c0888b = this.f13529g0;
        c0888b.f10231b = drawable.getCallback();
        drawable.setCallback(c0888b);
        try {
            if (this.f13522a.f13511y <= 0 && this.f) {
                drawable.setAlpha(this.f13526e);
            }
            b bVar = this.f13522a;
            if (bVar.f13481C) {
                drawable.setColorFilter(bVar.f13480B);
            } else {
                if (bVar.f13484F) {
                    drawable.setTintList(bVar.f13482D);
                }
                b bVar2 = this.f13522a;
                if (bVar2.f13485G) {
                    drawable.setTintMode(bVar2.f13483E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f13522a.f13509w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f13522a.f13479A);
            Rect rect = this.f13523b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            C0888b c0888b2 = this.f13529g0;
            c0888b2.f10231b = null;
            drawable.setCallback((Drawable.Callback) c0888b2.f10231b);
        } catch (Throwable th) {
            C0888b c0888b3 = this.f13529g0;
            c0888b3.f10231b = null;
            drawable.setCallback((Drawable.Callback) c0888b3.f10231b);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f13524c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f13525d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z7;
        Drawable drawable = this.f13525d;
        boolean z8 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f13525d = null;
            z7 = true;
        } else {
            z7 = false;
        }
        Drawable drawable2 = this.f13524c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f) {
                this.f13524c.setAlpha(this.f13526e);
            }
        }
        if (this.f13528f0 != 0) {
            this.f13528f0 = 0L;
            z7 = true;
        }
        if (this.f13527e0 != 0) {
            this.f13527e0 = 0L;
        } else {
            z8 = z7;
        }
        if (z8) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.f13520Y && super.mutate() == this) {
            b bVar = new b(this.f13532j0, this, null);
            bVar.f13487I = bVar.f13487I.clone();
            bVar.f13488J = bVar.f13488J.clone();
            i(bVar);
            this.f13520Y = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.f13531i0) {
            f();
            b bVar = this.f13530h0;
            bVar.f13487I = bVar.f13487I.clone();
            bVar.f13488J = bVar.f13488J.clone();
            this.f13531i0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f13526e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f13522a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z7;
        b bVar = this.f13522a;
        if (bVar.f13507u) {
            z7 = bVar.f13508v;
        } else {
            bVar.c();
            bVar.f13507u = true;
            int i7 = bVar.f13495h;
            Drawable[] drawableArr = bVar.f13494g;
            int i8 = 0;
            while (true) {
                if (i8 < i7) {
                    if (drawableArr[i8].getConstantState() == null) {
                        bVar.f13508v = false;
                        z7 = false;
                        break;
                    }
                    i8++;
                } else {
                    bVar.f13508v = true;
                    z7 = true;
                    break;
                }
            }
        }
        if (z7) {
            this.f13522a.f13492d = getChangingConfigurations();
            return this.f13522a;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f13524c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f13523b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.f13522a;
        if (bVar.f13498l) {
            if (!bVar.f13499m) {
                bVar.b();
            }
            return bVar.f13501o;
        }
        Drawable drawable = this.f13524c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.f13522a;
        if (bVar.f13498l) {
            if (!bVar.f13499m) {
                bVar.b();
            }
            return bVar.f13500n;
        }
        Drawable drawable = this.f13524c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.f13522a;
        if (bVar.f13498l) {
            if (!bVar.f13499m) {
                bVar.b();
            }
            return bVar.f13503q;
        }
        Drawable drawable = this.f13524c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.f13522a;
        if (bVar.f13498l) {
            if (!bVar.f13499m) {
                bVar.b();
            }
            return bVar.f13502p;
        }
        Drawable drawable = this.f13524c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f13524c;
        int i7 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        b bVar = this.f13522a;
        if (bVar.f13504r) {
            return bVar.f13505s;
        }
        bVar.c();
        int i8 = bVar.f13495h;
        Drawable[] drawableArr = bVar.f13494g;
        if (i8 > 0) {
            i7 = drawableArr[0].getOpacity();
        }
        for (int i9 = 1; i9 < i8; i9++) {
            i7 = Drawable.resolveOpacity(i7, drawableArr[i9].getOpacity());
        }
        bVar.f13505s = i7;
        bVar.f13504r = true;
        return i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f13524c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.f13522a;
        boolean z7 = false;
        Rect rect2 = null;
        if (!bVar.f13496i) {
            Rect rect3 = bVar.f13497k;
            if (rect3 == null && !bVar.j) {
                bVar.c();
                Rect rect4 = new Rect();
                int i7 = bVar.f13495h;
                Drawable[] drawableArr = bVar.f13494g;
                for (int i8 = 0; i8 < i7; i8++) {
                    if (drawableArr[i8].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i9 = rect4.left;
                        if (i9 > rect2.left) {
                            rect2.left = i9;
                        }
                        int i10 = rect4.top;
                        if (i10 > rect2.top) {
                            rect2.top = i10;
                        }
                        int i11 = rect4.right;
                        if (i11 > rect2.right) {
                            rect2.right = i11;
                        }
                        int i12 = rect4.bottom;
                        if (i12 > rect2.bottom) {
                            rect2.bottom = i12;
                        }
                    }
                }
                bVar.j = true;
                bVar.f13497k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z7 = true;
            }
        } else {
            Drawable drawable = this.f13524c;
            if (drawable != null) {
                z7 = drawable.getPadding(rect);
            } else {
                z7 = super.getPadding(rect);
            }
        }
        if (this.f13522a.f13479A && getLayoutDirection() == 1) {
            int i13 = rect.left;
            rect.left = rect.right;
            rect.right = i13;
        }
        return z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f13519X
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            k.b r0 = r9.f13522a
            int r0 = r0.f13512z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f13525d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f13524c
            if (r0 == 0) goto L29
            r9.f13525d = r0
            k.b r0 = r9.f13522a
            int r0 = r0.f13512z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f13528f0 = r0
            goto L35
        L29:
            r9.f13525d = r4
            r9.f13528f0 = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f13524c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            k.b r0 = r9.f13522a
            int r1 = r0.f13495h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f13524c = r0
            r9.f13519X = r10
            if (r0 == 0) goto L5a
            k.b r10 = r9.f13522a
            int r10 = r10.f13511y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f13527e0 = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f13524c = r4
            r10 = -1
            r9.f13519X = r10
        L5a:
            long r0 = r9.f13527e0
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f13528f0
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7b
        L67:
            G.c r10 = r9.f13521Z
            if (r10 != 0) goto L75
            G.c r10 = new G.c
            r1 = 29
            r10.<init>(r9, r1)
            r9.f13521Z = r10
            goto L78
        L75:
            r9.unscheduleSelf(r10)
        L78:
            r9.a(r0)
        L7b:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.h(int):boolean");
    }

    public final void i(b bVar) {
        this.f13522a = bVar;
        int i7 = this.f13519X;
        if (i7 >= 0) {
            Drawable d7 = bVar.d(i7);
            this.f13524c = d7;
            if (d7 != null) {
                d(d7);
            }
        }
        this.f13525d = null;
        this.f13530h0 = bVar;
        this.f13532j0 = bVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f13522a;
        if (bVar != null) {
            bVar.f13504r = false;
            bVar.f13506t = false;
        }
        if (drawable == this.f13524c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f13522a.f13479A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z7, boolean z8) {
        boolean visible = super.setVisible(z7, z8);
        Drawable drawable = this.f13525d;
        if (drawable != null) {
            drawable.setVisible(z7, z8);
        }
        Drawable drawable2 = this.f13524c;
        if (drawable2 != null) {
            drawable2.setVisible(z7, z8);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        i iVar = this.f13533k0;
        if (iVar != null) {
            iVar.H();
            this.f13533k0 = null;
            h(this.f13534l0);
            this.f13534l0 = -1;
            this.f13535m0 = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f13536n0) {
            g();
            b bVar = this.f13532j0;
            bVar.f13487I = bVar.f13487I.clone();
            bVar.f13488J = bVar.f13488J.clone();
            this.f13536n0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13525d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f13524c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i7) {
        b bVar = this.f13522a;
        int i8 = this.f13519X;
        int i9 = bVar.f13495h;
        Drawable[] drawableArr = bVar.f13494g;
        boolean z7 = false;
        for (int i10 = 0; i10 < i9; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i7);
                if (i10 == i8) {
                    z7 = layoutDirection;
                }
            }
        }
        bVar.f13510x = i7;
        return z7;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.f13525d;
        if (drawable != null) {
            return drawable.setLevel(i7);
        }
        Drawable drawable2 = this.f13524c;
        if (drawable2 != null) {
            return drawable2.setLevel(i7);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d1, code lost:
        if (h(r1) != false) goto L16;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.onStateChange(int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f13524c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (!this.f || this.f13526e != i7) {
            this.f = true;
            this.f13526e = i7;
            Drawable drawable = this.f13524c;
            if (drawable != null) {
                if (this.f13527e0 == 0) {
                    drawable.setAlpha(i7);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z7) {
        b bVar = this.f13522a;
        if (bVar.f13479A != z7) {
            bVar.f13479A = z7;
            Drawable drawable = this.f13524c;
            if (drawable != null) {
                drawable.setAutoMirrored(z7);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f13522a;
        bVar.f13481C = true;
        if (bVar.f13480B != colorFilter) {
            bVar.f13480B = colorFilter;
            Drawable drawable = this.f13524c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z7) {
        b bVar = this.f13522a;
        if (bVar.f13509w != z7) {
            bVar.f13509w = z7;
            Drawable drawable = this.f13524c;
            if (drawable != null) {
                drawable.setDither(z7);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f4) {
        Drawable drawable = this.f13524c;
        if (drawable != null) {
            drawable.setHotspot(f, f4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i7, int i8, int i9, int i10) {
        Rect rect = this.f13523b;
        if (rect == null) {
            this.f13523b = new Rect(i7, i8, i9, i10);
        } else {
            rect.set(i7, i8, i9, i10);
        }
        Drawable drawable = this.f13524c;
        if (drawable != null) {
            drawable.setHotspotBounds(i7, i8, i9, i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f13522a;
        bVar.f13484F = true;
        if (bVar.f13482D != colorStateList) {
            bVar.f13482D = colorStateList;
            this.f13524c.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f13522a;
        bVar.f13485G = true;
        if (bVar.f13483E != mode) {
            bVar.f13483E = mode;
            this.f13524c.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z8) {
        boolean j = j(z7, z8);
        i iVar = this.f13533k0;
        if (iVar != null && (j || z8)) {
            if (z7) {
                iVar.G();
            } else {
                jumpToCurrentState();
            }
        }
        return j;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f13524c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
