package io.flutter.plugins.firebase.storage;

import L5.x;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class h extends x {

    /* renamed from: d  reason: collision with root package name */
    public static final h f11997d = new Object();

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, io.flutter.plugins.firebase.storage.j] */
    /* JADX WARN: Type inference failed for: r6v10, types: [io.flutter.plugins.firebase.storage.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, io.flutter.plugins.firebase.storage.k] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, io.flutter.plugins.firebase.storage.l] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, io.flutter.plugins.firebase.storage.m] */
    /* JADX WARN: Type inference failed for: r6v8, types: [io.flutter.plugins.firebase.storage.n, java.lang.Object] */
    @Override // L5.x
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        long longValue;
        Long valueOf;
        switch (b5) {
            case Byte.MIN_VALUE:
                ?? obj = new Object();
                obj.f11999a = (Map) ((ArrayList) e(byteBuffer)).get(0);
                return obj;
            case -127:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                ?? obj2 = new Object();
                Object obj3 = arrayList.get(0);
                if (obj3 == null) {
                    valueOf = null;
                } else {
                    if (obj3 instanceof Integer) {
                        longValue = ((Integer) obj3).intValue();
                    } else {
                        longValue = ((Long) obj3).longValue();
                    }
                    valueOf = Long.valueOf(longValue);
                }
                if (valueOf != null) {
                    obj2.f12000a = valueOf;
                    obj2.f12001b = (String) arrayList.get(1);
                    return obj2;
                }
                throw new IllegalStateException("Nonnull field \"maxResults\" is null.");
            case -126:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                ?? obj4 = new Object();
                List list = (List) arrayList2.get(0);
                if (list != null) {
                    obj4.f12002a = list;
                    obj4.f12003b = (String) arrayList2.get(1);
                    List list2 = (List) arrayList2.get(2);
                    if (list2 != null) {
                        obj4.f12004c = list2;
                        return obj4;
                    }
                    throw new IllegalStateException("Nonnull field \"prefixs\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"items\" is null.");
            case -125:
                ArrayList arrayList3 = (ArrayList) e(byteBuffer);
                ?? obj5 = new Object();
                obj5.f12005a = (String) arrayList3.get(0);
                obj5.f12006b = (String) arrayList3.get(1);
                obj5.f12007c = (String) arrayList3.get(2);
                obj5.f12008d = (String) arrayList3.get(3);
                obj5.f12009e = (String) arrayList3.get(4);
                obj5.f = (Map) arrayList3.get(5);
                return obj5;
            case -124:
                ArrayList arrayList4 = (ArrayList) e(byteBuffer);
                ?? obj6 = new Object();
                String str = (String) arrayList4.get(0);
                if (str != null) {
                    obj6.f12010a = str;
                    obj6.f12011b = (String) arrayList4.get(1);
                    String str2 = (String) arrayList4.get(2);
                    if (str2 != null) {
                        obj6.f12012c = str2;
                        return obj6;
                    }
                    throw new IllegalStateException("Nonnull field \"bucket\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"appName\" is null.");
            case -123:
                ArrayList arrayList5 = (ArrayList) e(byteBuffer);
                ?? obj7 = new Object();
                String str3 = (String) arrayList5.get(0);
                if (str3 != null) {
                    obj7.f12013a = str3;
                    String str4 = (String) arrayList5.get(1);
                    if (str4 != null) {
                        obj7.f12014b = str4;
                        String str5 = (String) arrayList5.get(2);
                        if (str5 != null) {
                            obj7.f12015c = str5;
                            return obj7;
                        }
                        throw new IllegalStateException("Nonnull field \"name\" is null.");
                    }
                    throw new IllegalStateException("Nonnull field \"fullPath\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"bucket\" is null.");
            default:
                return super.f(b5, byteBuffer);
        }
    }

    @Override // L5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof j) {
            byteArrayOutputStream.write(RecognitionOptions.ITF);
            j jVar = (j) obj;
            jVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(jVar.f11999a);
            k(byteArrayOutputStream, arrayList);
        } else if (obj instanceof k) {
            byteArrayOutputStream.write(129);
            k kVar = (k) obj;
            kVar.getClass();
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(kVar.f12000a);
            arrayList2.add(kVar.f12001b);
            k(byteArrayOutputStream, arrayList2);
        } else if (obj instanceof l) {
            byteArrayOutputStream.write(130);
            l lVar = (l) obj;
            lVar.getClass();
            ArrayList arrayList3 = new ArrayList(3);
            arrayList3.add(lVar.f12002a);
            arrayList3.add(lVar.f12003b);
            arrayList3.add(lVar.f12004c);
            k(byteArrayOutputStream, arrayList3);
        } else if (obj instanceof m) {
            byteArrayOutputStream.write(131);
            m mVar = (m) obj;
            mVar.getClass();
            ArrayList arrayList4 = new ArrayList(6);
            arrayList4.add(mVar.f12005a);
            arrayList4.add(mVar.f12006b);
            arrayList4.add(mVar.f12007c);
            arrayList4.add(mVar.f12008d);
            arrayList4.add(mVar.f12009e);
            arrayList4.add(mVar.f);
            k(byteArrayOutputStream, arrayList4);
        } else if (obj instanceof n) {
            byteArrayOutputStream.write(132);
            n nVar = (n) obj;
            nVar.getClass();
            ArrayList arrayList5 = new ArrayList(3);
            arrayList5.add(nVar.f12010a);
            arrayList5.add(nVar.f12011b);
            arrayList5.add(nVar.f12012c);
            k(byteArrayOutputStream, arrayList5);
        } else if (obj instanceof o) {
            byteArrayOutputStream.write(133);
            o oVar = (o) obj;
            oVar.getClass();
            ArrayList arrayList6 = new ArrayList(3);
            arrayList6.add(oVar.f12013a);
            arrayList6.add(oVar.f12014b);
            arrayList6.add(oVar.f12015c);
            k(byteArrayOutputStream, arrayList6);
        } else {
            super.k(byteArrayOutputStream, obj);
        }
    }
}
