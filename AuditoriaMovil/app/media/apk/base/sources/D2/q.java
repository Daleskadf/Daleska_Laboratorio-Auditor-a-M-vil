package d2;

import a.AbstractC0412a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h3.AbstractC1079a;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class q extends AbstractC0894h {

    /* renamed from: e0  reason: collision with root package name */
    public static final PorterDuff.Mode f10289e0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: X  reason: collision with root package name */
    public final float[] f10290X;

    /* renamed from: Y  reason: collision with root package name */
    public final Matrix f10291Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Rect f10292Z;

    /* renamed from: b  reason: collision with root package name */
    public o f10293b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuffColorFilter f10294c;

    /* renamed from: d  reason: collision with root package name */
    public ColorFilter f10295d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10296e;
    public boolean f;

    /* JADX WARN: Type inference failed for: r0v5, types: [d2.o, android.graphics.drawable.Drawable$ConstantState] */
    public q() {
        this.f = true;
        this.f10290X = new float[9];
        this.f10291Y = new Matrix();
        this.f10292Z = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f10280c = null;
        constantState.f10281d = f10289e0;
        constantState.f10279b = new n();
        this.f10293b = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f10292Z;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f10295d;
            if (colorFilter == null) {
                colorFilter = this.f10294c;
            }
            Matrix matrix = this.f10291Y;
            canvas.getMatrix(matrix);
            float[] fArr = this.f10290X;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min((int) RecognitionOptions.PDF417, (int) (rect.width() * abs));
            int min2 = Math.min((int) RecognitionOptions.PDF417, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                o oVar = this.f10293b;
                Bitmap bitmap = oVar.f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != oVar.f.getHeight()) {
                    oVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    oVar.f10286k = true;
                }
                if (!this.f) {
                    o oVar2 = this.f10293b;
                    oVar2.f.eraseColor(0);
                    Canvas canvas2 = new Canvas(oVar2.f);
                    n nVar = oVar2.f10279b;
                    nVar.a(nVar.f10270g, n.f10264p, canvas2, min, min2);
                } else {
                    o oVar3 = this.f10293b;
                    if (oVar3.f10286k || oVar3.f10283g != oVar3.f10280c || oVar3.f10284h != oVar3.f10281d || oVar3.j != oVar3.f10282e || oVar3.f10285i != oVar3.f10279b.getRootAlpha()) {
                        o oVar4 = this.f10293b;
                        oVar4.f.eraseColor(0);
                        Canvas canvas3 = new Canvas(oVar4.f);
                        n nVar2 = oVar4.f10279b;
                        nVar2.a(nVar2.f10270g, n.f10264p, canvas3, min, min2);
                        o oVar5 = this.f10293b;
                        oVar5.f10283g = oVar5.f10280c;
                        oVar5.f10284h = oVar5.f10281d;
                        oVar5.f10285i = oVar5.f10279b.getRootAlpha();
                        oVar5.j = oVar5.f10282e;
                        oVar5.f10286k = false;
                    }
                }
                o oVar6 = this.f10293b;
                if (oVar6.f10279b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (oVar6.f10287l == null) {
                        Paint paint2 = new Paint();
                        oVar6.f10287l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    oVar6.f10287l.setAlpha(oVar6.f10279b.getRootAlpha());
                    oVar6.f10287l.setColorFilter(colorFilter);
                    paint = oVar6.f10287l;
                }
                canvas.drawBitmap(oVar6.f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f10293b.f10279b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f10293b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f10295d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f10242a != null && Build.VERSION.SDK_INT >= 24) {
            return new p(this.f10242a.getConstantState());
        }
        this.f10293b.f10278a = getChangingConfigurations();
        return this.f10293b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f10293b.f10279b.f10272i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f10293b.f10279b.f10271h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f10293b.f10282e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            o oVar = this.f10293b;
            if (oVar != null) {
                n nVar = oVar.f10279b;
                if (nVar.f10276n == null) {
                    nVar.f10276n = Boolean.valueOf(nVar.f10270g.a());
                }
                if (nVar.f10276n.booleanValue() || ((colorStateList = this.f10293b.f10280c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [d2.o, android.graphics.drawable.Drawable$ConstantState] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f10296e && super.mutate() == this) {
            o oVar = this.f10293b;
            ?? constantState = new Drawable.ConstantState();
            constantState.f10280c = null;
            constantState.f10281d = f10289e0;
            if (oVar != null) {
                constantState.f10278a = oVar.f10278a;
                n nVar = new n(oVar.f10279b);
                constantState.f10279b = nVar;
                if (oVar.f10279b.f10269e != null) {
                    nVar.f10269e = new Paint(oVar.f10279b.f10269e);
                }
                if (oVar.f10279b.f10268d != null) {
                    constantState.f10279b.f10268d = new Paint(oVar.f10279b.f10268d);
                }
                constantState.f10280c = oVar.f10280c;
                constantState.f10281d = oVar.f10281d;
                constantState.f10282e = oVar.f10282e;
            }
            this.f10293b = constantState;
            this.f10296e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z7;
        PorterDuff.Mode mode;
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.f10293b;
        ColorStateList colorStateList = oVar.f10280c;
        if (colorStateList != null && (mode = oVar.f10281d) != null) {
            this.f10294c = a(colorStateList, mode);
            invalidateSelf();
            z7 = true;
        } else {
            z7 = false;
        }
        n nVar = oVar.f10279b;
        if (nVar.f10276n == null) {
            nVar.f10276n = Boolean.valueOf(nVar.f10270g.a());
        }
        if (nVar.f10276n.booleanValue()) {
            boolean b5 = oVar.f10279b.f10270g.b(iArr);
            oVar.f10286k |= b5;
            if (b5) {
                invalidateSelf();
                return true;
            }
        }
        return z7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else if (this.f10293b.f10279b.getRootAlpha() != i7) {
            this.f10293b.f10279b.setRootAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.setAutoMirrored(z7);
        } else {
            this.f10293b.f10282e = z7;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f10295d = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            AbstractC1079a.w(drawable, i7);
        } else {
            setTintList(ColorStateList.valueOf(i7));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        o oVar = this.f10293b;
        if (oVar.f10280c != colorStateList) {
            oVar.f10280c = colorStateList;
            this.f10294c = a(colorStateList, oVar.f10281d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        o oVar = this.f10293b;
        if (oVar.f10281d != mode) {
            oVar.f10281d = mode;
            this.f10294c = a(oVar.f10280c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.setVisible(z7, z8);
        }
        return super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v19, types: [d2.m, d2.j, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        n nVar;
        int i7;
        int i8;
        boolean z7;
        int i9;
        boolean z8;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.f10293b;
        oVar.f10279b = new n();
        TypedArray h8 = Y.b.h(resources, theme, attributeSet, AbstractC0887a.f10221a);
        o oVar2 = this.f10293b;
        n nVar2 = oVar2.f10279b;
        int i10 = !Y.b.e(xmlPullParser, "tintMode") ? -1 : h8.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i11 = 3;
        if (i10 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i10 != 5) {
            if (i10 != 9) {
                switch (i10) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case RecognitionOptions.DATA_MATRIX /* 16 */:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        oVar2.f10281d = mode;
        int i12 = 1;
        ColorStateList colorStateList = null;
        boolean z9 = false;
        if (Y.b.e(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            h8.getValue(1, typedValue);
            int i13 = typedValue.type;
            if (i13 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i13 >= 28 && i13 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = h8.getResources();
                int resourceId = h8.getResourceId(1, 0);
                ThreadLocal threadLocal = Y.c.f6556a;
                try {
                    colorStateList = Y.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e7) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e7);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            oVar2.f10280c = colorStateList2;
        }
        boolean z10 = oVar2.f10282e;
        if (Y.b.e(xmlPullParser, "autoMirrored")) {
            z10 = h8.getBoolean(5, z10);
        }
        oVar2.f10282e = z10;
        float f = nVar2.j;
        if (Y.b.e(xmlPullParser, "viewportWidth")) {
            f = h8.getFloat(7, f);
        }
        nVar2.j = f;
        float f4 = nVar2.f10273k;
        if (Y.b.e(xmlPullParser, "viewportHeight")) {
            f4 = h8.getFloat(8, f4);
        }
        nVar2.f10273k = f4;
        if (nVar2.j <= 0.0f) {
            throw new XmlPullParserException(h8.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f4 > 0.0f) {
            nVar2.f10271h = h8.getDimension(3, nVar2.f10271h);
            float dimension = h8.getDimension(2, nVar2.f10272i);
            nVar2.f10272i = dimension;
            if (nVar2.f10271h <= 0.0f) {
                throw new XmlPullParserException(h8.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = nVar2.getAlpha();
                if (Y.b.e(xmlPullParser, "alpha")) {
                    alpha = h8.getFloat(4, alpha);
                }
                nVar2.setAlpha(alpha);
                String string = h8.getString(0);
                if (string != null) {
                    nVar2.f10275m = string;
                    nVar2.f10277o.put(string, nVar2);
                }
                h8.recycle();
                oVar.f10278a = getChangingConfigurations();
                oVar.f10286k = true;
                o oVar3 = this.f10293b;
                n nVar3 = oVar3.f10279b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(nVar3.f10270g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                while (eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != i11)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        k kVar = (k) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i7 = depth;
                        S.f fVar = nVar3.f10277o;
                        if (equals) {
                            ?? mVar = new m();
                            mVar.f10244e = 0.0f;
                            mVar.f10245g = 1.0f;
                            mVar.f10246h = 1.0f;
                            mVar.f10247i = 0.0f;
                            mVar.j = 1.0f;
                            mVar.f10248k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            mVar.f10249l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            mVar.f10250m = join3;
                            nVar = nVar3;
                            mVar.f10251n = 4.0f;
                            TypedArray h9 = Y.b.h(resources, theme, attributeSet, AbstractC0887a.f10223c);
                            if (Y.b.e(xmlPullParser, "pathData")) {
                                String string2 = h9.getString(0);
                                if (string2 != null) {
                                    mVar.f10262b = string2;
                                }
                                String string3 = h9.getString(2);
                                if (string3 != null) {
                                    mVar.f10261a = AbstractC0412a.k(string3);
                                }
                                mVar.f = Y.b.b(h9, xmlPullParser, theme, "fillColor", 1);
                                float f8 = mVar.f10246h;
                                if (Y.b.e(xmlPullParser, "fillAlpha")) {
                                    f8 = h9.getFloat(12, f8);
                                }
                                mVar.f10246h = f8;
                                int i14 = !Y.b.e(xmlPullParser, "strokeLineCap") ? -1 : h9.getInt(8, -1);
                                Paint.Cap cap3 = mVar.f10249l;
                                if (i14 != 0) {
                                    join = join3;
                                    if (i14 != 1) {
                                        cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                mVar.f10249l = cap;
                                int i15 = !Y.b.e(xmlPullParser, "strokeLineJoin") ? -1 : h9.getInt(9, -1);
                                Paint.Join join4 = mVar.f10250m;
                                if (i15 == 0) {
                                    join2 = join;
                                } else if (i15 != 1) {
                                    join2 = i15 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                mVar.f10250m = join2;
                                float f9 = mVar.f10251n;
                                if (Y.b.e(xmlPullParser, "strokeMiterLimit")) {
                                    f9 = h9.getFloat(10, f9);
                                }
                                mVar.f10251n = f9;
                                mVar.f10243d = Y.b.b(h9, xmlPullParser, theme, "strokeColor", 3);
                                float f10 = mVar.f10245g;
                                if (Y.b.e(xmlPullParser, "strokeAlpha")) {
                                    f10 = h9.getFloat(11, f10);
                                }
                                mVar.f10245g = f10;
                                float f11 = mVar.f10244e;
                                if (Y.b.e(xmlPullParser, "strokeWidth")) {
                                    f11 = h9.getFloat(4, f11);
                                }
                                mVar.f10244e = f11;
                                float f12 = mVar.j;
                                if (Y.b.e(xmlPullParser, "trimPathEnd")) {
                                    f12 = h9.getFloat(6, f12);
                                }
                                mVar.j = f12;
                                float f13 = mVar.f10248k;
                                if (Y.b.e(xmlPullParser, "trimPathOffset")) {
                                    f13 = h9.getFloat(7, f13);
                                }
                                mVar.f10248k = f13;
                                float f14 = mVar.f10247i;
                                if (Y.b.e(xmlPullParser, "trimPathStart")) {
                                    f14 = h9.getFloat(5, f14);
                                }
                                mVar.f10247i = f14;
                                int i16 = mVar.f10263c;
                                if (Y.b.e(xmlPullParser, "fillType")) {
                                    i16 = h9.getInt(13, i16);
                                }
                                mVar.f10263c = i16;
                            }
                            h9.recycle();
                            kVar.f10253b.add(mVar);
                            if (mVar.getPathName() != null) {
                                fVar.put(mVar.getPathName(), mVar);
                            }
                            oVar3.f10278a = oVar3.f10278a;
                            z8 = false;
                            i8 = 1;
                            z11 = false;
                        } else {
                            nVar = nVar3;
                            if ("clip-path".equals(name)) {
                                m mVar2 = new m();
                                if (Y.b.e(xmlPullParser, "pathData")) {
                                    TypedArray h10 = Y.b.h(resources, theme, attributeSet, AbstractC0887a.f10224d);
                                    String string4 = h10.getString(0);
                                    if (string4 != null) {
                                        mVar2.f10262b = string4;
                                    }
                                    String string5 = h10.getString(1);
                                    if (string5 != null) {
                                        mVar2.f10261a = AbstractC0412a.k(string5);
                                    }
                                    mVar2.f10263c = !Y.b.e(xmlPullParser, "fillType") ? 0 : h10.getInt(2, 0);
                                    h10.recycle();
                                }
                                kVar.f10253b.add(mVar2);
                                if (mVar2.getPathName() != null) {
                                    fVar.put(mVar2.getPathName(), mVar2);
                                }
                                oVar3.f10278a = oVar3.f10278a;
                            } else if ("group".equals(name)) {
                                k kVar2 = new k();
                                TypedArray h11 = Y.b.h(resources, theme, attributeSet, AbstractC0887a.f10222b);
                                float f15 = kVar2.f10254c;
                                if (Y.b.e(xmlPullParser, "rotation")) {
                                    f15 = h11.getFloat(5, f15);
                                }
                                kVar2.f10254c = f15;
                                i8 = 1;
                                kVar2.f10255d = h11.getFloat(1, kVar2.f10255d);
                                kVar2.f10256e = h11.getFloat(2, kVar2.f10256e);
                                float f16 = kVar2.f;
                                if (Y.b.e(xmlPullParser, "scaleX")) {
                                    f16 = h11.getFloat(3, f16);
                                }
                                kVar2.f = f16;
                                float f17 = kVar2.f10257g;
                                if (Y.b.e(xmlPullParser, "scaleY")) {
                                    f17 = h11.getFloat(4, f17);
                                }
                                kVar2.f10257g = f17;
                                float f18 = kVar2.f10258h;
                                if (Y.b.e(xmlPullParser, "translateX")) {
                                    f18 = h11.getFloat(6, f18);
                                }
                                kVar2.f10258h = f18;
                                float f19 = kVar2.f10259i;
                                if (Y.b.e(xmlPullParser, "translateY")) {
                                    f19 = h11.getFloat(7, f19);
                                }
                                kVar2.f10259i = f19;
                                z8 = false;
                                String string6 = h11.getString(0);
                                if (string6 != null) {
                                    kVar2.f10260k = string6;
                                }
                                kVar2.c();
                                h11.recycle();
                                kVar.f10253b.add(kVar2);
                                arrayDeque.push(kVar2);
                                if (kVar2.getGroupName() != null) {
                                    fVar.put(kVar2.getGroupName(), kVar2);
                                }
                                oVar3.f10278a = oVar3.f10278a;
                            }
                            z8 = false;
                            i8 = 1;
                        }
                        z7 = z8;
                        i9 = 3;
                    } else {
                        nVar = nVar3;
                        i7 = depth;
                        i8 = i12;
                        z7 = z9;
                        i9 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i11 = i9;
                    z9 = z7;
                    i12 = i8;
                    depth = i7;
                    nVar3 = nVar;
                }
                if (!z11) {
                    this.f10294c = a(oVar.f10280c, oVar.f10281d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(h8.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(h8.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public q(o oVar) {
        this.f = true;
        this.f10290X = new float[9];
        this.f10291Y = new Matrix();
        this.f10292Z = new Rect();
        this.f10293b = oVar;
        this.f10294c = a(oVar.f10280c, oVar.f10281d);
    }
}
