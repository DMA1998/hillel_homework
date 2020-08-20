package com.mykh.utils;

import com.mykh.models.Accessory;
import com.mykh.models.Bouquet;
import com.mykh.models.Flower;

import static java.lang.System.arraycopy;

public class ArrayUtils {

    public static Flower[] increaseFlowerArray(Flower[] flowers, Flower flower) {
        Flower[] result = new Flower[flowers.length + 1];
        arraycopy(flowers, 0, result, 0, flowers.length);
        result[flowers.length] = flower;
        return result;
    }

    public static Accessory[] increaseAccessoryArray(Accessory[] accessories, Accessory accessory) {
        Accessory[] result = new Accessory[accessories.length + 1];
        arraycopy(accessories, 0, result, 0, accessories.length);
        result[accessories.length] = accessory;
        return result;
    }

    public static Bouquet[] increaseBouquetArray(Bouquet[] bouquets, Bouquet bouquet) {
        Bouquet[] result = new Bouquet[bouquets.length + 1];
        arraycopy(bouquets,0,result,0, bouquets.length);
        result[bouquets.length] = bouquet;
        return result;
    }
}



