package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.dto.CharcoalDTO;
import com.xworkz.comparator.*;

public class CharcolRunner {
    public static void main(String[] args) {

        CharcoalDTO CharcoalDTO=new CharcoalDTO(1,"potting master","leadwort",228);
        CharcoalDTO CharcoalDTO1=new CharcoalDTO(1,"unigrow","plotting mixture",160);
        CharcoalDTO CharcoalDTO2=new CharcoalDTO(2,"orchidwala","manure",155);
        CharcoalDTO CharcoalDTO3=new CharcoalDTO(1,"koo","pltting mixture",171);
        CharcoalDTO CharcoalDTO4=new CharcoalDTO(1,"orchid","potting mixture",199);

        List<CharcoalDTO> list=new ArrayList<>();
        list.add(CharcoalDTO);
        list.add(CharcoalDTO1);
        list.add(CharcoalDTO2);
        list.add(CharcoalDTO3);
        list.add(CharcoalDTO4);

        for(CharcoalDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending order in brand");
        Comparator<CharcoalDTO> comparator=new CharcolBrandComparatorAsce();
        Collections.sort(list,comparator);
        for(CharcoalDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order in brand");
        Comparator<CharcoalDTO> comparator1=new CharcolBrandComparatorDesc();
        Collections.sort(list,comparator1);
        for(CharcoalDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending order in quantity");
        Comparator<CharcoalDTO> comparator2=new CharcolQuantityComparatorAsce();
        Collections.sort(list,comparator2);
        for(CharcoalDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order in Quantity");
        Comparator<CharcoalDTO> comparator3=new CharcolQuantityComparatorDesc();
        Collections.sort(list,comparator3);
        for(CharcoalDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending oreder in type");
        Comparator<CharcoalDTO> comparator4=new CharcolTypeComparatorAsce();
        Collections.sort(list,comparator4);
        for(CharcoalDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order in type");
        Comparator<CharcoalDTO> comparator5=new CharcolTypeComparatorDesc();
        Collections.sort(list,comparator5);
        for(CharcoalDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending order in cost");
        Comparator<CharcoalDTO> comparator6=new CharcolCostComparatorAsce();
        Collections.sort(list,comparator6);
        for(CharcoalDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order in cost");
        Comparator<CharcoalDTO> comparator7=new CharcolCostComparatorDesc();
        Collections.sort(list,comparator7);
        for(CharcoalDTO dto:list){
            System.out.println(dto);
        }
    }
}