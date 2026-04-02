package q3;

import G3.AbstractC0113a;
import a2.EnumC0442d;
import a2.EnumC0443e;
import a2.SharedPreferences$EditorC0440b;
import a2.SharedPreferencesC0444f;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.A;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e0.C0927b;
import io.flutter.plugins.googlemaps.C1177j;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStore;
import java.security.ProviderException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import org.apache.tika.utils.StringUtils;
import p.Y0;
import p4.P;
import r3.AbstractC1740d;
import r3.C1743g;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15329a;

    /* renamed from: b  reason: collision with root package name */
    public Object f15330b;

    /* renamed from: c  reason: collision with root package name */
    public Object f15331c;

    /* renamed from: d  reason: collision with root package name */
    public Object f15332d;

    /* renamed from: e  reason: collision with root package name */
    public Object f15333e;
    public Object f;

    /* renamed from: g  reason: collision with root package name */
    public Object f15334g;

    /* renamed from: h  reason: collision with root package name */
    public Object f15335h;

    /* renamed from: i  reason: collision with root package name */
    public Serializable f15336i;

    public k(f fVar, Context context, GoogleMapOptions googleMapOptions) {
        this.f15333e = new C0927b(this);
        this.f15336i = new ArrayList();
        this.f15334g = fVar;
        this.f15329a = context;
        this.f15335h = googleMapOptions;
    }

    public static void i(f fVar) {
        W2.e eVar = W2.e.f6170d;
        Context context = fVar.getContext();
        int d7 = eVar.d(context, W2.f.f6171a);
        String c8 = A.c(context, d7);
        String b5 = A.b(context, d7);
        LinearLayout linearLayout = new LinearLayout(fVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        fVar.addView(linearLayout);
        TextView textView = new TextView(fVar.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c8);
        linearLayout.addView(textView);
        Intent b7 = eVar.b(d7, context, null);
        if (b7 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b5);
            linearLayout.addView(button);
            button.setOnClickListener(new i3.d(context, b7));
        }
    }

    public void a(SharedPreferences sharedPreferences, SharedPreferencesC0444f sharedPreferencesC0444f) {
        try {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains((String) this.f15331c)) {
                    String b5 = b((String) value);
                    SharedPreferences$EditorC0440b sharedPreferences$EditorC0440b = (SharedPreferences$EditorC0440b) sharedPreferencesC0444f.edit();
                    sharedPreferences$EditorC0440b.putString(key, b5);
                    sharedPreferences$EditorC0440b.apply();
                    sharedPreferences.edit().remove(key).apply();
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            ((com.it_nomads.fluttersecurestorage.ciphers.f) this.f15335h).getClass();
            edit.remove("FlutterSecureSAlgorithmKey");
            edit.remove("FlutterSecureSAlgorithmStorage");
            edit.apply();
        } catch (Exception e7) {
            Log.e("SecureStorageAndroid", "Data migration failed", e7);
        }
    }

    public String b(String str) {
        if (str == null) {
            return null;
        }
        byte[] decode = Base64.decode(str, 0);
        R1.j jVar = (R1.j) this.f15334g;
        int w02 = jVar.w0();
        byte[] bArr = new byte[w02];
        System.arraycopy(decode, 0, bArr, 0, w02);
        AlgorithmParameterSpec y02 = jVar.y0(bArr);
        int length = decode.length - jVar.w0();
        byte[] bArr2 = new byte[length];
        System.arraycopy(decode, w02, bArr2, 0, length);
        Cipher cipher = (Cipher) jVar.f4682b;
        cipher.init(2, (Key) jVar.f4684d, y02);
        return new String(cipher.doFinal(bArr2), (Charset) this.f15330b);
    }

    public void c() {
        d();
        Context context = this.f15329a;
        SharedPreferences sharedPreferences = context.getSharedPreferences((String) this.f15333e, 0);
        if (((R1.j) this.f15334g) == null) {
            try {
                f(sharedPreferences);
            } catch (Exception e7) {
                Log.e("SecureStorageAndroid", "StorageCipher initialization failed", e7);
            }
        }
        if (e()) {
            try {
                SharedPreferencesC0444f g3 = g(context);
                this.f = g3;
                a(sharedPreferences, g3);
                return;
            } catch (Exception e8) {
                Log.e("SecureStorageAndroid", "EncryptedSharedPreferences initialization failed", e8);
                this.f = sharedPreferences;
                this.f15336i = Boolean.TRUE;
                return;
            }
        }
        this.f = sharedPreferences;
    }

    public void d() {
        if (((Map) this.f15332d).containsKey("sharedPreferencesName") && !((String) ((Map) this.f15332d).get("sharedPreferencesName")).isEmpty()) {
            this.f15333e = (String) ((Map) this.f15332d).get("sharedPreferencesName");
        }
        if (((Map) this.f15332d).containsKey("preferencesKeyPrefix") && !((String) ((Map) this.f15332d).get("preferencesKeyPrefix")).isEmpty()) {
            this.f15331c = (String) ((Map) this.f15332d).get("preferencesKeyPrefix");
        }
    }

    public boolean e() {
        if (((Boolean) this.f15336i).booleanValue() || !((Map) this.f15332d).containsKey("encryptedSharedPreferences") || !((Map) this.f15332d).get("encryptedSharedPreferences").equals("true")) {
            return false;
        }
        return true;
    }

    public void f(SharedPreferences sharedPreferences) {
        this.f15335h = new com.it_nomads.fluttersecurestorage.ciphers.f(sharedPreferences, (Map) this.f15332d);
        boolean e7 = e();
        Context context = this.f15329a;
        if (e7) {
            this.f15334g = ((com.it_nomads.fluttersecurestorage.ciphers.f) this.f15335h).b(context);
            return;
        }
        com.it_nomads.fluttersecurestorage.ciphers.f fVar = (com.it_nomads.fluttersecurestorage.ciphers.f) this.f15335h;
        com.it_nomads.fluttersecurestorage.ciphers.a aVar = fVar.f10153a;
        com.it_nomads.fluttersecurestorage.ciphers.e eVar = fVar.f10156d;
        com.it_nomads.fluttersecurestorage.ciphers.a aVar2 = fVar.f10155c;
        if (aVar == aVar2 && fVar.f10154b == eVar) {
            this.f15334g = fVar.a(context);
            return;
        }
        try {
            this.f15334g = fVar.b(context);
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains((String) this.f15331c)) {
                    hashMap.put(key, b((String) value));
                }
            }
            this.f15334g = fVar.a(context);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                edit.putString((String) entry2.getKey(), Base64.encodeToString(((R1.j) this.f15334g).m0(((String) entry2.getValue()).getBytes((Charset) this.f15330b)), 0));
            }
            edit.putString("FlutterSecureSAlgorithmKey", aVar2.name());
            edit.putString("FlutterSecureSAlgorithmStorage", eVar.name());
            edit.apply();
        } catch (Exception e8) {
            Log.e("SecureStorageAndroid", "re-encryption failed", e8);
            this.f15334g = fVar.b(context);
        }
    }

    public SharedPreferencesC0444f g(Context context) {
        context.getApplicationContext();
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setEncryptionPaddings("NoPadding").setBlockModes("GCM").setKeySize(RecognitionOptions.QR_CODE).build();
        if ("_androidx_security_master_key_".equals(a2.g.a(build))) {
            if (build != null) {
                if (a2.h.AES256_GCM == null) {
                    build = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(RecognitionOptions.QR_CODE).build();
                }
                if (build != null) {
                    Object obj = a2.i.f6942a;
                    if (build.getKeySize() == 256) {
                        if (Arrays.equals(build.getBlockModes(), new String[]{"GCM"})) {
                            if (build.getPurposes() == 3) {
                                if (Arrays.equals(build.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                                    if (build.isUserAuthenticationRequired() && build.getUserAuthenticationValidityDurationSeconds() < 1) {
                                        throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                                    }
                                    synchronized (a2.i.f6942a) {
                                        String keystoreAlias = build.getKeystoreAlias();
                                        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                                        keyStore.load(null);
                                        if (!keyStore.containsAlias(keystoreAlias)) {
                                            try {
                                                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                                                keyGenerator.init(build);
                                                keyGenerator.generateKey();
                                            } catch (ProviderException e7) {
                                                throw new GeneralSecurityException(e7.getMessage(), e7);
                                            }
                                        }
                                    }
                                    String keystoreAlias2 = build.getKeystoreAlias();
                                    String str = (String) this.f15333e;
                                    EnumC0442d enumC0442d = EnumC0442d.AES256_SIV;
                                    EnumC0443e enumC0443e = EnumC0443e.AES256_GCM;
                                    K3.e.a();
                                    AbstractC0113a.a();
                                    Context applicationContext = context.getApplicationContext();
                                    Y0 y02 = new Y0();
                                    y02.f = enumC0442d.a();
                                    if (applicationContext != null) {
                                        y02.f14759a = applicationContext;
                                        y02.f14760b = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
                                        y02.f14761c = str;
                                        String h8 = io.flutter.plugins.pathprovider.b.h("android-keystore://", keystoreAlias2);
                                        if (h8.startsWith("android-keystore://")) {
                                            y02.f14762d = h8;
                                            V2.k a7 = y02.a().a();
                                            Y0 y03 = new Y0();
                                            y03.f = enumC0443e.a();
                                            y03.f14759a = applicationContext;
                                            y03.f14760b = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
                                            y03.f14761c = str;
                                            String h9 = io.flutter.plugins.pathprovider.b.h("android-keystore://", keystoreAlias2);
                                            if (h9.startsWith("android-keystore://")) {
                                                y03.f14762d = h9;
                                                F3.a aVar = (F3.a) y03.a().a().r(F3.a.class);
                                                return new SharedPreferencesC0444f(str, applicationContext.getSharedPreferences(str, 0), aVar, (F3.d) a7.r(F3.d.class));
                                            }
                                            throw new IllegalArgumentException("key URI must start with android-keystore://");
                                        }
                                        throw new IllegalArgumentException("key URI must start with android-keystore://");
                                    }
                                    throw new IllegalArgumentException("need an Android context");
                                }
                                throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(build.getEncryptionPaddings()));
                            }
                            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + build.getPurposes());
                        }
                        throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(build.getBlockModes()));
                    }
                    throw new IllegalArgumentException("invalid key size, want 256 bits got " + build.getKeySize() + " bits");
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }
            throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
        }
        throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (_androidx_security_master_key_ vs " + a2.g.a(build));
    }

    public HashMap h() {
        c();
        Map<String, ?> all = ((SharedPreferences) this.f).getAll();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getKey().contains((String) this.f15331c)) {
                String replaceFirst = entry.getKey().replaceFirst(((String) this.f15331c) + '_', StringUtils.EMPTY);
                if (e()) {
                    hashMap.put(replaceFirst, (String) entry.getValue());
                } else {
                    hashMap.put(replaceFirst, b((String) entry.getValue()));
                }
            }
        }
        return hashMap;
    }

    public void j(String str, String str2) {
        c();
        SharedPreferences.Editor edit = ((SharedPreferences) this.f).edit();
        if (e()) {
            edit.putString(str, str2);
        } else {
            edit.putString(str, Base64.encodeToString(((R1.j) this.f15334g).m0(str2.getBytes((Charset) this.f15330b)), 0));
        }
        edit.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [p4.P, java.lang.Object] */
    public void k(Bundle bundle, i3.f fVar) {
        if (((P) this.f15330b) != null) {
            fVar.b();
            return;
        }
        if (((LinkedList) this.f15332d) == null) {
            this.f15332d = new LinkedList();
        }
        ((LinkedList) this.f15332d).add(fVar);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.f15331c;
            if (bundle2 == null) {
                this.f15331c = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.f = (C0927b) this.f15333e;
        if (((P) this.f15330b) == null) {
            try {
                Context context = this.f15329a;
                boolean z7 = h.f15323a;
                synchronized (h.class) {
                    h.a(context, null, null);
                }
                C1743g c8 = AbstractC1740d.E(this.f15329a, null).c(new i3.b(this.f15329a), (GoogleMapOptions) this.f15335h);
                if (c8 != null) {
                    f fVar2 = (f) this.f15334g;
                    ?? obj = new Object();
                    obj.f15211b = c8;
                    I.i(fVar2);
                    obj.f15210a = fVar2;
                    ((C0927b) this.f).C(obj);
                    Iterator it = ((ArrayList) this.f15336i).iterator();
                    while (it.hasNext()) {
                        ((P) this.f15330b).g((C1177j) it.next());
                    }
                    ((ArrayList) this.f15336i).clear();
                }
            } catch (W2.g unused) {
            } catch (RemoteException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public k(Context context, HashMap hashMap) {
        this.f15331c = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg";
        this.f15333e = "FlutterSecureStorage";
        this.f15336i = Boolean.FALSE;
        this.f15332d = hashMap;
        this.f15329a = context.getApplicationContext();
        this.f15330b = StandardCharsets.UTF_8;
    }
}
