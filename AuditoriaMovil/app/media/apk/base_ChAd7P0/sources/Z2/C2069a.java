package z2;

import java.io.File;
import java.io.FilenameFilter;
/* renamed from: z2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2069a implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f16877a;

    public C2069a(String str) {
        this.f16877a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f16877a);
    }
}
