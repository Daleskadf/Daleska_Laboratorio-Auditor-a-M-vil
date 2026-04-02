package com.hpplay.glide.provider;

import com.hpplay.glide.load.Encoder;
import com.hpplay.glide.load.ResourceDecoder;
import com.hpplay.glide.load.ResourceEncoder;
import com.hpplay.glide.load.model.ModelLoader;
import com.hpplay.glide.load.resource.transcode.ResourceTranscoder;
import java.io.File;
/* loaded from: classes2.dex */
public class ChildLoadProvider<A, T, Z, R> implements LoadProvider<A, T, Z, R>, Cloneable {
    private ResourceDecoder<File, Z> cacheDecoder;
    private ResourceEncoder<Z> encoder;
    private final LoadProvider<A, T, Z, R> parent;
    private ResourceDecoder<T, Z> sourceDecoder;
    private Encoder<T> sourceEncoder;
    private ResourceTranscoder<Z, R> transcoder;

    public ChildLoadProvider(LoadProvider<A, T, Z, R> loadProvider) {
        this.parent = loadProvider;
    }

    @Override // com.hpplay.glide.provider.DataLoadProvider
    public ResourceDecoder<File, Z> getCacheDecoder() {
        ResourceDecoder<File, Z> resourceDecoder = this.cacheDecoder;
        if (resourceDecoder != null) {
            return resourceDecoder;
        }
        return this.parent.getCacheDecoder();
    }

    @Override // com.hpplay.glide.provider.DataLoadProvider
    public ResourceEncoder<Z> getEncoder() {
        ResourceEncoder<Z> resourceEncoder = this.encoder;
        if (resourceEncoder != null) {
            return resourceEncoder;
        }
        return this.parent.getEncoder();
    }

    @Override // com.hpplay.glide.provider.LoadProvider
    public ModelLoader<A, T> getModelLoader() {
        return this.parent.getModelLoader();
    }

    @Override // com.hpplay.glide.provider.DataLoadProvider
    public ResourceDecoder<T, Z> getSourceDecoder() {
        ResourceDecoder<T, Z> resourceDecoder = this.sourceDecoder;
        if (resourceDecoder != null) {
            return resourceDecoder;
        }
        return this.parent.getSourceDecoder();
    }

    @Override // com.hpplay.glide.provider.DataLoadProvider
    public Encoder<T> getSourceEncoder() {
        Encoder<T> encoder = this.sourceEncoder;
        if (encoder != null) {
            return encoder;
        }
        return this.parent.getSourceEncoder();
    }

    @Override // com.hpplay.glide.provider.LoadProvider
    public ResourceTranscoder<Z, R> getTranscoder() {
        ResourceTranscoder<Z, R> resourceTranscoder = this.transcoder;
        if (resourceTranscoder != null) {
            return resourceTranscoder;
        }
        return this.parent.getTranscoder();
    }

    public void setCacheDecoder(ResourceDecoder<File, Z> resourceDecoder) {
        this.cacheDecoder = resourceDecoder;
    }

    public void setEncoder(ResourceEncoder<Z> resourceEncoder) {
        this.encoder = resourceEncoder;
    }

    public void setSourceDecoder(ResourceDecoder<T, Z> resourceDecoder) {
        this.sourceDecoder = resourceDecoder;
    }

    public void setSourceEncoder(Encoder<T> encoder) {
        this.sourceEncoder = encoder;
    }

    public void setTranscoder(ResourceTranscoder<Z, R> resourceTranscoder) {
        this.transcoder = resourceTranscoder;
    }

    /* renamed from: clone */
    public ChildLoadProvider<A, T, Z, R> m37clone() {
        try {
            return (ChildLoadProvider) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
