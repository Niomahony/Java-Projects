public class DictionaryDriver {
    public static void main(String[] args) {
        if(args.length < 3){
            if(args.length < 1){
                System.out.println("filepath is missing");
            }
            if(args.length < 2){
                System.out.println("shortest is missing");
            }
            System.out.println("longest is missing");
            return;
        }

        int shortest = Integer.parseInt(args[1]);
        int longest = Integer.parseInt(args[2]);

        Dictionary words = new Dictionary(args[0], shortest, longest);

        String word = "beans";

        if(!words.inDictionary(word)){
            System.out.printf("%s not in Dictionary\n", word);

            if(words.add(word)){
                System.out.printf("%s added to Dictionary\n", word);
            }else {
                System.out.printf("%s not added to Dictionary\n", word);
            }
        } else {
            System.out.printf("%s is in Dictionary\n", word);
        }


        if(!words.inDictionary(word)){
            System.out.printf("%s not in Dictionary\n", word);
        } else {
            System.out.printf("%s is in Dictionary\n", word);
        }
        System.out.println(words.nextWord());
    }
}
