/**
 * @author p whitney #402 assign1 Junit class file
 *assn2
 */
package cse360assign2;

import java.util.*; 
import java.io.*; 
import java.util.ArrayList;

public class SimpleList 
{
 private int list[];
 private int count;
 public SimpleList() 
 {
  int[] list = new int[10];
  int count = 0;
 }
 public void add(int number) 
 {
  if (count == 0) 
  {
   list[count] = number;
   numbers.ensureCapacity(15);
   // increase capacity 15
   count++;
  } 
  else if (count < 10) 
  {
   for (int i = count; i >= 0; i--) 
   {
   list[i + 1] = list[i];
   }
   list[0] = number;
   numbers.trimToSize();
   count++;
  }
}
 public void remove(int[] list, int index) 
 {
   if (index != -1) 
   {
    // remove element and shift left
    for (int i = index; i < count - 1; i++) 
    {
     list[i] = list[i + 1];
    }
    count--;
   }
 }
 
 public static int count(int list[], int t) 
  { 
   // if array is Null 
   if (list == null) 
   { 
    return -1; 
   } 
   // finds length
   int length = list.length; 
   int i = 0; 
   // traverse array 
   while (i < length) 
   { 
    // if i is t return index#
    if (list[i] == t) 
    { 
     return i; 
    } 
    else 
    { 
     i = i + 1; 
    } 
   } 
   return -1; 
} 
public static String toString(int[] list)
{
 return( ", " + Arrays.toString(list));             
}
//public static int search(int[] list)
{
//return("index: "+list.indexOf(0));
}
}
