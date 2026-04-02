package V2;

import B5.B;
import B5.K;
import B5.N;
import B5.O;
import D.AbstractC0059i;
import D.C0061k;
import D.Y;
import D.b0;
import F3.p;
import F3.u;
import G3.o;
import G3.r;
import G3.s;
import G3.v;
import G3.w;
import H4.p1;
import L5.x;
import R3.C0299i0;
import R3.G0;
import R3.H0;
import R3.X0;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.text.Selection;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.camera.core.impl.EnumC0512n;
import androidx.camera.core.impl.EnumC0513o;
import androidx.camera.core.impl.EnumC0514p;
import androidx.camera.core.impl.InterfaceC0515q;
import androidx.camera.core.impl.InterfaceC0521x;
import androidx.lifecycle.AbstractC0564p;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import com.google.crypto.tink.shaded.protobuf.F;
import com.google.firebase.firestore.Z;
import h3.AbstractC1079a;
import io.flutter.embedding.engine.FlutterJNI;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import j6.C1372c;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import k6.InterfaceC1408a;
import l4.C1418b;
import m1.G;
import m1.InterfaceC1426A;
import m1.q;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import w.C1908S;
/* loaded from: classes.dex */
public final class k implements H.c, A2.f, F2.b, U.j, K2.b, q, J2.g, L5.d {

    /* renamed from: e  reason: collision with root package name */
    public static k f5963e;
    public static k f;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5964a;

    /* renamed from: b  reason: collision with root package name */
    public Object f5965b;

    /* renamed from: c  reason: collision with root package name */
    public Object f5966c;

    /* renamed from: d  reason: collision with root package name */
    public Object f5967d;

