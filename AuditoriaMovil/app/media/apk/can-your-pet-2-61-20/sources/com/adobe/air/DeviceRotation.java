package com.adobe.air;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import java.util.Arrays;
/* loaded from: classes.dex */
public class DeviceRotation implements SensorEventListener {
    private Context mContext;
    private SensorManager mSensorManager;
    private float m_pitch;
    private float[] m_quaternion_data = new float[4];
    private float m_roll;
    private float m_yaw;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        char c;
        if (sensorEvent.sensor.getType() == 15) {
            int rotation = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
            SensorManager.getQuaternionFromVector(this.m_quaternion_data, sensorEvent.values);
            float[] copyOf = Arrays.copyOf(this.m_quaternion_data, 4);
            char c2 = 1;
            if (rotation == 0) {
                c = 2;
                float[] fArr = this.m_quaternion_data;
                fArr[1] = copyOf[1];
                fArr[2] = copyOf[2];
                fArr[3] = copyOf[3];
            } else if (rotation == 1) {
                c = 2;
                float[] fArr2 = this.m_quaternion_data;
                fArr2[1] = -copyOf[2];
                fArr2[2] = copyOf[1];
                fArr2[3] = copyOf[3];
            } else if (rotation == 2) {
                c = 2;
                float[] fArr3 = this.m_quaternion_data;
                fArr3[1] = -copyOf[1];
                fArr3[2] = -copyOf[2];
                fArr3[3] = copyOf[3];
            } else if (rotation != 3) {
                c = 2;
            } else {
                float[] fArr4 = this.m_quaternion_data;
                float f = copyOf[2];
                fArr4[1] = f;
                float f2 = -copyOf[1];
                fArr4[2] = f2;
                float f3 = copyOf[3];
                fArr4[3] = f3;
                float f4 = fArr4[0];
                float f5 = f2 * f2;
                this.m_pitch = (float) Math.toDegrees(Math.atan2(((f4 * f) + (f2 * f3)) * 2.0f, 1.0f - (((f * f) + f5) * 2.0f)));
                this.m_roll = (float) Math.toDegrees(Math.asin(((f4 * f2) - (f3 * f)) * 2.0f));
                float degrees = ((float) Math.toDegrees(Math.atan2(((f4 * f3) + (f * f2)) * 2.0f, 1.0f - ((f5 + (f3 * f3)) * 2.0f)))) + 180.0f;
                this.m_yaw = degrees;
                float[] recalculateQuaternion = recalculateQuaternion(this.m_pitch, this.m_roll, degrees);
                float[] fArr5 = this.m_quaternion_data;
                fArr5[0] = recalculateQuaternion[0];
                c2 = 1;
                fArr5[1] = recalculateQuaternion[1];
                c = 2;
                fArr5[2] = recalculateQuaternion[2];
                fArr5[3] = recalculateQuaternion[3];
            }
            if (rotation != 3) {
                float[] fArr6 = this.m_quaternion_data;
                float f6 = fArr6[0];
                float f7 = fArr6[c2];
                float f8 = fArr6[c];
                float f9 = fArr6[3];
                float f10 = f8 * f8;
                this.m_pitch = (float) Math.toDegrees(Math.atan2(((f6 * f7) + (f8 * f9)) * 2.0f, 1.0f - (((f7 * f7) + f10) * 2.0f)));
                this.m_roll = (float) Math.toDegrees(Math.asin(((f6 * f8) - (f9 * f7)) * 2.0f));
                this.m_yaw = (float) Math.toDegrees(Math.atan2(((f6 * f9) + (f7 * f8)) * 2.0f, 1.0f - ((f10 + (f9 * f9)) * 2.0f)));
            }
        }
    }

    private float[] recalculateQuaternion(float f, float f2, float f3) {
        float radians = (float) Math.toRadians(f);
        double d = radians / 2.0f;
        double radians2 = ((float) Math.toRadians(f2)) / 2.0f;
        double radians3 = ((float) Math.toRadians(f3)) / 2.0f;
        return new float[]{(float) ((Math.cos(d) * Math.cos(radians2) * Math.cos(radians3)) + (Math.sin(d) * Math.sin(radians2) * Math.sin(radians3))), (float) (((Math.sin(d) * Math.cos(radians2)) * Math.cos(radians3)) - ((Math.cos(d) * Math.sin(radians2)) * Math.sin(radians3))), (float) ((Math.cos(d) * Math.sin(radians2) * Math.cos(radians3)) + (Math.sin(d) * Math.cos(radians2) * Math.sin(radians3))), (float) (((Math.cos(d) * Math.cos(radians2)) * Math.sin(radians3)) - ((Math.sin(d) * Math.sin(radians2)) * Math.cos(radians3)))};
    }

    public void removeListener() {
        if (hasRequiredSensors()) {
            this.mSensorManager.unregisterListener(this);
        }
    }

    public float getRoll() {
        return this.m_roll;
    }

    public float getYaw() {
        return this.m_yaw;
    }

    public float getPitch() {
        return this.m_pitch;
    }

    public float getW() {
        return this.m_quaternion_data[0];
    }

    public float getX() {
        return this.m_quaternion_data[1];
    }

    public float getY() {
        return this.m_quaternion_data[2];
    }

    public float getZ() {
        return this.m_quaternion_data[3];
    }

    public float[] getQuaternionData() {
        return this.m_quaternion_data;
    }

    public DeviceRotation(Context context) {
        this.mContext = context;
        if (hasRequiredSensors()) {
            SensorManager sensorManager = (SensorManager) this.mContext.getSystemService("sensor");
            this.mSensorManager = sensorManager;
            sensorManager.registerListener(this, sensorManager.getDefaultSensor(15), 0);
        }
    }

    private boolean hasRequiredSensors() {
        return this.mContext.getPackageManager().hasSystemFeature("android.hardware.sensor.accelerometer") && this.mContext.getPackageManager().hasSystemFeature("android.hardware.sensor.gyroscope");
    }
}
