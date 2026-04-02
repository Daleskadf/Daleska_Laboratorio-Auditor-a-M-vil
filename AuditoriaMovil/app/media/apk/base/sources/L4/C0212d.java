package L4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
/* renamed from: L4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212d implements I4.H {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2944a;

    /* renamed from: b  reason: collision with root package name */
    public final A.f f2945b;

    public /* synthetic */ C0212d(A.f fVar, int i7) {
        this.f2944a = i7;
        this.f2945b = fVar;
    }

    @Override // I4.H
    public final I4.G create(I4.n nVar, P4.a aVar) {
        Type[] typeArr;
        I4.G g3;
        A.f fVar = this.f2945b;
        Type type = Object.class;
        switch (this.f2944a) {
            case 0:
                Type type2 = aVar.f4023b;
                Class cls = aVar.f4022a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                K4.d.b(Collection.class.isAssignableFrom(cls));
                Type k2 = K4.d.k(type2, cls, K4.d.g(type2, cls, Collection.class), new HashMap());
                if (k2 instanceof ParameterizedType) {
                    type = ((ParameterizedType) k2).getActualTypeArguments()[0];
                }
                return new C0211c(nVar, type, nVar.c(new P4.a(type)), fVar.j(aVar));
            default:
                Type type3 = aVar.f4023b;
                Class cls2 = aVar.f4022a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls2)) {
                    typeArr = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    K4.d.b(Map.class.isAssignableFrom(cls2));
                    Type k8 = K4.d.k(type3, cls2, K4.d.g(type3, cls2, Map.class), new HashMap());
                    if (k8 instanceof ParameterizedType) {
                        typeArr = ((ParameterizedType) k8).getActualTypeArguments();
                    } else {
                        typeArr = new Type[]{type, type};
                    }
                }
                Type type4 = typeArr[0];
                if (type4 != Boolean.TYPE && type4 != Boolean.class) {
                    g3 = nVar.c(new P4.a(type4));
                } else {
                    g3 = o0.f2971c;
                }
                return new C0227t(this, nVar, typeArr[0], g3, typeArr[1], nVar.c(new P4.a(typeArr[1])), fVar.j(aVar));
        }
    }
}
