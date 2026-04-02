package T5;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import m6.AbstractC1448i;
/* renamed from: T5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343b extends L5.x {

    /* renamed from: e  reason: collision with root package name */
    public static final C0343b f5426e = new C0343b(0);

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5427d;

    public /* synthetic */ C0343b(int i7) {
        this.f5427d = i7;
    }

    @Override // L5.x
    public Object f(byte b5, ByteBuffer buffer) {
        List list;
        List list2;
        N[] values;
        switch (this.f5427d) {
            case 1:
                kotlin.jvm.internal.j.e(buffer, "buffer");
                if (b5 == -127) {
                    Long l8 = (Long) e(buffer);
                    if (l8 == null) {
                        return null;
                    }
                    int longValue = (int) l8.longValue();
                    N.Companion.getClass();
                    for (N n7 : N.values()) {
                        if (n7.a() == longValue) {
                            return n7;
                        }
                    }
                    return null;
                } else if (b5 == -126) {
                    Object e7 = e(buffer);
                    if (e7 instanceof List) {
                        list2 = (List) e7;
                    } else {
                        list2 = null;
                    }
                    if (list2 == null) {
                        return null;
                    }
                    Object obj = list2.get(1);
                    kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    return new C0349h((String) list2.get(0), ((Boolean) obj).booleanValue());
                } else if (b5 == -125) {
                    Object e8 = e(buffer);
                    if (e8 instanceof List) {
                        list = (List) e8;
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        return null;
                    }
                    Object obj2 = list.get(1);
                    kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                    return new P((String) list.get(0), (N) obj2);
                } else {
                    return super.f(b5, buffer);
                }
            default:
                return super.f(b5, buffer);
        }
    }

    @Override // L5.x
    public void k(ByteArrayOutputStream stream, Object obj) {
        switch (this.f5427d) {
            case 1:
                kotlin.jvm.internal.j.e(stream, "stream");
                if (obj instanceof N) {
                    stream.write(129);
                    k(stream, Integer.valueOf(((N) obj).a()));
                    return;
                } else if (obj instanceof C0349h) {
                    stream.write(130);
                    C0349h c0349h = (C0349h) obj;
                    k(stream, AbstractC1448i.L(c0349h.f5436a, Boolean.valueOf(c0349h.f5437b)));
                    return;
                } else if (obj instanceof P) {
                    stream.write(131);
                    P p7 = (P) obj;
                    k(stream, AbstractC1448i.L(p7.f5422a, p7.f5423b));
                    return;
                } else {
                    super.k(stream, obj);
                    return;
                }
            default:
                super.k(stream, obj);
                return;
        }
    }
}
