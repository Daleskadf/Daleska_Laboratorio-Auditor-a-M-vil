package M3;

import A3.K;
import A3.N;
import A3.j0;
import B5.S;
import D.AbstractC0059i;
import H0.P;
import H0.T;
import H0.V;
import K0.x;
import O0.H;
import O0.e0;
import R3.EnumC0324v0;
import R3.X0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.Image;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.renderscript.Type;
import c4.InterfaceC0633b;
import com.example.appecoactivate.R;
import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import e1.C0960z;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import k4.InterfaceC1396b;
import org.apache.tika.utils.StringUtils;
import p.C1597n;
import p.C1602p0;
import p.K0;
import p.O;
import w.C1914Y;
import w4.InterfaceC1956b;
/* loaded from: classes.dex */
public final class q implements InterfaceC0633b {

    /* renamed from: a  reason: collision with root package name */
    public Object f3252a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3253b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3254c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3255d;

    /* renamed from: e  reason: collision with root package name */
    public Object f3256e;
    public Object f;

    public q(Context context) {
        RenderScript create = RenderScript.create(context);
        this.f3252a = create;
        this.f3254c = ScriptIntrinsicYuvToRGB.create(create, Element.U8_4(create));
        this.f3256e = new byte[0];
    }

    public static boolean j(int[] iArr, int i7) {
        for (int i8 : iArr) {
            if (i8 == i7) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, M3.q] */
    public static q l(String str, AbstractC0781h abstractC0781h, EnumC0324v0 enumC0324v0, X0 x02, Integer num) {
        if (x02 == X0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        ?? obj = new Object();
        obj.f3252a = str;
        obj.f3254c = v.b(str);
        obj.f3255d = abstractC0781h;
        obj.f3256e = enumC0324v0;
        obj.f = x02;
        obj.f3253b = num;
        return obj;
    }

    public static ColorStateList n(Context context, int i7) {
        int c8 = K0.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{K0.f14689b, K0.f14691d, K0.f14690c, K0.f}, new int[]{K0.b(context, R.attr.colorButtonNormal), Z.a.b(c8, i7), Z.a.b(c8, i7), i7});
    }

    public static C0960z o(P p7, K k2, C0960z c0960z, T t7) {
        int b5;
        Object l8;
        int i7;
        H h8 = (H) p7;
        V H7 = h8.H();
        h8.Z();
        if (h8.f3513Y0.f3713a.p()) {
            b5 = 0;
        } else {
            e0 e0Var = h8.f3513Y0;
            b5 = e0Var.f3713a.b(e0Var.f3714b.f10852a);
        }
        if (H7.p()) {
            l8 = null;
        } else {
            l8 = H7.l(b5);
        }
        if (!h8.M() && !H7.p()) {
            i7 = H7.f(b5, t7, false).b(x.M(h8.F()) - t7.f1720e);
        } else {
            i7 = -1;
        }
        for (int i8 = 0; i8 < k2.size(); i8++) {
            C0960z c0960z2 = (C0960z) k2.get(i8);
            if (u(c0960z2, l8, h8.M(), h8.C(), h8.D(), i7)) {
                return c0960z2;
            }
        }
        if (k2.isEmpty() && c0960z != null) {
            if (u(c0960z, l8, h8.M(), h8.C(), h8.D(), i7)) {
                return c0960z;
            }
        }
        return null;
    }

    public static LayerDrawable r(C1602p0 c1602p0, Context context, int i7) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i7);
        Drawable f = c1602p0.f(context, R.drawable.abc_star_black_48dp);
        Drawable f4 = c1602p0.f(context, R.drawable.abc_star_half_black_48dp);
        if ((f instanceof BitmapDrawable) && f.getIntrinsicWidth() == dimensionPixelSize && f.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) f;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((f4 instanceof BitmapDrawable) && f4.getIntrinsicWidth() == dimensionPixelSize && f4.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) f4;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            f4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f4.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static boolean u(C0960z c0960z, Object obj, boolean z7, int i7, int i8, int i9) {
        if (!c0960z.f10852a.equals(obj)) {
            return false;
        }
        int i10 = c0960z.f10853b;
        if ((!z7 || i10 != i7 || c0960z.f10854c != i8) && (z7 || i10 != -1 || c0960z.f10856e != i9)) {
            return false;
        }
        return true;
    }

