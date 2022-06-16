public class WordSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(WordDivider(scanner.nextLine()));
        //examples:
        //baseball, a,ab,b,ball,bas,base,cat,code,d,e,quit,z
        //abcgefd, a,ab,abc,abcg,b,c,dog,e,efd,zzzz
        //hellocat, apple,bat,cat,goodbye,hello,yellow,why
    }

    public static String WordDivider(String input) {
        String[] strArr = input.split(", ");
        String firstElement = strArr[0];
        String[] dictionaryArr = strArr[1].split(",");
        for(int i = 0; i < dictionaryArr.length; i++){
            for (int j = 0; j < dictionaryArr.length; j++) {
                if (j != i) {
                    if ((dictionaryArr[i] + dictionaryArr[j]).equals(firstElement)) {
                        String result = dictionaryArr[i] + "," +  dictionaryArr[j];
                        return result;
                    } else if ((dictionaryArr[j] + dictionaryArr[i]).equals(firstElement)) {
                        String result = dictionaryArr[j] + "," +  dictionaryArr[i];
                        return result;
                    }
                }
            }
        }
        String notPossible = "not possible";
        return notPossible;
    }
}
