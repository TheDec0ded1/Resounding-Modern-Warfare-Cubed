package com.paneedah.weaponlib2;

import java.util.function.Function;

public interface ExposureProtection {

    public Function<Float, Float> getAbsorbFunction(Spreadable spreadable);
}
