package com.hpplay.glide.load.engine;

import android.os.Looper;
import com.hpplay.glide.load.Key;
/* loaded from: classes2.dex */
class EngineResource<Z> implements Resource<Z> {
    private int acquired;
    private final boolean isCacheable;
    private boolean isRecycled;
    private Key key;
    private ResourceListener listener;
    private final Resource<Z> resource;

    /* loaded from: classes2.dex */
    public interface ResourceListener {
        void onResourceReleased(Key key, EngineResource<?> engineResource);
    }

    public EngineResource(Resource<Z> resource, boolean z10) {
        if (resource != null) {
            this.resource = resource;
            this.isCacheable = z10;
            return;
        }
        throw new NullPointerException("Wrapped resource must not be null");
    }

    public void acquire() {
        if (!this.isRecycled) {
            if (Looper.getMainLooper().equals(Looper.myLooper())) {
                this.acquired++;
                return;
            }
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
        throw new IllegalStateException("Cannot acquire a recycled resource");
    }

    @Override // com.hpplay.glide.load.engine.Resource
    public Z get() {
        return this.resource.get();
    }

    @Override // com.hpplay.glide.load.engine.Resource
    public int getSize() {
        return this.resource.getSize();
    }

    public boolean isCacheable() {
        return this.isCacheable;
    }

    @Override // com.hpplay.glide.load.engine.Resource
    public void recycle() {
        if (this.acquired <= 0) {
            if (!this.isRecycled) {
                this.isRecycled = true;
                this.resource.recycle();
                return;
            }
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
    }

    public void release() {
        if (this.acquired > 0) {
            if (Looper.getMainLooper().equals(Looper.myLooper())) {
                int i10 = this.acquired - 1;
                this.acquired = i10;
                if (i10 == 0) {
                    this.listener.onResourceReleased(this.key, this);
                    return;
                }
                return;
            }
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
        throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
    }

    public void setResourceListener(Key key, ResourceListener resourceListener) {
        this.key = key;
        this.listener = resourceListener;
    }
}
