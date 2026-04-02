package J2;

import android.database.Cursor;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final /* synthetic */ class f implements g, F2.b {

    /* renamed from: b  reason: collision with root package name */
    public static final f f2404b = new f(0);

    /* renamed from: c  reason: collision with root package name */
    public static final f f2405c = new f(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2406a;

    public /* synthetic */ f(int i7) {
        this.f2406a = i7;
    }

    @Override // J2.g
    public Object apply(Object obj) {
        byte[] decode;
        Cursor cursor = (Cursor) obj;
        switch (this.f2406a) {
            case 0:
                A2.b bVar = i.f2409e;
                ArrayList arrayList = new ArrayList();
                int i7 = 0;
                while (cursor.moveToNext()) {
                    byte[] blob = cursor.getBlob(0);
                    arrayList.add(blob);
                    i7 += blob.length;
                }
                byte[] bArr = new byte[i7];
                int i8 = 0;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    byte[] bArr2 = (byte[]) arrayList.get(i9);
                    System.arraycopy(bArr2, 0, bArr, i8, bArr2.length);
                    i8 += bArr2.length;
                }
                return bArr;
            default:
                A2.b bVar2 = i.f2409e;
                ArrayList arrayList2 = new ArrayList();
                while (cursor.moveToNext()) {
                    V2.k a7 = D2.b.a();
                    String string = cursor.getString(1);
                    if (string != null) {
                        a7.f5965b = string;
                        a7.f5967d = M2.a.b(cursor.getInt(2));
                        String string2 = cursor.getString(3);
                        if (string2 == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string2, 0);
                        }
                        a7.f5966c = decode;
                        arrayList2.add(a7.a());
                    } else {
                        throw new NullPointerException("Null backendName");
                    }
                }
                return arrayList2;
        }
    }

    @Override // k6.InterfaceC1408a
    public Object get() {
        List list = l.f2419c;
        return 4;
    }
}
