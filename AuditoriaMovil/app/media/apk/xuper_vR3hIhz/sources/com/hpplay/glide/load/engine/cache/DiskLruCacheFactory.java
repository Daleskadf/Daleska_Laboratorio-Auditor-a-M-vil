package com.hpplay.glide.load.engine.cache;

import com.hpplay.glide.load.engine.cache.DiskCache;
import java.io.File;
/* loaded from: classes2.dex */
public class DiskLruCacheFactory implements DiskCache.Factory {
    private final CacheDirectoryGetter cacheDirectoryGetter;
    private final int diskCacheSize;

    /* loaded from: classes2.dex */
    public interface CacheDirectoryGetter {
        File getCacheDirectory();
    }

    public DiskLruCacheFactory(final String str, int i10) {
        this(new CacheDirectoryGetter() { // from class: com.hpplay.glide.load.engine.cache.DiskLruCacheFactory.1
            @Override // com.hpplay.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
            public File getCacheDirectory() {
                return new File(str);
            }
        }, i10);
    }

    @Override // com.hpplay.glide.load.engine.cache.DiskCache.Factory
    public DiskCache build() {
        File cacheDirectory = this.cacheDirectoryGetter.getCacheDirectory();
        if (cacheDirectory == null) {
            return null;
        }
        if (!cacheDirectory.mkdirs() && (!cacheDirectory.exists() || !cacheDirectory.isDirectory())) {
            return null;
        }
        return DiskLruCacheWrapper.get(cacheDirectory, this.diskCacheSize);
    }

    public DiskLruCacheFactory(final String str, final String str2, int i10) {
        this(new CacheDirectoryGetter() { // from class: com.hpplay.glide.load.engine.cache.DiskLruCacheFactory.2
            @Override // com.hpplay.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
            public File getCacheDirectory() {
                return new File(str, str2);
            }
        }, i10);
    }

    public DiskLruCacheFactory(CacheDirectoryGetter cacheDirectoryGetter, int i10) {
        this.diskCacheSize = i10;
        this.cacheDirectoryGetter = cacheDirectoryGetter;
    }
}
