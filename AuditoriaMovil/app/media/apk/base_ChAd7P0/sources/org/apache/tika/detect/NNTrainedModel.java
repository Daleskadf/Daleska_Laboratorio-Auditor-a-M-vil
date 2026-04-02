package org.apache.tika.detect;

import java.lang.reflect.Array;
/* loaded from: classes.dex */
public class NNTrainedModel extends TrainedModel {
    private final float[][] Theta1;
    private final float[][] Theta2;
    private final int numOfHidden;
    private final int numOfInputs;
    private final int numOfOutputs;

    public NNTrainedModel(int i7, int i8, int i9, float[] fArr) {
        this.numOfInputs = i7;
        this.numOfHidden = i8;
        this.numOfOutputs = i9;
        Class cls = Float.TYPE;
        this.Theta1 = (float[][]) Array.newInstance(cls, i8, i7 + 1);
        this.Theta2 = (float[][]) Array.newInstance(cls, i9, i8 + 1);
        populateThetas(fArr);
    }

    private void populateThetas(float[] fArr) {
        float[][] fArr2 = this.Theta1;
        int length = fArr2.length;
        int length2 = fArr2[0].length;
        int i7 = 0;
        for (int i8 = 0; i8 < length2; i8++) {
            for (int i9 = 0; i9 < length; i9++) {
                this.Theta1[i9][i8] = fArr[i7];
                i7++;
            }
        }
        float[][] fArr3 = this.Theta2;
        int length3 = fArr3.length;
        int length4 = fArr3[0].length;
        for (int i10 = 0; i10 < length4; i10++) {
            for (int i11 = 0; i11 < length3; i11++) {
                this.Theta2[i11][i10] = fArr[i7];
                i7++;
            }
        }
    }

    @Override // org.apache.tika.detect.TrainedModel
    public double predict(double[] dArr) {
        return 0.0d;
    }

    @Override // org.apache.tika.detect.TrainedModel
    public float predict(float[] fArr) {
        float[][] fArr2 = this.Theta1;
        int length = fArr2.length;
        int length2 = fArr2[0].length;
        float[] fArr3 = new float[length + 1];
        fArr3[0] = 1.0f;
        int i7 = 0;
        while (true) {
            double d7 = 0.0d;
            if (i7 >= length) {
                break;
            }
            for (int i8 = 0; i8 < length2; i8++) {
                d7 += this.Theta1[i7][i8] * fArr[i8];
            }
            i7++;
            fArr3[i7] = (float) (1.0d / (Math.exp(-d7) + 1.0d));
        }
        float[][] fArr4 = this.Theta2;
        int length3 = fArr4.length;
        int length4 = fArr4[0].length;
        float[] fArr5 = new float[length3];
        for (int i9 = 0; i9 < length3; i9++) {
            double d8 = 0.0d;
            for (int i10 = 0; i10 < length4; i10++) {
                d8 += this.Theta2[i9][i10] * fArr3[i10];
            }
            fArr5[i9] = (float) (1.0d / (Math.exp(-d8) + 1.0d));
        }
        return fArr5[0];
    }
}
