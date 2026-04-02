package com.adobe.fre;

import com.adobe.fre.FREObject;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class FREByteArray extends FREObject {
    private long m_dataPointer;

    public native void acquire() throws FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    public native ByteBuffer getBytes() throws FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    public native long getLength() throws FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    public native void release() throws FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    public native void setLength(long j) throws FREInvalidObjectException, FREWrongThreadException, IllegalArgumentException;

    private FREByteArray(FREObject.CFREObjectWrapper cFREObjectWrapper) {
        super(cFREObjectWrapper);
    }

    protected FREByteArray() throws FRETypeMismatchException, FREInvalidObjectException, FREASErrorException, FRENoSuchNameException, FREWrongThreadException, IllegalStateException {
        super("flash.utils.ByteArray", null);
    }

    public static FREByteArray newByteArray() throws FREASErrorException, FREWrongThreadException, IllegalStateException {
        try {
            return new FREByteArray();
        } catch (FREInvalidObjectException | FRENoSuchNameException | FRETypeMismatchException unused) {
            return null;
        }
    }

    public static FREByteArray newByteArray(long j) throws FREASErrorException, FREWrongThreadException, IllegalStateException, IllegalArgumentException {
        try {
            FREByteArray fREByteArray = new FREByteArray();
            fREByteArray.setLength(j);
            return fREByteArray;
        } catch (FREInvalidObjectException | FRENoSuchNameException | FRETypeMismatchException unused) {
            return null;
        }
    }
}
