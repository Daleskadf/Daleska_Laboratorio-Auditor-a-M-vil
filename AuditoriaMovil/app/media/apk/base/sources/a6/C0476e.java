package a6;

import D.AbstractC0055e;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
/* renamed from: a6.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0476e {

    /* renamed from: i  reason: collision with root package name */
    public static final C0476e f7131i;

    /* renamed from: a  reason: collision with root package name */
    public final C0490t f7132a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f7133b;

    /* renamed from: c  reason: collision with root package name */
    public final t4.k f7134c;

    /* renamed from: d  reason: collision with root package name */
    public final Object[][] f7135d;

    /* renamed from: e  reason: collision with root package name */
    public final List f7136e;
    public final Boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f7137g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f7138h;

    /* JADX WARN: Type inference failed for: r0v0, types: [a6.c, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f7124d = (Object[][]) Array.newInstance(Object.class, 0, 2);
        obj.f7125e = Collections.emptyList();
        f7131i = new C0476e(obj);
    }

    public C0476e(C0474c c0474c) {
        this.f7132a = c0474c.f7121a;
        this.f7133b = c0474c.f7122b;
        this.f7134c = c0474c.f7123c;
        this.f7135d = c0474c.f7124d;
        this.f7136e = c0474c.f7125e;
        this.f = c0474c.f;
        this.f7137g = c0474c.f7126g;
        this.f7138h = c0474c.f7127h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a6.c, java.lang.Object] */
    public static C0474c b(C0476e c0476e) {
        ?? obj = new Object();
        obj.f7121a = c0476e.f7132a;
        obj.f7122b = c0476e.f7133b;
        obj.f7123c = c0476e.f7134c;
        obj.f7124d = c0476e.f7135d;
        obj.f7125e = c0476e.f7136e;
        obj.f = c0476e.f;
        obj.f7126g = c0476e.f7137g;
        obj.f7127h = c0476e.f7138h;
        return obj;
    }

    public final Object a(C0475d c0475d) {
        G.i.j(c0475d, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        int i7 = 0;
        while (true) {
            Object[][] objArr = this.f7135d;
            if (i7 < objArr.length) {
                if (c0475d.equals(objArr[i7][0])) {
                    return objArr[i7][1];
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    public final C0476e c(C0475d c0475d, Object obj) {
        Object[][] objArr;
        int i7;
        G.i.j(c0475d, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        G.i.j(obj, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        C0474c b5 = b(this);
        int i8 = 0;
        while (true) {
            objArr = this.f7135d;
            if (i8 < objArr.length) {
                if (c0475d.equals(objArr[i8][0])) {
                    break;
                }
                i8++;
            } else {
                i8 = -1;
                break;
            }
        }
        int length = objArr.length;
        if (i8 == -1) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, length + i7, 2);
        b5.f7124d = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        if (i8 == -1) {
            Object[][] objArr3 = b5.f7124d;
            int length2 = objArr.length;
            Object[] objArr4 = new Object[2];
            objArr4[0] = c0475d;
            objArr4[1] = obj;
            objArr3[length2] = objArr4;
        } else {
            Object[][] objArr5 = b5.f7124d;
            Object[] objArr6 = new Object[2];
            objArr6[0] = c0475d;
            objArr6[1] = obj;
            objArr5[i8] = objArr6;
        }
        return new C0476e(b5);
    }

    public final String toString() {
        Class<?> cls;
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f7132a, "deadline");
        C7.a(null, "authority");
        C7.a(this.f7134c, "callCredentials");
        Executor executor = this.f7133b;
        if (executor != null) {
            cls = executor.getClass();
        } else {
            cls = null;
        }
        C7.a(cls, "executor");
        C7.a(null, "compressorName");
        C7.a(Arrays.deepToString(this.f7135d), "customOptions");
        C7.c("waitForReady", Boolean.TRUE.equals(this.f));
        C7.a(this.f7137g, "maxInboundMessageSize");
        C7.a(this.f7138h, "maxOutboundMessageSize");
        C7.a(this.f7136e, "streamTracerFactories");
        return C7.toString();
    }
}
