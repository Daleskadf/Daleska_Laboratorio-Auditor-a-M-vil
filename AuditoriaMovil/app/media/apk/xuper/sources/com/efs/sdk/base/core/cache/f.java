package com.efs.sdk.base.core.cache;

import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.util.FileUtil;
import java.io.File;
/* loaded from: classes.dex */
public final class f implements IFileFilter {
    @Override // com.efs.sdk.base.core.cache.IFileFilter
    public final boolean filter(File file) {
        LogDto createLogDtoByName;
        String name = file.getName();
        if (!TextUtils.isEmpty(name) && name.startsWith(Constants.LOG_TYPE_CODELOGPERF)) {
            createLogDtoByName = FileUtil.createCodeLogDtoByName(name);
        } else {
            createLogDtoByName = FileUtil.createLogDtoByName(name);
        }
        if (createLogDtoByName == null) {
            CacheManager.getInstance().onChangeDtoError(file);
            return true;
        } else if (!"wa".equals(createLogDtoByName.getLogType()) && !com.efs.sdk.base.core.b.c.a().a(createLogDtoByName.getLogType(), file.length())) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.efs.sdk.base.core.cache.IFileFilter
    public final void finish() {
    }

    @Override // com.efs.sdk.base.core.cache.IFileFilter
    public final boolean hasTask() {
        return false;
    }

    @Override // com.efs.sdk.base.core.cache.IFileFilter
    public final void finish(boolean z10, boolean z11) {
    }
}
