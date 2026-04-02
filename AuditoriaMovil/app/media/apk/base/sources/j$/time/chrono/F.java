package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
/* loaded from: classes2.dex */
final class F implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a  reason: collision with root package name */
    private byte f12600a;

    /* renamed from: b  reason: collision with root package name */
    private Object f12601b;

    public F() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(byte b5, Object obj) {
        this.f12600a = b5;
        this.f12601b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b5 = this.f12600a;
        Object obj = this.f12601b;
        objectOutput.writeByte(b5);
        switch (b5) {
            case 1:
                objectOutput.writeUTF(((AbstractC1194a) obj).n());
                return;
            case 2:
                ((C1200g) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((l) obj).writeExternal(objectOutput);
                return;
            case 4:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(j$.time.temporal.l.a(yVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(yVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(yVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                ((z) obj).H(objectOutput);
                return;
            case 6:
                ((r) obj).writeExternal(objectOutput);
                return;
            case 7:
                D d7 = (D) obj;
                d7.getClass();
                objectOutput.writeInt(j$.time.temporal.l.a(d7, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(d7, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(d7, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                J j = (J) obj;
                j.getClass();
                objectOutput.writeInt(j$.time.temporal.l.a(j, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(j, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(j, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((C1201h) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object s7;
        byte readByte = objectInput.readByte();
        this.f12600a = readByte;
        switch (readByte) {
            case 1:
                int i7 = AbstractC1194a.f12609c;
                s7 = AbstractC1194a.s(objectInput.readUTF());
                break;
            case 2:
                s7 = ((InterfaceC1195b) objectInput.readObject()).z((j$.time.l) objectInput.readObject());
                break;
            case 3:
                s7 = ((InterfaceC1198e) objectInput.readObject()).p((ZoneOffset) objectInput.readObject()).k((ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.h hVar = y.f12646d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                w.f12644d.getClass();
                s7 = new y(j$.time.h.g0(readInt, readByte2, readByte3));
                break;
            case 5:
                z zVar = z.f12650d;
                s7 = z.v(objectInput.readByte());
                break;
            case 6:
                p pVar = (p) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                pVar.getClass();
                s7 = r.Y(pVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                B.f12596d.getClass();
                s7 = new D(j$.time.h.g0(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                H.f12603d.getClass();
                s7 = new J(j$.time.h.g0(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i8 = C1201h.f12614e;
                s7 = new C1201h(AbstractC1194a.s(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f12601b = s7;
    }

    private Object readResolve() {
        return this.f12601b;
    }
}
