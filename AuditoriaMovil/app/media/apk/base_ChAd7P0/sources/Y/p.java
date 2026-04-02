package y;

import android.util.Size;
import android.view.Surface;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final List f16588a;

    /* renamed from: b  reason: collision with root package name */
    public final Size f16589b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16590c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16591d;

    /* renamed from: e  reason: collision with root package name */
    public String f16592e;
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public long f16593g = 1;

    public p(Surface surface) {
        Size size;
        int i7;
        int i8 = 0;
        this.f16588a = Collections.singletonList(surface);
        try {
            Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
            declaredMethod.setAccessible(true);
            size = (Size) declaredMethod.invoke(null, surface);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
            org.slf4j.helpers.i.u("OutputConfigCompat", "Unable to retrieve surface size.", e7);
            size = null;
        }
        this.f16589b = size;
        try {
            i8 = ((Integer) Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class).invoke(null, surface)).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e8) {
            org.slf4j.helpers.i.u("OutputConfigCompat", "Unable to retrieve surface format.", e8);
        }
        this.f16590c = i8;
        try {
            i7 = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", null).invoke(surface, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e9) {
            org.slf4j.helpers.i.u("OutputConfigCompat", "Unable to retrieve surface generation id.", e9);
            i7 = -1;
        }
        this.f16591d = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f16589b.equals(pVar.f16589b) || this.f16590c != pVar.f16590c || this.f16591d != pVar.f16591d || this.f != pVar.f || this.f16593g != pVar.f16593g || !Objects.equals(this.f16592e, pVar.f16592e)) {
            return false;
        }
        List list = this.f16588a;
        int size = list.size();
        List list2 = pVar.f16588a;
        int min = Math.min(size, list2.size());
        for (int i7 = 0; i7 < min; i7++) {
            if (list.get(i7) != list2.get(i7)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f16588a.hashCode() ^ 31;
        int i7 = this.f16591d ^ ((hashCode2 << 5) - hashCode2);
        int hashCode3 = this.f16589b.hashCode() ^ ((i7 << 5) - i7);
        int i8 = this.f16590c ^ ((hashCode3 << 5) - hashCode3);
        int i9 = (this.f ? 1 : 0) ^ ((i8 << 5) - i8);
        int i10 = (i9 << 5) - i9;
        String str = this.f16592e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode ^ i10;
        int i12 = (i11 << 5) - i11;
        long j = this.f16593g;
        return ((int) (j ^ (j >>> 32))) ^ i12;
    }
}
