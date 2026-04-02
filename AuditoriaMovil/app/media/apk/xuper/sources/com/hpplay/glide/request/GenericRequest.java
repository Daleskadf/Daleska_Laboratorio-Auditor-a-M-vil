package com.hpplay.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.hpplay.glide.Priority;
import com.hpplay.glide.load.Key;
import com.hpplay.glide.load.Transformation;
import com.hpplay.glide.load.data.DataFetcher;
import com.hpplay.glide.load.engine.DiskCacheStrategy;
import com.hpplay.glide.load.engine.Engine;
import com.hpplay.glide.load.engine.Resource;
import com.hpplay.glide.load.resource.transcode.ResourceTranscoder;
import com.hpplay.glide.provider.LoadProvider;
import com.hpplay.glide.request.animation.GlideAnimationFactory;
import com.hpplay.glide.request.target.SizeReadyCallback;
import com.hpplay.glide.request.target.Target;
import com.hpplay.glide.util.LogTime;
import com.hpplay.glide.util.Util;
import java.util.Queue;
/* loaded from: classes2.dex */
public final class GenericRequest<A, T, Z, R> implements Request, ResourceCallback, SizeReadyCallback {
    private static final Queue<GenericRequest<?, ?, ?, ?>> REQUEST_POOL = Util.createQueue(0);
    private static final String TAG = "GenericRequest";
    private static final double TO_MEGABYTE = 9.5367431640625E-7d;
    private GlideAnimationFactory<R> animationFactory;
    private Context context;
    private DiskCacheStrategy diskCacheStrategy;
    private Engine engine;
    private Drawable errorDrawable;
    private int errorResourceId;
    private Drawable fallbackDrawable;
    private int fallbackResourceId;
    private boolean isMemoryCacheable;
    private LoadProvider<A, T, Z, R> loadProvider;
    private Engine.LoadStatus loadStatus;
    private boolean loadedFromMemoryCache;
    private A model;
    private int overrideHeight;
    private int overrideWidth;
    private Drawable placeholderDrawable;
    private int placeholderResourceId;
    private Priority priority;
    private RequestCoordinator requestCoordinator;
    private RequestListener<? super A, R> requestListener;
    private Resource<?> resource;
    private Key signature;
    private float sizeMultiplier;
    private long startTime;
    private Status status;
    private final String tag = String.valueOf(hashCode());
    private Target<R> target;
    private Class<R> transcodeClass;
    private Transformation<Z> transformation;

