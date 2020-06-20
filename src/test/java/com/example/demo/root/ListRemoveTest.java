package com.example.demo.root;

import org.json.JSONObject;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author:wangyang
 * @creatDate:2020-03-29
 **/
public class ListRemoveTest {


    public static void main(String[] args) {
        List<Integer> aaList = new ArrayList ();
        aaList.add (1);
        aaList.add (2);
        aaList.add (3);
        aaList.add (4);
        aaList.add (5);

//        for (Integer a : aaList) {
//
//            aaList.remove (a);
//        }
        System.out.println (aaList.toString ());
        Iterator<Integer> iterator = aaList.iterator ();
        while (iterator.hasNext ()) {
            Integer next = iterator.next ();
            iterator.remove ();
        }
        System.out.println (aaList.toString ());





//        Integer[] elementData = {1, 3, 1, 1, 1};
//        Integer[] elementDatas= {2, 2, 2, 2, 2};
//        int length = elementData.length;
//        int index = 0;
//        int numMoved = 3;
//        System.arraycopy (elementData, index + 1, elementDatas, index,
//                numMoved);
////        elementData[--length] = null;
//        System.out.println (elementDatas[0]);
//        System.out.println (elementDatas[1]);
//        System.out.println (elementDatas[2]);
//        System.out.println (elementDatas[3]);
//        System.out.println (elementDatas[4]);
    }
}
