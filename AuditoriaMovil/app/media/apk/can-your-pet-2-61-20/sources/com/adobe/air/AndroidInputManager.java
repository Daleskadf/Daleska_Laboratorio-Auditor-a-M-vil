package com.adobe.air;

import android.content.Context;
import android.content.res.Configuration;
import android.hardware.input.InputManager;
import android.util.SparseArray;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.adobe.air.AndroidActivityWrapper;
import com.harman.services.AIRRuntimeCheck;
/* loaded from: classes.dex */
public class AndroidInputManager implements InputManager.InputDeviceListener, AndroidActivityWrapper.StateChangeCallback, AndroidActivityWrapper.InputEventCallback {
    private static AndroidInputManager sAndroidInputManager;
    private Context mContext;
    private SparseArray<AndroidInputDevice> mInputDevices;
    private InputManager mInputManager;
    private long mInternalReference = 0;
    private boolean mListening = false;

    private native void OnDeviceAdded(long j, AndroidInputDevice androidInputDevice, String str);

    private native void OnDeviceRemoved(long j, String str);

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onConfigurationChanged(Configuration configuration) {
    }

    public static boolean isSupported() {
        try {
            if (AIRRuntimeCheck.shouldDisableSensorAccess()) {
                return false;
            }
            return Class.forName("android.hardware.input.InputManager") != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static AndroidInputManager GetAndroidInputManager(Context context) {
        if (isSupported() && sAndroidInputManager == null) {
            sAndroidInputManager = new AndroidInputManager(context);
        }
        return sAndroidInputManager;
    }

    private AndroidInputManager(Context context) {
        this.mInputManager = null;
        this.mInputDevices = null;
        this.mContext = context;
        if (context != null) {
            this.mInputManager = (InputManager) context.getSystemService("input");
        }
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        if (GetAndroidActivityWrapper != null) {
            GetAndroidActivityWrapper.addActivityStateChangeListner(this);
            GetAndroidActivityWrapper.addInputEventListner(this);
        }
        this.mInputDevices = new SparseArray<>();
    }

    public AndroidInputDevice getInputDevice(int i) {
        return this.mInputDevices.get(i);
    }

    public void setInternalReference(long j) {
        this.mInternalReference = j;
    }

    public void listenForInputDevice(boolean z) {
        InputManager inputManager = this.mInputManager;
        if (inputManager == null) {
            return;
        }
        if (z) {
            try {
                if (!this.mListening) {
                    inputManager.registerInputDeviceListener(this, null);
                    addRemoveExistingInputDevices();
                    this.mListening = true;
                }
            } catch (Exception unused) {
                return;
            }
        }
        if (!z && this.mListening) {
            inputManager.unregisterInputDeviceListener(this);
            this.mListening = false;
        }
    }

    private void addRemoveExistingInputDevices() {
        int size = this.mInputDevices.size();
        for (int i = 0; i < size; i++) {
            int[] inputDeviceIds = this.mInputManager.getInputDeviceIds();
            int i2 = 0;
            while (i2 < inputDeviceIds.length && this.mInputDevices.keyAt(i) != inputDeviceIds[i2]) {
                i2++;
            }
            if (i2 == inputDeviceIds.length) {
                OnDeviceRemoved(this.mInternalReference, this.mInputDevices.valueAt(i).getUniqueId());
                SparseArray<AndroidInputDevice> sparseArray = this.mInputDevices;
                sparseArray.delete(sparseArray.keyAt(i));
            }
        }
        for (int i3 : this.mInputManager.getInputDeviceIds()) {
            onInputDeviceAdded(i3);
        }
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public void onInputDeviceAdded(int i) {
        InputDevice inputDevice;
        if (this.mInputDevices.get(i) != null || (inputDevice = this.mInputManager.getInputDevice(i)) == null || inputDevice.isVirtual() || (inputDevice.getSources() & 16) == 0 || (inputDevice.getSources() & 1) == 0) {
            return;
        }
        AndroidInputDevice androidInputDevice = new AndroidInputDevice(inputDevice);
        this.mInputDevices.put(i, androidInputDevice);
        OnDeviceAdded(this.mInternalReference, androidInputDevice, androidInputDevice.getUniqueId());
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public void onInputDeviceRemoved(int i) {
        AndroidInputDevice androidInputDevice = this.mInputDevices.get(i);
        if (androidInputDevice != null) {
            OnDeviceRemoved(this.mInternalReference, androidInputDevice.getUniqueId());
            this.mInputDevices.delete(i);
        }
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public void onInputDeviceChanged(int i) {
        onInputDeviceRemoved(i);
        onInputDeviceAdded(i);
    }

    @Override // com.adobe.air.AndroidActivityWrapper.InputEventCallback
    public boolean onKeyEvent(KeyEvent keyEvent) {
        AndroidInputDevice androidInputDevice = this.mInputDevices.get(keyEvent.getDeviceId());
        if (androidInputDevice != null) {
            return androidInputDevice.onKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // com.adobe.air.AndroidActivityWrapper.InputEventCallback
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        AndroidInputDevice androidInputDevice;
        if ((motionEvent.getSource() & 16) == 0 || motionEvent.getAction() != 2 || (androidInputDevice = this.mInputDevices.get(motionEvent.getDeviceId())) == null) {
            return false;
        }
        return androidInputDevice.onGenericMotionEvent(motionEvent);
    }

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onActivityStateChanged(AndroidActivityWrapper.ActivityState activityState) {
        if (activityState == AndroidActivityWrapper.ActivityState.RESUMED) {
            listenForInputDevice(true);
        } else if (activityState == AndroidActivityWrapper.ActivityState.PAUSED) {
            listenForInputDevice(false);
        }
    }
}
