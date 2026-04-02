package com.adobe.air;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.adobe.air.AndroidActivityWrapper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes.dex */
public final class CameraUI implements AndroidActivityWrapper.ActivityResultCallback {
    public static final int ERROR_ACTIVITY_DESTROYED = 4;
    public static final int ERROR_CAMERA_BUSY = 1;
    public static final int ERROR_CAMERA_ERROR = 2;
    public static final int ERROR_CAMERA_UNAVAILABLE = 3;
    private static final String LOG_TAG = "CameraUI";
    private static final String PHONE_STORAGE = "phoneStorage";
    public static final int REQUESTED_MEDIA_TYPE_IMAGE = 1;
    public static final int REQUESTED_MEDIA_TYPE_INVALID = 0;
    public static final int REQUESTED_MEDIA_TYPE_VIDEO = 2;
    private static String sCameraRollPath;
    private static CameraUI sCameraUI;
    private long mLastClientId = 0;
    private boolean mCameraBusy = false;
    private String mImagePath = null;

    private native void nativeOnCameraCancel(long j);

    private native void nativeOnCameraError(long j, int i);

    private native void nativeOnCameraResult(long j, String str, String str2, String str3);

    private void onCameraError(int i) {
        long j = this.mLastClientId;
        if (j != 0) {
            nativeOnCameraError(j, i);
            this.mLastClientId = 0L;
        }
    }

    private void onCameraCancel() {
        long j = this.mLastClientId;
        if (j != 0) {
            nativeOnCameraCancel(j);
            this.mLastClientId = 0L;
        }
    }

    private void onCameraResult(String str, String str2, String str3) {
        long j = this.mLastClientId;
        if (j != 0) {
            nativeOnCameraResult(j, str, str2, str3);
            this.mLastClientId = 0L;
        }
    }

    private CameraUI() {
    }

