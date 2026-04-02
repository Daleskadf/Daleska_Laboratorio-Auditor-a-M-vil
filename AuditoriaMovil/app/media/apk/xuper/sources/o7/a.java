package o7;

import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: j  reason: collision with root package name */
    public static final String f17606j = "a";

    /* renamed from: a  reason: collision with root package name */
    public final d[] f17607a;

    /* renamed from: b  reason: collision with root package name */
    public final c f17608b;

    /* renamed from: c  reason: collision with root package name */
    public final s7.c f17609c;

    /* renamed from: d  reason: collision with root package name */
    public final r7.a f17610d;

    /* renamed from: e  reason: collision with root package name */
    public final e f17611e;

    /* renamed from: f  reason: collision with root package name */
    public volatile com.qiniu.android.dns.a f17612f;

    /* renamed from: g  reason: collision with root package name */
    public volatile int f17613g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f17614h;

    /* renamed from: i  reason: collision with root package name */
    public ConcurrentHashMap f17615i;

    /* loaded from: classes3.dex */
    public static class b implements e {
        public b() {
        }

        @Override // o7.e
        public String[] a(String[] strArr) {
            return strArr;
        }
    }

    public a(com.qiniu.android.dns.a aVar, d[] dVarArr, c cVar) {
        this(aVar, dVarArr, cVar, null);
    }

    public static String[] i(f[] fVarArr) {
        if (fVarArr == null || fVarArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (f fVar : fVarArr) {
            arrayList.add(fVar.f17620a);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void j(f[] fVarArr) {
        if (fVarArr != null && fVarArr.length > 1) {
            f fVar = fVarArr[0];
            System.arraycopy(fVarArr, 1, fVarArr, 0, fVarArr.length - 1);
            fVarArr[fVarArr.length - 1] = fVar;
        }
    }

    public static f[] k(f[] fVarArr) {
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (f fVar : fVarArr) {
            if (fVar != null && fVar.f17621b == 1) {
                arrayList.add(fVar);
            }
        }
        return (f[]) arrayList.toArray(new f[arrayList.size()]);
    }

    public static boolean l(String str) {
        if (str == null || str.length() < 7 || str.length() > 15 || str.contains(Operator.Operation.MINUS)) {
            return false;
        }
        try {
            int indexOf = str.indexOf(46);
            if (indexOf != -1 && Integer.parseInt(str.substring(0, indexOf)) > 255) {
                return false;
            }
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(46, i10);
            if (indexOf2 != -1 && Integer.parseInt(str.substring(i10, indexOf2)) > 255) {
                return false;
            }
            int i11 = indexOf2 + 1;
            int indexOf3 = str.indexOf(46, i11);
            if (indexOf3 != -1 && Integer.parseInt(str.substring(i11, indexOf3)) > 255 && Integer.parseInt(str.substring(indexOf3 + 1, str.length() - 1)) > 255) {
                if (str.charAt(str.length() - 1) != '.') {
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void a() {
        synchronized (this.f17609c) {
            this.f17609c.clear();
        }
    }

    public final synchronized Object b(String str) {
        Object obj = this.f17615i.get(str);
        if (obj == null) {
            Object obj2 = new Object();
            this.f17615i.put(str, obj2);
            return obj2;
        }
        return obj;
    }

    public final void c() {
        synchronized (this.f17607a) {
            if (!this.f17614h) {
                try {
                    s7.c load = this.f17608b.load();
                    if (load != null && load.size() != 0) {
                        synchronized (this.f17609c) {
                            this.f17609c.putAll(load);
                        }
                        this.f17614h = true;
                        return;
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                this.f17614h = true;
            }
        }
    }

    public void d(com.qiniu.android.dns.a aVar) {
        a();
        if (aVar == null) {
            aVar = com.qiniu.android.dns.a.f9006d;
        }
        this.f17612f = aVar;
        synchronized (this.f17607a) {
            this.f17613g = 0;
        }
    }

    public String[] e(String str) {
        return f(new o7.b(str));
    }

    public String[] f(o7.b bVar) {
        if (bVar != null) {
            String str = bVar.f17616a;
            if (str != null && str.trim().length() != 0) {
                if (l(bVar.f17616a)) {
                    return new String[]{bVar.f17616a};
                }
                String[] g10 = g(bVar);
                if (g10 != null && g10.length > 1) {
                    return this.f17611e.a(g10);
                }
                return g10;
            }
            throw new IOException("empty domain " + bVar.f17616a);
        }
        throw new IOException("null domain");
    }

    public final String[] g(o7.b bVar) {
        f[] h10 = h(bVar);
        if (h10 != null && h10.length != 0) {
            return i(h10);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bb, code lost:
        throw new java.net.UnknownHostException(r11.f17616a);
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049 A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x000a, B:5:0x000c, B:19:0x003d, B:23:0x0041, B:24:0x0044, B:26:0x0049, B:27:0x004d, B:34:0x0067, B:36:0x006a, B:37:0x006c, B:30:0x0057, B:32:0x0062, B:49:0x0088, B:52:0x008c, B:54:0x0093, B:55:0x0095, B:58:0x00a5, B:63:0x00aa, B:64:0x00b1, B:66:0x00b4, B:67:0x00bb, B:68:0x00bc, B:38:0x006d, B:40:0x0071, B:42:0x007d, B:43:0x007f, B:44:0x0080, B:56:0x0096, B:57:0x00a4, B:6:0x000d, B:8:0x0018, B:10:0x0024, B:12:0x0027, B:14:0x002f, B:16:0x0032, B:17:0x0035, B:18:0x003c, B:22:0x0040), top: B:79:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093 A[Catch: all -> 0x00c0, TryCatch #4 {, blocks: (B:4:0x000a, B:5:0x000c, B:19:0x003d, B:23:0x0041, B:24:0x0044, B:26:0x0049, B:27:0x004d, B:34:0x0067, B:36:0x006a, B:37:0x006c, B:30:0x0057, B:32:0x0062, B:49:0x0088, B:52:0x008c, B:54:0x0093, B:55:0x0095, B:58:0x00a5, B:63:0x00aa, B:64:0x00b1, B:66:0x00b4, B:67:0x00bb, B:68:0x00bc, B:38:0x006d, B:40:0x0071, B:42:0x007d, B:43:0x007f, B:44:0x0080, B:56:0x0096, B:57:0x00a4, B:6:0x000d, B:8:0x0018, B:10:0x0024, B:12:0x0027, B:14:0x002f, B:16:0x0032, B:17:0x0035, B:18:0x003c, B:22:0x0040), top: B:79:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa A[Catch: all -> 0x00c0, TryCatch #4 {, blocks: (B:4:0x000a, B:5:0x000c, B:19:0x003d, B:23:0x0041, B:24:0x0044, B:26:0x0049, B:27:0x004d, B:34:0x0067, B:36:0x006a, B:37:0x006c, B:30:0x0057, B:32:0x0062, B:49:0x0088, B:52:0x008c, B:54:0x0093, B:55:0x0095, B:58:0x00a5, B:63:0x00aa, B:64:0x00b1, B:66:0x00b4, B:67:0x00bb, B:68:0x00bc, B:38:0x006d, B:40:0x0071, B:42:0x007d, B:43:0x007f, B:44:0x0080, B:56:0x0096, B:57:0x00a4, B:6:0x000d, B:8:0x0018, B:10:0x0024, B:12:0x0027, B:14:0x002f, B:16:0x0032, B:17:0x0035, B:18:0x003c, B:22:0x0040), top: B:79:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0086 A[EDGE_INSN: B:80:0x0086->B:48:0x0086 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o7.f[] h(o7.b r11) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.a.h(o7.b):o7.f[]");
    }

    public a(com.qiniu.android.dns.a aVar, d[] dVarArr, c cVar, e eVar) {
        this.f17610d = new r7.a();
        this.f17612f = null;
        this.f17613g = 0;
        this.f17614h = false;
        this.f17615i = new ConcurrentHashMap(24);
        this.f17612f = aVar == null ? com.qiniu.android.dns.a.f9006d : aVar;
        this.f17607a = (d[]) dVarArr.clone();
        this.f17608b = cVar;
        this.f17609c = new s7.c();
        this.f17611e = eVar == null ? new b() : eVar;
    }
}
