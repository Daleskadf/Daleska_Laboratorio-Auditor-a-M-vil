package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import com.bumptech.glide.util.Preconditions;
import com.hpplay.component.protocol.plist.ASCIIPropertyListParser;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class LruArrayPool implements ArrayPool {
    private static final int DEFAULT_SIZE = 4194304;
    static final int MAX_OVER_SIZE_MULTIPLE = 8;
    private static final int SINGLE_ARRAY_MAX_SIZE_DIVISOR = 2;
    private final Map<Class<?>, ArrayAdapterInterface<?>> adapters;
    private int currentSize;
    private final GroupedLinkedMap<Key, Object> groupedMap;
    private final KeyPool keyPool;
    private final int maxSize;
    private final Map<Class<?>, NavigableMap<Integer, Integer>> sortedSizes;

    /* loaded from: classes.dex */
    public static final class Key implements Poolable {
        private Class<?> arrayClass;
        private final KeyPool pool;
        int size;

        public Key(KeyPool keyPool) {
            this.pool = keyPool;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            if (this.size != key.size || this.arrayClass != key.arrayClass) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10;
            int i11 = this.size * 31;
            Class<?> cls = this.arrayClass;
            if (cls != null) {
                i10 = cls.hashCode();
            } else {
                i10 = 0;
            }
            return i11 + i10;
        }

        public void init(int i10, Class<?> cls) {
            this.size = i10;
            this.arrayClass = cls;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public void offer() {
            this.pool.offer(this);
        }

        public String toString() {
            return "Key{size=" + this.size + "array=" + this.arrayClass + ASCIIPropertyListParser.DICTIONARY_END_TOKEN;
        }
    }

    /* loaded from: classes.dex */
    public static final class KeyPool extends BaseKeyPool<Key> {
        public Key get(int i10, Class<?> cls) {
            Key key = get();
            key.init(i10, cls);
            return key;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        public Key create() {
            return new Key(this);
        }
    }

    public LruArrayPool() {
        this.groupedMap = new GroupedLinkedMap<>();
        this.keyPool = new KeyPool();
        this.sortedSizes = new HashMap();
        this.adapters = new HashMap();
        this.maxSize = 4194304;
    }

    private void decrementArrayOfSize(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> sizesForAdapter = getSizesForAdapter(cls);
        Integer num = sizesForAdapter.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                sizesForAdapter.remove(Integer.valueOf(i10));
                return;
            } else {
                sizesForAdapter.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    private void evict() {
        evictToSize(this.maxSize);
    }

    private void evictToSize(int i10) {
        while (this.currentSize > i10) {
            Object removeLast = this.groupedMap.removeLast();
            Preconditions.checkNotNull(removeLast);
            ArrayAdapterInterface adapterFromObject = getAdapterFromObject(removeLast);
            this.currentSize -= adapterFromObject.getArrayLength(removeLast) * adapterFromObject.getElementSizeInBytes();
            decrementArrayOfSize(adapterFromObject.getArrayLength(removeLast), removeLast.getClass());
            if (Log.isLoggable(adapterFromObject.getTag(), 2)) {
                adapterFromObject.getTag();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(adapterFromObject.getArrayLength(removeLast));
            }
        }
    }

    private <T> ArrayAdapterInterface<T> getAdapterFromObject(T t10) {
        return getAdapterFromType(t10.getClass());
    }

    private <T> ArrayAdapterInterface<T> getAdapterFromType(Class<T> cls) {
        IntegerArrayAdapter integerArrayAdapter = (ArrayAdapterInterface<T>) this.adapters.get(cls);
        if (integerArrayAdapter == null) {
            if (cls.equals(int[].class)) {
                integerArrayAdapter = new IntegerArrayAdapter();
            } else if (cls.equals(byte[].class)) {
                integerArrayAdapter = new ByteArrayAdapter();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.adapters.put(cls, integerArrayAdapter);
        }
        return integerArrayAdapter;
    }

    private <T> T getArrayForKey(Key key) {
        return (T) this.groupedMap.get(key);
    }

    private <T> T getForKey(Key key, Class<T> cls) {
        ArrayAdapterInterface<T> adapterFromType = getAdapterFromType(cls);
        T t10 = (T) getArrayForKey(key);
        if (t10 != null) {
            this.currentSize -= adapterFromType.getArrayLength(t10) * adapterFromType.getElementSizeInBytes();
            decrementArrayOfSize(adapterFromType.getArrayLength(t10), cls);
        }
        if (t10 == null) {
            if (Log.isLoggable(adapterFromType.getTag(), 2)) {
                adapterFromType.getTag();
                StringBuilder sb = new StringBuilder();
                sb.append("Allocated ");
                sb.append(key.size);
                sb.append(" bytes");
            }
            return adapterFromType.newArray(key.size);
        }
        return t10;
    }

    private NavigableMap<Integer, Integer> getSizesForAdapter(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.sortedSizes.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.sortedSizes.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    private boolean isNoMoreThanHalfFull() {
        int i10 = this.currentSize;
        if (i10 != 0 && this.maxSize / i10 < 2) {
            return false;
        }
        return true;
    }

    private boolean isSmallEnoughForReuse(int i10) {
        if (i10 <= this.maxSize / 2) {
            return true;
        }
        return false;
    }

    private boolean mayFillRequest(int i10, Integer num) {
        if (num != null && (isNoMoreThanHalfFull() || num.intValue() <= i10 * 8)) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized void clearMemory() {
        evictToSize(0);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> T get(int i10, Class<T> cls) {
        Key key;
        Integer ceilingKey = getSizesForAdapter(cls).ceilingKey(Integer.valueOf(i10));
        if (mayFillRequest(i10, ceilingKey)) {
            key = this.keyPool.get(ceilingKey.intValue(), cls);
        } else {
            key = this.keyPool.get(i10, cls);
        }
        return (T) getForKey(key, cls);
    }

    public int getCurrentSize() {
        int i10 = 0;
        for (Class<?> cls : this.sortedSizes.keySet()) {
            for (Integer num : this.sortedSizes.get(cls).keySet()) {
                i10 += num.intValue() * this.sortedSizes.get(cls).get(num).intValue() * getAdapterFromType(cls).getElementSizeInBytes();
            }
        }
        return i10;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> T getExact(int i10, Class<T> cls) {
        return (T) getForKey(this.keyPool.get(i10, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    @Deprecated
    public <T> void put(T t10, Class<T> cls) {
        put(t10);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized void trimMemory(int i10) {
        try {
            if (i10 >= 40) {
                clearMemory();
            } else if (i10 >= 20 || i10 == 15) {
                evictToSize(this.maxSize / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> void put(T t10) {
        Class<?> cls = t10.getClass();
        ArrayAdapterInterface<T> adapterFromType = getAdapterFromType(cls);
        int arrayLength = adapterFromType.getArrayLength(t10);
        int elementSizeInBytes = adapterFromType.getElementSizeInBytes() * arrayLength;
        if (isSmallEnoughForReuse(elementSizeInBytes)) {
            Key key = this.keyPool.get(arrayLength, cls);
            this.groupedMap.put(key, t10);
            NavigableMap<Integer, Integer> sizesForAdapter = getSizesForAdapter(cls);
            Integer num = sizesForAdapter.get(Integer.valueOf(key.size));
            Integer valueOf = Integer.valueOf(key.size);
            int i10 = 1;
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            sizesForAdapter.put(valueOf, Integer.valueOf(i10));
            this.currentSize += elementSizeInBytes;
            evict();
        }
    }

    public LruArrayPool(int i10) {
        this.groupedMap = new GroupedLinkedMap<>();
        this.keyPool = new KeyPool();
        this.sortedSizes = new HashMap();
        this.adapters = new HashMap();
        this.maxSize = i10;
    }
}
