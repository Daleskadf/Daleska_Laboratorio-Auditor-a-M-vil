package Z;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class i extends g {

    /* renamed from: i  reason: collision with root package name */
    public final Class f6725i;
    public final Constructor j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f6726k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f6727l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f6728m;

    /* renamed from: n  reason: collision with root package name */
    public final Method f6729n;

    /* renamed from: o  reason: collision with root package name */
    public final Method f6730o;

    public i() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = R(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = S(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e7.getClass().getName()), e7);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f6725i = cls;
        this.j = constructor;
        this.f6726k = method2;
        this.f6727l = method3;
        this.f6728m = method4;
        this.f6729n = method5;
        this.f6730o = method;
    }

    public static Method R(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void L(Object obj) {
        try {
            this.f6729n.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean M(Context context, Object obj, String str, int i7, int i8, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f6726k.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface N(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f6725i, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f6730o.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean O(Object obj) {
        try {
            return ((Boolean) this.f6728m.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean P() {
        Method method = this.f6726k;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    public final Object Q() {
        try {
            return this.j.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method S(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // Z.g, android.support.v4.media.session.a
    public final Typeface c(Context context, Y.e eVar, Resources resources, int i7) {
        Y.f[] fVarArr;
        if (!P()) {
            return super.c(context, eVar, resources, i7);
        }
        Object Q7 = Q();
        if (Q7 == null) {
            return null;
        }
        for (Y.f fVar : eVar.f6557a) {
            if (!M(context, Q7, fVar.f6558a, fVar.f6562e, fVar.f6559b, fVar.f6560c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f6561d))) {
                L(Q7);
                return null;
            }
        }
        if (!O(Q7)) {
            return null;
        }
        return N(Q7);
    }

    @Override // Z.g, android.support.v4.media.session.a
    public final Typeface d(Context context, e0.i[] iVarArr, int i7) {
        Typeface N7;
        boolean z7;
        if (iVarArr.length < 1) {
            return null;
        }
        if (!P()) {
            e0.i l8 = l(iVarArr, i7);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l8.f10609a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(l8.f10611c).setItalic(l8.f10612d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (e0.i iVar : iVarArr) {
            if (iVar.f10613e == 0) {
                Uri uri = iVar.f10609a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, f7.a.d0(context, uri));
                }
            }
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
        Object Q7 = Q();
        if (Q7 == null) {
            return null;
        }
        int length = iVarArr.length;
        int i8 = 0;
        boolean z8 = false;
        while (i8 < length) {
            e0.i iVar2 = iVarArr[i8];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(iVar2.f10609a);
            if (byteBuffer != null) {
                try {
                    z7 = ((Boolean) this.f6727l.invoke(Q7, byteBuffer, Integer.valueOf(iVar2.f10610b), null, Integer.valueOf(iVar2.f10611c), Integer.valueOf(iVar2.f10612d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z7 = false;
                }
                if (!z7) {
                    L(Q7);
                    return null;
                }
                z8 = true;
            }
            i8++;
            z8 = z8;
        }
        if (!z8) {
            L(Q7);
            return null;
        } else if (!O(Q7) || (N7 = N(Q7)) == null) {
            return null;
        } else {
            return Typeface.create(N7, i7);
        }
    }

    @Override // android.support.v4.media.session.a
    public final Typeface g(Context context, Resources resources, int i7, String str, int i8) {
        if (!P()) {
            return super.g(context, resources, i7, str, i8);
        }
        Object Q7 = Q();
        if (Q7 == null) {
            return null;
        }
        if (!M(context, Q7, str, 0, -1, -1, null)) {
            L(Q7);
            return null;
        } else if (!O(Q7)) {
            return null;
        } else {
            return N(Q7);
        }
    }
}
