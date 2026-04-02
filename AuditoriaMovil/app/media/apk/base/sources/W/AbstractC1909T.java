package w;

import D.AbstractC0059i;
import android.os.Build;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C0501c;
import androidx.camera.core.impl.y0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import v.C1878a;
/* renamed from: w.T  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1909T {

    /* renamed from: a  reason: collision with root package name */
    public static final C0501c f16117a = new C0501c("camera2.streamSpec.streamUseCase", Long.TYPE, null);

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f16118b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f16119c;

    static {
        HashMap hashMap = new HashMap();
        f16118b = hashMap;
        HashMap hashMap2 = new HashMap();
        f16119c = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            A0 a02 = A0.PREVIEW;
            hashSet.add(a02);
            A0 a03 = A0.METERING_REPEATING;
            hashSet.add(a03);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(a02);
            hashSet2.add(a03);
            hashSet2.add(A0.IMAGE_ANALYSIS);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            A0 a04 = A0.IMAGE_CAPTURE;
            hashSet3.add(a04);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            A0 a05 = A0.VIDEO_CAPTURE;
            hashSet4.add(a05);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(a02);
            hashSet5.add(a04);
            hashSet5.add(a05);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(a02);
            hashSet6.add(a05);
            hashMap2.put(3L, hashSet6);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [A.m, v.a] */
    public static C1878a a(C1878a c1878a, long j) {
        c1878a.getClass();
        C0501c c0501c = f16117a;
        if (AbstractC0059i.a(c1878a, c0501c) && ((Long) AbstractC0059i.p(c1878a, c0501c)).longValue() == j) {
            return null;
        }
        androidx.camera.core.impl.W c8 = androidx.camera.core.impl.W.c(c1878a);
        c8.j(c0501c, Long.valueOf(j));
        return new A.m(c8, 2);
    }

    public static boolean b(A0 a02, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (a02 == A0.STREAM_SHARING) {
            HashMap hashMap = f16119c;
            if (!hashMap.containsKey(Long.valueOf(j))) {
                return false;
            }
            Set set = (Set) hashMap.get(Long.valueOf(j));
            if (list.size() != set.size()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!set.contains((A0) it.next())) {
                    return false;
                }
            }
            return true;
        }
        HashMap hashMap2 = f16118b;
        if (!hashMap2.containsKey(Long.valueOf(j)) || !((Set) hashMap2.get(Long.valueOf(j))).contains(a02)) {
            return false;
        }
        return true;
    }

    public static boolean c(androidx.camera.core.impl.f0 f0Var, A0 a02) {
        if (((Boolean) f0Var.f0(y0.f7689O, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        C0501c c0501c = androidx.camera.core.impl.N.f7568b;
        if (!f0Var.h(c0501c)) {
            return false;
        }
        int intValue = ((Integer) f0Var.G(c0501c)).intValue();
        if (AbstractC1915Z.f16168a[a02.ordinal()] != 1 || intValue != 2) {
            return false;
        }
        return true;
    }
}
