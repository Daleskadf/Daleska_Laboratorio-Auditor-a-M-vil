package com.google.firebase.inappmessaging.internal.time;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
/* loaded from: classes2.dex */
public class SystemClock implements Clock {
    @Override // com.google.firebase.inappmessaging.internal.time.Clock
    @CanIgnoreReturnValue
    public long now() {
        return System.currentTimeMillis();
    }
}
