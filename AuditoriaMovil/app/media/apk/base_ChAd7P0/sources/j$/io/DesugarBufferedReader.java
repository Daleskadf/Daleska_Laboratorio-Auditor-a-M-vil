package j$.io;

import j$.util.Spliterators;
import j$.util.stream.AbstractC1340x0;
import j$.util.stream.Stream;
import java.io.BufferedReader;
/* loaded from: classes2.dex */
public final /* synthetic */ class DesugarBufferedReader {
    public static Stream lines(BufferedReader bufferedReader) {
        return AbstractC1340x0.f0(Spliterators.n(new a(bufferedReader)), false);
    }
}
