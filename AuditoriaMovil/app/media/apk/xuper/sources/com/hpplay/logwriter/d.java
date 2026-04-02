package com.hpplay.logwriter;

import java.io.File;
import java.util.Comparator;
/* loaded from: classes2.dex */
public class d implements Comparator<File> {
    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(File file, File file2) {
        return (int) (file.lastModified() - file2.lastModified());
    }
}
