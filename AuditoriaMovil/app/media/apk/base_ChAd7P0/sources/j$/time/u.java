package j$.time;

import H4.e1;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a  reason: collision with root package name */
    private byte f12790a;

    /* renamed from: b  reason: collision with root package name */
    private Object f12791b;

    public u() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(byte b5, Object obj) {
        this.f12790a = b5;
        this.f12791b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b5 = this.f12790a;
        Object obj = this.f12791b;
        objectOutput.writeByte(b5);
        switch (b5) {
            case 1:
                ((e) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).b0(objectOutput);
                return;
            case 3:
                ((h) obj).u0(objectOutput);
                return;
            case 4:
                ((l) obj).n0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).o0(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).Z(objectOutput);
                return;
            case 7:
                ((z) obj).Y(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).f0(objectOutput);
                return;
            case 9:
                ((s) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((w) obj).V(objectOutput);
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                ((y) obj).Y(objectOutput);
                return;
            case 13:
                ((p) obj).S(objectOutput);
                return;
            case 14:
                ((t) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f12790a = readByte;
        this.f12791b = b(readByte, objectInput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b5, ObjectInput objectInput) {
        switch (b5) {
            case 1:
                e eVar = e.f12655c;
                return e.B(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.f12575c;
                return Instant.X(objectInput.readLong(), objectInput.readInt());
            case 3:
                h hVar = h.f12728d;
                return h.g0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return l.i0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f12578c;
                h hVar2 = h.f12728d;
                return LocalDateTime.f0(h.g0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.i0(objectInput));
            case 6:
                return ZonedDateTime.V(objectInput);
            case 7:
                int i7 = z.f12801d;
                return ZoneId.T(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.e0(objectInput);
            case 9:
                return s.T(objectInput);
            case 10:
                return OffsetDateTime.U(objectInput);
            case 11:
                int i8 = w.f12794b;
                return w.R(objectInput.readInt());
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                int i9 = y.f12798c;
                return y.S(objectInput.readInt(), objectInput.readByte());
            case 13:
                return p.R(objectInput);
            case 14:
                return t.c(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f12791b;
    }
}
