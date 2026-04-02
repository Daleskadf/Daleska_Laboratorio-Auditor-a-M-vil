package L4;

import com.dexterous.flutterlocalnotifications.RuntimeTypeAdapterFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public final class I extends I4.G {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2934a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2935b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2936c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2937d;

    public I(I4.n nVar, I4.G g3, Type type) {
        this.f2935b = nVar;
        this.f2936c = g3;
        this.f2937d = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [Q4.a, L4.q] */
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        switch (this.f2934a) {
            case 0:
                return ((I4.G) this.f2936c).b(aVar);
            default:
                I4.q i7 = K4.d.i(aVar);
                I4.t f = i7.f();
                RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = (RuntimeTypeAdapterFactory) this.f2937d;
                I4.q qVar = (I4.q) f.f2219a.remove(RuntimeTypeAdapterFactory.c(runtimeTypeAdapterFactory));
                if (qVar != null) {
                    String h8 = qVar.h();
                    I4.G g3 = (I4.G) ((LinkedHashMap) this.f2935b).get(h8);
                    if (g3 != 0) {
                        try {
                            ?? aVar2 = new Q4.a(C0225q.f2994o0);
                            aVar2.f2996k0 = new Object[32];
                            aVar2.f2997l0 = 0;
                            aVar2.f2998m0 = new String[32];
                            aVar2.f2999n0 = new int[32];
                            aVar2.T(i7);
                            return g3.b(aVar2);
                        } catch (IOException e7) {
                            throw new RuntimeException(e7);
                        }
                    }
                    throw new RuntimeException("cannot deserialize " + RuntimeTypeAdapterFactory.a(runtimeTypeAdapterFactory) + " subtype named " + h8 + "; did you forget to register a subtype?");
                }
                throw new RuntimeException("cannot deserialize " + RuntimeTypeAdapterFactory.a(runtimeTypeAdapterFactory) + " because it does not define a field named " + RuntimeTypeAdapterFactory.c(runtimeTypeAdapterFactory));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x012b, code lost:
        if ((r1 instanceof L4.A) == false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.reflect.Type] */
    @Override // I4.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(Q4.c r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.I.c(Q4.c, java.lang.Object):void");
    }

    public I(RuntimeTypeAdapterFactory runtimeTypeAdapterFactory, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f2937d = runtimeTypeAdapterFactory;
        this.f2935b = linkedHashMap;
        this.f2936c = linkedHashMap2;
    }
}
