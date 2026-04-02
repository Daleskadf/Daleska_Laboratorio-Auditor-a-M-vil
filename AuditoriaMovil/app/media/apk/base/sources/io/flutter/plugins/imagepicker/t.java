package io.flutter.plugins.imagepicker;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class t extends L5.x {

    /* renamed from: d  reason: collision with root package name */
    public static final t f12383d = new Object();

    /* JADX WARN: Type inference failed for: r7v11, types: [io.flutter.plugins.imagepicker.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [io.flutter.plugins.imagepicker.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [io.flutter.plugins.imagepicker.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [io.flutter.plugins.imagepicker.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, io.flutter.plugins.imagepicker.p] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, io.flutter.plugins.imagepicker.r] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, io.flutter.plugins.imagepicker.s] */
    @Override // L5.x
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        switch (b5) {
            case -127:
                Object e7 = e(byteBuffer);
                if (e7 == null) {
                    return null;
                }
                return u.values()[((Long) e7).intValue()];
            case -126:
                Object e8 = e(byteBuffer);
                if (e8 == null) {
                    return null;
                }
                return w.values()[((Long) e8).intValue()];
            case -125:
                Object e9 = e(byteBuffer);
                if (e9 == null) {
                    return null;
                }
                return n.values()[((Long) e9).intValue()];
            case -124:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                ?? obj = new Object();
                Boolean bool = (Boolean) arrayList.get(0);
                if (bool != null) {
                    obj.f12374a = bool;
                    Boolean bool2 = (Boolean) arrayList.get(1);
                    if (bool2 != null) {
                        obj.f12375b = bool2;
                        obj.f12376c = (Long) arrayList.get(2);
                        return obj;
                    }
                    throw new IllegalStateException("Nonnull field \"usePhotoPicker\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"allowMultiple\" is null.");
            case -123:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                ?? obj2 = new Object();
                obj2.f12379a = (Double) arrayList2.get(0);
                obj2.f12380b = (Double) arrayList2.get(1);
                Long l8 = (Long) arrayList2.get(2);
                if (l8 != null) {
                    obj2.f12381c = l8;
                    return obj2;
                }
                throw new IllegalStateException("Nonnull field \"quality\" is null.");
            case -122:
                ?? obj3 = new Object();
                r rVar = (r) ((ArrayList) e(byteBuffer)).get(0);
                if (rVar != null) {
                    obj3.f12382a = rVar;
                    return obj3;
                }
                throw new IllegalStateException("Nonnull field \"imageSelectionOptions\" is null.");
            case -121:
                ?? obj4 = new Object();
                obj4.f12386a = (Long) ((ArrayList) e(byteBuffer)).get(0);
                return obj4;
            case -120:
                ArrayList arrayList3 = (ArrayList) e(byteBuffer);
                ?? obj5 = new Object();
                w wVar = (w) arrayList3.get(0);
                if (wVar != null) {
                    obj5.f12384a = wVar;
                    obj5.f12385b = (u) arrayList3.get(1);
                    return obj5;
                }
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            case -119:
                ArrayList arrayList4 = (ArrayList) e(byteBuffer);
                ?? obj6 = new Object();
                String str = (String) arrayList4.get(0);
                if (str != null) {
                    obj6.f12368a = str;
                    obj6.f12369b = (String) arrayList4.get(1);
                    return obj6;
                }
                throw new IllegalStateException("Nonnull field \"code\" is null.");
            case -118:
                ArrayList arrayList5 = (ArrayList) e(byteBuffer);
                ?? obj7 = new Object();
                n nVar = (n) arrayList5.get(0);
                if (nVar != null) {
                    obj7.f12370a = nVar;
                    obj7.f12371b = (l) arrayList5.get(1);
                    List list = (List) arrayList5.get(2);
                    if (list != null) {
                        obj7.f12372c = list;
                        return obj7;
                    }
                    throw new IllegalStateException("Nonnull field \"paths\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            default:
                return super.f(b5, byteBuffer);
        }
    }

    @Override // L5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Object obj2 = null;
        if (obj instanceof u) {
            byteArrayOutputStream.write(129);
            if (obj != null) {
                obj2 = Integer.valueOf(((u) obj).index);
            }
            k(byteArrayOutputStream, obj2);
        } else if (obj instanceof w) {
            byteArrayOutputStream.write(130);
            if (obj != null) {
                obj2 = Integer.valueOf(((w) obj).index);
            }
            k(byteArrayOutputStream, obj2);
        } else if (obj instanceof n) {
            byteArrayOutputStream.write(131);
            if (obj != null) {
                obj2 = Integer.valueOf(((n) obj).index);
            }
            k(byteArrayOutputStream, obj2);
        } else if (obj instanceof p) {
            byteArrayOutputStream.write(132);
            p pVar = (p) obj;
            pVar.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(pVar.f12374a);
            arrayList.add(pVar.f12375b);
            arrayList.add(pVar.f12376c);
            k(byteArrayOutputStream, arrayList);
        } else if (obj instanceof r) {
            byteArrayOutputStream.write(133);
            r rVar = (r) obj;
            rVar.getClass();
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(rVar.f12379a);
            arrayList2.add(rVar.f12380b);
            arrayList2.add(rVar.f12381c);
            k(byteArrayOutputStream, arrayList2);
        } else if (obj instanceof s) {
            byteArrayOutputStream.write(134);
            s sVar = (s) obj;
            sVar.getClass();
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(sVar.f12382a);
            k(byteArrayOutputStream, arrayList3);
        } else if (obj instanceof x) {
            byteArrayOutputStream.write(135);
            x xVar = (x) obj;
            xVar.getClass();
            ArrayList arrayList4 = new ArrayList(1);
            arrayList4.add(xVar.f12386a);
            k(byteArrayOutputStream, arrayList4);
        } else if (obj instanceof v) {
            byteArrayOutputStream.write(136);
            v vVar = (v) obj;
            vVar.getClass();
            ArrayList arrayList5 = new ArrayList(2);
            arrayList5.add(vVar.f12384a);
            arrayList5.add(vVar.f12385b);
            k(byteArrayOutputStream, arrayList5);
        } else if (obj instanceof l) {
            byteArrayOutputStream.write(137);
            l lVar = (l) obj;
            lVar.getClass();
            ArrayList arrayList6 = new ArrayList(2);
            arrayList6.add(lVar.f12368a);
            arrayList6.add(lVar.f12369b);
            k(byteArrayOutputStream, arrayList6);
        } else if (obj instanceof m) {
            byteArrayOutputStream.write(138);
            m mVar = (m) obj;
            mVar.getClass();
            ArrayList arrayList7 = new ArrayList(3);
            arrayList7.add(mVar.f12370a);
            arrayList7.add(mVar.f12371b);
            arrayList7.add(mVar.f12372c);
            k(byteArrayOutputStream, arrayList7);
        } else {
            super.k(byteArrayOutputStream, obj);
        }
    }
}
