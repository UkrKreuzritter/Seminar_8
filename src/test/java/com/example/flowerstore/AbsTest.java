package com.example.flowerstore;

import com.example.flowerstore.flowers.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsTest {

    @Test
    public void Test(){
        Flower rose = new Flower(45, FlowerColor.RED, 3, FlowerType.ROSE);
        FlowerPack RosePack = new FlowerPack(rose , 1);
        FlowerBucket bucket = new FlowerBucket(RosePack);
        assertEquals(3*1, bucket.getPrice());
        SpecialItem birthdaybucket = new SpecialItem(bucket);
        assertEquals((1*3*0.8), birthdaybucket.getPrice());
    }
}