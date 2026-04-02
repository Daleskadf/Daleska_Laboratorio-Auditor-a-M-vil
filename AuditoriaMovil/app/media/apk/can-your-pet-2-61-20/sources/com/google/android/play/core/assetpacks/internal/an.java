package com.google.android.play.core.assetpacks.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public abstract class an implements Closeable {
    public abstract long a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract InputStream b(long j, long j2) throws IOException;

    public final synchronized InputStream c() throws IOException {
        return b(0L, a());
    }
}
