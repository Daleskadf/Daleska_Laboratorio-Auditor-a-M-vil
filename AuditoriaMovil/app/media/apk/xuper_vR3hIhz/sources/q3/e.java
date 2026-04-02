package q3;

import a4.r;
import com.fasterxml.jackson.databind.ser.std.k;
import d4.h;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import k3.a0;
import k3.f;
import k3.j;
import n3.o;
/* loaded from: classes.dex */
public class e implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f18192c;

    /* renamed from: d  reason: collision with root package name */
    public static final Class f18193d;

    /* renamed from: e  reason: collision with root package name */
    public static final e f18194e;

    /* renamed from: a  reason: collision with root package name */
    public final Map f18195a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f18196b;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:6:0x0006
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            r0 = 0
            java.lang.Class<org.w3c.dom.Node> r1 = org.w3c.dom.Node.class
            java.lang.Class<org.w3c.dom.Document> r0 = org.w3c.dom.Document.class
            goto L7
        L6:
            r1 = r0
        L7:
            q3.e.f18192c = r1
            q3.e.f18193d = r0
            q3.a.a()     // Catch: java.lang.Throwable -> Le
        Le:
            q3.e r0 = new q3.e
            r0.<init>()
            q3.e.f18194e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.e.<clinit>():void");
    }

    public e() {
        HashMap hashMap = new HashMap();
        this.f18195a = hashMap;
        hashMap.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        hashMap.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap hashMap2 = new HashMap();
        this.f18196b = hashMap2;
        hashMap2.put("java.sql.Timestamp", k.f6693d);
        hashMap2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        hashMap2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        hashMap2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        hashMap2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    public final boolean a(Class cls, Class cls2) {
        if (cls2 != null && cls2.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    public k3.k b(j jVar, f fVar, k3.c cVar) {
        Object f10;
        Class q10 = jVar.q();
        if (a(q10, f18192c)) {
            return (k3.k) f("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer", jVar);
        }
        if (a(q10, f18193d)) {
            return (k3.k) f("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer", jVar);
        }
        String name = q10.getName();
        String str = (String) this.f18195a.get(name);
        if (str != null) {
            return (k3.k) f(str, jVar);
        }
        if ((!name.startsWith("javax.xml.") && !d(q10, "javax.xml.")) || (f10 = f("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers", jVar)) == null) {
            return null;
        }
        return ((o) f10).a(jVar, fVar, cVar);
    }

    public k3.o c(a0 a0Var, j jVar, k3.c cVar) {
        Object f10;
        Class q10 = jVar.q();
        if (a(q10, f18192c)) {
            return (k3.o) f("com.fasterxml.jackson.databind.ext.DOMSerializer", jVar);
        }
        String name = q10.getName();
        Object obj = this.f18196b.get(name);
        if (obj != null) {
            if (obj instanceof k3.o) {
                return (k3.o) obj;
            }
            return (k3.o) f((String) obj, jVar);
        } else if ((!name.startsWith("javax.xml.") && !d(q10, "javax.xml.")) || (f10 = f("com.fasterxml.jackson.databind.ext.CoreXMLSerializers", jVar)) == null) {
            return null;
        } else {
            return ((r) f10).c(a0Var, jVar, cVar);
        }
    }

    public final boolean d(Class cls, String str) {
        do {
            cls = cls.getSuperclass();
            if (cls == null || cls == Object.class) {
                return false;
            }
        } while (!cls.getName().startsWith(str));
        return true;
    }

    public final Object e(Class cls, j jVar) {
        try {
            return h.l(cls, false);
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to create instance of `" + cls.getName() + "` for handling values of type " + h.G(jVar) + ", problem: (" + th.getClass().getName() + ") " + th.getMessage());
        }
    }

    public final Object f(String str, j jVar) {
        try {
            return e(Class.forName(str), jVar);
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to find class `" + str + "` for handling values of type " + h.G(jVar) + ", problem: (" + th.getClass().getName() + ") " + th.getMessage());
        }
    }
}
