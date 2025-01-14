package JavaLoopsArray01;

public class ArrayLoops02P144 {
    public static void main(String[] args) {
        // Sum of numbers in the array
            //Printing of  index of desired number.

        int c[] = {2,5,8,7,4,6,3};
        int sum = 0;
        for (int i = 0; i <c.length ; i++) {

            if(c[i] == 7){
                System.out.println(i);

            }

        }

    }
}
/*

public class ArrayLoops02P144 {
    public static void main(String[] args) {
        // অ্যারেতে (array) সংখ্যাগুলোর যোগফল বের করা হবে
        // কাঙ্ক্ষিত সংখ্যার সূচক (index) প্রিন্ট করা হবে

        // একটি 1D অ্যারে তৈরি করা হচ্ছে এবং একে সরাসরি মান দিয়ে পূরণ করা হচ্ছে
        int c[] = {2, 5, 8, 7, 4, 6, 3};

        // sum নামে একটি ভ্যারিয়েবল তৈরি করা হচ্ছে এবং এটি 0 দিয়ে শুরু করা হচ্ছে
        int sum = 0;

        // লুপটি অ্যারেটির প্রতিটি উপাদান (element) এর জন্য চলবে
        for (int i = 0; i < c.length; i++) {

            // যদি বর্তমান উপাদান 7 এর সমান হয়
            if (c[i] == 7) {
                // তাহলে বর্তমান সূচক (index) প্রিন্ট করা হচ্ছে
                System.out.println(i);
            }

        }
    }
}
এখন, প্রতিটি লাইন ব্যাখ্যা করা হলো:

public class ArrayLoops02P144 {

একটি নতুন ক্লাস তৈরি করা হচ্ছে যার নাম ArrayLoops02P144।
public static void main(String[] args) {

এটি প্রোগ্রামের প্রধান অংশ, যেখানে কোড চালানো শুরু হয়।
int c[] = {2, 5, 8, 7, 4, 6, 3};

c নামের একটি 1D অ্যারে তৈরি করা হচ্ছে এবং একে সরাসরি মান দিয়ে পূরণ করা হচ্ছে। এই অ্যারেটির 7টি উপাদান আছে: 2, 5, 8, 7, 4, 6, এবং 3।
int sum = 0;

sum নামে একটি ভ্যারিয়েবল তৈরি করা হচ্ছে এবং এটি 0 দিয়ে শুরু করা হচ্ছে। এটি পরবর্তী যোগফল রাখার জন্য ব্যবহৃত হবে, যদিও এই কোডে এটি ব্যবহার করা হয়নি।
for (int i = 0; i < c.length; i++) {

একটি লুপ শুরু করা হচ্ছে যা অ্যারেটির প্রতিটি উপাদানের জন্য চলবে। c.length হল 7, তাই লুপটি 7 বার চলবে।
if (c[i] == 7) {

যদি বর্তমান উপাদান 7 এর সমান হয়, তাহলে নিচের শর্তটি সত্য হবে।
System.out.println(i);

শর্তটি সত্য হলে, বর্তমান সূচক (index) i প্রিন্ট করা হচ্ছে।
এই কোডটি অ্যারেতে 7 সংখ্যাটির সূচক (index) প্রিন্ট করবে। এখানে 7 সংখ্যাটি c[3] অর্থাৎ এর সূচক 3। তাই 3 প্রিন্ট হবে। আশা করি তুমি কোডটি ভালভাবে বুঝতে পেরেছো!

 */