package a2;

import D.AbstractC0059i;
import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: a2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesC0444f implements SharedPreferences {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f6937a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f6938b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final String f6939c;

    /* renamed from: d  reason: collision with root package name */
    public final F3.a f6940d;

    /* renamed from: e  reason: collision with root package name */
    public final F3.d f6941e;

    public SharedPreferencesC0444f(String str, SharedPreferences sharedPreferences, F3.a aVar, F3.d dVar) {
        this.f6939c = str;
        this.f6937a = sharedPreferences;
        this.f6940d = aVar;
        this.f6941e = dVar;
    }

    public static boolean c(String str) {
        if (!"__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) && !"__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str)) {
            return false;
        }
        return true;
    }

    public final String a(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(S3.f.b(this.f6941e.a(str.getBytes(StandardCharsets.UTF_8), this.f6939c.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e7) {
                throw new AssertionError(e7);
            }
        } catch (GeneralSecurityException e8) {
            throw new SecurityException("Could not encrypt key. " + e8.getMessage(), e8);
        }
    }

    public final Object b(String str) {
        EnumC0441c enumC0441c;
        if (!c(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String a7 = a(str);
                String string = this.f6937a.getString(a7, null);
                if (string == null) {
                    return null;
                }
                byte[] a8 = S3.f.a(string);
                F3.a aVar = this.f6940d;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer wrap = ByteBuffer.wrap(aVar.b(a8, a7.getBytes(charset)));
                boolean z7 = false;
                wrap.position(0);
                int i7 = wrap.getInt();
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    if (i7 != 5) {
                                        enumC0441c = null;
                                    } else {
                                        enumC0441c = EnumC0441c.BOOLEAN;
                                    }
                                } else {
                                    enumC0441c = EnumC0441c.FLOAT;
                                }
                            } else {
                                enumC0441c = EnumC0441c.LONG;
                            }
                        } else {
                            enumC0441c = EnumC0441c.INT;
                        }
                    } else {
                        enumC0441c = EnumC0441c.STRING_SET;
                    }
                } else {
                    enumC0441c = EnumC0441c.STRING;
                }
                if (enumC0441c != null) {
                    switch (AbstractC0439a.f6932a[enumC0441c.ordinal()]) {
                        case 1:
                            int i8 = wrap.getInt();
                            ByteBuffer slice = wrap.slice();
                            wrap.limit(i8);
                            String charBuffer = charset.decode(slice).toString();
                            if (charBuffer.equals("__NULL__")) {
                                return null;
                            }
                            return charBuffer;
                        case 2:
                            return Integer.valueOf(wrap.getInt());
                        case 3:
                            return Long.valueOf(wrap.getLong());
                        case 4:
                            return Float.valueOf(wrap.getFloat());
                        case 5:
                            if (wrap.get() != 0) {
                                z7 = true;
                            }
                            return Boolean.valueOf(z7);
                        case 6:
                            S.g gVar = new S.g(0);
                            while (wrap.hasRemaining()) {
                                int i9 = wrap.getInt();
                                ByteBuffer slice2 = wrap.slice();
                                slice2.limit(i9);
                                wrap.position(wrap.position() + i9);
                                gVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                            }
                            if (gVar.f4825c == 1 && "__NULL__".equals(gVar.f4824b[0])) {
                                return null;
                            }
                            return gVar;
                        default:
                            throw new SecurityException("Unhandled type for encrypted pref value: " + enumC0441c);
                    }
                }
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i7);
            } catch (GeneralSecurityException e7) {
                throw new SecurityException("Could not decrypt value. " + e7.getMessage(), e7);
            }
        }
        throw new SecurityException(AbstractC0059i.z(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (!c(str)) {
            return this.f6937a.contains(a(str));
        }
        throw new SecurityException(AbstractC0059i.z(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferences$EditorC0440b(this, this.f6937a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f6937a.getAll().entrySet()) {
            if (!c(entry.getKey())) {
                try {
                    String str = new String(this.f6941e.b(S3.f.a(entry.getKey()), this.f6939c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, b(str));
                } catch (GeneralSecurityException e7) {
                    throw new SecurityException("Could not decrypt key. " + e7.getMessage(), e7);
                }
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z7) {
        Object b5 = b(str);
        if (b5 instanceof Boolean) {
            return ((Boolean) b5).booleanValue();
        }
        return z7;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object b5 = b(str);
        if (b5 instanceof Float) {
            return ((Float) b5).floatValue();
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i7) {
        Object b5 = b(str);
        if (b5 instanceof Integer) {
            return ((Integer) b5).intValue();
        }
        return i7;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object b5 = b(str);
        if (b5 instanceof Long) {
            return ((Long) b5).longValue();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object b5 = b(str);
        if (b5 instanceof String) {
            return (String) b5;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set gVar;
        Object b5 = b(str);
        if (b5 instanceof Set) {
            gVar = (Set) b5;
        } else {
            gVar = new S.g(0);
        }
        if (gVar.size() > 0) {
            return gVar;
        }
        return set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f6938b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f6938b.remove(onSharedPreferenceChangeListener);
    }
}
