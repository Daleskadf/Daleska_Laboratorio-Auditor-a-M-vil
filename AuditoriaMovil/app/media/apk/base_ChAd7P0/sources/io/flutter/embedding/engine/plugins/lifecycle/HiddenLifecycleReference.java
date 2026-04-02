package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.AbstractC0564p;
@Keep
/* loaded from: classes.dex */
public class HiddenLifecycleReference {
    private final AbstractC0564p lifecycle;

    public HiddenLifecycleReference(AbstractC0564p abstractC0564p) {
        this.lifecycle = abstractC0564p;
    }

    public AbstractC0564p getLifecycle() {
        return this.lifecycle;
    }
}
