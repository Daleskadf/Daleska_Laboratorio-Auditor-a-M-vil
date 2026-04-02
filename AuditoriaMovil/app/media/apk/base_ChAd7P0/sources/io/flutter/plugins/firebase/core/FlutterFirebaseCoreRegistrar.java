package io.flutter.plugins.firebase.core;

import F.f;
import androidx.annotation.Keep;
import c4.C0632a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FlutterFirebaseCoreRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0632a> getComponents() {
        return Collections.singletonList(f.i("flutter-fire-core", "3.14.0"));
    }
}
