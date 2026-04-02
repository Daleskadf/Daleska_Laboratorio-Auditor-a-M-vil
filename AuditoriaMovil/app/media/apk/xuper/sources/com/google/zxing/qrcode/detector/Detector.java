package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.PerspectiveTransform;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.qrcode.decoder.Version;
import java.util.Map;
/* loaded from: classes2.dex */
public class Detector {
    private final BitMatrix image;
    private ResultPointCallback resultPointCallback;

    public Detector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    private float calculateModuleSizeOneWay(ResultPoint resultPoint, ResultPoint resultPoint2) {
        float sizeOfBlackWhiteBlackRunBothWays = sizeOfBlackWhiteBlackRunBothWays((int) resultPoint.getX(), (int) resultPoint.getY(), (int) resultPoint2.getX(), (int) resultPoint2.getY());
        float sizeOfBlackWhiteBlackRunBothWays2 = sizeOfBlackWhiteBlackRunBothWays((int) resultPoint2.getX(), (int) resultPoint2.getY(), (int) resultPoint.getX(), (int) resultPoint.getY());
        if (Float.isNaN(sizeOfBlackWhiteBlackRunBothWays)) {
            return sizeOfBlackWhiteBlackRunBothWays2 / 7.0f;
        }
        if (Float.isNaN(sizeOfBlackWhiteBlackRunBothWays2)) {
            return sizeOfBlackWhiteBlackRunBothWays / 7.0f;
        }
        return (sizeOfBlackWhiteBlackRunBothWays + sizeOfBlackWhiteBlackRunBothWays2) / 14.0f;
    }