    public static void y(Drawable drawable, int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter h8;
        int[] iArr = O.f14702a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C1597n.f14852b;
        }
        PorterDuff.Mode mode2 = C1597n.f14852b;
        synchronized (C1597n.class) {
            h8 = C1602p0.h(i7, mode);
        }
        mutate.setColorFilter(h8);
    }

    public synchronized void A(Image image, Bitmap bitmap) {
        try {
            try {
                S s7 = new S(image, (ByteBuffer) this.f3255d);
                this.f3255d = (ByteBuffer) s7.f336c;
                if (v(image, s7)) {
                    m(image, s7);
                }
                ((ByteBuffer) s7.f336c).get((byte[]) this.f3256e);
                Allocation allocation = (Allocation) this.f;
                kotlin.jvm.internal.j.b(allocation);
                allocation.copyFrom((byte[]) this.f3256e);
                ((ScriptIntrinsicYuvToRGB) this.f3254c).setInput((Allocation) this.f);
                ((ScriptIntrinsicYuvToRGB) this.f3254c).forEach((Allocation) this.f3253b);
                Allocation allocation2 = (Allocation) this.f3253b;
                kotlin.jvm.internal.j.b(allocation2);
                allocation2.copyTo(bitmap);
            } catch (Exception e7) {
                throw new IllegalStateException("Failed to convert YUV to RGB", e7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // c4.InterfaceC0633b
    public Object a(Class cls) {
        if (((Set) this.f3252a).contains(c4.r.a(cls))) {
            Object a7 = ((InterfaceC0633b) this.f3253b).a(cls);
            if (!cls.equals(InterfaceC1396b.class)) {
                return a7;
            }
            return new c4.s((Set) this.f, (InterfaceC1396b) a7);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // c4.InterfaceC0633b
    public Object b(c4.r rVar) {
        if (((Set) this.f3252a).contains(rVar)) {
            return ((InterfaceC0633b) this.f3253b).b(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + rVar + ".");
    }

    @Override // c4.InterfaceC0633b
    public c4.p c(c4.r rVar) {
        if (((Set) this.f3255d).contains(rVar)) {
            return ((InterfaceC0633b) this.f3253b).c(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override // c4.InterfaceC0633b
    public Set d(c4.r rVar) {
        if (((Set) this.f3256e).contains(rVar)) {
            return ((InterfaceC0633b) this.f3253b).d(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override // c4.InterfaceC0633b
    public InterfaceC1956b e(Class cls) {
        return f(c4.r.a(cls));
    }

    @Override // c4.InterfaceC0633b
    public InterfaceC1956b f(c4.r rVar) {
        if (((Set) this.f3254c).contains(rVar)) {
            return ((InterfaceC0633b) this.f3253b).f(rVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override // c4.InterfaceC0633b
    public c4.p g(Class cls) {
        return c(c4.r.a(cls));
    }

    public void h(String str, String str2) {
        HashMap hashMap = (HashMap) this.f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public void i(N n7, C0960z c0960z, V v6) {
        if (c0960z == null) {
            return;
        }
        if (v6.b(c0960z.f10852a) != -1) {
            n7.m(c0960z, v6);
            return;
        }
        V v7 = (V) ((j0) this.f3255d).get(c0960z);
        if (v7 != null) {
            n7.m(c0960z, v7);
        }
    }

    public D2.a k() {
        String str;
        if (((String) this.f3252a) == null) {
            str = " transportName";
        } else {
            str = StringUtils.EMPTY;
        }
        if (((D2.e) this.f3254c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f3255d) == null) {
            str = AbstractC0059i.z(str, " eventMillis");
        }
        if (((Long) this.f3256e) == null) {
            str = AbstractC0059i.z(str, " uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            str = AbstractC0059i.z(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new D2.a((String) this.f3252a, (Integer) this.f3253b, (D2.e) this.f3254c, ((Long) this.f3255d).longValue(), ((Long) this.f3256e).longValue(), (HashMap) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void m(Image image, S s7) {
        RenderScript renderScript = (RenderScript) this.f3252a;
        this.f = Allocation.createTyped(renderScript, new Type.Builder(renderScript, Element.U8(renderScript)).setX(image.getWidth()).setY(image.getHeight()).setYuvFormat(s7.f335b).create(), 1);
        this.f3256e = new byte[((ByteBuffer) s7.f336c).capacity()];
        this.f3253b = Allocation.createTyped(renderScript, new Type.Builder(renderScript, Element.RGBA_8888(renderScript)).setX(image.getWidth()).setY(image.getHeight()).create(), 1);
    }

    public ArrayList p() {
        ArrayList arrayList;
        synchronized (this.f3254c) {
            arrayList = new ArrayList((LinkedHashSet) this.f3255d);
        }
        return arrayList;
    }

    public ArrayList q() {
        ArrayList arrayList;
        synchronized (this.f3254c) {
            arrayList = new ArrayList((LinkedHashSet) this.f);
        }
        return arrayList;
    }

    public ArrayList s() {
        ArrayList arrayList;
        synchronized (this.f3254c) {
            arrayList = new ArrayList();
            arrayList.addAll(p());
            arrayList.addAll(q());
        }
        return arrayList;
    }

    public ColorStateList t(Context context, int i7) {
        if (i7 == R.drawable.abc_edit_text_material) {
            return X.d.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i7 == R.drawable.abc_switch_track_mtrl_alpha) {
            return X.d.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i7 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d7 = K0.d(context, R.attr.colorSwitchThumbNormal);
            if (d7 != null && d7.isStateful()) {
                int[] iArr3 = K0.f14689b;
                iArr[0] = iArr3;
                iArr2[0] = d7.getColorForState(iArr3, 0);
                iArr[1] = K0.f14692e;
                iArr2[1] = K0.c(context, R.attr.colorControlActivated);
                iArr[2] = K0.f;
                iArr2[2] = d7.getDefaultColor();
            } else {
                iArr[0] = K0.f14689b;
                iArr2[0] = K0.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = K0.f14692e;
                iArr2[1] = K0.c(context, R.attr.colorControlActivated);
                iArr[2] = K0.f;
                iArr2[2] = K0.c(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i7 == R.drawable.abc_btn_default_mtrl_shape) {
            return n(context, K0.c(context, R.attr.colorButtonNormal));
        } else {
            if (i7 == R.drawable.abc_btn_borderless_material) {
                return n(context, 0);
            }
            if (i7 == R.drawable.abc_btn_colored_material) {
                return n(context, K0.c(context, R.attr.colorAccent));
            }
            if (i7 != R.drawable.abc_spinner_mtrl_am_alpha && i7 != R.drawable.abc_spinner_textfield_background_material) {
                if (j((int[]) this.f3254c, i7)) {
                    return K0.d(context, R.attr.colorControlNormal);
                }
                if (j((int[]) this.f, i7)) {
                    return X.d.getColorStateList(context, R.color.abc_tint_default);
                }
                if (j((int[]) this.f3253b, i7)) {
                    return X.d.getColorStateList(context, R.color.abc_tint_btn_checkable);
                }
                if (i7 == R.drawable.abc_seekbar_thumb_material) {
                    return X.d.getColorStateList(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            return X.d.getColorStateList(context, R.color.abc_tint_spinner);
        }
    }

    public boolean v(Image image, S s7) {
        Type type;
        Allocation allocation;
        Type type2;
        Allocation allocation2;
        Type type3;
        Allocation allocation3 = (Allocation) this.f;
        if (allocation3 != null && (type = allocation3.getType()) != null && type.getX() == image.getWidth() && (allocation = (Allocation) this.f) != null && (type2 = allocation.getType()) != null && type2.getY() == image.getHeight() && (allocation2 = (Allocation) this.f) != null && (type3 = allocation2.getType()) != null && type3.getYuv() == s7.f335b) {
            return false;
        }
        return true;
    }

    public void w(C1914Y c1914y) {
        synchronized (this.f3254c) {
            ((LinkedHashSet) this.f).add(c1914y);
        }
    }

    public Set x(Class cls) {
        return d(c4.r.a(cls));
    }

    public void z(V v6) {
        N n7 = new N(4, 0);
        if (((K) this.f3254c).isEmpty()) {
            i(n7, (C0960z) this.f, v6);
            if (!F.f.l((C0960z) this.f3253b, (C0960z) this.f)) {
                i(n7, (C0960z) this.f3253b, v6);
            }
            if (!F.f.l((C0960z) this.f3256e, (C0960z) this.f) && !F.f.l((C0960z) this.f3256e, (C0960z) this.f3253b)) {
                i(n7, (C0960z) this.f3256e, v6);
            }
        } else {
            for (int i7 = 0; i7 < ((K) this.f3254c).size(); i7++) {
                i(n7, (C0960z) ((K) this.f3254c).get(i7), v6);
            }
            if (!((K) this.f3254c).contains((C0960z) this.f3256e)) {
                i(n7, (C0960z) this.f3256e, v6);
            }
        }
        this.f3255d = n7.d();
    }
}
