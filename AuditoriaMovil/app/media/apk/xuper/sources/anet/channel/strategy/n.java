package anet.channel.strategy;

import java.io.File;
import java.util.Comparator;
/* loaded from: classes.dex */
final class n implements Comparator<File> {
    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(File file, File file2) {
        return (int) (file2.lastModified() - file.lastModified());
    }
}
