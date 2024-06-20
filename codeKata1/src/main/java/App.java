public class App {
    public static int getKatas(int[] arr){
        StringBuilder buildStrFromArrInt = new StringBuilder();
        boolean isLeadingZero = true;


        for(int num: arr){
            if(num == 0 && isLeadingZero){
                continue;
            }
            else {
                isLeadingZero = false;
            }
            buildStrFromArrInt.append(Math.abs(num));
        }

        return Integer.parseInt(buildStrFromArrInt.toString());
    }
}
