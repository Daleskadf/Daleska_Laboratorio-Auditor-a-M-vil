package io.flutter.plugins.googlesignin;

import L5.x;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class h extends x {

    /* renamed from: d  reason: collision with root package name */
    public static final h f12333d = new Object();

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, io.flutter.plugins.googlesignin.g] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, io.flutter.plugins.googlesignin.j] */
    @Override // L5.x
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        switch (b5) {
            case -127:
                Object e7 = e(byteBuffer);
                if (e7 == null) {
                    return null;
                }
                return i.values()[((Long) e7).intValue()];
            case -126:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                ?? obj = new Object();
                List list = (List) arrayList.get(0);
                if (list != null) {
                    obj.f12327a = list;
                    i iVar = (i) arrayList.get(1);
                    if (iVar != null) {
                        obj.f12328b = iVar;
                        obj.f12329c = (String) arrayList.get(2);
                        obj.f12330d = (String) arrayList.get(3);
                        obj.f12331e = (String) arrayList.get(4);
                        Boolean bool = (Boolean) arrayList.get(5);
                        if (bool != null) {
                            obj.f = bool;
                            obj.f12332g = (String) arrayList.get(6);
                            return obj;
                        }
                        throw new IllegalStateException("Nonnull field \"forceCodeForRefreshToken\" is null.");
                    }
                    throw new IllegalStateException("Nonnull field \"signInType\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"scopes\" is null.");
            case -125:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                ?? obj2 = new Object();
                obj2.f12334a = (String) arrayList2.get(0);
                String str = (String) arrayList2.get(1);
                if (str != null) {
                    obj2.f12335b = str;
                    String str2 = (String) arrayList2.get(2);
                    if (str2 != null) {
                        obj2.f12336c = str2;
                        obj2.f12337d = (String) arrayList2.get(3);
                        obj2.f12338e = (String) arrayList2.get(4);
                        obj2.f = (String) arrayList2.get(5);
                        return obj2;
                    }
                    throw new IllegalStateException("Nonnull field \"id\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"email\" is null.");
            default:
                return super.f(b5, byteBuffer);
        }
    }

    @Override // L5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Object valueOf;
        if (obj instanceof i) {
            byteArrayOutputStream.write(129);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(((i) obj).index);
            }
            k(byteArrayOutputStream, valueOf);
        } else if (obj instanceof g) {
            byteArrayOutputStream.write(130);
            g gVar = (g) obj;
            gVar.getClass();
            ArrayList arrayList = new ArrayList(7);
            arrayList.add(gVar.f12327a);
            arrayList.add(gVar.f12328b);
            arrayList.add(gVar.f12329c);
            arrayList.add(gVar.f12330d);
            arrayList.add(gVar.f12331e);
            arrayList.add(gVar.f);
            arrayList.add(gVar.f12332g);
            k(byteArrayOutputStream, arrayList);
        } else if (obj instanceof j) {
            byteArrayOutputStream.write(131);
            j jVar = (j) obj;
            jVar.getClass();
            ArrayList arrayList2 = new ArrayList(6);
            arrayList2.add(jVar.f12334a);
            arrayList2.add(jVar.f12335b);
            arrayList2.add(jVar.f12336c);
            arrayList2.add(jVar.f12337d);
            arrayList2.add(jVar.f12338e);
            arrayList2.add(jVar.f);
            k(byteArrayOutputStream, arrayList2);
        } else {
            super.k(byteArrayOutputStream, obj);
        }
    }
}
