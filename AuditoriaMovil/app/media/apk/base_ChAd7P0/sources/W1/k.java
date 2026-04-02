package W1;

import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f6146a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6147b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6148c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6149d;

    public k(int i7, int i8, long j, long j8) {
        this.f6146a = i7;
        this.f6147b = i8;
        this.f6148c = j;
        this.f6149d = j8;
    }

    public static k a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            k kVar = new k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f6146a);
            dataOutputStream.writeInt(this.f6147b);
            dataOutputStream.writeLong(this.f6148c);
            dataOutputStream.writeLong(this.f6149d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f6147b == kVar.f6147b && this.f6148c == kVar.f6148c && this.f6146a == kVar.f6146a && this.f6149d == kVar.f6149d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6147b), Long.valueOf(this.f6148c), Integer.valueOf(this.f6146a), Long.valueOf(this.f6149d));
    }
}
