package io.flutter.embedding.engine.renderer;

import B5.AbstractC0029b;
import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.Keep;
import c6.RunnableC0705t;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.s;
import io.flutter.view.t;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
@Keep
/* loaded from: classes.dex */
public final class FlutterRenderer$ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, s {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_IMAGES = 5;
    private static final String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;
    private final long id;
    private boolean released;
    final /* synthetic */ m this$0;
    private boolean ignoringFence = false;
    private int requestedWidth = 1;
    private int requestedHeight = 1;
    private boolean createNewReader = true;
    private boolean notifiedDestroy = false;
    private long lastDequeueTime = 0;
    private long lastQueueTime = 0;
    private long lastScheduleTime = 0;
    private int numTrims = 0;
    private final Object lock = new Object();
    private final ArrayDeque<i> imageReaderQueue = new ArrayDeque<>();
    private final HashMap<ImageReader, i> perImageReaders = new HashMap<>();
    private g lastDequeuedImage = null;
    private i lastReaderDequeuedFrom = null;
    private t callback = null;

    public FlutterRenderer$ImageReaderSurfaceProducer(m mVar, long j) {
        this.this$0 = mVar;
        this.id = j;
    }

    private void cleanup() {
        synchronized (this.lock) {
            try {
                for (i iVar : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == iVar) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    iVar.f11588c = true;
                    iVar.f11586a.close();
                    iVar.f11587b.clear();
                }
                this.perImageReaders.clear();
                g gVar = this.lastDequeuedImage;
                if (gVar != null) {
                    gVar.f11583a.close();
                    this.lastDequeuedImage = null;
                }
                i iVar2 = this.lastReaderDequeuedFrom;
                if (iVar2 != null) {
                    iVar2.f11588c = true;
                    iVar2.f11586a.close();
                    iVar2.f11587b.clear();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ImageReader createImageReader() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            return createImageReader33();
        }
        if (i7 >= 29) {
            return createImageReader29();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    private ImageReader createImageReader29() {
        ImageReader newInstance;
        newInstance = ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 5, 256L);
        return newInstance;
    }

    private ImageReader createImageReader33() {
        ImageReader build;
        AbstractC0029b.q();
        ImageReader.Builder i7 = AbstractC0029b.i(this.requestedWidth, this.requestedHeight);
        i7.setMaxImages(5);
        i7.setImageFormat(34);
        i7.setUsage(256L);
        build = i7.build();
        return build;
    }

    private i getActiveReader() {
        synchronized (this.lock) {
            try {
                if (this.createNewReader) {
                    this.createNewReader = false;
                    return getOrCreatePerImageReader(createImageReader());
                }
                return this.imageReaderQueue.peekLast();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void lambda$dequeueImage$0() {
        if (!this.released) {
            this.this$0.f11612a.scheduleFrame();
        }
    }

    private void maybeWaitOnFence(Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    private void releaseInternal() {
        cleanup();
        this.released = true;
        this.this$0.f(this);
        this.this$0.f11617g.remove(this);
    }

    private void waitOnFence(Image image) {
        SyncFence fence;
        try {
            fence = image.getFence();
            fence.awaitForever();
        } catch (IOException unused) {
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageConsumer
    public Image acquireLatestImage() {
        g dequeueImage = dequeueImage();
        if (dequeueImage == null) {
            return null;
        }
        Image image = dequeueImage.f11583a;
        maybeWaitOnFence(image);
        return image;
    }

    public double deltaMillis(long j) {
        return j / 1000000.0d;
    }

    public g dequeueImage() {
        g gVar;
        boolean z7;
        g gVar2;
        synchronized (this.lock) {
            try {
                Iterator<i> it = this.imageReaderQueue.iterator();
                gVar = null;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i next = it.next();
                    ArrayDeque arrayDeque = next.f11587b;
                    if (arrayDeque.isEmpty()) {
                        gVar2 = null;
                    } else {
                        gVar2 = (g) arrayDeque.removeFirst();
                    }
                    if (gVar2 == null) {
                        gVar = gVar2;
                    } else {
                        g gVar3 = this.lastDequeuedImage;
                        if (gVar3 != null) {
                            gVar3.f11583a.close();
                        }
                        this.lastDequeuedImage = gVar2;
                        this.lastReaderDequeuedFrom = next;
                        gVar = gVar2;
                    }
                }
                pruneImageReaderQueue();
                Iterator<i> it2 = this.imageReaderQueue.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().f11587b.isEmpty()) {
                            z7 = true;
                            break;
                        }
                    } else {
                        z7 = false;
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            this.this$0.f11616e.post(new f(this, 0));
        }
        return gVar;
    }

    public void disableFenceForTest() {
        this.ignoringFence = true;
    }

    public void finalize() {
        try {
            if (this.released) {
                return;
            }
            releaseInternal();
            m mVar = this.this$0;
            mVar.f11616e.post(new RunnableC0705t(this.id, mVar.f11612a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getHeight() {
        return this.requestedHeight;
    }

    public i getOrCreatePerImageReader(ImageReader imageReader) {
        i iVar = this.perImageReaders.get(imageReader);
        if (iVar == null) {
            i iVar2 = new i(this, imageReader);
            this.perImageReaders.put(imageReader, iVar2);
            this.imageReaderQueue.add(iVar2);
            return iVar2;
        }
        return iVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getSurface() {
        return getActiveReader().f11586a.getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getWidth() {
        return this.requestedWidth;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public boolean handlesCropAndRotation() {
        return false;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public long id() {
        return this.id;
    }

    public int numImageReaders() {
        int size;
        synchronized (this.lock) {
            size = this.imageReaderQueue.size();
        }
        return size;
    }

    public int numImages() {
        int i7;
        synchronized (this.lock) {
            try {
                Iterator<i> it = this.imageReaderQueue.iterator();
                i7 = 0;
                while (it.hasNext()) {
                    i7 += it.next().f11587b.size();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i7;
    }

    public int numTrims() {
        int i7;
        synchronized (this.lock) {
            i7 = this.numTrims;
        }
        return i7;
    }

    public void onImage(ImageReader imageReader, Image image) {
        g gVar;
        synchronized (this.lock) {
            i orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
            if (orCreatePerImageReader.f11588c) {
                gVar = null;
            } else {
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.f11589d;
                System.nanoTime();
                g gVar2 = new g(flutterRenderer$ImageReaderSurfaceProducer, image);
                ArrayDeque arrayDeque = orCreatePerImageReader.f11587b;
                arrayDeque.add(gVar2);
                while (arrayDeque.size() > 2) {
                    ((g) arrayDeque.removeFirst()).f11583a.close();
                }
                gVar = gVar2;
            }
        }
        if (gVar == null) {
            return;
        }
        this.this$0.f11612a.scheduleFrame();
    }

    @Override // io.flutter.view.s
    public void onTrimMemory(int i7) {
        if (i7 < 40) {
            return;
        }
        synchronized (this.lock) {
            this.numTrims++;
        }
        t tVar = this.callback;
        if (tVar != null) {
            this.notifiedDestroy = true;
            tVar.c();
        }
        cleanup();
        this.createNewReader = true;
    }

    public void pruneImageReaderQueue() {
        i peekFirst;
        while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null) {
            ArrayDeque arrayDeque = peekFirst.f11587b;
            if (arrayDeque.isEmpty() && peekFirst.f11589d.lastReaderDequeuedFrom != peekFirst) {
                this.imageReaderQueue.removeFirst();
                HashMap<ImageReader, i> hashMap = this.perImageReaders;
                ImageReader imageReader = peekFirst.f11586a;
                hashMap.remove(imageReader);
                peekFirst.f11588c = true;
                imageReader.close();
                arrayDeque.clear();
            } else {
                return;
            }
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void release() {
        if (this.released) {
            return;
        }
        releaseInternal();
        m mVar = this.this$0;
        mVar.f11612a.unregisterTexture(this.id);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void scheduleFrame() {
        this.this$0.f11612a.scheduleFrame();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setCallback(t tVar) {
        this.callback = tVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setSize(int i7, int i8) {
        int max = Math.max(1, i7);
        int max2 = Math.max(1, i8);
        if (this.requestedWidth == max && this.requestedHeight == max2) {
            return;
        }
        this.createNewReader = true;
        this.requestedHeight = max2;
        this.requestedWidth = max;
    }
}
