package JavaLoopsArray02;

public class ArrayLoops04P145 {
    public static void main(String[] args) {


        int a [] = new int[5];
        a [0] = 2;
        a [1] = 6;
        a [2] = 1;
        a [3] = 9;
        a [4] = 12; // initialize values into that array.
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        // Retrieve values present in this array

        }

    }
}
/*
        int a;
                a = 4;
/ container which stores multiple values of same data type.

        int a [] = new int[5];
   Declares an array and allocates memory for the value.
        //int b [] = new int[10];
*/
/*
public class ArrayLoops04P145 {
    public static void main(String[] args) {

        // একটি 1D অ্যারে তৈরি করা হচ্ছে যেখানে 5টি উপাদান রাখা যাবে
        int a[] = new int[5];

        // প্রথম উপাদানে (index 0) 2 রাখা হচ্ছে
        a[0] = 2;
        // দ্বিতীয় উপাদানে (index 1) 6 রাখা হচ্ছে
        a[1] = 6;
        // তৃতীয় উপাদানে (index 2) 1 রাখা হচ্ছে
        a[2] = 1;
        // চতুর্থ উপাদানে (index 3) 9 রাখা হচ্ছে
        a[3] = 9;
        // পঞ্চম উপাদানে (index 4) 12 রাখা হচ্ছে
        a[4] = 12;

        // লুপটি অ্যারেটির প্রতিটি উপাদান (element) এর জন্য চলবে
        for (int i = 0; i < a.length; i++) {
            // বর্তমান উপাদান প্রিন্ট করা হচ্ছে
            System.out.println(a[i]);
            // এই লাইনটি অ্যারেটি থেকে মানগুলো প্রিন্ট করছে
        }

    }
}
এখন, প্রতিটি লাইন ব্যাখ্যা করা হলো:

public class ArrayLoops04P145 {

একটি নতুন ক্লাস তৈরি করা হচ্ছে যার নাম ArrayLoops04P145।
public static void main(String[] args) {

এটি প্রোগ্রামের প্রধান অংশ, যেখানে কোড চালানো শুরু হয়।
int a[] = new int[5];

a নামের একটি 1D অ্যারে তৈরি করা হচ্ছে যেখানে 5টি উপাদান রাখা যাবে।
a[0] = 2;

প্রথম উপাদানে (index 0) 2 রাখা হচ্ছে।
a[1] = 6;

দ্বিতীয় উপাদানে (index 1) 6 রাখা হচ্ছে।
a[2] = 1;

তৃতীয় উপাদানে (index 2) 1 রাখা হচ্ছে।
a[3] = 9;

চতুর্থ উপাদানে (index 3) 9 রাখা হচ্ছে।
a[4] = 12;

পঞ্চম উপাদানে (index 4) 12 রাখা হচ্ছে।
for (int i = 0; i < a.length; i++) {

একটি লুপ শুরু করা হচ্ছে যা অ্যারেটির প্রতিটি উপাদানের জন্য চলবে। a.length হল 5, তাই লুপটি 5 বার চলবে।
System.out.println(a[i]);

লুপের ভিতরে, প্রতিবার বর্তমান উপাদান a[i] প্রিন্ট করা হচ্ছে।
এই কোডটি অ্যারেতে সংখ্যাগুলি প্রিন্ট করবে: 2, 6, 1, 9, এবং 12। আশাকরি তুমি কোডটি ভালভাবে বুঝতে পেরেছো!
 */