package io.flutter.plugins.firebase.storage;

import androidx.annotation.Keep;
import c4.C0632a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FlutterFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0632a> getComponents() {
        return Collections.singletonList(F.f.i("flutter-fire-gcs", "12.4.7"));
    }
}
