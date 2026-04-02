package com.adobe.air;

import android.content.res.Configuration;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import com.adobe.air.AndroidActivityWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
/* loaded from: classes.dex */
public class AndroidCamera {
    private static final int CAMERA_POSITION_UNKNOWN = -1;
    private static final String LOG_TAG = "AndroidCamera";
    private static boolean sAreMultipleCamerasSupportedInitialized = false;
    private static boolean sAreMultipleCamerasSupportedOnDevice = false;
    private static Class<?> sCameraInfoClass;
    private static Method sMIDGetCameraInfo;
    private static Method sMIDGetNumberOfCameras;
    private static Method sMIDOpen;
    private static Method sMIDOpenWithCameraID;
    private long mClientId;
    private Camera mCamera = null;
    private int mCameraId = 0;
    private boolean mInitialized = false;
    private boolean mCallbacksRegistered = false;
    private boolean mPreviewSurfaceValid = true;
    private boolean mCapturing = false;
    private AndroidActivityWrapper.StateChangeCallback mActivityStateCB = null;
    private byte[] mCallbackBuffer = null;
    private byte[] mBuffer1 = null;
    private byte[] mBuffer2 = null;

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnCanOpenCamera(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnFrameCaptured(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnShouldCloseCamera(long j);

    public AndroidCamera(long j) {
        this.mClientId = j;
        areMultipleCamerasSupportedOnDevice();
    }

    public static boolean areMultipleCamerasSupportedOnDevice() {
        if (sAreMultipleCamerasSupportedInitialized) {
            return sAreMultipleCamerasSupportedOnDevice;
        }
        sAreMultipleCamerasSupportedInitialized = true;
        try {
            sMIDOpenWithCameraID = Camera.class.getMethod("open", Integer.TYPE);
            Class[] clsArr = null;
            sMIDGetNumberOfCameras = Camera.class.getDeclaredMethod("getNumberOfCameras", null);
            sCameraInfoClass = Class.forName("android.hardware.Camera$CameraInfo");
            Method method = Camera.class.getMethod("getCameraInfo", Integer.TYPE, sCameraInfoClass);
            sMIDGetCameraInfo = method;
            if (sMIDOpenWithCameraID != null && sMIDGetNumberOfCameras != null && method != null) {
                sAreMultipleCamerasSupportedOnDevice = true;
            }
            return sAreMultipleCamerasSupportedOnDevice;
        } catch (NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean open(int r8) {
        /*
            r7 = this;
            android.hardware.Camera r0 = r7.mCamera
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 0
            r2 = 0
            com.adobe.air.AndroidActivityWrapper r3 = com.adobe.air.AndroidActivityWrapper.GetAndroidActivityWrapper()     // Catch: java.lang.Exception -> L45
            com.adobe.air.AndroidCameraView r3 = r3.getCameraView()     // Catch: java.lang.Exception -> L45
            android.view.SurfaceHolder r3 = r3.getHolder()     // Catch: java.lang.Exception -> L45
            if (r3 == 0) goto L50
            android.view.Surface r4 = r3.getSurface()     // Catch: java.lang.Exception -> L43
            if (r4 == 0) goto L50
            boolean r4 = com.adobe.air.AndroidCamera.sAreMultipleCamerasSupportedOnDevice     // Catch: java.lang.Exception -> L43
            if (r4 == 0) goto L35
            java.lang.reflect.Method r4 = com.adobe.air.AndroidCamera.sMIDOpenWithCameraID     // Catch: java.lang.Exception -> L43
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L43
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L43
            r5[r2] = r6     // Catch: java.lang.Exception -> L43
            java.lang.Object r4 = r4.invoke(r0, r5)     // Catch: java.lang.Exception -> L43
            android.hardware.Camera r4 = (android.hardware.Camera) r4     // Catch: java.lang.Exception -> L43
            r7.mCamera = r4     // Catch: java.lang.Exception -> L43
            r7.mCameraId = r8     // Catch: java.lang.Exception -> L43
            goto L3d
        L35:
            android.hardware.Camera r8 = android.hardware.Camera.open()     // Catch: java.lang.Exception -> L43
            r7.mCamera = r8     // Catch: java.lang.Exception -> L43
            r7.mCameraId = r2     // Catch: java.lang.Exception -> L43
        L3d:
            android.hardware.Camera r8 = r7.mCamera     // Catch: java.lang.Exception -> L43
            r8.setPreviewDisplay(r3)     // Catch: java.lang.Exception -> L43
            goto L50
        L43:
            goto L47
        L45:
            r3 = r0
        L47:
            android.hardware.Camera r8 = r7.mCamera
            if (r8 == 0) goto L50
            r8.release()
            r7.mCamera = r0
        L50:
            android.hardware.Camera r8 = r7.mCamera
            if (r8 == 0) goto L5d
            com.adobe.air.AndroidCamera$PreviewSurfaceCallback r8 = new com.adobe.air.AndroidCamera$PreviewSurfaceCallback
            r8.<init>()
            r3.addCallback(r8)
            goto L5e
        L5d:
            r1 = 0
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AndroidCamera.open(int):boolean");
    }

    public Camera getCamera() {
        return this.mCamera;
    }

    public int[] getSupportedFps() {
        int i = 0;
        int[] iArr = new int[0];
        try {
            List<Integer> supportedPreviewFrameRates = this.mCamera.getParameters().getSupportedPreviewFrameRates();
            iArr = new int[supportedPreviewFrameRates.size()];
            for (Integer num : supportedPreviewFrameRates) {
                int i2 = i + 1;
                iArr[i] = num.intValue();
                i = i2;
            }
        } catch (Exception unused) {
        }
        return iArr;
    }

    public int getCameraPosition() {
        Object newInstance;
        if (sAreMultipleCamerasSupportedOnDevice) {
            Class<?> cls = sCameraInfoClass;
            Field field = null;
            if (cls != null) {
                try {
                    newInstance = cls.newInstance();
                } catch (Exception unused) {
                    return -1;
                }
            } else {
                newInstance = null;
            }
            try {
                sMIDGetCameraInfo.invoke(this.mCamera, Integer.valueOf(this.mCameraId), newInstance);
                if (newInstance != null) {
                    try {
                        field = newInstance.getClass().getField("facing");
                    } catch (Exception unused2) {
                        return -1;
                    }
                }
                return field.getInt(newInstance);
            } catch (Exception unused3) {
                return -1;
            }
        }
        return -1;
    }

    public static int getNumberOfCameras() {
        if (areMultipleCamerasSupportedOnDevice()) {
            try {
                Object[] objArr = null;
                return ((Integer) sMIDGetNumberOfCameras.invoke(null, null)).intValue();
            } catch (Exception unused) {
                return 1;
            }
        }
        return 1;
    }

    public int[] getSupportedFormats() {
        int i = 0;
        int[] iArr = new int[0];
        try {
            List<Integer> supportedPreviewFormats = this.mCamera.getParameters().getSupportedPreviewFormats();
            iArr = new int[supportedPreviewFormats.size()];
            for (Integer num : supportedPreviewFormats) {
                int i2 = i + 1;
                iArr[i] = num.intValue();
                i = i2;
            }
        } catch (Exception unused) {
        }
        return iArr;
    }

    public int[] getSupportedVideoSizes() {
        int i = 0;
        int[] iArr = new int[0];
        try {
            List<Camera.Size> supportedPreviewSizes = this.mCamera.getParameters().getSupportedPreviewSizes();
            iArr = new int[supportedPreviewSizes.size() * 2];
            for (Camera.Size size : supportedPreviewSizes) {
                int i2 = i + 1;
                iArr[i] = size.width;
                i = i2 + 1;
                iArr[i2] = size.height;
            }
        } catch (Exception unused) {
        }
        return iArr;
    }

    public int getCaptureWidth() {
        try {
            return this.mCamera.getParameters().getPreviewSize().width;
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getCaptureHeight() {
        try {
            return this.mCamera.getParameters().getPreviewSize().height;
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getCaptureFormat() {
        try {
            return this.mCamera.getParameters().getPreviewFormat();
        } catch (Exception unused) {
            return 0;
        }
    }

    public boolean setContinuousFocusMode() {
        Camera camera = this.mCamera;
        if (camera == null) {
            return false;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            if (supportedFocusModes.contains("continuous-video")) {
                parameters.setFocusMode("continuous-video");
                this.mCamera.setParameters(parameters);
            } else if (!supportedFocusModes.contains("edof")) {
                return false;
            } else {
                parameters.setFocusMode("edof");
                this.mCamera.setParameters(parameters);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        	at java.base/java.util.BitSet.or(BitSet.java:941)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public boolean autoFocus() {
        /*
            r3 = this;
            android.hardware.Camera r0 = r3.mCamera
            r1 = 0
            if (r0 == 0) goto L25
            boolean r2 = r3.mCapturing
            if (r2 != 0) goto La
            goto L25
        La:
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = r0.getFocusMode()     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = "fixed"
            if (r0 == r2) goto L25
            java.lang.String r2 = "infinity"
            if (r0 == r2) goto L25
            java.lang.String r2 = "continuous-video"
            if (r0 == r2) goto L25
            android.hardware.Camera r0 = r3.mCamera     // Catch: java.lang.Exception -> L25
            r2 = 0
            r0.autoFocus(r2)     // Catch: java.lang.Exception -> L25
            r1 = 1
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AndroidCamera.autoFocus():boolean");
    }

    public boolean startCapture(int i, int i2, int i3, int i4) {
        Camera camera = this.mCamera;
        boolean z = false;
        if (camera == null) {
            return false;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setPreviewSize(i, i2);
            parameters.setPreviewFrameRate(i3);
            parameters.setPreviewFormat(i4);
            this.mCamera.setParameters(parameters);
            this.mCamera.setPreviewCallbackWithBuffer(new Camera.PreviewCallback() { // from class: com.adobe.air.AndroidCamera.1
                @Override // android.hardware.Camera.PreviewCallback
                public void onPreviewFrame(byte[] bArr, Camera camera2) {
                    try {
                        if (AndroidCamera.this.mClientId != 0 && AndroidCamera.this.mCallbacksRegistered) {
                            AndroidCamera androidCamera = AndroidCamera.this;
                            androidCamera.nativeOnFrameCaptured(androidCamera.mClientId, bArr);
                        }
                        if (AndroidCamera.this.mCallbackBuffer == AndroidCamera.this.mBuffer1) {
                            AndroidCamera androidCamera2 = AndroidCamera.this;
                            androidCamera2.mCallbackBuffer = androidCamera2.mBuffer2;
                        } else {
                            AndroidCamera androidCamera3 = AndroidCamera.this;
                            androidCamera3.mCallbackBuffer = androidCamera3.mBuffer1;
                        }
                        AndroidCamera.this.mCamera.addCallbackBuffer(AndroidCamera.this.mCallbackBuffer);
                    } catch (Exception unused) {
                    }
                }
            });
            this.mCamera.startPreview();
            Camera.Parameters parameters2 = this.mCamera.getParameters();
            int bitsPerPixel = parameters2.getPreviewSize().width * parameters2.getPreviewSize().height * ImageFormat.getBitsPerPixel(parameters2.getPreviewFormat());
            byte[] bArr = new byte[bitsPerPixel];
            this.mBuffer1 = bArr;
            this.mBuffer2 = new byte[bitsPerPixel];
            this.mCallbackBuffer = bArr;
            this.mCamera.addCallbackBuffer(bArr);
            z = true;
            this.mCapturing = true;
            return true;
        } catch (Exception unused) {
            return z;
        }
    }

    public void stopCapture() {
        Camera camera = this.mCamera;
        if (camera != null) {
            camera.setPreviewCallback(null);
            this.mCamera.stopPreview();
            this.mCallbackBuffer = null;
            this.mBuffer1 = null;
            this.mBuffer2 = null;
        }
        this.mCapturing = false;
    }

    public void close() {
        if (this.mCamera != null) {
            stopCapture();
            this.mCamera.release();
            this.mCamera = null;
        }
    }

    public void registerCallbacks(boolean z) {
        this.mCallbacksRegistered = z;
        if (z) {
            if (this.mActivityStateCB == null) {
                this.mActivityStateCB = new AndroidActivityWrapper.StateChangeCallback() { // from class: com.adobe.air.AndroidCamera.2
                    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
                    public void onConfigurationChanged(Configuration configuration) {
                    }

                    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
                    public void onActivityStateChanged(AndroidActivityWrapper.ActivityState activityState) {
                        if (AndroidCamera.this.mClientId == 0 || !AndroidCamera.this.mCallbacksRegistered) {
                            return;
                        }
                        if (activityState == AndroidActivityWrapper.ActivityState.RESUMED && AndroidCamera.this.mPreviewSurfaceValid) {
                            AndroidCamera androidCamera = AndroidCamera.this;
                            androidCamera.nativeOnCanOpenCamera(androidCamera.mClientId);
                        } else if (activityState == AndroidActivityWrapper.ActivityState.PAUSED) {
                            AndroidCamera androidCamera2 = AndroidCamera.this;
                            androidCamera2.nativeOnShouldCloseCamera(androidCamera2.mClientId);
                        }
                    }
                };
            }
            AndroidActivityWrapper.GetAndroidActivityWrapper().addActivityStateChangeListner(this.mActivityStateCB);
            return;
        }
        if (this.mActivityStateCB != null) {
            AndroidActivityWrapper.GetAndroidActivityWrapper().removeActivityStateChangeListner(this.mActivityStateCB);
        }
        this.mActivityStateCB = null;
    }

    /* loaded from: classes.dex */
    class PreviewSurfaceCallback implements SurfaceHolder.Callback {
        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        PreviewSurfaceCallback() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            AndroidCamera.this.mPreviewSurfaceValid = true;
            if (AndroidCamera.this.mClientId == 0 || !AndroidCamera.this.mCallbacksRegistered) {
                return;
            }
            AndroidCamera androidCamera = AndroidCamera.this;
            androidCamera.nativeOnCanOpenCamera(androidCamera.mClientId);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            AndroidCamera.this.mPreviewSurfaceValid = false;
            if (AndroidCamera.this.mClientId == 0 || !AndroidCamera.this.mCallbacksRegistered) {
                return;
            }
            AndroidCamera androidCamera = AndroidCamera.this;
            androidCamera.nativeOnShouldCloseCamera(androidCamera.mClientId);
        }
    }
}
