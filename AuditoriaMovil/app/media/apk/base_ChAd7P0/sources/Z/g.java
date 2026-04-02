package Z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class g extends android.support.v4.media.session.a {

    /* renamed from: d  reason: collision with root package name */
    public static Class f6718d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Constructor f6719e = null;
    public static Method f = null;

    /* renamed from: g  reason: collision with root package name */
    public static Method f6720g = null;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f6721h = false;

    public static boolean J(Object obj, String str, int i7, boolean z7) {
        K();
        try {
            return ((Boolean) f.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void K() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f6721h) {
            return;
        }
        f6721h = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi21Impl", e7.getClass().getName(), e7);
            method = null;
            cls = null;
            method2 = null;
        }
        f6719e = constructor;
        f6718d = cls;
        f = method2;
        f6720g = method;
    }

    @Override // android.support.v4.media.session.a
    public Typeface c(Context context, Y.e eVar, Resources resources, int i7) {
        Y.f[] fVarArr;
        K();
        try {
            Object newInstance = f6719e.newInstance(null);
            for (Y.f fVar : eVar.f6557a) {
                File W7 = f7.a.W(context);
                if (W7 == null) {
                    return null;
                }
                try {
                    if (!f7.a.e(W7, resources, fVar.f)) {
                        return null;
                    }
                    if (!J(newInstance, W7.getPath(), fVar.f6559b, fVar.f6560c)) {
                        return null;
                    }
                    W7.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    W7.delete();
                }
            }
            K();
            try {
                Object newInstance2 = Array.newInstance(f6718d, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f6720g.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // android.support.v4.media.session.a
    public Typeface d(Context context, e0.i[] iVarArr, int i7) {
        File file;
        String readlink;
        if (iVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l(iVarArr, i7).f10609a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                file = new File(readlink);
                if (file != null && file.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface f4 = f(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return f4;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface f42 = f(context, fileInputStream2);
            fileInputStream2.close();
            openFileDescriptor.close();
            return f42;
        } catch (IOException unused2) {
            return null;
        }
    }
}
