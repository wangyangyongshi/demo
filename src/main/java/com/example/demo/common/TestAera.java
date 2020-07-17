package com.example.demo.common;

import java.util.*;

/**
 * @author:wangyang
 * @creatDate:2020-07-06
 **/
public class TestAera {

    public static void main(String[] args) {

        Integer[] integers = splitRedPacket (100, 4);
        System.out.println (integers.toString ());

    }

    /**
     * @param total      总数
     * @param splitCount 个数
     */

    public static Integer[] splitRedPacket(int total, int splitCount) {
        System.out.println ("总和：	" + total);
        System.out.println ("个数：	" + splitCount);

        List<Integer> al = new ArrayList<Integer> ();
        Random random = new Random ();

        if ((splitCount & 1) == 1) {
            int num = 0;
            do {
                num = random.nextInt (total);
            } while (num >= total);

            total = total - num;
            al.add (num);
        }
        int couples = splitCount >> 1;
        int perCoupleSum = total / couples;

        for (int i = 0; i < couples; i++) {
            int num1 = 0;
            int num2 = 0;
            do {
                num1 = random.nextInt (total);
                num2 = perCoupleSum - num1;
                if (!al.contains (num1) && !al.contains (num2)) {
                    if (i == 0) {
                        num1 = (total - couples * perCoupleSum) + num1;
                    }
                }
            } while (num1 > total || num2 > total);
            al.add (num1);
            al.add (num2);
        }

        al.sort (new Comparator<Integer> () {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare (o1, o2);
            }
        });

        Integer[] integerArrays = al.toArray (new Integer[0]);

        return integerArrays;
    }

}
