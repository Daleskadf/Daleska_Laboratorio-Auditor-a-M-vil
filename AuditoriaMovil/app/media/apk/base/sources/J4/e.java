package j4;

import android.util.Base64;
import android.util.JsonWriter;
import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import h4.InterfaceC1086f;
import h4.InterfaceC1087g;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class e implements InterfaceC1085e, InterfaceC1087g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13451a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f13452b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f13453c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f13454d;

    /* renamed from: e  reason: collision with root package name */
    public final C1368a f13455e;
    public final boolean f;

    public e(Writer writer, HashMap hashMap, HashMap hashMap2, C1368a c1368a, boolean z7) {
        this.f13452b = new JsonWriter(writer);
        this.f13453c = hashMap;
        this.f13454d = hashMap2;
        this.f13455e = c1368a;
        this.f = z7;
    }

    public final e a(Object obj) {
        int i7 = 0;
        JsonWriter jsonWriter = this.f13452b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                c();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i7 < length) {
                    jsonWriter.value(iArr[i7]);
                    i7++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i7 < length2) {
                    long j = jArr[i7];
                    c();
                    jsonWriter.value(j);
                    i7++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i7 < length3) {
                    jsonWriter.value(dArr[i7]);
                    i7++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i7 < length4) {
                    jsonWriter.value(zArr[i7]);
                    i7++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i7 < length5) {
                    a(numberArr[i7]);
                    i7++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i7 < length6) {
                    a(objArr[i7]);
                    i7++;
                }
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Collection) {
            jsonWriter.beginArray();
            for (Object obj2 : (Collection) obj) {
                a(obj2);
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    b(entry.getValue(), (String) key);
                } catch (ClassCastException e7) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e7);
                }
            }
            jsonWriter.endObject();
            return this;
        } else {
            InterfaceC1084d interfaceC1084d = (InterfaceC1084d) this.f13453c.get(obj.getClass());
            if (interfaceC1084d != null) {
                jsonWriter.beginObject();
                interfaceC1084d.encode(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC1086f interfaceC1086f = (InterfaceC1086f) this.f13454d.get(obj.getClass());
            if (interfaceC1086f != null) {
                interfaceC1086f.encode(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                c();
                jsonWriter.value(name);
                return this;
            } else {
                jsonWriter.beginObject();
                this.f13455e.encode(obj, this);
                throw null;
            }
        }
    }

    @Override // h4.InterfaceC1085e
    public final InterfaceC1085e add(C1083c c1083c, long j) {
        String str = c1083c.f11337a;
        c();
        JsonWriter jsonWriter = this.f13452b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(j);
        return this;
    }

    public final e b(Object obj, String str) {
        boolean z7 = this.f;
        JsonWriter jsonWriter = this.f13452b;
        if (z7) {
            if (obj != null) {
                c();
                jsonWriter.name(str);
                a(obj);
            }
            return this;
        }
        c();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            a(obj);
        }
        return this;
    }

    public final void c() {
        if (this.f13451a) {
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // h4.InterfaceC1085e
    public final InterfaceC1085e add(C1083c c1083c, Object obj) {
        b(obj, c1083c.f11337a);
        return this;
    }

    @Override // h4.InterfaceC1087g
    public final InterfaceC1087g add(String str) {
        c();
        this.f13452b.value(str);
        return this;
    }

    @Override // h4.InterfaceC1087g
    public final InterfaceC1087g add(boolean z7) {
        c();
        this.f13452b.value(z7);
        return this;
    }
}
