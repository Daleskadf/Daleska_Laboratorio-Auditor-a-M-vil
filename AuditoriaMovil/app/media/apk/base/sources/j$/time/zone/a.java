package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;
import org.apache.tika.fork.ForkServer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a  reason: collision with root package name */
    private byte f12804a;

    /* renamed from: b  reason: collision with root package name */
    private Serializable f12805b;

    public a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(byte b5, Serializable serializable) {
        this.f12804a = b5;
        this.f12805b = serializable;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b5 = this.f12804a;
        Serializable serializable = this.f12805b;
        objectOutput.writeByte(b5);
        if (b5 == 1) {
            ((f) serializable).writeExternal(objectOutput);
        } else if (b5 == 2) {
            ((b) serializable).writeExternal(objectOutput);
        } else if (b5 == 3) {
            ((e) serializable).writeExternal(objectOutput);
        } else if (b5 == 100) {
            ((f) serializable).k(objectOutput);
        } else {
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Serializable j;
        byte readByte = objectInput.readByte();
        this.f12804a = readByte;
        if (readByte == 1) {
            j = f.j(objectInput);
        } else if (readByte == 2) {
            long a7 = a(objectInput);
            ZoneOffset b5 = b(objectInput);
            ZoneOffset b7 = b(objectInput);
            if (b5.equals(b7)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            j = new b(a7, b5, b7);
        } else if (readByte == 3) {
            j = e.b(objectInput);
        } else if (readByte != 100) {
            throw new StreamCorruptedException("Unknown serialized type");
        } else {
            j = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f12805b = j;
    }

    private Object readResolve() {
        return this.f12805b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ZoneOffset zoneOffset, ObjectOutput objectOutput) {
        int Z6 = zoneOffset.Z();
        int i7 = Z6 % 900 == 0 ? Z6 / 900 : 127;
        objectOutput.writeByte(i7);
        if (i7 == 127) {
            objectOutput.writeInt(Z6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffset b(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.c0(objectInput.readInt()) : ZoneOffset.c0(readByte * 900);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(long j, ObjectOutput objectOutput) {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i7 = (int) ((j + 4575744000L) / 900);
            objectOutput.writeByte((i7 >>> 16) & 255);
            objectOutput.writeByte((i7 >>> 8) & 255);
            objectOutput.writeByte(i7 & 255);
            return;
        }
        objectOutput.writeByte(255);
        objectOutput.writeLong(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(ObjectInput objectInput) {
        int readByte = objectInput.readByte() & ForkServer.ERROR;
        if (readByte == 255) {
            return objectInput.readLong();
        }
        return ((((readByte << 16) + ((objectInput.readByte() & ForkServer.ERROR) << 8)) + (objectInput.readByte() & ForkServer.ERROR)) * 900) - 4575744000L;
    }
}
