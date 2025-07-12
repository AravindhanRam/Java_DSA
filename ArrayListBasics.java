import java.util.*;
public class ArrayListBasics
{
    public static void main(String[] ar)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        // add the elements in the ArrayList<>();
        for(int i=0;i<n;i++)
            arr.add(i);
        //Printing the Elements in the ArrayList<>();
        System.out.println(arr);
        // Add the Elements based on the index in the ArrrayList<>();
        arr.add(0,-1);
        System.out.println(arr);
        //To check whether the given elemet is present or not in the ArrayList<>();
        System.out.println(arr.contains(0));
        //To check the list is matches to the another list
        System.out.println(arr.equals(arr));
        System.out.println(arr.equals(arr1));
        // to check the size of the ArrayList<>();
        System.out.println(arr.size());
        //to access the ArrayList based on the index
        System.out.println(arr.get(1));
        //To check the ArrayList is Empty or not
        System.out.println(arr.isEmpty());
        //To add All elements in the arr to arr1
        arr1.addAll(arr);
        System.out.println(arr1);
        // to check all the element in the arr is available in arr1
        System.out.println(arr.containsAll(arr1));
        //o Delete the element based on the index
        arr.remove(1);
        System.out.println(arr);
        System.out.println(arr.containsAll(arr1));
        //To Clear All element in the ArrayList
        arr.clear();
        System.out.println(arr);
        System.out.println(arr.isEmpty());
        // to Access the Last index of Specific element
        arr1.add(1);
        System.out.println(arr1.lastIndexOf(1));
    }
}

