package L4;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
/* renamed from: L4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0209a implements I4.H {
    @Override // I4.H
    public final I4.G create(I4.n nVar, P4.a aVar) {
        Type componentType;
        Type type = aVar.f4023b;
        boolean z7 = type instanceof GenericArrayType;
        if (!z7 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        if (z7) {
            componentType = ((GenericArrayType) type).getGenericComponentType();
        } else {
            componentType = ((Class) type).getComponentType();
        }
        return new C0210b(nVar, nVar.c(new P4.a(componentType)), K4.d.h(componentType));
    }
}
