package i2;

import D.C0066p;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import m6.AbstractC1446g;
import m6.p;
/* renamed from: i2.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1108h extends i {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11461a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11462b;

    /* renamed from: c  reason: collision with root package name */
    public final k f11463c;

    /* renamed from: d  reason: collision with root package name */
    public final C0066p f11464d;

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Throwable, D.p, java.lang.Exception] */
    public C1108h(Object value, String str, C1101a c1101a, k kVar) {
        Collection collection;
        kotlin.jvm.internal.j.e(value, "value");
        this.f11461a = value;
        this.f11462b = str;
        this.f11463c = kVar;
        String message = i.b(value, str);
        kotlin.jvm.internal.j.e(message, "message");
        ?? exc = new Exception(message);
        StackTraceElement[] stackTrace = exc.getStackTrace();
        kotlin.jvm.internal.j.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length >= 0) {
            if (length == 0) {
                collection = p.f14074a;
            } else {
                int length2 = stackTrace.length;
                if (length >= length2) {
                    collection = AbstractC1446g.R(stackTrace);
                } else if (length == 1) {
                    collection = G.i.A(stackTrace[length2 - 1]);
                } else {
                    ArrayList arrayList = new ArrayList(length);
                    for (int i7 = length2 - length; i7 < length2; i7++) {
                        arrayList.add(stackTrace[i7]);
                    }
                    collection = arrayList;
                }
            }
            exc.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
            this.f11464d = exc;
            return;
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.f("Requested element count ", length, " is less than zero.").toString());
    }

    @Override // i2.i
    public final Object a() {
        int i7 = AbstractC1107g.f11460a[this.f11463c.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    throw new RuntimeException();
                }
                return null;
            }
            String message = i.b(this.f11461a, this.f11462b);
            kotlin.jvm.internal.j.e(message, "message");
            Log.d("f", message);
            return null;
        }
        throw this.f11464d;
    }

    @Override // i2.i
    public final i d(String str, w6.l lVar) {
        return this;
    }
}
