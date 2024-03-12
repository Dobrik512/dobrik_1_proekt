package dz1_3;

public class massiv {
    public static void main(String[] args) {
        int[] nums = new int[4];
        // устанавливаем значения элементов массива
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 8;
                     // использование for
//        for (int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//        }
                     // использование do ... while
//        var i=0;
//        do {
//            System.out.println(nums[i]);
//            i=i+1;
//        } while (i<nums.length);
                     // использование while
//        var i=0;
//        while (i<nums.length){
//            System.out.println(nums[i]);
//            i=i+1;
//        }
                    // использование for each
//        for (int i:nums) {
//            System.out.println(i);
//        }
                    // Вывод каждого второго элемента массива
//        for (int i=1;i<nums.length;i=i+2){
//            System.out.println(" i = "+i + " nums["+i+"] = "+nums[i]);
//        }
        String str1="first";
        String str2="second";
        String str3="third";
        String str4=null;
        String str5="fifth";
        String[] strings=new String[]{str1,str2,str3,str4,str5};
        for (int i=1;i<strings.length;i=i+2){
            if(strings[i] == null)
            {
                break;
            }
            else{
                System.out.println(" i = "+i + " nums["+i+"] = "+nums[i]);
            }
        }
    }
}
