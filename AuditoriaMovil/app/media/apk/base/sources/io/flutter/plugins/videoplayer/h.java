package io.flutter.plugins.videoplayer;

import L5.x;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class h extends x {

    /* renamed from: d  reason: collision with root package name */
    public static final h f12412d = new Object();

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, io.flutter.plugins.videoplayer.i] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, io.flutter.plugins.videoplayer.g] */
    @Override // L5.x
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        switch (b5) {
            case -127:
                Object e7 = e(byteBuffer);
                if (e7 == null) {
                    return null;
                }
                return j.values()[((Long) e7).intValue()];
            case -126:
                ?? obj = new Object();
                Long l8 = (Long) ((ArrayList) e(byteBuffer)).get(0);
                if (l8 != null) {
                    obj.f12413a = l8;
                    return obj;
                }
                throw new IllegalStateException("Nonnull field \"playerId\" is null.");
            case -125:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                ?? obj2 = new Object();
                obj2.f12407a = (String) arrayList.get(0);
                obj2.f12408b = (String) arrayList.get(1);
                obj2.f12409c = (String) arrayList.get(2);
                obj2.f12410d = (String) arrayList.get(3);
                Map map = (Map) arrayList.get(4);
                if (map != null) {
                    obj2.f12411e = map;
                    obj2.f = (j) arrayList.get(5);
                    return obj2;
                }
                throw new IllegalStateException("Nonnull field \"httpHeaders\" is null.");
            default:
                return super.f(b5, byteBuffer);
        }
    }

    @Override // L5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Object valueOf;
        if (obj instanceof j) {
            byteArrayOutputStream.write(129);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(((j) obj).index);
            }
            k(byteArrayOutputStream, valueOf);
        } else if (obj instanceof i) {
            byteArrayOutputStream.write(130);
            i iVar = (i) obj;
            iVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(iVar.f12413a);
            k(byteArrayOutputStream, arrayList);
        } else if (obj instanceof g) {
            byteArrayOutputStream.write(131);
            g gVar = (g) obj;
            gVar.getClass();
            ArrayList arrayList2 = new ArrayList(6);
            arrayList2.add(gVar.f12407a);
            arrayList2.add(gVar.f12408b);
            arrayList2.add(gVar.f12409c);
            arrayList2.add(gVar.f12410d);
            arrayList2.add(gVar.f12411e);
            arrayList2.add(gVar.f);
            k(byteArrayOutputStream, arrayList2);
        } else {
            super.k(byteArrayOutputStream, obj);
        }
    }
}
