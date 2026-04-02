package U5;

import L5.x;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class c extends x {

    /* renamed from: d  reason: collision with root package name */
    public static final c f5777d = new Object();

    /* JADX WARN: Type inference failed for: r4v1, types: [U5.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [U5.a, java.lang.Object] */
    @Override // L5.x
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        if (b5 != -127) {
            if (b5 != -126) {
                return super.f(b5, byteBuffer);
            }
            ?? obj = new Object();
            Boolean bool = (Boolean) ((ArrayList) e(byteBuffer)).get(0);
            if (bool != null) {
                obj.f5775a = bool;
                return obj;
            }
            throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
        }
        ArrayList arrayList = (ArrayList) e(byteBuffer);
        ?? obj2 = new Object();
        Boolean bool2 = (Boolean) arrayList.get(0);
        if (bool2 != null) {
            obj2.f5780a = bool2;
            Boolean bool3 = (Boolean) arrayList.get(1);
            if (bool3 != null) {
                obj2.f5781b = bool3;
                Map map = (Map) arrayList.get(2);
                if (map != null) {
                    obj2.f5782c = map;
                    return obj2;
                }
                throw new IllegalStateException("Nonnull field \"headers\" is null.");
            }
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
    }

    @Override // L5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof e) {
            byteArrayOutputStream.write(129);
            e eVar = (e) obj;
            eVar.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(eVar.f5780a);
            arrayList.add(eVar.f5781b);
            arrayList.add(eVar.f5782c);
            k(byteArrayOutputStream, arrayList);
        } else if (obj instanceof a) {
            byteArrayOutputStream.write(130);
            a aVar = (a) obj;
            aVar.getClass();
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(aVar.f5775a);
            k(byteArrayOutputStream, arrayList2);
        } else {
            super.k(byteArrayOutputStream, obj);
        }
    }
}
