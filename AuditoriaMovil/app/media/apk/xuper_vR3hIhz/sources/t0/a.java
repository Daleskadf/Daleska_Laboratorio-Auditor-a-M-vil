package t0;
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final String f18787a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f18788b;

    public a(String str, Object[] objArr) {
        this.f18787a = str;
        this.f18788b = objArr;
    }

    public static void c(d dVar, int i10, Object obj) {
        long j10;
        if (obj == null) {
            dVar.bindNull(i10);
        } else if (obj instanceof byte[]) {
            dVar.bindBlob(i10, (byte[]) obj);
        } else if (obj instanceof Float) {
            dVar.bindDouble(i10, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            dVar.bindDouble(i10, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            dVar.bindLong(i10, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            dVar.bindLong(i10, ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            dVar.bindLong(i10, ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            dVar.bindLong(i10, ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            dVar.bindString(i10, (String) obj);
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                j10 = 1;
            } else {
                j10 = 0;
            }
            dVar.bindLong(i10, j10);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
        }
    }

    public static void d(d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            c(dVar, i10, obj);
        }
    }

    @Override // t0.e
    public void a(d dVar) {
        d(dVar, this.f18788b);
    }

    @Override // t0.e
    public String b() {
        return this.f18787a;
    }

    public a(String str) {
        this(str, null);
    }
}
