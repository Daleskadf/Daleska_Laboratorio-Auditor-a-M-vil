package com.google.firebase.ktx;

import F.f;
import G.i;
import androidx.annotation.Keep;
import c4.C0632a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0632a> getComponents() {
        return i.A(f.i("fire-core-ktx", "21.0.0"));
    }
}
