package j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;
/* loaded from: classes2.dex */
final class i extends j {

    /* renamed from: d  reason: collision with root package name */
    private final Set f12831d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f12831d = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // j$.time.zone.j
    protected final Set d() {
        return this.f12831d;
    }

    @Override // j$.time.zone.j
    protected final f c(String str) {
        if (this.f12831d.contains(str)) {
            return new f(TimeZone.getTimeZone(str));
        }
        throw new RuntimeException("Not a built-in time zone: " + str);
    }
}
