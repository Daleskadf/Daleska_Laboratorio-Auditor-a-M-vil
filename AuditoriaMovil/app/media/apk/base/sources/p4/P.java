package p4;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Environment;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import b3.C0585f;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.N0;
import e0.C0927b;
import f5.C0993a;
import io.flutter.plugins.googlemaps.C1177j;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import l4.C1418b;
import m6.AbstractC1448i;
import m6.AbstractC1449j;
import org.apache.tika.utils.StringUtils;
import p.C1608t;
import q4.C1709b;
import r3.C1743g;
import s4.C1792b;
import s4.C1794d;
import s4.C1796f;
import z.AbstractC2038a;
/* loaded from: classes.dex */
public class P implements C, L5.p {

    /* renamed from: a  reason: collision with root package name */
    public Object f15210a;

    /* renamed from: b  reason: collision with root package name */
    public Object f15211b;

    /* renamed from: c  reason: collision with root package name */
    public Object f15212c;

    public /* synthetic */ P(Object obj, Object obj2) {
        this.f15210a = obj;
        this.f15211b = obj2;
    }

    public static void n(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public void a(Object... objArr) {
        this.f15212c = new O(objArr, 0);
    }

    public void b() {
        ((u4.e) this.f15212c).d();
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f15211b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            q();
        }
    }

