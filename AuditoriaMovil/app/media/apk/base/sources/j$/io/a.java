package j$.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
final class a implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    private final BufferedReader f12568a;

    /* renamed from: b  reason: collision with root package name */
    String f12569b = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(BufferedReader bufferedReader) {
        this.f12568a = bufferedReader;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12569b != null) {
            return true;
        }
        try {
            String readLine = this.f12568a.readLine();
            this.f12569b = readLine;
            return readLine != null;
        } catch (IOException e7) {
            throw new UncheckedIOException(e7);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f12569b != null || hasNext()) {
            String str = this.f12569b;
            this.f12569b = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
