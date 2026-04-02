package T5;

import D.AbstractC0059i;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: T5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0342a implements H5.b {

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f5424a;

    /* renamed from: b  reason: collision with root package name */
    public final e5.b f5425b = new e5.b(10);

    public final Boolean a(String str, List list) {
        SharedPreferences.Editor edit = this.f5424a.edit();
        Map<String, ?> all = this.f5424a.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return Boolean.valueOf(edit.commit());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    public final HashMap b(String str, List list) {
        HashSet hashSet;
        Object obj;
        if (list == null) {
            hashSet = 0;
        } else {
            hashSet = new HashSet(list);
        }
        Map<String, ?> all = this.f5424a.getAll();
        HashMap hashMap = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                Object obj2 = all.get(str2);
                Objects.requireNonNull(obj2);
                boolean z7 = obj2 instanceof String;
                e5.b bVar = this.f5425b;
                if (z7) {
                    String str3 = (String) obj2;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            String substring = str3.substring(40);
                            bVar.getClass();
                            try {
                                obj2 = (List) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(substring, 0))).readObject();
                            } catch (IOException | ClassNotFoundException e7) {
                                throw new RuntimeException(e7);
                            }
                        }
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new BigInteger(str3.substring(44), 36);
                        obj2 = obj;
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = Double.valueOf(str3.substring(40));
                    }
                    hashMap.put(str2, obj2);
                } else {
                    if (obj2 instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj2);
                        SharedPreferences.Editor remove = this.f5424a.edit().remove(str2);
                        remove.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + bVar.p(arrayList)).apply();
                        obj = arrayList;
                        obj2 = obj;
                    }
                    hashMap.put(str2, obj2);
                }
            }
        }
        return hashMap;
    }

    public final Boolean c(String str, String str2) {
        if (!str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") && !str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return Boolean.valueOf(this.f5424a.edit().putString(str, str2).commit());
        }
        throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        L5.f fVar = aVar.f2030b;
        this.f5424a = aVar.f2029a.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            AbstractC0059i.R(fVar, this);
        } catch (Exception e7) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e7);
        }
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        AbstractC0059i.R(aVar.f2030b, null);
    }
}
