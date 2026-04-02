package f1;

import java.util.NoSuchElementException;
/* renamed from: f1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0980b implements m {

    /* renamed from: a  reason: collision with root package name */
    public final long f10982a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10983b;

    /* renamed from: c  reason: collision with root package name */
    public long f10984c;

    public AbstractC0980b(long j, long j8) {
        this.f10982a = j;
        this.f10983b = j8;
        this.f10984c = j - 1;
    }

    public final void b() {
        long j = this.f10984c;
        if (j >= this.f10982a && j <= this.f10983b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override // f1.m
    public final boolean next() {
        boolean z7;
        long j = this.f10984c + 1;
        this.f10984c = j;
        if (j > this.f10983b) {
            z7 = true;
        } else {
            z7 = false;
        }
        return !z7;
    }
}
