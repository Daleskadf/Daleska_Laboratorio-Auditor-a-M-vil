package w;

import D.C0054d;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C0497a;
import androidx.camera.core.impl.C0501c;
import androidx.camera.core.impl.C0506h;
import androidx.camera.core.impl.C0507i;
import androidx.camera.core.impl.r0;
import androidx.camera.core.impl.y0;
import e0.C0927b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* renamed from: w.U  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1910U {

    /* renamed from: i  reason: collision with root package name */
    public final String f16127i;
    public final InterfaceC1920e j;

    /* renamed from: k  reason: collision with root package name */
    public final x.j f16128k;

    /* renamed from: l  reason: collision with root package name */
    public final A.c f16129l;

    /* renamed from: m  reason: collision with root package name */
    public final int f16130m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f16131n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f16132o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f16133p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f16134q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f16135r;

    /* renamed from: s  reason: collision with root package name */
    public C0507i f16136s;

    /* renamed from: u  reason: collision with root package name */
    public final C1904N f16138u;

    /* renamed from: x  reason: collision with root package name */
    public final C0054d f16141x;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f16120a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f16121b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f16122c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f16123d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f16124e = new HashMap();
    public final ArrayList f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f16125g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f16126h = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f16137t = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    public final com.google.firebase.firestore.Z f16139v = new com.google.firebase.firestore.Z(1);

    /* renamed from: w  reason: collision with root package name */
    public final A.m f16140w = new A.m(0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x080b  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, D.d] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1910U(android.content.Context r17, java.lang.String r18, x.p r19, w.InterfaceC1920e r20) {
        /*
            Method dump skipped, instructions count: 2286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1910U.<init>(android.content.Context, java.lang.String, x.p, w.e):void");
    }

    public static Size c(StreamConfigurationMap streamConfigurationMap, int i7, boolean z7) {
        Size[] outputSizes;
        Size[] highResolutionOutputSizes;
        if (i7 == 34) {
            outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(i7);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            F.c cVar = new F.c(false);
            Size size = (Size) Collections.max(Arrays.asList(outputSizes), cVar);
            Size size2 = L.a.f2815a;
            if (z7 && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i7)) != null && highResolutionOutputSizes.length > 0) {
                size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), cVar);
            }
            return (Size) Collections.max(Arrays.asList(size, size2), cVar);
        }
        return null;
    }

    public static int e(Range range, Range range2) {
        boolean z7;
        if (!range.contains((Range) ((Integer) range2.getUpper())) && !range.contains((Range) ((Integer) range2.getLower()))) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.g("Ranges must not intersect", z7);
        if (((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue()) {
            return ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue();
        }
        return ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int f(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public final boolean a(C1919d c1919d, List list) {
        List<r0> list2;
        HashMap hashMap = this.f16124e;
        if (hashMap.containsKey(c1919d)) {
            list2 = (List) hashMap.get(c1919d);
        } else {
            ArrayList arrayList = new ArrayList();
            boolean z7 = c1919d.f16193d;
            int i7 = c1919d.f16190a;
            if (z7) {
                if (i7 == 0) {
                    arrayList.addAll(this.f16125g);
                }
            } else {
                int i8 = c1919d.f16191b;
                if (i8 == 8) {
                    if (i7 != 1) {
                        ArrayList arrayList2 = this.f16120a;
                        if (i7 != 2) {
                            if (c1919d.f16192c) {
                                arrayList2 = this.f16123d;
                            }
                            arrayList.addAll(arrayList2);
                        } else {
                            arrayList.addAll(this.f16121b);
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        arrayList = this.f16122c;
                    }
                } else if (i8 == 10 && i7 == 0) {
                    arrayList.addAll(this.f);
                }
            }
            hashMap.put(c1919d, arrayList);
            list2 = arrayList;
        }
        boolean z8 = false;
        for (r0 r0Var : list2) {
            if (r0Var.c(list) != null) {
                z8 = true;
                continue;
            } else {
                z8 = false;
                continue;
            }
            if (z8) {
                break;
            }
        }
        return z8;
    }

    public final void b() {
        Size size;
        Size size2;
        int parseInt;
        InterfaceC1920e interfaceC1920e;
        CamcorderProfile camcorderProfile;
        CamcorderProfile camcorderProfile2;
        Size e7 = this.f16138u.e();
        try {
            parseInt = Integer.parseInt(this.f16127i);
            interfaceC1920e = this.j;
            camcorderProfile = null;
            if (interfaceC1920e.h(parseInt, 1)) {
                camcorderProfile2 = interfaceC1920e.f(parseInt, 1);
            } else {
                camcorderProfile2 = null;
            }
        } catch (NumberFormatException unused) {
            Size[] outputSizes = ((StreamConfigurationMap) ((C0927b) this.f16128k.b().f15210a).f10587a).getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                size = L.a.f2817c;
            } else {
                Arrays.sort(outputSizes, new F.c(true));
                int length = outputSizes.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        Size size3 = outputSizes[i7];
                        int width = size3.getWidth();
                        Size size4 = L.a.f2819e;
                        if (width <= size4.getWidth() && size3.getHeight() <= size4.getHeight()) {
                            size = size3;
                            break;
                        }
                        i7++;
                    } else {
                        size = L.a.f2817c;
                        break;
                    }
                }
            }
        }
        if (camcorderProfile2 != null) {
            size2 = new Size(camcorderProfile2.videoFrameWidth, camcorderProfile2.videoFrameHeight);
            this.f16136s = new C0507i(L.a.f2816b, new HashMap(), e7, new HashMap(), size2, new HashMap(), new HashMap());
        }
        size = L.a.f2817c;
        if (interfaceC1920e.h(parseInt, 10)) {
            camcorderProfile = interfaceC1920e.f(parseInt, 10);
        } else if (interfaceC1920e.h(parseInt, 8)) {
            camcorderProfile = interfaceC1920e.f(parseInt, 8);
        } else if (interfaceC1920e.h(parseInt, 12)) {
            camcorderProfile = interfaceC1920e.f(parseInt, 12);
        } else if (interfaceC1920e.h(parseInt, 6)) {
            camcorderProfile = interfaceC1920e.f(parseInt, 6);
        } else if (interfaceC1920e.h(parseInt, 5)) {
            camcorderProfile = interfaceC1920e.f(parseInt, 5);
        } else if (interfaceC1920e.h(parseInt, 4)) {
            camcorderProfile = interfaceC1920e.f(parseInt, 4);
        }
        if (camcorderProfile != null) {
            size = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        }
        size2 = size;
        this.f16136s = new C0507i(L.a.f2816b, new HashMap(), e7, new HashMap(), size2, new HashMap(), new HashMap());
    }

    public final List d(C1919d c1919d, List list) {
        C0501c c0501c = AbstractC1909T.f16117a;
        if (c1919d.f16190a == 0 && c1919d.f16191b == 8) {
            Iterator it = this.f16126h.iterator();
            while (it.hasNext()) {
                List c8 = ((r0) it.next()).c(list);
                if (c8 != null) {
                    return c8;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0349, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0aeb, code lost:
        if (r5 < r0) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0b8f, code lost:
        if (f(r14) < f(r2)) goto L628;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0b5b  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0be2  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0cbf  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0cec  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0eaa  */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r41v0, types: [w.U] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair g(int r42, java.util.ArrayList r43, java.util.HashMap r44, boolean r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 4036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1910U.g(int, java.util.ArrayList, java.util.HashMap, boolean, boolean):android.util.Pair");
    }

    public final Pair h(int i7, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i8, HashMap hashMap, HashMap hashMap2) {
        int i9;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0497a c0497a = (C0497a) it.next();
            arrayList4.add(c0497a.f7597a);
            if (hashMap != null) {
                hashMap.put(Integer.valueOf(arrayList4.size() - 1), c0497a);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            Size size = (Size) list.get(i10);
            y0 y0Var = (y0) arrayList2.get(((Integer) arrayList3.get(i10)).intValue());
            int x7 = y0Var.x();
            arrayList4.add(C0506h.c(i7, x7, size, i(x7)));
            if (hashMap2 != null) {
                hashMap2.put(Integer.valueOf(arrayList4.size() - 1), y0Var);
            }
            try {
                i9 = (int) (1.0E9d / ((StreamConfigurationMap) this.f16128k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(y0Var.x(), size));
            } catch (Exception unused) {
                i9 = 0;
            }
            i8 = Math.min(i8, i9);
        }
        return new Pair(arrayList4, Integer.valueOf(i8));
    }

    public final C0507i i(int i7) {
        CameraCharacteristics.Key key;
        ArrayList arrayList = this.f16137t;
        if (!arrayList.contains(Integer.valueOf(i7))) {
            j(this.f16136s.f7633b, L.a.f2818d, i7);
            j(this.f16136s.f7635d, L.a.f, i7);
            HashMap hashMap = this.f16136s.f;
            x.j jVar = this.f16128k;
            Size c8 = c((StreamConfigurationMap) ((C0927b) jVar.b().f15210a).f10587a, i7, true);
            if (c8 != null) {
                hashMap.put(Integer.valueOf(i7), c8);
            }
            HashMap hashMap2 = this.f16136s.f7637g;
            if (Build.VERSION.SDK_INT >= 31 && this.f16135r) {
                key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) jVar.a(key);
                if (streamConfigurationMap != null) {
                    hashMap2.put(Integer.valueOf(i7), c(streamConfigurationMap, i7, true));
                }
            }
            arrayList.add(Integer.valueOf(i7));
        }
        return this.f16136s;
    }

    public final void j(HashMap hashMap, Size size, int i7) {
        if (!this.f16133p) {
            return;
        }
        Size c8 = c((StreamConfigurationMap) ((C0927b) this.f16128k.b().f15210a).f10587a, i7, false);
        Integer valueOf = Integer.valueOf(i7);
        if (c8 != null) {
            size = (Size) Collections.min(Arrays.asList(size, c8), new F.c(false));
        }
        hashMap.put(valueOf, size);
    }
}
