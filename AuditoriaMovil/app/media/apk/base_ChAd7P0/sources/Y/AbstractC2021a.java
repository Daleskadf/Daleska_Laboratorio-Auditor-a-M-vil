package y;

import D.D;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* renamed from: y.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2021a {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f16571a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f16572b;

    static {
        D d7;
        HashMap hashMap = new HashMap();
        f16571a = hashMap;
        HashMap hashMap2 = new HashMap();
        f16572b = hashMap2;
        D d8 = D.f607d;
        hashMap.put(1L, d8);
        hashMap2.put(d8, Collections.singletonList(1L));
        hashMap.put(2L, D.f608e);
        hashMap2.put((D) hashMap.get(2L), Collections.singletonList(2L));
        D d9 = D.f;
        hashMap.put(4L, d9);
        hashMap2.put(d9, Collections.singletonList(4L));
        D d10 = D.f609g;
        hashMap.put(8L, d10);
        hashMap2.put(d10, Collections.singletonList(8L));
        List asList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = asList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            d7 = D.f610h;
            if (!hasNext) {
                break;
            }
            f16571a.put((Long) it.next(), d7);
        }
        f16572b.put(d7, asList);
        List asList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = asList2.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            D d11 = D.f611i;
            if (hasNext2) {
                f16571a.put((Long) it2.next(), d11);
            } else {
                f16572b.put(d11, asList2);
                return;
            }
        }
    }

    public static Long a(D d7, DynamicRangeProfiles dynamicRangeProfiles) {
        Set supportedProfiles;
        List<Long> list = (List) f16572b.get(d7);
        if (list != null) {
            supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
            for (Long l8 : list) {
                if (supportedProfiles.contains(l8)) {
                    return l8;
                }
            }
            return null;
        }
        return null;
    }
}
