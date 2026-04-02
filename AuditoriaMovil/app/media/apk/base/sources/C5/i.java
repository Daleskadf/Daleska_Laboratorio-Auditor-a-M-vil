package C5;

import A.m;
import B5.B;
import B5.P;
import C2.n;
import D.AbstractC0059i;
import D.E;
import D.T;
import H0.J;
import L5.p;
import L5.y;
import S0.t;
import a1.C0415A;
import a1.C0429f;
import a1.RunnableC0438o;
import android.database.sqlite.SQLiteDatabase;
import android.media.Image;
import android.net.Uri;
import android.os.Parcel;
import android.util.Log;
import android.view.PointerIcon;
import android.window.BackEvent;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.core.impl.C0501c;
import androidx.camera.core.impl.C0502d;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.r;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.firestore.Z;
import e1.S;
import e1.V;
import e1.W;
import e1.b0;
import h4.C1082b;
import i1.q;
import j$.util.Map;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.StringUtils;
import s3.C1786n;
import z.AbstractC2038a;
/* loaded from: classes.dex */
public final class i implements E, H.c, K2.b, F2.b, p, i1.i, R0.i, q3.b, V, W1.d, InterfaceC0747v, S, r {

    /* renamed from: c  reason: collision with root package name */
    public static volatile i f591c;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f592a;

    /* renamed from: b  reason: collision with root package name */
    public Object f593b;

    public /* synthetic */ i(Object obj, int i7) {
        this.f592a = i7;
        this.f593b = obj;
    }

