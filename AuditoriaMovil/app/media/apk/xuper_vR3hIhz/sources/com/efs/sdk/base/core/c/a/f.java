package com.efs.sdk.base.core.c.a;

import com.efs.sdk.base.core.config.remote.RemoteConfig;
import com.efs.sdk.base.core.model.LogDto;
/* loaded from: classes.dex */
public final class f extends a {
    @Override // com.efs.sdk.base.core.c.a.a
    public final void a(LogDto logDto) {
        double d10;
        boolean z10;
        Double d11;
        com.efs.sdk.base.core.config.remote.b a10 = com.efs.sdk.base.core.config.remote.b.a();
        String logType = logDto.getLogType();
        RemoteConfig remoteConfig = a10.f6151d;
        if (remoteConfig.mUploadSampleRateMap.containsKey(logType) && (d11 = remoteConfig.mUploadSampleRateMap.get(logType)) != null) {
            d10 = d11.doubleValue();
        } else {
            d10 = 100.0d;
        }
        if (com.efs.sdk.base.core.config.remote.b.f6148a.nextDouble() * 100.0d <= d10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        b(logDto);
    }
}