    /* loaded from: classes2.dex */
    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CANCELLED,
        CLEARED,
        PAUSED
    }

    private GenericRequest() {
    }

    private boolean canNotifyStatusChanged() {
        RequestCoordinator requestCoordinator = this.requestCoordinator;
        if (requestCoordinator != null && !requestCoordinator.canNotifyStatusChanged(this)) {
            return false;
        }
        return true;
    }

    private boolean canSetResource() {
        RequestCoordinator requestCoordinator = this.requestCoordinator;
        if (requestCoordinator != null && !requestCoordinator.canSetImage(this)) {
            return false;
        }
        return true;
    }

    private static void check(String str, Object obj, String str2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(" must not be null");
            if (str2 != null) {
                sb.append(", ");
                sb.append(str2);
            }
            throw new NullPointerException(sb.toString());
        }
    }

    private Drawable getErrorDrawable() {
        if (this.errorDrawable == null && this.errorResourceId > 0) {
            this.errorDrawable = this.context.getResources().getDrawable(this.errorResourceId);
        }
        return this.errorDrawable;
    }

    private Drawable getFallbackDrawable() {
        if (this.fallbackDrawable == null && this.fallbackResourceId > 0) {
            this.fallbackDrawable = this.context.getResources().getDrawable(this.fallbackResourceId);
        }
        return this.fallbackDrawable;
    }

    private Drawable getPlaceholderDrawable() {
        if (this.placeholderDrawable == null && this.placeholderResourceId > 0) {
            this.placeholderDrawable = this.context.getResources().getDrawable(this.placeholderResourceId);
        }
        return this.placeholderDrawable;
    }

    private void init(LoadProvider<A, T, Z, R> loadProvider, A a10, Key key, Context context, Priority priority, Target<R> target, float f10, Drawable drawable, int i10, Drawable drawable2, int i11, Drawable drawable3, int i12, RequestListener<? super A, R> requestListener, RequestCoordinator requestCoordinator, Engine engine, Transformation<Z> transformation, Class<R> cls, boolean z10, GlideAnimationFactory<R> glideAnimationFactory, int i13, int i14, DiskCacheStrategy diskCacheStrategy) {
        this.loadProvider = loadProvider;
        this.model = a10;
        this.signature = key;
        this.fallbackDrawable = drawable3;
        this.fallbackResourceId = i12;
        this.context = context.getApplicationContext();
        this.priority = priority;
        this.target = target;
        this.sizeMultiplier = f10;
        this.placeholderDrawable = drawable;
        this.placeholderResourceId = i10;
        this.errorDrawable = drawable2;
        this.errorResourceId = i11;
        this.requestListener = requestListener;
        this.requestCoordinator = requestCoordinator;
        this.engine = engine;
        this.transformation = transformation;
        this.transcodeClass = cls;
        this.isMemoryCacheable = z10;
        this.animationFactory = glideAnimationFactory;
        this.overrideWidth = i13;
        this.overrideHeight = i14;
        this.diskCacheStrategy = diskCacheStrategy;
        this.status = Status.PENDING;
        if (a10 != null) {
            check("ModelLoader", loadProvider.getModelLoader(), "try .using(ModelLoader)");
            check("Transcoder", loadProvider.getTranscoder(), "try .as*(Class).transcode(ResourceTranscoder)");
            check("Transformation", transformation, "try .transform(UnitTransformation.get())");
            if (diskCacheStrategy.cacheSource()) {
                check("SourceEncoder", loadProvider.getSourceEncoder(), "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)");
            } else {
                check("SourceDecoder", loadProvider.getSourceDecoder(), "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)");
            }
            if (diskCacheStrategy.cacheSource() || diskCacheStrategy.cacheResult()) {
                check("CacheDecoder", loadProvider.getCacheDecoder(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (diskCacheStrategy.cacheResult()) {
                check("Encoder", loadProvider.getEncoder(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
    }

    private boolean isFirstReadyResource() {
        RequestCoordinator requestCoordinator = this.requestCoordinator;
        if (requestCoordinator != null && requestCoordinator.isAnyResourceSet()) {
            return false;
        }
        return true;
    }

    private void logV(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.tag);
    }

    private void notifyLoadSuccess() {
        RequestCoordinator requestCoordinator = this.requestCoordinator;
        if (requestCoordinator != null) {
            requestCoordinator.onRequestSuccess(this);
        }
    }

    public static <A, T, Z, R> GenericRequest<A, T, Z, R> obtain(LoadProvider<A, T, Z, R> loadProvider, A a10, Key key, Context context, Priority priority, Target<R> target, float f10, Drawable drawable, int i10, Drawable drawable2, int i11, Drawable drawable3, int i12, RequestListener<? super A, R> requestListener, RequestCoordinator requestCoordinator, Engine engine, Transformation<Z> transformation, Class<R> cls, boolean z10, GlideAnimationFactory<R> glideAnimationFactory, int i13, int i14, DiskCacheStrategy diskCacheStrategy) {
        GenericRequest<?, ?, ?, ?> poll = REQUEST_POOL.poll();
        if (poll == null) {
            poll = new GenericRequest();
        }
        poll.init(loadProvider, a10, key, context, priority, target, f10, drawable, i10, drawable2, i11, drawable3, i12, requestListener, requestCoordinator, engine, transformation, cls, z10, glideAnimationFactory, i13, i14, diskCacheStrategy);
        return poll;
    }

    private void releaseResource(Resource resource) {
        this.engine.release(resource);
        this.resource = null;
    }

    private void setErrorPlaceholder(Exception exc) {
        Drawable drawable;
        if (!canNotifyStatusChanged()) {
            return;
        }
        if (this.model == null) {
            drawable = getFallbackDrawable();
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = getErrorDrawable();
        }
        if (drawable == null) {
            drawable = getPlaceholderDrawable();
        }
        this.target.onLoadFailed(exc, drawable);
    }

    @Override // com.hpplay.glide.request.Request
    public void begin() {
        this.startTime = LogTime.getLogTime();
        if (this.model == null) {
            onException(null);
            return;
        }
        this.status = Status.WAITING_FOR_SIZE;
        if (Util.isValidDimensions(this.overrideWidth, this.overrideHeight)) {
            onSizeReady(this.overrideWidth, this.overrideHeight);
        } else {
            this.target.getSize(this);
        }
        if (!isComplete() && !isFailed() && canNotifyStatusChanged()) {
            this.target.onLoadStarted(getPlaceholderDrawable());
        }
        if (Log.isLoggable(TAG, 2)) {
            logV("finished run method in " + LogTime.getElapsedMillis(this.startTime));
        }
    }

    public void cancel() {
        this.status = Status.CANCELLED;
        Engine.LoadStatus loadStatus = this.loadStatus;
        if (loadStatus != null) {
            loadStatus.cancel();
            this.loadStatus = null;
        }
    }

    @Override // com.hpplay.glide.request.Request
    public void clear() {
        Util.assertMainThread();
        Status status = this.status;
        Status status2 = Status.CLEARED;
        if (status == status2) {
            return;
        }
        cancel();
        Resource<?> resource = this.resource;
        if (resource != null) {
            releaseResource(resource);
        }
        if (canNotifyStatusChanged()) {
            this.target.onLoadCleared(getPlaceholderDrawable());
        }
        this.status = status2;
    }

    @Override // com.hpplay.glide.request.Request
    public boolean isCancelled() {
        Status status = this.status;
        if (status != Status.CANCELLED && status != Status.CLEARED) {
            return false;
        }
        return true;
    }

    @Override // com.hpplay.glide.request.Request
    public boolean isComplete() {
        if (this.status == Status.COMPLETE) {
            return true;
        }
        return false;
    }

    @Override // com.hpplay.glide.request.Request
    public boolean isFailed() {
        if (this.status == Status.FAILED) {
            return true;
        }
        return false;
    }

    @Override // com.hpplay.glide.request.Request
    public boolean isPaused() {
        if (this.status == Status.PAUSED) {
            return true;
        }
        return false;
    }

    @Override // com.hpplay.glide.request.Request
    public boolean isResourceSet() {
        return isComplete();
    }

    @Override // com.hpplay.glide.request.Request
    public boolean isRunning() {
        Status status = this.status;
        if (status != Status.RUNNING && status != Status.WAITING_FOR_SIZE) {
            return false;
        }
        return true;
    }

    @Override // com.hpplay.glide.request.ResourceCallback
    public void onException(Exception exc) {
        Log.isLoggable(TAG, 3);
        this.status = Status.FAILED;
        RequestListener<? super A, R> requestListener = this.requestListener;
        if (requestListener == null || !requestListener.onException(exc, (A) this.model, this.target, isFirstReadyResource())) {
            setErrorPlaceholder(exc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.hpplay.glide.request.ResourceCallback
    public void onResourceReady(Resource<?> resource) {
        if (resource == null) {
            onException(new Exception("Expected to receive a Resource<R> with an object of " + this.transcodeClass + " inside, but instead got null."));
            return;
        }
        Object obj = resource.get();
        if (obj != null && this.transcodeClass.isAssignableFrom(obj.getClass())) {
            if (!canSetResource()) {
                releaseResource(resource);
                this.status = Status.COMPLETE;
                return;
            }
            onResourceReady(resource, obj);
            return;
        }
        releaseResource(resource);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.transcodeClass);
        sb.append(" but instead got ");
        sb.append(obj != null ? obj.getClass() : "");
        sb.append("{");
        sb.append(obj);
        sb.append("} inside Resource{");
        sb.append(resource);
        sb.append("}.");
        sb.append(obj == null ? " To indicate failure return a null Resource object, rather than a Resource object containing null data." : "");
        onException(new Exception(sb.toString()));
    }

    @Override // com.hpplay.glide.request.target.SizeReadyCallback
    public void onSizeReady(int i10, int i11) {
        if (Log.isLoggable(TAG, 2)) {
            logV("Got onSizeReady in " + LogTime.getElapsedMillis(this.startTime));
        }
        if (this.status != Status.WAITING_FOR_SIZE) {
            return;
        }
        this.status = Status.RUNNING;
        int round = Math.round(this.sizeMultiplier * i10);
        int round2 = Math.round(this.sizeMultiplier * i11);
        DataFetcher<T> resourceFetcher = this.loadProvider.getModelLoader().getResourceFetcher(this.model, round, round2);
        if (resourceFetcher == null) {
            onException(new Exception("Failed to load model: '" + this.model + "'"));
            return;
        }
        ResourceTranscoder<Z, R> transcoder = this.loadProvider.getTranscoder();
        if (Log.isLoggable(TAG, 2)) {
            logV("finished setup for calling load in " + LogTime.getElapsedMillis(this.startTime));
        }
        boolean z10 = true;
        this.loadedFromMemoryCache = true;
        this.loadStatus = this.engine.load(this.signature, round, round2, resourceFetcher, this.loadProvider, this.transformation, transcoder, this.priority, this.isMemoryCacheable, this.diskCacheStrategy, this);
        if (this.resource == null) {
            z10 = false;
        }
        this.loadedFromMemoryCache = z10;
        if (Log.isLoggable(TAG, 2)) {
            logV("finished onSizeReady in " + LogTime.getElapsedMillis(this.startTime));
        }
    }

    @Override // com.hpplay.glide.request.Request
    public void pause() {
        clear();
        this.status = Status.PAUSED;
    }

    @Override // com.hpplay.glide.request.Request
    public void recycle() {
        this.loadProvider = null;
        this.model = null;
        this.context = null;
        this.target = null;
        this.placeholderDrawable = null;
        this.errorDrawable = null;
        this.fallbackDrawable = null;
        this.requestListener = null;
        this.requestCoordinator = null;
        this.transformation = null;
        this.animationFactory = null;
        this.loadedFromMemoryCache = false;
        this.loadStatus = null;
        REQUEST_POOL.offer(this);
    }

    private void onResourceReady(Resource<?> resource, R r10) {
        boolean isFirstReadyResource = isFirstReadyResource();
        this.status = Status.COMPLETE;
        this.resource = resource;
        RequestListener<? super A, R> requestListener = this.requestListener;
        if (requestListener == null || !requestListener.onResourceReady(r10, (A) this.model, this.target, this.loadedFromMemoryCache, isFirstReadyResource)) {
            this.target.onResourceReady(r10, this.animationFactory.build(this.loadedFromMemoryCache, isFirstReadyResource));
        }
        notifyLoadSuccess();
        if (Log.isLoggable(TAG, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resource ready in ");
            sb.append(LogTime.getElapsedMillis(this.startTime));
            sb.append(" size: ");
            double size = resource.getSize();
            Double.isNaN(size);
            sb.append(size * TO_MEGABYTE);
            sb.append(" fromCache: ");
            sb.append(this.loadedFromMemoryCache);
            logV(sb.toString());
        }
    }
}
