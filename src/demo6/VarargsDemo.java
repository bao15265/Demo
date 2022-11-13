package demo6;

public class VarargsDemo {
    public int sumNormal(int a, int b) {
        return a + b;
    }

    public int sumArray(int[] a) {
        int total = 0;
        for (int i : a) {
            total += i;
        }
        return total;
    }

    public int sumVar(int... a) {
        int total = 0;
        for (int i : a) {
            total += i;
        }
        return total;
    }

    public int sum(int... args) {
        int result = 0;
        for (int i = 0; i < args.length; i++)
            result += args[i];
        return result;
    }
    public int sum(int go, int... args) {
        int result = go;
        for (int arg : args) {
            result += arg;
        }
        return  result;
    }

//    public int sum1(String option, int... chan, int... le) {   // error
//        int result = 0;
//
//        switch (option) {
//            case "chan":
//                for (int i = 0; i < chan.length; i++)
//                    result += chan[i];
//                break;
//            case "le":
//                for (int i = 0; i < le.length; i++)
//                    result += le[i];
//                break;
//            default:
//                throw new RuntimeException("Option is not present");
//        }
//
//        return result;
//    }


    public static void main(String[] args) {
        VarargsDemo test = new VarargsDemo();
        test.sumNormal(1, 2);
        test.sumArray(new int[]{3, 4, 5, 1});
        test.sumVar();
        //sum(5);
    }
}