    public static synchronized CameraUI getCameraUI() {
        CameraUI cameraUI;
        synchronized (CameraUI.class) {
            if (sCameraUI == null) {
                sCameraUI = new CameraUI();
                AndroidActivityWrapper.GetAndroidActivityWrapper().addActivityResultListener(sCameraUI);
            }
            cameraUI = sCameraUI;
        }
        return cameraUI;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void unregisterCallbacks(long j) {
        if (this.mLastClientId == j) {
            this.mLastClientId = 0L;
        }
    }

    private String toMediaType(String str) {
        if (str != null) {
            if (str.startsWith("image/")) {
                return new String("image");
            }
            if (str.startsWith("video/")) {
                return new String("video");
            }
        }
        return null;
    }

    private File getFileFromUri(Uri uri, Activity activity) {
        Cursor cursorFromUri = getCursorFromUri(uri, activity, new String[]{"_data"});
        if (cursorFromUri != null) {
            try {
                return new File(cursorFromUri.getString(cursorFromUri.getColumnIndexOrThrow("_data")));
            } catch (IllegalArgumentException unused) {
            } finally {
                cursorFromUri.close();
            }
        }
        return null;
    }

    private Cursor getCursorFromUri(Uri uri, Activity activity, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor query = activity.getContentResolver().query(uri, strArr, null, null, null);
            try {
                if (!query.moveToFirst()) {
                    query.close();
                    if ((!query.moveToFirst()) & (query != null)) {
                        query.close();
                    }
                    return null;
                }
                if ((!query.moveToFirst()) & (query != null)) {
                    query.close();
                }
                return query;
            } catch (Throwable th) {
                th = th;
                cursor = query;
                if ((!cursor.moveToFirst()) & (cursor != null)) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void processImageSuccessResult() {
        ExifInterface exifInterface;
        String str = new String("image");
        File file = new File(this.mImagePath);
        String name = file.getName();
        String[] strArr = {this.mImagePath};
        try {
            exifInterface = new ExifInterface(this.mImagePath);
        } catch (IOException e) {
            e.printStackTrace();
            exifInterface = null;
        }
        Bitmap rotateBitmap = rotateBitmap(BitmapFactory.decodeFile(this.mImagePath), Integer.parseInt(exifInterface.getAttribute("Orientation")));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (rotateBitmap != null) {
                rotateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        MediaScannerConnection.scanFile(AndroidActivityWrapper.GetAndroidActivityWrapper().getDefaultContext(), strArr, null, null);
        onCameraResult(this.mImagePath, str, name);
    }

    public Bitmap rotateBitmap(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
            default:
                return bitmap;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void processVideoSuccessResult(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "_data"
            java.lang.String r1 = "mime_type"
            java.lang.String r2 = "_display_name"
            java.lang.String[] r3 = new java.lang.String[]{r0, r1, r2}
            android.net.Uri r7 = r7.getData()
            com.adobe.air.AndroidActivityWrapper r4 = com.adobe.air.AndroidActivityWrapper.GetAndroidActivityWrapper()
            android.app.Activity r4 = r4.getActivity()
            android.database.Cursor r7 = r6.getCursorFromUri(r7, r4, r3)
            java.lang.String r3 = "video"
            r4 = 0
            if (r7 == 0) goto L6a
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L5d java.lang.IllegalArgumentException -> L62
            int r1 = r7.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L5d java.lang.IllegalArgumentException -> L62
            int r2 = r7.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L5d java.lang.IllegalArgumentException -> L62
            java.lang.String r0 = r7.getString(r0)     // Catch: java.lang.Throwable -> L5d java.lang.IllegalArgumentException -> L62
            if (r0 == 0) goto L57
            java.lang.String r1 = r7.getString(r1)     // Catch: java.lang.IllegalArgumentException -> L53 java.lang.Throwable -> L5d
            java.lang.String r1 = r6.toMediaType(r1)     // Catch: java.lang.IllegalArgumentException -> L53 java.lang.Throwable -> L5d
            if (r1 != 0) goto L41
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.IllegalArgumentException -> L51 java.lang.Throwable -> L5d
            r5.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L51 java.lang.Throwable -> L5d
            r1 = r5
        L41:
            java.lang.String r2 = r7.getString(r2)     // Catch: java.lang.IllegalArgumentException -> L51 java.lang.Throwable -> L5d
            if (r2 != 0) goto L4f
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.IllegalArgumentException -> L55 java.lang.Throwable -> L5d
            java.lang.String r5 = ""
            r4.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L55 java.lang.Throwable -> L5d
            goto L58
        L4f:
            r4 = r2
            goto L58
        L51:
            r2 = r4
            goto L55
        L53:
            r1 = r4
            r2 = r1
        L55:
            r4 = r0
            goto L64
        L57:
            r1 = r4
        L58:
            r7.close()
            r2 = r4
            goto L68
        L5d:
            r0 = move-exception
            r7.close()
            throw r0
        L62:
            r1 = r4
            r2 = r1
        L64:
            r7.close()
            r0 = r4
        L68:
            r4 = r1
            goto L6c
        L6a:
            r0 = r4
            r2 = r0
        L6c:
            if (r4 == 0) goto L76
            java.lang.String r7 = "image"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L7c
        L76:
            boolean r7 = r4.equals(r3)
            if (r7 == 0) goto L80
        L7c:
            r6.onCameraResult(r0, r4, r2)
            goto L84
        L80:
            r7 = 2
            r6.onCameraError(r7)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.CameraUI.processVideoSuccessResult(android.content.Intent):void");
    }

    @Override // com.adobe.air.AndroidActivityWrapper.ActivityResultCallback
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 3 || i == 4) {
            this.mCameraBusy = false;
            if (this.mLastClientId == 0) {
                return;
            }
            if (i2 != -1) {
                if (i2 == 0) {
                    if (this.mImagePath != null) {
                        this.mImagePath = null;
                    }
                    onCameraCancel();
                    return;
                }
                if (this.mImagePath != null) {
                    this.mImagePath = null;
                }
                onCameraError(2);
            } else if (i != 3) {
                if (i == 4) {
                    processVideoSuccessResult(intent);
                }
            } else if (this.mImagePath != null) {
                processImageSuccessResult();
                this.mImagePath = null;
            } else {
                onCameraCancel();
            }
        }
    }

    public void launch(long j, int i) {
        int stillPictureWork;
        if (j == 0) {
            return;
        }
        if (this.mCameraBusy) {
            nativeOnCameraError(j, 1);
            return;
        }
        if (this.mLastClientId != 0) {
            onCameraError(1);
        }
        this.mLastClientId = j;
        this.mCameraBusy = true;
        if (i == 1) {
            stillPictureWork = stillPictureWork();
        } else {
            stillPictureWork = i != 2 ? 3 : videoCaptureWork();
        }
        if (stillPictureWork != 0) {
            this.mCameraBusy = false;
            onCameraError(stillPictureWork);
        }
    }

    private int videoCaptureWork() {
        try {
            Activity activity = AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity();
            if (activity == null) {
                return 4;
            }
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("android.intent.extra.videoQuality", 0);
            activity.startActivityForResult(intent, 4);
            return 0;
        } catch (ActivityNotFoundException unused) {
            return 3;
        }
    }

    private String getCameraRollDirectory(Activity activity) {
        Uri uri;
        String str = sCameraRollPath;
        if (str != null) {
            return str;
        }
        try {
            uri = activity.getContentResolver().insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, new ContentValues());
        } catch (Exception unused) {
            uri = null;
        }
        if (uri == null) {
            try {
                uri = activity.getContentResolver().insert(MediaStore.Images.Media.getContentUri(PHONE_STORAGE), new ContentValues());
            } catch (Exception unused2) {
            }
        }
        if (uri != null) {
            try {
                sCameraRollPath = getFileFromUri(uri, activity).getParent();
            } catch (ActivityNotFoundException | NullPointerException unused3) {
            } catch (Throwable th) {
                activity.getContentResolver().delete(uri, null, null);
                throw th;
            }
            activity.getContentResolver().delete(uri, null, null);
        } else {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            if (externalStoragePublicDirectory.exists()) {
                sCameraRollPath = externalStoragePublicDirectory.toString();
            }
        }
        return sCameraRollPath;
    }

    private int stillPictureWork() {
        String str;
        File file;
        Uri uri;
        Activity activity = AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity();
        if (activity == null) {
            return 4;
        }
        int i = 2;
        if ((AndroidActivityWrapper.GetAndroidActivityWrapper().GetTargetSdkVersion() < 23 || Build.VERSION.SDK_INT < 23) && getCameraRollDirectory(activity) == null) {
            return 2;
        }
        String format = new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss").format(new Date(System.currentTimeMillis()));
        String str2 = null;
        if (AndroidActivityWrapper.GetAndroidActivityWrapper().GetTargetSdkVersion() >= 23 && Build.VERSION.SDK_INT >= 23) {
            File file2 = new File(activity.getCacheDir(), "Pictures");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            try {
                file = File.createTempFile(format, ".jpg", file2);
                str = file.getAbsolutePath();
            } catch (IOException unused) {
                file = null;
                str = null;
            }
        } else {
            str = getCameraRollDirectory(activity) + "/" + format + ".jpg";
            file = new File(str);
            if (file.exists()) {
                file = null;
            }
        }
        if (file == null) {
            return 2;
        }
        try {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (AndroidActivityWrapper.GetAndroidActivityWrapper().GetTargetSdkVersion() >= 23 && Build.VERSION.SDK_INT >= 23) {
                try {
                    uri = CameraUIProvider.getUriForFile(activity, activity.getPackageName() + ".provider", file);
                } catch (Exception e) {
                    e.printStackTrace();
                    uri = null;
                }
                intent.putExtra("output", uri);
                intent.setFlags(2);
            } else {
                intent.putExtra("output", Uri.fromFile(file));
            }
            activity.startActivityForResult(intent, 3);
            i = 0;
            str2 = str;
        } catch (ActivityNotFoundException unused2) {
            i = 3;
        } catch (NullPointerException unused3) {
        }
        this.mImagePath = str2;
        return i;
    }
}
