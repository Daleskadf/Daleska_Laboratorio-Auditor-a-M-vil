package com.adobe.fre;

import com.adobe.fre.FREObject;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class FREBitmapData extends FREObject {
    private long m_dataPointer;

    public native void acquire() throws FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    public native ByteBuffer getBits() throws FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    public native int getHeight() throws FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    public native int getLineStride32() throws FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    public native int getWidth() throws FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    public native boolean hasAlpha() throws FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    public native void invalidateRect(int i, int i2, int i3, int i4) throws FREInvalidObjectException, FREWrongThreadException, IllegalStateException, IllegalArgumentException;

    public native boolean isInvertedY() throws FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    public native boolean isPremultiplied() throws FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    public native void release() throws FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    private FREBitmapData(FREObject.CFREObjectWrapper cFREObjectWrapper) {
        super(cFREObjectWrapper);
    }

    protected FREBitmapData(FREObject[] fREObjectArr) throws FRETypeMismatchException, FREInvalidObjectException, FREASErrorException, FRENoSuchNameException, FREWrongThreadException, IllegalStateException {
        super("flash.display.BitmapData", fREObjectArr);
    }

    public static FREBitmapData newBitmapData(int i, int i2, boolean z, Byte[] bArr) throws FREASErrorException, FREWrongThreadException, IllegalArgumentException {
        if (bArr.length != 4) {
            throw new IllegalArgumentException("fillColor has wrong length");
        }
        FREObject[] fREObjectArr = new FREObject[4];
        FREObject fREObject = new FREObject(i);
        fREObjectArr[0] = fREObject;
        fREObjectArr[1] = new FREObject(i2);
        fREObjectArr[2] = new FREObject(z);
        int i3 = 0;
        int i4 = -1;
        for (int i5 = 0; i5 < 4; i5++) {
            i3 |= (bArr[i5].byteValue() << ((3 - i5) * 8)) & i4;
            i4 >>>= 8;
        }
        fREObjectArr[3] = new FREObject(i3);
        try {
            return new FREBitmapData(fREObjectArr);
        } catch (FREInvalidObjectException | FRENoSuchNameException | FRETypeMismatchException unused) {
            return null;
        }
    }
}
