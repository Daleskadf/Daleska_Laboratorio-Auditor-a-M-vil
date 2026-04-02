package a2;

import D.AbstractC0059i;
import android.content.SharedPreferences;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: a2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferences$EditorC0440b implements SharedPreferences.Editor {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferencesC0444f f6933a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences.Editor f6934b;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f6936d = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f6935c = new CopyOnWriteArrayList();

    public SharedPreferences$EditorC0440b(SharedPreferencesC0444f sharedPreferencesC0444f, SharedPreferences.Editor editor) {
        this.f6933a = sharedPreferencesC0444f;
        this.f6934b = editor;
    }

    public final void a() {
        if (this.f6936d.getAndSet(false)) {
            SharedPreferencesC0444f sharedPreferencesC0444f = this.f6933a;
            for (String str : ((HashMap) sharedPreferencesC0444f.getAll()).keySet()) {
                if (!this.f6935c.contains(str) && !SharedPreferencesC0444f.c(str)) {
                    this.f6934b.remove(sharedPreferencesC0444f.a(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        a();
        this.f6934b.apply();
        b();
        this.f6935c.clear();
    }

    public final void b() {
        SharedPreferencesC0444f sharedPreferencesC0444f = this.f6933a;
        Iterator it = sharedPreferencesC0444f.f6938b.iterator();
        while (it.hasNext()) {
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
            Iterator it2 = this.f6935c.iterator();
            while (it2.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC0444f, (String) it2.next());
            }
        }
    }

    public final void c(String str, byte[] bArr) {
        SharedPreferencesC0444f sharedPreferencesC0444f = this.f6933a;
        sharedPreferencesC0444f.getClass();
        if (!SharedPreferencesC0444f.c(str)) {
            this.f6935c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String a7 = sharedPreferencesC0444f.a(str);
                try {
                    Pair pair = new Pair(a7, new String(S3.f.b(sharedPreferencesC0444f.f6940d.a(bArr, a7.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                    this.f6934b.putString((String) pair.first, (String) pair.second);
                    return;
                } catch (UnsupportedEncodingException e7) {
                    throw new AssertionError(e7);
                }
            } catch (GeneralSecurityException e8) {
                throw new SecurityException("Could not encrypt data: " + e8.getMessage(), e8);
            }
        }
        throw new SecurityException(AbstractC0059i.z(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f6936d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6935c;
        a();
        try {
            return this.f6934b.commit();
        } finally {
            b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z7) {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.putInt(EnumC0441c.BOOLEAN.a());
        allocate.put(z7 ? (byte) 1 : (byte) 0);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(EnumC0441c.FLOAT.a());
        allocate.putFloat(f);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i7) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(EnumC0441c.INT.a());
        allocate.putInt(i7);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.putInt(EnumC0441c.LONG.a());
        allocate.putLong(j);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer allocate = ByteBuffer.allocate(length + 8);
        allocate.putInt(EnumC0441c.STRING.a());
        allocate.putInt(length);
        allocate.put(bytes);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new S.g(0);
            set.add("__NULL__");
        }
        ArrayList arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        for (String str2 : set) {
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(size + 4);
        allocate.putInt(EnumC0441c.STRING_SET.a());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        SharedPreferencesC0444f sharedPreferencesC0444f = this.f6933a;
        sharedPreferencesC0444f.getClass();
        if (!SharedPreferencesC0444f.c(str)) {
            this.f6934b.remove(sharedPreferencesC0444f.a(str));
            this.f6935c.add(str);
            return this;
        }
        throw new SecurityException(AbstractC0059i.z(str, " is a reserved key for the encryption keyset."));
    }
}
