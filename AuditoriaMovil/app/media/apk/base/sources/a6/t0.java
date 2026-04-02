package a6;

import D.AbstractC0055e;
import D.AbstractC0059i;
import D.C0072w;
import H4.C0158f;
import H4.C0159f0;
import H4.C0160g;
import H4.C0163h0;
import H4.n1;
import H4.o1;
import H4.p1;
import a4.C0448A;
import a4.C0451D;
import a6.t0;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.core.impl.C0505g;
import androidx.camera.core.impl.y0;
import b4.C0596d;
import b4.C0599g;
import b4.C0600h;
import c4.C0634c;
import c6.C0692o0;
import com.example.appecoactivate.R;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzagt;
import com.google.android.gms.internal.p002firebaseauthapi.zzagw;
import com.google.android.gms.internal.p002firebaseauthapi.zzv;
import com.google.android.gms.internal.p002firebaseauthapi.zzzp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.firestore.C0806h;
import com.google.firebase.firestore.C0814p;
import com.google.firebase.firestore.EnumC0815q;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.C0850l;
import com.google.protobuf.EnumC0870v0;
import com.google.protobuf.M0;
import com.google.protobuf.N0;
import e6.EnumC0966a;
import f6.C0995b;
import h3.AbstractC1079a;
import h4.C1083c;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.spec.AlgorithmParameterSpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EnumMap;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.u;
import l4.C1418b;
import m6.p;
import m6.s;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.C1608t;
import p5.C1696b;
import p5.C1697c;
import w.C1908S;
import w.C1926k;
/* loaded from: classes.dex */
public class t0 implements Continuation, l2.h, k7.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7208a;

    /* renamed from: b  reason: collision with root package name */
    public Object f7209b;

    /* renamed from: c  reason: collision with root package name */
    public Object f7210c;

    public /* synthetic */ t0(int i7, Object obj, Object obj2) {
        this.f7208a = i7;
        this.f7209b = obj;
        this.f7210c = obj2;
    }

    public static String V(Q6.e eVar) {
        long j = eVar.f4462b;
        if (j <= 64) {
            return eVar.s().d();
        }
        return eVar.t((int) Math.min(j, 64L)).d() + "...";
    }

    public AlgorithmParameterSpec A() {
        return null;
    }

    public androidx.camera.core.impl.n0 B() {
        androidx.camera.core.impl.n0 n0Var = new androidx.camera.core.impl.n0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f7210c).entrySet()) {
            androidx.camera.core.impl.w0 w0Var = (androidx.camera.core.impl.w0) entry.getValue();
            if (w0Var.f7681e) {
                n0Var.a(w0Var.f7677a);
                arrayList.add((String) entry.getKey());
            }
        }
        org.slf4j.helpers.i.l("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + ((String) this.f7209b));
        return n0Var;
    }

    public Collection C() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f7210c).entrySet()) {
            if (((androidx.camera.core.impl.w0) entry.getValue()).f7681e) {
                arrayList.add(((androidx.camera.core.impl.w0) entry.getValue()).f7677a);
            }
        }
        return DesugarCollections.unmodifiableCollection(arrayList);
    }

    public Collection D() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f7210c).entrySet()) {
            if (((androidx.camera.core.impl.w0) entry.getValue()).f7681e) {
                arrayList.add(((androidx.camera.core.impl.w0) entry.getValue()).f7678b);
            }
        }
        return DesugarCollections.unmodifiableCollection(arrayList);
    }

    public LinkedHashSet E() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f7209b) {
            linkedHashSet = new LinkedHashSet(((LinkedHashMap) this.f7210c).values());
        }
        return linkedHashSet;
    }

    public m1.o F(Object... objArr) {
        Constructor b5;
        synchronized (((AtomicBoolean) this.f7210c)) {
            if (!((AtomicBoolean) this.f7210c).get()) {
                try {
                    b5 = ((C1418b) this.f7209b).b();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f7210c).set(true);
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating extension", e7);
                }
            }
            b5 = null;
        }
        if (b5 == null) {
            return null;
        }
        try {
            return (m1.o) b5.newInstance(objArr);
        } catch (Exception e8) {
            throw new IllegalStateException("Unexpected error creating extractor", e8);
        }
    }

    public Cipher G() {
        return Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidKeyStoreBCWorkaround");
    }

    public String H(String str) {
        Resources resources = (Resources) this.f7209b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f7210c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void I(String str, String str2) {
        int i7 = 0;
        C0692o0 c0692o0 = (C0692o0) this.f7210c;
        c0692o0.getClass();
        if (!str.isEmpty()) {
            int length = str.length();
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = str.charAt(i8);
                if (charAt <= 31 || charAt >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i8), str));
                }
            }
            if (str2 != null) {
                int length2 = str2.length();
                for (int i9 = 0; i9 < length2; i9++) {
                    char charAt2 = str2.charAt(i9);
                    if (charAt2 <= 31 || charAt2 >= 127) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i9), str2));
                    }
                }
                while (true) {
                    ArrayList arrayList = c0692o0.f8937b;
                    if (i7 < arrayList.size()) {
                        if (str.equalsIgnoreCase((String) arrayList.get(i7))) {
                            arrayList.remove(i7);
                            arrayList.remove(i7);
                            i7 -= 2;
                        }
                        i7 += 2;
                    } else {
                        arrayList.add(str);
                        arrayList.add(str2.trim());
                        return;
                    }
                }
            } else {
                throw new IllegalArgumentException("value == null");
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    public void J(C1926k c1926k) {
        synchronized (this.f7209b) {
            try {
                c1926k.getClass();
                for (String str : new LinkedHashSet(c1926k.f)) {
                    org.slf4j.helpers.i.l("CameraRepository", "Added camera: " + str);
                    ((LinkedHashMap) this.f7210c).put(str, c1926k.a(str));
                }
            } catch (C0072w e7) {
                throw new Exception(e7);
            }
        }
    }

    public boolean K() {
        return ((Logger) this.f7209b).isLoggable((Level) this.f7210c);
    }

    public boolean L(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7210c;
        if (!linkedHashMap.containsKey(str)) {
            return false;
        }
        return ((androidx.camera.core.impl.w0) linkedHashMap.get(str)).f7681e;
    }

    public void M(d6.q qVar, int i7, Q6.e eVar, int i8, boolean z7) {
        if (K()) {
            ((Logger) this.f7209b).log((Level) this.f7210c, qVar + " DATA: streamId=" + i7 + " endStream=" + z7 + " length=" + i8 + " bytes=" + V(eVar));
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [Q6.e, java.lang.Object] */
    public void N(d6.q qVar, int i7, EnumC0966a enumC0966a, Q6.g gVar) {
        if (K()) {
            StringBuilder sb = new StringBuilder();
            sb.append(qVar);
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i7);
            sb.append(" errorCode=");
            sb.append(enumC0966a);
            sb.append(" length=");
            sb.append(gVar.c());
            sb.append(" bytes=");
            ?? obj = new Object();
            obj.v(gVar);
            sb.append(V(obj));
            ((Logger) this.f7209b).log((Level) this.f7210c, sb.toString());
        }
    }

    public void O(d6.q qVar, long j) {
        if (K()) {
            ((Logger) this.f7209b).log((Level) this.f7210c, qVar + " PING: ack=false bytes=" + j);
        }
    }

    public void P(d6.q qVar, int i7, EnumC0966a enumC0966a) {
        if (K()) {
            ((Logger) this.f7209b).log((Level) this.f7210c, qVar + " RST_STREAM: streamId=" + i7 + " errorCode=" + enumC0966a);
        }
    }

    public void Q(d6.q qVar, B5.S s7) {
        d6.r[] values;
        if (K()) {
            StringBuilder sb = new StringBuilder();
            sb.append(qVar);
            sb.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(d6.r.class);
            for (d6.r rVar : d6.r.values()) {
                if (s7.i(rVar.a())) {
                    enumMap.put((EnumMap) rVar, (d6.r) Integer.valueOf(((int[]) s7.f336c)[rVar.a()]));
                }
            }
            sb.append(enumMap.toString());
            ((Logger) this.f7209b).log((Level) this.f7210c, sb.toString());
        }
    }

    public void R(d6.q qVar, int i7, long j) {
        if (K()) {
            ((Logger) this.f7209b).log((Level) this.f7210c, qVar + " WINDOW_UPDATE: streamId=" + i7 + " windowSizeIncrement=" + j);
        }
    }

    public KeyGenParameterSpec S(Calendar calendar, Calendar calendar2) {
        String str = (String) this.f7209b;
        return new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal(io.flutter.plugins.pathprovider.b.h("CN=", str))).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }

    public void T(e0.g gVar) {
        int i7 = gVar.f10604b;
        G.h hVar = (G.h) this.f7210c;
        A.c cVar = (A.c) this.f7209b;
        if (i7 == 0) {
            hVar.execute(new H.h(15, cVar, gVar.f10603a));
        } else {
            hVar.execute(new G.c(cVar, i7));
        }
    }

    public void U(Locale locale) {
        Locale.setDefault(locale);
        Context context = (Context) this.f7210c;
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        context.createConfigurationContext(configuration);
    }

    public m1.G W(int i7) {
        int i8 = 0;
        while (true) {
            int[] iArr = (int[]) this.f7209b;
            if (i8 < iArr.length) {
                if (i7 == iArr[i8]) {
                    return ((e1.T[]) this.f7210c)[i8];
                }
                i8++;
            } else {
                K0.a.n("BaseMediaChunkOutput", "Unmatched track of type: " + i7);
                return new m1.n();
            }
        }
    }

    public Key X(byte[] bArr) {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        String str = (String) this.f7209b;
        Key key = keyStore.getKey(str, null);
        if (key != null) {
            if (key instanceof PrivateKey) {
                Cipher G2 = G();
                G2.init(4, (PrivateKey) key, A());
                return G2.unwrap(bArr, "AES", 3);
            }
            throw new Exception("Not an instance of a PrivateKey");
        }
        throw new Exception(io.flutter.plugins.pathprovider.b.h("No key found under alias: ", str));
    }

    public void Y(String str, androidx.camera.core.impl.o0 o0Var, y0 y0Var, C0505g c0505g, List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7210c;
        if (!linkedHashMap.containsKey(str)) {
            return;
        }
        androidx.camera.core.impl.w0 w0Var = new androidx.camera.core.impl.w0(o0Var, y0Var, c0505g, list);
        androidx.camera.core.impl.w0 w0Var2 = (androidx.camera.core.impl.w0) linkedHashMap.get(str);
        w0Var.f7681e = w0Var2.f7681e;
        w0Var.f = w0Var2.f;
        linkedHashMap.put(str, w0Var);
    }

    public void Z(Annotation annotation) {
        if (((HashMap) this.f7210c) == null) {
            this.f7210c = new HashMap();
        }
        ((HashMap) this.f7210c).put(annotation.annotationType(), annotation);
    }

    @Override // k7.h
    public void a() {
        ((MediaPlayer) this.f7210c).reset();
    }

    public C0599g a0(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        Parcelable parcelable;
        C0600h a7;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z7 = jSONObject.getBoolean("anonymous");
            String str = "2";
            String string3 = jSONObject.getString("version");
            if (string3 != null) {
                str = string3;
            }
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i7 = 0; i7 < length; i7++) {
                arrayList.add(C0596d.k(jSONArray3.getString(i7)));
            }
            C0599g c0599g = new C0599g(U3.h.e(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzagw zzb = zzagw.zzb(string);
                com.google.android.gms.common.internal.I.i(zzb);
                c0599g.f8253a = zzb;
            }
            if (!z7) {
                c0599g.f8251Y = Boolean.FALSE;
            }
            c0599g.f8250X = str;
            if (jSONObject.has("userMetadata") && (a7 = C0600h.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                c0599g.f8252Z = a7;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i8));
                    String optString = jSONObject2.optString("factorIdKey");
                    if ("phone".equals(optString)) {
                        parcelable = C0448A.n(jSONObject2);
                    } else if (Objects.equals(optString, "totp")) {
                        parcelable = C0451D.n(jSONObject2);
                    } else {
                        parcelable = null;
                    }
                    arrayList2.add(parcelable);
                }
                c0599g.o(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    arrayList3.add(a4.J.k(new JSONObject(jSONArray.getString(i9))));
                }
                c0599g.f8261h0 = arrayList3;
            }
            return c0599g;
        } catch (zzzp e7) {
            e = e7;
            Log.wtf(((Z2.a) this.f7210c).f6734a, e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e8) {
            e = e8;
            Log.wtf(((Z2.a) this.f7210c).f6734a, e);
            return null;
        } catch (IllegalArgumentException e9) {
            e = e9;
            Log.wtf(((Z2.a) this.f7210c).f6734a, e);
            return null;
        } catch (JSONException e10) {
            e = e10;
            Log.wtf(((Z2.a) this.f7210c).f6734a, e);
            return null;
        }
    }

    @Override // k7.h
    public void b() {
        ((MediaPlayer) this.f7210c).prepareAsync();
    }

    @Override // k7.h
    public void c() {
        ((MediaPlayer) this.f7210c).pause();
    }

    @Override // k7.h
    public void d(boolean z7) {
        ((MediaPlayer) this.f7210c).setLooping(z7);
    }

    @Override // k7.h
    public void e(l7.c source) {
        kotlin.jvm.internal.j.e(source, "source");
        a();
        source.b((MediaPlayer) this.f7210c);
    }

    @Override // k7.h
    public Integer f() {
        Integer valueOf = Integer.valueOf(((MediaPlayer) this.f7210c).getDuration());
        if (valueOf.intValue() == -1) {
            return null;
        }
        return valueOf;
    }

    @Override // k7.h
    public boolean g() {
        Integer f = f();
        if (f != null && f.intValue() != 0) {
            return false;
        }
        return true;
    }

    @Override // k7.h
    public void h(float f) {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f7210c;
        mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f));
    }

    @Override // k7.h
    public void i(int i7) {
        ((MediaPlayer) this.f7210c).seekTo(i7);
    }

    @Override // k7.h
    public void j(j7.a aVar) {
        MediaPlayer player = (MediaPlayer) this.f7210c;
        kotlin.jvm.internal.j.e(player, "player");
        player.setAudioAttributes(aVar.a());
        if (aVar.f13462b) {
            Context context = ((k7.o) this.f7209b).f13768a.f13470b;
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.j.d(applicationContext, "context.applicationContext");
                player.setWakeMode(applicationContext, 1);
                return;
            }
            kotlin.jvm.internal.j.g("context");
            throw null;
        }
    }

    @Override // k7.h
    public void k(float f, float f4) {
        ((MediaPlayer) this.f7210c).setVolume(f, f4);
    }

    @Override // k7.h
    public Integer l() {
        return Integer.valueOf(((MediaPlayer) this.f7210c).getCurrentPosition());
    }

    public void m(Object obj, String str) {
        ((ArrayList) this.f7209b).add(AbstractC0059i.A(str, "=", String.valueOf(obj)));
    }

    public C1083c n() {
        Map unmodifiableMap;
        if (((HashMap) this.f7210c) == null) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f7210c));
        }
        return new C1083c((String) this.f7209b, unmodifiableMap);
    }

    public void o() {
        ((s0) this.f7209b).f7200b = true;
        ((ScheduledFuture) this.f7210c).cancel(false);
    }

    public HashMap p(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((String) entry.getKey(), q((p1) entry.getValue()));
        }
        return hashMap;
    }

    public Object q(p1 p1Var) {
        boolean z7;
        switch (q4.s.l(p1Var)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(p1Var.H());
            case 2:
                if (p1Var.R().equals(o1.INTEGER_VALUE)) {
                    return Long.valueOf(p1Var.M());
                }
                return Double.valueOf(p1Var.K());
            case 3:
                N0 Q7 = p1Var.Q();
                return new U3.p(Q7.y(), Q7.z());
            case 4:
                int i7 = com.google.firebase.firestore.r0.f9847a[((EnumC0815q) this.f7210c).ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        return null;
                    }
                    N0 m7 = AbstractC1079a.m(p1Var);
                    return new U3.p(m7.y(), m7.z());
                }
                p1 n7 = AbstractC1079a.n(p1Var);
                if (n7 == null) {
                    return null;
                }
                return q(n7);
            case 5:
                return p1Var.P();
            case 6:
                AbstractC0852m I7 = p1Var.I();
                AbstractC0055e.b(I7, "Provided ByteString must not be null.");
                return new C0806h(I7);
            case 7:
                q4.p l8 = q4.p.l(p1Var.O());
                if (l8.f15351a.size() > 3 && l8.g(0).equals("projects") && l8.g(2).equals("databases")) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                m5.d.i("Tried to parse an invalid resource name: %s", z7, l8);
                String g3 = l8.g(1);
                String g4 = l8.g(3);
                q4.f fVar = new q4.f(g3, g4);
                q4.h c8 = q4.h.c(p1Var.O());
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f7209b;
                q4.f fVar2 = firebaseFirestore.f9748c;
                if (!fVar.equals(fVar2)) {
                    u4.q.d("DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", c8.f15357a, g3, g4, fVar2.f15352a, fVar2.f15353b);
                }
                return new C0814p(c8, firebaseFirestore);
            case 8:
                return new com.google.firebase.firestore.N(p1Var.L().y(), p1Var.L().z());
            case 9:
                C0160g G2 = p1Var.G();
                ArrayList arrayList = new ArrayList(G2.A());
                for (p1 p1Var2 : G2.a()) {
                    arrayList.add(q(p1Var2));
                }
                return arrayList;
            case 10:
                List a7 = ((p1) p1Var.N().y().get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR)).G().a();
                double[] dArr = new double[a7.size()];
                for (int i8 = 0; i8 < a7.size(); i8++) {
                    dArr[i8] = ((p1) a7.get(i8)).K();
                }
                return new com.google.firebase.firestore.s0(dArr);
            case 11:
                return p(p1Var.N().y());
            default:
                m5.d.g("Unknown value type: " + p1Var.R(), new Object[0]);
                throw null;
        }
    }

    public String r() {
        return ((Context) this.f7210c).getPackageName() + ".FlutterSecureStoragePluginKey";
    }

    @Override // k7.h
    public void release() {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f7210c;
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    public void s(j7.a aVar) {
        AudioAttributes a7 = aVar.a();
        HashMap hashMap = (HashMap) this.f7210c;
        if (!hashMap.containsKey(a7)) {
            SoundPool soundPool = new SoundPool.Builder().setAudioAttributes(a7).setMaxStreams(32).build();
            ((j7.d) this.f7209b).b("Create SoundPool with " + a7);
            kotlin.jvm.internal.j.d(soundPool, "soundPool");
            final k7.m mVar = new k7.m(soundPool);
            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: k7.i
                @Override // android.media.SoundPool.OnLoadCompleteListener
                public final void onLoadComplete(SoundPool soundPool2, int i7, int i8) {
                    l7.d dVar;
                    t0 this$0 = t0.this;
                    m mVar2 = mVar;
                    kotlin.jvm.internal.j.e(this$0, "this$0");
                    ((j7.d) this$0.f7209b).b("Loaded " + i7);
                    l lVar = (l) mVar2.f13765b.get(Integer.valueOf(i7));
                    if (lVar != null) {
                        dVar = lVar.f13758Y;
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        Map map = mVar2.f13765b;
                        u.a(map).remove(lVar.f13762d);
                        synchronized (mVar2.f13766c) {
                            List<l> list = (List) mVar2.f13766c.get(dVar);
                            if (list == null) {
                                list = p.f14074a;
                            }
                            for (l lVar2 : list) {
                                o oVar = lVar2.f13759a;
                                oVar.c("Marking " + lVar2 + " as loaded");
                                lVar2.f13759a.h(true);
                                o oVar2 = lVar2.f13759a;
                                if (oVar2.f13779n) {
                                    oVar2.c("Delayed start of " + lVar2);
                                    lVar2.start();
                                }
                            }
                        }
                    }
                }
            });
            hashMap.put(a7, mVar);
        }
    }

    @Override // k7.h
    public void start() {
        h(((k7.o) this.f7209b).f13775i);
    }

    @Override // k7.h
    public void stop() {
        ((MediaPlayer) this.f7210c).stop();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
        if (r9.equals("IS_NULL") == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(java.util.ArrayList r8, org.json.JSONObject r9) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.t0.t(java.util.ArrayList, org.json.JSONObject):void");
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        String str;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            com.google.android.gms.common.internal.I.i(exception);
            String message = exception.getMessage();
            com.google.android.gms.common.internal.I.i(message);
            return Tasks.forException(new Exception(message));
        }
        zzagt zzagtVar = (zzagt) task.getResult();
        String zza = zzagtVar.zza();
        if (zzae.zzc(zza)) {
            return Tasks.forException(new Exception(io.flutter.plugins.pathprovider.b.h("No Recaptcha Enterprise siteKey configured for tenant/project ", (String) this.f7209b)));
        }
        List<String> zza2 = zzv.zza('/').zza((CharSequence) zza);
        if (zza2.size() != 4) {
            str = null;
        } else {
            str = zza2.get(3);
        }
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception(io.flutter.plugins.pathprovider.b.h("Invalid siteKey format ", zza)));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + ((String) this.f7209b));
        }
        C1908S c1908s = (C1908S) this.f7210c;
        U3.h hVar = (U3.h) c1908s.f16115d;
        hVar.a();
        ((b4.O) c1908s.f).getClass();
        Task<RecaptchaTasksClient> fetchTaskClient = Recaptcha.fetchTaskClient((Application) hVar.f5749a, str);
        C1908S c1908s2 = (C1908S) this.f7210c;
        String str2 = (String) this.f7209b;
        synchronized (c1908s2.f16112a) {
            c1908s2.f16114c = zzagtVar;
            ((HashMap) c1908s2.f16113b).put(str2, fetchTaskClient);
        }
        return fetchTaskClient;
    }

    public String toString() {
        switch (this.f7208a) {
            case 6:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f7210c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f7209b;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    sb.append((String) arrayList.get(i7));
                    if (i7 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            case 15:
                return "Request{url=" + ((C0995b) this.f7209b) + '}';
            default:
                return super.toString();
        }
    }

    public void u(n1 n1Var, JSONObject jSONObject) {
        C0159f0 B7 = C0163h0.B();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                B7.f(y(jSONObject.getJSONObject(next)), next);
            }
        }
        n1Var.i(B7);
    }

    public q4.p v(String str) {
        q4.p l8 = q4.p.l(str);
        C1608t c1608t = (C1608t) this.f7210c;
        if (C1608t.i0(l8)) {
            String g3 = l8.g(1);
            q4.f fVar = (q4.f) c1608t.f14880b;
            if (g3.equals(fVar.f15352a) && l8.g(3).equals(fVar.f15353b)) {
                return (q4.p) l8.j();
            }
        }
        throw new IllegalArgumentException("Resource name is not valid for current instance: ".concat(str));
    }

    public ArrayList w(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray != null) {
            for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                arrayList.add(y(optJSONArray.getJSONObject(i7)));
            }
        }
        return arrayList;
    }

    public U3.p x(Object obj) {
        int i7;
        if (obj instanceof String) {
            String str = (String) obj;
            try {
                int indexOf = str.indexOf(84);
                if (indexOf != -1) {
                    int indexOf2 = str.indexOf(90, indexOf);
                    if (indexOf2 == -1) {
                        indexOf2 = str.indexOf(43, indexOf);
                    }
                    if (indexOf2 == -1) {
                        indexOf2 = str.indexOf(45, indexOf);
                    }
                    if (indexOf2 != -1) {
                        String substring = str.substring(0, indexOf2);
                        String str2 = StringUtils.EMPTY;
                        int indexOf3 = substring.indexOf(46);
                        if (indexOf3 != -1) {
                            String substring2 = substring.substring(0, indexOf3);
                            str2 = substring.substring(indexOf3 + 1);
                            substring = substring2;
                        }
                        long time = ((SimpleDateFormat) this.f7209b).parse(substring).getTime() / 1000;
                        if (str2.isEmpty()) {
                            i7 = 0;
                        } else {
                            i7 = 0;
                            for (int i8 = 0; i8 < 9; i8++) {
                                i7 *= 10;
                                if (i8 < str2.length()) {
                                    if (str2.charAt(i8) >= '0' && str2.charAt(i8) <= '9') {
                                        i7 = (str2.charAt(i8) - '0') + i7;
                                    } else {
                                        throw new IllegalArgumentException("Invalid nanoseconds: ".concat(str2));
                                    }
                                }
                            }
                        }
                        if (str.charAt(indexOf2) == 'Z') {
                            if (str.length() != indexOf2 + 1) {
                                throw new IllegalArgumentException("Invalid timestamp: Invalid trailing data \"" + str.substring(indexOf2) + "\"");
                            }
                        } else {
                            String substring3 = str.substring(indexOf2 + 1);
                            int indexOf4 = substring3.indexOf(58);
                            if (indexOf4 != -1) {
                                long parseLong = (Long.parseLong(substring3.substring(indexOf4 + 1)) + (Long.parseLong(substring3.substring(0, indexOf4)) * 60)) * 60;
                                if (str.charAt(indexOf2) == '+') {
                                    time -= parseLong;
                                } else {
                                    time += parseLong;
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid offset value: ".concat(substring3));
                            }
                        }
                        return new U3.p(i7, time);
                    }
                    throw new IllegalArgumentException("Invalid timestamp: Missing valid timezone offset: ".concat(str));
                }
                throw new IllegalArgumentException("Invalid timestamp: ".concat(str));
            } catch (ParseException e7) {
                throw new IllegalArgumentException("Failed to parse timestamp", e7);
            }
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            return new U3.p(jSONObject.optInt("nanos"), jSONObject.optLong("seconds"));
        } else {
            throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
        }
    }

    public p1 y(JSONObject jSONObject) {
        n1 T7 = p1.T();
        if (jSONObject.has("nullValue")) {
            EnumC0870v0 enumC0870v0 = EnumC0870v0.NULL_VALUE;
            T7.d();
            p1.C((p1) T7.f10006b, enumC0870v0);
        } else {
            if (jSONObject.has("booleanValue")) {
                boolean optBoolean = jSONObject.optBoolean("booleanValue", false);
                T7.d();
                p1.D((p1) T7.f10006b, optBoolean);
            } else if (jSONObject.has("integerValue")) {
                T7.h(jSONObject.optLong("integerValue"));
            } else if (jSONObject.has("doubleValue")) {
                T7.g(jSONObject.optDouble("doubleValue"));
            } else if (jSONObject.has("timestampValue")) {
                U3.p x7 = x(jSONObject.get("timestampValue"));
                M0 A7 = N0.A();
                A7.f(x7.f5765a);
                A7.d();
                N0.w((N0) A7.f10006b, x7.f5766b);
                T7.l(A7);
            } else if (jSONObject.has("stringValue")) {
                T7.k(jSONObject.optString("stringValue", StringUtils.EMPTY));
            } else if (jSONObject.has("bytesValue")) {
                byte[] decode = Base64.decode(jSONObject.getString("bytesValue"), 0);
                C0850l c0850l = AbstractC0852m.f10085b;
                C0850l l8 = AbstractC0852m.l(decode, 0, decode.length);
                T7.d();
                p1.x((p1) T7.f10006b, l8);
            } else if (jSONObject.has("referenceValue")) {
                String string = jSONObject.getString("referenceValue");
                T7.d();
                p1.y((p1) T7.f10006b, string);
            } else if (jSONObject.has("geoPointValue")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("geoPointValue");
                C1696b A8 = C1697c.A();
                double optDouble = jSONObject2.optDouble("latitude");
                A8.d();
                C1697c.v((C1697c) A8.f10006b, optDouble);
                double optDouble2 = jSONObject2.optDouble("longitude");
                A8.d();
                C1697c.w((C1697c) A8.f10006b, optDouble2);
                T7.d();
                p1.z((p1) T7.f10006b, (C1697c) A8.b());
            } else if (jSONObject.has("arrayValue")) {
                JSONArray optJSONArray = jSONObject.getJSONObject("arrayValue").optJSONArray("values");
                C0158f B7 = C0160g.B();
                if (optJSONArray != null) {
                    for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                        p1 y2 = y(optJSONArray.getJSONObject(i7));
                        B7.d();
                        C0160g.v((C0160g) B7.f10006b, y2);
                    }
                }
                T7.f(B7);
            } else if (jSONObject.has("mapValue")) {
                u(T7, jSONObject.getJSONObject("mapValue").optJSONObject("fields"));
            } else {
                throw new IllegalArgumentException("Unexpected value type: " + jSONObject);
            }
        }
        return (p1) T7.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList z() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f7209b;
        Class cls = (Class) ((A.m) this.f7210c).f28b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), RecognitionOptions.ITF);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (String str2 : arrayList) {
            arrayList2.add(new C0634c(str2, 0));
        }
        return arrayList2;
    }

    public /* synthetic */ t0(int i7, boolean z7) {
        this.f7208a = i7;
    }

    public t0(Context context, int i7) {
        this.f7208a = i7;
        switch (i7) {
            case 10:
                this.f7210c = context;
                String r7 = r();
                this.f7209b = r7;
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                if (keyStore.getKey(r7, null) == null) {
                    Locale locale = Locale.getDefault();
                    try {
                        U(Locale.ENGLISH);
                        Calendar calendar = Calendar.getInstance();
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.add(1, 25);
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        keyPairGenerator.initialize(S(calendar, calendar2));
                        keyPairGenerator.generateKeyPair();
                        return;
                    } finally {
                        U(locale);
                    }
                }
                return;
            default:
                com.google.android.gms.common.internal.I.i(context);
                Resources resources = context.getResources();
                this.f7209b = resources;
                this.f7210c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                return;
        }
    }

    public /* synthetic */ t0(Object obj) {
        this.f7208a = 6;
        com.google.android.gms.common.internal.I.i(obj);
        this.f7210c = obj;
        this.f7209b = new ArrayList();
    }

    public t0(final k7.o wrappedPlayer) {
        this.f7208a = 24;
        kotlin.jvm.internal.j.e(wrappedPlayer, "wrappedPlayer");
        this.f7209b = wrappedPlayer;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: k7.c
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                int i7;
                h hVar;
                h hVar2;
                o wrappedPlayer2 = o.this;
                kotlin.jvm.internal.j.e(wrappedPlayer2, "$wrappedPlayer");
                wrappedPlayer2.h(true);
                wrappedPlayer2.f13768a.getClass();
                Integer num = null;
                if (wrappedPlayer2.f13778m && (hVar2 = wrappedPlayer2.f13772e) != null) {
                    num = hVar2.f();
                }
                if (num != null) {
                    i7 = num.intValue();
                } else {
                    i7 = 0;
                }
                wrappedPlayer2.f13769b.d("audio.onDuration", s.N(new l6.d(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, Integer.valueOf(i7))));
                if (wrappedPlayer2.f13779n) {
                    wrappedPlayer2.f();
                }
                if (wrappedPlayer2.f13780o >= 0) {
                    h hVar3 = wrappedPlayer2.f13772e;
                    if ((hVar3 == null || !hVar3.g()) && (hVar = wrappedPlayer2.f13772e) != null) {
                        hVar.i(wrappedPlayer2.f13780o);
                    }
                }
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: k7.d
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                o wrappedPlayer2 = o.this;
                kotlin.jvm.internal.j.e(wrappedPlayer2, "$wrappedPlayer");
                if (wrappedPlayer2.j != j7.g.LOOP) {
                    wrappedPlayer2.k();
                }
                wrappedPlayer2.f13768a.getClass();
                wrappedPlayer2.f13769b.d("audio.onComplete", new HashMap());
            }
        });
        mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: k7.e
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                o wrappedPlayer2 = o.this;
                kotlin.jvm.internal.j.e(wrappedPlayer2, "$wrappedPlayer");
                wrappedPlayer2.f13768a.getClass();
                wrappedPlayer2.f13769b.d("audio.onSeekComplete", new HashMap());
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: k7.f
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i7, int i8) {
                String str;
                String str2;
                o wrappedPlayer2 = o.this;
                kotlin.jvm.internal.j.e(wrappedPlayer2, "$wrappedPlayer");
                if (i7 == 100) {
                    str = "MEDIA_ERROR_SERVER_DIED";
                } else {
                    str = "MEDIA_ERROR_UNKNOWN {what:" + i7 + '}';
                }
                if (i8 == Integer.MIN_VALUE) {
                    str2 = "MEDIA_ERROR_SYSTEM";
                } else if (i8 != -1010) {
                    if (i8 != -1007) {
                        if (i8 != -1004) {
                            if (i8 != -110) {
                                str2 = "MEDIA_ERROR_UNKNOWN {extra:" + i8 + '}';
                            } else {
                                str2 = "MEDIA_ERROR_TIMED_OUT";
                            }
                        } else {
                            str2 = "MEDIA_ERROR_IO";
                        }
                    } else {
                        str2 = "MEDIA_ERROR_MALFORMED";
                    }
                } else {
                    str2 = "MEDIA_ERROR_UNSUPPORTED";
                }
                boolean z7 = wrappedPlayer2.f13778m;
                j7.e eVar = wrappedPlayer2.f13769b;
                j7.d dVar = wrappedPlayer2.f13768a;
                if (!z7 && kotlin.jvm.internal.j.a(str2, "MEDIA_ERROR_SYSTEM")) {
                    String str3 = str + ", " + str2;
                    dVar.getClass();
                    L5.h hVar = eVar.f13475b;
                    if (hVar != null) {
                        hVar.b("AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md", str3);
                    }
                } else {
                    wrappedPlayer2.h(false);
                    dVar.getClass();
                    L5.h hVar2 = eVar.f13475b;
                    if (hVar2 != null) {
                        hVar2.b("AndroidAudioError", str, str2);
                    }
                }
                return false;
            }
        });
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: k7.g
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i7) {
                o wrappedPlayer2 = o.this;
                kotlin.jvm.internal.j.e(wrappedPlayer2, "$wrappedPlayer");
            }
        });
        mediaPlayer.setAudioAttributes(wrappedPlayer.f13770c.a());
        this.f7210c = mediaPlayer;
    }

    public t0(C1908S c1908s, String str) {
        this.f7208a = 3;
        this.f7209b = str;
        this.f7210c = c1908s;
    }

    public t0(t0 t0Var) {
        this.f7208a = 15;
        this.f7209b = (C0995b) t0Var.f7209b;
        C0692o0 c0692o0 = (C0692o0) t0Var.f7210c;
        c0692o0.getClass();
        this.f7210c = new io.grpc.okhttp.internal.e(c0692o0);
    }

    public t0(View view, InputMethodManager inputMethodManager, A.m mVar) {
        this.f7208a = 20;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f7210c = view;
        this.f7209b = inputMethodManager;
        mVar.f28b = this;
    }

    public t0(Level level) {
        this.f7208a = 11;
        Logger logger = Logger.getLogger(d6.p.class.getName());
        G.i.j(level, "level");
        this.f7210c = level;
        G.i.j(logger, "logger");
        this.f7209b = logger;
    }

    public t0(l2.b bVar) {
        this.f7208a = 23;
        t0 t0Var = new t0(22);
        this.f7209b = bVar;
        this.f7210c = t0Var;
    }

    public t0(int i7) {
        this.f7208a = i7;
        switch (i7) {
            case 8:
                W2.e eVar = W2.e.f6170d;
                this.f7209b = new SparseIntArray();
                this.f7210c = eVar;
                return;
            case 19:
                this.f7209b = new AtomicLong();
                this.f7210c = new AtomicLong();
                return;
            case 22:
                this.f7209b = new ReentrantLock();
                this.f7210c = new LinkedHashMap();
                return;
            default:
                this.f7209b = new Object();
                this.f7210c = new LinkedHashMap();
                new HashSet();
                return;
        }
    }

    public t0(String str, int i7) {
        this.f7208a = i7;
        switch (i7) {
            case 17:
                this.f7210c = null;
                this.f7209b = str;
                return;
            default:
                this.f7210c = new LinkedHashMap();
                this.f7209b = str;
                return;
        }
    }

    public t0(C1608t c1608t) {
        this.f7208a = 28;
        this.f7210c = c1608t;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.f7209b = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }

    public t0(j7.d ref) {
        this.f7208a = 25;
        kotlin.jvm.internal.j.e(ref, "ref");
        this.f7209b = ref;
        this.f7210c = new HashMap();
    }

    public t0(s0 s0Var, ScheduledFuture scheduledFuture) {
        this.f7208a = 0;
        this.f7209b = s0Var;
        G.i.j(scheduledFuture, "future");
        this.f7210c = scheduledFuture;
    }

    public t0(C1418b c1418b) {
        this.f7208a = 26;
        this.f7209b = c1418b;
        this.f7210c = new AtomicBoolean(false);
    }

    public t0(L5.f fVar, String str) {
        this.f7208a = 21;
        this.f7209b = fVar;
        this.f7210c = str.isEmpty() ? StringUtils.EMPTY : ".".concat(str);
    }
}
