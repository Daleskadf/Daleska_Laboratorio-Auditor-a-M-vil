package com.adobe.fre;

import com.adobe.fre.FREObject;
/* loaded from: classes.dex */
public class FREArray extends FREObject {
    public native long getLength() throws FREInvalidObjectException, FREWrongThreadException;

    public native FREObject getObjectAt(long j) throws FREInvalidObjectException, IllegalArgumentException, FREWrongThreadException;

    public native void setLength(long j) throws FREInvalidObjectException, IllegalArgumentException, FREReadOnlyException, FREWrongThreadException;

    public native void setObjectAt(long j, FREObject fREObject) throws FREInvalidObjectException, FRETypeMismatchException, FREWrongThreadException;

    private FREArray(FREObject.CFREObjectWrapper cFREObjectWrapper) {
        super(cFREObjectWrapper);
    }

    protected FREArray(String str, FREObject[] fREObjectArr) throws FRETypeMismatchException, FREInvalidObjectException, FREASErrorException, FRENoSuchNameException, FREWrongThreadException {
        super("Vector.<" + str + ">", fREObjectArr);
    }

    protected FREArray(FREObject[] fREObjectArr) throws FRETypeMismatchException, FREInvalidObjectException, FREASErrorException, FRENoSuchNameException, FREWrongThreadException {
        super("Array", fREObjectArr);
    }

    public static FREArray newArray(String str, int i, boolean z) throws FREASErrorException, FRENoSuchNameException, FREWrongThreadException, IllegalStateException {
        try {
            return new FREArray(str, new FREObject[]{new FREObject(i), new FREObject(z)});
        } catch (FREInvalidObjectException | FRETypeMismatchException unused) {
            return null;
        }
    }

    public static FREArray newArray(int i) throws FREASErrorException, FREWrongThreadException, IllegalStateException {
        try {
            return new FREArray(new FREObject[]{new FREObject(i)});
        } catch (FREInvalidObjectException | FRENoSuchNameException | FRETypeMismatchException unused) {
            return null;
        }
    }
}
