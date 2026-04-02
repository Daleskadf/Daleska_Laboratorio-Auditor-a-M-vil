package com.adobe.air.wand;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.os.Vibrator;
import android.util.Base64;
import android.view.Display;
import com.adobe.air.TouchEventData;
import com.adobe.air.wand.message.Message;
import com.adobe.air.wand.message.MessageDataArray;
import com.adobe.air.wand.message.MessageDataObject;
import com.adobe.air.wand.message.MessageManager;
import com.adobe.air.wand.message.Notification;
import com.adobe.air.wand.message.Request;
import com.adobe.air.wand.message.Response;
import com.adobe.air.wand.motionsensor.Accelerometer;
import com.adobe.air.wand.motionsensor.Gyroscope;
import com.adobe.air.wand.motionsensor.Magnetometer;
import com.adobe.air.wand.motionsensor.MotionSensor;
import com.adobe.air.wand.view.GestureEventData;
import com.adobe.air.wand.view.TouchSensor;
import com.adobe.air.wand.view.WandView;
import java.util.ArrayList;
import java.util.Date;
/* loaded from: classes.dex */
public class TaskManager {
    protected static final String GESTURE_PHASE_ALL = "ALL";
    protected static final String GESTURE_PHASE_BEGIN = "BEGIN";
    protected static final String GESTURE_PHASE_END = "END";
    protected static final String GESTURE_PHASE_UPDATE = "UPDATE";
    protected static final String GESTURE_TYPE_PAN = "GESTURE_PAN";
    protected static final String GESTURE_TYPE_ROTATE = "GESTURE_ROTATE";
    protected static final String GESTURE_TYPE_SWIPE = "GESTURE_SWIPE";
    protected static final String GESTURE_TYPE_TWO_FINGER_TAP = "GESTURE_TWO_FINGER_TAP";
    protected static final String GESTURE_TYPE_ZOOM = "GESTURE_ZOOM";
    private static final String LOG_TAG = "TaskManager";
    protected static final int MOTION_SENSOR_MINIMUM_INTERVAL = 16;
    protected static final String NAME_NOTIFICATION_ACCELEROMETER = "accelerometer";
    protected static final String NAME_NOTIFICATION_ACCELEROMETER_DATA = "acc";
    protected static final String NAME_NOTIFICATION_DURATION = "duration";
    protected static final String NAME_NOTIFICATION_GYROSCOPE = "gyroscope";
    protected static final String NAME_NOTIFICATION_GYROSCOPE_DATA = "gyro";
    protected static final String NAME_NOTIFICATION_INTERVAL = "interval";
    protected static final String NAME_NOTIFICATION_IS_PRIMARY_TOUCH_POINT = "isPrimaryTouchPoint";
    protected static final String NAME_NOTIFICATION_IS_TRANSFORM = "isTransform";
    protected static final String NAME_NOTIFICATION_LOCAL_X = "localX";
    protected static final String NAME_NOTIFICATION_LOCAL_Y = "localY";
    protected static final String NAME_NOTIFICATION_MAGNETOMETER = "magnetometer";
    protected static final String NAME_NOTIFICATION_MAGNETOMETER_DATA = "mag";
    protected static final String NAME_NOTIFICATION_MESSAGE = "message";
    protected static final String NAME_NOTIFICATION_OFFSET_X = "offsetX";
    protected static final String NAME_NOTIFICATION_OFFSET_Y = "offsetY";
    protected static final String NAME_NOTIFICATION_PHASE = "phase";
    protected static final String NAME_NOTIFICATION_PRESSURE = "pressure";
    protected static final String NAME_NOTIFICATION_ROTATION = "rotation";
    protected static final String NAME_NOTIFICATION_SCALE_X = "scaleX";
    protected static final String NAME_NOTIFICATION_SCALE_Y = "scaleY";
    protected static final String NAME_NOTIFICATION_SCREEN_DIMENSIONS = "screenDimensions";
    protected static final String NAME_NOTIFICATION_SIZE_X = "sizeX";
    protected static final String NAME_NOTIFICATION_SIZE_Y = "sizeY";
    protected static final String NAME_NOTIFICATION_START = "start";
    protected static final String NAME_NOTIFICATION_TIMESTAMP = "timestamp";
    protected static final String NAME_NOTIFICATION_TOUCH_POINT_ID = "touchPointID";
    protected static final String NAME_NOTIFICATION_TYPE = "type";
    protected static final String NAME_NOTIFICATION_VIBRATOR = "vibrator";
    protected static final String SCREEN_DIMENSIONS_HEIGHT = "height";
    protected static final String SCREEN_DIMENSIONS_WIDTH = "width";
    protected static final String TOUCH_TYPE_BEGIN = "TOUCH_BEGIN";
    protected static final String TOUCH_TYPE_END = "TOUCH_END";
    protected static final String TOUCH_TYPE_MOVE = "TOUCH_MOVE";
    private final Accelerometer mAccelerometer;
    private final Display mDisplay;
    private final Gyroscope mGyroscope;
    private Listener mListener = null;
    private final Magnetometer mMagnetometer;
    private final MessageManager mMessageManager;
    private final TouchSensor mTouchSensor;
    private final Vibrator mVibrator;