    private static int computeDimension(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, float f10) {
        int round = ((MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2) / f10) + MathUtils.round(ResultPoint.distance(resultPoint, resultPoint3) / f10)) / 2) + 7;
        int i10 = round & 3;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 == 3) {
                    throw NotFoundException.getNotFoundInstance();
                }
                return round;
            }
            return round - 1;
        }
        return round + 1;
    }

    private static PerspectiveTransform createTransform(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i10) {
        float x10;
        float y10;
        float f10;
        float f11 = i10 - 3.5f;
        if (resultPoint4 != null) {
            x10 = resultPoint4.getX();
            y10 = resultPoint4.getY();
            f10 = f11 - 3.0f;
        } else {
            x10 = (resultPoint2.getX() - resultPoint.getX()) + resultPoint3.getX();
            y10 = (resultPoint2.getY() - resultPoint.getY()) + resultPoint3.getY();
            f10 = f11;
        }
        return PerspectiveTransform.quadrilateralToQuadrilateral(3.5f, 3.5f, f11, 3.5f, f10, f10, 3.5f, f11, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), x10, y10, resultPoint3.getX(), resultPoint3.getY());
    }

    private static BitMatrix sampleGrid(BitMatrix bitMatrix, PerspectiveTransform perspectiveTransform, int i10) {
        return GridSampler.getInstance().sampleGrid(bitMatrix, i10, i10, perspectiveTransform);
    }

    private float sizeOfBlackWhiteBlackRun(int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Detector detector;
        boolean z11;
        boolean z12;
        int i22 = 1;
        if (Math.abs(i13 - i11) > Math.abs(i12 - i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i23 = (-abs) / 2;
        int i24 = -1;
        if (i14 < i16) {
            i18 = 1;
        } else {
            i18 = -1;
        }
        if (i15 < i17) {
            i24 = 1;
        }
        int i25 = i16 + i18;
        int i26 = i14;
        int i27 = i15;
        int i28 = 0;
        while (true) {
            if (i26 != i25) {
                if (z10) {
                    i20 = i27;
                } else {
                    i20 = i26;
                }
                if (z10) {
                    i21 = i26;
                } else {
                    i21 = i27;
                }
                if (i28 == i22) {
                    detector = this;
                    z11 = z10;
                    i19 = i25;
                    z12 = true;
                } else {
                    detector = this;
                    z11 = z10;
                    i19 = i25;
                    z12 = false;
                }
                if (z12 == detector.image.get(i20, i21)) {
                    if (i28 == 2) {
                        return MathUtils.distance(i26, i27, i14, i15);
                    }
                    i28++;
                }
                i23 += abs2;
                if (i23 > 0) {
                    if (i27 == i17) {
                        break;
                    }
                    i27 += i24;
                    i23 -= abs;
                }
                i26 += i18;
                i25 = i19;
                z10 = z11;
                i22 = 1;
            } else {
                i19 = i25;
                break;
            }
        }
        if (i28 == 2) {
            return MathUtils.distance(i19, i17, i14, i15);
        }
        return Float.NaN;
    }

    private float sizeOfBlackWhiteBlackRunBothWays(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float sizeOfBlackWhiteBlackRun = sizeOfBlackWhiteBlackRun(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f10 = i10 / (i10 - i14);
            i14 = 0;
        } else if (i14 >= this.image.getWidth()) {
            f10 = ((this.image.getWidth() - 1) - i10) / (i14 - i10);
            i14 = this.image.getWidth() - 1;
        } else {
            f10 = 1.0f;
        }
        float f12 = i11;
        int i16 = (int) (f12 - ((i13 - i11) * f10));
        if (i16 < 0) {
            f11 = f12 / (i11 - i16);
        } else if (i16 >= this.image.getHeight()) {
            f11 = ((this.image.getHeight() - 1) - i11) / (i16 - i11);
            i15 = this.image.getHeight() - 1;
        } else {
            i15 = i16;
            f11 = 1.0f;
        }
        return (sizeOfBlackWhiteBlackRun + sizeOfBlackWhiteBlackRun(i10, i11, (int) (i10 + ((i14 - i10) * f11)), i15)) - 1.0f;
    }

    public final float calculateModuleSize(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        return (calculateModuleSizeOneWay(resultPoint, resultPoint2) + calculateModuleSizeOneWay(resultPoint, resultPoint3)) / 2.0f;
    }

    public DetectorResult detect() {
        return detect(null);
    }

    public final AlignmentPattern findAlignmentInRegion(float f10, int i10, int i11, float f11) {
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i10 - i12);
        int min = Math.min(this.image.getWidth() - 1, i10 + i12) - max;
        float f12 = 3.0f * f10;
        if (min >= f12) {
            int max2 = Math.max(0, i11 - i12);
            int min2 = Math.min(this.image.getHeight() - 1, i11 + i12) - max2;
            if (min2 >= f12) {
                return new AlignmentPatternFinder(this.image, max, max2, min, min2, f10, this.resultPointCallback).find();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final BitMatrix getImage() {
        return this.image;
    }

    public final ResultPointCallback getResultPointCallback() {
        return this.resultPointCallback;
    }

    public final DetectorResult processFinderPatternInfo(FinderPatternInfo finderPatternInfo) {
        AlignmentPattern alignmentPattern;
        FinderPattern topLeft = finderPatternInfo.getTopLeft();
        FinderPattern topRight = finderPatternInfo.getTopRight();
        FinderPattern bottomLeft = finderPatternInfo.getBottomLeft();
        float calculateModuleSize = calculateModuleSize(topLeft, topRight, bottomLeft);
        if (calculateModuleSize >= 1.0f) {
            int computeDimension = computeDimension(topLeft, topRight, bottomLeft, calculateModuleSize);
            Version provisionalVersionForDimension = Version.getProvisionalVersionForDimension(computeDimension);
            int dimensionForVersion = provisionalVersionForDimension.getDimensionForVersion() - 7;
            if (provisionalVersionForDimension.getAlignmentPatternCenters().length > 0) {
                float x10 = (topRight.getX() - topLeft.getX()) + bottomLeft.getX();
                float y10 = (topRight.getY() - topLeft.getY()) + bottomLeft.getY();
                float f10 = 1.0f - (3.0f / dimensionForVersion);
                int x11 = (int) (topLeft.getX() + ((x10 - topLeft.getX()) * f10));
                int y11 = (int) (topLeft.getY() + (f10 * (y10 - topLeft.getY())));
                for (int i10 = 4; i10 <= 16; i10 <<= 1) {
                    try {
                        alignmentPattern = findAlignmentInRegion(calculateModuleSize, x11, y11, i10);
                        break;
                    } catch (NotFoundException unused) {
                    }
                }
            }
            alignmentPattern = null;
            return new DetectorResult(sampleGrid(this.image, createTransform(topLeft, topRight, bottomLeft, alignmentPattern, computeDimension), computeDimension), alignmentPattern == null ? new ResultPoint[]{bottomLeft, topLeft, topRight} : new ResultPoint[]{bottomLeft, topLeft, topRight, alignmentPattern});
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final DetectorResult detect(Map<DecodeHintType, ?> map) {
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        this.resultPointCallback = resultPointCallback;
        return processFinderPatternInfo(new FinderPatternFinder(this.image, resultPointCallback).find(map));
    }
}
