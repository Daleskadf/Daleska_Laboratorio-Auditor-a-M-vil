package Z1;

import K5.s;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.j;
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f6731a;

    public a(s registry) {
        j.e(registry, "registry");
        this.f6731a = new LinkedHashSet();
        registry.d("androidx.savedstate.Restarter", this);
    }

    @Override // Z1.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f6731a));
        return bundle;
    }
}