    @Override // p4.C
    public void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        e4.c cVar = q4.g.f15354a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q4.h hVar = (q4.h) it.next();
            arrayList2.add(G.i.x(hVar.f15357a));
            cVar = cVar.m(hVar, q4.n.h(hVar, q4.q.f15370b));
        }
        List emptyList = Collections.emptyList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList3 = new ArrayList(emptyList);
            for (int i7 = 0; it2.hasNext() && i7 < 900 - emptyList.size(); i7++) {
                arrayList3.add(it2.next());
            }
            Object[] array = arrayList3.toArray();
            ((Q) this.f15210a).Q("DELETE FROM remote_documents WHERE path IN (" + ((Object) u4.u.i(array.length, "?", ", ")) + ")", array);
        }
        ((InterfaceC1677g) this.f15212c).u(cVar);
    }

    public Object d(u4.m mVar) {
        Cursor s7 = s();
        try {
            if (s7.moveToFirst()) {
                Object apply = mVar.apply(s7);
                s7.close();
                return apply;
            }
            s7.close();
            return null;
        } catch (Throwable th) {
            if (s7 != null) {
                try {
                    s7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public int e(u4.g gVar) {
        Cursor s7 = s();
        int i7 = 0;
        while (s7.moveToNext()) {
            try {
                i7++;
                gVar.accept(s7);
            } catch (Throwable th) {
                if (s7 != null) {
                    try {
                        s7.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        s7.close();
        return i7;
    }

    public HashMap f(List list, C1709b c1709b, int i7, A4.d dVar, B5.L l8) {
        U3.p pVar = c1709b.f15344a.f15371a;
        StringBuilder i8 = u4.u.i(list.size(), "SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ", " UNION ");
        i8.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        boolean z7 = true;
        Object[] objArr = new Object[(list.size() * 9) + 1];
        Iterator it = list.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            q4.p pVar2 = (q4.p) it.next();
            String x7 = G.i.x(pVar2);
            int i10 = i9 + 1;
            objArr[i9] = x7;
            int i11 = i9 + 2;
            StringBuilder sb = new StringBuilder(x7);
            int length = sb.length() - (z7 ? 1 : 0);
            char charAt = sb.charAt(length);
            Iterator it2 = it;
            if (charAt != z7) {
                z7 = false;
            }
            m5.d.i("successor may only operate on paths generated by encode", z7, new Object[0]);
            sb.setCharAt(length, (char) (charAt + 1));
            objArr[i10] = sb.toString();
            objArr[i11] = Integer.valueOf(pVar2.f15351a.size() + 1);
            long j = pVar.f5765a;
            objArr[i9 + 3] = Long.valueOf(j);
            objArr[i9 + 4] = Long.valueOf(j);
            int i12 = pVar.f5766b;
            objArr[i9 + 5] = Integer.valueOf(i12);
            objArr[i9 + 6] = Long.valueOf(j);
            int i13 = i9 + 8;
            objArr[i9 + 7] = Integer.valueOf(i12);
            i9 += 9;
            objArr[i13] = G.i.x(c1709b.f15345b.f15357a);
            it = it2;
            z7 = true;
        }
        objArr[i9] = Integer.valueOf(i7);
        u4.f fVar = new u4.f();
        HashMap hashMap = new HashMap();
        P R7 = ((Q) this.f15210a).R(i8.toString());
        R7.a(objArr);
        Cursor s7 = R7.s();
        while (s7.moveToNext()) {
            try {
                r(fVar, hashMap, s7, dVar);
                if (l8 != null) {
                    l8.f327a++;
                }
            } catch (Throwable th) {
                if (s7 != null) {
                    try {
                        s7.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        s7.close();
        fVar.a();
        return hashMap;
    }

    public void g(C1177j c1177j) {
        try {
            C1743g c1743g = (C1743g) this.f15211b;
            q3.j jVar = new q3.j(c1177j, 1);
            Parcel zza = c1743g.zza();
            zzc.zze(zza, jVar);
            c1743g.zzc(9, zza);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // p4.C
    public void h(q4.n nVar, q4.q qVar) {
        m5.d.i("Cannot add document to the RemoteDocumentCache with a read time of zero", !qVar.equals(q4.q.f15370b), new Object[0]);
        C1792b E4 = C1794d.E();
        boolean e7 = nVar.e();
        C1608t c1608t = (C1608t) ((C0585f) this.f15211b).f8171b;
        q4.h hVar = nVar.f15362a;
        if (e7) {
            C1796f A7 = s4.g.A();
            String V7 = c1608t.V(hVar);
            A7.d();
            s4.g.v((s4.g) A7.f10006b, V7);
            N0 Z6 = C1608t.Z(nVar.f15364c.f15371a);
            A7.d();
            s4.g.w((s4.g) A7.f10006b, Z6);
            E4.d();
            C1794d.w((C1794d) E4.f10006b, (s4.g) A7.b());
        } else if (nVar.d()) {
            H4.B C7 = H4.D.C();
            String V8 = c1608t.V(hVar);
            C7.d();
            H4.D.v((H4.D) C7.f10006b, V8);
            Map y2 = nVar.f15366e.b().N().y();
            C7.d();
            H4.D.w((H4.D) C7.f10006b).putAll(y2);
            N0 Z7 = C1608t.Z(nVar.f15364c.f15371a);
            C7.d();
            H4.D.x((H4.D) C7.f10006b, Z7);
            E4.d();
            C1794d.x((C1794d) E4.f10006b, (H4.D) C7.b());
        } else if (nVar.f15363b.equals(q4.m.UNKNOWN_DOCUMENT)) {
            s4.m A8 = s4.n.A();
            String V9 = c1608t.V(hVar);
            A8.d();
            s4.n.v((s4.n) A8.f10006b, V9);
            N0 Z8 = C1608t.Z(nVar.f15364c.f15371a);
            A8.d();
            s4.n.w((s4.n) A8.f10006b, Z8);
            E4.d();
            C1794d.y((C1794d) E4.f10006b, (s4.n) A8.b());
        } else {
            m5.d.g("Cannot encode invalid document %s", nVar);
            throw null;
        }
        boolean equals = nVar.f.equals(q4.l.HAS_COMMITTED_MUTATIONS);
        E4.d();
        C1794d.v((C1794d) E4.f10006b, equals);
        String x7 = G.i.x(hVar.f15357a);
        Integer valueOf = Integer.valueOf(hVar.f15357a.f15351a.size());
        U3.p pVar = qVar.f15371a;
        ((Q) this.f15210a).Q("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)", x7, valueOf, Long.valueOf(pVar.f5765a), Integer.valueOf(pVar.f5766b), ((C1794d) E4.b()).d());
        ((InterfaceC1677g) this.f15212c).o(hVar.d());
    }

    @Override // p4.C
    public HashMap i(n4.D d7, C1709b c1709b, Set set, B5.L l8) {
        return f(Collections.singletonList(d7.f), c1709b, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, new A4.d(23, d7, set), l8);
    }

    @Override // p4.C
    public q4.n j(q4.h hVar) {
        return (q4.n) p(Collections.singletonList(hVar)).get(hVar);
    }

    public Size[] k(int i7) {
        boolean z7;
        boolean z8;
        ArrayList arrayList;
        ArrayList arrayList2;
        Size[] sizeArr;
        HashMap hashMap = (HashMap) this.f15212c;
        if (hashMap.containsKey(Integer.valueOf(i7))) {
            if (((Size[]) hashMap.get(Integer.valueOf(i7))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) hashMap.get(Integer.valueOf(i7))).clone();
        }
        Size[] outputSizes = ((StreamConfigurationMap) ((C0927b) this.f15210a).f10587a).getOutputSizes(i7);
        if (outputSizes != null && outputSizes.length != 0) {
            A.f fVar = (A.f) this.f15211b;
            fVar.getClass();
            ArrayList arrayList3 = new ArrayList(Arrays.asList(outputSizes));
            if (((ExtraSupportedOutputSizeQuirk) fVar.f10b) != null) {
                if (i7 == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) {
                    sizeArr = new Size[]{new Size(1440, 1080), new Size(960, 720)};
                } else {
                    sizeArr = new Size[0];
                }
                if (sizeArr.length > 0) {
                    arrayList3.addAll(Arrays.asList(sizeArr));
                }
            }
            A.b bVar = (A.b) fVar.f11c;
            bVar.getClass();
            if (((ExcludedSupportedSizesQuirk) AbstractC2038a.f16621a.a0(ExcludedSupportedSizesQuirk.class)) == null) {
                arrayList2 = new ArrayList();
            } else {
                String str = bVar.f2a;
                String str2 = Build.BRAND;
                if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && i7 == 256) {
                        arrayList.add(new Size(4160, 3120));
                        arrayList.add(new Size(4000, 3000));
                    }
                } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && i7 == 256) {
                        arrayList.add(new Size(4160, 3120));
                        arrayList.add(new Size(4000, 3000));
                    }
                } else {
                    if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList2 = arrayList4;
                        arrayList2 = arrayList4;
                        if (str.equals("0") && (i7 == 34 || i7 == 35)) {
                            arrayList4.add(new Size(720, 720));
                            arrayList4.add(new Size(400, 400));
                            arrayList2 = arrayList4;
                        }
                    } else if (ExcludedSupportedSizesQuirk.c()) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList2 = arrayList5;
                        if (str.equals("0")) {
                            if (i7 != 34) {
                                if (i7 == 35) {
                                    arrayList5.add(new Size(4128, 2322));
                                    arrayList5.add(new Size(3088, 3088));
                                    arrayList5.add(new Size(3264, 2448));
                                    arrayList5.add(new Size(3264, 1836));
                                    arrayList5.add(new Size(RecognitionOptions.PDF417, 1536));
                                    arrayList5.add(new Size(RecognitionOptions.PDF417, 1152));
                                    arrayList5.add(new Size(1920, 1080));
                                    arrayList2 = arrayList5;
                                }
                            } else {
                                arrayList5.add(new Size(4128, 3096));
                                arrayList5.add(new Size(4128, 2322));
                                arrayList5.add(new Size(3088, 3088));
                                arrayList5.add(new Size(3264, 2448));
                                arrayList5.add(new Size(3264, 1836));
                                arrayList5.add(new Size(RecognitionOptions.PDF417, 1536));
                                arrayList5.add(new Size(RecognitionOptions.PDF417, 1152));
                                arrayList5.add(new Size(1920, 1080));
                                arrayList2 = arrayList5;
                            }
                        } else {
                            arrayList2 = arrayList5;
                            arrayList2 = arrayList5;
                            if (str.equals("1") && (i7 == 34 || i7 == 35)) {
                                arrayList5.add(new Size(3264, 2448));
                                arrayList5.add(new Size(3264, 1836));
                                arrayList5.add(new Size(2448, 2448));
                                arrayList5.add(new Size(1920, 1920));
                                arrayList5.add(new Size(RecognitionOptions.PDF417, 1536));
                                arrayList5.add(new Size(RecognitionOptions.PDF417, 1152));
                                arrayList5.add(new Size(1920, 1080));
                                arrayList2 = arrayList5;
                            }
                        }
                    } else if (ExcludedSupportedSizesQuirk.b()) {
                        ArrayList arrayList6 = new ArrayList();
                        arrayList2 = arrayList6;
                        if (str.equals("0")) {
                            if (i7 != 34) {
                                if (i7 == 35) {
                                    arrayList6.add(new Size(RecognitionOptions.PDF417, 1536));
                                    arrayList6.add(new Size(RecognitionOptions.PDF417, 1152));
                                    arrayList6.add(new Size(1920, 1080));
                                    arrayList2 = arrayList6;
                                }
                            } else {
                                arrayList6.add(new Size(4128, 3096));
                                arrayList6.add(new Size(4128, 2322));
                                arrayList6.add(new Size(3088, 3088));
                                arrayList6.add(new Size(3264, 2448));
                                arrayList6.add(new Size(3264, 1836));
                                arrayList6.add(new Size(RecognitionOptions.PDF417, 1536));
                                arrayList6.add(new Size(RecognitionOptions.PDF417, 1152));
                                arrayList6.add(new Size(1920, 1080));
                                arrayList2 = arrayList6;
                            }
                        } else {
                            arrayList2 = arrayList6;
                            arrayList2 = arrayList6;
                            if (str.equals("1") && (i7 == 34 || i7 == 35)) {
                                arrayList6.add(new Size(2576, 1932));
                                arrayList6.add(new Size(2560, 1440));
                                arrayList6.add(new Size(1920, 1920));
                                arrayList6.add(new Size(RecognitionOptions.PDF417, 1536));
                                arrayList6.add(new Size(RecognitionOptions.PDF417, 1152));
                                arrayList6.add(new Size(1920, 1080));
                                arrayList2 = arrayList6;
                            }
                        }
                    } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList2 = arrayList7;
                        if (str.equals("0")) {
                            arrayList2 = arrayList7;
                            if (i7 == 256) {
                                arrayList7.add(new Size(9280, 6944));
                                arrayList2 = arrayList7;
                            }
                        }
                    } else {
                        org.slf4j.helpers.i.O("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                        arrayList2 = Collections.emptyList();
                    }
                }
                arrayList2 = arrayList;
            }
            if (!arrayList2.isEmpty()) {
                arrayList3.removeAll(arrayList2);
            }
            if (arrayList3.isEmpty()) {
                org.slf4j.helpers.i.O("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
            }
            Size[] sizeArr2 = (Size[]) arrayList3.toArray(new Size[0]);
            hashMap.put(Integer.valueOf(i7), sizeArr2);
            return (Size[]) sizeArr2.clone();
        }
        org.slf4j.helpers.i.O("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i7);
        return outputSizes;
    }

    @Override // p4.C
    public void l(InterfaceC1677g interfaceC1677g) {
        this.f15212c = interfaceC1677g;
    }

    public File m(Context context) {
        ((C0993a) this.f15211b).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    @Override // p4.C
    public Map o(String str, C1709b c1709b, int i7) {
        List<q4.p> c8 = ((InterfaceC1677g) this.f15212c).c(str);
        ArrayList arrayList = new ArrayList(c8.size());
        for (q4.p pVar : c8) {
            arrayList.add((q4.p) pVar.a(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyMap();
        }
        if (arrayList.size() * 9 < 900) {
            return f(arrayList, c1709b, i7, null, null);
        }
        HashMap hashMap = new HashMap();
        int i8 = 0;
        while (i8 < arrayList.size()) {
            int i9 = i8 + 100;
            hashMap.putAll(f(arrayList.subList(i8, Math.min(arrayList.size(), i9)), c1709b, i7, null, null));
            i8 = i9;
        }
        K1.d dVar = C1709b.f15343e;
        C1418b c1418b = u4.u.f16019a;
        if (hashMap.size() > i7) {
            ArrayList arrayList2 = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList2, new K.a(dVar, 4));
            hashMap = new HashMap();
            for (int i10 = 0; i10 < i7; i10++) {
                hashMap.put(((Map.Entry) arrayList2.get(i10)).getKey(), ((Map.Entry) arrayList2.get(i10)).getValue());
            }
        }
        return hashMap;
    }

    @Override // L5.p
    public void onMethodCall(L5.o call, L5.q qVar) {
        boolean z7;
        kotlin.jvm.internal.j.e(call, "call");
        if (call.f3038a.equals("getDeviceInfo")) {
            HashMap hashMap = new HashMap();
            String BOARD = Build.BOARD;
            kotlin.jvm.internal.j.d(BOARD, "BOARD");
            hashMap.put("board", BOARD);
            String BOOTLOADER = Build.BOOTLOADER;
            kotlin.jvm.internal.j.d(BOOTLOADER, "BOOTLOADER");
            hashMap.put("bootloader", BOOTLOADER);
            String BRAND = Build.BRAND;
            kotlin.jvm.internal.j.d(BRAND, "BRAND");
            hashMap.put("brand", BRAND);
            String DEVICE = Build.DEVICE;
            kotlin.jvm.internal.j.d(DEVICE, "DEVICE");
            hashMap.put("device", DEVICE);
            String DISPLAY = Build.DISPLAY;
            kotlin.jvm.internal.j.d(DISPLAY, "DISPLAY");
            hashMap.put("display", DISPLAY);
            String FINGERPRINT = Build.FINGERPRINT;
            kotlin.jvm.internal.j.d(FINGERPRINT, "FINGERPRINT");
            hashMap.put("fingerprint", FINGERPRINT);
            String HARDWARE = Build.HARDWARE;
            kotlin.jvm.internal.j.d(HARDWARE, "HARDWARE");
            hashMap.put("hardware", HARDWARE);
            String HOST = Build.HOST;
            kotlin.jvm.internal.j.d(HOST, "HOST");
            hashMap.put("host", HOST);
            String ID = Build.ID;
            kotlin.jvm.internal.j.d(ID, "ID");
            hashMap.put("id", ID);
            String MANUFACTURER = Build.MANUFACTURER;
            kotlin.jvm.internal.j.d(MANUFACTURER, "MANUFACTURER");
            hashMap.put("manufacturer", MANUFACTURER);
            String MODEL = Build.MODEL;
            kotlin.jvm.internal.j.d(MODEL, "MODEL");
            hashMap.put("model", MODEL);
            String PRODUCT = Build.PRODUCT;
            kotlin.jvm.internal.j.d(PRODUCT, "PRODUCT");
            hashMap.put("product", PRODUCT);
            if (Build.VERSION.SDK_INT >= 25) {
                String string = Settings.Global.getString((ContentResolver) this.f15212c, "device_name");
                if (string == null) {
                    string = StringUtils.EMPTY;
                }
                hashMap.put("name", string);
            }
            String[] SUPPORTED_32_BIT_ABIS = Build.SUPPORTED_32_BIT_ABIS;
            kotlin.jvm.internal.j.d(SUPPORTED_32_BIT_ABIS, "SUPPORTED_32_BIT_ABIS");
            hashMap.put("supported32BitAbis", AbstractC1448i.L(Arrays.copyOf(SUPPORTED_32_BIT_ABIS, SUPPORTED_32_BIT_ABIS.length)));
            String[] SUPPORTED_64_BIT_ABIS = Build.SUPPORTED_64_BIT_ABIS;
            kotlin.jvm.internal.j.d(SUPPORTED_64_BIT_ABIS, "SUPPORTED_64_BIT_ABIS");
            hashMap.put("supported64BitAbis", AbstractC1448i.L(Arrays.copyOf(SUPPORTED_64_BIT_ABIS, SUPPORTED_64_BIT_ABIS.length)));
            String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
            kotlin.jvm.internal.j.d(SUPPORTED_ABIS, "SUPPORTED_ABIS");
            hashMap.put("supportedAbis", AbstractC1448i.L(Arrays.copyOf(SUPPORTED_ABIS, SUPPORTED_ABIS.length)));
            String TAGS = Build.TAGS;
            kotlin.jvm.internal.j.d(TAGS, "TAGS");
            hashMap.put("tags", TAGS);
            String TYPE = Build.TYPE;
            kotlin.jvm.internal.j.d(TYPE, "TYPE");
            hashMap.put("type", TYPE);
            String str = "unknown";
            if ((!E6.m.e0(BRAND, "generic") || !E6.m.e0(DEVICE, "generic")) && !E6.m.e0(FINGERPRINT, "generic") && !E6.m.e0(FINGERPRINT, "unknown") && !E6.m.N(HARDWARE, "goldfish") && !E6.m.N(HARDWARE, "ranchu") && !E6.m.N(MODEL, "google_sdk") && !E6.m.N(MODEL, "Emulator") && !E6.m.N(MODEL, "Android SDK built for x86") && !E6.m.N(MANUFACTURER, "Genymotion") && !E6.m.N(PRODUCT, "sdk") && !E6.m.N(PRODUCT, "vbox86p") && !E6.m.N(PRODUCT, "emulator") && !E6.m.N(PRODUCT, "simulator")) {
                z7 = false;
            } else {
                z7 = true;
            }
            hashMap.put("isPhysicalDevice", Boolean.valueOf(!z7));
            FeatureInfo[] systemAvailableFeatures = ((PackageManager) this.f15210a).getSystemAvailableFeatures();
            kotlin.jvm.internal.j.d(systemAvailableFeatures, "packageManager.systemAvailableFeatures");
            ArrayList arrayList = new ArrayList();
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                if (featureInfo.name != null) {
                    arrayList.add(featureInfo);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1449j.M(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((FeatureInfo) it.next()).name);
            }
            hashMap.put("systemFeatures", arrayList2);
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            hashMap.put("freeDiskSize", Long.valueOf(statFs.getFreeBytes()));
            hashMap.put("totalDiskSize", Long.valueOf(statFs.getTotalBytes()));
            HashMap hashMap2 = new HashMap();
            int i7 = Build.VERSION.SDK_INT;
            String BASE_OS = Build.VERSION.BASE_OS;
            kotlin.jvm.internal.j.d(BASE_OS, "BASE_OS");
            hashMap2.put("baseOS", BASE_OS);
            hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
            String SECURITY_PATCH = Build.VERSION.SECURITY_PATCH;
            kotlin.jvm.internal.j.d(SECURITY_PATCH, "SECURITY_PATCH");
            hashMap2.put("securityPatch", SECURITY_PATCH);
            String CODENAME = Build.VERSION.CODENAME;
            kotlin.jvm.internal.j.d(CODENAME, "CODENAME");
            hashMap2.put("codename", CODENAME);
            String INCREMENTAL = Build.VERSION.INCREMENTAL;
            kotlin.jvm.internal.j.d(INCREMENTAL, "INCREMENTAL");
            hashMap2.put("incremental", INCREMENTAL);
            String RELEASE = Build.VERSION.RELEASE;
            kotlin.jvm.internal.j.d(RELEASE, "RELEASE");
            hashMap2.put("release", RELEASE);
            hashMap2.put("sdkInt", Integer.valueOf(i7));
            hashMap.put("version", hashMap2);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) this.f15211b).getMemoryInfo(memoryInfo);
            hashMap.put("isLowRamDevice", Boolean.valueOf(memoryInfo.lowMemory));
            hashMap.put("physicalRamSize", Long.valueOf(memoryInfo.totalMem / 1048576));
            hashMap.put("availableRamSize", Long.valueOf(memoryInfo.availMem / 1048576));
            if (i7 >= 26) {
                try {
                    str = Build.getSerial();
                } catch (SecurityException unused) {
                }
                kotlin.jvm.internal.j.d(str, "try {\n                  …UNKNOWN\n                }");
                hashMap.put("serialNumber", str);
            } else {
                String SERIAL = Build.SERIAL;
                kotlin.jvm.internal.j.d(SERIAL, "SERIAL");
                hashMap.put("serialNumber", SERIAL);
            }
            ((K5.r) qVar).a(hashMap);
            return;
        }
        ((K5.r) qVar).c();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, h1.t] */
    @Override // p4.C
    public HashMap p(Iterable iterable) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            q4.h hVar = (q4.h) it.next();
            arrayList.add(G.i.x(hVar.f15357a));
            hashMap.put(hVar, q4.n.g(hVar));
        }
        ?? obj = new Object();
        obj.f11317a = 0;
        obj.f11318b = (Q) this.f15210a;
        obj.f11319c = "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN (";
        obj.f11321e = Collections.emptyList();
        obj.f11320d = ") ORDER BY path";
        obj.f = arrayList.iterator();
        u4.f fVar = new u4.f();
        while (((Iterator) obj.f).hasNext()) {
            Cursor s7 = obj.q().s();
            while (s7.moveToNext()) {
                try {
                    r(fVar, hashMap, s7, null);
                } catch (Throwable th) {
                    if (s7 != null) {
                        try {
                            s7.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            s7.close();
        }
        fVar.a();
        return hashMap;
    }

    public void q() {
        boolean z7;
        if (((ScheduledFuture) this.f15211b) != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Caller should have verified scheduledFuture is non-null.", z7, new Object[0]);
        this.f15211b = null;
        m5.d.i("Delayed task not found.", ((u4.e) this.f15212c).f15989b.remove(this), new Object[0]);
    }

    public void r(u4.f fVar, final HashMap hashMap, Cursor cursor, final A4.d dVar) {
        final byte[] blob = cursor.getBlob(0);
        final int i7 = cursor.getInt(1);
        final int i8 = cursor.getInt(2);
        Executor executor = fVar;
        if (cursor.isLast()) {
            executor = u4.k.f16005b;
        }
        executor.execute(new Runnable() { // from class: p4.S
            @Override // java.lang.Runnable
            public final void run() {
                P p7 = P.this;
                byte[] bArr = blob;
                int i9 = i7;
                int i10 = i8;
                A4.d dVar2 = dVar;
                HashMap hashMap2 = hashMap;
                p7.getClass();
                try {
                    q4.n E4 = ((C0585f) p7.f15211b).E(C1794d.F(bArr));
                    E4.f15365d = new q4.q(new U3.p(i10, i9));
                    if (dVar2 == null || ((Boolean) dVar2.apply((Object) E4)).booleanValue()) {
                        synchronized (hashMap2) {
                            hashMap2.put(E4.f15362a, E4);
                        }
                    }
                } catch (com.google.protobuf.X e7) {
                    m5.d.g("MaybeDocument failed to parse: %s", e7);
                    throw null;
                }
            }
        });
    }

    public Cursor s() {
        O o7 = (O) this.f15212c;
        String str = (String) this.f15211b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f15210a;
        if (o7 != null) {
            return sQLiteDatabase.rawQueryWithFactory(o7, str, null, null);
        }
        return sQLiteDatabase.rawQuery(str, null);
    }
}
