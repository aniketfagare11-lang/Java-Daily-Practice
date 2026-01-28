package Day12;

public class PracticeSet6 {
 public static void main(String [] args)
    {
        //Question 1:Calculate the sum of  array ..
        /*float [] num={3.5f,4.5f,6.5f,7.5f,8.5f};
        float sum =0;
        for (float e:num)
        {
            sum =sum +e;
        }
        System.out.println(sum);*/


        //Question 2: Find out wheather a given number is present or not..
        /*float [] num={3.5f,4.5f,6.5f,7.5f,8.5f,5};
        float sum =5;
        boolean isanArray=false;
        for (float e:num)
        {
            if(sum==e)
            {
                isanArray=true;
                break;
            }
        }
        if (isanArray)
        {
            System.out.println("The Given Number is present in Array..");
        }
        else
        {
            System.out.println("The Given Number is  not  present in Array..");
        }*/

      //Question 3:Calculate the Avarage Marks containing  in array..
      /*int [] marks={60,70,67,55,90};
      int sum=0;
      for (int e:marks)
      {
        sum=sum+e;
      }
      System.out.println( "The average marks is :" + sum/marks.length);*/

      //Question 4:add two matrices..
      /*int[][] mat1={{1 ,2 ,3},
                   {3 ,4 ,5}};
      int[][] mat2={{6 ,5 ,4},
                   {3 ,2 ,1}};
      int [][] sum = {{0 ,0 ,0},
                     {0 ,0, 0}};
      for (int i=0; i<mat1.length;i++)
      { 
        for(int j =0; j<mat1[i].length;j++ )
        {
            sum[i][j]=mat1[i][j]+mat2[i][j];
            System.out.print(sum[i][j]);
            System.out.print(" ");
        }
        System.out.print("\n");
      }*/

      //Question 5:Reverse an array
      /*int [] arr={1,2,3,4,5,6};
      int l=arr.length;
      int temp;
      int n = Math.floorDiv(l ,2);
      for (int i=0;i<n;i++)
      {
        // swap a[i] and a[l-1-i]
        temp=arr[i];
        arr[i]=arr[l-i-1];
        arr[l-i-1]=temp;
      }
      for (int e:arr)
      {
        System.out.print(e +" ");
      }*/


     //Question 6:program to find the maximum element in an array
     /*int [] arr={1,2,3,4,5,6};
     int max=0;
     for (int e:arr)
     {
        if(e>max)
        {
            max=e;
        }
     }
     System.out.println("the maximum element in given array is :"+ max);*/

     //Question 7 :program to find the minimum element in an array
     int [] arr={132,24,35,46,57,68};
     int min=arr[0];
     for (int e:arr)
     {
        if(e<min)
            {
             min=e;
            }
     }
     System.out.println(min);



    }
    
}

    

