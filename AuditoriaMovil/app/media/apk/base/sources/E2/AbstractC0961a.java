package e2;

import S.f;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: e2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0961a {

    /* renamed from: a  reason: collision with root package name */
    public final f f10857a;

    /* renamed from: b  reason: collision with root package name */
    public final f f10858b;

    /* renamed from: c  reason: collision with root package name */
    public final f f10859c;

    public AbstractC0961a(f fVar, f fVar2, f fVar3) {
        this.f10857a = fVar;
        this.f10858b = fVar2;
        this.f10859c = fVar3;
    }

    public abstract C0962b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        f fVar = this.f10859c;
        Class cls2 = (Class) fVar.get(name);
        if (cls2 == null) {
            String name2 = cls.getPackage().getName();
            String simpleName = cls.getSimpleName();
            Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
            fVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        f fVar = this.f10857a;
        Method method = (Method) fVar.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, AbstractC0961a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0961a.class);
            fVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        f fVar = this.f10858b;
        Method method = (Method) fVar.get(name);
        if (method == null) {
            Class b5 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b5.getDeclaredMethod("write", cls, AbstractC0961a.class);
            fVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i7);

    public final int f(int i7, int i8) {
        if (!e(i8)) {
            return i7;
        }
        return ((C0962b) this).f10861e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i7) {
        if (!e(i7)) {
            return parcelable;
        }
        return ((C0962b) this).f10861e.readParcelable(C0962b.class.getClassLoader());
    }

    public final InterfaceC0963c h() {
        String readString = ((C0962b) this).f10861e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC0963c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e10.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
        }
    }

    public abstract void i(int i7);

    public final void j(int i7, int i8) {
        i(i8);
        ((C0962b) this).f10861e.writeInt(i7);
    }

    public final void k(Parcelable parcelable, int i7) {
        i(i7);
        ((C0962b) this).f10861e.writeParcelable(parcelable, 0);
    }

    public final void l(InterfaceC0963c interfaceC0963c) {
        if (interfaceC0963c == null) {
            ((C0962b) this).f10861e.writeString(null);
            return;
        }
        try {
            ((C0962b) this).f10861e.writeString(b(interfaceC0963c.getClass()).getName());
            C0962b a7 = a();
            try {
                d(interfaceC0963c.getClass()).invoke(null, interfaceC0963c, a7);
                int i7 = a7.f10864i;
                if (i7 >= 0) {
                    int i8 = a7.f10860d.get(i7);
                    Parcel parcel = a7.f10861e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i8);
                    parcel.writeInt(dataPosition - i8);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
            } catch (InvocationTargetException e10) {
                if (e10.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e10.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
            }
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(interfaceC0963c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e11);
        }
    }
}
