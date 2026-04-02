package m4;

import H4.n1;
import H4.p1;
import a6.t0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import n4.C1513B;
import n4.C1517c;
import n4.D;
import n4.EnumC1512A;
import n4.EnumC1514C;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.json.JSONArray;
import org.json.JSONObject;
import q4.k;
import q4.n;
import q4.o;
import q4.p;
import q4.q;
/* loaded from: classes.dex */
public final class f {
    public static final Charset f = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final t0 f14035a;

    /* renamed from: b  reason: collision with root package name */
    public final ByteArrayInputStream f14036b;

    /* renamed from: c  reason: collision with root package name */
    public e f14037c;

    /* renamed from: d  reason: collision with root package name */
    public final ByteBuffer f14038d;

    /* renamed from: e  reason: collision with root package name */
    public long f14039e;

    public f(t0 t0Var, ByteArrayInputStream byteArrayInputStream) {
        this.f14035a = t0Var;
        this.f14036b = byteArrayInputStream;
        new InputStreamReader(byteArrayInputStream);
        ByteBuffer allocate = ByteBuffer.allocate(RecognitionOptions.UPC_E);
        this.f14038d = allocate;
        allocate.flip();
    }

    public final void a(String str) {
        this.f14036b.close();
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.h("Invalid bundle: ", str));
    }

    public final boolean b() {
        boolean z7;
        ByteBuffer byteBuffer = this.f14038d;
        byteBuffer.compact();
        int read = this.f14036b.read(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        if (read > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            byteBuffer.position(byteBuffer.position() + read);
        }
        byteBuffer.flip();
        return z7;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [m4.b, java.lang.Object] */
    public final c c() {
        ByteBuffer byteBuffer;
        int i7;
        String charBuffer;
        c cVar;
        String str;
        p pVar;
        boolean z7;
        C1517c c1517c;
        C1517c c1517c2;
        int optInt;
        EnumC1514C enumC1514C;
        EnumC1512A enumC1512A;
        do {
            byteBuffer = this.f14038d;
            byteBuffer.mark();
            i7 = 0;
            while (true) {
                try {
                    if (i7 < byteBuffer.remaining()) {
                        if (byteBuffer.get() == 123) {
                            break;
                        }
                        i7++;
                    } else {
                        byteBuffer.reset();
                        i7 = -1;
                        break;
                    }
                } finally {
                    byteBuffer.reset();
                }
            }
            if (i7 != -1) {
                break;
            }
        } while (b());
        int remaining = byteBuffer.remaining();
        Charset charset = f;
        if (remaining == 0) {
            charBuffer = null;
        } else if (i7 != -1) {
            byte[] bArr = new byte[i7];
            byteBuffer.get(bArr);
            charBuffer = charset.decode(ByteBuffer.wrap(bArr)).toString();
        } else {
            a("Reached the end of bundle when a length string is expected.");
            throw null;
        }
        if (charBuffer == null) {
            return null;
        }
        int parseInt = Integer.parseInt(charBuffer);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i8 = parseInt;
        while (i8 > 0) {
            if (byteBuffer.remaining() == 0 && !b()) {
                a("Reached the end of bundle when more data was expected.");
                throw null;
            }
            int min = Math.min(i8, byteBuffer.remaining());
            byteArrayOutputStream.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), min);
            byteBuffer.position(byteBuffer.position() + min);
            i8 -= min;
        }
        String byteArrayOutputStream2 = byteArrayOutputStream.toString(charset.name());
        this.f14039e += charBuffer.getBytes(charset).length + parseInt;
        JSONObject jSONObject = new JSONObject(byteArrayOutputStream2);
        boolean has = jSONObject.has(ExternalParsersConfigReaderMetKeys.METADATA_TAG);
        t0 t0Var = this.f14035a;
        if (has) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(ExternalParsersConfigReaderMetKeys.METADATA_TAG);
            t0Var.getClass();
            e eVar = new e(jSONObject2.getString("id"), jSONObject2.getInt("version"), new q(t0Var.x(jSONObject2.get("createTime"))), jSONObject2.getInt("totalDocuments"), jSONObject2.getLong("totalBytes"));
            u4.q.a("BundleElement", "BundleMetadata element loaded", new Object[0]);
            return eVar;
        }
        if (jSONObject.has("namedQuery")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("namedQuery");
            t0Var.getClass();
            String string = jSONObject3.getString("name");
            JSONObject jSONObject4 = jSONObject3.getJSONObject("bundledQuery");
            JSONObject jSONObject5 = jSONObject4.getJSONObject("structuredQuery");
            if (!jSONObject5.has("select")) {
                p v6 = t0Var.v(jSONObject4.getString("parent"));
                JSONArray jSONArray = jSONObject5.getJSONArray("from");
                if (jSONArray.length() == 1) {
                    JSONObject jSONObject6 = jSONArray.getJSONObject(0);
                    if (jSONObject6.optBoolean("allDescendants", false)) {
                        pVar = v6;
                        str = jSONObject6.getString("collectionId");
                    } else {
                        str = null;
                        pVar = (p) v6.a(jSONObject6.getString("collectionId"));
                    }
                    JSONObject optJSONObject = jSONObject5.optJSONObject("where");
                    ArrayList arrayList = new ArrayList();
                    if (optJSONObject != null) {
                        t0Var.t(arrayList, optJSONObject);
                    }
                    JSONArray optJSONArray = jSONObject5.optJSONArray("orderBy");
                    ArrayList arrayList2 = new ArrayList();
                    if (optJSONArray != null) {
                        for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                            JSONObject jSONObject7 = optJSONArray.getJSONObject(i9);
                            k l8 = k.l(jSONObject7.getJSONObject("field").getString("fieldPath"));
                            if (jSONObject7.optString("direction", "ASCENDING").equals("ASCENDING")) {
                                enumC1512A = EnumC1512A.ASCENDING;
                            } else {
                                enumC1512A = EnumC1512A.DESCENDING;
                            }
                            arrayList2.add(new C1513B(enumC1512A, l8));
                        }
                    }
                    JSONObject optJSONObject2 = jSONObject5.optJSONObject("startAt");
                    if (optJSONObject2 != null) {
                        z7 = false;
                        c1517c = new C1517c(t0Var.w(optJSONObject2), optJSONObject2.optBoolean("before", false));
                    } else {
                        z7 = false;
                        c1517c = null;
                    }
                    JSONObject optJSONObject3 = jSONObject5.optJSONObject("endAt");
                    if (optJSONObject3 != null) {
                        c1517c2 = new C1517c(t0Var.w(optJSONObject3), !optJSONObject3.optBoolean("before", z7));
                    } else {
                        c1517c2 = null;
                    }
                    if (!jSONObject5.has(MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR)) {
                        JSONObject optJSONObject4 = jSONObject5.optJSONObject("limit");
                        if (optJSONObject4 != null) {
                            optInt = optJSONObject4.optInt(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, -1);
                        } else {
                            optInt = jSONObject5.optInt("limit", -1);
                        }
                        String optString = jSONObject4.optString("limitType", "FIRST");
                        if (optString.equals("FIRST")) {
                            enumC1514C = EnumC1514C.LIMIT_TO_FIRST;
                        } else if (optString.equals("LAST")) {
                            enumC1514C = EnumC1514C.LIMIT_TO_LAST;
                        } else {
                            throw new IllegalArgumentException("Invalid limit type for bundle query: ".concat(optString));
                        }
                        c iVar = new i(string, new h(new D(pVar, str, arrayList, arrayList2, optInt, EnumC1514C.LIMIT_TO_FIRST, c1517c, c1517c2).i(), enumC1514C), new q(t0Var.x(jSONObject3.get("readTime"))));
                        u4.q.a("BundleElement", io.flutter.plugins.pathprovider.b.h("Query loaded: ", string), new Object[0]);
                        cVar = iVar;
                    } else {
                        throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
                    }
                } else {
                    throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
                }
            } else {
                throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
            }
        } else if (jSONObject.has("documentMetadata")) {
            JSONObject jSONObject8 = jSONObject.getJSONObject("documentMetadata");
            t0Var.getClass();
            q4.h hVar = new q4.h(t0Var.v(jSONObject8.getString("name")));
            q qVar = new q(t0Var.x(jSONObject8.get("readTime")));
            boolean optBoolean = jSONObject8.optBoolean("exists", false);
            JSONArray optJSONArray2 = jSONObject8.optJSONArray("queries");
            ArrayList arrayList3 = new ArrayList();
            if (optJSONArray2 != null) {
                for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                    arrayList3.add(optJSONArray2.getString(i10));
                }
            }
            c gVar = new g(hVar, qVar, optBoolean, arrayList3);
            u4.q.a("BundleElement", "Document metadata loaded: " + hVar, new Object[0]);
            cVar = gVar;
        } else if (jSONObject.has("document")) {
            JSONObject jSONObject9 = jSONObject.getJSONObject("document");
            t0Var.getClass();
            q4.h hVar2 = new q4.h(t0Var.v(jSONObject9.getString("name")));
            q qVar2 = new q(t0Var.x(jSONObject9.get("updateTime")));
            n1 T7 = p1.T();
            t0Var.u(T7, jSONObject9.getJSONObject("fields"));
            o e7 = o.e(((p1) T7.f10006b).N().y());
            n nVar = new n(hVar2);
            nVar.a(qVar2, e7);
            ?? obj = new Object();
            obj.f14023a = nVar;
            u4.q.a("BundleElement", "Document loaded: " + hVar2, new Object[0]);
            cVar = obj;
        } else {
            a("Cannot decode unknown Bundle element: " + byteArrayOutputStream2);
            throw null;
        }
        return cVar;
    }
}