    public static HashMap i0(BackEvent backEvent) {
        float touchX;
        float touchY;
        List list;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        if (!Float.isNaN(touchX) && !Float.isNaN(touchY)) {
            list = Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY));
        } else {
            list = null;
        }
        hashMap.put("touchOffset", list);
        progress = backEvent.getProgress();
        hashMap.put("progress", Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", Integer.valueOf(swipeEdge));
        return hashMap;
    }

    public static i k0(G g3) {
        i iVar = new i(4);
        g3.m(new A4.d(1, iVar, g3));
        return iVar;
    }

    @Override // e1.V
    public void B(W w2) {
        U0.r rVar = (U0.r) w2;
        U0.l lVar = (U0.l) this.f593b;
        lVar.f5618l0.B(lVar);
    }

    @Override // R0.i
    public long C(long j, long j8) {
        return -9223372036854775807L;
    }

    @Override // R0.i
    public S0.j D(long j) {
        return (S0.j) this.f593b;
    }

    @Override // i1.i
    public void E(i1.k kVar, long j, long j8, boolean z7) {
        switch (this.f592a) {
            case 19:
                ((R0.h) this.f593b).w((q) kVar, j, j8);
                return;
            default:
                C0429f c0429f = (C0429f) kVar;
                return;
        }
    }

    @Override // androidx.camera.core.impl.G
    public /* synthetic */ Object G(C0501c c0501c) {
        return AbstractC0059i.p(this, c0501c);
    }

    @Override // androidx.camera.core.impl.G
    public /* synthetic */ Set H() {
        return AbstractC0059i.n(this);
    }

    @Override // R0.i
    public boolean I() {
        return true;
    }

    @Override // D.E
    public androidx.camera.core.impl.V M() {
        throw null;
    }

    @Override // W1.d
    public void N() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // R0.i
    public long R() {
        return 0L;
    }

    @Override // e1.S
    public void T() {
        a1.r rVar = (a1.r) this.f593b;
        rVar.f6883b.post(new RunnableC0438o(rVar, 1));
    }

    @Override // androidx.camera.core.impl.G
    public /* synthetic */ Set U(C0501c c0501c) {
        return AbstractC0059i.g(this, c0501c);
    }

    @Override // q3.b
    public void W(C1786n c1786n) {
        ((T4.h) this.f593b).getClass();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
    public void accept(Object obj, Object obj2) {
        Y2.a aVar = (Y2.a) ((Y2.c) obj).getService();
        Parcel zaa = aVar.zaa();
        zac.zac(zaa, (x) this.f593b);
        aVar.zad(1, zaa);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override // R0.i
    public long b(long j) {
        return 0L;
    }

    @Override // R0.i
    public long b0(long j) {
        return 1L;
    }

    @Override // R0.i
    public long c(long j, long j8) {
        return 0L;
    }

    @Override // R0.i
    public long c0(long j, long j8) {
        return 1L;
    }

    @Override // androidx.camera.core.impl.G
    public /* synthetic */ F e0(C0501c c0501c) {
        return AbstractC0059i.e(this, c0501c);
    }

    @Override // androidx.camera.core.impl.G
    public /* synthetic */ Object f0(C0501c c0501c, Object obj) {
        return AbstractC0059i.q(this, c0501c, obj);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractMap, java.util.HashMap, B5.P] */
    public void g0(String str) {
        PointerIcon systemIcon;
        M0.x xVar = (M0.x) this.f593b;
        N5.a aVar = (N5.a) xVar.f3210b;
        P p7 = M0.x.f3208d;
        Integer valueOf = Integer.valueOf((int) PipesIterator.DEFAULT_QUEUE_SIZE);
        if (p7 == null) {
            ?? hashMap = new HashMap();
            hashMap.put(MimeTypesReaderMetKeys.ALIAS_TAG, 1010);
            hashMap.put("allScroll", 1013);
            hashMap.put("basic", valueOf);
            hashMap.put("cell", 1006);
            hashMap.put("click", 1002);
            hashMap.put("contextMenu", 1001);
            hashMap.put("copy", 1011);
            hashMap.put("forbidden", 1012);
            hashMap.put("grab", 1020);
            hashMap.put("grabbing", 1021);
            hashMap.put("help", 1003);
            hashMap.put("move", 1013);
            hashMap.put("none", 0);
            hashMap.put("noDrop", 1012);
            hashMap.put("precise", 1007);
            hashMap.put("text", 1008);
            hashMap.put("resizeColumn", 1014);
            hashMap.put("resizeDown", 1015);
            hashMap.put("resizeUpLeft", 1016);
            hashMap.put("resizeDownRight", 1017);
            hashMap.put("resizeLeft", 1014);
            hashMap.put("resizeLeftRight", 1014);
            hashMap.put("resizeRight", 1014);
            hashMap.put("resizeRow", 1015);
            hashMap.put("resizeUp", 1015);
            hashMap.put("resizeUpDown", 1015);
            hashMap.put("resizeUpLeft", 1017);
            hashMap.put("resizeUpRight", 1016);
            hashMap.put("resizeUpLeftDownRight", 1017);
            hashMap.put("resizeUpRightDownLeft", 1016);
            hashMap.put("verticalText", 1009);
            hashMap.put("wait", 1004);
            hashMap.put("zoomIn", 1018);
            hashMap.put("zoomOut", 1019);
            M0.x.f3208d = hashMap;
        }
        systemIcon = PointerIcon.getSystemIcon(((B) ((N5.a) xVar.f3210b)).getContext(), ((Integer) Map.EL.getOrDefault(M0.x.f3208d, str, valueOf)).intValue());
        aVar.setPointerIcon(systemIcon);
    }

    @Override // k6.InterfaceC1408a
    public Object get() {
        return new J2.i(new e5.b(7), new Z(7), J2.a.f, (J2.l) ((m) this.f593b).get());
    }

    @Override // androidx.camera.core.impl.G
    public /* synthetic */ boolean h(C0501c c0501c) {
        return AbstractC0059i.a(this, c0501c);
    }

    public B2.c h0(Object obj) {
        InputStream inputStream;
        B2.b bVar = (B2.b) obj;
        B2.d dVar = (B2.d) this.f593b;
        m5.d.c(bVar.f246a, "CctTransportBackend", "Making request to: %s");
        HttpURLConnection httpURLConnection = (HttpURLConnection) bVar.f246a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(dVar.f257g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/2.3.3 android/");
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = bVar.f248c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                C0415A c0415a = dVar.f252a;
                C2.j jVar = bVar.f247b;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                j4.d dVar2 = (j4.d) c0415a.f6744a;
                j4.e eVar = new j4.e(bufferedWriter, dVar2.f13447a, dVar2.f13448b, dVar2.f13449c, dVar2.f13450d);
                eVar.a(jVar);
                eVar.c();
                eVar.f13452b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Log.i("TransportRuntime.".concat("CctTransportBackend"), io.flutter.plugins.pathprovider.b.e(responseCode, "Status Code: "));
                Log.i("TransportRuntime.".concat("CctTransportBackend"), "Content-Type: " + httpURLConnection.getHeaderField(HttpHeaders.CONTENT_TYPE));
                Log.i("TransportRuntime.".concat("CctTransportBackend"), "Content-Encoding: " + httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new B2.c(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        B2.c cVar = new B2.c(responseCode, null, n.a(new BufferedReader(new InputStreamReader(inputStream))).f525a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return cVar;
                    } catch (Throwable th) {
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                }
                return new B2.c(responseCode, new URL(httpURLConnection.getHeaderField(HttpHeaders.LOCATION)), 0L);
            } catch (Throwable th2) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th2;
            }
        } catch (C1082b e7) {
            e = e7;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't encode request, returning with 400", e);
            return new B2.c(400, null, 0L);
        } catch (ConnectException e8) {
            e = e8;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't open connection, returning with 500", e);
            return new B2.c(500, null, 0L);
        } catch (UnknownHostException e9) {
            e = e9;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't open connection, returning with 500", e);
            return new B2.c(500, null, 0L);
        } catch (IOException e10) {
            e = e10;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't encode request, returning with 400", e);
            return new B2.c(400, null, 0L);
        }
    }

    @Override // W1.d
    public void i(int i7, Serializable serializable) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = StringUtils.EMPTY;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 != 6 && i7 != 7 && i7 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        }
        ((ProfileInstallReceiver) this.f593b).setResultCode(i7);
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [R0.a, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, i1.p] */
    @Override // i1.i
    public void j(i1.k kVar, long j, long j8) {
        int size;
        switch (this.f592a) {
            case 19:
                q qVar = (q) kVar;
                R0.h hVar = (R0.h) this.f593b;
                hVar.getClass();
                long j9 = qVar.f11432a;
                Uri uri = qVar.f11435d.f3133c;
                e1.r rVar = new e1.r(j8);
                hVar.f4578h0.getClass();
                hVar.f4582l0.e(rVar, qVar.f11434c);
                S0.c cVar = (S0.c) qVar.f;
                S0.c cVar2 = hVar.f4564C0;
                if (cVar2 == null) {
                    size = 0;
                } else {
                    size = cVar2.f4857m.size();
                }
                long j10 = cVar.b(0).f4879b;
                int i7 = 0;
                while (i7 < size && hVar.f4564C0.b(i7).f4879b < j10) {
                    i7++;
                }
                if (cVar.f4850d) {
                    if (size - i7 > cVar.f4857m.size()) {
                        K0.a.A("DashMediaSource", "Loaded out of sync manifest");
                    } else {
                        long j11 = hVar.f4570I0;
                        if (j11 != -9223372036854775807L && cVar.f4853h * 1000 <= j11) {
                            K0.a.A("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f4853h + ", " + hVar.f4570I0);
                        } else {
                            hVar.f4569H0 = 0;
                        }
                    }
                    int i8 = hVar.f4569H0;
                    hVar.f4569H0 = i8 + 1;
                    if (i8 < hVar.f4578h0.w(qVar.f11434c)) {
                        hVar.f4594y0.postDelayed(hVar.q0, Math.min((hVar.f4569H0 - 1) * PipesIterator.DEFAULT_QUEUE_SIZE, 5000));
                        return;
                    }
                    hVar.f4593x0 = new IOException();
                    return;
                }
                hVar.f4564C0 = cVar;
                hVar.f4565D0 = cVar.f4850d & hVar.f4565D0;
                hVar.f4566E0 = j - j8;
                hVar.f4567F0 = j;
                hVar.f4571J0 += i7;
                synchronized (hVar.f4585o0) {
                    try {
                        if (qVar.f11433b.f3172a == hVar.f4562A0) {
                            Uri uri2 = hVar.f4564C0.f4855k;
                            if (uri2 == null) {
                                uri2 = qVar.f11435d.f3133c;
                            }
                            hVar.f4562A0 = uri2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                S0.c cVar3 = hVar.f4564C0;
                if (cVar3.f4850d && hVar.f4568G0 == -9223372036854775807L) {
                    t tVar = cVar3.f4854i;
                    if (tVar != null) {
                        String str = tVar.f4912b;
                        if (!K0.x.a(str, "urn:mpeg:dash:utc:direct:2014") && !K0.x.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                            if (!K0.x.a(str, "urn:mpeg:dash:utc:http-iso:2014") && !K0.x.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                                if (!K0.x.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !K0.x.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                                    if (!K0.x.a(str, "urn:mpeg:dash:utc:ntp:2014") && !K0.x.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                        hVar.x(new IOException("Unsupported UTC timing scheme"));
                                        return;
                                    } else {
                                        hVar.v();
                                        return;
                                    }
                                }
                                q qVar2 = new q(hVar.f4590u0, Uri.parse(tVar.f4913c), 5, new e5.b(8));
                                hVar.f4582l0.k(new e1.r(qVar2.f11432a, qVar2.f11433b, hVar.f4591v0.f(qVar2, new R0.e(hVar), 1)), qVar2.f11434c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                                return;
                            }
                            q qVar3 = new q(hVar.f4590u0, Uri.parse(tVar.f4913c), 5, new Object());
                            hVar.f4582l0.k(new e1.r(qVar3.f11432a, qVar3.f11433b, hVar.f4591v0.f(qVar3, new R0.e(hVar), 1)), qVar3.f11434c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                            return;
                        }
                        try {
                            hVar.f4568G0 = K0.x.P(tVar.f4913c) - hVar.f4567F0;
                            hVar.z(true);
                            return;
                        } catch (J e7) {
                            hVar.x(e7);
                            return;
                        }
                    }
                    hVar.v();
                    return;
                }
                hVar.z(true);
                return;
            default:
                C0429f c0429f = (C0429f) kVar;
                a1.r rVar2 = (a1.r) this.f593b;
                if (rVar2.o() == 0) {
                    if (!rVar2.q0) {
                        a1.r.y(rVar2);
                        return;
                    }
                    return;
                }
                int i9 = 0;
                while (true) {
                    ArrayList arrayList = rVar2.f6886e;
                    if (i9 < arrayList.size()) {
                        a1.q qVar4 = (a1.q) arrayList.get(i9);
                        if (qVar4.f6874a.f6871b == c0429f) {
                            qVar4.a();
                        } else {
                            i9++;
                        }
                    }
                }
                rVar2.f6885d.f6862j0 = 1;
                return;
        }
    }

    public m j0() {
        return new m(androidx.camera.core.impl.Z.a((androidx.camera.core.impl.W) this.f593b), 2);
    }

    public ByteBuffer l0() {
        return ((Image.Plane) this.f593b).getBuffer();
    }

    @Override // androidx.camera.core.impl.G
    public /* synthetic */ void m(A4.d dVar) {
        AbstractC0059i.b(this, dVar);
    }

    public int m0() {
        return ((Image.Plane) this.f593b).getPixelStride();
    }

    @Override // androidx.camera.core.impl.G
    public /* synthetic */ Object n(C0501c c0501c, F f) {
        return AbstractC0059i.r(this, c0501c, f);
    }

    public int n0() {
        return ((Image.Plane) this.f593b).getRowStride();
    }

    public void o0() {
        if (((androidx.camera.core.impl.Z) u()).f0(r.f7667s, null) == null) {
            return;
        }
        throw new ClassCastException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0427, code lost:
        if (r13 != true) goto L172;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0281 A[Catch: JSONException -> 0x011e, TryCatch #10 {JSONException -> 0x011e, blocks: (B:53:0x0103, B:54:0x010e, B:106:0x01c1, B:107:0x01ca, B:108:0x01ff, B:115:0x0225, B:111:0x0218, B:114:0x021f, B:116:0x0238, B:117:0x0262, B:119:0x0266, B:123:0x0277, B:125:0x0281, B:126:0x0292, B:121:0x026b, B:127:0x029b, B:129:0x02ad, B:131:0x02ba, B:130:0x02b7, B:132:0x02c3, B:134:0x02d7, B:135:0x02da, B:143:0x030d, B:144:0x0321, B:209:0x0456, B:214:0x0478, B:216:0x048a, B:218:0x049d, B:217:0x049a, B:142:0x0300, B:151:0x035f, B:158:0x0385, B:170:0x03d3, B:207:0x0449, B:212:0x046c, B:221:0x04a6, B:56:0x0113, B:61:0x0121, B:64:0x012c, B:67:0x0138, B:70:0x0143, B:73:0x014e, B:76:0x015a, B:79:0x0164, B:82:0x016e, B:85:0x0178, B:88:0x0182, B:91:0x018c, B:94:0x0196, B:97:0x01a1, B:100:0x01ac, B:160:0x0392, B:162:0x039c, B:163:0x039f, B:165:0x03b7, B:167:0x03c9, B:166:0x03c0), top: B:252:0x0103, inners: #2, #4, #8, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0292 A[Catch: JSONException -> 0x011e, TryCatch #10 {JSONException -> 0x011e, blocks: (B:53:0x0103, B:54:0x010e, B:106:0x01c1, B:107:0x01ca, B:108:0x01ff, B:115:0x0225, B:111:0x0218, B:114:0x021f, B:116:0x0238, B:117:0x0262, B:119:0x0266, B:123:0x0277, B:125:0x0281, B:126:0x0292, B:121:0x026b, B:127:0x029b, B:129:0x02ad, B:131:0x02ba, B:130:0x02b7, B:132:0x02c3, B:134:0x02d7, B:135:0x02da, B:143:0x030d, B:144:0x0321, B:209:0x0456, B:214:0x0478, B:216:0x048a, B:218:0x049d, B:217:0x049a, B:142:0x0300, B:151:0x035f, B:158:0x0385, B:170:0x03d3, B:207:0x0449, B:212:0x046c, B:221:0x04a6, B:56:0x0113, B:61:0x0121, B:64:0x012c, B:67:0x0138, B:70:0x0143, B:73:0x014e, B:76:0x015a, B:79:0x0164, B:82:0x016e, B:85:0x0178, B:88:0x0182, B:91:0x018c, B:94:0x0196, B:97:0x01a1, B:100:0x01ac, B:160:0x0392, B:162:0x039c, B:163:0x039f, B:165:0x03b7, B:167:0x03c9, B:166:0x03c0), top: B:252:0x0103, inners: #2, #4, #8, #12 }] */
    @Override // L5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMethodCall(L5.o r20, L5.q r21) {
        /*
            Method dump skipped, instructions count: 1474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C5.i.onMethodCall(L5.o, L5.q):void");
    }

    @Override // H.c
    public void onSuccess(Object obj) {
        switch (this.f592a) {
            case 6:
                Void r22 = (Void) obj;
                return;
            case 7:
                Void r23 = (Void) obj;
                ((M.h) this.f593b).run();
                return;
            default:
                U.i iVar = (U.i) this.f593b;
                try {
                    iVar.a(obj);
                    return;
                } catch (Throwable th) {
                    iVar.b(th);
                    return;
                }
        }
    }

    public void q0(R0.a aVar) {
        boolean z7 = aVar instanceof a1.t;
        a1.r rVar = (a1.r) this.f593b;
        if (z7 && !rVar.q0) {
            a1.r.y(rVar);
        } else {
            rVar.f6889g0 = aVar;
        }
    }

    @Override // R0.i
    public long r(long j, long j8) {
        return 0L;
    }

    public void r0() {
        U0.r[] rVarArr;
        U0.r[] rVarArr2;
        U0.l lVar = (U0.l) this.f593b;
        int i7 = lVar.f5619m0 - 1;
        lVar.f5619m0 = i7;
        if (i7 > 0) {
            return;
        }
        int i8 = 0;
        for (U0.r rVar : lVar.f5621o0) {
            rVar.a();
            i8 += rVar.f5653D0.f10780a;
        }
        H0.W[] wArr = new H0.W[i8];
        int i9 = 0;
        for (U0.r rVar2 : lVar.f5621o0) {
            rVar2.a();
            int i10 = rVar2.f5653D0.f10780a;
            int i11 = 0;
            while (i11 < i10) {
                rVar2.a();
                wArr[i9] = rVar2.f5653D0.a(i11);
                i11++;
                i9++;
            }
        }
        lVar.f5620n0 = new b0(wArr);
        lVar.f5618l0.a(lVar);
    }

    public void s0(String str, IOException iOException) {
        IOException iOException2;
        if (iOException == null) {
            iOException2 = new IOException(str);
        } else {
            iOException2 = new IOException(str, iOException);
        }
        ((a1.r) this.f593b).f6888f0 = iOException2;
    }

    @Override // androidx.camera.core.impl.f0
    public G u() {
        return androidx.camera.core.impl.Z.f7595c;
    }

    @Override // K2.b
    public Object w() {
        J2.i iVar = (J2.i) ((J2.c) this.f593b);
        long o7 = iVar.f2411b.o() - iVar.f2413d.f2395d;
        SQLiteDatabase a7 = iVar.a();
        a7.beginTransaction();
        try {
            int delete = a7.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(o7)});
            a7.setTransactionSuccessful();
            a7.endTransaction();
            return Integer.valueOf(delete);
        } catch (Throwable th) {
            a7.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Type inference failed for: r7v7, types: [R0.a, java.io.IOException] */
    @Override // i1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T1.e y(i1.k r5, long r6, long r8, java.io.IOException r10, int r11) {
        /*
            r4 = this;
            r6 = 0
            int r7 = r4.f592a
            switch(r7) {
                case 19: goto L39;
                default: goto L6;
            }
        L6:
            a1.f r5 = (a1.C0429f) r5
            java.lang.Object r6 = r4.f593b
            a1.r r6 = (a1.r) r6
            boolean r7 = r6.f6896n0
            if (r7 != 0) goto L13
            r6.f6888f0 = r10
            goto L36
        L13:
            java.lang.Throwable r7 = r10.getCause()
            boolean r7 = r7 instanceof java.net.BindException
            if (r7 == 0) goto L27
            int r5 = r6.f6898p0
            int r7 = r5 + 1
            r6.f6898p0 = r7
            r6 = 3
            if (r5 >= r6) goto L36
            T1.e r5 = i1.n.f11427d
            goto L38
        L27:
            R0.a r7 = new R0.a
            a1.v r5 = r5.f6809b
            android.net.Uri r5 = r5.f6910b
            java.lang.String r5 = r5.toString()
            r7.<init>(r5, r10)
            r6.f6889g0 = r7
        L36:
            T1.e r5 = i1.n.f11428e
        L38:
            return r5
        L39:
            i1.q r5 = (i1.q) r5
            java.lang.Object r7 = r4.f593b
            R0.h r7 = (R0.h) r7
            r7.getClass()
            e1.r r0 = new e1.r
            long r1 = r5.f11432a
            M0.B r1 = r5.f11435d
            android.net.Uri r1 = r1.f3133c
            r0.<init>(r8)
            com.google.firebase.firestore.Z r8 = r7.f4578h0
            r8.getClass()
            boolean r8 = r10 instanceof H0.J
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 != 0) goto L8b
            boolean r8 = r10 instanceof java.io.FileNotFoundException
            if (r8 != 0) goto L8b
            boolean r8 = r10 instanceof M0.t
            if (r8 != 0) goto L8b
            boolean r8 = r10 instanceof i1.m
            if (r8 != 0) goto L8b
            int r8 = M0.i.f3158b
            r8 = r10
        L6a:
            if (r8 == 0) goto L7f
            boolean r9 = r8 instanceof M0.i
            if (r9 == 0) goto L7a
            r9 = r8
            M0.i r9 = (M0.i) r9
            int r9 = r9.f3159a
            r3 = 2008(0x7d8, float:2.814E-42)
            if (r9 != r3) goto L7a
            goto L8b
        L7a:
            java.lang.Throwable r8 = r8.getCause()
            goto L6a
        L7f:
            int r11 = r11 + (-1)
            int r11 = r11 * 1000
            r8 = 5000(0x1388, float:7.006E-42)
            int r8 = java.lang.Math.min(r11, r8)
            long r8 = (long) r8
            goto L8c
        L8b:
            r8 = r1
        L8c:
            int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r11 != 0) goto L93
            T1.e r6 = i1.n.f
            goto L99
        L93:
            T1.e r11 = new T1.e
            r11.<init>(r6, r8, r6)
            r6 = r11
        L99:
            boolean r8 = r6.a()
            r8 = r8 ^ 1
            T0.d r7 = r7.f4582l0
            int r5 = r5.f11434c
            r7.i(r0, r5, r10, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: C5.i.y(i1.k, long, long, java.io.IOException, int):T1.e");
    }

    @Override // H.c
    public void z(Throwable th) {
        switch (this.f592a) {
            case 6:
                ((T) this.f593b).close();
                return;
            case 7:
                return;
            default:
                ((U.i) this.f593b).b(th);
                return;
        }
    }

    public i(D5.b bVar, int i7) {
        this.f592a = i7;
        switch (i7) {
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                this.f593b = new E.e(bVar, "flutter/system", L5.l.f3036a, null, 4);
                return;
            default:
                t2.i iVar = new t2.i(6);
                L5.r rVar = new L5.r(bVar, "flutter/backgesture", y.f3047b, null);
                this.f593b = rVar;
                rVar.b(iVar);
                return;
        }
    }

    public i(int i7) {
        this.f592a = i7;
        switch (i7) {
            case 1:
                this.f593b = (SmallDisplaySizeQuirk) AbstractC2038a.f16621a.a0(SmallDisplaySizeQuirk.class);
                return;
            case 2:
                this.f593b = (ExtraCroppingQuirk) AbstractC2038a.f16621a.a0(ExtraCroppingQuirk.class);
                return;
            case 4:
                this.f593b = androidx.camera.core.impl.W.b();
                return;
            case 8:
                return;
            case 28:
                this.f593b = new C0502d(new Object());
                return;
            default:
                this.f593b = new HashMap();
                return;
        }
    }

    private final void p0(Throwable th) {
    }

    @Override // R0.i
    public long k(long j, long j8) {
        return j8;
    }
}
