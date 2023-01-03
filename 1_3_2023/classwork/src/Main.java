public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] names = {"Gosho" , "Ivan"};


//        for(int i = 0; i < names.length; i++){
//            System.out.println(names[i] + ", ");
   //     }
  //  /    System.out.println();

        //System.out.println(String.join(", ", names));

        for(String name : names) {
            if (name.equals("Ivan")) {
                name = "Dragan";
            }
        }
        for(int i = 0; i < names.length;i++){
            if(names[i].equals("Gosho")){
                names[i] = "Dragan";
            }
        }

        for(int i = 0; i < names.length;i++){
            System.out.println(names[i]);
        }
    }
}