    /* loaded from: classes.dex */
    public interface Listener {
        void drawImage(Bitmap bitmap) throws Exception;

        String getRequestedProtocolVerison() throws Exception;

        void sendConnectionMessage(String str) throws Exception;

        void setScreenOrientation(WandView.ScreenOrientation screenOrientation) throws Exception;
    }

    /* loaded from: classes.dex */
    public enum MessageTitle {
        ACCELEROMETER_EVENT("ACCELEROMETER_EVENT"),
        MAGNETOMETER_EVENT("MAGNETOMETER_EVENT"),
        GYROSCOPE_EVENT("GYROSCOPE_EVENT"),
        TOUCH_EVENT("TOUCH_EVENT"),
        GESTURE_EVENT("GESTURE_EVENT"),
        VIBRATE("VIBRATE"),
        DRAW_IMAGE("DRAW_IMAGE"),
        HARDWARE_SPECIFICATIONS("HARDWARE_SPECIFICATIONS"),
        ERROR_LOG("ERROR_LOG");
        
        private final String mTitle;

        MessageTitle(String str) {
            this.mTitle = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mTitle;
        }
    }

    public TaskManager(MessageManager messageManager, Display display, TouchSensor touchSensor, Accelerometer accelerometer, Magnetometer magnetometer, Gyroscope gyroscope, Vibrator vibrator) throws Exception {
        if (messageManager == null) {
            throw new Exception("Invalid MessageManager");
        }
        this.mMessageManager = messageManager;
        if (accelerometer == null) {
            throw new Exception("Invalid Accelerometer");
        }
        this.mAccelerometer = accelerometer;
        if (magnetometer == null) {
            throw new Exception("Invalid Magnetometer");
        }
        this.mMagnetometer = magnetometer;
        if (gyroscope == null) {
            throw new Exception("Invalid Gyroscope");
        }
        this.mGyroscope = gyroscope;
        this.mVibrator = vibrator;
        if (display == null) {
            throw new Exception("Invalid Display");
        }
        this.mDisplay = display;
        if (touchSensor == null) {
            throw new Exception("Invalid TouchSensor");
        }
        this.mTouchSensor = touchSensor;
        touchSensor.setListener(new TouchSensor.Listener() { // from class: com.adobe.air.wand.TaskManager.1
            @Override // com.adobe.air.wand.view.TouchSensor.Listener
            public void onTouchEvent(TouchEventData touchEventData) {
                TaskManager.this.sendTouchEventData(touchEventData);
            }

            @Override // com.adobe.air.wand.view.TouchSensor.Listener
            public void onGestureEvent(GestureEventData gestureEventData) {
                TaskManager.this.sendGestureEventData(gestureEventData);
            }
        });
        accelerometer.setListener(new MotionSensor.Listener() { // from class: com.adobe.air.wand.TaskManager.2
            @Override // com.adobe.air.wand.motionsensor.MotionSensor.Listener
            public void onSensorChanged(float[] fArr, long j) {
                TaskManager.this.sendMotionSensorData(fArr, j, TaskManager.NAME_NOTIFICATION_ACCELEROMETER_DATA, MessageTitle.ACCELEROMETER_EVENT);
            }
        });
        magnetometer.setListener(new MotionSensor.Listener() { // from class: com.adobe.air.wand.TaskManager.3
            @Override // com.adobe.air.wand.motionsensor.MotionSensor.Listener
            public void onSensorChanged(float[] fArr, long j) {
                TaskManager.this.sendMotionSensorData(fArr, j, TaskManager.NAME_NOTIFICATION_MAGNETOMETER_DATA, MessageTitle.MAGNETOMETER_EVENT);
            }
        });
        gyroscope.setListener(new MotionSensor.Listener() { // from class: com.adobe.air.wand.TaskManager.4
            @Override // com.adobe.air.wand.motionsensor.MotionSensor.Listener
            public void onSensorChanged(float[] fArr, long j) {
                TaskManager.this.sendMotionSensorData(fArr, j, TaskManager.NAME_NOTIFICATION_GYROSCOPE_DATA, MessageTitle.GYROSCOPE_EVENT);
            }
        });
    }

