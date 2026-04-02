package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class bk extends com.google.android.play.core.assetpacks.internal.an {
    private final File a;
    private final File b;
    private final NavigableMap c = new TreeMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public bk(File file, File file2) throws IOException {
        this.a = file;
        this.b = file2;
        List<File> a = eo.a(file, file2);
        if (a.isEmpty()) {
            throw new ck(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        long j = 0;
        for (File file3 : a) {
            this.c.put(Long.valueOf(j), file3);
            j += file3.length();
        }
    }

    private final InputStream d(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.c.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new ck(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l));
    }

    @Override // com.google.android.play.core.assetpacks.internal.an
    public final long a() {
        Map.Entry lastEntry = this.c.lastEntry();
        return ((Long) lastEntry.getKey()).longValue() + ((File) lastEntry.getValue()).length();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.core.assetpacks.internal.an
    public final InputStream b(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new ck(String.format("Invalid input parameters %s, %s", Long.valueOf(j), Long.valueOf(j2)));
        }
        long j3 = j + j2;
        if (j3 <= a()) {
            Long l = (Long) this.c.floorKey(Long.valueOf(j));
            Long l2 = (Long) this.c.floorKey(Long.valueOf(j3));
            if (l.equals(l2)) {
                return new bj(d(j, l), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(d(j, l));
            Collection values = this.c.subMap(l, false, l2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new dr(Collections.enumeration(values)));
            }
            arrayList.add(new bj(new FileInputStream((File) this.c.get(l2)), j2 - (l2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new ck(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(a()), Long.valueOf(j3)));
    }
}