    public /* synthetic */ k(int i7) {
        this.f5964a = i7;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [A5.a, java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r3v0, types: [F5.d, java.lang.Object] */
    public static k A() {
        if (f == null) {
            C1372c c1372c = new C1372c(1);
            ?? obj = new Object();
            obj.f222a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(obj);
            FlutterJNI flutterJNI = new FlutterJNI();
            ?? obj2 = new Object();
            obj2.f1207b = false;
            obj2.f1210e = flutterJNI;
            obj2.f = newCachedThreadPool;
            k kVar = new k(1);
            kVar.f5965b = obj2;
            kVar.f5966c = c1372c;
            kVar.f5967d = newCachedThreadPool;
            f = kVar;
        }
        return f;
    }

    public static final k C(F3.g gVar, L3.b bVar) {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) gVar.f1170b;
        try {
            C0299i0 C7 = C0299i0.C(byteArrayInputStream, C0787n.a());
            byteArrayInputStream.close();
            if (C7.A().size() != 0) {
                try {
                    H0 G2 = H0.G(bVar.b(C7.A().k(), bArr), C0787n.a());
                    if (G2.B() > 0) {
                        return q(G2);
                    }
                    throw new GeneralSecurityException("empty keyset");
                } catch (F unused) {
                    throw new GeneralSecurityException("invalid keyset, corrupted key material");
                }
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static synchronized k F(Context context) {
        k H7;
        synchronized (k.class) {
            H7 = H(context.getApplicationContext());
        }
        return H7;
    }

    public static synchronized k H(Context context) {
        synchronized (k.class) {
            k kVar = f5963e;
            if (kVar != null) {
                return kVar;
            }
            k kVar2 = new k(context);
            f5963e = kVar2;
            return kVar2;
        }
    }

    public static final k q(H0 h02) {
        Integer valueOf;
        if (h02.B() > 0) {
            ArrayList arrayList = new ArrayList(h02.B());
            for (G0 g02 : h02.C()) {
                g02.getClass();
                int D4 = g02.D();
                if (g02.E() == X0.RAW) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(D4);
                }
                try {
                    try {
                        F3.c a7 = M3.j.f3240b.a(M3.q.l(g02.C().D(), g02.C().E(), g02.C().C(), g02.E(), valueOf));
                        int i7 = F3.k.f1174a[g02.F().ordinal()];
                        if (i7 != 1 && i7 != 2 && i7 != 3) {
                            throw new GeneralSecurityException("Unknown key status");
                            break;
                        }
                        arrayList.add(new F3.l(a7));
                    } catch (GeneralSecurityException unused) {
                        arrayList.add(null);
                    }
                } catch (GeneralSecurityException e7) {
                    throw new RuntimeException("Creating a protokey serialization failed", e7);
                }
            }
            return new k(h02, DesugarCollections.unmodifiableList(arrayList));
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public void B(KeyEvent keyEvent) {
        InputConnection inputConnection;
        O o7 = (O) this.f5967d;
        if (o7 != null) {
            io.flutter.plugin.editing.k kVar = ((B) o7).f298i0;
            boolean z7 = false;
            if (kVar.f11663b.isAcceptingText() && (inputConnection = kVar.j) != null) {
                if (inputConnection instanceof io.flutter.plugin.editing.c) {
                    io.flutter.plugin.editing.c cVar = (io.flutter.plugin.editing.c) inputConnection;
                    if (keyEvent.getAction() == 0) {
                        if (keyEvent.getKeyCode() == 21) {
                            z7 = cVar.d(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 22) {
                            z7 = cVar.d(false, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 19) {
                            z7 = cVar.e(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 20) {
                            z7 = cVar.e(false, keyEvent.isShiftPressed());
                        } else {
                            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                                EditorInfo editorInfo = cVar.f11631e;
                                if ((editorInfo.inputType & 131072) == 0) {
                                    cVar.performEditorAction(editorInfo.imeOptions & 255);
                                    z7 = true;
                                }
                            }
                            io.flutter.plugin.editing.f fVar = cVar.f11630d;
                            int selectionStart = Selection.getSelectionStart(fVar);
                            int selectionEnd = Selection.getSelectionEnd(fVar);
                            int unicodeChar = keyEvent.getUnicodeChar();
                            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                                int min = Math.min(selectionStart, selectionEnd);
                                int max = Math.max(selectionStart, selectionEnd);
                                cVar.beginBatchEdit();
                                if (min != max) {
                                    fVar.delete(min, max);
                                }
                                fVar.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                                int i7 = min + 1;
                                cVar.setSelection(i7, i7);
                                cVar.endBatchEdit();
                                z7 = true;
                            }
                        }
                    }
                } else {
                    z7 = inputConnection.sendKeyEvent(keyEvent);
                }
            }
            if (!z7) {
                HashSet hashSet = (HashSet) this.f5966c;
                hashSet.add(keyEvent);
                ((B) o7).getRootView().dispatchKeyEvent(keyEvent);
                if (hashSet.remove(keyEvent)) {
                    Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
                }
            }
        }
    }

    public void D(int i7) {
        if (i7 != 16 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i7 * 8)));
        }
        this.f5965b = Integer.valueOf(i7);
    }

    public synchronized GoogleSignInAccount E() {
        return (GoogleSignInAccount) this.f5966c;
    }

    public synchronized void G() {
        b bVar = (b) this.f5965b;
        ReentrantLock reentrantLock = bVar.f5943a;
        reentrantLock.lock();
        bVar.f5944b.edit().clear().apply();
        reentrantLock.unlock();
        this.f5966c = null;
        this.f5967d = null;
    }

    public D2.b a() {
        String str;
        if (((String) this.f5965b) == null) {
            str = " backendName";
        } else {
            str = StringUtils.EMPTY;
        }
        if (((A2.d) this.f5967d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new D2.b((String) this.f5965b, (byte[]) this.f5966c, (A2.d) this.f5967d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, M3.q] */
    @Override // J2.g
    public Object apply(Object obj) {
        boolean z7;
        A2.b bVar;
        A2.b bVar2;
        long insert;
        boolean z8;
        byte[] bArr;
        switch (this.f5964a) {
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                Cursor cursor = (Cursor) obj;
                A2.b bVar3 = J2.i.f2409e;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    if (cursor.getInt(7) != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    ?? obj2 = new Object();
                    obj2.f = new HashMap();
                    String string = cursor.getString(1);
                    if (string != null) {
                        obj2.f3252a = string;
                        obj2.f3255d = Long.valueOf(cursor.getLong(2));
                        obj2.f3256e = Long.valueOf(cursor.getLong(3));
                        if (z7) {
                            String string2 = cursor.getString(4);
                            if (string2 == null) {
                                bVar2 = J2.i.f2409e;
                            } else {
                                bVar2 = new A2.b(string2);
                            }
                            obj2.f3254c = new D2.e(bVar2, cursor.getBlob(5));
                        } else {
                            String string3 = cursor.getString(4);
                            if (string3 == null) {
                                bVar = J2.i.f2409e;
                            } else {
                                bVar = new A2.b(string3);
                            }
                            obj2.f3254c = new D2.e(bVar, (byte[]) J2.i.j(((J2.i) this.f5965b).a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), J2.f.f2404b));
                        }
                        if (!cursor.isNull(6)) {
                            obj2.f3253b = Integer.valueOf(cursor.getInt(6));
                        }
                        ((ArrayList) this.f5966c).add(new J2.b(j, (D2.b) this.f5967d, obj2.k()));
                    } else {
                        throw new NullPointerException("Null transportName");
                    }
                }
                return null;
            default:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                A2.b bVar4 = J2.i.f2409e;
                J2.i iVar = (J2.i) this.f5965b;
                long simpleQueryForLong = iVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                J2.a aVar = iVar.f2413d;
                if (iVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * simpleQueryForLong >= aVar.f2392a) {
                    return -1L;
                }
                D2.b bVar5 = (D2.b) this.f5966c;
                Long b5 = J2.i.b(sQLiteDatabase, bVar5);
                if (b5 != null) {
                    insert = b5.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", bVar5.f835a);
                    contentValues.put(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR, Integer.valueOf(M2.a.a(bVar5.f837c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr2 = bVar5.f836b;
                    if (bArr2 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr2, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                D2.a aVar2 = (D2.a) this.f5967d;
                D2.e eVar = aVar2.f832c;
                byte[] bArr3 = eVar.f844b;
                int length = bArr3.length;
                int i7 = aVar.f2396e;
                if (length <= i7) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", aVar2.f830a);
                contentValues2.put("timestamp_ms", Long.valueOf(aVar2.f833d));
                contentValues2.put("uptime_ms", Long.valueOf(aVar2.f834e));
                contentValues2.put("payload_encoding", eVar.f843a.f79a);
                contentValues2.put("code", aVar2.f831b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z8));
                if (z8) {
                    bArr = bArr3;
                } else {
                    bArr = new byte[0];
                }
                contentValues2.put("payload", bArr);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z8) {
                    int ceil = (int) Math.ceil(bArr3.length / i7);
                    for (int i8 = 1; i8 <= ceil; i8++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr3, (i8 - 1) * i7, Math.min(i8 * i7, bArr3.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i8));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(aVar2.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, G3.n] */
    public G3.n b() {
        A.c cVar;
        o oVar = (o) this.f5965b;
        if (oVar != null && (cVar = (A.c) this.f5966c) != null) {
            if (oVar.f1567b == ((T3.a) cVar.f4b).f5335a.length) {
                G3.j jVar = G3.j.f1542m;
                G3.j jVar2 = oVar.f1570e;
                if (jVar2 != jVar && ((Integer) this.f5967d) == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (jVar2 != jVar || ((Integer) this.f5967d) == null) {
                    if (jVar2 == jVar) {
                        T3.a.a(new byte[0]);
                    } else if (jVar2 == G3.j.f1541l) {
                        T3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f5967d).intValue()).array());
                    } else if (jVar2 == G3.j.f1540k) {
                        T3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f5967d).intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((o) this.f5965b).f1570e);
                    }
                    return new Object();
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [G3.r, java.lang.Object] */
    public r c() {
        A.c cVar;
        s sVar = (s) this.f5965b;
        if (sVar != null && (cVar = (A.c) this.f5966c) != null) {
            if (sVar.f1576b == ((T3.a) cVar.f4b).f5335a.length) {
                G3.j jVar = G3.j.f1545p;
                G3.j jVar2 = sVar.f1579e;
                if (jVar2 != jVar && ((Integer) this.f5967d) == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (jVar2 != jVar || ((Integer) this.f5967d) == null) {
                    if (jVar2 == jVar) {
                        T3.a.a(new byte[0]);
                    } else if (jVar2 == G3.j.f1544o) {
                        T3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f5967d).intValue()).array());
                    } else if (jVar2 == G3.j.f1543n) {
                        T3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f5967d).intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((s) this.f5965b).f1579e);
                    }
                    return new Object();
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [G3.v, java.lang.Object] */
    public v d() {
        A.c cVar;
        w wVar = (w) this.f5965b;
        if (wVar != null && (cVar = (A.c) this.f5966c) != null) {
            if (wVar.f1585b == ((T3.a) cVar.f4b).f5335a.length) {
                G3.j jVar = G3.j.f1548s;
                G3.j jVar2 = wVar.f1586c;
                if (jVar2 != jVar && ((Integer) this.f5967d) == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (jVar2 != jVar || ((Integer) this.f5967d) == null) {
                    if (jVar2 == jVar) {
                        T3.a.a(new byte[0]);
                    } else if (jVar2 == G3.j.f1547r) {
                        T3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f5967d).intValue()).array());
                    } else if (jVar2 == G3.j.f1546q) {
                        T3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f5967d).intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((w) this.f5965b).f1586c);
                    }
                    return new Object();
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [K3.a, java.lang.Object] */
    public K3.a e() {
        A.c cVar;
        K3.c cVar2 = (K3.c) this.f5965b;
        if (cVar2 != null && (cVar = (A.c) this.f5966c) != null) {
            if (cVar2.f2631b == ((T3.a) cVar.f4b).f5335a.length) {
                K3.b bVar = K3.b.f2629d;
                K3.b bVar2 = cVar2.f2632c;
                if (bVar2 != bVar && ((Integer) this.f5967d) == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (bVar2 != bVar || ((Integer) this.f5967d) == null) {
                    if (bVar2 == bVar) {
                        T3.a.a(new byte[0]);
                    } else if (bVar2 == K3.b.f2628c) {
                        T3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f5967d).intValue()).array());
                    } else if (bVar2 == K3.b.f2627b) {
                        T3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f5967d).intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesSivParameters.Variant: " + ((K3.c) this.f5965b).f2632c);
                    }
                    return new Object();
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new IllegalArgumentException("Cannot build without parameters and/or key material");
    }

    public N3.a f() {
        A.c cVar;
        T3.a a7;
        N3.e eVar = (N3.e) this.f5965b;
        if (eVar != null && (cVar = (A.c) this.f5966c) != null) {
            if (eVar.f3417b == ((T3.a) cVar.f4b).f5335a.length) {
                N3.d dVar = N3.d.f;
                N3.d dVar2 = eVar.f3419d;
                if (dVar2 != dVar && ((Integer) this.f5967d) == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (dVar2 != dVar || ((Integer) this.f5967d) == null) {
                    if (dVar2 == dVar) {
                        a7 = T3.a.a(new byte[0]);
                    } else if (dVar2 != N3.d.f3406e && dVar2 != N3.d.f3405d) {
                        if (dVar2 == N3.d.f3404c) {
                            a7 = T3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f5967d).intValue()).array());
                        } else {
                            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((N3.e) this.f5965b).f3419d);
                        }
                    } else {
                        a7 = T3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f5967d).intValue()).array());
                    }
                    return new N3.a((N3.e) this.f5965b, a7);
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public N3.e g() {
        Integer num = (Integer) this.f5965b;
        if (num != null) {
            if (((Integer) this.f5966c) != null) {
                if (((N3.d) this.f5967d) != null) {
                    return new N3.e(num.intValue(), ((Integer) this.f5966c).intValue(), (N3.d) this.f5967d);
                }
                throw new GeneralSecurityException("variant not set");
            }
            throw new GeneralSecurityException("tag size not set");
        }
        throw new GeneralSecurityException("key size not set");
    }

    @Override // k6.InterfaceC1408a
    public Object get() {
        switch (this.f5964a) {
            case 8:
                return new D2.i(new e5.b(7), new Z(7), (H2.c) ((F3.o) this.f5965b).get(), (I2.g) ((C1908S) this.f5966c).get(), (I2.h) ((E.e) this.f5967d).get());
            default:
                return new I2.d((Context) ((F2.c) this.f5965b).f1160a, (J2.c) ((InterfaceC1408a) this.f5966c).get(), (I2.b) ((Z) this.f5967d).get());
        }
    }

    @Override // m1.q
    public void h() {
        ((q) this.f5965b).h();
    }

    @Override // U.j
    public Object i(U.i iVar) {
        G.c cVar = new G.c(this, 0);
        G.a r7 = j3.f.r();
        U.m mVar = iVar.f5531c;
        if (mVar != null) {
            mVar.a(cVar, r7);
        }
        ((G.d) this.f5967d).f1330a.set(iVar);
        return "HandlerScheduledFuture-" + ((Callable) this.f5966c).toString();
    }

    public N3.k j() {
        A.c cVar;
        T3.a a7;
        N3.m mVar = (N3.m) this.f5965b;
        if (mVar != null && (cVar = (A.c) this.f5966c) != null) {
            if (mVar.f3429b == ((T3.a) cVar.f4b).f5335a.length) {
                N3.d dVar = N3.d.f3414o;
                N3.d dVar2 = mVar.f3431d;
                if (dVar2 != dVar && ((Integer) this.f5967d) == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (dVar2 != dVar || ((Integer) this.f5967d) == null) {
                    if (dVar2 == dVar) {
                        a7 = T3.a.a(new byte[0]);
                    } else if (dVar2 != N3.d.f3413n && dVar2 != N3.d.f3412m) {
                        if (dVar2 == N3.d.f3411l) {
                            a7 = T3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f5967d).intValue()).array());
                        } else {
                            throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((N3.m) this.f5965b).f3431d);
                        }
                    } else {
                        a7 = T3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f5967d).intValue()).array());
                    }
                    return new N3.k((N3.m) this.f5965b, a7);
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public void k(M.m mVar, Map.Entry entry) {
        InterfaceC0521x interfaceC0521x;
        M.m mVar2 = (M.m) entry.getValue();
        Size size = mVar.f3108g.f7621a;
        Rect rect = ((O.b) entry.getKey()).f3456d;
        if (mVar.f3105c) {
            interfaceC0521x = (InterfaceC0521x) this.f5966c;
        } else {
            interfaceC0521x = null;
        }
        C0061k c0061k = new C0061k(size, rect, interfaceC0521x, ((O.b) entry.getKey()).f, ((O.b) entry.getKey()).f3458g);
        int i7 = ((O.b) entry.getKey()).f3455c;
        mVar2.getClass();
        AbstractC1079a.e();
        mVar2.a();
        g0.c.g("Consumer can only be linked once.", !mVar2.j);
        mVar2.j = true;
        M.l lVar = mVar2.f3112l;
        H.b f4 = H.i.f(lVar.c(), new M.k(mVar2, lVar, i7, c0061k, null), j3.f.C());
        f4.a(new H.h(0, f4, new A.f(this, mVar2, 28, false)), j3.f.C());
    }

    @Override // L5.d
    public void l(ByteBuffer byteBuffer, D5.f fVar) {
        L5.j jVar = (L5.j) this.f5967d;
        L5.o e7 = jVar.f3033c.e(byteBuffer);
        String str = e7.f3038a;
        boolean equals = str.equals("listen");
        AtomicReference atomicReference = (AtomicReference) this.f5966c;
        Object obj = e7.f3039b;
        String str2 = jVar.f3032b;
        L5.s sVar = jVar.f3033c;
        L5.i iVar = (L5.i) this.f5965b;
        if (equals) {
            L5.h hVar = new L5.h(this);
            if (((L5.g) atomicReference.getAndSet(hVar)) != null) {
                try {
                    iVar.b();
                } catch (RuntimeException e8) {
                    Log.e("EventChannel#" + str2, "Failed to close existing event stream", e8);
                }
            }
            try {
                iVar.a(obj, hVar);
                fVar.a(sVar.a(null));
            } catch (RuntimeException e9) {
                atomicReference.set(null);
                Log.e("EventChannel#" + str2, "Failed to open event stream", e9);
                fVar.a(sVar.d(null, "error", e9.getMessage()));
            }
        } else if (str.equals("cancel")) {
            if (((L5.g) atomicReference.getAndSet(null)) != null) {
                try {
                    iVar.b();
                    fVar.a(sVar.a(null));
                    return;
                } catch (RuntimeException e10) {
                    Log.e("EventChannel#" + str2, "Failed to close event stream", e10);
                    fVar.a(sVar.d(null, "error", e10.getMessage()));
                    return;
                }
            }
            fVar.a(sVar.d(null, "error", "No active stream to cancel"));
        } else {
            fVar.a(null);
        }
    }

    public Object m() {
        Object removeLast;
        synchronized (this.f5966c) {
            removeLast = ((ArrayDeque) this.f5965b).removeLast();
        }
        return removeLast;
    }

    public void n(int i7, io.flutter.view.g gVar) {
        ((FlutterJNI) this.f5966c).dispatchSemanticsAction(i7, gVar);
    }

    public void o(int i7, io.flutter.view.g gVar, Serializable serializable) {
        ((FlutterJNI) this.f5966c).dispatchSemanticsAction(i7, gVar, serializable);
    }

    @Override // H.c
    public void onSuccess(Object obj) {
        Surface surface = (Surface) obj;
        G.a r7 = j3.f.r();
        H.i.e(true, (E3.b) this.f5965b, (U.i) this.f5966c, r7);
    }

    public void p(b0 b0Var) {
        InterfaceC0515q interfaceC0515q;
        Y h8 = b0Var.h();
        Object obj = null;
        if (h8 instanceof I.c) {
            interfaceC0515q = ((I.c) h8).f2083a;
        } else {
            interfaceC0515q = null;
        }
        if ((interfaceC0515q.n() != EnumC0513o.LOCKED_FOCUSED && interfaceC0515q.n() != EnumC0513o.PASSIVE_FOCUSED) || interfaceC0515q.g() != EnumC0512n.CONVERGED || interfaceC0515q.k() != EnumC0514p.CONVERGED) {
            ((C1418b) this.f5967d).getClass();
            b0Var.close();
            return;
        }
        synchronized (this.f5966c) {
            try {
                if (((ArrayDeque) this.f5965b).size() >= 3) {
                    obj = m();
                }
                ((ArrayDeque) this.f5965b).addFirst(b0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C1418b) this.f5967d) != null && obj != null) {
            ((b0) obj).close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(java.lang.Class r15) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.k.r(java.lang.Class):java.lang.Object");
    }

    @Override // m1.q
    public G s(int i7, int i8) {
        q qVar = (q) this.f5965b;
        if (i8 != 3) {
            return qVar.s(i7, i8);
        }
        SparseArray sparseArray = (SparseArray) this.f5967d;
        J1.o oVar = (J1.o) sparseArray.get(i7);
        if (oVar != null) {
            return oVar;
        }
        J1.o oVar2 = new J1.o(qVar.s(i7, i8), (J1.j) this.f5966c);
        sparseArray.put(i7, oVar2);
        return oVar2;
    }

    public List t(byte[] bArr) {
        List list = (List) ((ConcurrentHashMap) this.f5965b).get(new F3.q(bArr));
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public String toString() {
        switch (this.f5964a) {
            case 9:
                return u.a((H0) this.f5965b).toString();
            default:
                return super.toString();
        }
    }

    public D2.h u(A2.b bVar, A2.e eVar) {
        Set set = (Set) this.f5965b;
        if (set.contains(bVar)) {
            return new D2.h((D2.b) this.f5966c, bVar, eVar, (D2.i) this.f5967d);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, set));
    }

    public U v(kotlin.jvm.internal.e eVar, String key) {
        U viewModel;
        kotlin.jvm.internal.j.e(key, "key");
        X x7 = (X) this.f5965b;
        x7.getClass();
        LinkedHashMap linkedHashMap = x7.f7927a;
        U u7 = (U) linkedHashMap.get(key);
        boolean d7 = eVar.d(u7);
        W w2 = (W) this.f5966c;
        if (d7) {
            if (w2 instanceof S) {
                S s7 = (S) w2;
                kotlin.jvm.internal.j.b(u7);
                AbstractC0564p abstractC0564p = s7.f7919d;
                if (abstractC0564p != null) {
                    K5.s sVar = s7.f7920e;
                    kotlin.jvm.internal.j.b(sVar);
                    androidx.lifecycle.O.a(u7, sVar, abstractC0564p);
                }
            }
            kotlin.jvm.internal.j.c(u7, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return u7;
        }
        B0.c cVar = new B0.c((B0.b) this.f5967d);
        ((LinkedHashMap) cVar.f229a).put(C0.b.f430a, key);
        try {
            try {
                viewModel = w2.e(eVar, cVar);
            } catch (AbstractMethodError unused) {
                viewModel = w2.c(f7.a.R(eVar));
            }
        } catch (AbstractMethodError unused2) {
            viewModel = w2.n(f7.a.R(eVar), cVar);
        }
        kotlin.jvm.internal.j.e(viewModel, "viewModel");
        U u8 = (U) linkedHashMap.put(key, viewModel);
        if (u8 != null) {
            u8.a();
        }
        return viewModel;
    }

    @Override // K2.b
    public Object w() {
        H2.b bVar = (H2.b) this.f5965b;
        J2.i iVar = (J2.i) bVar.f1973d;
        iVar.getClass();
        D2.b bVar2 = (D2.b) this.f5966c;
        D2.a aVar = (D2.a) this.f5967d;
        String concat = "TransportRuntime.".concat("SQLiteEventStore");
        Log.d(concat, "Storing event with priority=" + bVar2.f837c + ", name=" + aVar.f830a + " for destination " + bVar2.f835a);
        ((Long) iVar.c(new k(iVar, bVar2, aVar, 19))).getClass();
        bVar.f1970a.a(bVar2, 1, false);
        return null;
    }

    @Override // m1.q
    public void x(InterfaceC1426A interfaceC1426A) {
        ((q) this.f5965b).x(interfaceC1426A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, B5.M] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, A.l] */
    public boolean y(KeyEvent keyEvent) {
        if (((HashSet) this.f5966c).remove(keyEvent)) {
            return false;
        }
        N[] nArr = (N[]) this.f5965b;
        if (nArr.length > 0) {
            ?? obj = new Object();
            obj.f331d = this;
            obj.f329b = ((N[]) this.f5965b).length;
            obj.f328a = false;
            obj.f330c = keyEvent;
            for (K k2 : nArr) {
                ?? obj2 = new Object();
                obj2.f26b = obj;
                obj2.f25a = false;
                k2.b(keyEvent, obj2);
            }
            return true;
        }
        B(keyEvent);
        return true;
    }

    @Override // H.c
    public void z(Throwable th) {
        boolean z7 = th instanceof CancellationException;
        U.i iVar = (U.i) this.f5966c;
        if (z7) {
            g0.c.g(null, iVar.b(new RuntimeException(AbstractC0059i.D(new StringBuilder(), (String) this.f5967d, " cancelled."), th)));
        } else {
            iVar.a(null);
        }
    }

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i7) {
        this.f5964a = i7;
        this.f5965b = obj;
        this.f5966c = obj2;
        this.f5967d = obj3;
    }

    public k(Context context) {
        this.f5964a = 0;
        b a7 = b.a(context);
        this.f5965b = a7;
        this.f5966c = a7.b();
        this.f5967d = a7.c();
    }

    public k(X store, W w2, B0.b extras) {
        this.f5964a = 2;
        kotlin.jvm.internal.j.e(store, "store");
        kotlin.jvm.internal.j.e(extras, "extras");
        this.f5965b = store;
        this.f5966c = w2;
        this.f5967d = extras;
    }

    public k(Uri uri, B5.S s7) {
        Uri parse;
        this.f5964a = 3;
        this.f5967d = uri;
        if (s7 == null) {
            parse = C4.c.f536k;
        } else {
            parse = Uri.parse("http://" + ((String) s7.f336c) + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + s7.f335b + "/v0");
        }
        this.f5965b = parse;
        Uri.Builder appendEncodedPath = parse.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String A7 = H4.W.A(uri.getPath());
        if (A7.length() > 0 && !"/".equals(A7)) {
            appendEncodedPath = appendEncodedPath.appendPath("o").appendPath(A7);
        }
        this.f5966c = appendEncodedPath.build();
    }

    public k(C1418b c1418b) {
        this.f5964a = 23;
        this.f5966c = new Object();
        this.f5965b = new ArrayDeque(3);
        this.f5967d = c1418b;
    }

    public k(q qVar, J1.j jVar) {
        this.f5964a = 17;
        this.f5965b = qVar;
        this.f5966c = jVar;
        this.f5967d = new SparseArray();
    }

    public k(D5.b bVar, FlutterJNI flutterJNI) {
        this.f5964a = 21;
        A4.c cVar = new A4.c(this, 13);
        E.e eVar = new E.e(bVar, "flutter/accessibility", x.f3044a, null, 4);
        this.f5965b = eVar;
        eVar.h0(cVar);
        this.f5966c = flutterJNI;
    }

    public k(InterfaceC0521x interfaceC0521x, M.e eVar) {
        this.f5964a = 25;
        this.f5966c = interfaceC0521x;
        this.f5965b = eVar;
    }

    public k(O o7) {
        this.f5964a = 4;
        this.f5966c = new HashSet();
        this.f5967d = o7;
        B b5 = (B) o7;
        this.f5965b = new N[]{new K(b5.getBinaryMessenger()), new A.f(new A.c(b5.getBinaryMessenger()))};
        new A4.c(b5.getBinaryMessenger()).f218b = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [I0.g, java.lang.Object] */
    public k(I0.d[] dVarArr) {
        this.f5964a = 29;
        Q0.N n7 = new Q0.N();
        ?? obj = new Object();
        obj.f2160c = 1.0f;
        obj.f2161d = 1.0f;
        I0.b bVar = I0.b.f2127e;
        obj.f2162e = bVar;
        obj.f = bVar;
        obj.f2163g = bVar;
        obj.f2164h = bVar;
        ByteBuffer byteBuffer = I0.d.f2132a;
        obj.f2166k = byteBuffer;
        obj.f2167l = byteBuffer.asShortBuffer();
        obj.f2168m = byteBuffer;
        obj.f2159b = -1;
        I0.d[] dVarArr2 = new I0.d[dVarArr.length + 2];
        this.f5965b = dVarArr2;
        System.arraycopy(dVarArr, 0, dVarArr2, 0, dVarArr.length);
        this.f5966c = n7;
        this.f5967d = obj;
        dVarArr2[dVarArr.length] = n7;
        dVarArr2[dVarArr.length + 1] = obj;
    }

    public k() {
        this.f5964a = 22;
        this.f5965b = new ConcurrentLinkedQueue();
    }

    public k(L5.j jVar, L5.i iVar) {
        this.f5964a = 24;
        this.f5967d = jVar;
        this.f5966c = new AtomicReference(null);
        this.f5965b = iVar;
    }

    public k(G.d dVar, Handler handler, Callable callable) {
        this.f5964a = 11;
        this.f5967d = dVar;
        this.f5965b = handler;
        this.f5966c = callable;
    }

    public k(ConcurrentHashMap concurrentHashMap, ArrayList arrayList, p pVar, P3.a aVar, Class cls) {
        this.f5964a = 10;
        this.f5965b = concurrentHashMap;
        this.f5966c = pVar;
        this.f5967d = aVar;
    }

    public k(H0 h02, List list) {
        this.f5964a = 9;
        this.f5965b = h02;
        this.f5966c = list;
        this.f5967d = P3.a.f4016b;
    }
}
