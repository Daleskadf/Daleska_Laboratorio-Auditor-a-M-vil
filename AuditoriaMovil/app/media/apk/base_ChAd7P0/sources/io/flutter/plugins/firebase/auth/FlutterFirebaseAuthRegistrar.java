package io.flutter.plugins.firebase.auth;

import androidx.annotation.Keep;
import c4.C0632a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FlutterFirebaseAuthRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0632a> getComponents() {
        return Collections.singletonList(F.f.i("flutter-fire-auth", "5.6.0"));
    }
}