    private String[] getGesturePhases(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 2) != 0) {
            arrayList.add(GESTURE_PHASE_BEGIN);
        }
        if ((i & 1) != 0) {
            arrayList.add(GESTURE_PHASE_UPDATE);
        }
        if ((i & 4) != 0) {
            arrayList.add(GESTURE_PHASE_END);
        }
        if ((i & 8) != 0) {
            arrayList.add(GESTURE_PHASE_ALL);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendGestureEventData(GestureEventData gestureEventData) {
        for (String str : getGesturePhases(gestureEventData.mPhase)) {
            try {
                MessageDataObject createDataObject = this.mMessageManager.createDataObject();
                createDataObject.put("phase", str);
                int i = gestureEventData.mType;
                if (i == 0) {
                    createDataObject.put(NAME_NOTIFICATION_TYPE, GESTURE_TYPE_ZOOM);
                } else if (i == 1) {
                    createDataObject.put(NAME_NOTIFICATION_TYPE, GESTURE_TYPE_PAN);
                } else if (i == 2) {
                    createDataObject.put(NAME_NOTIFICATION_TYPE, GESTURE_TYPE_ROTATE);
                } else if (i == 3) {
                    createDataObject.put(NAME_NOTIFICATION_TYPE, GESTURE_TYPE_TWO_FINGER_TAP);
                } else if (i == 4) {
                    createDataObject.put(NAME_NOTIFICATION_TYPE, GESTURE_TYPE_SWIPE);
                }
                createDataObject.put(NAME_NOTIFICATION_IS_TRANSFORM, gestureEventData.mIsTransform);
                createDataObject.put(NAME_NOTIFICATION_LOCAL_X, gestureEventData.mXCoord);
                createDataObject.put(NAME_NOTIFICATION_LOCAL_Y, gestureEventData.mYCoord);
                createDataObject.put("scaleX", gestureEventData.mScaleX);
                createDataObject.put("scaleY", gestureEventData.mScaleY);
                createDataObject.put("rotation", gestureEventData.mRotation);
                createDataObject.put(NAME_NOTIFICATION_OFFSET_X, gestureEventData.mOffsetX);
                createDataObject.put(NAME_NOTIFICATION_OFFSET_Y, gestureEventData.mOffsetY);
                createDataObject.put(NAME_NOTIFICATION_TIMESTAMP, new Date().getTime());
                String createSerializedNotification = this.mMessageManager.createSerializedNotification(MessageTitle.GESTURE_EVENT.toString(), createDataObject);
                Listener listener = this.mListener;
                if (listener != null) {
                    listener.sendConnectionMessage(createSerializedNotification);
                }
            } catch (Exception unused) {
            }
        }
    }

    private String[] getTouchTypes(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 2) != 0) {
            arrayList.add(TOUCH_TYPE_BEGIN);
        }
        if ((i & 1) != 0) {
            arrayList.add(TOUCH_TYPE_MOVE);
        }
        if ((i & 4) != 0) {
            arrayList.add(TOUCH_TYPE_END);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendTouchEventData(TouchEventData touchEventData) {
        for (String str : getTouchTypes(touchEventData.mTouchEventType)) {
            try {
                MessageDataObject createDataObject = this.mMessageManager.createDataObject();
                createDataObject.put(NAME_NOTIFICATION_TYPE, str);
                createDataObject.put(NAME_NOTIFICATION_IS_PRIMARY_TOUCH_POINT, touchEventData.mIsPrimaryPoint);
                createDataObject.put(NAME_NOTIFICATION_LOCAL_X, touchEventData.mXCoord);
                createDataObject.put(NAME_NOTIFICATION_LOCAL_Y, touchEventData.mYCoord);
                createDataObject.put(NAME_NOTIFICATION_PRESSURE, touchEventData.mPressure);
                createDataObject.put(NAME_NOTIFICATION_SIZE_X, touchEventData.mContactX);
                createDataObject.put(NAME_NOTIFICATION_SIZE_Y, touchEventData.mContactY);
                createDataObject.put(NAME_NOTIFICATION_TOUCH_POINT_ID, touchEventData.mPointerID);
                createDataObject.put(NAME_NOTIFICATION_TIMESTAMP, new Date().getTime());
                String createSerializedNotification = this.mMessageManager.createSerializedNotification(MessageTitle.TOUCH_EVENT.toString(), createDataObject);
                Listener listener = this.mListener;
                if (listener != null) {
                    listener.sendConnectionMessage(createSerializedNotification);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMotionSensorData(float[] fArr, long j, String str, MessageTitle messageTitle) {
        try {
            MessageDataObject createDataObject = this.mMessageManager.createDataObject();
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.uptimeMillis();
            MessageDataArray createDataArray = this.mMessageManager.createDataArray();
            int i = 0;
            while (i < fArr.length) {
                createDataArray.put(i, fArr[i]);
                i++;
            }
            createDataArray.put(i, (j / 1000000) + currentTimeMillis);
            createDataObject.put(str, createDataArray);
            String createSerializedNotification = this.mMessageManager.createSerializedNotification(messageTitle.toString(), createDataObject);
            Listener listener = this.mListener;
            if (listener != null) {
                listener.sendConnectionMessage(createSerializedNotification);
            }
        } catch (Exception unused) {
        }
    }

    public void registerListener(Listener listener) throws Exception {
        if (listener == null) {
            throw new Exception("Invalid listener");
        }
        if (this.mListener != null) {
            throw new Exception("A listener is already registered");
        }
        this.mListener = listener;
    }

    public void unregisterListener() {
        this.mListener = null;
    }

    private void sendLogNotification(String str) {
        if (str == null || str.equals("")) {
            return;
        }
        MessageDataObject createDataObject = this.mMessageManager.createDataObject();
        try {
            createDataObject.put("message", str);
            String createSerializedNotification = this.mMessageManager.createSerializedNotification(MessageTitle.ERROR_LOG.toString(), createDataObject);
            Listener listener = this.mListener;
            if (listener != null) {
                listener.sendConnectionMessage(createSerializedNotification);
            }
        } catch (Exception unused) {
        }
    }

    public void handleRemoteMessage(String str) {
        try {
            Message deserializeWandMessage = this.mMessageManager.deserializeWandMessage(str);
            int i = AnonymousClass5.$SwitchMap$com$adobe$air$wand$message$Message$Type[deserializeWandMessage.getHeader().getType().ordinal()];
            if (i == 1) {
                handleRemoteRequest((Request) deserializeWandMessage);
            } else if (i == 2) {
                handleRemoteResponse((Response) deserializeWandMessage);
            } else if (i == 3) {
                handleRemoteNotification((Notification) deserializeWandMessage);
            }
        } catch (Exception unused) {
            if (str == null) {
                str = "null";
            }
            sendLogNotification("Invalid message : \"" + str + "\"");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adobe.air.wand.TaskManager$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$air$wand$message$Message$Type;

        static {
            int[] iArr = new int[Message.Type.values().length];
            $SwitchMap$com$adobe$air$wand$message$Message$Type = iArr;
            try {
                iArr[Message.Type.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$air$wand$message$Message$Type[Message.Type.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$air$wand$message$Message$Type[Message.Type.NOTIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void handleRemoteRequest(Request request) {
        String title = request.getHeader().getTitle();
        if (title.equals(MessageTitle.DRAW_IMAGE.toString())) {
            handleDrawImageRequest(request);
        } else if (title.equals(MessageTitle.HARDWARE_SPECIFICATIONS.toString())) {
            handleHardwareSpecsRequest(request);
        } else {
            sendLogNotification("Unsupported REQUEST title : " + title);
        }
    }

    private void handleRemoteResponse(Response response) {
        String title = response.getHeader().getTitle();
        sendLogNotification("Unsupported RESPONSE title : " + title);
    }

    private boolean isOrAboveV1_1_0() throws Exception {
        Listener listener = this.mListener;
        return listener != null && Version.isGreaterThanEqualTo(listener.getRequestedProtocolVerison(), "1.1.0");
    }

    private void handleRemoteNotification(Notification notification) throws Exception {
        String title = notification.getHeader().getTitle();
        if (title.equals(MessageTitle.VIBRATE.toString())) {
            handleRemoteVibrateNotification(notification);
        } else if (title.equals(MessageTitle.ACCELEROMETER_EVENT.toString())) {
            handleRemoteAccelerometerEventNotification(notification);
        } else if (isOrAboveV1_1_0() && title.equals(MessageTitle.MAGNETOMETER_EVENT.toString())) {
            handleRemoteMagnetometerEventNotification(notification);
        } else if (isOrAboveV1_1_0() && title.equals(MessageTitle.GYROSCOPE_EVENT.toString())) {
            handleRemoteGyroscopeEventNotification(notification);
        } else if (title.equals(MessageTitle.TOUCH_EVENT.toString())) {
            handleRemoteTouchNotification(notification);
        } else if (title.equals(MessageTitle.GESTURE_EVENT.toString())) {
            handleRemoteGestureNotification(notification);
        } else {
            sendLogNotification("Unsupported NOTIFICATION title : " + title);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void terminateRunningTasks() {
        if (this.mAccelerometer.active()) {
            this.mAccelerometer.stop();
        }
        if (this.mMagnetometer.active()) {
            this.mMagnetometer.stop();
        }
        if (this.mGyroscope.active()) {
            this.mGyroscope.stop();
        }
        if (this.mTouchSensor.activeTouchListening()) {
            this.mTouchSensor.stopTouchEventListening();
        }
        if (this.mTouchSensor.activeGestureListening()) {
            this.mTouchSensor.stopGestureEventListening();
        }
        Vibrator vibrator = this.mVibrator;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    private void handleRemoteAccelerometerEventNotification(Notification notification) {
        try {
            if (!this.mAccelerometer.available()) {
                sendLogNotification("The device does not have an accelerometer");
                return;
            }
            MessageDataObject messageDataObject = (MessageDataObject) notification.getData().getNotification();
            if (messageDataObject.getBoolean(NAME_NOTIFICATION_START)) {
                if (!this.mAccelerometer.active()) {
                    int i = messageDataObject.getInt(NAME_NOTIFICATION_INTERVAL);
                    if (i < 16) {
                        i = 16;
                    }
                    this.mAccelerometer.start(i);
                    return;
                }
                sendLogNotification("Already started accelerometer event updates");
            } else if (this.mAccelerometer.active()) {
                this.mAccelerometer.stop();
            } else {
                sendLogNotification("Already stopped accelerometer event updates");
            }
        } catch (Exception unused) {
            sendLogNotification("Invalid ACCELEROMETER_EVENT notification");
        }
    }

    private void handleRemoteMagnetometerEventNotification(Notification notification) {
        try {
            if (!this.mMagnetometer.available()) {
                sendLogNotification("The device does not have an magnetometer");
                return;
            }
            MessageDataObject messageDataObject = (MessageDataObject) notification.getData().getNotification();
            if (messageDataObject.getBoolean(NAME_NOTIFICATION_START)) {
                if (!this.mMagnetometer.active()) {
                    int i = messageDataObject.getInt(NAME_NOTIFICATION_INTERVAL);
                    if (i < 16) {
                        i = 16;
                    }
                    this.mMagnetometer.start(i);
                    return;
                }
                sendLogNotification("Already started magnetometer event updates");
            } else if (this.mMagnetometer.active()) {
                this.mMagnetometer.stop();
            } else {
                sendLogNotification("Already stopped magnetometer event updates");
            }
        } catch (Exception unused) {
            sendLogNotification("Invalid MAGNETOMETER_EVENT notification");
        }
    }

    private void handleRemoteGyroscopeEventNotification(Notification notification) {
        try {
            if (!this.mGyroscope.available()) {
                sendLogNotification("The device does not have a gyroscope");
                return;
            }
            MessageDataObject messageDataObject = (MessageDataObject) notification.getData().getNotification();
            if (messageDataObject.getBoolean(NAME_NOTIFICATION_START)) {
                if (!this.mGyroscope.active()) {
                    int i = messageDataObject.getInt(NAME_NOTIFICATION_INTERVAL);
                    if (i < 16) {
                        i = 16;
                    }
                    this.mGyroscope.start(i);
                    return;
                }
                sendLogNotification("Already started gyroscope event updates");
            } else if (this.mGyroscope.active()) {
                this.mGyroscope.stop();
            } else {
                sendLogNotification("Already stopped gyroscope event updates");
            }
        } catch (Exception unused) {
            sendLogNotification("Invalid GYROSCOPE_EVENT notification");
        }
    }

    private void handleRemoteTouchNotification(Notification notification) {
        try {
            if (((MessageDataObject) notification.getData().getNotification()).getBoolean(NAME_NOTIFICATION_START)) {
                if (!this.mTouchSensor.activeTouchListening()) {
                    this.mTouchSensor.startTouchEventListening();
                } else {
                    sendLogNotification("Already started touch event updates");
                }
            } else if (this.mTouchSensor.activeTouchListening()) {
                this.mTouchSensor.stopTouchEventListening();
            } else {
                sendLogNotification("Already stopped touch event updates");
            }
        } catch (Exception unused) {
            sendLogNotification("Invalid TOUCH_EVENT notification");
        }
    }

    private void handleRemoteGestureNotification(Notification notification) {
        try {
            if (((MessageDataObject) notification.getData().getNotification()).getBoolean(NAME_NOTIFICATION_START)) {
                if (!this.mTouchSensor.activeGestureListening()) {
                    this.mTouchSensor.startGestureEventListening();
                } else {
                    sendLogNotification("Already started gesture event updates");
                }
            } else if (this.mTouchSensor.activeGestureListening()) {
                this.mTouchSensor.stopGestureEventListening();
            } else {
                sendLogNotification("Already stopped gesture event updates");
            }
        } catch (Exception unused) {
            sendLogNotification("Invalid GESTURE_EVENT notification");
        }
    }

    private boolean hasVibrator() {
        Vibrator vibrator = this.mVibrator;
        return vibrator != null ? this.mVibrator.hasVibrator() : vibrator != null;
    }

    private void handleHardwareSpecsRequest(Request request) {
        try {
            MessageDataObject createDataObject = this.mMessageManager.createDataObject();
            boolean available = this.mAccelerometer.available();
            boolean available2 = this.mMagnetometer.available();
            boolean available3 = this.mGyroscope.available();
            Display display = this.mDisplay;
            MessageDataObject createDataObject2 = this.mMessageManager.createDataObject();
            int width = display.getWidth();
            int height = display.getHeight();
            createDataObject2.put(SCREEN_DIMENSIONS_WIDTH, width);
            createDataObject2.put(SCREEN_DIMENSIONS_HEIGHT, height);
            createDataObject.put(NAME_NOTIFICATION_SCREEN_DIMENSIONS, createDataObject2);
            createDataObject.put(NAME_NOTIFICATION_ACCELEROMETER, available);
            createDataObject.put(NAME_NOTIFICATION_VIBRATOR, hasVibrator());
            if (isOrAboveV1_1_0()) {
                createDataObject.put(NAME_NOTIFICATION_MAGNETOMETER, available2);
                createDataObject.put(NAME_NOTIFICATION_GYROSCOPE, available3);
            }
            String createSerializedResponse = this.mMessageManager.createSerializedResponse(request, Response.Status.SUCCESS, createDataObject);
            Listener listener = this.mListener;
            if (listener != null) {
                listener.sendConnectionMessage(createSerializedResponse);
            }
        } catch (Exception e) {
            try {
                String createSerializedErrorResponse = this.mMessageManager.createSerializedErrorResponse(request, e.getMessage());
                Listener listener2 = this.mListener;
                if (listener2 != null) {
                    listener2.sendConnectionMessage(createSerializedErrorResponse);
                }
            } catch (Exception unused) {
                sendLogNotification("Invalid HARDWARE_SPECIFICATIONS request");
            }
        }
    }

    private void handleRemoteVibrateNotification(Notification notification) {
        try {
            long j = ((MessageDataObject) notification.getData().getNotification()).getLong("duration");
            if (j <= 0) {
                sendLogNotification("Invalid vibrate duration.");
            } else if (hasVibrator()) {
                this.mVibrator.vibrate(j);
            } else {
                sendLogNotification("Device does not support vibration");
            }
        } catch (Exception unused) {
            sendLogNotification("Invalid VIBRATE notification");
        }
    }

    private void handleDrawImageRequest(Request request) {
        try {
            byte[] decode = Base64.decode(request.getData().getArguments().getString(0), 0);
            if (decode.length < 4 || decode[0] != -1 || decode[1] != -40 || decode[2] != -1) {
                throw new Exception("Unsupported image format");
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (decodeByteArray == null) {
                throw new Exception("Unable to decode the image");
            }
            Listener listener = this.mListener;
            if (listener != null) {
                listener.drawImage(decodeByteArray);
            }
            String createSerializedSuccessResponse = this.mMessageManager.createSerializedSuccessResponse(request);
            Listener listener2 = this.mListener;
            if (listener2 != null) {
                listener2.sendConnectionMessage(createSerializedSuccessResponse);
            }
        } catch (Exception e) {
            try {
                String createSerializedErrorResponse = this.mMessageManager.createSerializedErrorResponse(request, e.getMessage());
                Listener listener3 = this.mListener;
                if (listener3 != null) {
                    listener3.sendConnectionMessage(createSerializedErrorResponse);
                }
            } catch (Exception unused) {
                sendLogNotification("Invalid DRAW_IMAGE request");
            }
        }
    }
}
