package org.apache.tika.concurrent;

import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public interface ConfigurableThreadPoolExecutor extends ExecutorService {
    void setCorePoolSize(int i7);

    void setMaximumPoolSize(int i7);
}
