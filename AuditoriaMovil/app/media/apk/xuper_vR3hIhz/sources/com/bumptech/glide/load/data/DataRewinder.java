package com.bumptech.glide.load.data;
/* loaded from: classes.dex */
public interface DataRewinder<T> {

    /* loaded from: classes.dex */
    public interface Factory<T> {
        DataRewinder<T> build(T t10);

        Class<T> getDataClass();
    }

    void cleanup();

    T rewindAndGet();
}
