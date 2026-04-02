package P5;

import L5.x;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class i extends x {

    /* renamed from: d  reason: collision with root package name */
    public static final i f4047d = new Object();

    /* JADX WARN: Type inference failed for: r3v1, types: [P5.k, java.lang.Object] */
    @Override // L5.x
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        j a7;
        if (b5 != Byte.MIN_VALUE) {
            if (b5 != -127) {
                return super.f(b5, byteBuffer);
            }
            ArrayList arrayList = (ArrayList) e(byteBuffer);
            ?? obj = new Object();
            String str = (String) arrayList.get(0);
            if (str != null) {
                obj.f4060a = str;
                Object obj2 = arrayList.get(1);
                if (obj2 == null) {
                    a7 = null;
                } else {
                    a7 = j.a((ArrayList) obj2);
                }
                if (a7 != null) {
                    obj.f4061b = a7;
                    obj.f4062c = (Boolean) arrayList.get(2);
                    Map map = (Map) arrayList.get(3);
                    if (map != null) {
                        obj.f4063d = map;
                        return obj;
                    }
                    throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"options\" is null.");
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }
        return j.a((ArrayList) e(byteBuffer));
    }

    @Override // L5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        ArrayList b5;
        if (obj instanceof j) {
            byteArrayOutputStream.write(RecognitionOptions.ITF);
            k(byteArrayOutputStream, ((j) obj).b());
        } else if (obj instanceof k) {
            byteArrayOutputStream.write(129);
            k kVar = (k) obj;
            kVar.getClass();
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(kVar.f4060a);
            j jVar = kVar.f4061b;
            if (jVar == null) {
                b5 = null;
            } else {
                b5 = jVar.b();
            }
            arrayList.add(b5);
            arrayList.add(kVar.f4062c);
            arrayList.add(kVar.f4063d);
            k(byteArrayOutputStream, arrayList);
        } else {
            super.k(byteArrayOutputStream, obj);
        }
    }
}
