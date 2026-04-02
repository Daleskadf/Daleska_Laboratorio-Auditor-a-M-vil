package L4;

import D.AbstractC0059i;
import I4.EnumC0206h;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class E implements I4.H {

    /* renamed from: a  reason: collision with root package name */
    public final A.f f2921a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC0206h f2922b;

    /* renamed from: c  reason: collision with root package name */
    public final K4.h f2923c;

    /* renamed from: d  reason: collision with root package name */
    public final C0220l f2924d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f2925e;

    public E(A.f fVar, EnumC0206h enumC0206h, K4.h hVar, C0220l c0220l, ArrayList arrayList) {
        this.f2921a = fVar;
        this.f2922b = enumC0206h;
        this.f2923c = hVar;
        this.f2924d = c0220l;
        this.f2925e = arrayList;
    }

    public static void a(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (K4.s.f2689a.a(obj, accessibleObject)) {
            return;
        }
        throw new RuntimeException(AbstractC0059i.z(N4.c.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + N4.c.c(field) + " and " + N4.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01dc A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cd  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v0, types: [L4.E] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final L4.C c(I4.n r34, P4.a r35, java.lang.Class r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.E.c(I4.n, P4.a, java.lang.Class, boolean, boolean):L4.C");
    }

    @Override // I4.H
    public final I4.G create(I4.n nVar, P4.a aVar) {
        boolean z7;
        Class cls = aVar.f4022a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        org.slf4j.helpers.i iVar = N4.c.f3448a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new I4.j(2);
        }
        I4.y f = K4.d.f(this.f2925e);
        if (f != I4.y.BLOCK_ALL) {
            if (f == I4.y.BLOCK_INACCESSIBLE) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z8 = z7;
            if (N4.c.f3448a.F(cls)) {
                return new D(cls, c(nVar, aVar, cls, z8, true), z8);
            }
            return new B(this.f2921a.j(aVar), c(nVar, aVar, cls, z8, false));
        }
        throw new RuntimeException("ReflectionAccessFilter does not permit using reflection for " + cls + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    public final boolean d(Field field, boolean z7) {
        List list;
        boolean z8;
        K4.h hVar = this.f2923c;
        hVar.getClass();
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || hVar.a(field.getType(), z7)) {
            z8 = true;
        } else {
            if (z7) {
                list = hVar.f2660a;
            } else {
                list = hVar.f2661b;
            }
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            z8 = false;
        }
        return !z8;
    }
}
