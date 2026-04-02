package org.apache.tika.fork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
class InputStreamResource implements ForkResource {
    private final InputStream stream;

    public InputStreamResource(InputStream inputStream) {
        this.stream = inputStream;
    }

    @Override // org.apache.tika.fork.ForkResource
    public Throwable process(DataInputStream dataInputStream, DataOutputStream dataOutputStream) {
        int i7;
        byte[] bArr = new byte[dataInputStream.readInt()];
        try {
            i7 = this.stream.read(bArr);
        } catch (IOException e7) {
            e7.printStackTrace();
            i7 = -1;
        }
        dataOutputStream.writeInt(i7);
        if (i7 > 0) {
            dataOutputStream.write(bArr, 0, i7);
        }
        dataOutputStream.flush();
        return null;
    }
}
