package com.adobe.air;
/* loaded from: classes.dex */
public class FlashEGLFactory {

    /* loaded from: classes.dex */
    public enum FlashEGLType {
        FLASHEGL10,
        FLASHEGL14
    }

    private FlashEGLFactory() {
    }

    public static FlashEGL CreateFlashEGL() {
        FlashEGLType flashEGLType = FlashEGLType.FLASHEGL10;
        return CreateFlashEGL(FlashEGLType.FLASHEGL14);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adobe.air.FlashEGLFactory$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$air$FlashEGLFactory$FlashEGLType;

        static {
            int[] iArr = new int[FlashEGLType.values().length];
            $SwitchMap$com$adobe$air$FlashEGLFactory$FlashEGLType = iArr;
            try {
                iArr[FlashEGLType.FLASHEGL14.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$air$FlashEGLFactory$FlashEGLType[FlashEGLType.FLASHEGL10.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static FlashEGL CreateFlashEGL(FlashEGLType flashEGLType) {
        if (AnonymousClass1.$SwitchMap$com$adobe$air$FlashEGLFactory$FlashEGLType[flashEGLType.ordinal()] == 1) {
            return new FlashEGL10();
        }
        return new FlashEGL10();
    }
}
