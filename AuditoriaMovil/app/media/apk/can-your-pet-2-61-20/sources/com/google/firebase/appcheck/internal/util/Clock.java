package com.google.firebase.appcheck.internal.util;
/* loaded from: classes3.dex */
public interface Clock {
    long currentTimeMillis();

    /* loaded from: classes3.dex */
    public static class DefaultClock implements Clock {
        @Override // com.google.firebase.appcheck.internal.util.Clock
        public long currentTimeMillis() {
            return System.currentTimeMillis();
        }
    }
}
