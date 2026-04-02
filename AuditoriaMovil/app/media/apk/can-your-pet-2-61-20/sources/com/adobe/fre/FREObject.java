package com.adobe.fre;
/* loaded from: classes.dex */
public class FREObject {
    private long m_objectPointer;

    private native void FREObjectFromBoolean(boolean z) throws FREWrongThreadException;

    private native void FREObjectFromClass(String str, FREObject[] fREObjectArr) throws FRETypeMismatchException, FREInvalidObjectException, FREASErrorException, FRENoSuchNameException, FREWrongThreadException;

    private native void FREObjectFromDouble(double d) throws FREWrongThreadException;

    private native void FREObjectFromInt(int i) throws FREWrongThreadException;

    private native void FREObjectFromString(String str) throws FREWrongThreadException;

    public static native FREObject newObject(String str, FREObject[] fREObjectArr) throws FRETypeMismatchException, FREInvalidObjectException, FREASErrorException, FRENoSuchNameException, FREWrongThreadException, IllegalStateException;

    public native FREObject callMethod(String str, FREObject[] fREObjectArr) throws FRETypeMismatchException, FREInvalidObjectException, FREASErrorException, FRENoSuchNameException, FREWrongThreadException, IllegalStateException;

    public native boolean getAsBool() throws FRETypeMismatchException, FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    public native double getAsDouble() throws FRETypeMismatchException, FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    public native int getAsInt() throws FRETypeMismatchException, FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    public native String getAsString() throws FRETypeMismatchException, FREInvalidObjectException, FREWrongThreadException, IllegalStateException;

    public native FREObject getProperty(String str) throws FRETypeMismatchException, FREInvalidObjectException, FREASErrorException, FRENoSuchNameException, FREWrongThreadException, IllegalStateException;

    public native void setProperty(String str, FREObject fREObject) throws FRETypeMismatchException, FREInvalidObjectException, FREASErrorException, FRENoSuchNameException, FREReadOnlyException, FREWrongThreadException, IllegalStateException;

    /* loaded from: classes.dex */
    protected static class CFREObjectWrapper {
        private long m_objectPointer;

        private CFREObjectWrapper(long j) {
            this.m_objectPointer = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FREObject(CFREObjectWrapper cFREObjectWrapper) {
        this.m_objectPointer = cFREObjectWrapper.m_objectPointer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FREObject(int i) throws FREWrongThreadException {
        FREObjectFromInt(i);
    }

    protected FREObject(double d) throws FREWrongThreadException {
        FREObjectFromDouble(d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FREObject(boolean z) throws FREWrongThreadException {
        FREObjectFromBoolean(z);
    }

    protected FREObject(String str) throws FREWrongThreadException {
        FREObjectFromString(str);
    }

    public static FREObject newObject(int i) throws FREWrongThreadException {
        return new FREObject(i);
    }

    public static FREObject newObject(double d) throws FREWrongThreadException {
        return new FREObject(d);
    }

    public static FREObject newObject(boolean z) throws FREWrongThreadException {
        return new FREObject(z);
    }

    public static FREObject newObject(String str) throws FREWrongThreadException {
        return new FREObject(str);
    }

    public FREObject(String str, FREObject[] fREObjectArr) throws FRETypeMismatchException, FREInvalidObjectException, FREASErrorException, FRENoSuchNameException, FREWrongThreadException, IllegalStateException {
        FREObjectFromClass(str, fREObjectArr);
    }
}
