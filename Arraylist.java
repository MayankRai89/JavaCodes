import java.util.ArrayList;
   
public class Arraylist

{
    public static void main(String args[]) {
        //  ArrayList<Integer>list =new ArrayList<>();
        //  ArrayList<String>list1= new ArrayList<>();
        //  ArrayList<Boolean>list2= new ArrayList<>();

        //  list.add(1);
        //  list.add(2);
        //  list.add(3);
        //  list.add(4);
        //  list.add(1,9);
        //  System.out.println(list);

        //  get operation
        //  int element = list.get(2);
        //  System.out.println(element);

        //  Delete
        // list.remove(2);
        // System.out.println(list);

        // set element at index
        // list.set(2,10);
        // System.out.println(list);

        // contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));





        //  size of arraylist

        // System.err.println(list.size());
        // // print array list
        // for(int i = 0; i< list.size(); i++)
        // {
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println(); 


        // print Reverse array
        // for (int i = list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        
        //  print Maximum number
        // int max = Integer.MIN_VALUE;
        // for(int i = 0;i<list.size();i++)
        // {
        //     // if(max<list.get(i))
        //     // {
        //     //     max = list.get(i);
        //     // }
        //      max = Math.max(max, list.get(i));
        // }
        // System.out.print("Maximum element = " +max);
        // System.out.println();


        // swaping of two number
        // int idx1 = 1;
        // int idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);



        // sorting an array
        //  System.out.println(list);
        //  Collections.sort(list);//ascending
        //  System.out.println(list);

        //  descending
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);




        //.  multidimentional arraylist

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // mainlist.add(list);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3);
        // list2.add(4);
        // mainlist.add(list2);

        // for(int i = 0; i<mainlist.size(); i++)
        // {
        //     ArrayList<Integer> currlist= mainlist.get(i);
        //     for(int j = 0; j<currlist.size();j++)
        //     {
        //         System.out.print(currlist.get(j)+" ");
        //     }System.out.println();
        // }    
        // System.out.println(mainlist);


        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1; i<=5 ; i++)
        {
            list1.add(i*1); //1 2 3 4 5
            list2.add(i*2); //2 4 6 8 10
            list3.add(i*3); //3 6 9 12 15
        }
         mainlist.add(list1);
         mainlist.add(list2);
         mainlist.add(list3);
        list2.remove(2);
        list2.remove(3);
        
        System.out.println(mainlist);

        // // nested loops
        for(int i=0; i<mainlist.size(); i++)
        {
            ArrayList<Integer> currlist = mainlist.get(i);
            for ( int j = 0; j<currlist.size(); j++)
            {
                System.out.println(currlist.get(j)+" ");
            }
            System.out.println();
        }





        
    }
//     public static void swap(ArrayList<Integer> list, int idx1, int idx2)
//    {
//     int temp = list.get(idx1);
//     list.set(idx1, list.get(idx2));
//     list.set(idx2, temp);
//    } 

}

