package k7;

import android.media.SoundPool;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final SoundPool f13764a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f13765b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f13766c;

    public m(SoundPool soundPool) {
        this.f13764a = soundPool;
        Map synchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.j.d(synchronizedMap, "synchronizedMap(mutableM…<Int, SoundPoolPlayer>())");
        this.f13765b = synchronizedMap;
        Map synchronizedMap2 = DesugarCollections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.j.d(synchronizedMap2, "synchronizedMap(mutableM…List<SoundPoolPlayer>>())");
        this.f13766c = synchronizedMap2;
    }
}
